package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class XamlFixedSaveOptions extends FixedPageSaveOptions {
    private String zz76;
    private String zzYqy;
    private IResourceSavingCallback zzYqz;

    public IResourceSavingCallback getResourceSavingCallback() {
        return this.zzYqz;
    }

    public String getResourcesFolder() {
        return this.zzYqy;
    }

    public String getResourcesFolderAlias() {
        return this.zz76;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return 42;
    }

    public void setResourceSavingCallback(IResourceSavingCallback iResourceSavingCallback) {
        this.zzYqz = iResourceSavingCallback;
    }

    public void setResourcesFolder(String str) {
        this.zzYqy = str;
    }

    public void setResourcesFolderAlias(String str) {
        this.zz76 = str;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        if (i != 42) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public final com.aspose.words.internal.zzZSY zzZ(Document document, com.aspose.words.internal.zzQR zzqr) {
        com.aspose.words.internal.zzZSY zzzsy = new com.aspose.words.internal.zzZSY(document.zzZqx());
        zzzsy.zzZ(getMetafileRenderingOptions().zzW(document, getOptimizeOutput()));
        zzzsy.zzYZ(this.zzYqy);
        zzzsy.setResourcesFolderAlias(this.zz76);
        zzzsy.setJpegQuality(getJpegQuality());
        zzzsy.zzZ(new zzY21(document.getWarningCallback()));
        zzzsy.zzZ(new zzYJH(document, getResourceSavingCallback()));
        zzzsy.zzb(getExportGeneratorName() ? zzqr.zzQG() : null);
        return zzzsy;
    }
}
