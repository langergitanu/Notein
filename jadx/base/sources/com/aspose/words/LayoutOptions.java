package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class LayoutOptions implements Cloneable {
    private boolean zzYg1;
    private IPageLayoutCallback zzYg4;
    private ITextShaperFactory zzYg5;
    private boolean zzYg7;
    private boolean zzYg8;
    private RevisionOptions zzYmz = new RevisionOptions();
    private int zzYg6 = 1;
    private boolean zzYg3 = true;
    private int zzYg2 = 0;
    private boolean zzcd = false;

    public IPageLayoutCallback getCallback() {
        return this.zzYg4;
    }

    public int getCommentDisplayMode() {
        return this.zzYg6;
    }

    public int getContinuousSectionPageNumberingRestart() {
        return this.zzYg2;
    }

    public boolean getIgnorePrinterMetrics() {
        return this.zzYg3;
    }

    public boolean getKeepOriginalFontMetrics() {
        return this.zzcd;
    }

    public RevisionOptions getRevisionOptions() {
        return this.zzYmz;
    }

    public boolean getShowHiddenText() {
        return this.zzYg8;
    }

    public boolean getShowParagraphMarks() {
        return this.zzYg7;
    }

    public ITextShaperFactory getTextShaperFactory() {
        return this.zzYg5;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setCallback(IPageLayoutCallback iPageLayoutCallback) {
        this.zzYg1 = true;
        this.zzYg4 = iPageLayoutCallback;
    }

    public void setCommentDisplayMode(int i) {
        this.zzYg1 = true;
        this.zzYg6 = i;
    }

    public void setContinuousSectionPageNumberingRestart(int i) {
        this.zzYg1 = true;
        this.zzYg2 = i;
    }

    public void setIgnorePrinterMetrics(boolean z) {
        this.zzYg1 = true;
        this.zzYg3 = z;
    }

    public void setKeepOriginalFontMetrics(boolean z) {
        this.zzYg1 = true;
        this.zzcd = z;
    }

    public void setShowHiddenText(boolean z) {
        this.zzYg1 = true;
        this.zzYg8 = z;
    }

    public void setShowParagraphMarks(boolean z) {
        this.zzYg1 = true;
        this.zzYg7 = z;
    }

    public void setTextShaperFactory(ITextShaperFactory iTextShaperFactory) {
        this.zzYg1 = true;
        this.zzYg5 = iTextShaperFactory;
    }

    public final boolean zzV0(boolean z) {
        boolean z2 = this.zzYg1;
        if (z) {
            this.zzYg1 = false;
        }
        return z2;
    }

    public final LayoutOptions zzYTh() {
        LayoutOptions layoutOptions = (LayoutOptions) memberwiseClone();
        layoutOptions.zzYmz = this.zzYmz.zzYl3();
        return layoutOptions;
    }
}
