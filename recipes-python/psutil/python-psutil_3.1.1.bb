SUMMARY = "A cross-platform process and system utilities module for Python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f02e99f7f3c9a7fe8ecfc5d44c2be62"

inherit setuptools

# 3.1.1 tag
SRCREV = "e36394a7973514778d74d172b2eaa187da3d1048"
SRC_URI = "git://github.com/giampaolo/psutil.git;protocol=https"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += " \
    python-subprocess \
    "

