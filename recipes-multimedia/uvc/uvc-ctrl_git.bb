SUMMARY = "utility for set and display uvc camera control option"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

PV = "0.0"
SRCREV = "a26c84904a61b50ababed161e11cbc2d0bfd62e6"
SRC_URI = "git://github.com/allanbian1017/uvc-ctrl.git;protocol=https"

S = "${WORKDIR}/git"

do_compile() {
	${CC} ${CFLAGS} ${LDFLAGS} uvc-ctrl.c -o uvc-ctrl
}

do_install() {
	install -d ${D}${bindir}
	install -m0755 uvc-ctrl ${D}${bindir}
}
