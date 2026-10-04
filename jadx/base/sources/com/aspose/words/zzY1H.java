package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1H extends zzYV9 {
    private zzY0V zzWVb;
    private zzY0P zzWVc;
    private zzYU6 zzXSu;

    public zzY1H(zzY0P zzy0p, zzY0V zzy0v) {
        this.zzWVc = zzy0p;
        this.zzWVb = zzy0v;
        this.zzXSu = zzy0p.zzZm2();
    }

    private void zzn(FieldChar fieldChar) throws Exception {
        Field field = fieldChar.getField();
        if (zzZKO.zzAd(fieldChar.getFieldType()) && zzZKO.zzc(field)) {
            com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(new com.aspose.words.internal.zzZOR());
            zzZKO.zzZ(zzzow, field);
            this.zzXSu.zzY("w:fldData");
            this.zzXSu.zzX(zzzow.zzq());
            this.zzXSu.zzp();
        }
    }

    private void zzo(FieldChar fieldChar) throws Exception {
        FormField formFieldZzZcg;
        if (fieldChar.getNodeType() == 22 && zzZOO.zzCJ(fieldChar.getFieldType()) && (formFieldZzZcg = ((FieldStart) fieldChar).zzZcg()) != null && formFieldZzZcg.getField() != null) {
            this.zzXSu.zzY("w:fldData");
            this.zzXSu.zzX(zzZRB.zzZ(formFieldZzZcg));
            this.zzXSu.zzp();
        }
    }

    @Override // com.aspose.words.zzYV9
    public final void zzZ(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.zzXSu.zzY("w:hlink");
        this.zzXSu.zz0("w:dest", str);
        this.zzXSu.zz0("w:bookmark", str2);
        this.zzXSu.zz0("w:target", str3);
        this.zzXSu.zz0("w:screenTip", str4);
    }

    @Override // com.aspose.words.zzYV9
    public final void zzZlN() {
        this.zzWVc.zzZm2().zzo();
    }

    @Override // com.aspose.words.zzYV9
    public final void zzZ(FieldChar fieldChar, String str) throws Exception {
        this.zzWVc.zzm(fieldChar.zzZYh());
        this.zzWVb.zzZ(fieldChar.zzZYh(), fieldChar);
        this.zzXSu.zzW("w:fldChar", "w:fldCharType", str);
        if (fieldChar.getNodeType() == 22) {
            this.zzXSu.zzw("w:dirty", fieldChar.isDirty());
            this.zzXSu.zzw("w:fldLock", fieldChar.isLocked());
            zzn(fieldChar);
        }
        zzo(fieldChar);
        this.zzXSu.zzp();
        this.zzWVb.zzT(fieldChar.zzZYh());
        this.zzWVc.zzl(fieldChar.zzZYh());
    }
}
