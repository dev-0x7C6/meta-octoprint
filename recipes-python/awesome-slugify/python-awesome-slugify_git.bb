SUMMARY = "Python flexible slugify function https://pypi.python.org/pypi/awesome-slugify"
SECTION = "devel/python"

HOMEPAGE = "https://github.com/dimka665/awesome-slugify"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://setup.py;beginline=22;endline=24;md5=ae3de4b453d37fcbff2ca5a8a4725cfd"

SRC_URI = "git://github.com/dimka665/awesome-slugify.git;protocol=https"
SRCREV = "baf9d25fd1ef01058456e8c89d02a3fb57335b5d"

PV = "1.6.5+git${SRCPV}"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} = "python-nose \
                  python-regex \
                  python-unidecode \
                 "

BBCLASSEXTEND = "native"
