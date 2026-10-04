package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYUN<T extends zzZ4M> implements zzZ4K<T> {
    protected byte[] zzWAR;
    protected int zzWfC;
    protected byte[] zzWfD;
    private final T zzWil;

    public zzYUN(T t) {
        this.zzWil = t;
    }

    public static byte[] zzF(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i = 0; i != cArr.length; i++) {
            int i2 = i * 2;
            char c = cArr[i];
            bArr[i2] = (byte) (c >>> '\b');
            bArr[i2 + 1] = (byte) c;
        }
        return bArr;
    }

    public static byte[] zzG(char[] cArr) {
        return cArr != null ? zzYGI.zzD(cArr) : new byte[0];
    }

    public static byte[] zzH(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public final void zzT(byte[] bArr, byte[] bArr2, int i) {
        this.zzWfD = bArr;
        this.zzWAR = bArr2;
        this.zzWfC = i;
    }
}
