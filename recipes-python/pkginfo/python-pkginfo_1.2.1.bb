SUMMARY = "Pattern matching and various utilities for file systems paths."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/pkginfo/"

LICENSE = "Python"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=0e0bd0f50b1af56ec94bf7ead808c804"

SRC_URI = "https://pypi.python.org/packages/source/p/pkginfo/pkginfo-${PV}.tar.gz"

SRC_URI[md5sum] = "4489be0244c003744ca18758fa12e468"
SRC_URI[sha256sum] = "ad3f6dfe8a831f96a7b56a588ca874137ca102cc6b79fc9b0a1c3b7ab7320f3c"

S = "${WORKDIR}/pkginfo-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
