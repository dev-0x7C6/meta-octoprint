SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/speaklater/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b810770075a29bf44b96607440e7c801"

SRC_URI = "https://pypi.python.org/packages/source/s/speaklater/speaklater-${PV}.tar.gz"
SRC_URI[md5sum] = "e8d5dbe36e53d5a35cff227e795e8bbf"
SRC_URI[sha256sum] = "59fea336d0eed38c1f0bf3181ee1222d0ef45f3a9dd34ebe65e6bfffdd6a65a9"

S = "${WORKDIR}/speaklater-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
