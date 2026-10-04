package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMD {
    public static void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZLZ zzzlz) throws Exception {
        zzzox.zzXa();
        zzzox.zzXa();
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzZLY zzzly = new zzZLY(zzzox, zzzlz);
        zzzly.zzZjA = iZzXb;
        zzzly.zzf(1, 4, 31720);
        zzzly.zzf(2, 4, 31725);
        zzzly.zzf(4, 4, 31730);
        zzzly.zzf(16, 4, 31735);
        zzzly.zzf(32, 4, 31740);
        zzzly.zzAE(4);
    }

    public static void zzZ(com.aspose.words.internal.zzZOW zzzow, zzZLZ zzzlz) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzK((short) 512);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, zzzlz);
        long j = (int) (((long) ((int) (((long) ((int) (((long) ((int) (zzzlx.zzX9(31720, 4) ? 1L : 0L))) | (zzzlx.zzX9(31725, 4) ? 2L : 0L)))) | (zzzlx.zzX9(31730, 4) ? 4L : 0L)))) | (zzzlx.zzX9(31735, 4) ? 16L : 0L));
        long j2 = zzzlx.zzX9(31740, 4) ? 32L : 0L;
        zzzlx.zzXB(4);
        zzzlx.zzd(position, (int) (j | j2), -1);
    }

    public static boolean zzZ(zzZLZ zzzlz) {
        return zzzlz.zzPg(31720) && zzzlz.zzPg(31725) && zzzlz.zzPg(31730) && zzzlz.zzPg(31735) && zzzlz.zzPg(31740);
    }
}
