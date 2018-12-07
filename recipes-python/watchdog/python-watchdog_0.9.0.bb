SUMMARY = "Filesystem events monitoring"
SECTION = "devel/python"

HOMEPAGE = "http://http://werkzeug.pocoo.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "python-argh"

SRC_URI = "https://pypi.python.org/packages/source/w/watchdog/watchdog-${PV}.tar.gz"
SRC_URI[md5sum] = "7cdc103f607e72fc32c206301a72d1b2"
SRC_URI[sha256sum] = "965f658d0732de3188211932aeb0bb457587f04f63ab4c1e33eab878e9de961d"

S = "${WORKDIR}/watchdog-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} = "python-argh"

BBCLASSEXTEND = "native"
