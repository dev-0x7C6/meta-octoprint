SUMMARY = "ASCII transliterations of Unicode text"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/Unidecode"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://pypi.python.org/packages/source/U/Unidecode/Unidecode-${PV}.tar.gz"
SRC_URI[md5sum] = "9b3ab9bfe5a58124609840f0c2accfe4"
SRC_URI[sha256sum] = "51477646a9169469e37e791b13ae65fcc75b7f7f570d0d3e514d077805c02e1e"

S = "${WORKDIR}/Unidecode-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
