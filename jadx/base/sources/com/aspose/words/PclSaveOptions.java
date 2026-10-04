package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class PclSaveOptions extends FixedPageSaveOptions {
    private boolean zzl5 = true;
    private com.aspose.words.internal.zzZYF zzl4 = new com.aspose.words.internal.zzZYF();
    private String zzl3 = "Arial";

    public void addPrinterFont(String str, String str2) {
        this.zzl4.set(str, str2);
    }

    public String getFallbackFontName() {
        return this.zzl3;
    }

    public boolean getRasterizeTransformedElements() {
        return this.zzl5;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return 48;
    }

    public void setFallbackFontName(String str) {
        this.zzl3 = str;
    }

    public void setRasterizeTransformedElements(boolean z) {
        this.zzl5 = z;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        if (i != 48) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public final com.aspose.words.internal.zz62 zz6(Document document) {
        com.aspose.words.internal.zz62 zz62Var = new com.aspose.words.internal.zz62(document.zzZqx());
        zz62Var.zzZ(getMetafileRenderingOptions().zzW(document, getOptimizeOutput()));
        zz62Var.setRasterizeTransformedElements(getRasterizeTransformedElements());
        zz62Var.zzY(this.zzl4);
        zz62Var.setFallbackFontName(this.zzl3);
        return zz62Var;
    }
}
