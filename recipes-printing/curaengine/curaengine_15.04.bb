SUMMARY = "CuraEngine is a powerful, fast and robust engine for processing 3D models into 3D printing instructions."

LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"


# SRCREV = tag, no +git.. needed
PV = "15.04.06"
SRCREV = "aca2c17ebaf5722137568bc8aeadd2be001a7a34"
SRC_URI = "git://github.com/Ultimaker/CuraEngine.git;protocol=https;branch=legacy \
           file://0001-Remove-unused-import.patch \
          "

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "VERSION=${PV}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 build/CuraEngine ${D}${bindir}
}
