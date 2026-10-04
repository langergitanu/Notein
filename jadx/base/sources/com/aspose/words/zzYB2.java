package com.aspose.words;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes6.dex */
final class zzYB2 {
    private zzYB3 zzXdX;
    private zzYB3 zzXdY;
    private int zzXe0;
    private byte[] zzXe1;
    private byte zzXe2;
    private byte zzXe3;
    private com.aspose.words.internal.zzZOR zzXe4 = new com.aspose.words.internal.zzZOR();
    private com.aspose.words.internal.zzZOR zzXdZ = new com.aspose.words.internal.zzZOR();

    public zzYB2(zzYB3 zzyb3, byte[] bArr, boolean z) throws Exception {
        this.zzXe3 = (byte) 0;
        this.zzXe2 = (byte) -1;
        this.zzXe0 = 0;
        if (true != z) {
            this.zzXe3 = bArr[0];
            this.zzXe2 = bArr[1];
        }
        this.zzXe4.write(bArr, 0, bArr.length);
        if (zzXL(bArr)) {
            this.zzXe0 = 10;
        }
        this.zzXdY = zzyb3;
    }

    private boolean zzXL(byte[] bArr) {
        this.zzXe1 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            byte[] bArr2 = this.zzXe1;
            byte b = (byte) (bArr[i] & UnsignedBytes.MAX_POWER_OF_TWO);
            bArr2[i] = b;
            bArr2[i] = (byte) (b | 2);
        }
        return (this.zzXe1[0] & 8) == 8;
    }

    private void zzY7O() {
        int i = this.zzXe0;
        if (i != 10) {
            this.zzXe0 = i + 5;
        }
        this.zzXe3 = (byte) (this.zzXe3 - 1);
    }

    public final boolean zzB4(String str) throws Exception {
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhU().getBytes(str);
        this.zzXdZ.write(bytes, 0, bytes.length);
        zzY7O();
        return this.zzXdZ.getLength() < 16;
    }

    public final zzYB3 zzY7M() {
        return this.zzXdX;
    }

    public final com.aspose.words.internal.zzZOR zzY7N() {
        return this.zzXe4;
    }

    public final void zzY7P() throws Exception {
        int[] iArrZzY7L = new zzYB1(this).zzY7L();
        if (iArrZzY7L.length >= 10) {
            this.zzXe2 = (byte) iArrZzY7L[9];
        }
    }

    public final void zzY7Q() throws Exception {
        this.zzXe3 = (byte) 0;
        if (this.zzXe4.getLength() > 0) {
            int length = (((int) this.zzXe4.getLength()) / 2) + 1;
            byte[] bArrZzWy = this.zzXe4.zzWy();
            if (zzY3F.zzXTP() == 255) {
                zzY3F.zzjd(128);
            }
            int length2 = bArrZzWy.length - 1;
            for (int i = 0; i < length; i++) {
                byte b = bArrZzWy[length2];
                if ((b & 255) == 255) {
                    this.zzXe0++;
                }
                if (b != ((byte) this.zzXdX.zzY7R()[length2])) {
                    zzY3F.zzje(128);
                }
                length2--;
            }
        }
    }

    public final zzYB3 zzZ(zzYB3 zzyb3) {
        this.zzXdX = zzyb3;
        return this.zzXdY;
    }
}
