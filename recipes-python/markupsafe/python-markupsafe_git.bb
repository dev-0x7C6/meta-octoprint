SUMMARY = "MarkupSafe is a library for Python that implements a unicode \
string that is aware of HTML escaping rules and can be used to \
implement automatic string escaping."
SECTION = "devel/python"

HOMEPAGE = "http://www.pocoo.org/projects/markupsafe/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6d1adcf45d69359f256c1cea3254127"

SRC_URI = "git://github.com/mitsuhiko/markupsafe.git;protocol=https"
SRCREV = "feb1d70c16df62f60dcb521d127fdad8819fc036"

# SRCREV == tag
PV = "0.23"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
