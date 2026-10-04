package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHL extends zzZII {
    private int zzZr3;

    public zzZHL(int i) {
        this.zzZr3 = i;
    }

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZmt, (byte) 0));
        if (this.zzZr3 == 2) {
            zzpr.zzV(new zzM3("margin-bottom", new zzOI(1.0d, 7), (byte) 0));
        }
    }
}
