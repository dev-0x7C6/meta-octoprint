SUMMARY = "The ssl.match_hostname() function from Python 3.4"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/backports.ssl_match_hostname"

LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://PKG-INFO;endline=8;md5=905a5940df17afd95b53ab09ec94f405"

SRC_URI = "https://pypi.python.org/packages/source/b/backports.ssl_match_hostname/backports.ssl_match_hostname-3.4.0.2.tar.gz"
SRC_URI[md5sum] = "788214f20214c64631f0859dc79f23c6"
SRC_URI[sha256sum] = "07410e7fb09aab7bdaf5e618de66c3dac84e2e3d628352814dc4c37de321d6ae"

S = "${WORKDIR}/backports.ssl_match_hostname-3.4.0.2"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
