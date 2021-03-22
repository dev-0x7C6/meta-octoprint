SUMMARY = "Flask webassets integration."
HOMEPAGE = "http://flask-assets.readthedocs.org/en/latest/"

PYPI_PACKAGE = "Flask-Assets"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c0c455026ee819a9365678bea8b2c82"
SRC_URI[sha256sum] = "1dfdea35e40744d46aada72831f7613d67bf38e8b20ccaaa9e91fdc37aa3b8c2"

inherit pypi setuptools3

RDEPENDS_${PN} = "python3-webassets"
