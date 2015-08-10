SUMMARY = "Filesystem events monitoring"
SECTION = "devel/python"

HOMEPAGE = "http://http://werkzeug.pocoo.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "python-argh"

SRC_URI = "https://pypi.python.org/packages/source/w/watchdog/watchdog-${PV}.tar.gz"

SRC_URI[md5sum] = "a58a082823dc6d3c60ffba1ff5f94608"
SRC_URI[sha256sum] = "d6ec6be582b244834a888c8ccc2d451816184ab104b5454b5e5cd7649e8f671c"

S = "${WORKDIR}/watchdog-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} = "python-argh"

BBCLASSEXTEND = "native"
