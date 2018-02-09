SUMMARY = "OctoPrint provides a responsive web interface for controlling a 3D printer (RepRap, Ultimaker, ...)."
HOMEPAGE = "http://octoprint.org"

SECTION = "devel/python"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

SRCREV = "00616a3d73f48c5ba9a578cbe9057defa0a55cba"

PV = "1.3.6+git${SRCPV}"


SRC_URI = "git://github.com/foosel/OctoPrint.git;protocol=https;branch=maintenance \ 
           file://0001-timelapse-add-setting-for-videocodec.patch \
           file://0002-timelapse-change-videocodecs-to-predefined-list.patch \
           file://0003-timelapse-pick-container-and-suffix-based-on-setting.patch \
           file://config.yaml \
           file://octoprint.service \
           file://octoprint \
           file://pip-sudo \
"
S = "${WORKDIR}/git"

inherit setuptools systemd useradd


export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"

do_install_append(){

    sed -i -e s:/etc:${sysconfdir}:g ${WORKDIR}/octoprint.service
    sed -i -e s:/etc:${sysconfdir}:g ${WORKDIR}/config.yaml
    sed -i -e 's: /sbin: ${base_sbindir}:g' ${WORKDIR}/octoprint
    sed -i -e 's: /bin: ${base_bindir}:g' ${WORKDIR}/octoprint
    sed -i -e s:/usr/bin:${bindir}:g ${WORKDIR}/octoprint

    install -d ${D}${sysconfdir}/octoprint
    install -m 0644 ${WORKDIR}/config.yaml ${D}${sysconfdir}/octoprint/config.yaml
    chmod a+rw ${D}${sysconfdir}/octoprint/config.yaml

    install -d ${D}/lib/systemd/system
    install -m 0644 ${WORKDIR}/octoprint.service ${D}${systemd_unitdir}/system

    install -d ${D}${localstatedir}/lib/octoprint
    chmod a+rw ${D}${localstatedir}/lib/octoprint

    install -d ${D}${sysconfdir}/sudoers.d
    install -m 0644 ${WORKDIR}/octoprint ${D}${sysconfdir}/sudoers.d/

    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/pip-sudo ${D}${bindir}
}

USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = "--system --home ${localstatedir}/lib/octoprint/ -M -g nogroup -G dialout octoprint"

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "octoprint.service"

FILES_${PN} += "${sysconfdir} ${localstatedir}"
CONFFILES_${PN} += "${sysconfdir}/octoprint/config.yaml"

pkg_postinst_${PN}_append () {
        chown -R octoprint $D${sysconfdir}/octoprint
}

RDEPENDS_${PN} = "python-awesome-slugify \
                  python-backports-ssl \
                  python-blinker \
                  python-feedparser \
                  python-flask \
                  python-flask-assets \
                  python-flask-babel \
                  python-flask-login2 \
                  python-flask-principal \
                  python-html \
                  python-itsdangerous \
                  python-jinja2.8 \
                  python-json \
                  python-markdown \
                  python-netaddr \
                  python-netifaces \
                  python-netserver \
                  python-numpy \
                  python-pathtools \
                  python-pip \
                  python-pkginfo \
                  python-psutil \
                  python-pylru \
                  python-pyserial27 \
                  python-pyyaml310 \
                  python-requests \
                  python-rsa \
                  python-sarge \
                  python-semantic-version \
                  python-sockjs-tornado \
                  python-sphinx-rtd-theme \
                  python-sphinxcontrib-httpdomain \
                  python-tornado40 \
                  python-watchdog \
                  python-werkzeug08 \
                  python-click62 \
                  python-chainmap \
                  python-future15 \
                  python-scandir \
                  python-websocket-client \
                  python-dateutil \
                  python-wrapt \
                  python-futures \
                  python-emoji \
                  python-monotonic \
                  sudo \
                  curaengine \ 
"

RRECOMMENDS_${PN} = "ffmpeg \
                     mjpg-streamer \
                     octoprint-nginx \
                    "
