SUMMARY = "A least recently used (LRU) cache implementation"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/pylru/"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://pypi.python.org/packages/source/p/pylru/pylru-${PV}.tar.gz"
SRC_URI[md5sum] = "41369d58a1c4391c5cc36f84262abcdc"
SRC_URI[sha256sum] = "71376192671f0ad1690b2a7427d39a29b1df994c8469a9b46b03ed7e28c0172c"

S = "${WORKDIR}/pylru-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
