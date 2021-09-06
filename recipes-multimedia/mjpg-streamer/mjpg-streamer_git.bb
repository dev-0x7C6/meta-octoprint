SUMMARY = "MJPG-streamer takes JPGs from Linux-UVC compatible webcams, filesystem or other input plugins and streams them as M-JPEG via HTTP to webbrowsers, VLC and other software. It is the successor of uvc-streamer, a Linux-UVC streaming application with Pan/Tilt"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

TAG ?= "1.0.0"

PV = "${TAG}+git${SRCPV}"
SRCREV = "v${TAG}"

SRC_URI = "git://github.com/jacksonliam/mjpg-streamer.git;protocol=https;nobranch=1"

# Workaround multiple defined symbols
TARGET_CFLAGS += "-fcommon"

DEPENDS = "libgphoto2 v4l-utils"

# Add support for raspicam on rpi platforms
DEPENDS:append:rpi = " ${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "", "userland", d)}"
# https://lists.yoctoproject.org/pipermail/yocto/2014-June/019933.html
ASNEEDED:rpi = ""

S = "${WORKDIR}/git/mjpg-streamer-experimental"

inherit cmake

OECMAKE_GENERATOR="Unix Makefiles"
EXTRA_OECMAKE = "-DENABLE_HTTP_MANAGEMENT=ON"

EXTRA_OECMAKE:append:rpi = " ${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "-DHAS_RASPI=OFF", "-DHAS_RASPI=ON", d)}"

do_install() {
    oe_runmake install DESTDIR=${D}
}

FILES:${PN} += "${libdir}/*.so"

# And make it rpi specific due to depending on rpi binaries
PACKAGE_ARCH:rpi = "${MACHINE_ARCH}"
