package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzTU extends zzTX {
    public abstract int zzR(byte[] bArr, int i);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    @Override // com.aspose.words.internal.zzU1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzUP zzZ(zzUU zzuu) {
        byte[] bArrZzUf = zzuu.zzUf();
        int iZzUd = (zzuu.zzUd() / 4) * 4;
        if (iZzUd == 0) {
            return null;
        }
        int i = 0;
        boolean z = zzR(bArrZzUf, 0) == 65279;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iZzUd; i4 += 4) {
            int iZzR = zzR(bArrZzUf, i4);
            if (iZzR < 0 || iZzR >= 1114111 || (iZzR >= 55296 && iZzR <= 57343)) {
                i2++;
            } else {
                i3++;
            }
        }
        if (!z || i2 != 0) {
            if (!z || i3 <= i2 * 10) {
                if (i3 > 3 && i2 == 0) {
                    i = 100;
                } else if (i3 > 0 && i2 == 0) {
                    i = 80;
                } else if (i3 > i2 * 10) {
                    i = 25;
                }
            }
        }
        if (i == 0) {
            return null;
        }
        return new zzUP(this, i);
    }
}
