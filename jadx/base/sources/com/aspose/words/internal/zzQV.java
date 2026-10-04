package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzQV {
    public static zzZZ5 zzZ(zzZOP zzzop, int i, int i2, int i3) throws Exception {
        zzZOR zzzor = new zzZOR();
        byte[] bArr = new byte[512];
        zzzop.zzH(76L);
        int iMin = Math.min(i, 109) * 4;
        zzzop.read(bArr, 0, iMin);
        zzzor.write(bArr, 0, iMin);
        for (int i4 = 0; i4 < i3; i4++) {
            zzzop.zzH(zzZZ4.zzD(i2, true));
            zzzop.read(bArr, 0, 512);
            zzzor.write(bArr, 0, 508);
            i2 = (bArr[508] & 255) | ((bArr[509] & 255) << 8) | ((bArr[510] & 255) << 16) | ((bArr[511] & 255) << 24);
        }
        return new zzZZ5(zzzor);
    }

    public static void zzZ(zzZOP zzzop, int i, int i2, zzIH zzih) throws Exception {
        zzZOW zzzow = new zzZOW(zzzop, zzZO0.zzhU());
        long position = zzzop.getPosition();
        zzzop.zzH(76L);
        int iMin = Math.min(i2, 109);
        for (int i3 = 0; i3 < iMin; i3++) {
            zzzow.zzl((int) (4294967295L & ((long) i)));
            i++;
        }
        zzZZ4.zzY(zzzow);
        zzzop.zzH(position);
        int i4 = i2 - iMin;
        if (i4 > 0) {
            zzih.zzy0 = zzZZ4.zzU(zzzop.getPosition(), true);
            zzih.zzxZ = 0;
            while (i4 > 0) {
                int iMin2 = Math.min(i4, 127);
                for (int i5 = 0; i5 < iMin2; i5++) {
                    zzzow.zzl((int) (((long) i) & 4294967295L));
                    i++;
                }
                zzZZ4.zzY(zzzow);
                i4 -= iMin2;
                zzih.zzxZ++;
                zzzop.zzH(zzzop.getPosition() - 4);
                if (i4 > 0) {
                    zzzow.zzl((int) (((long) ((int) ((((long) zzZZ4.zzU(zzzop.getPosition(), true)) & 4294967295L) + 1))) & 4294967295L));
                } else {
                    zzzow.zzl(-2);
                }
            }
            return;
        }
        zzih.zzy0 = -2;
        zzih.zzxZ = 0;
    }
}
