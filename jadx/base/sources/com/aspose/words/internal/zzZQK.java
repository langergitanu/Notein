package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQK {
    public static byte[] getBytes(int i) {
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }

    public static int zzA(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("value");
        }
        if (i > bArr.length - 4) {
            throw new IllegalArgumentException("startIndex");
        }
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static short zzB(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("value");
        }
        if (i > bArr.length - 2) {
            throw new IllegalArgumentException("startIndex");
        }
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static byte[] zzL(short s) {
        return new byte[]{(byte) s, (byte) (s >>> 8)};
    }

    public static byte[] zzYN(long j) {
        return new byte[]{(byte) j, (byte) (j >>> 8), (byte) (j >>> 16), (byte) (j >>> 24), (byte) (j >>> 32), (byte) (j >>> 40), (byte) (j >>> 48), (byte) (j >>> 56)};
    }
}
