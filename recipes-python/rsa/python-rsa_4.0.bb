SUMMARY = "Pure-Python RSA implementation"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/rsa/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c403f6882d4f97a9cd927df987d55634"

DEPENDS = "python-pyasn1"

SRC_URI = "https://pypi.python.org/packages/source/r/rsa/rsa-${PV}.tar.gz"
SRC_URI[md5sum] = "9f9af433a16868b616fc609215e91ddb"
SRC_URI[sha256sum] = "1a836406405730121ae9823e19c6e806c62bbad73f890574fff50efa4122c487"

S = "${WORKDIR}/rsa-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} = "python-pyasn1"

BBCLASSEXTEND = "native"
