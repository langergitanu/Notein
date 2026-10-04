package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class XpsSaveOptions extends FixedPageSaveOptions {
    private boolean zzXEW;
    private OutlineOptions zzXF0;
    private int zzZCv;

    public XpsSaveOptions() {
        this(41);
    }

    private void zzGe(int i) {
        if (i != 41 && i != 46) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
        this.zzZCv = i;
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public final boolean getCreateOutlinesForHeadingsInTables() {
        return getOutlineOptions().getCreateOutlinesForHeadingsInTables();
    }

    public OutlineOptions getOutlineOptions() {
        return this.zzXF0;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return this.zzZCv;
    }

    public boolean getUseBookFoldPrintingSettings() {
        return this.zzXEW;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        zzGe(i);
    }

    public void setUseBookFoldPrintingSettings(boolean z) {
        this.zzXEW = z;
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public final boolean zzZ9d() {
        return true;
    }

    public final com.aspose.words.internal.zzZS7 zzZG(Document document) {
        com.aspose.words.internal.zzZS7 zzzs7 = new com.aspose.words.internal.zzZS7(document.zzZqx());
        zzzs7.zzZ(this.zzXF0.zzYqF());
        zzzs7.zzZ(getMetafileRenderingOptions().zzW(document, getOptimizeOutput()));
        zzzs7.zzZb(getSaveFormat() == 46);
        zzzs7.zzZ(new zzY21(document.getWarningCallback()));
        zzzs7.setJpegQuality(getJpegQuality());
        return zzzs7;
    }

    public XpsSaveOptions(int i) {
        this.zzXF0 = new OutlineOptions();
        zzGe(i);
    }
}
