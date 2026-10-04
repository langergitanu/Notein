package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ1Z {
    zzYSL zzWjj;

    private int getFieldSize() {
        return (this.zzWjj.zzXCl().zzXCg().zzXHv().getFieldSize() + 7) / 8;
    }

    public final byte[] zzX(zzYV3 zzyv3) {
        zzYSK zzysk = (zzYSK) zzyv3;
        zzZ20 zzz20 = new zzZ20();
        zzZ20 zzz202 = new zzZ20();
        zzz20.zzZ(this.zzWjj.zzXCl());
        BigInteger bigIntegerZzY = zzz20.zzY(zzysk.zzXCj());
        zzz202.zzZ(this.zzWjj.zzXCk());
        return zzYGU.zzn(zzYGT.zzU(getFieldSize(), zzz202.zzY(zzysk.zzXCi())), zzYGT.zzU(getFieldSize(), bigIntegerZzY));
    }

    public final void zzZ(zzYV3 zzyv3) {
        this.zzWjj = (zzYSL) zzyv3;
    }
}
