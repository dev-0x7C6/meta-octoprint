SUMMARY = "A wrapper for subprocess which provides command pipeline functionality."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/sarge"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=924c72d14cb60aab9c3ac3b1d41ce585"

SRC_URI = "https://pypi.python.org/packages/source/s/sarge/sarge-${PV}.tar.gz"
SRC_URI[md5sum] = "befddb379d166ad1dc396330f0e5391d"
SRC_URI[sha256sum] = "f48fb904e64f10ad6bef62422eaf4736acfd9b13ab64ba44822637a9dbb53265"

S = "${WORKDIR}/sarge-${PV}"

inherit setuptools3

BBCLASSEXTEND = "native"
