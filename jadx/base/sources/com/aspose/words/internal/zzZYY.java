package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZYY {
    public static void zzZ(short s, zzXZ zzxz) throws Exception {
        if (Math.abs((int) s) > 755 || s <= -250) {
            zzxz.writeByte((byte) -3);
            zzxz.zzj(s);
            return;
        }
        if (s < 0) {
            zzxz.writeByte((byte) -6);
            s = (short) (s * (-1));
        }
        if (s < 250) {
            zzxz.writeByte((byte) s);
        } else if (s <= 505) {
            zzxz.writeByte((byte) -1);
            zzxz.writeByte((byte) (s - 250));
        } else {
            zzxz.writeByte((byte) -2);
            zzxz.writeByte((byte) (s - 500));
        }
    }

    public static short zzt(zzY0 zzy0) throws Exception {
        short s;
        short s2 = (short) (zzy0.readByte() & 255);
        if (s2 == 253) {
            return zzy0.zzXa();
        }
        if (s2 == 250) {
            s2 = (short) (zzy0.readByte() & 255);
            s = -1;
        } else {
            s = 1;
        }
        if (s2 == 255 || s2 == 254) {
            s2 = (short) (((s2 != 255 ? 2 : 1) * 250) + ((short) (zzy0.readByte() & 255)));
        }
        return (short) (s2 * s);
    }
}
