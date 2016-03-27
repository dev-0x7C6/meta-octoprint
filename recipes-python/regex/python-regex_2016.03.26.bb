SUMMARY = "Alternative regular expression module, to replace re."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/regex"

LICENSE = "PSFL"
LIC_FILES_CHKSUM = "file://setup.py;beginline=32;endline=31;md5=d41d8cd98f00b204e9800998ecf8427e"

SRC_URI = "https://pypi.python.org/packages/source/r/regex/regex-${PV}.tar.gz"
SRC_URI[md5sum] = "1fc6aaf2ae0b31dc1ca93db1c71a6368"
SRC_URI[sha256sum] = "c300b05f4ee90a1cb72332c62aea9aadcb4dd030038f0cafad5b047fd7fe6e05"

S = "${WORKDIR}/regex-${PV}"

inherit distutils 

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
