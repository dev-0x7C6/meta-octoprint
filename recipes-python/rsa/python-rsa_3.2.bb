SUMMARY = "Pure-Python RSA implementation"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/rsa/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a1d27014d3d0d7ae5fb973adab04ee30"

DEPENDS = "python-pyasn1"

SRC_URI = "https://pypi.python.org/packages/source/r/rsa/rsa-${PV}.tar.gz"
SRC_URI[md5sum] = "d2385469e2c76f33124709d09e559615"
SRC_URI[sha256sum] = "30f371fbb060747aa53e02c2d53067d8a4f776a7f8ba0e9f0e6bd3f392489777"

S = "${WORKDIR}/rsa-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} = "python-pyasn1"

BBCLASSEXTEND = "native"
