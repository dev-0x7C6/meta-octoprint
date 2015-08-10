SUMMARY = "Semantic version comparison for Python (see http://semver.org/)"
SECTION = "devel/python"

HOMEPAGE = "https://github.com/rbarrois/python-semanticversion"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a7dcaa0740d59f8f13ef05a3d0ed7313"

SRC_URI = "git://github.com/rbarrois/python-semanticversion.git;protocol=https"
SRCREV = "4aac5768db2fc158fa87900b54210ecba4dfe6d5"

# Exact version, no need for +git...
PV = "2.4.2"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR


BBCLASSEXTEND = "native"
