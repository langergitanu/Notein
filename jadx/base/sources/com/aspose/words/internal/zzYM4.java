package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYM4 implements zzYLY {
    public abstract zzYLX zzY(zzYLX zzylx, BigInteger bigInteger);

    @Override // com.aspose.words.internal.zzYLY
    public final zzYLX zzZ(zzYLX zzylx, BigInteger bigInteger) {
        int iSignum = bigInteger.signum();
        if (iSignum == 0 || zzylx.zzXzd()) {
            return zzylx.zzXHv().zzXzM();
        }
        zzYLX zzylxZzY = zzY(zzylx, bigInteger.abs());
        if (iSignum <= 0) {
            zzylxZzY = zzylxZzY.zzXzc();
        }
        return zzYM3.zzX(zzylxZzY);
    }
}
