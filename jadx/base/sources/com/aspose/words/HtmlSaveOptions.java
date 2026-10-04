package com.aspose.words;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public class HtmlSaveOptions extends SaveOptions implements Cloneable {
    private com.aspose.words.internal.zzZO0 zzMW;
    private boolean zzYlS;
    private boolean zzYlT;
    private boolean zzYlU;
    private String zzYlV;
    private int zzYlW;
    private boolean zzYlX;
    private boolean zzYlY;
    private IDocumentPartSavingCallback zzYlZ;
    private IFontSavingCallback zzYm0;
    private int zzYm1;
    private String zzYm2;
    private String zzYm3;
    private int zzYm4;
    private boolean zzYm5;
    private boolean zzYm6;
    private int zzYm7;
    private boolean zzYm8;
    private boolean zzYm9;
    private int zzYma;
    private int zzYmb;
    private int zzYmc;
    private boolean zzYmd;
    private boolean zzYme;
    private boolean zzYmf;
    private boolean zzYmg;
    private int zzYmh;
    private boolean zzYmi;
    private boolean zzYmj;
    private ICssSavingCallback zzYmk;
    private String zzYml;
    private String zzYmm;
    private String zzYmn;
    private String zzYmo;
    private String zzYmp;
    private boolean zzYmq;
    private zzYE0 zzYmr;
    private boolean zzYpA;
    private boolean zzYpB;
    private boolean zzYqk;
    private int zzYrl;
    private int zzYrm;
    private boolean zzYt6;
    private int zzZCv;
    private String zzxm;

    public HtmlSaveOptions() {
        this(50);
    }

    private void zzGe(int i) {
        switch (i) {
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                this.zzZCv = i;
                return;
            default:
                throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public static HtmlSaveOptions zzYZg() {
        HtmlSaveOptions htmlSaveOptions = new HtmlSaveOptions();
        htmlSaveOptions.setExportImagesAsBase64(true);
        htmlSaveOptions.setCssStyleSheetType(0);
        htmlSaveOptions.setExportFontResources(false);
        htmlSaveOptions.setExportRoundtripInformation(false);
        return htmlSaveOptions;
    }

    public boolean getAllowNegativeIndent() {
        return this.zzYmg;
    }

    public String getCssClassNamePrefix() {
        return this.zzxm;
    }

    public ICssSavingCallback getCssSavingCallback() {
        return this.zzYmk;
    }

    public String getCssStyleSheetFileName() {
        return this.zzYml;
    }

    public int getCssStyleSheetType() {
        return this.zzYmc;
    }

    public IDocumentPartSavingCallback getDocumentPartSavingCallback() {
        return this.zzYlZ;
    }

    public int getDocumentSplitCriteria() {
        return this.zzYrm;
    }

    public int getDocumentSplitHeadingLevel() {
        return this.zzYrl;
    }

    public Charset getEncoding() {
        return com.aspose.words.internal.zzZO0.zzX(this.zzMW);
    }

    public boolean getExportCidUrlsForMhtmlResources() {
        return this.zzYmd;
    }

    public boolean getExportDocumentProperties() {
        return this.zzYmf;
    }

    public boolean getExportDropDownFormFieldAsText() {
        return this.zzYmi;
    }

    public boolean getExportFontResources() {
        return this.zzYm5;
    }

    public boolean getExportFontsAsBase64() {
        return this.zzYlS;
    }

    public int getExportHeadersFootersMode() {
        return this.zzYmh;
    }

    public boolean getExportImagesAsBase64() {
        return this.zzYmr.zzXpg;
    }

    public boolean getExportLanguageInformation() {
        return this.zzYpA;
    }

    public int getExportListLabels() {
        return this.zzYm1;
    }

    public boolean getExportOriginalUrlForLinkedImages() {
        return this.zzYme;
    }

    public boolean getExportPageMargins() {
        return this.zzYlT;
    }

    public boolean getExportPageSetup() {
        return this.zzYm9;
    }

    public boolean getExportRelativeFontSize() {
        return this.zzYm6;
    }

    public boolean getExportRoundtripInformation() {
        return this.zzYt6;
    }

    public boolean getExportShapesAsSvg() {
        return this.zzYmr.zzXpc;
    }

    public boolean getExportTextInputFormFieldAsText() {
        return this.zzYmj;
    }

    public boolean getExportTocPageNumbers() {
        return this.zzYlY;
    }

    public boolean getExportXhtmlTransitional() {
        return this.zzYm8;
    }

    public int getFontResourcesSubsettingSizeThreshold() {
        return this.zzYm4;
    }

    public IFontSavingCallback getFontSavingCallback() {
        return this.zzYm0;
    }

    public String getFontsFolder() {
        return this.zzYm3;
    }

    public String getFontsFolderAlias() {
        return this.zzYm2;
    }

    public int getHtmlVersion() {
        return this.zzYm7;
    }

    public int getImageResolution() {
        return this.zzYmr.zzXph;
    }

    public IImageSavingCallback getImageSavingCallback() {
        return this.zzYmr.zzXpf;
    }

    public String getImagesFolder() {
        return this.zzYmn;
    }

    public String getImagesFolderAlias() {
        return this.zzYmm;
    }

    public int getMetafileFormat() {
        return this.zzYmr.zzXpj;
    }

    public int getNavigationMapLevel() {
        return this.zzYlW;
    }

    public int getOfficeMathOutputMode() {
        return this.zzYma;
    }

    public boolean getResolveFontNames() {
        return this.zzYqk;
    }

    public String getResourceFolder() {
        return this.zzYmp;
    }

    public String getResourceFolderAlias() {
        return this.zzYmo;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return this.zzZCv;
    }

    public boolean getScaleImageToShapeSize() {
        return this.zzYmr.zzXpi;
    }

    public int getTableWidthOutputMode() {
        return this.zzYmb;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setAllowNegativeIndent(boolean z) {
        this.zzYmg = z;
    }

    public void setCssClassNamePrefix(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str) && !com.aspose.words.internal.zzS0.zzk(str)) {
            throw new IllegalArgumentException("The class name prefix must be a valid CSS identifier.");
        }
        this.zzxm = str;
    }

    public void setCssSavingCallback(ICssSavingCallback iCssSavingCallback) {
        this.zzYmk = iCssSavingCallback;
    }

    public void setCssStyleSheetFileName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "CssStyleSheetFileName");
        this.zzYml = str;
    }

    public void setCssStyleSheetType(int i) {
        this.zzYmc = i;
    }

    public void setDocumentPartSavingCallback(IDocumentPartSavingCallback iDocumentPartSavingCallback) {
        this.zzYlZ = iDocumentPartSavingCallback;
    }

    public void setDocumentSplitCriteria(int i) {
        this.zzYrm = i;
    }

    public void setDocumentSplitHeadingLevel(int i) {
        com.aspose.words.internal.zzZ4.zzZ(i, 0, 9, "DocumentSplitHeadingLevel");
        this.zzYrl = i;
    }

    public void setEncoding(Charset charset) {
        zzR(com.aspose.words.internal.zzZO0.zzZ(charset));
    }

    public void setExportCidUrlsForMhtmlResources(boolean z) {
        this.zzYmd = z;
    }

    public void setExportDocumentProperties(boolean z) {
        this.zzYmf = z;
    }

    public void setExportDropDownFormFieldAsText(boolean z) {
        this.zzYmi = z;
    }

    public void setExportFontResources(boolean z) {
        this.zzYm5 = z;
    }

    public void setExportFontsAsBase64(boolean z) {
        this.zzYlS = z;
    }

    public void setExportHeadersFootersMode(int i) {
        this.zzYmh = i;
    }

    public void setExportImagesAsBase64(boolean z) {
        this.zzYmr.zzXpg = z;
    }

    public void setExportLanguageInformation(boolean z) {
        this.zzYpA = z;
    }

    public void setExportListLabels(int i) {
        this.zzYm1 = i;
    }

    public void setExportOriginalUrlForLinkedImages(boolean z) {
        this.zzYme = z;
    }

    public void setExportPageMargins(boolean z) {
        this.zzYlT = z;
    }

    public void setExportPageSetup(boolean z) {
        this.zzYm9 = z;
    }

    public void setExportRelativeFontSize(boolean z) {
        this.zzYm6 = z;
    }

    public void setExportRoundtripInformation(boolean z) {
        this.zzYt6 = z;
    }

    public void setExportShapesAsSvg(boolean z) {
        this.zzYmr.zzXpc = z;
    }

    public void setExportTextInputFormFieldAsText(boolean z) {
        this.zzYmj = z;
    }

    public void setExportTocPageNumbers(boolean z) {
        this.zzYlY = z;
    }

    public void setExportXhtmlTransitional(boolean z) {
        this.zzYm8 = z;
    }

    public void setFontResourcesSubsettingSizeThreshold(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYm4 = i;
    }

    public void setFontSavingCallback(IFontSavingCallback iFontSavingCallback) {
        this.zzYm0 = iFontSavingCallback;
    }

    public void setFontsFolder(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "FontsFolder");
        this.zzYm3 = str;
    }

    public void setFontsFolderAlias(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "FontsFolderAlias");
        this.zzYm2 = str;
    }

    public void setHtmlVersion(int i) {
        this.zzYm7 = i;
    }

    public void setImageResolution(int i) {
        com.aspose.words.internal.zzZ4.zzZ(i, "ImageResolution");
        this.zzYmr.zzXph = i;
    }

    public void setImageSavingCallback(IImageSavingCallback iImageSavingCallback) {
        this.zzYmr.zzXpf = iImageSavingCallback;
    }

    public void setImagesFolder(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "ImagesFolder");
        this.zzYmn = str;
    }

    public void setImagesFolderAlias(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "ImagesFolderAlias");
        this.zzYmm = str;
    }

    public void setMetafileFormat(int i) {
        this.zzYmr.zzXpj = i;
    }

    public void setNavigationMapLevel(int i) {
        com.aspose.words.internal.zzZ4.zzZ(i, 0, 9, "NavigationMapLevel");
        this.zzYlW = i;
    }

    public void setOfficeMathOutputMode(int i) {
        this.zzYma = i;
    }

    public void setResolveFontNames(boolean z) {
        this.zzYqk = z;
    }

    public void setResourceFolder(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "ResourceFolder");
        this.zzYmp = str;
    }

    public void setResourceFolderAlias(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "ResourceFolderAlias");
        this.zzYmo = str;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        zzGe(i);
    }

    public void setScaleImageToShapeSize(boolean z) {
        this.zzYmr.zzXpi = z;
    }

    public void setTableWidthOutputMode(int i) {
        this.zzYmb = i;
    }

    public final void zzKd(String str) {
        this.zzYlV = str;
    }

    public final void zzR(com.aspose.words.internal.zzZO0 zzzo0) {
        if (zzzo0 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzMW = zzzo0;
    }

    public final int zzYZ1() {
        switch (getSaveFormat()) {
            case 50:
            case 51:
            case 53:
            case 54:
                int i = this.zzYm7;
                return i != 0 ? i != 1 ? 0 : 2 : this.zzYm8 ? 1 : 0;
            case 52:
                return 3;
            default:
                return 0;
        }
    }

    public final boolean zzYZ2() {
        return this.zzYma == 0;
    }

    public final zzYE0 zzYZ3() {
        this.zzYmr.zzXpd = getUseAntiAliasing();
        return this.zzYmr;
    }

    public final boolean zzYZ4() {
        return zzYZ1() == 2;
    }

    public final String zzYZ5() {
        return this.zzYlV;
    }

    public final boolean zzYZ6() {
        return this.zzYlX;
    }

    public final boolean zzYZ7() {
        return this.zzYmq;
    }

    public final void zzYZ8() {
        this.zzYlU = true;
    }

    public final boolean zzYZ9() {
        return this.zzYlU;
    }

    public final boolean zzYZa() {
        if (getSaveFormat() == 54 || getSaveFormat() == 53) {
            return false;
        }
        if (getSaveFormat() == 52) {
            return true;
        }
        return zzYZ4();
    }

    public final void zzYZb() {
        this.zzYpB = true;
    }

    public final boolean zzYZc() {
        return this.zzYpB;
    }

    @Override // com.aspose.words.SaveOptions
    public final void zzYZd() {
        super.zzYZd();
        this.zzYmq = false;
        this.zzYm7 = 0;
        this.zzYm8 = true;
    }

    public final HtmlSaveOptions zzYZe() {
        return (HtmlSaveOptions) memberwiseClone();
    }

    @Override // com.aspose.words.SaveOptions
    public final boolean zzYZf() {
        return getSaveFormat() == 50 && getDocumentSplitCriteria() != 0;
    }

    public final com.aspose.words.internal.zzZO0 zzZ9Y() {
        return this.zzMW;
    }

    public HtmlSaveOptions(int i) {
        this.zzYmr = new zzYE0();
        this.zzYmq = true;
        this.zzYpA = false;
        this.zzYmp = "";
        this.zzYmo = "";
        this.zzYmn = "";
        this.zzYmm = "";
        this.zzYml = "";
        this.zzYmj = false;
        this.zzYmi = false;
        this.zzYmh = 1;
        this.zzYmg = false;
        this.zzYmf = false;
        this.zzYme = false;
        this.zzYmd = false;
        this.zzYmc = 0;
        this.zzYmb = 0;
        this.zzYma = 0;
        this.zzYm9 = false;
        this.zzMW = new com.aspose.words.internal.zzZNI(false);
        this.zzYm7 = 0;
        this.zzYm6 = false;
        this.zzYm5 = false;
        this.zzYm4 = 0;
        this.zzYm3 = "";
        this.zzYm2 = "";
        this.zzYrm = 0;
        this.zzYrl = 2;
        this.zzYm1 = 0;
        this.zzYlX = true;
        this.zzYlW = 3;
        this.zzYlV = "text/html";
        this.zzYlU = false;
        this.zzYpB = false;
        this.zzYlT = false;
        this.zzYlS = false;
        this.zzxm = "";
        zzYE0 zzye0 = this.zzYmr;
        zzye0.zzXpj = 0;
        zzye0.zzXpi = true;
        zzye0.zzXph = 96;
        zzye0.zzXpg = false;
        zzye0.zzXpe = 1.0f;
        this.zzYt6 = true;
        zzGe(i);
        switch (i) {
            case 51:
                break;
            case 52:
            case 53:
                setExportHeadersFootersMode(0);
                setCssStyleSheetType(2);
                setDocumentSplitCriteria(8);
                break;
            default:
                return;
        }
        this.zzYt6 = false;
    }
}
