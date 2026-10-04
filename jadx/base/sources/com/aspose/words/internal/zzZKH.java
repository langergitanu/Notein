package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZKH {
    static final /* synthetic */ boolean zzVr = true;

    private zzZKH() {
    }

    private static int zz8(int i) {
        long j = i;
        return (int) (((j & 4278190080L) >> 24) | ((255 & j) << 24) | ((65280 & j) << 8) | ((16711680 & j) >> 8));
    }

    public static int zz9(int i) {
        return (int) (((long) zz8(i)) & 4294967295L);
    }

    public static long zzP(long j) {
        return ((j >> 56) & 255) | ((j & 255) << 56) | ((65280 & j) << 40) | ((16711680 & j) << 24) | ((4278190080L & j) << 8) | ((1095216660480L & j) >> 8) | ((280375465082880L & j) >> 24) | ((71776119061217280L & j) >> 40);
    }

    private static short zzY(short s) {
        return (short) (((s & 65280) >> 8) | ((s & 255) << 8));
    }

    public static short zzZ(short s) {
        return (short) (zzY(s) & 65535);
    }
}
