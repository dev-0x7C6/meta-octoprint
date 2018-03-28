SUMMARY = "SockJS-tornado is a Python server side counterpart of SockJS-client browser library running on top of Tornado framework."
SECTION = "devel/python"

HOMEPAGE = "https://github.com/mrjoes/sockjs-tornado"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f68f551a860a1c94f9732b89fc8a331"

SRC_URI = "git://github.com/mrjoes/sockjs-tornado.git;protocol=https"
SRCREV = "85869af90b69e3d9266fd326b762796745b906a0"

PV = "1.0.3+git${SRCPV}"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} = "python-tornado50"

BBCLASSEXTEND = "native"
