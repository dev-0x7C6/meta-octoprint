SUMMARY = "Pure-Python interface to Apple Bonjour"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;beginline=51;endline=51;md5=ba5f17915133a3b6556acac9dbcefe53"

PV = "1.1.1"
SRCREV = "82d0c1fb183b038d485fd21255d273734d81b531"
SRC_URI = "git://github.com/nickstenning/pybonjour.git"

S = "${WORKDIR}/git"

inherit distutils
