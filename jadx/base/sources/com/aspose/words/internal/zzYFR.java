package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYFR extends zzYFG {

    /* JADX INFO: renamed from: fg */
    final zzZQX f50797fg;

    public zzYFR(zzZQR zzzqr, zzZQX zzzqx) {
        super(zzYFQ.zz4(zzzqr));
        this.f50797fg = zzzqx;
    }

    @Override // com.aspose.words.internal.zzZQM, com.aspose.words.internal.zzZQR
    public final int next() throws zzZQS {
        int next;
        do {
            next = this.f50792fl.next();
            if (this.f50797fg.zzZ(this)) {
                break;
            }
        } while (next != 8);
        return next;
    }
}
