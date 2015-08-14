SUMMARY = "CuraEngine is a powerful, fast and robust engine for processing 3D models into 3D printing instructions."

LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"


# SRCREV = tag, no +git.. needed
PV = "15.04.02"
SRCREV = "7b2b9630c7b5ec5e4534de94b46bb37004cccb88"
SRC_URI = "git://github.com/Ultimaker/CuraEngine.git;protocol=git;branch=15.06 \
          "

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "VERSION=${PV}"

# it fails to link on arm with gold, so force bfd.
LDFLAGS += "-fuse-ld=bfd"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 build/CuraEngine ${D}${bindir}
}
