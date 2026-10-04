package com.aspose.words.internal;

import com.aspose.words.internal.zzZ1H;
import com.aspose.words.internal.zzZ1Q;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ23<T extends zzZ1Q> extends zzZ1S<T> {
    private final T zzWjm;
    private final zzYV9 zzWjn;

    public zzZ23(zzYV9 zzyv9, T t) {
        this.zzWjn = zzyv9;
        this.zzWjm = t;
    }

    private static zzYSJ zzV(zzZ33 zzz33) {
        return zzz33 instanceof zzZ2W ? new zzYSF((zzZ2W) zzz33) : new zzYSJ(zzz33);
    }

    @Override // com.aspose.words.internal.zzZ5Y
    public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
        return this.zzWjm;
    }

    @Override // com.aspose.words.internal.zzZ5Y
    public final byte[] zzZ(zzZ5R zzz5r) {
        BigInteger bigIntegerZzY;
        zzZ3N zzz3n = (zzZ3N) zzz5r;
        zzYSD zzysd = new zzYSD(zzz3n.zzXGA(), zzV(zzz3n.zzXGy()));
        int fieldSize = this.zzWjn.getFieldSize();
        zzYV9 zzyv9 = this.zzWjn;
        if (zzyv9 instanceof zzZ1V) {
            zzZ3N zzz3nZzXFc = ((zzZ1H.zzL) this.zzWjm).zzXFc();
            bigIntegerZzY = this.zzWjn.zzY(new zzYSG(zzysd, new zzYSD(zzz3nZzXFc.zzXGA(), zzV(zzz3nZzXFc.zzXGy()))));
        } else {
            bigIntegerZzY = zzyv9.zzY(zzysd);
        }
        return zzZ1D.zzZ(zzYGT.zzU(fieldSize, bigIntegerZzY), this.zzWjm);
    }
}
