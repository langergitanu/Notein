package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4K;
import com.aspose.words.internal.zzZ4M;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWS<T extends zzZ4M> extends zzYUN<T> {
    private zzYUX zzWkt;

    public zzYWS(T t) {
        super(t);
        this.zzWkt = new zzYWV();
    }

    private byte[] zzfF(int i) {
        int iZzQI = this.zzWkt.zzQI();
        byte[] bArr = new byte[iZzQI];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            zzYUX zzyux = this.zzWkt;
            byte[] bArr3 = this.zzWfD;
            zzyux.update(bArr3, 0, bArr3.length);
            zzYUX zzyux2 = this.zzWkt;
            byte[] bArr4 = this.zzWAR;
            zzyux2.update(bArr4, 0, bArr4.length);
            this.zzWkt.doFinal(bArr, 0);
            int i3 = i > iZzQI ? iZzQI : i;
            System.arraycopy(bArr, 0, bArr2, i2, i3);
            i2 += i3;
            i -= i3;
            if (i == 0) {
                return bArr2;
            }
            this.zzWkt.reset();
            this.zzWkt.update(bArr, 0, iZzQI);
        }
    }

    @Override // com.aspose.words.internal.zzZ4K
    public final byte[] zzZ(zzZ4K.zzZ zzz, int i) {
        return zzfF(i);
    }

    @Override // com.aspose.words.internal.zzZ4K
    public final byte[][] zzZ(zzZ4K.zzZ zzz, int i, int i2) {
        int i3 = i2 + i;
        byte[] bArrZzfF = zzfF(i3);
        return new byte[][]{zzYGU.copyOfRange(bArrZzfF, 0, i), zzYGU.copyOfRange(bArrZzfF, i, i3)};
    }
}
