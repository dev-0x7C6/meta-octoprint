DESCRIPTION = "Portable network interface information for Python"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=a53cbc7cb75660694e138ba973c148df"
SRCNAME = "netifaces"

inherit pypi

SRC_URI[md5sum] = "1d424cb5ef52907c5ab913011122a98b"
SRC_URI[sha256sum] = "0c4da523f36d36f1ef92ee183f2512f3ceb9a9d2a45f7d19cda5a42c6689ebe0"

S = "${WORKDIR}/${SRCNAME}-${PV}"

# This is needed otherwise it will error out with a pthread_cancel error.
# TODO: Why is this not detected automatically?
RDEPENDS_${PN} += "libgcc"
