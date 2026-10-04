package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYLK extends zzYM4 {
    @Override // com.aspose.words.internal.zzYM4
    public final zzYLX zzY(zzYLX zzylx, BigInteger bigInteger) {
        zzYLX zzylxZzT;
        int iMax = Math.max(2, Math.min(16, zzYLI.zzeH(bigInteger.bitLength())));
        zzYLJ zzyljZzZ = zzYLI.zzZ(zzylx, iMax, true);
        zzYLX[] zzylxArrZzXyT = zzyljZzZ.zzXyT();
        zzYLX[] zzylxArrZzXyS = zzyljZzZ.zzXyS();
        int[] iArrZzX = zzYLI.zzX(iMax, bigInteger);
        zzYLX zzylxZzXzM = zzylx.zzXHv().zzXzM();
        int length = iArrZzX.length;
        if (length > 1) {
            length--;
            int i = iArrZzX[length];
            int i2 = i >> 16;
            int i3 = i & 65535;
            int iAbs = Math.abs(i2);
            zzYLX[] zzylxArr = i2 < 0 ? zzylxArrZzXyS : zzylxArrZzXyT;
            if ((iAbs << 2) < (1 << iMax)) {
                byte b = zzYLR.f51148aE[iAbs];
                int i4 = iMax - b;
                zzylxZzT = zzylxArr[((1 << (iMax - 1)) - 1) >>> 1].zzT(zzylxArr[(((iAbs ^ (1 << (b - 1))) << i4) + 1) >>> 1]);
                i3 -= i4;
            } else {
                zzylxZzT = zzylxArr[iAbs >>> 1];
            }
            zzylxZzXzM = zzylxZzT.zzeP(i3);
        }
        while (length > 0) {
            length--;
            int i5 = iArrZzX[length];
            int i6 = i5 >> 16;
            zzylxZzXzM = zzylxZzXzM.zzR((i6 < 0 ? zzylxArrZzXyS : zzylxArrZzXyT)[Math.abs(i6) >>> 1]).zzeP(i5 & 65535);
        }
        return zzylxZzXzM;
    }
}
