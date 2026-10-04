package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FixedPageSaveOptions extends SaveOptions {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("set_LayoutExportStream");
    private IPageSavingCallback zzYyf;
    private com.aspose.words.internal.zzZOP zzYyg;
    private boolean zzrk;
    private int zzYQD = 0;
    private MetafileRenderingOptions zzYye = new MetafileRenderingOptions();
    private int zzB = 95;
    private int zzwt = 0;
    private PageSet zzYyd = PageSet.getAll();

    public FixedPageSaveOptions() {
        setUpdateLastPrintedProperty(true);
    }

    public boolean equals(Object obj) {
        Object[] objArr = (Object[]) com.aspose.words.internal.zzZKW.zzZ(obj, Object[].class);
        if (objArr != null && objArr.length > 0 && zzUR.zzTP((String) com.aspose.words.internal.zzZKW.zzZ(objArr[0], String.class)) == 0 && objArr.length > 1) {
            this.zzYyg = (com.aspose.words.internal.zzZOP) com.aspose.words.internal.zzZKW.zzZ(objArr[1], com.aspose.words.internal.zzZOP.class);
        }
        return super.equals(obj);
    }

    public int getColorMode() {
        return this.zzwt;
    }

    public boolean getCreateOutlinesForHeadingsInTables() {
        return false;
    }

    public int getJpegQuality() {
        return this.zzB;
    }

    public MetafileRenderingOptions getMetafileRenderingOptions() {
        return this.zzYye;
    }

    public int getNumeralFormat() {
        return this.zzYQD;
    }

    public boolean getOptimizeOutput() {
        return this.zzrk;
    }

    public IPageSavingCallback getPageSavingCallback() {
        return this.zzYyf;
    }

    public PageSet getPageSet() {
        return this.zzYyd;
    }

    public void setColorMode(int i) {
        this.zzwt = i;
    }

    public void setJpegQuality(int i) {
        if (i < 0 || i > 100) {
            throw new IllegalArgumentException("value");
        }
        this.zzB = i;
    }

    public void setMetafileRenderingOptions(MetafileRenderingOptions metafileRenderingOptions) {
        if (metafileRenderingOptions == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzYye = metafileRenderingOptions;
    }

    public void setNumeralFormat(int i) {
        this.zzYQD = i;
    }

    public void setOptimizeOutput(boolean z) {
        this.zzrk = z;
    }

    public void setPageSavingCallback(IPageSavingCallback iPageSavingCallback) {
        this.zzYyf = iPageSavingCallback;
    }

    public void setPageSet(PageSet pageSet) {
        this.zzYyd = pageSet;
    }

    public boolean zzZ9d() {
        return false;
    }

    public final com.aspose.words.internal.zzZOP zzZ9e() {
        return this.zzYyg;
    }

    @Override // com.aspose.words.SaveOptions
    public final boolean zzZ9f() {
        return false;
    }

    public final int zzZ9g() {
        return this.zzYQD;
    }

    public final IPageSavingCallback zzZ9h() {
        return this.zzYyf;
    }
}
