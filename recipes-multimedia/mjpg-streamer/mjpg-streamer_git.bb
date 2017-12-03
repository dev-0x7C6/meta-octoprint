SUMMARY = "MJPG-streamer takes JPGs from Linux-UVC compatible webcams, filesystem or other input plugins and streams them as M-JPEG via HTTP to webbrowsers, VLC and other software. It is the successor of uvc-streamer, a Linux-UVC streaming application with Pan/Tilt"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

PV = "0.4+git${SRCPV}"
SRCREV = "c1ecfaf7c5cb958cdfd251bdaa9824c3e798f890"
SRC_URI = "git://github.com/jacksonliam/mjpg-streamer.git;protocol=https \
           file://0001-slightly-unbreak-raspi-cmake.patch;striplevel=2 \
          "

DEPENDS = "libgphoto2 v4l-utils"

# Add support for raspicam on rpi platforms
DEPENDS_append_rpi = " ${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "", "userland", d)}"

S = "${WORKDIR}/git/mjpg-streamer-experimental"

inherit cmake

EXTRA_OECMAKE = "-DENABLE_HTTP_MANAGEMENT=ON"

EXTRA_OECMAKE_append_rpi = " ${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "-DHAS_RASPI=OFF", "-DHAS_RASPI=ON", d)}"

do_install() {
    oe_runmake install DESTDIR=${D}
}

FILES_${PN} += "${libdir}/*.so"

# And make it rpi specific due to depending on rpi binaries
PACKAGE_ARCH_rpi = "${MACHINE_ARCH}"
