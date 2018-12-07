DESCRIPTION = "Portable network interface information for Python"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=a53cbc7cb75660694e138ba973c148df"
PYPI_PACKAGE = "netifaces"

inherit pypi

# This is needed otherwise it will error out with a pthread_cancel error.
# TODO: Why is this not detected automatically?
RDEPENDS_${PN} += "libgcc"
