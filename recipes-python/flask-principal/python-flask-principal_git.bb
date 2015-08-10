SUMMARY = "Identity management for Flask applications"
SECTION = "devel/python"

HOMEPAGE = "http://pythonhosted.org/Flask-Principal/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=946a71eddb833fc7ea0c0c175eb8440c"

SRC_URI = "git://github.com/mattupstate/flask-principal.git;protocol=https"
SRCREV = "c42639d23d763f2fc4d871220e8bc2f1fb1648c1"

# SRCREV == tag, so no +git nonsense
PV = "0.3.5"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
