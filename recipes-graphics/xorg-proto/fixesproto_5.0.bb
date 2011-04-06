require xorg-proto-common.inc
SUMMARY = "XFixes: X Fixes extension headers"

DESCRIPTION = "This package provides the wire protocol for the X Fixes \
extension.  This extension is designed to provide server-side support \
for application work arounds to shortcomings in the core X window \
system."


LICENSE = "MIT & MIT-style"
LIC_FILES_CHKSUM = "file://COPYING;md5=262a7a87da56e66dd639bf7334a110c6 \
                    file://xfixesproto.h;endline=44;md5=3deb31fbde34b96c9f19072b8d854fea"

PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "e7431ab84d37b2678af71e29355e101d"
SRC_URI[archive.sha256sum] = "ba2f3f31246bdd3f2a0acf8bd3b09ba99cab965c7fb2c2c92b7dc72870e424ce"


CONFLICTS = "fixesext"
