package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
final class zzZVZ {
    public static void zzZ(int i, zzXZ zzxz) throws Exception {
        if (i < 253) {
            zzxz.writeByte((byte) i);
            return;
        }
        if (i <= 508) {
            zzxz.writeByte((byte) -1);
            zzxz.writeByte((byte) (i - StyleIdentifier.MEDIUM_GRID_1_ACCENT_6));
        } else if (i <= 761) {
            zzxz.writeByte((byte) -2);
            zzxz.writeByte((byte) (i - 506));
        } else {
            zzxz.writeByte((byte) -3);
            zzxz.zzi(i);
        }
    }

    public static int zzo(zzY0 zzy0) throws Exception {
        short s = (short) (zzy0.readByte() & 255);
        switch (s) {
            case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                return zzy0.zzX9() & 65535;
            case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                return (zzy0.readByte() & 255) + 506;
            case 255:
                return (zzy0.readByte() & 255) + StyleIdentifier.MEDIUM_GRID_1_ACCENT_6;
            default:
                return s;
        }
    }
}
