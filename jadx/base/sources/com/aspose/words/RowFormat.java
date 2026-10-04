package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class RowFormat implements zzZD6 {
    private zzZ9J zzXxg;
    private BorderCollection zzZCb;

    public RowFormat(zzZ9J zzz9j) {
        this.zzXxg = zzz9j;
    }

    private Object zzPj(int i) {
        return this.zzXxg.fetchRowAttr(i);
    }

    private Object zzYkb() {
        Object directRowAttr = this.zzXxg.getDirectRowAttr(4120);
        if (directRowAttr != null) {
            return directRowAttr;
        }
        zzZCY zzzcyDeepCloneComplexAttr = ((zzZCY) zzY6G.zzOt(4120)).deepCloneComplexAttr();
        this.zzXxg.setRowAttr(4120, zzzcyDeepCloneComplexAttr);
        return zzzcyDeepCloneComplexAttr;
    }

    public void clearFormatting() throws Exception {
        this.zzXxg.resetToDefaultAttrs();
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedBorderAttr(int i) {
        return this.zzXxg.fetchInheritedRowAttr(i);
    }

    public boolean getAllowBreakAcrossPages() {
        return ((Boolean) zzPj(4360)).booleanValue();
    }

    public BorderCollection getBorders() {
        if (this.zzZCb == null) {
            this.zzZCb = new BorderCollection(this);
        }
        return this.zzZCb;
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectBorderAttr(int i) {
        return this.zzXxg.getDirectRowAttr(i);
    }

    public boolean getHeadingFormat() {
        return ((Boolean) zzPj(4040)).booleanValue();
    }

    public double getHeight() {
        return ((double) ((zzZKP) this.zzXxg.fetchRowAttr(4120)).getValue()) / 20.0d;
    }

    public int getHeightRule() {
        return ((zzZKP) this.zzXxg.fetchRowAttr(4120)).zzZ4A();
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZQH<Integer, Integer> getPossibleBorderKeys() {
        return zzY6G.zzZzU;
    }

    public void setAllowBreakAcrossPages(boolean z) {
        this.zzXxg.setRowAttr(4360, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public void setBorderAttr(int i, Object obj) {
        this.zzXxg.setRowAttr(i, obj);
    }

    public void setHeadingFormat(boolean z) {
        this.zzXxg.setRowAttr(4040, Boolean.valueOf(z));
    }

    public void setHeight(double d) {
        ((zzZKP) zzYkb()).setValue(com.aspose.words.internal.zzSA.zzr(d));
    }

    public void setHeightRule(int i) {
        ((zzZKP) zzYkb()).zzAe(i);
    }
}
