package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz0W {
    public static byte[] zzI(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        zzZKV.zzY(bArr, 0, bArr2, i - bArr.length, bArr.length);
        return bArr2;
    }

    public static byte[] zzZ(zzZZ8 zzzz8, byte[] bArr) {
        return zzzz8.zzZi(bArr);
    }

    public static byte[] zzZc(byte[] bArr) {
        int i = 0;
        while (i < bArr.length - 1 && bArr[i] == 0) {
            i++;
        }
        if (i <= 0) {
            return bArr;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        zzZKV.zzY(bArr, i, bArr2, 0, length);
        return bArr2;
    }
}
