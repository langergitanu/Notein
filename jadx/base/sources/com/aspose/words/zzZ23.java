package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ23 {
    private zzY4T zzY40 = new zzY4T();
    private zzZ25 zzY41;
    private boolean zzY42;

    public zzZ23(FieldStart fieldStart, zzZ1M zzz1m) {
        com.aspose.words.internal.zzZ4.zzY((Object) fieldStart, "FieldStart");
        this.zzY41 = new zzZ25(this.zzY40, (zzZAM) fieldStart.zz9(21, 20), zzz1m);
    }

    private void zzID(String str) {
        if (str == null) {
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!com.aspose.words.internal.zzZKU.zzG(cCharAt)) {
                this.zzY41.zzYIK();
            }
            this.zzY40.zzXUQ().append(com.aspose.words.internal.zzJF.zzF(cCharAt));
        }
    }

    public static zzZ23 zzZ(FieldStart fieldStart, zzZ1W zzz1w, zzZ1M zzz1m) {
        int fieldType = fieldStart.getFieldType();
        return (fieldType == 3 || fieldType == 88) ? new zzZ20(fieldStart, zzz1w, zzz1m) : new zzZ23(fieldStart, zzz1m);
    }

    public String getText() {
        return this.zzY40.zzXUQ().toString();
    }

    public final void zzIC(String str) {
        com.aspose.words.internal.zzZNH.zzU(this.zzY40.zzXUQ(), str);
    }

    public void zzQ(Run run) {
        String strZzr = zzY4E.zzr(run);
        this.zzY41.zzR(run);
        zzID(strZzr);
    }

    public final String zzT(FieldEnd fieldEnd) {
        zzQ(fieldEnd);
        return getText();
    }

    public final boolean zzYIx() {
        return this.zzY42;
    }

    public final StringBuilder zzYIy() {
        return this.zzY40.zzXUQ();
    }

    public final String zzYIz() {
        String strZzT = zzT((FieldEnd) null);
        this.zzY40.zzXUQ().setLength(0);
        return strZzT;
    }

    public final void zzT(FieldSeparator fieldSeparator) {
        this.zzY42 = true;
        zzQ(fieldSeparator);
        this.zzY40.clear();
    }

    private void zzQ(FieldChar fieldChar) {
        this.zzY41.zzR(fieldChar == null ? null : (zzZAM) fieldChar.zza(21, 20));
    }
}
