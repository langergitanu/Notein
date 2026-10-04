package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLW {
    public static void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZLZ zzzlz) throws Exception {
        zzzox.zzXa();
        zzzox.zzXa();
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzZLY zzzly = new zzZLY(zzzox, zzzlz);
        zzzly.zzZjA = iZzXb;
        int iZzXf = zzzly.zzXf(1, 4);
        zzzly.zzf(2, 4, 31605);
        zzzly.zzf(4, 4, 31610);
        zzzly.zzf(16, 1, 31615);
        zzzly.zzf(32, 1, 31620);
        zzzly.zzf(64, 1, 31625);
        zzzly.zzf(128, 2, 31630);
        zzzly.zze(1, iZzXf, 31600);
        zzzly.zzAE(4);
    }

    public static void zzZ(com.aspose.words.internal.zzZOW zzzow, zzZLZ zzzlz) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzK((short) 512);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, zzzlz);
        byte[] bArrZzLg = zzzlx.zzLg((String) zzzlz.zzPj(31600));
        long j = (int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (zzzlx.zzX9(31605, 4) ? 2L : 0L))) | (zzzlx.zzX9(31610, 4) ? 4L : 0L)))) | (zzzlx.zzX9(31615, 1) ? 16L : 0L)))) | (zzzlx.zzX9(31620, 1) ? 32L : 0L)))) | (zzzlx.zzX9(31625, 1) ? 64L : 0L));
        long j2 = zzzlx.zzX9(31630, 2) ? 128L : 0L;
        zzzlx.zzXB(4);
        long j3 = (int) (j2 | j);
        long j4 = zzzlx.zzt(bArrZzLg, 4) ? 1L : 0L;
        zzzlx.zzXB(4);
        zzzlx.zzX8(position, (int) (j3 | j4));
    }

    public static boolean zzZ(zzZLZ zzzlz) {
        return zzzlz.zzPg(31605) && zzzlz.zzPg(31610) && zzzlz.zzPg(31615) && zzzlz.zzPg(31620) && zzzlz.zzPg(31625) && zzzlz.zzPg(31630) && zzzlz.zzPg(31600);
    }
}
