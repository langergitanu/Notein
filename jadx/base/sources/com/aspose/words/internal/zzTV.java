package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzTV extends zzTX {
    @Override // com.aspose.words.internal.zzU1
    public final String getName() {
        return "UTF-16LE";
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        byte[] bArrZzUf = zzuu.zzUf();
        int iMin = Math.min(bArrZzUf.length, 30);
        int iZzy = 10;
        int i = 0;
        while (true) {
            if (i >= iMin - 1) {
                break;
            }
            int iZzX = zzTX.zzX(bArrZzUf[i + 1], bArrZzUf[i]);
            if (i == 0 && iZzX == 65279) {
                iZzy = 100;
                break;
            }
            iZzy = zzTX.zzy(iZzX, iZzy);
            if (iZzy == 0 || iZzy == 100) {
                break;
            }
            i += 2;
        }
        int i2 = (iMin >= 4 || iZzy >= 100) ? iZzy : 0;
        if (i2 > 0) {
            return new zzUP(this, i2);
        }
        return null;
    }
}
