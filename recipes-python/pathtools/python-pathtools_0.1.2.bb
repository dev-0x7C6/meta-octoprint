SUMMARY = "Pattern matching and various utilities for file systems paths."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/pathtools/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a870e4c037fc40b3973dd56a1526fc5b"

SRC_URI = "https://pypi.python.org/packages/source/p/pathtools/pathtools-${PV}.tar.gz"

SRC_URI[md5sum] = "9a1af5c605768ea5804b03b734ff0f82"
SRC_URI[sha256sum] = "7c35c5421a39bb82e58018febd90e3b6e5db34c5443aaaf742b3f33d4655f1c0"

S = "${WORKDIR}/pathtools-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
