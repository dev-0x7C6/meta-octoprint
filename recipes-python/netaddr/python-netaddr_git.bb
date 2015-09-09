SUMMARY = "Pythonic manipulation of IPv4, IPv6, CIDR, EUI and MAC network addresses"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/netaddr/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b277425f87f3b06d25af45d8b96f9682"

SRC_URI = "git://github.com/drkjam/netaddr.git;protocol=https;branch=rel-0.7.x"
SRCREV = "688e53c12ed768c3f7868ea2c57f4fb575368b02"

# SRCREV == tag
PV = "0.7.17"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
