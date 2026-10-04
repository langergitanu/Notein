package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ1V implements zzYV9 {
    zzYSH zzWjf;

    @Override // com.aspose.words.internal.zzYV9
    public final int getFieldSize() {
        return (this.zzWjf.zzXCl().zzXCg().zzXHv().getFieldSize() + 7) / 8;
    }

    @Override // com.aspose.words.internal.zzYV9
    public final BigInteger zzY(zzYV3 zzyv3) {
        zzYSG zzysg = (zzYSG) zzyv3;
        zzYSE zzyseZzXCl = this.zzWjf.zzXCl();
        zzYSJ zzysjZzXCg = zzyseZzXCl.zzXCg();
        if (!zzysjZzXCg.equals(zzysg.zzXCj().zzXCg())) {
            throw new zzZ5E("ECMQV public key components have wrong domain parameters");
        }
        zzYLX zzylxZzXze = zzZ(zzysjZzXCg, zzyseZzXCl, this.zzWjf.zzXCk(), this.zzWjf.zzXCi(), zzysg.zzXCj(), zzysg.zzXCi()).zzXze();
        if (zzylxZzXze.zzXzd()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
        }
        return zzylxZzXze.zzXzn().toBigInteger();
    }

    public final void zzZ(zzYV3 zzyv3) {
        this.zzWjf = (zzYSH) zzyv3;
    }

    private static zzYLX zzZ(zzYSJ zzysj, zzYSE zzyse, zzYSE zzyse2, zzYSD zzysd, zzYSD zzysd2, zzYSD zzysd3) {
        BigInteger bigIntegerZzXIz = zzysj.zzXIz();
        int iBitLength = (bigIntegerZzXIz.bitLength() + 1) / 2;
        BigInteger bigIntegerShiftLeft = zzYM2.ONE.shiftLeft(iBitLength);
        zzYM1 zzym1ZzXHv = zzysj.zzXHv();
        zzYLX zzylxZzW = zzYM3.zzW(zzym1ZzXHv, zzysd.zzXCe());
        zzYLX zzylxZzW2 = zzYM3.zzW(zzym1ZzXHv, zzysd2.zzXCe());
        zzYLX zzylxZzW3 = zzYM3.zzW(zzym1ZzXHv, zzysd3.zzXCe());
        BigInteger bigIntegerMod = zzyse.zzXCf().multiply(zzylxZzW.zzXzn().toBigInteger().mod(bigIntegerShiftLeft).setBit(iBitLength)).add(zzyse2.zzXCf()).mod(bigIntegerZzXIz);
        BigInteger bit = zzylxZzW3.zzXzn().toBigInteger().mod(bigIntegerShiftLeft).setBit(iBitLength);
        BigInteger bigIntegerMod2 = zzysj.zzXHt().multiply(bigIntegerMod).mod(bigIntegerZzXIz);
        return zzYM3.zzZ(zzylxZzW2, bit.multiply(bigIntegerMod2).mod(bigIntegerZzXIz), zzylxZzW3, bigIntegerMod2);
    }
}
