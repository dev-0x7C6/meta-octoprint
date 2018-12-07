DESCRIPTION = "The concurrent.futures module provides a high-level interface for asynchronously executing callables."
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=04861ba680284af3cc5bb90ba0a73306"
HOMEPAGE = "http://code.google.com/p/pythonfutures"
DEPENDS = "python"

inherit pypi setuptools

PYPI_PACKAGE = "futures"

SRC_URI[md5sum] = "d1b299a06b96ccb59f70324716dc0016"
SRC_URI[sha256sum] = "9ec02aa7d674acb8618afb127e27fde7fc68994c0437ad759fa094a574adb265"
