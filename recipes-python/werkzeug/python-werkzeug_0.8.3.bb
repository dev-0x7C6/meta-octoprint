SUMMARY = "Werkzeug is a WSGI utility library for Python. It's widely used and BSD licensed."
SECTION = "devel/python"

HOMEPAGE = "http://http://werkzeug.pocoo.org/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad2e600a437b1b03d25b02df8c23ad1c"

SRC_URI = "https://pypi.python.org/packages/source/W/Werkzeug/Werkzeug-${PV}.tar.gz"
SRC_URI[md5sum] = "12aa03e302ce49da98703938f257347a"
SRC_URI[sha256sum] = "108c3d41fb701c4af4ef00e8ebbedc147632c82247beb798c8d8657a12810206"

S = "${WORKDIR}/Werkzeug-${PV}"

inherit distutils 

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
