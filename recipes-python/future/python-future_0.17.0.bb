DESCRIPTION = "Clean single-source support for Python 3 and 2"
HOMEPAGE = "https://python-future.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3c00b89de8dabf26a9b70748ccf4c477"

PYPI_PACKAGE_HASH = "99abde815842bc6e97d5a7806ad51236630da14ca2f3b1fce94c0bb94d3d"

inherit pypi setuptools

SRC_URI[md5sum] = "d76ae771a06273c0469b90fbe9c1abfa"
SRC_URI[sha256sum] = "eb6d4df04f1fb538c99f69c9a28b255d1ee4e825d479b9c62fc38c0cf38065a4"

RCONFLICTS_${PN} = "python-future15"
BBCLASSEXTEND = "native"
