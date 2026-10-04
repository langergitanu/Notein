package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FindReplaceOptions {
    private boolean zzYyA;
    private boolean zzYyB;
    private zzYMX zzYyC;
    private zzYEF zzYyD;
    private ParagraphFormat zzYyE;
    private Font zzYyF;
    private boolean zzYyG;
    private boolean zzYyH;
    private boolean zzYyI;
    private IReplacingCallback zzYyL;
    private boolean zzYyu;
    private boolean zzYyv;
    private boolean zzYyw;
    private boolean zzYyx;
    private boolean zzYyy;
    private boolean zzYyz;
    private int zzZcp;
    private boolean zzZu4;
    private boolean zzZu5;

    public FindReplaceOptions() {
        this.zzZcp = 0;
        this.zzYyD = new zzYEF();
        this.zzYyC = new zzYMX();
        this.zzYyF = new Font(this.zzYyD, null);
        this.zzYyE = new ParagraphFormat(this.zzYyC, null);
    }

    public Font getApplyFont() {
        return this.zzYyF;
    }

    public ParagraphFormat getApplyParagraphFormat() {
        return this.zzYyE;
    }

    public int getDirection() {
        return this.zzZcp;
    }

    public boolean getFindWholeWordsOnly() {
        return this.zzYyA;
    }

    public boolean getIgnoreDeleted() {
        return this.zzYyy;
    }

    public boolean getIgnoreFieldCodes() {
        return this.zzYyw;
    }

    public boolean getIgnoreFields() {
        return this.zzZu5;
    }

    public boolean getIgnoreFootnotes() {
        return this.zzZu4;
    }

    public boolean getIgnoreInserted() {
        return this.zzYyx;
    }

    public boolean getIgnoreShapes() {
        return this.zzYyG;
    }

    public boolean getIgnoreStructuredDocumentTags() {
        return this.zzYyI;
    }

    public boolean getLegacyMode() {
        return this.zzYyu;
    }

    public boolean getMatchCase() {
        return this.zzYyB;
    }

    public IReplacingCallback getReplacingCallback() {
        return this.zzYyL;
    }

    public boolean getSmartParagraphBreakReplacement() {
        return this.zzYyH;
    }

    public boolean getUseLegacyOrder() {
        return this.zzYyz;
    }

    public boolean getUseSubstitutions() {
        return this.zzYyv;
    }

    public void setDirection(int i) {
        this.zzZcp = i;
    }

    public void setFindWholeWordsOnly(boolean z) {
        this.zzYyA = z;
    }

    public void setIgnoreDeleted(boolean z) {
        this.zzYyy = z;
    }

    public void setIgnoreFieldCodes(boolean z) {
        this.zzYyw = z;
    }

    public void setIgnoreFields(boolean z) {
        this.zzZu5 = z;
    }

    public void setIgnoreFootnotes(boolean z) {
        this.zzZu4 = z;
    }

    public void setIgnoreInserted(boolean z) {
        this.zzYyx = z;
    }

    public void setIgnoreShapes(boolean z) {
        this.zzYyG = z;
    }

    public void setIgnoreStructuredDocumentTags(boolean z) {
        this.zzYyI = z;
    }

    public void setLegacyMode(boolean z) {
        this.zzYyu = z;
    }

    public void setMatchCase(boolean z) {
        this.zzYyB = z;
    }

    public void setReplacingCallback(IReplacingCallback iReplacingCallback) {
        this.zzYyL = iReplacingCallback;
    }

    public void setSmartParagraphBreakReplacement(boolean z) {
        this.zzYyH = z;
    }

    public void setUseLegacyOrder(boolean z) {
        this.zzYyz = z;
    }

    public void setUseSubstitutions(boolean z) {
        this.zzYyv = z;
    }

    public final zzYMX zzZ9t() {
        return this.zzYyC;
    }

    public final zzYEF zzZ9u() {
        return this.zzYyD;
    }

    public FindReplaceOptions(int i) {
        this();
        this.zzZcp = i;
    }

    public FindReplaceOptions(IReplacingCallback iReplacingCallback) {
        this();
        setReplacingCallback(iReplacingCallback);
    }

    public FindReplaceOptions(int i, IReplacingCallback iReplacingCallback) {
        this();
        this.zzZcp = i;
        setReplacingCallback(iReplacingCallback);
    }
}
