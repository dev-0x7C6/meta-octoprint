SUMMARY = "Identity management for Flask applications"
SECTION = "devel/python"

HOMEPAGE = "http://pythonhosted.org/Flask-Principal/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=946a71eddb833fc7ea0c0c175eb8440c"

SRC_URI = "git://github.com/mattupstate/flask-principal.git;protocol=https;nobranch=1"
SRCREV = "e676fef6b70ff0410911b444a323e604b6e575b0"

# SRCREV == tag, so no +git nonsense
PV = "0.4.0"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
