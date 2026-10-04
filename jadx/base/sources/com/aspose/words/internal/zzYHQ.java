package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYHQ {
    public static int zzeC(int i) {
        int i2 = ((i >>> 7) ^ i) & 11141290;
        int i3 = i ^ (i2 ^ (i2 << 7));
        int i4 = ((i3 >>> 14) ^ i3) & 52428;
        int i5 = i3 ^ (i4 ^ (i4 << 14));
        int i6 = ((i5 >>> 4) ^ i5) & 15728880;
        int i7 = i5 ^ (i6 ^ (i6 << 4));
        int i8 = ((i7 >>> 8) ^ i7) & 65280;
        return i7 ^ (i8 ^ (i8 << 8));
    }
}
