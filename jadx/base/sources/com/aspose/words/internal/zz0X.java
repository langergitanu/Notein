package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz0X {
    private static byte[] zzY(byte[] bArr, zzPV zzpv, zzPV zzpv2) throws Exception {
        zzXN zzxn = new zzXN(8, 8);
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                try {
                    zzxn.zzZ(i2, i, ((bArr[i] & 255) & (128 >> i2)) > 0 ? zzpv2 : zzpv);
                } catch (Throwable th) {
                    zzxn.dispose();
                    throw th;
                }
            }
        }
        zzZOR zzzor = new zzZOR();
        zzxn.zzZ(zzzor, 6);
        byte[] bArrZzZX = zzZYQ.zzZX(zzzor);
        zzxn.dispose();
        return bArrZzZX;
    }

    public static zzPY zzZ(byte[] bArr, zzPV zzpv, zzPV zzpv2) throws Exception {
        return (bArr == null || zzY(bArr, (byte) -1)) ? new zzOI(zzpv2) : zzY(bArr, (byte) 0) ? new zzOI(zzpv2) : new zzOH(zzY(bArr, zzpv, zzpv2), 0);
    }

    private static boolean zzY(byte[] bArr, byte b) {
        for (byte b2 : bArr) {
            if (b2 != b) {
                return false;
            }
        }
        return true;
    }
}
