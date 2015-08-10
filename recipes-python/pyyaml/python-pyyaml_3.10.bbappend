
# Unbreak version number

do_configure_append() {
    sed -i -e s:3.06:3.10:g ${S}/setup.py
}
