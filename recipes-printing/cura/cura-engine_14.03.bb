SUMMARY = "CuraEngine - a C++ application for 3D printing GCode generation"

DESCRIPTION = "The CuraEngine is a C++ console application for 3D printing \
GCode generation. It has been made as a better and faster alternative to the \
old Skeinforge engine.\
\
The CuraEngine is pure C++ and uses Clipper from \
http://www.angusj.com/delphi/clipper.php. There are now external dependenices \
and Clipper is included in the source code without modifications.\
\
This is just a console application for GCode generation. For a full graphical \
application look at https://github.com/daid/Cura which is the graphical \
frontend for CuraEngine." 

HOMEPAGE = "http://github.com/Ultimaker/CuraEngine.git/"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

# tag 14.03
SRC_URI = "git://github.com/Ultimaker/CuraEngine.git;protocol=https"
SRCREV = "4d0dd255b488d4b6166eb6ad420f2b27e8de8ea2"

S = "${WORKDIR}/git"

do_compile(){
    sed -i "s:--static::g" Makefile
    make 
}

do_install_append () {
    install -d ${D}${bindir}
    install -m 0744 ${S}/CuraEngine ${D}${bindir}
}
    
FILES_${PN} += " \
	    ${bindir}/CuraEngine \
"
