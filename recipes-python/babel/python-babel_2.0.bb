SUMMARY = "Internationalization utilities"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/babel/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6eeaabc92cfc2d03f53e789324d7292"

DEPENS = "python-pytz"

SRC_URI = "https://pypi.python.org/packages/source/B/Babel/Babel-${PV}.tar.gz"
SRC_URI[md5sum] = "62917719897a81e22dcaa3b17eeb11d8"
SRC_URI[sha256sum] = "44988df191123065af9857eca68e9151526a931c12659ca29904e4f11de7ec1b"

S = "${WORKDIR}/Babel-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} = "python-pytz"

BBCLASSEXTEND = "native"
