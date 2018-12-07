SUMMARY = "A least recently used (LRU) cache implementation"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/pylru/"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://pypi.python.org/packages/source/p/pylru/pylru-${PV}.tar.gz"
SRC_URI[md5sum] = "7b09d39a35dedff06e9fa34dec6dd397"
SRC_URI[sha256sum] = "e03a3d354eb8fdfa11638698e8a1f06cd3b3a214ebc0a120c603a79290d9ebec"

S = "${WORKDIR}/pylru-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
