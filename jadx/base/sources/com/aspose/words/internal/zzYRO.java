package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRO {
    public static byte[] zzZ(zzZ5G zzz5g, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= zzz5g.zzXGW()) {
            System.arraycopy(zzz5g.zzXGX(), 0, bArr, 0, i);
            return bArr;
        }
        int iZzXGW = zzz5g.zzXGW() / 8;
        for (int i2 = 0; i2 < i; i2 += iZzXGW) {
            byte[] bArrZzXGX = zzz5g.zzXGX();
            int i3 = i - i2;
            if (bArrZzXGX.length <= i3) {
                System.arraycopy(bArrZzXGX, 0, bArr, i2, bArrZzXGX.length);
            } else {
                System.arraycopy(bArrZzXGX, 0, bArr, i2, i3);
            }
        }
        return bArr;
    }
}
