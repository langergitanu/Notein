package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOZ extends zzZP6 {
    private zzZB2 zzYBi;
    private String zzZCG;

    public zzZOZ(Field field, String str, String str2) {
        this(field, str, str2 == null ? null : new zzZPI(new zzY94(str2)));
    }

    @Override // com.aspose.words.zzZP6
    public final void zzZhW() throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZCG) || this.zzYBi == null) {
            return;
        }
        Bookmark bookmarkZzT = zzZOO.zzT(getField(), this.zzZCG);
        if (bookmarkZzT != null) {
            bookmarkZzT.remove();
        }
        zzYWB zzywbZzZgF = this.zzYBi.zzZgF();
        if (zzywbZzZgF == null) {
            new zzY5R(getField(), this.zzYBi.zzZgh().zz8W(), false).zzZcx();
        } else {
            getField().zzZgP();
            getField().zzW4(true);
            zzYWJ.zzZ(zzywbZzZgF, getField().getEnd(), new zzZP9(zzywbZzZgF), (zzZA5) null, 7);
        }
        getField().getSeparator().zzYD(new BookmarkStart(getDocument(), this.zzZCG));
        getField().getEnd().zzYC(new BookmarkEnd(getDocument(), this.zzZCG));
    }

    public zzZOZ(Field field, String str, zzZB2 zzzb2) {
        super(field);
        this.zzZCG = str;
        this.zzYBi = zzzb2;
    }
}
