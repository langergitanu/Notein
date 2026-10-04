package com.aspose.words.internal;

import com.aspose.words.internal.zzZ1H;
import com.aspose.words.internal.zzZ1Q;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ22<T extends zzZ1Q> extends zzZ1S<T> {
    private final zzZ1Z zzWjl;
    private final T zzWjm;

    public zzZ22(zzZ1Z zzz1z, T t) {
        this.zzWjl = zzz1z;
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
        zzZ3N zzz3n = (zzZ3N) zzz5r;
        zzYSD zzysd = new zzYSD(zzz3n.zzXGA(), zzV(zzz3n.zzXGy()));
        zzZ3N zzz3nZzXFc = ((zzZ1H.zzW) this.zzWjm).zzXFc();
        return zzZ1D.zzZ(this.zzWjl.zzX(new zzYSK(zzysd, new zzYSD(zzz3nZzXFc.zzXGA(), zzV(zzz3nZzXFc.zzXGy())))), this.zzWjm);
    }
}
