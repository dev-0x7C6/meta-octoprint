SUMMARY = "A wrapper for subprocess which provides command pipeline functionality."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/sarge"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5b7bcb59dada77822aa4d479a96cc6d"

SRC_URI = "https://pypi.python.org/packages/source/s/sarge/sarge-${PV}.tar.gz"
SRC_URI[md5sum] = "285013875aa908ef1417055d3e74a00a"
SRC_URI[sha256sum] = "59f93216723ddd9062d17cbbb90ed9e69267b84825cf0bde0b7f8d934c424823"

S = "${WORKDIR}/sarge-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
