package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1S extends zzYU6 {
    private IWarningCallback zzZG0;

    public zzY1S(com.aspose.words.internal.zzZOP zzzop, boolean z, IWarningCallback iWarningCallback) throws Exception {
        super(zzzop, new com.aspose.words.internal.zzZNI(false), z, true);
        this.zzZG0 = iWarningCallback;
    }

    @Override // com.aspose.words.zzYU6
    public final void zzW(Shading shading) {
        if (shading == null || shading.isInherited()) {
            return;
        }
        zzX("w:shd", "w:val", zzY8T.zzZ6(shading.getTexture(), false), "w:color", shading.zzYbJ(), "w:fill", shading.zzYbK());
    }

    @Override // com.aspose.words.zzYU6
    public final void zzX(zzZV8 zzzv8, int i) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            zzY1Z.zzZ(iWarningCallback, 65536, 13, "Table cell edit revisions are lost.");
        }
    }

    @Override // com.aspose.words.zzYU6
    public final void zzY(zzZV8 zzzv8, int i) {
        zzZ(i, zzzv8.getAuthor(), zzzv8.zzZx(), zzzv8.getType() == 0 ? "Word.Insertion" : "Word.Deletion");
        zzo();
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZ(String str, Border border) {
        zzX(str, "w:val", zzY1K.zzhX(border.getLineStyle()), "w:sz", Integer.valueOf(border.zz8L()), "wx:bdrwidth", Integer.valueOf(com.aspose.words.internal.zzSA.zzr(border.zz8S())), "w:space", Integer.valueOf(border.zz8K()), "w:color", border.zz8Q(), "w:shadow", zzYU6.zzSx(border.getShadow()), "w:frame", zzYU6.zzSx(border.zz8P()));
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZmP() {
        zzo();
        zzo();
    }

    @Override // com.aspose.words.zzYU6
    public final void zzY(zzYX5 zzyx5, int i) {
        if (zzyx5.getType() != 2) {
            zzZ(i, zzyx5.getAuthor(), zzyx5.zzZx(), zzyx5.getType() == 1 ? "Word.Insertion" : "Word.Deletion");
            zzo();
        }
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZ(zzZMK zzzmk, String str, int i) {
        zzZ(i, zzzmk.getAuthor(), zzzmk.zzZx(), "Word.Formatting");
        zzY("aml:content");
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZ(zzZV8 zzzv8, int i) {
        zzZ(i, zzzv8.getAuthor(), zzzv8.zzZx(), zzzv8.getType() == 0 ? "Word.Insertion" : "Word.Deletion");
        zzY("aml:content");
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZ(zzYX5 zzyx5, int i) {
        zzZ(i, zzyx5.getAuthor(), zzyx5.zzZx(), zzyx5.getType() == 1 ? "Word.Insertion" : "Word.Deletion");
        zzY("aml:content");
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZ(zzYTV zzytv, int i) {
        zzZ(i, zzytv.getAuthor(), zzytv.zzZx(), zzytv.zzYyr() ? "Word.Insertion" : "Word.Numbering");
        if (zzytv.zzYys()) {
            zzX("w:original", zzYU3.zzZ(zzytv));
        }
        zzo();
    }

    private void zzZ(int i, String str, com.aspose.words.internal.zzZQ9 zzzq9, String str2) {
        zzY("aml:annotation");
        zzZj("aml:id", i);
        zz0("aml:author", str);
        if (!com.aspose.words.internal.zzZQ9.zzZ(zzzq9, com.aspose.words.internal.zzZQ9.zz35)) {
            zz0("aml:createdate", com.aspose.words.internal.zzJB.zzR(zzzq9));
        }
        zz0("w:type", str2);
    }
}
