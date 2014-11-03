require recipes-kernel/linux/linux.inc

SECTION = "kernel"

# Mark archs/machines that this kernel supports
COMPATIBLE_MACHINE = "flo"

DESCRIPTION = "Linux kernel for the Asus Flo device"

CMDLINE = "console=ttyHSL0,115200,n8 androidboot.hardware=flo user_debug=31 msm_rtb.filter=0x3F ehci-hcd.park=3"
KERNEL_RAM_BASE = "0x80208000"
RAMDISK_RAM_BASE = "0x82200000"
SECOND_RAM_BASE = "0x81100000"
TAGS_RAM_BASE = "0x80200100"
BOOT_PARTITION = "/dev/block/mmcblk0p14"

inherit kernel_android


SRC_URI = " \
  git://github.com/GranPC/linux-asus-flo.git;protocol=git \
  file://defconfig \
"

S = "${WORKDIR}/git/"


SRCREV="a60363b0b39e9a648dc9b80adeec0835cd60cb67"

KV = "3.1.10"
PV = "${KV}+gitr${SRCPV}"
# for bumping PR bump MACHINE_KERNEL_PR in the machine config
inherit machine_kernel_pr

# Workaround default -Werror setting and some warnings in kernel compilation
TARGET_CC_KERNEL_ARCH += " -Wno-error=unused-but-set-variable -Wno-error=array-bounds"
