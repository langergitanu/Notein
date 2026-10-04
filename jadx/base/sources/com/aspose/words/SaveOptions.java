package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SaveOptions {
    private String zz93;
    private boolean zzXoE;
    private boolean zzXoG;
    private boolean zzXoK;
    private IDocumentSavingCallback zzXoL;
    private boolean zzXow;
    private boolean zzXox;
    private boolean zzxd;
    boolean zzXoJ = true;
    private boolean zzXoI = true;
    private boolean zzXoH = false;
    private boolean zzXoF = true;
    private boolean zzXoD = false;
    private int zzXoC = 1;
    private int zzXoB = 1;
    private int zzZ0V = 0;
    private String zzXoA = "";
    private boolean zzXoz = true;
    private boolean zzXoy = true;
    private int zzYfA = 0;
    private boolean zzXov = true;
    private boolean zzXou = false;

    public static SaveOptions createSaveOptions(int i) {
        if (i == 10 || i == 11) {
            return new DocSaveOptions(i);
        }
        if (i == 30) {
            return new RtfSaveOptions();
        }
        if (i == 31) {
            return new WordML2003SaveOptions();
        }
        if (i == 60 || i == 61) {
            return new OdtSaveOptions(i);
        }
        if (i == 80) {
            return new XlsxSaveOptions();
        }
        switch (i) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return new OoxmlSaveOptions(i);
            default:
                switch (i) {
                    case 40:
                        return new PdfSaveOptions();
                    case 41:
                        return new XpsSaveOptions(41);
                    case 42:
                        return new XamlFixedSaveOptions();
                    default:
                        switch (i) {
                            case 44:
                                return new SvgSaveOptions();
                            case 45:
                                return new HtmlFixedSaveOptions();
                            case 46:
                                return new XpsSaveOptions(46);
                            case 47:
                                return new PsSaveOptions();
                            case 48:
                                return new PclSaveOptions();
                            default:
                                switch (i) {
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                        return new HtmlSaveOptions(i);
                                    default:
                                        switch (i) {
                                            case 70:
                                                return new TxtSaveOptions();
                                            case 71:
                                                return new XamlFlowSaveOptions();
                                            case 72:
                                                return new XamlFlowSaveOptions(i);
                                            case 73:
                                                return new MarkdownSaveOptions();
                                            default:
                                                switch (i) {
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                        return new ImageSaveOptions(i);
                                                    default:
                                                        throw new IllegalArgumentException("Invalid save format requested.");
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public boolean getAllowEmbeddingPostScriptFonts() {
        return this.zzXoK;
    }

    public String getDefaultTemplate() {
        return this.zzXoA;
    }

    public int getDml3DEffectsRenderingMode() {
        return this.zzYfA;
    }

    public int getDmlEffectsRenderingMode() {
        return this.zzZ0V;
    }

    public int getDmlRenderingMode() {
        return this.zzXoC;
    }

    public boolean getExportGeneratorName() {
        return this.zzXoF;
    }

    public int getImlRenderingMode() {
        return this.zzXoB;
    }

    public boolean getMemoryOptimization() {
        return this.zzXoH;
    }

    public boolean getPrettyFormat() {
        return this.zzxd;
    }

    public IDocumentSavingCallback getProgressCallback() {
        return this.zzXoL;
    }

    public abstract int getSaveFormat();

    public String getTempFolder() {
        return this.zz93;
    }

    public boolean getUpdateCreatedTimeProperty() {
        return this.zzXou;
    }

    public boolean getUpdateFields() {
        return this.zzXoz;
    }

    public boolean getUpdateLastPrintedProperty() {
        return this.zzXow;
    }

    public boolean getUpdateLastSavedTimeProperty() {
        return this.zzXox;
    }

    public boolean getUseAntiAliasing() {
        return this.zzXoE;
    }

    public boolean getUseHighQualityRendering() {
        return this.zzXoD;
    }

    public void setAllowEmbeddingPostScriptFonts(boolean z) {
        this.zzXoK = z;
    }

    public void setDefaultTemplate(String str) {
        this.zzXoA = str;
    }

    public void setDml3DEffectsRenderingMode(int i) {
        this.zzYfA = i;
    }

    public void setDmlEffectsRenderingMode(int i) {
        this.zzZ0V = i;
    }

    public void setDmlRenderingMode(int i) {
        this.zzXoC = i;
    }

    public void setExportGeneratorName(boolean z) {
        this.zzXoF = z;
    }

    public void setImlRenderingMode(int i) {
        this.zzXoB = i;
    }

    public void setMemoryOptimization(boolean z) {
        this.zzXoH = z;
    }

    public void setPrettyFormat(boolean z) {
        this.zzxd = z;
    }

    public void setProgressCallback(IDocumentSavingCallback iDocumentSavingCallback) {
        this.zzXoL = iDocumentSavingCallback;
    }

    public abstract void setSaveFormat(int i);

    public void setTempFolder(String str) {
        this.zz93 = str;
    }

    public void setUpdateCreatedTimeProperty(boolean z) {
        this.zzXou = z;
    }

    public void setUpdateFields(boolean z) {
        this.zzXoz = z;
    }

    public void setUpdateLastPrintedProperty(boolean z) {
        this.zzXow = z;
    }

    public void setUpdateLastSavedTimeProperty(boolean z) {
        this.zzXox = z;
    }

    public void setUseAntiAliasing(boolean z) {
        this.zzXoE = z;
    }

    public void setUseHighQualityRendering(boolean z) {
        this.zzXoD = z;
    }

    public void zzYZd() {
        this.zzXoG = true;
        setPrettyFormat(true);
        setExportGeneratorName(false);
        this.zzXoy = false;
        setUpdateLastPrintedProperty(false);
        this.zzXoI = false;
        this.zzXov = false;
    }

    public boolean zzYZf() {
        return false;
    }

    public final void zzYd3() {
        this.zzXoI = false;
    }

    public final boolean zzYd4() {
        return this.zzXoI;
    }

    public final boolean zzYd5() {
        return this.zzXov;
    }

    public final boolean zzYd6() {
        return this.zzXoy;
    }

    public boolean zzZ9f() {
        return true;
    }

    public final boolean zzrR() {
        return this.zzXoG;
    }

    public static SaveOptions createSaveOptions(String str) throws Exception {
        return createSaveOptions(FileFormatUtil.zzC8(com.aspose.words.internal.zzKE.zzZT(com.aspose.words.internal.zzZOQ.zzVe(str))));
    }
}
