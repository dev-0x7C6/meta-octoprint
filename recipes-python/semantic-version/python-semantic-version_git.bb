SUMMARY = "Semantic version comparison for Python (see http://semver.org/)"
SECTION = "devel/python"

HOMEPAGE = "https://github.com/rbarrois/python-semanticversion"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fb31e3c1c7eeb8b5e8c07657cdd54e2"

SRC_URI = "git://github.com/rbarrois/python-semanticversion.git;protocol=https"
SRCREV = "cd6143f829e59e5fea9d4e8d244dfe8d4d6c80d3"

# Exact version, no need for +git...
PV = "2.6.0"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR


BBCLASSEXTEND = "native"
