SUMMARY = "Python implementation of Markdown."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/rsa/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=bb64a898b2c7d3bbb677124ebd2ba57a"

SRC_URI = "https://pypi.python.org/packages/29/82/dfe242bcfd9eec0e7bf93a80a8f8d8515a95b980c44f5c0b45606397a423/Markdown-${PV}.tar.gz"
SRC_URI[md5sum] = "56547d362a9abcf30955b8950b08b5e3"
SRC_URI[sha256sum] = "73af797238b95768b3a9b6fe6270e250e5c09d988b8e5b223fd5efa4e06faf81"

S = "${WORKDIR}/Markdown-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
