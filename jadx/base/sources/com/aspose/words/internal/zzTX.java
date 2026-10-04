package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzTX extends zzU1 {
    public static int zzX(byte b, byte b2) {
        return ((b & 255) << 8) | (b2 & 255);
    }

    public static int zzy(int i, int i2) {
        if (i == 0) {
            i2 -= 10;
        } else if ((i >= 32 && i <= 255) || i == 10) {
            i2 += 10;
        }
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 100) {
            return 100;
        }
        return i2;
    }
}
