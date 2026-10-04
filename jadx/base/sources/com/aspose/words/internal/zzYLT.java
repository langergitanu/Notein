package com.aspose.words.internal;

import java.math.BigInteger;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYLT {
    public static zzYLU zzO(final zzYLX zzylx) {
        final zzYM1 zzym1ZzXHv = zzylx.zzXHv();
        return (zzYLU) zzym1ZzXHv.zzZ(zzylx, "bc_fixed_point", new zzYLQ() { // from class: com.aspose.words.internal.zzYLT.1
            @Override // com.aspose.words.internal.zzYLQ
            public final zzYLP zzZ(zzYLP zzylp) {
                zzYLU zzylu = zzylp instanceof zzYLU ? (zzYLU) zzylp : null;
                int iZzT = zzYLT.zzT(zzym1ZzXHv);
                int i = iZzT > 257 ? 6 : 5;
                int i2 = 1 << i;
                if (zzZ(zzylu, i2)) {
                    return zzylu;
                }
                int iOooO00o = C24611OooO00o.OooO00o(iZzT, i, 1, i);
                zzYLX[] zzylxArr = new zzYLX[i + 1];
                zzylxArr[0] = zzylx;
                for (int i3 = 1; i3 < i; i3++) {
                    zzylxArr[i3] = zzylxArr[i3 - 1].zzeP(iOooO00o);
                }
                zzylxArr[i] = zzylxArr[0].zzS(zzylxArr[1]);
                zzym1ZzXHv.zzZ(zzylxArr);
                zzYLX[] zzylxArr2 = new zzYLX[i2];
                zzylxArr2[0] = zzylxArr[0];
                for (int i4 = i - 1; i4 >= 0; i4--) {
                    zzYLX zzylx2 = zzylxArr[i4];
                    int i5 = 1 << i4;
                    for (int i6 = i5; i6 < i2; i6 += i5 << 1) {
                        zzylxArr2[i6] = zzylxArr2[i6 - i5].zzT(zzylx2);
                    }
                }
                zzym1ZzXHv.zzZ(zzylxArr2);
                zzYLU zzylu2 = new zzYLU();
                zzylu2.zzZ(zzym1ZzXHv.zzZ(zzylxArr2, i2));
                zzylu2.zzP(zzylxArr[i]);
                zzylu2.setWidth(i);
                return zzylu2;
            }

            private static boolean zzZ(zzYLU zzylu, int i) {
                return zzylu != null && zzZ(zzylu.zzXz8(), i);
            }

            private static boolean zzZ(zzYLZ zzylz, int i) {
                return zzylz != null && zzylz.getSize() >= i;
            }
        });
    }

    public static int zzT(zzYM1 zzym1) {
        BigInteger order = zzym1.getOrder();
        BigInteger bigIntegerZzXzI = zzym1.zzXzI();
        if (!bigIntegerZzXzI.equals(zzYM2.ONE)) {
            order = order.multiply(bigIntegerZzXzI);
        }
        return order.bitLength();
    }
}
