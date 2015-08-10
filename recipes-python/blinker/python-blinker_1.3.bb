SUMMARY = "Fast, simple object-to-object and broadcast signaling"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/blinker"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8baf1d53a00de619f60052e4752a89af"

SRC_URI = "https://pypi.python.org/packages/source/b/blinker/blinker-1.3.tar.gz"
SRC_URI[md5sum] = "66e9688f2d287593a0e698cd8a5fbc57"
SRC_URI[sha256sum] = "6811010809262261e41ab7b92f3f6d23f35cf816fbec2bc05077992eebec6e2f"

S = "${WORKDIR}/blinker-1.3"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
