package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class SvgSaveOptions extends FixedPageSaveOptions {
    private boolean zz75;
    private String zz76;
    private String zzYqy;
    private IResourceSavingCallback zzYqz;
    private boolean zzbG;
    private boolean zz78 = true;
    private int zzbE = 1;

    private static int zzku(int i) {
        if (i != 0) {
            return i != 2 ? 1 : 2;
        }
        return 0;
    }

    public boolean getExportEmbeddedImages() {
        return this.zz75;
    }

    public boolean getFitToViewPort() {
        return this.zzbG;
    }

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
        return 44;
    }

    public boolean getShowPageBorder() {
        return this.zz78;
    }

    public int getTextOutputMode() {
        return this.zzbE;
    }

    public void setExportEmbeddedImages(boolean z) {
        this.zz75 = z;
    }

    public void setFitToViewPort(boolean z) {
        this.zzbG = z;
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
        if (i != 44) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public void setShowPageBorder(boolean z) {
        this.zz78 = z;
    }

    public void setTextOutputMode(int i) {
        this.zzbE = i;
    }

    public final com.aspose.words.internal.zzZY5 zzZW(Document document) {
        com.aspose.words.internal.zzZY5 zzzy5 = new com.aspose.words.internal.zzZY5(document.zzZqx());
        zzzy5.setPrettyFormat(super.getPrettyFormat());
        zzzy5.setExportEmbeddedImages(this.zz75);
        zzzy5.setJpegQuality(getJpegQuality());
        zzzy5.setShowPageBorder(this.zz78);
        zzzy5.zzZ(getMetafileRenderingOptions().zzW(document, getOptimizeOutput()));
        zzzy5.zzYZ(this.zzYqy);
        zzzy5.setResourcesFolderAlias(this.zz76);
        zzzy5.zzZ(new zzY21(document.getWarningCallback()));
        zzzy5.zzZ(new zzYJH(document, getResourceSavingCallback()));
        zzzy5.setTextOutputMode(zzku(this.zzbE));
        zzzy5.setFitToViewPort(this.zzbG);
        zzzy5.zzqU();
        return zzzy5;
    }
}
