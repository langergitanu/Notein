package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7 implements zzZBJ {
    private zzZQM zzZCC;
    private String zzZCG;

    public zzY7(zzZQM zzzqm, String str) {
        this.zzZCC = zzzqm;
        this.zzZCG = str;
    }

    private Bookmark getBookmark() throws Exception {
        return zzZOO.zzT(this.zzZCC.getField(), this.zzZCG);
    }

    @Override // com.aspose.words.zzZBJ
    public final zzTL zzZ(zzTJ zztj) throws Exception {
        if (getBookmark() == null) {
            return zzZU3.zzMy(this.zzZCG);
        }
        String strZzYP = getBookmark().zzYP(true);
        zzZVZ zzzvzZzY = zzZSH.zzY(this.zzZCC, strZzYP, true);
        return zzzvzZzY != null ? zzzvzZzY : this.zzZCC.getField().getType() == 34 ? new zzZVZ(0.0d) : new zzY94(strZzYP);
    }
}
