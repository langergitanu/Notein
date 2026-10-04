package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ20 implements zzYV9 {
    zzYSE zzWjk;

    @Override // com.aspose.words.internal.zzYV9
    public final int getFieldSize() {
        return (this.zzWjk.zzXCg().zzXHv().getFieldSize() + 7) / 8;
    }

    @Override // com.aspose.words.internal.zzYV9
    public final BigInteger zzY(zzYV3 zzyv3) {
        zzYSD zzysd = (zzYSD) zzyv3;
        zzYSJ zzysjZzXCg = this.zzWjk.zzXCg();
        if (!zzysjZzXCg.equals(zzysd.zzXCg())) {
            throw new zzZ5E("ECCDH public key has wrong domain parameters");
        }
        BigInteger bigIntegerMod = zzysjZzXCg.zzXHt().multiply(this.zzWjk.zzXCf()).mod(zzysjZzXCg.zzXIz());
        zzYLX zzylxZzW = zzYM3.zzW(zzysjZzXCg.zzXHv(), zzysd.zzXCe());
        if (zzylxZzW.zzXzd()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECCDH");
        }
        zzYLX zzylxZzXze = zzylxZzW.zzK(bigIntegerMod).zzXze();
        if (zzylxZzXze.zzXzd()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECCDH");
        }
        return zzylxZzXze.zzXzn().toBigInteger();
    }

    public final void zzZ(zzYV3 zzyv3) {
        this.zzWjk = (zzYSE) zzyv3;
    }
}
