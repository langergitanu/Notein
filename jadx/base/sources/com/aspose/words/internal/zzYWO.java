package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import com.aspose.words.internal.zzZ4K;
import com.aspose.words.internal.zzZ4M;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWO<T extends zzZ4M> extends zzYUN<T> {
    private zzYUX zzWkt;

    public zzYWO(T t, zzYUX zzyux) {
        super(t);
        this.zzWkt = zzyux;
    }

    private zzYV3 zzUB(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        if (i5 > this.zzWkt.zzQI()) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i5, "Can't generate a derived key ", " bytes long."));
        }
        byte[] bArrZzXDf = zzXDf();
        return new zzYS4(new zzYS7(zzYGU.copyOfRange(bArrZzXDf, 0, i3)), bArrZzXDf, i3, i4);
    }

    private byte[] zzXDf() {
        int iZzQI = this.zzWkt.zzQI();
        byte[] bArr = new byte[iZzQI];
        zzYUX zzyux = this.zzWkt;
        byte[] bArr2 = this.zzWfD;
        zzyux.update(bArr2, 0, bArr2.length);
        zzYUX zzyux2 = this.zzWkt;
        byte[] bArr3 = this.zzWAR;
        zzyux2.update(bArr3, 0, bArr3.length);
        this.zzWkt.doFinal(bArr, 0);
        for (int i = 1; i < this.zzWfC; i++) {
            this.zzWkt.update(bArr, 0, iZzQI);
            this.zzWkt.doFinal(bArr, 0);
        }
        return bArr;
    }

    private zzYV3 zzfn(int i) {
        int i2 = i / 8;
        if (i2 <= this.zzWkt.zzQI()) {
            return new zzYS7(zzYGU.copyOfRange(zzXDf(), 0, i2));
        }
        throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i2, "Can't generate a derived key ", " bytes long."));
    }

    @Override // com.aspose.words.internal.zzZ4K
    public final byte[] zzZ(zzZ4K.zzZ zzz, int i) {
        return ((zzYS8) zzfn(i * 8)).getKey();
    }

    @Override // com.aspose.words.internal.zzZ4K
    public final byte[][] zzZ(zzZ4K.zzZ zzz, int i, int i2) {
        zzYS4 zzys4 = (zzYS4) zzUB(i * 8, i2 * 8);
        return new byte[][]{((zzYS8) zzys4.zzXC6()).getKey(), zzys4.getIV()};
    }
}
