package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ04 implements zzYV9 {
    zzYS6 zzWbL;

    @Override // com.aspose.words.internal.zzYV9
    public final int getFieldSize() {
        return (this.zzWbL.zzXCs().zzXCt().getP().bitLength() + 7) / 8;
    }

    @Override // com.aspose.words.internal.zzYV9
    public final BigInteger zzY(zzYV3 zzyv3) {
        zzYS5 zzys5 = (zzYS5) zzyv3;
        zzYSW zzyswZzXCs = this.zzWbL.zzXCs();
        if (!this.zzWbL.zzXCs().zzXCt().equals(zzys5.zzXCq().zzXCt())) {
            throw new zzZ5E("MQV public key components have wrong domain parameters");
        }
        if (this.zzWbL.zzXCs().zzXCt().getQ() == null) {
            throw new zzZ5E("MQV key domain parameters do not have Q set");
        }
        BigInteger bigIntegerZzZ = zzZ(zzyswZzXCs.zzXCt(), zzyswZzXCs, zzys5.zzXCq(), this.zzWbL.zzXCr(), this.zzWbL.zzXCp(), zzys5.zzXCp());
        if (bigIntegerZzZ.equals(BigInteger.ONE)) {
            throw new IllegalStateException("1 is not a valid agreement value for MQV");
        }
        return bigIntegerZzZ;
    }

    public final void zzZ(zzYV3 zzyv3) {
        this.zzWbL = (zzYS6) zzyv3;
    }

    private static BigInteger zzZ(zzYSX zzysx, zzYSW zzysw, zzYSV zzysv, zzYSW zzysw2, zzYSV zzysv2, zzYSV zzysv3) {
        BigInteger q = zzysx.getQ();
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow((q.bitLength() + 1) / 2);
        return zzysv3.getY().multiply(zzysv.getY().modPow(zzysv3.getY().mod(bigIntegerPow).add(bigIntegerPow), zzysx.getP())).modPow(zzysw2.getX().add(zzysv2.getY().mod(bigIntegerPow).add(bigIntegerPow).multiply(zzysw.getX())).mod(q), zzysx.getP());
    }
}
