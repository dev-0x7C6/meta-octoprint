SUMMARY = "Various helpers to pass trusted data to untrusted environments"
SECTION = "devel/python"

HOMEPAGE = "http://packages.python.org/itsdangerous/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b61841e2bf5f07884148e2a6f1bcab0c"

SRC_URI = "git://github.com/mitsuhiko/itsdangerous.git;protocol=https"
SRCREV = "4c3923561fd7d3aa53013b0b6b27bb3221bd473a"

# SRCREV == tag
PV = "0.24"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
