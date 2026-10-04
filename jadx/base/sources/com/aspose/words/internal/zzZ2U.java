package com.aspose.words.internal;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes5.dex */
class zzZ2U implements zzYUW {

    /* JADX INFO: renamed from: iv */
    private byte[] f51307iv;
    private byte[] zzWks;
    private zzYUX zzWkt;
    private int zzWku = 1;

    public zzZ2U(zzYUX zzyux) {
        this.zzWkt = zzyux;
    }

    @Override // com.aspose.words.internal.zzYUZ
    public final int zzC(byte[] bArr, int i, int i2) throws zzYV0, IllegalArgumentException {
        int i3 = i2;
        int i4 = i;
        if (bArr.length - i3 < i4) {
            throw new zzYV0("output buffer too small");
        }
        long j = i3;
        int iZzQI = this.zzWkt.zzQI();
        long j2 = iZzQI;
        int i5 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[this.zzWkt.zzQI()];
        byte[] bArr3 = new byte[4];
        zzYGN.zzN(this.zzWku, bArr3, 0);
        int i6 = this.zzWku & InputDeviceCompat.SOURCE_ANY;
        for (int i7 = 0; i7 < i5; i7++) {
            zzYUX zzyux = this.zzWkt;
            byte[] bArr4 = this.zzWks;
            zzyux.update(bArr4, 0, bArr4.length);
            this.zzWkt.update(bArr3, 0, 4);
            byte[] bArr5 = this.f51307iv;
            if (bArr5 != null) {
                this.zzWkt.update(bArr5, 0, bArr5.length);
            }
            this.zzWkt.doFinal(bArr2, 0);
            if (i3 > iZzQI) {
                System.arraycopy(bArr2, 0, bArr, i4, iZzQI);
                i4 += iZzQI;
                i3 -= iZzQI;
            } else {
                System.arraycopy(bArr2, 0, bArr, i4, i3);
            }
            byte b = (byte) (bArr3[3] + 1);
            bArr3[3] = b;
            if (b == 0) {
                i6 += 256;
                zzYGN.zzN(i6, bArr3, 0);
            }
        }
        this.zzWkt.reset();
        return (int) j;
    }

    @Override // com.aspose.words.internal.zzYUZ
    public final void zzZ(zzYUY zzyuy) {
        if (!(zzyuy instanceof zzYS9)) {
            throw new IllegalArgumentException("KDF parameters required for KDF generator");
        }
        zzYS9 zzys9 = (zzYS9) zzyuy;
        this.zzWks = zzys9.zzXC7();
        this.f51307iv = zzys9.getIV();
    }
}
