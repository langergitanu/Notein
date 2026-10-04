package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1P extends zz1Y {
    private String zzRG;

    public zz1P(zz4W zz4w, String str) {
        super(zz4w, "/Span", "");
        this.zzRG = str;
    }

    @Override // com.aspose.words.internal.zz1Y
    public final void zzz(zzFY zzfy) throws Exception {
        if (!zzZYD.zzXk(this.zzRG) || zzZKN.equals(zzuN().zzvR(), this.zzRG)) {
            return;
        }
        zzfy.zzD("/Lang", this.zzRG);
    }
}
