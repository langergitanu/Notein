package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1A {
    private static boolean zzQ(zzY0 zzy0) throws Exception {
        zzZZW zzzzw = new zzZZW();
        while (!zzy0.zzXd()) {
            byte b = zzy0.readByte();
            zzzzw.zzF(b);
            if (b == 77 && zzzzw.getIntValue() == 943868237) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzR(zzY0 zzy0) throws Exception {
        zzy0.readByte();
        while (!zzy0.zzXd()) {
            if (zzy0.readByte() == 0) {
                return true;
            }
        }
        return false;
    }

    public static long zzX(zzY0 zzy0, long j) throws Exception {
        if (!zzQ(zzy0) || (zzy0.zzX9() & 65535) != 1005 || !zzR(zzy0)) {
            return j;
        }
        zzy0.zzXb();
        float fZzZF = zzZF(zzy0.zzXa(), zzy0.zzXa());
        zzy0.zzXa();
        zzy0.zzXa();
        float fZzZF2 = zzZF(zzy0.zzXa(), zzy0.zzXa());
        zzy0.zzXa();
        zzy0.zzXa();
        return zzZPY.zzG(fZzZF, fZzZF2);
    }

    private static float zzZF(int i, int i2) {
        return (i2 / 65536.0f) + i;
    }
}
