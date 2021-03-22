SUMMARY = "Implements i18n and l10n support for Flask."
HOMEPAGE = "https://pypi.org/project/Flask-Babel/"

PYPI_PACKAGE = "Flask-Babel"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=51917f3e8e858f5ae295a7d0e2eb3cc9"
SRC_URI[sha256sum] = "d6a70468f9a8919d59fba2a291a003da3a05ff884275dddbd965f3b98b09ab3e"

inherit pypi setuptools3

RDEPENDS_${PN} += "\
    ${PYTHON_PN}-babel \
    ${PYTHON_PN}-flask \
    ${PYTHON_PN}-speaklater \
"