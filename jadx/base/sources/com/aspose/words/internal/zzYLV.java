package com.aspose.words.internal;

import java.math.BigInteger;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYLV extends zzYM4 {
    @Override // com.aspose.words.internal.zzYM4
    public final zzYLX zzY(zzYLX zzylx, BigInteger bigInteger) {
        zzYM1 zzym1ZzXHv = zzylx.zzXHv();
        int iZzT = zzYLT.zzT(zzym1ZzXHv);
        if (bigInteger.bitLength() > iZzT) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        zzYLU zzyluZzO = zzYLT.zzO(zzylx);
        zzYLZ zzylzZzXz8 = zzyluZzO.zzXz8();
        int width = zzyluZzO.getWidth();
        int iOooO00o = C24611OooO00o.OooO00o(iZzT, width, 1, width);
        zzYLX zzylxZzXzM = zzym1ZzXHv.zzXzM();
        int i = width * iOooO00o;
        int[] iArrZzV = zzYI2.zzV(i, bigInteger);
        int i2 = i - 1;
        for (int i3 = 0; i3 < iOooO00o; i3++) {
            int iZzO = 0;
            for (int i4 = i2 - i3; i4 >= 0; i4 -= iOooO00o) {
                iZzO = (iZzO << 1) | zzYI2.zzO(iArrZzV, i4);
            }
            zzylxZzXzM = zzylxZzXzM.zzR(zzylzZzXz8.zzeS(iZzO));
        }
        return zzylxZzXzM.zzT(zzyluZzO.zzXz7());
    }
}
