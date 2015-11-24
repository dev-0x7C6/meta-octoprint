SUMMARY = "A cross-platform process and system utilities module for Python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f02e99f7f3c9a7fe8ecfc5d44c2be62"

inherit setuptools

# 3.2.1 tag
SRCREV = "99f6abf9bcff3abff815b8e93c8cd2fbe26487a2"
SRC_URI = "git://github.com/giampaolo/psutil.git;protocol=https"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += " \
    python-subprocess \
    "

