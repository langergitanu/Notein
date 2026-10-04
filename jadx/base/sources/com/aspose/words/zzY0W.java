package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0W extends zzYUN {
    public zzY0W(zzYUE zzyue, zzY0Y zzy0y, zzY13 zzy13, zzY1G zzy1g, zzYV7 zzyv7, zzY1C zzy1c, zzZ9X zzz9x) {
        super(zzyue, zzy0y, zzy13, zzy1g, zzyv7, zzy1c, zzz9x);
    }

    @Override // com.aspose.words.zzYUN
    public final void zzI(zzYVB zzyvb) throws Exception {
        zzY0Q.zzY(zzyvb);
    }

    @Override // com.aspose.words.zzYUN
    public final Comment zzU(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        return zzY1U.zzY(zzyef, zzyvb);
    }

    @Override // com.aspose.words.zzYUN
    public final boolean zzZ(String str, zzYVB zzyvb, zzYEF zzyef) {
        return false;
    }

    @Override // com.aspose.words.zzYUN
    public final Footnote zzZ(zzYVB zzyvb, int i, int i2, zzYEF zzyef) throws Exception {
        Footnote footnote = new Footnote(zzyvb.getDocument(), i2, true, null, zzyef);
        zzY11.zzXSx();
        zzyvb.zzQ(footnote);
        return footnote;
    }
}
