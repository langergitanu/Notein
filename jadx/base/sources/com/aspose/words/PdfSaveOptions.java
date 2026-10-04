package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class PdfSaveOptions extends FixedPageSaveOptions implements Cloneable {
    private boolean zzXEW;
    private boolean zzXEX;
    private boolean zzXEY;
    private boolean zzXEZ;
    private int zzXF1;
    private boolean zzXF4;
    private PdfEncryptionDetails zzXF5;
    private boolean zzXF6;
    private boolean zzXF7;
    private boolean zzXF8;
    private PdfDigitalSignatureDetails zzXF9;
    private boolean zzgK;
    private boolean zzgL;
    private boolean zzgM;
    private boolean zzgN;
    private boolean zzgT;
    private boolean zzh0;
    private com.aspose.words.internal.zz51 zzh4 = new com.aspose.words.internal.zz51();
    private int zzh2 = 1;
    private int zzgZ = 0;
    private int zzXF3 = 0;
    private int zzXF2 = 0;
    private int zzC = 0;
    private OutlineOptions zzXF0 = new OutlineOptions();
    private DownsampleOptions zzXEV = new DownsampleOptions();
    private int zzgP = 0;
    private int zzgQ = 1;
    private int zzgO = 0;
    private int zzXEU = 2;
    private boolean zzgJ = true;

    public PdfSaveOptions() {
        setJpegQuality(100);
    }

    public PdfSaveOptions deepClone() {
        return (PdfSaveOptions) memberwiseClone();
    }

    public boolean getAdditionalTextPositioning() {
        return this.zzgL;
    }

    public boolean getCacheBackgroundGraphics() {
        return this.zzgJ;
    }

    public int getCompliance() {
        return zzYM0.zzqd(this.zzh4.getCompliance());
    }

    public boolean getCreateNoteHyperlinks() {
        return this.zzXF6;
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public final boolean getCreateOutlinesForHeadingsInTables() {
        return getOutlineOptions().getCreateOutlinesForHeadingsInTables();
    }

    public int getCustomPropertiesExport() {
        return this.zzXF3;
    }

    public PdfDigitalSignatureDetails getDigitalSignatureDetails() {
        return this.zzXF9;
    }

    public boolean getDisplayDocTitle() {
        return this.zzgM;
    }

    @Override // com.aspose.words.SaveOptions
    public int getDmlEffectsRenderingMode() {
        if (this.zzh4.zzvH()) {
            return super.getDmlEffectsRenderingMode();
        }
        return 1;
    }

    public DownsampleOptions getDownsampleOptions() {
        return this.zzXEV;
    }

    public boolean getEmbedAttachments() {
        return this.zzXF8;
    }

    public boolean getEmbedFullFonts() {
        return this.zzh0;
    }

    public PdfEncryptionDetails getEncryptionDetails() {
        return this.zzXF5;
    }

    public boolean getExportDocumentStructure() {
        return this.zzXEZ;
    }

    public boolean getExportLanguageToSpanTag() {
        return this.zzXEY;
    }

    public boolean getExportParagraphGraphicsToArtifact() {
        return this.zzXEX;
    }

    public int getFontEmbeddingMode() {
        return this.zzgZ;
    }

    public int getHeaderFooterBookmarksExportMode() {
        return this.zzXEU;
    }

    public int getImageColorSpaceExportMode() {
        return this.zzgO;
    }

    public int getImageCompression() {
        return this.zzC;
    }

    public boolean getInterpolateImages() {
        return this.zzgK;
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public int getJpegQuality() {
        return super.getJpegQuality();
    }

    public boolean getOpenHyperlinksInNewWindow() {
        return this.zzgT;
    }

    public OutlineOptions getOutlineOptions() {
        return this.zzXF0;
    }

    public int getPageLayout() {
        return this.zzgP;
    }

    public int getPageMode() {
        return this.zzgQ;
    }

    public boolean getPreblendImages() {
        return this.zzgN;
    }

    public boolean getPreserveFormFields() {
        return this.zzXF7;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return 40;
    }

    public int getTextCompression() {
        return this.zzh2;
    }

    public boolean getUseBookFoldPrintingSettings() {
        return this.zzXEW;
    }

    public boolean getUseCoreFonts() {
        return this.zzXF4;
    }

    public int getZoomBehavior() {
        return this.zzXF2;
    }

    public int getZoomFactor() {
        return this.zzXF1;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setAdditionalTextPositioning(boolean z) {
        this.zzgL = z;
    }

    public void setCacheBackgroundGraphics(boolean z) {
        this.zzgJ = z;
    }

    public void setCompliance(int i) {
        this.zzh4.setCompliance(zzYM0.zzqe(i));
    }

    public void setCreateNoteHyperlinks(boolean z) {
        this.zzXF6 = z;
    }

    public void setCustomPropertiesExport(int i) {
        this.zzXF3 = i;
    }

    public void setDigitalSignatureDetails(PdfDigitalSignatureDetails pdfDigitalSignatureDetails) {
        this.zzXF9 = pdfDigitalSignatureDetails;
    }

    public void setDisplayDocTitle(boolean z) {
        this.zzgM = z;
    }

    @Override // com.aspose.words.SaveOptions
    public void setDmlEffectsRenderingMode(int i) {
        super.setDmlEffectsRenderingMode(i);
    }

    public void setDownsampleOptions(DownsampleOptions downsampleOptions) {
        if (downsampleOptions == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzXEV = downsampleOptions;
    }

    public void setEmbedAttachments(boolean z) {
        this.zzXF8 = z;
    }

    public void setEmbedFullFonts(boolean z) {
        this.zzh0 = z;
    }

    public void setEncryptionDetails(PdfEncryptionDetails pdfEncryptionDetails) {
        this.zzXF5 = pdfEncryptionDetails;
    }

    public void setExportDocumentStructure(boolean z) {
        this.zzXEZ = z;
    }

    public void setExportLanguageToSpanTag(boolean z) {
        this.zzXEY = z;
    }

    public void setExportParagraphGraphicsToArtifact(boolean z) {
        this.zzXEX = z;
    }

    public void setFontEmbeddingMode(int i) {
        this.zzgZ = i;
    }

    public void setHeaderFooterBookmarksExportMode(int i) {
        this.zzXEU = i;
    }

    public void setImageColorSpaceExportMode(int i) {
        this.zzgO = i;
    }

    public void setImageCompression(int i) {
        this.zzC = i;
    }

    public void setInterpolateImages(boolean z) {
        this.zzgK = z;
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public void setJpegQuality(int i) {
        super.setJpegQuality(i);
    }

    public void setOpenHyperlinksInNewWindow(boolean z) {
        this.zzgT = z;
    }

    public void setPageLayout(int i) {
        this.zzgP = i;
    }

    public void setPageMode(int i) {
        this.zzgQ = i;
    }

    public void setPreblendImages(boolean z) {
        this.zzgN = z;
    }

    public void setPreserveFormFields(boolean z) {
        this.zzXF7 = z;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        if (i != 40) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public void setTextCompression(int i) {
        this.zzh2 = i;
    }

    public void setUseBookFoldPrintingSettings(boolean z) {
        this.zzXEW = z;
    }

    public void setUseCoreFonts(boolean z) {
        this.zzXF4 = z;
    }

    public void setZoomBehavior(int i) {
        this.zzXF2 = i;
    }

    public void setZoomFactor(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzXF1 = i;
    }

    public final com.aspose.words.internal.zz2R zz5(Document document) {
        com.aspose.words.internal.zz2R zz2r = new com.aspose.words.internal.zz2R(document.zzZqx());
        zz2r.zzZ(getOutlineOptions().zzYqF());
        zz2r.setTextCompression(zzYM0.zzqf(this.zzh2));
        zz2r.zzY(this.zzh4);
        zz2r.setJpegQuality(getJpegQuality());
        zz2r.zzZ(getDownsampleOptions().zzZjZ());
        zz2r.setEmbedFullFonts(this.zzh0);
        zz2r.setFontEmbeddingMode(zzYM0.zzq9(this.zzgZ));
        zz2r.setUseCoreFonts(this.zzXF4);
        zz2r.setCustomPropertiesExport(zzYM0.zzq6(getCustomPropertiesExport()));
        zz2r.zzZ(getMetafileRenderingOptions().zzW(document, getOptimizeOutput()));
        zz2r.setOpenHyperlinksInNewWindow(this.zzgT);
        zz2r.setPageMode(zzYM0.zzq7(getPageMode()));
        zz2r.setPageLayout(zzYM0.zzq8(getPageLayout()));
        zz2r.zzZF(zzYnx());
        zz2r.setImageColorSpaceExportMode(zzYM0.zzq5(getImageColorSpaceExportMode()));
        zz2r.setPreblendImages(this.zzgN);
        zz2r.setDisplayDocTitle(this.zzgM);
        zz2r.setAdditionalTextPositioning(this.zzgL);
        zz2r.setInterpolateImages(this.zzgK);
        zz2r.setCacheBackgroundGraphics(this.zzgJ);
        zz2r.setOptimizeOutput(getOptimizeOutput());
        PdfEncryptionDetails pdfEncryptionDetails = this.zzXF5;
        if (pdfEncryptionDetails != null) {
            zz2r.zzZ(pdfEncryptionDetails.zzYnz());
        }
        PdfDigitalSignatureDetails pdfDigitalSignatureDetails = this.zzXF9;
        if (pdfDigitalSignatureDetails != null) {
            zz2r.zzZ(pdfDigitalSignatureDetails.zzYnB());
        }
        if (getZoomBehavior() != 0) {
            zz2r.zztz();
            zz2r.zzTM(zzYM0.zzqb(this.zzXF2));
            zz2r.zzZY(getZoomFactor() / 100.0f);
        }
        zz2r.setImageCompression(zzYM0.zzqa(getImageCompression()));
        zz2r.zzZ(new zzY21(document.getWarningCallback()));
        return zz2r;
    }

    public final boolean zzYnw() {
        return this.zzh4.zzvB() && getEncryptionDetails() == null && getEmbedAttachments();
    }

    public final boolean zzYnx() {
        return this.zzh4.zzvE() || this.zzXEZ;
    }

    public final boolean zzYny() {
        return this.zzh4.zzvD() && getPreserveFormFields();
    }

    @Override // com.aspose.words.FixedPageSaveOptions
    public final boolean zzZ9d() {
        return true;
    }
}
