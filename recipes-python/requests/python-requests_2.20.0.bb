inherit pypi setuptools
require python-requests.inc

SRC_URI[md5sum] = "cf034ab571854453719594120366f467"
SRC_URI[sha256sum] = "99dcfdaaeb17caf6e526f32b6a7b780461512ab3f1d992187801694cba42770c"

RDEPENDS_${PN} += "${PYTHON_PN}-zlib"
