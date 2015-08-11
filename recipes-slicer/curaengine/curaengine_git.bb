SUMMARY = "CuraEngine is a powerful, fast and robust engine for processing 3D models into 3D printing instructions."

LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "protobuf3-native libarcus"

# SRCREV = tag, no +git.. needed
PV = "15.06.03"
SRCREV = "41f7258e25aa12ace67c8d5fe40ca9b6afa85c29"
SRC_URI = "git://github.com/Ultimaker/CuraEngine.git;protocol=git;branch=15.06 \
           file://0001-don-t-overwrite-CXXFLAGS.patch \
          "

S = "${WORKDIR}/git"

inherit cmake

do_configure_prepend() {
    sed -i -e s:2.8.12:2.8.11:g ${S}/CMakeLists.txt
}

do_configure_append() {
    sed -i -e s:/usr/lib/libArcus.so.15.05.90:-lArcus:g ${B}/CMakeFiles/CuraEngine.dir/link.txt
    sed -i -e s:/usr/lib/libArcus.so.15.05.90::g ${B}/CMakeFiles/CuraEngine.dir/build.make
}
