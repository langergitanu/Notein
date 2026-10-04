package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;
import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYLH extends zzYM4 {
    private static zzYLX.zzZ zzZ(zzYLX.zzZ zzz, zzYLF zzylf, byte b, byte b2) {
        return zzY(zzz, zzYLM.zzZ(b2, zzylf, BigInteger.valueOf(16L), zzYLM.zz9(b2), b == 0 ? zzYLM.f51137aM : zzYLM.f51139aO));
    }

    @Override // com.aspose.words.internal.zzYM4
    public final zzYLX zzY(zzYLX zzylx, BigInteger bigInteger) {
        if (!(zzylx instanceof zzYLX.zzZ)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        zzYLX.zzZ zzz = (zzYLX.zzZ) zzylx;
        zzYM1.zzZ zzz2 = (zzYM1.zzZ) zzz.zzXHv();
        int fieldSize = zzz2.getFieldSize();
        byte bByteValue = zzz2.zzXzK().toBigInteger().byteValue();
        byte bZzeI = zzYLM.zzeI(bByteValue);
        return zzZ(zzz, zzYLM.zzZ(bigInteger, fieldSize, bByteValue, zzz2.zzXzE(), bZzeI), bByteValue, bZzeI);
    }

    private static zzYLX.zzZ zzY(final zzYLX.zzZ zzz, byte[] bArr) {
        zzYM1.zzZ zzz2 = (zzYM1.zzZ) zzz.zzXHv();
        final byte bByteValue = zzz2.zzXzK().toBigInteger().byteValue();
        zzYLX.zzZ[] zzzArrZzXyP = ((zzYLG) zzz2.zzZ(zzz, "bc_wtnaf", new zzYLQ() { // from class: com.aspose.words.internal.zzYLH.1
            @Override // com.aspose.words.internal.zzYLQ
            public final zzYLP zzZ(zzYLP zzylp) {
                if (zzylp instanceof zzYLG) {
                    return zzylp;
                }
                zzYLG zzylg = new zzYLG();
                zzylg.zzZ(zzYLM.zzZ(zzz, bByteValue));
                return zzylg;
            }
        })).zzXyP();
        zzYLX.zzZ[] zzzArr = new zzYLX.zzZ[zzzArrZzXyP.length];
        for (int i = 0; i < zzzArrZzXyP.length; i++) {
            zzzArr[i] = (zzYLX.zzZ) zzzArrZzXyP[i].zzXzc();
        }
        zzYLX.zzZ zzz3 = (zzYLX.zzZ) zzz.zzXHv().zzXzM();
        int i2 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i2++;
            byte b = bArr[length];
            if (b != 0) {
                zzz3 = (zzYLX.zzZ) zzz3.zzeO(i2).zzT(b > 0 ? zzzArrZzXyP[b >>> 1] : zzzArr[(-b) >>> 1]);
                i2 = 0;
            }
        }
        return i2 > 0 ? zzz3.zzeO(i2) : zzz3;
    }
}
