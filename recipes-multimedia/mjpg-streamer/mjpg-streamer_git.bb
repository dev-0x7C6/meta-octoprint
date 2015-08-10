SUMMARY = "MJPG-streamer takes JPGs from Linux-UVC compatible webcams, filesystem or other input plugins and streams them as M-JPEG via HTTP to webbrowsers, VLC and other software. It is the successor of uvc-streamer, a Linux-UVC streaming application with Pan/Tilt"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

PV = "0.4+git${SRCPV}"
SRCREV = "5f6adeefa0d5a78833cc809f2bfa76131f2b9ff8"
SRC_URI = "git://github.com/jacksonliam/mjpg-streamer.git;protocol=https \
           file://0001-ptp2-fix-ldflags.patch;striplevel=2 \
          "

DEPENDS = "libgphoto2 v4l-utils"

S = "${WORKDIR}/git/mjpg-streamer-experimental"

CFLAGS =+ "-DLINUX -D_GNU_SOURCE "

do_configure() {
    # disable some stuff
    sed -i -e '/PLUGINS += input_raspicam.so/d' ${S}/Makefile
    sed -i -e 's/# PLUGINS += input_ptp2.so/PLUGINS += input_ptp2.so/' ${S}/Makefile
}

do_compile() {
    make CC='${CC}' CFLAGS='${CFLAGS} -shared -fPIC' LFLAGS='${LDFLAGS} -ljpeg -lgphoto2 -lm -lgphoto2_port -lm -lexif -lv4l2 -lpthread -ldl ' USE_LIBV4L2=1
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${libdir}

    oe_runmake install DESTDIR=${D}${prefix}

    install -d ${D}${datadir}/mjpg-streamer/
    mv ${D}${prefix}/www ${D}${datadir}/mjpg-streamer/
}

FILES_${PN} += "${libdir}/*.so"
