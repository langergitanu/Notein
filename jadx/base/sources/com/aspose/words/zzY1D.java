package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1D extends zzYV5 {
    private zzY0P zzWVc;

    public zzY1D(int i, zzY0P zzy0p) {
        super(i, i == 1 ? zzy0p.zzZqS().zzXp6 : zzy0p.zzZqS().zzXp7, zzy0p);
        this.zzWVc = zzy0p;
    }

    @Override // com.aspose.words.zzYV5
    public final String zzEH(int i) {
        return zzY1K.zzhY(i);
    }

    @Override // com.aspose.words.zzYV5
    public final void zzZ(zzZMS zzzms) throws Exception {
        if (zzzms == null) {
            return;
        }
        zzYU6 zzyu6ZzZm2 = this.zzWVc.zzZm2();
        zzyu6ZzZm2.zzY(zzYyL() ? "w:endnote" : "w:footnote");
        zzyu6ZzZm2.zzA("w:type", zzY1K.zzYZ(zzzms.zzZ6S(), zzYyL()), "normal");
        zzzms.accept(this.zzWVc);
        zzyu6ZzZm2.zzp();
    }
}
