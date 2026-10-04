package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZ4 {
    public static long zzD(int i, boolean z) {
        long j;
        long j2;
        if (z) {
            j = (((long) i) & 4294967295L) + 1;
            j2 = 512;
        } else {
            j = ((long) i) & 4294967295L;
            j2 = 64;
        }
        return ((long) ((int) (j * j2))) & 4294967295L;
    }

    public static int zzU(long j, boolean z) {
        return (int) (z ? (j / 512) - 1 : j / 64);
    }

    public static void zzY(zzZOW zzzow) throws Exception {
        while (zzzow.zzq().getPosition() % 512 != 0) {
            zzzow.zzl(-1);
        }
    }

    public static long zzZB(int i, int i2) {
        return zzD(i, i2 == 512);
    }
}
