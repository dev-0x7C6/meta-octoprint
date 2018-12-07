SUMMARY = "Werkzeug is a WSGI utility library for Python. It's widely used and BSD licensed."
SECTION = "devel/python"

HOMEPAGE = "http://http://werkzeug.pocoo.org/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a68f5361a2b2ca9fdf26b38aaecb6faa"

SRC_URI = "git://github.com/pallets/werkzeug.git;protocol=https;branch=0.11-maintenance"
SRCREV = "d83b98e097b905af12763f4f885839ad9b088a51"
PV = "0.11.15+git${SRCPV}"

S = "${WORKDIR}/git"

inherit distutils 

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RCONFLICTS_${PN} += "python-werkzeug python-werkzeug08 python-werkzeug-tests"
RPROVIDES_${PN} += "python-werkzeug python-werkzeug-tests"

CLEANBROKEN = "1"
BBCLASSEXTEND = "native"
