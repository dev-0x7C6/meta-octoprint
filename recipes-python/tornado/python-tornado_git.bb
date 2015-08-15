DESCRIPTION = "Tornado is an open source version of the scalable, non-blocking web server and tools that power FriendFeed."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PV = "4.0.1"

SRCREV = "54bfbee58650a0312b22eb081e8a38d03fcf1a49"
SRC_URI = "git://github.com/facebook/tornado.git;branch=branch4.0"

S = "${WORKDIR}/git"

inherit setuptools

DEPENDS = "python-certifi"

RDEPENDS_${PN} = "python-certifi"

