package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2P implements zzYUZ {
    private int zzWk2;
    private byte[] zzWk3;
    private byte[] zzWks;
    private zzYUX zzWkt;

    public zzZ2P(zzYUX zzyux) {
        this.zzWkt = zzyux;
        this.zzWk2 = zzyux.zzQI();
    }

    private static void zzU(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    @Override // com.aspose.words.internal.zzYUZ
    public final int zzC(byte[] bArr, int i, int i2) throws zzYV0, IllegalArgumentException {
        int i3;
        int i4;
        if (bArr.length - i2 < i) {
            throw new zzYV0("output buffer too small");
        }
        byte[] bArr2 = new byte[this.zzWk2];
        byte[] bArr3 = new byte[4];
        this.zzWkt.reset();
        int i5 = 1;
        if (i2 > this.zzWk2) {
            i3 = 0;
            while (true) {
                zzU(i5, bArr3);
                this.zzWkt.update(bArr3, 0, 4);
                zzYUX zzyux = this.zzWkt;
                byte[] bArr4 = this.zzWks;
                zzyux.update(bArr4, 0, bArr4.length);
                byte[] bArr5 = this.zzWk3;
                if (bArr5 != null) {
                    this.zzWkt.update(bArr5, 0, bArr5.length);
                }
                this.zzWkt.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i + i3, this.zzWk2);
                int i6 = this.zzWk2;
                i3 += i6;
                i4 = i5 + 1;
                if (i5 >= i2 / i6) {
                    break;
                }
                i5 = i4;
            }
            i5 = i4;
        } else {
            i3 = 0;
        }
        if (i3 < i2) {
            zzU(i5, bArr3);
            this.zzWkt.update(bArr3, 0, 4);
            zzYUX zzyux2 = this.zzWkt;
            byte[] bArr6 = this.zzWks;
            zzyux2.update(bArr6, 0, bArr6.length);
            byte[] bArr7 = this.zzWk3;
            if (bArr7 != null) {
                this.zzWkt.update(bArr7, 0, bArr7.length);
            }
            this.zzWkt.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i + i3, i2 - i3);
        }
        return i2;
    }

    @Override // com.aspose.words.internal.zzYUZ
    public final void zzZ(zzYUY zzyuy) {
        if (!(zzyuy instanceof zzYS9)) {
            throw new IllegalArgumentException("KDF parameters required for KDF generator");
        }
        zzYS9 zzys9 = (zzYS9) zzyuy;
        this.zzWks = zzys9.zzXC7();
        this.zzWk3 = zzys9.getIV();
    }
}
