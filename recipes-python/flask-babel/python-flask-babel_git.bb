SUMMARY = "i18n and l10n support for Flask based on Babel and pytz"
SECTION = "devel/python"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=51917f3e8e858f5ae295a7d0e2eb3cc9"

DEPENDS = "python-speaklater python-babel"

SRC_URI = "git://github.com/mitsuhiko/flask-babel.git;protocol=https"
SRCREV = "62c290fba3c38a9974bad4398980c908b4600a59"

PV = "0.9+git${SRCPV}"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENS_${PN} = "python-speaklater python-babel"

BBCLASSEXTEND = "native"
