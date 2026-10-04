package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ28 {
    zzYSU zzWjs;

    private int getFieldSize() {
        return (this.zzWjs.zzXCs().zzXCt().getP().bitLength() + 7) / 8;
    }

    public final byte[] zzX(zzYV3 zzyv3) {
        zzYST zzyst = (zzYST) zzyv3;
        if (!this.zzWjs.zzXCs().zzXCt().equals(zzyst.zzXCq().zzXCt())) {
            throw new zzZ5E("DHU public key components have wrong domain parameters");
        }
        zzZ2D zzz2d = new zzZ2D();
        zzZ2D zzz2d2 = new zzZ2D();
        zzz2d.zzZ(this.zzWjs.zzXCs());
        BigInteger bigIntegerZzY = zzz2d.zzY(zzyst.zzXCq());
        zzz2d2.zzZ(this.zzWjs.zzXCr());
        return zzYGU.zzn(zzYGT.zzU(getFieldSize(), zzz2d2.zzY(zzyst.zzXCp())), zzYGT.zzU(getFieldSize(), bigIntegerZzY));
    }

    public final void zzZ(zzYV3 zzyv3) {
        this.zzWjs = (zzYSU) zzyv3;
    }
}
