DESCRIPTION = "The concurrent.futures module provides a high-level interface for asynchronously executing callables."
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=8238df2167d3317e02b6b267c3e30999"
HOMEPAGE = "http://code.google.com/p/pythonfutures"
DEPENDS = "python"

SRC_URI = "https://pypi.python.org/packages/cc/26/b61e3a4eb50653e8a7339d84eeaa46d1e93b92951978873c220ae64d0733/futures-${PV}.tar.gz"
SRC_URI[md5sum] = "77f261ab86cc78efa2c5fe7be27c3ec8"
SRC_URI[sha256sum] = "51ecb45f0add83c806c68e4b06106f90db260585b25ef2abfcda0bd95c0132fd"

S = "${WORKDIR}/futures-${PV}"

inherit setuptools
