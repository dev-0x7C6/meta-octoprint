SUMMARY = "Flask webassets integration."
SECTION = "devel/python"

HOMEPAGE = "http://flask-assets.readthedocs.org/en/latest/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c0c455026ee819a9365678bea8b2c82"

TAG = "2.0"
PV = "${TAG}+git${SRCPV}"

SRC_URI = "git://github.com/miracle2k/flask-assets.git;protocol=https"
SRCREV = "${TAG}"
S = "${WORKDIR}/git"

inherit setuptools3

BBCLASSEXTEND = "native"
