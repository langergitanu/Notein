package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYIK implements zzYIL {

    /* JADX INFO: renamed from: cy */
    protected final zzYIJ f50954cy;

    /* JADX INFO: renamed from: cz */
    protected final zzYLW f50955cz;
    protected final zzYM1 zzWoB;

    public zzYIK(zzYM1 zzym1, zzYIJ zzyij) {
        this.zzWoB = zzym1;
        this.f50954cy = zzyij;
        this.f50955cz = new zzYLO(zzym1.zzP(zzyij.zzXyN()));
    }

    private static BigInteger zzZ(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2.abs());
        boolean zTestBit = bigIntegerMultiply.testBit(i - 1);
        BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(i);
        if (zTestBit) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(zzYM2.ONE);
        }
        return z ? bigIntegerShiftRight.negate() : bigIntegerShiftRight;
    }

    @Override // com.aspose.words.internal.zzYIL
    public final BigInteger[] zzC(BigInteger bigInteger) {
        int iZzXyG = this.f50954cy.zzXyG();
        BigInteger bigIntegerZzZ = zzZ(bigInteger, this.f50954cy.zzXyI(), iZzXyG);
        BigInteger bigIntegerZzZ2 = zzZ(bigInteger, this.f50954cy.zzXyH(), iZzXyG);
        zzYIJ zzyij = this.f50954cy;
        return new BigInteger[]{bigInteger.subtract(bigIntegerZzZ.multiply(zzyij.zzXyM()).add(bigIntegerZzZ2.multiply(zzyij.zzXyK()))), bigIntegerZzZ.multiply(zzyij.zzXyL()).add(bigIntegerZzZ2.multiply(zzyij.zzXyJ())).negate()};
    }

    @Override // com.aspose.words.internal.zzYIM
    public final zzYLW zzXyO() {
        return this.f50955cz;
    }
}
