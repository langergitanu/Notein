package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYLS extends zzYM4 {

    /* JADX INFO: renamed from: ay */
    protected final zzYIL f51151ay;
    protected final zzYM1 zzWoB;

    public zzYLS(zzYM1 zzym1, zzYIL zzyil) {
        if (zzym1 == null || zzym1.getOrder() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.zzWoB = zzym1;
        this.f51151ay = zzyil;
    }

    @Override // com.aspose.words.internal.zzYM4
    public final zzYLX zzY(zzYLX zzylx, BigInteger bigInteger) {
        zzYM1 zzym1ZzXHv = zzylx.zzXHv();
        if (!this.zzWoB.zzV(zzym1ZzXHv)) {
            throw new IllegalStateException();
        }
        BigInteger order = zzym1ZzXHv.getOrder();
        if (bigInteger.compareTo(order) >= 0) {
            bigInteger = bigInteger.mod(order.multiply(zzym1ZzXHv.zzXzI()));
        }
        BigInteger[] bigIntegerArrZzC = this.f51151ay.zzC(bigInteger);
        return zzYM3.zzZ(zzylx, bigIntegerArrZzC[0], this.f51151ay.zzXyO(), bigIntegerArrZzC[1]);
    }
}
