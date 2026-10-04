package com.aspose.words;

import com.google.common.primitives.SignedBytes;

/* JADX INFO: loaded from: classes6.dex */
final class zzXY {
    public static Border zzW(com.aspose.words.internal.zzZOX zzzox, Border border) throws Exception {
        int iZzXc = zzzox.zzXc();
        int i = zzzox.readByte() & 255;
        int i2 = zzzox.readByte() & 255;
        if (i2 == 255) {
            zzzox.readByte();
            zzzox.readByte();
            return Border.zz8G();
        }
        if (border == null || com.aspose.words.internal.zzZKO.zzA(border, Border.zzZCe)) {
            border = new Border();
        }
        border.zzm(zzY0E.zzhI(iZzXc));
        border.zzOU(i);
        border.zzOV(i2);
        byte b = zzzox.readByte();
        border.zzOT(((byte) (b & 31)) & 255);
        border.setShadow((b & 32) != 0);
        border.zzYO((b & SignedBytes.MAX_POWER_OF_TWO) != 0);
        zzzox.readByte();
        return border;
    }

    public static Border zzX(com.aspose.words.internal.zzZOX zzzox, Border border) throws Exception {
        int i = zzzox.readByte() & 255;
        int i2 = zzzox.readByte() & 255;
        if (i2 == 255) {
            zzzox.readByte();
            zzzox.readByte();
            return Border.zz8G();
        }
        if (border == null || com.aspose.words.internal.zzZKO.zzA(border, Border.zzZCe)) {
            border = new Border();
        }
        border.zzOV(i2);
        border.zzOU(i);
        border.zzm(zzY0E.zzhL(zzzox.readByte() & 255));
        byte b = zzzox.readByte();
        border.zzOT(((byte) (b & 31)) & 255);
        border.setShadow((b & 32) != 0);
        border.zzYO((b & SignedBytes.MAX_POWER_OF_TWO) != 0);
        return border;
    }

    public static Border zzY(com.aspose.words.internal.zzZOX zzzox, Border border) throws Exception {
        if (border == null || com.aspose.words.internal.zzZKO.zzA(border, Border.zzZCe)) {
            border = new Border();
        }
        short sZzX9 = zzzox.zzX9();
        if ((sZzX9 & 65535) == 65535) {
            return Border.zzV(border);
        }
        int i = sZzX9 & 7;
        int i2 = (sZzX9 & 24) >> 3;
        int i3 = (sZzX9 & 63488) >> 11;
        if (i < 6) {
            if (i2 == 0) {
                border.zzOV(0);
            } else if (i2 == 1) {
                border.zzOV(1);
            } else if (i2 == 2) {
                border.zzOV(2);
            } else if (i2 == 3) {
                border.zzOV(3);
            }
            border.setLineWidth(((double) i) * 0.75d);
        } else if (i == 6) {
            border.zzOV(6);
            border.setLineWidth(0.75d);
        } else if (i == 7) {
            border.zzOV(22);
            border.setLineWidth(0.75d);
        }
        border.setDistanceFromText(i3);
        return border;
    }

    public static int zzYM(boolean z) {
        return z ? 8 : 4;
    }

    public static Border zzZ(com.aspose.words.internal.zzZOX zzzox, Border border) throws Exception {
        short sZzX9 = zzzox.zzX9();
        int i = (sZzX9 & 56) >> 3;
        int i2 = (sZzX9 & 448) >> 6;
        if (border == null || com.aspose.words.internal.zzZKO.zzA(border, Border.zzZCe)) {
            border = new Border();
        }
        if (i2 == 1) {
            border.zzOV(i == 0 ? 1 : 3);
        } else if (i2 == 2 || i2 == 4) {
            border.zzOV(2);
        } else if (i2 == 6) {
            border.zzOV(6);
        } else if (i2 == 7) {
            border.zzOV(5);
        }
        border.setLineWidth(ConvertUtil.pixelToPoint(i2));
        return border;
    }

    private static int zzt(int i, boolean z) {
        if (i == 27 || i == 26) {
            if (!z) {
                return 1;
            }
        } else if (i == 2) {
            return 1;
        }
        return i;
    }

    public static void zzZ(Border border, com.aspose.words.internal.zzZOW zzzow, boolean z) throws Exception {
        if (border.zz8F()) {
            zzzow.zzk(-1);
            return;
        }
        zzzow.writeByte((byte) border.zz8L());
        zzzow.writeByte((byte) zzt(border.getLineStyle(), false));
        zzzow.writeByte((byte) zzY0E.zzZE(border.zz8Q()));
        zzzow.writeByte((byte) ((border.getShadow() ? 32 : 0) | (border.zz8P() ? 64 : 0) | (z ? border.zz8K() : 0)));
    }

    public static void zzX(Border border, com.aspose.words.internal.zzZOW zzzow, boolean z) throws Exception {
        if (border == null) {
            border = Border.zz8G();
        }
        if (z) {
            zzY(border, zzzow, false);
        } else {
            zzZ(border, zzzow, false);
        }
    }

    public static void zzY(Border border, com.aspose.words.internal.zzZOW zzzow, boolean z) throws Exception {
        if (border.zz8F()) {
            zzzow.zzk(-1);
            zzzow.zzk(-1);
            return;
        }
        zzzow.zzl(zzY0E.zzZD(border.zz8Q()));
        zzzow.writeByte((byte) border.zz8L());
        zzzow.writeByte((byte) zzt(border.getLineStyle(), true));
        zzzow.writeByte((byte) ((border.zz8P() ? 64 : 0) | (border.getShadow() ? 32 : 0) | (z ? border.zz8K() : 0)));
        zzzow.writeByte((byte) 0);
    }
}
