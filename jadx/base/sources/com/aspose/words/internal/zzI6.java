package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzI6 extends zzZV8 {
    private zzZO0 zzMW;
    private String zzZj;
    private boolean zzxk;
    private boolean zzxl;
    private String zzxm;
    private double zzxn;
    private int zzxo;
    private int zzxp;
    private boolean zzxq;
    private boolean zzxr;
    private boolean zzxs;

    public zzI6(zzH6 zzh6) {
        super(zzh6);
        this.zzxr = true;
        this.zzxq = true;
        this.zzxp = 0;
        this.zzxo = 1;
        this.zzxn = 10.0d;
        this.zzxm = "aw";
        this.zzMW = zzZO0.zzhV();
        this.zzxl = false;
    }

    public final String getCssClassNamesPrefix() {
        return this.zzxm;
    }

    public final boolean getExportEmbeddedCss() {
        return this.zzxr;
    }

    public final boolean getExportEmbeddedFonts() {
        return this.zzxs;
    }

    public final boolean getExportEmbeddedSvg() {
        return this.zzxq;
    }

    public final int getFontFormat() {
        return this.zzxp;
    }

    public final int getPageHorizontalAlignment() {
        return this.zzxo;
    }

    public final double getPageMargins() {
        return this.zzxn;
    }

    public final boolean getSaveFontFaceCssSeparately() {
        return this.zzxk;
    }

    public final String getTitle() {
        return this.zzZj;
    }

    public final boolean getUseTargetMachineFonts() {
        return this.zzxl;
    }

    public final void setCssClassNamesPrefix(String str) {
        this.zzxm = str;
    }

    public final void setExportEmbeddedCss(boolean z) {
        this.zzxr = z;
    }

    public final void setExportEmbeddedFonts(boolean z) {
        this.zzxs = z;
    }

    public final void setExportEmbeddedSvg(boolean z) {
        this.zzxq = z;
    }

    public final void setFontFormat(int i) {
        this.zzxp = i;
    }

    public final void setPageHorizontalAlignment(int i) {
        this.zzxo = i;
    }

    public final void setPageMargins(double d) {
        this.zzxn = d;
    }

    public final void setSaveFontFaceCssSeparately(boolean z) {
        this.zzxk = z;
    }

    public final void setTitle(String str) {
        this.zzZj = str;
    }

    public final void setUseTargetMachineFonts(boolean z) {
        this.zzxl = z;
    }

    public final zzZO0 zzQZ() {
        return this.zzMW;
    }

    public final void zzZ(zzZO0 zzzo0) {
        this.zzMW = zzzo0;
    }
}
