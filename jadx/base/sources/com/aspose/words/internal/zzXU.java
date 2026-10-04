package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXU {
    public static int zz6(int i) {
        int i2 = Integer.MIN_VALUE;
        int i3 = 32;
        while ((((long) i) & 4294967295L & 4294967295L & ((long) i2)) == 0 && i3 > 1) {
            i2 >>>= 1;
            i3--;
        }
        return i3;
    }

    public static int zz7(int i) {
        int i2 = (i & 1431655765) + ((i >> 1) & 1431655765);
        int i3 = (i2 & 858993459) + (858993459 & (i2 >> 2));
        int i4 = (i3 & 252645135) + (252645135 & (i3 >> 4));
        int i5 = (i4 & 16711935) + (16711935 & (i4 >> 8));
        return (i5 & 65535) + (65535 & (i5 >> 16));
    }

    public static int zz8(int i) {
        long j = i;
        return (int) (((j & 4278190080L) >> 24) | ((255 & j) << 24) | ((65280 & j) << 8) | ((16711680 & j) >> 8));
    }

    public static int zz9(int i) {
        return (int) (((long) zz8(i)) & 4294967295L);
    }

    public static boolean zzM(int i, int i2) {
        return ((((long) i2) & 4294967295L) & (((long) i) & 4294967295L)) != 0;
    }

    public static boolean zzN(int i, int i2) {
        return (i & i2) != 0;
    }

    public static long zzP(long j) {
        return ((j >> 56) & 255) | ((j & 255) << 56) | ((65280 & j) << 40) | ((16711680 & j) << 24) | ((4278190080L & j) << 8) | ((1095216660480L & j) >> 8) | ((280375465082880L & j) >> 24) | ((71776119061217280L & j) >> 40);
    }

    public static short zzY(short s) {
        return (short) (((s & 65280) >> 8) | ((s & 255) << 8));
    }

    public static int zzZ(int i, int i2, boolean z) {
        return z ? i | i2 : i & (~i2);
    }

    public static boolean[] zzY(byte b) {
        boolean[] zArr = new boolean[8];
        for (int i = 0; i < 8; i++) {
            boolean z = true;
            if ((b & 255 & (1 << i)) == 0) {
                z = false;
            }
            zArr[i] = z;
        }
        return zArr;
    }

    public static boolean zzZ(byte b, byte b2) {
        return ((b & 255) & (b2 & 255)) != 0;
    }

    public static boolean zzZ(short s, short s2) {
        return ((s & 65535) & (s2 & 65535)) != 0;
    }

    public static short zzZ(short s) {
        return (short) (zzY(s) & 65535);
    }
}
