SUMMARY = "Pure-Python RSA implementation"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/rsa/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c403f6882d4f97a9cd927df987d55634"

DEPENDS = "python-pyasn1"

SRC_URI = "https://pypi.python.org/packages/source/r/rsa/rsa-${PV}.tar.gz"
SRC_URI[md5sum] = "b315f47882c24030ee6b5aad628cccdb"
SRC_URI[sha256sum] = "25df4e10c263fb88b5ace923dd84bf9aa7f5019687b5e55382ffcdb8bede9db5"

S = "${WORKDIR}/rsa-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} = "python-pyasn1"

BBCLASSEXTEND = "native"
