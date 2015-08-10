SUMMARY = "SockJS-tornado is a Python server side counterpart of SockJS-client browser library running on top of Tornado framework."
SECTION = "devel/python"

HOMEPAGE = "https://github.com/mrjoes/sockjs-tornado"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f68f551a860a1c94f9732b89fc8a331"

SRC_URI = "git://github.com/mrjoes/sockjs-tornado.git;protocol=https"
SRCREV = "4cb9362f363f2e6b0d80817e8389a8cc089f0afa"

PV = "1.0.1+git${SRCPV}"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} = "python-tornado"

BBCLASSEXTEND = "native"
