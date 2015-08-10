SUMMARY = "ReadTheDocs.org theme for Sphinx, 2013 version."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/sphinxcontrib-httpdomain"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=51935905ca4aa737a038ba690fbdbdd2"

SRC_URI = "https://pypi.python.org/packages/source/s/sphinx_rtd_theme/sphinx_rtd_theme-${PV}.tar.gz"

SRC_URI[md5sum] = "8df56a300c8c69f17e1ffbee194b2a26"
SRC_URI[sha256sum] = "0f29f544f6d037989fa0c7729a9eab7e4d8ea50d6f0ef37363f472756c1edca6"

S = "${WORKDIR}/sphinx_rtd_theme-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
