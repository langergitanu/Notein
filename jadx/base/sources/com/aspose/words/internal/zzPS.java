package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPS {
    public static boolean zzP(zzPV zzpv) {
        return zzR(zzpv.zzPC(), zzpv.zzPB(), zzpv.zzPA());
    }

    private static boolean zzR(int i, int i2, int i3) {
        return Math.abs(i - i2) < 10 && Math.abs(i2 - i3) < 10;
    }

    public static zzPV zzY(zzPV zzpv, zzPV zzpv2) {
        float fZzPD = zzpv.zzPD() / 255.0f;
        return new zzPV(255, zzZ(zzpv2.zzPC(), zzpv.zzPC(), fZzPD), zzZ(zzpv2.zzPB(), zzpv.zzPB(), fZzPD), zzZ(zzpv2.zzPA(), zzpv.zzPA(), fZzPD));
    }

    private static int zzZ(int i, int i2, float f) {
        return zzAN.zzZG((f * (i2 - i)) + i);
    }

    public static zzPV zzZ(zzPV zzpv, zzPV zzpv2, float f) {
        float fZzZ = zzAN.zzZ(f, 0.0f, 1.0f);
        return new zzPV(zzY(zzpv.zzPD(), zzpv2.zzPD(), fZzZ), zzY(zzpv.zzPC(), zzpv2.zzPC(), fZzZ), zzY(zzpv.zzPB(), zzpv2.zzPB(), fZzZ), zzY(zzpv.zzPA(), zzpv2.zzPA(), fZzZ));
    }

    private static int zzY(int i, int i2, float f) {
        if (i2 == i) {
            return i;
        }
        return (int) ((((zzZKQ.zzZN(f - (((i - i2) / 765.0f) + 0.5f)) * 0.1f) + f) * (i2 - i)) + i);
    }

    public static int zzY(byte b, int i, int i2) {
        int i3 = (i * i2) % 8;
        return ((b & 255) & (((1 << i2) - 1) << i3)) >> i3;
    }

    public static byte[] zzZ(byte b, byte b2, byte b3) {
        float f;
        float f2;
        float f3;
        float f4 = 1.0f - ((b & 255) / 255.0f);
        float f5 = 1.0f - ((b2 & 255) / 255.0f);
        float f6 = 1.0f - ((b3 & 255) / 255.0f);
        float fZzR = zzAN.zzR(f4, f5, f6);
        if (fZzR == 1.0f) {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            float f7 = 1.0f - fZzR;
            f = (f4 - fZzR) / f7;
            f2 = (f5 - fZzR) / f7;
            f3 = (f6 - fZzR) / f7;
        }
        return new byte[]{(byte) (f * 255.0f), (byte) (f2 * 255.0f), (byte) (f3 * 255.0f), (byte) (fZzR * 255.0f)};
    }
}
