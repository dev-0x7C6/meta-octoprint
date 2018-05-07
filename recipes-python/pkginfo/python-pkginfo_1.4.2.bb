SUMMARY = "Pattern matching and various utilities for file systems paths."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/pkginfo/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

SRC_URI = "https://pypi.python.org/packages/source/p/pkginfo/pkginfo-${PV}.tar.gz"

SRC_URI[md5sum] = "53eb05fc841d94b585dc37aa1e2d4dc5"
SRC_URI[sha256sum] = "5878d542a4b3f237e359926384f1dde4e099c9f5525d236b1840cf704fa8d474"

S = "${WORKDIR}/pkginfo-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
