SUMMARY = "Protocol Buffers - structured data serialisation mechanism"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an \
efficient yet extensible format. Google uses Protocol Buffers for almost \
all of its internal RPC protocols and file formats."
HOMEPAGE = "http://code.google.com/p/protobuf/"
SECTION = "console/tools"
LICENSE = "BSD-3-Clause"

DEPENDS = "zlib"

LIC_FILES_CHKSUM = "file://LICENSE;md5=142112c649df70be3d7022cfb29dd827"

PV = "3.0.0"
SRC_URI = "git://github.com/google/protobuf.git"
SRCREV = "29fe8d223e5f857c4b2949424c95a74c9f6901f0"

S = "${WORKDIR}/git"

EXTRA_OECONF += " --with-protoc=echo"

inherit autotools

BBCLASSEXTEND = "native nativesdk"
