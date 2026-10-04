package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZB {
    private int zzKF = 0;
    private int zzZF;
    private byte zzcB;

    public static byte[] decode(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzZZB zzzzb = new zzZZB();
            for (byte b : bArr) {
                byte[] bArrZzE = zzzzb.zzE(b);
                if (bArrZzE.length > 0) {
                    zzzor.write(bArrZzE, 0, bArrZzE.length);
                }
            }
            byte[] bArrZzWy = zzzor.zzWy();
            zzzor.close();
            return bArrZzWy;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    public static byte[] encode(byte[] bArr) throws Exception {
        int i;
        int[] iArr = new int[256];
        for (byte b : bArr) {
            int i2 = b & 255;
            iArr[i2] = iArr[i2] + 1;
        }
        byte bZzT = (byte) zzT(iArr);
        zzZOR zzzor = new zzZOR();
        try {
            zzzor.writeByte(bZzT);
            int i3 = 0;
            while (i3 < bArr.length) {
                byte b2 = 1;
                while (true) {
                    i = b2 & 255;
                    int i4 = i3 + i;
                    if (i4 >= bArr.length || bArr[i4] != bArr[i3] || i >= 255) {
                        break;
                    }
                    b2 = (byte) (b2 + 1);
                }
                if (i > 3) {
                    zzzor.writeByte(bZzT);
                    zzzor.writeByte(b2);
                    zzzor.writeByte(bArr[i3]);
                } else {
                    zzzor.writeByte(bArr[i3]);
                    if (bArr[i3] == bZzT) {
                        zzzor.writeByte((byte) 0);
                    }
                    b2 = 1;
                }
                i3 += b2 & 255;
            }
            byte[] bArrZzWy = zzzor.zzWy();
            zzzor.close();
            return bArrZzWy;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private byte[] zzE(byte b) {
        int i = this.zzKF;
        if (i == 0) {
            this.zzcB = b;
            this.zzKF = 1;
            return zzZ1.zzXW;
        }
        if (i == 1) {
            if (b != this.zzcB) {
                return zzU(b, 1);
            }
            this.zzKF = 2;
            return zzZ1.zzXW;
        }
        if (i != 2) {
            if (i != 3) {
                return zzZ1.zzXW;
            }
            this.zzKF = 1;
            return zzU(b, this.zzZF);
        }
        if (b == 0) {
            this.zzKF = 1;
            return zzU(this.zzcB, 1);
        }
        this.zzZF = b & 255;
        this.zzKF = 3;
        return zzZ1.zzXW;
    }

    private static int zzT(int[] iArr) {
        int i = 0;
        int i2 = iArr[0];
        for (int i3 = 1; i3 < 256 && i2 != 0; i3++) {
            int i4 = iArr[i3];
            if (i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static byte[] zzU(byte b, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = b;
        }
        return bArr;
    }
}
