package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYX6 extends Node implements zzZA1, zzZCT {
    private String mName;
    private String zzLu;
    private com.aspose.words.internal.zzZQ9 zzXWR;
    private int zzYG;
    private int zzZCI;
    private int zzZCz;

    public zzYX6(DocumentBase documentBase, int i, String str, String str2, com.aspose.words.internal.zzZQ9 zzzq9, int i2) {
        super(documentBase);
        this.zzYG = i;
        this.zzLu = str;
        this.mName = str2;
        this.zzXWR = zzzq9;
        this.zzZCI = i2;
    }

    public final String getAuthor() {
        return this.zzLu;
    }

    @Override // com.aspose.words.zzZCT
    public int getDisplacedByCustomXml() {
        return this.zzZCI;
    }

    public final int getFirstColumn() {
        return this.zzZCz & 127;
    }

    public final int getId() {
        return this.zzYG;
    }

    @Override // com.aspose.words.zzZA1
    public int getIdInternal() {
        return this.zzYG;
    }

    public final int getLastColumn() {
        return ((this.zzZCz & 32512) >> 8) - 1;
    }

    public final String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.zzZA1
    public int getParentIdInternal() {
        return -1;
    }

    public final boolean isColumn() {
        return (this.zzZCz & 32768) == 32768;
    }

    public final void setAuthor(String str) {
        this.zzLu = str;
    }

    @Override // com.aspose.words.zzZCT
    public void setDisplacedByCustomXml(int i) {
        this.zzZCI = i;
    }

    public final void setId(int i) {
        this.zzYG = i;
    }

    @Override // com.aspose.words.zzZA1
    public void setIdInternal(int i) {
        this.zzYG = i;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    @Override // com.aspose.words.zzZA1
    public void setParentIdInternal(int i) {
    }

    public final void zz9(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzXWR = zzzq9;
    }

    public final void zzOW(int i) {
        this.zzZCz = (((i + 1) & 127) << 8) | (this.zzZCz & (-32513)) | 32768;
    }

    public final void zzOX(int i) {
        this.zzZCz = (i & 127) | (this.zzZCz & (-128)) | 32768;
    }

    public final com.aspose.words.internal.zzZQ9 zzkT() {
        return this.zzXWR;
    }
}
