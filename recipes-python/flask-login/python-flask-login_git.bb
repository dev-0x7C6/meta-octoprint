SUMMARY = "Flask user session management."
SECTION = "devel/python"

HOMEPAGE = "http://flask-login.readthedocs.org/en/latest/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8aa87a1cd9fa41d969ad32cfdac2c596"

SRC_URI = "git://github.com/maxcountryman/flask-login.git;protocol=https"
SRCREV = "993b2068f7824e9212bf26157d1da518f37d4a47"

# No need for +git.., it's the exact tag for 0.2.2
PV = "0.2.2"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
