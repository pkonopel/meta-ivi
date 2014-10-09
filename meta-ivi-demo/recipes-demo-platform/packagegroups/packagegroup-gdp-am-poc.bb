DESCRIPTION = "Genivi AudioManager PoC components"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${IVI_COREBASE}/meta-ivi/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

# Avoid hardcoding the full layer path into the checksums
LIC_FILES_CHKSUM[vardepsexclude] += "IVI_COREBASE"

PR = "r0"

inherit packagegroup

PACKAGES = "\
    packagegroup-gdp-am-poc \
    "

ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += "\
    audiomanager-poc \
    libasound-module-conf-pulse \
    libasound-module-ctl-pulse \
    libasound-module-pcm-pulse \
    pulseaudio-module-native-protocol-tcp \
    pulseaudio-module-remap-sink \
    "