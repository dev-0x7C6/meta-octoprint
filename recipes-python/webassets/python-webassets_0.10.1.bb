SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/webassets/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01c7e9175fd063ebb0a6304af80e9874"

SRC_URI = "https://pypi.python.org/packages/source/w/webassets/webassets-${PV}.tar.gz \
           file://f11f7d300a539caead81fc28b01f760e6c3c9409.patch \
          "
SRC_URI[md5sum] = "8007980e0ef38c9a42f577b2b2362e76"
SRC_URI[sha256sum] = "2c59f2ddc0abe29afdc91bb535faf6ce3145a1aaf2c1cd8fefdb0296d8e6c9e2"

S = "${WORKDIR}/webassets-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
