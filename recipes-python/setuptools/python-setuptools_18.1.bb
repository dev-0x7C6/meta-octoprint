SUMMARY = "Downloads, builds, installs, upgrades, and uninstalls Python packages"
HOMEPAGE = "https://pypi.python.org/pypi/setuptools"
SECTION = "devel/python"
LICENSE = "PSF|ZPL"
LIC_FILES_CHKSUM = "file://setup.py;beginline=78;endline=78;md5=8a314270dd7a8dbca741775415f1716e"

SRCNAME = "setuptools"

PROVIDES = "python-distribute"

DEPENDS += "python"
DEPENDS_class-native += "python-native"

inherit distutils

SRC_URI = "https://pypi.python.org/packages/source/s/setuptools/setuptools-${PV}.tar.gz"
SRC_URI[md5sum] = "f72e87f34fbf07f299f6cb46256a0b06"
SRC_URI[sha256sum] = "ad52a9d5b3a6f39c2a1c2deb96cc4f6aff29d6511bdea2994322c40b60c9c36a"

S = "${WORKDIR}/${SRCNAME}-${PV}"


DISTUTILS_INSTALL_ARGS += "--install-lib=${D}${libdir}/${PYTHON_DIR}/site-packages"

do_install_prepend() {
    install -d ${D}/${libdir}/${PYTHON_DIR}/site-packages
}

RDEPENDS_${PN} = "\
  python-stringold \
  python-email \
  python-shell \
  python-distutils \
  python-compression \
"

RDEPENDS_${PN}_class-native = "\
  python-distutils \
  python-compression \
"

RREPLACES_${PN} = "python-distribute"
RPROVIDES_${PN} = "python-distribute"
RCONFLICTS_${PN} = "python-distribute"

BBCLASSEXTEND = "native"
