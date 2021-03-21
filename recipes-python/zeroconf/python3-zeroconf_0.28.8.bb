SUMMARY = "A least recently used (LRU) cache implementation"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/zeroconf/"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=27818cd7fd83877a8e3ef82b82798ef4"

SRC_URI = "git://github.com/jstasiak/python-zeroconf.git;protocol=https"
SRCREV = "${PV}"

S = "${WORKDIR}/git"

inherit setuptools3
