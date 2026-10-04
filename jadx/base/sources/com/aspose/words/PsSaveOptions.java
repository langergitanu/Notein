package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class PsSaveOptions extends FixedPageSaveOptions {
    private boolean zzXEW;

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return 47;
    }

    public boolean getUseBookFoldPrintingSettings() {
        return this.zzXEW;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        if (i != 47) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public void setUseBookFoldPrintingSettings(boolean z) {
        this.zzXEW = z;
    }

    public final com.aspose.words.internal.zz02 zz3(Document document) {
        com.aspose.words.internal.zz02 zz02Var = new com.aspose.words.internal.zz02(document.zzZqx());
        zz02Var.zzb("Aspose.Words for Android via Java 24.3.0");
        zz02Var.zzZ(getMetafileRenderingOptions().zzW(document, getOptimizeOutput()));
        zz02Var.setJpegQuality(getJpegQuality());
        return zz02Var;
    }
}
