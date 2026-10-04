package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJW extends zzZII {
    private zzPS zzYt5;

    public zzZJW(boolean z) {
        zzPR zzpr = new zzPR();
        zzpr.zzY(new zzM3("display", zzL4.zzZmt, (byte) 0));
        if (z) {
            zzOI zzoi = new zzOI(36.0d, 4);
            zzpr.zzY(new zzM3("margin-left", zzoi, (byte) 0));
            zzpr.zzY(new zzM3("margin-right", zzoi, (byte) 0));
            zzOI zzoi2 = new zzOI(5.0d, 4);
            zzpr.zzY(new zzM3("margin-top", zzoi2, (byte) 0));
            zzpr.zzY(new zzM3("margin-bottom", zzoi2, (byte) 0));
        } else {
            zzOI zzoi3 = new zzOI(40.0d, 6);
            zzpr.zzY(new zzM3("margin-left", zzoi3, (byte) 0));
            zzpr.zzY(new zzM3("margin-right", zzoi3, (byte) 0));
        }
        this.zzYt5 = zzpr.zzZWe();
    }

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzO(this.zzYt5);
    }
}
