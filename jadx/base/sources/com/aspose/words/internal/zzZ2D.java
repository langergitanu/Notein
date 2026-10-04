package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2D implements zzYV9 {
    private zzYSX zzWjw;
    private zzYSW zzWjx;

    @Override // com.aspose.words.internal.zzYV9
    public final int getFieldSize() {
        return (this.zzWjx.zzXCt().getP().bitLength() + 7) / 8;
    }

    @Override // com.aspose.words.internal.zzYV9
    public final BigInteger zzY(zzYV3 zzyv3) {
        zzYSV zzysv = (zzYSV) zzyv3;
        zzYSX zzysxZzXCt = zzysv.zzXCt();
        if (zzysxZzXCt.getG().equals(this.zzWjw.getG()) && zzysxZzXCt.getP().equals(this.zzWjw.getP())) {
            return zzysv.getY().modPow(this.zzWjx.getX(), this.zzWjw.getP());
        }
        throw new zzZ5E("DH public key has wrong domain parameters");
    }

    public final void zzZ(zzYV3 zzyv3) {
        zzYSW zzysw = (zzYSW) zzyv3;
        this.zzWjx = zzysw;
        this.zzWjw = zzysw.zzXCt();
    }
}
