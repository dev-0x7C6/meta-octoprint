SUMMARY = "Python Atom and RSS feed parser"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=321cee8563f6bf91870b6648574d4eff"

SRC_URI[md5sum] = "ad9e1ed193e8b64866f533fecd7f6ea0"
SRC_URI[sha256sum] = "1b00a105425f492f3954fd346e5b524ca9cef3a4bbf95b8809470e9857aa1074"

inherit pypi setuptools3

RDEPENDS_${PN} += "\
    ${PYTHON_PN}-codecs \
    ${PYTHON_PN}-email \
    ${PYTHON_PN}-html \
    ${PYTHON_PN}-netserver \
    ${PYTHON_PN}-stringold \
    "

