SUMMARY = "Jinja2 is a modern and designer friendly templating language for Python, modelled after Django’s templates."
SECTION = "devel/python"

HOMEPAGE = "http://jinja.pocoo.org/docs/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20c831f91dd3bd486020f672ba2be386"

SRC_URI = "git://github.com/mitsuhiko/jinja2.git;protocol=https;branch=2.8-maintenance"
SRCREV = "74bd64e56387f5b2931040dc7235a3509cde1611"

# SRCREV = tag
PV = "2.8.2.dev0"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} += "${PYTHON_PN}-io ${PYTHON_PN}-pickle ${PYTHON_PN}-crypt \
    ${PYTHON_PN}-math ${PYTHON_PN}-netclient ${PYTHON_PN}-re ${PYTHON_PN}-textutils \
    ${PYTHON_PN}-lang ${PYTHON_PN}-pprint ${PYTHON_PN}-shell ${PYTHON_PN}-markupsafe \
    ${PYTHON_PN}-json ${PYTHON_PN}-threading ${PYTHON_PN}-numbers"
RCONFLICTS_${PN} += "python-jinja2"
RPROVIDES_${PN} += "python-jinja2"

CLEANBROKEN = "1"
BBCLASSEXTEND = "native"
