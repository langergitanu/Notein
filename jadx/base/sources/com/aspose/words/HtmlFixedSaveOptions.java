package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public class HtmlFixedSaveOptions extends FixedPageSaveOptions {
    private boolean zz75;
    private String zz76;
    private boolean zzYqx;
    private String zzYqy;
    private IResourceSavingCallback zzYqz;
    private boolean zzxk;
    private boolean zzxr;
    private boolean zzxs;
    private boolean zz78 = true;
    private int zzxo = 1;
    private double zzxn = 10.0d;
    private boolean zzxq = true;
    private int zzxp = 0;
    private String zzxm = "aw";
    private boolean zzrk = true;
    private com.aspose.words.internal.zzZO0 zzMW = new com.aspose.words.internal.zzZNI(true);
    private boolean zzxl = false;

    private void zzR(com.aspose.words.internal.zzZO0 zzzo0) {
        if (zzzo0 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzMW = zzzo0;
    }

    private static int zzzH(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
    }

    public String getCssClassNamesPrefix() {
        return this.zzxm;
    }

    public Charset getEncoding() {
        return com.aspose.words.internal.zzZO0.zzX(this.zzMW);
    }

    public boolean getExportEmbeddedCss() {
        return this.zzxr;
    }

    public boolean getExportEmbeddedFonts() {
        return this.zzxs;
    }

    public boolean getExportEmbeddedImages() {
        return this.zz75;
    }

    public boolean getExportEmbeddedSvg() {
        return this.zzxq;
    }

    public boolean getExportFormFields() {
        return this.zzYqx;
    }

    public int getFontFormat() {
        return this.zzxp;
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public boolean getOptimizeOutput() {
        return this.zzrk;
    }

    public int getPageHorizontalAlignment() {
        return this.zzxo;
    }

    public double getPageMargins() {
        return this.zzxn;
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

    public boolean getSaveFontFaceCssSeparately() {
        return this.zzxk;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return 45;
    }

    public boolean getShowPageBorder() {
        return this.zz78;
    }

    public boolean getUseTargetMachineFonts() {
        return this.zzxl;
    }

    public void setCssClassNamesPrefix(String str) {
        this.zzxm = str;
    }

    public void setEncoding(Charset charset) {
        zzR(com.aspose.words.internal.zzZO0.zzZ(charset));
    }

    public void setExportEmbeddedCss(boolean z) {
        this.zzxr = z;
    }

    public void setExportEmbeddedFonts(boolean z) {
        this.zzxs = z;
    }

    public void setExportEmbeddedImages(boolean z) {
        this.zz75 = z;
    }

    public void setExportEmbeddedSvg(boolean z) {
        this.zzxq = z;
    }

    public void setExportFormFields(boolean z) {
        this.zzYqx = z;
    }

    public void setFontFormat(int i) {
        this.zzxp = i;
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public void setOptimizeOutput(boolean z) {
        this.zzrk = z;
    }

    public void setPageHorizontalAlignment(int i) {
        this.zzxo = i;
    }

    public void setPageMargins(double d) {
        if (d < 0.0d) {
            throw new IllegalArgumentException("value");
        }
        this.zzxn = d;
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

    public void setSaveFontFaceCssSeparately(boolean z) {
        this.zzxk = z;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        if (i != 45) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public void setShowPageBorder(boolean z) {
        this.zz78 = z;
    }

    public void setUseTargetMachineFonts(boolean z) {
        this.zzxl = z;
    }

    public final com.aspose.words.internal.zzI6 zzq(Document document) {
        com.aspose.words.internal.zzI6 zzi6 = new com.aspose.words.internal.zzI6(document.zzZqx());
        zzi6.setPrettyFormat(super.getPrettyFormat());
        zzi6.setExportEmbeddedImages(this.zz75);
        zzi6.setExportEmbeddedFonts(this.zzxs);
        zzi6.setFontFormat(zzZUA.zzEq(this.zzxp));
        zzi6.setExportEmbeddedCss(this.zzxr);
        zzi6.setExportEmbeddedSvg(this.zzxq);
        zzi6.setJpegQuality(getJpegQuality());
        zzi6.setShowPageBorder(this.zz78);
        zzi6.setPageHorizontalAlignment(zzzH(this.zzxo));
        zzi6.setPageMargins(this.zzxn);
        zzi6.zzZ(getMetafileRenderingOptions().zzW(document, getOptimizeOutput()));
        zzi6.zzYZ(this.zzYqy);
        zzi6.setResourcesFolderAlias(this.zz76);
        zzi6.setCssClassNamesPrefix(com.aspose.words.internal.zzZKN.zzU(this.zzxm, FilenameUtils.EXTENSION_SEPARATOR));
        zzi6.zzZ(new zzY21(document.getWarningCallback()));
        zzi6.zzZ(new zzYJH(document, getResourceSavingCallback()));
        zzi6.zzZ(this.zzMW);
        zzi6.setUseTargetMachineFonts(this.zzxl);
        zzi6.setSaveFontFaceCssSeparately(this.zzxk);
        return zzi6;
    }
}
