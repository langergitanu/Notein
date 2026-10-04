package com.aspose.words;

import com.google.common.primitives.Shorts;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRB {
    public static zzZMM zzO(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        zzZMM zzzmm = new zzZMM();
        long position = zzzox.zzq().getPosition();
        zzYLS zzyls = new zzYLS(zzzox);
        if (zzyls.zzXEK == zzyls.zzXEJ) {
            return null;
        }
        if (i < 192) {
            zzzox.zzq().zzH(zzzox.zzq().getPosition() - 2);
        }
        zzZ(zzzox, zzzmm);
        zzzox.zzq().zzH(position + ((long) zzyls.zzXEK));
        return zzzmm;
    }

    public static zzZMM zzYi(byte[] bArr) throws Exception {
        zzZMM zzzmm = new zzZMM();
        zzZ(new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(bArr), com.aspose.words.internal.zzZO0.zzhU()), zzzmm);
        return zzzmm;
    }

    public static void zzZ(FormField formField, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        long position = zzzow.zzq().getPosition();
        zzYLS zzyls = new zzYLS();
        zzyls.zzZ(zzzow);
        zzZ(formField.zzZ6O(), formField.zzZ6R(), zzzow);
        long position2 = zzzow.zzq().getPosition();
        zzyls.zzXEK = (int) (position2 - position);
        zzzow.zzq().zzU(position, 0);
        zzyls.zzZ(zzzow);
        zzzow.zzq().zzU(position2, 0);
    }

    public static com.aspose.words.internal.zzZOR zzZ(FormField formField) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzZ(formField.zzZ6O(), formField.zzZ6R(), new com.aspose.words.internal.zzZOW(zzzor, com.aspose.words.internal.zzZO0.zzhU()));
        return zzzor;
    }

    private static void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZMM zzzmm) throws Exception {
        int iZzXc;
        boolean z = (((long) zzzox.zzXb()) & 4294967295L) == 4294967295L;
        if (!z) {
            zzzox.zzq().zzU(-4L, 1);
        }
        short sZzX9 = zzzox.zzX9();
        int i = sZzX9 & 3;
        if (i > 2) {
            return;
        }
        int i2 = (sZzX9 & 124) >> 2;
        if (i != 1) {
            if (i == 2 && i2 != 25) {
                zzzmm.zzAV(i2);
            }
        } else if (i2 != 25) {
            zzzmm.zzVz(i2 != 0);
        }
        zzzmm.zzVD((sZzX9 & 128) != 0);
        zzzmm.zzVC((sZzX9 & 256) != 0);
        zzzmm.setEnabled((sZzX9 & 512) == 0);
        zzzmm.zzVB((sZzX9 & 1024) == 0);
        zzzmm.setTextInputType((sZzX9 & 14336) >> 11);
        zzzmm.zzVE((sZzX9 & Shorts.MAX_POWER_OF_TWO) != 0);
        boolean z2 = (sZzX9 & Short.MIN_VALUE) != 0;
        zzzmm.zzAY(zzzox.zzX9() & 65535);
        zzzmm.zzAX(zzzox.zzX9() & 65535);
        if (!z) {
            zzzox.zzX9();
        }
        zzzmm.setName(zzZZR.zzZ(zzzox, z, true));
        if (i == 0) {
            String strZzZ = zzZZR.zzZ(zzzox, z, true);
            if (i2 != 25) {
                zzzmm.setTextInputDefault(strZzZ);
            }
        } else if (i == 1) {
            zzzmm.zzVA(zzzox.zzX9() != 0);
        } else if (i == 2) {
            zzzmm.zzAW(zzzox.zzX9() & 65535);
        } else {
            throw new IllegalStateException("Unsupported form field type.");
        }
        zzzmm.setTextInputFormat(zzZZR.zzZ(zzzox, z, true));
        zzzmm.setHelpText(zzZZR.zzZ(zzzox, z, true));
        zzzmm.setStatusText(zzZZR.zzZ(zzzox, z, true));
        zzzmm.setEntryMacro(zzZZR.zzZ(zzzox, z, true));
        zzzmm.setExitMacro(zzZZR.zzZ(zzzox, z, true));
        if (i == 2 && z2) {
            zzzox.zzXa();
            if (!z) {
                iZzXc = zzzox.zzXa();
                zzzox.zzXa();
                zzzox.zzXa();
                zzzox.zzXa();
                zzzox.zzn(iZzXc * 2);
            } else {
                iZzXc = zzzox.zzXc();
            }
            if (iZzXc <= 25) {
                for (int i3 = 0; i3 < iZzXc; i3++) {
                    zzzmm.getDropDownItems().add(zzZZR.zzZ(zzzox, z, false));
                }
            }
        }
    }

    private static void zzZ(zzZMM zzzmm, int i, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzk(-1);
        int iZzZ = (zzZ(zzzmm, i) << 2) | i | (zzzmm.zzZ6M() ? 128 : 0) | (zzzmm.zzZ6L() ? 256 : 0) | (!zzzmm.getEnabled() ? 512 : 0);
        if (i == 1) {
            iZzZ |= !zzzmm.zzZ6J() ? 1024 : 0;
        }
        if (i == 0) {
            iZzZ |= zzzmm.getTextInputType() << 11;
        }
        zzzow.zzJ((short) (iZzZ | (zzzmm.zzZ6N() ? 16384 : 0) | (i == 2 ? 32768 : 0)));
        zzzow.zzJ((short) zzzmm.zzZ6K());
        zzzow.zzJ((short) zzzmm.zzZ6I());
        zzZZQ.zzZ(zzzmm.getName(), 20, zzzow, true, true);
        if (i == 0) {
            int textInputType = zzzmm.getTextInputType();
            if (textInputType == 0 || textInputType == 1 || textInputType == 2) {
                zzZZQ.zzZ(zzzmm.getTextInputDefault(), 255, zzzow, true, true);
            } else if (textInputType == 3 || textInputType == 4) {
                zzZZQ.zzZ("", 255, zzzow, true, true);
            } else {
                if (textInputType != 5) {
                    throw new IllegalStateException("Unknown text input type.");
                }
                zzZZQ.zzZ(zzzmm.getTextInputDefault(), 255, zzzow, true, true);
            }
        } else if (i == 1) {
            zzzow.zzJ(zzzmm.zzZ6H() ? (short) 1 : (short) 0);
        } else if (i == 2) {
            zzzow.zzJ((short) zzzmm.zzZ6F());
        } else {
            throw new IllegalStateException("Unknown form field type.");
        }
        zzZZQ.zzZ(zzzmm.getTextInputFormat(), 64, zzzow, true, true);
        zzZZQ.zzZ(zzzmm.getHelpText(), 255, zzzow, true, true);
        zzZZQ.zzZ(zzzmm.getStatusText(), 138, zzzow, true, true);
        zzZZQ.zzZ(zzzmm.getEntryMacro(), 32, zzzow, true, true);
        zzZZQ.zzZ(zzzmm.getExitMacro(), 32, zzzow, true, true);
        if (i == 2) {
            zzzow.zzJ((short) -1);
            zzzow.zzk(zzzmm.getDropDownItems().getCount());
            for (int i2 = 0; i2 < zzzmm.getDropDownItems().getCount(); i2++) {
                zzZZQ.zzZ(zzzmm.getDropDownItems().get(i2), Integer.MAX_VALUE, zzzow, true, false);
            }
        }
    }

    public static int zzZ(zzZMM zzzmm, int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            if (zzzmm.contains(21010)) {
                return zzzmm.zzZ6G() ? 1 : 0;
            }
            return 25;
        }
        if (i == 2) {
            if (zzzmm.contains(21070)) {
                return zzzmm.zzZ6E();
            }
            return 25;
        }
        throw new IllegalStateException("Unknown form field type.");
    }
}
