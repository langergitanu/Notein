package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYX9 extends Node implements zzZA1, zzZCT {
    private int zzYG;
    private int zzZCI;

    public zzYX9(DocumentBase documentBase, int i, int i2) {
        super(documentBase);
        this.zzYG = i;
        this.zzZCI = i2;
    }

    @Override // com.aspose.words.zzZCT
    public int getDisplacedByCustomXml() {
        return this.zzZCI;
    }

    public final int getId() {
        return this.zzYG;
    }

    @Override // com.aspose.words.zzZA1
    public int getIdInternal() {
        return this.zzYG;
    }

    @Override // com.aspose.words.zzZA1
    public int getParentIdInternal() {
        return -1;
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

    @Override // com.aspose.words.zzZA1
    public void setParentIdInternal(int i) {
    }

    public final int zz9d() {
        return this.zzZCI;
    }
}
