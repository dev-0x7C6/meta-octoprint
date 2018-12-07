SUMMARY = "A simple wrapper around optparse for powerful command line utilities."
DESCRIPTION = "\
Click is a Python package for creating beautiful command line interfaces \
in a composable way with as little code as necessary. It's the "Command \
Line Interface Creation Kit". It's highly configurable but comes with \
sensible defaults out of the box."
HOMEPAGE = "http://click.pocoo.org/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=c13ed890b210a882c1778216694c98c7"


PYPI_PACKAGE = "click"

CLEANBROKEN = "1"

SRCREV = "43eb54db0bcde78dceaccfea9396ca21982003dd"
SRC_URI = "git://github.com/pallets/click.git;protocol=https;branch=7.x"

S = "${WORKDIR}/git"


RDEPENDS_${PN} += "\
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-threading \
    "

BBCLASSEXTEND = "native nativesdk"
