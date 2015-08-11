SUMMARY = "Communication library between internal components for Ultimaker software"

LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d3c0b87ef66889fc868a1fcedef719c"

DEPENDS = "protobuf3-native protobuf3"

# SRCREV = tag, no +git.. needed
PV = "15.06.03"
SRCREV = "b46f2376967fcec7f84ca71a045d749a43774141"
SRC_URI = "git://github.com/Ultimaker/libArcus.git;protocol=git;branch=15.06 \
           file://0001-don-t-overwrite-CXXFLAGS.patch \
          "

S = "${WORKDIR}/git"

inherit cmake python3native

do_configure_prepend() {
    sed -i -e s:2.8.12:2.8.11:g ${S}/CMakeLists.txt
}

do_install_append() {
    # It looks outside of the sysroot, don't make it a fatal error if the libs isn't found.
    # The proper fix is of course not to look there at all, but I haven't figured out how to do that yet.
    sed -i -e s:FATAL_::g ${D}${libdir}/cmake/Arcus/Arcus-targets.cmake
}

FILES_${PN}-dev += "${libdir}/cmake"

PACKAGES =+ "${PN}-python3"
FILES_${PN}-python3 = "${libdir}/python3"
