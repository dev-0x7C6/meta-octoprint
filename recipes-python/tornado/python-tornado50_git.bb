DESCRIPTION = "Tornado is an open source version of the scalable, non-blocking web server and tools that power FriendFeed."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PV = "5.0.2+git${SRCPV}"

SRCREV = "bbdd75a13c2540235ebd8b3cd42d52ac2b6c59fd"
SRC_URI = "git://github.com/tornadoweb/tornado.git;branch=branch5.0"

S = "${WORKDIR}/git"

inherit setuptools

DEPENDS = "python-certifi"

RDEPENDS_${PN} = " \
    ${PYTHON_PN}-compression \
    ${PYTHON_PN}-numbers \
    ${PYTHON_PN}-email \
    ${PYTHON_PN}-pkgutil \
    ${PYTHON_PN}-html \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-certifi \
    ${PYTHON_PN}-threading \
    ${PYTHON_PN}-ctypes \
    ${PYTHON_PN}-backports-abc \
    ${PYTHON_PN}-backports-ssl \
    ${PYTHON_PN}-singledispatch \
    ${PYTHON_PN}-subprocess \
"

RCONFLICTS_${PN} = "python-tornado python-tornado40"

