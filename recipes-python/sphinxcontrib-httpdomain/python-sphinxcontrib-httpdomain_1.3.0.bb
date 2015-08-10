SUMMARY = "Sphinx domain for HTTP APIs."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/sphinxcontrib-httpdomain"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=667c3e266c41ac5129a4478ad682b1c3"

SRC_URI = "https://pypi.python.org/packages/source/s/sphinxcontrib-httpdomain/sphinxcontrib-httpdomain-${PV}.tar.gz"

SRC_URI[md5sum] = "ad7ea42bd4c7c0ee57b1cb25bbf24aab"
SRC_URI[sha256sum] = "ba8fbe82eddc96cfa9d7b975b0422801a14ace9d7e051b8b2c725b92ea6137b5"

S = "${WORKDIR}/sphinxcontrib-httpdomain-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
