package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYO2 implements zzZBL {
    private String mName;
    private com.aspose.words.internal.zzZOP zzN5;
    private com.aspose.words.internal.zzZOZ zzOF;
    private int zzYG;
    private String zzZR;
    private String zzmN;

    public zzYO2(com.aspose.words.internal.zzZOP zzzop, String str, String str2, com.aspose.words.internal.zzZOZ zzzoz) {
        this(zzzop, str, "");
        this.mName = str2;
        this.zzOF = zzzoz;
    }

    @Override // com.aspose.words.zzZBL
    public String getClsidInternal() {
        return this.zzOF.toString();
    }

    public final String getContentType() {
        return this.zzZR;
    }

    @Override // com.aspose.words.zzZBL
    public String getExtensionForUser(String str) {
        return zzZXP.zzNs(this.zzZR);
    }

    @Override // com.aspose.words.zzZBL
    public String getFileNameForUser() throws Exception {
        return com.aspose.words.internal.zzZOQ.zzVg(this.zzmN);
    }

    @Override // com.aspose.words.zzZBL
    public int getId() {
        return this.zzYG;
    }

    @Override // com.aspose.words.zzZBL
    public String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.zzZBL
    public zzYOC getOleObject() {
        return null;
    }

    @Override // com.aspose.words.zzZBL
    public boolean isForms2OleControlInternal() {
        return OleControl.zzDf(getClsidInternal());
    }

    @Override // com.aspose.words.zzZBL
    public void saveForUser(com.aspose.words.internal.zzZOP zzzop, zzZ9A zzz9a) throws Exception {
        if (((Boolean) zzz9a.fetchShapeAttr(826)).booleanValue() && ("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(this.zzZR) || "application/vnd.ms-excel.sheet.macroEnabled.12".equals(this.zzZR) || "application/vnd.openxmlformats-officedocument.spreadsheetml.template".equals(this.zzZR) || "application/vnd.ms-excel.template.macroEnabled.12".equals(this.zzZR))) {
            zzYO6.zzT(this.zzN5, zzzop);
        } else {
            this.zzN5.zzH(0L);
            com.aspose.words.internal.zzZYQ.zzX(this.zzN5, zzzop);
        }
    }

    @Override // com.aspose.words.zzZBL
    public void setId(int i) {
        this.zzYG = i;
    }

    public final com.aspose.words.internal.zzZOP zzR1() {
        return this.zzN5;
    }

    public zzYO2(com.aspose.words.internal.zzZOP zzzop, String str, String str2) {
        this.zzmN = "";
        this.zzYG = zzY41.zzXUb();
        this.zzN5 = zzzop;
        this.zzZR = str;
        this.zzOF = com.aspose.words.internal.zzZOZ.zzZXP;
        this.zzmN = str2;
    }
}
