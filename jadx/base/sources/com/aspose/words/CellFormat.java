package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class CellFormat implements zzZ9C, zzZD6 {
    private zzZD5 zzZAa;
    private BorderCollection zzZCb;

    public CellFormat(zzZD5 zzzd5) {
        this.zzZAa = zzzd5;
    }

    private Object zzPj(int i) {
        Object directCellAttr = this.zzZAa.getDirectCellAttr(i);
        return directCellAttr != null ? directCellAttr : this.zzZAa.fetchInheritedCellAttr(i);
    }

    public void clearFormatting() {
        Object directCellAttr = this.zzZAa.getDirectCellAttr(3010);
        Object directCellAttr2 = this.zzZAa.getDirectCellAttr(3020);
        this.zzZAa.clearCellAttrs();
        if (directCellAttr != null) {
            this.zzZAa.setCellAttr(3010, directCellAttr);
        }
        if (directCellAttr2 != null) {
            this.zzZAa.setCellAttr(3020, directCellAttr2);
        }
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedBorderAttr(int i) {
        return this.zzZAa.fetchInheritedCellAttr(i);
    }

    @Override // com.aspose.words.zzZ9C
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedShadingAttr(int i) {
        return this.zzZAa.fetchInheritedCellAttr(i);
    }

    public BorderCollection getBorders() {
        if (this.zzZCb == null) {
            this.zzZCb = new BorderCollection(this);
        }
        return this.zzZCb;
    }

    public double getBottomPadding() {
        return ((double) ((Integer) zzPj(3080)).intValue()) / 20.0d;
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectBorderAttr(int i) {
        return this.zzZAa.getDirectCellAttr(i);
    }

    public boolean getFitText() {
        return ((Boolean) zzPj(3190)).booleanValue();
    }

    public boolean getHideMark() {
        return ((Boolean) zzPj(3220)).booleanValue();
    }

    public int getHorizontalMerge() {
        return ((Integer) zzPj(3040)).intValue();
    }

    public double getLeftPadding() {
        return ((double) ((Integer) zzPj(3090)).intValue()) / 20.0d;
    }

    public int getOrientation() {
        return ((Integer) zzPj(3050)).intValue();
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZQH<Integer, Integer> getPossibleBorderKeys() {
        return zzWP.zzZzU;
    }

    public PreferredWidth getPreferredWidth() {
        return (PreferredWidth) zzPj(3020);
    }

    public double getRightPadding() {
        return ((double) ((Integer) zzPj(3100)).intValue()) / 20.0d;
    }

    public Shading getShading() {
        Shading shading = (Shading) this.zzZAa.getDirectCellAttr(3170);
        if (shading != null) {
            return shading;
        }
        Shading shading2 = new Shading(this, 3170);
        this.zzZAa.setCellAttr(3170, shading2);
        return shading2;
    }

    public double getTopPadding() {
        return ((double) ((Integer) zzPj(3070)).intValue()) / 20.0d;
    }

    public int getVerticalAlignment() {
        return ((Integer) zzPj(3060)).intValue();
    }

    public int getVerticalMerge() {
        return ((Integer) zzPj(3030)).intValue();
    }

    public double getWidth() {
        return ((double) ((Integer) zzPj(3010)).intValue()) / 20.0d;
    }

    public boolean getWrapText() {
        return ((Boolean) zzPj(3180)).booleanValue();
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public void setBorderAttr(int i, Object obj) {
        this.zzZAa.setCellAttr(i, obj);
    }

    public void setBottomPadding(double d) {
        this.zzZAa.setCellAttr(3080, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setFitText(boolean z) {
        this.zzZAa.setCellAttr(3190, Boolean.valueOf(z));
    }

    public void setHideMark(boolean z) {
        this.zzZAa.setCellAttr(3220, Boolean.valueOf(z));
    }

    public void setHorizontalMerge(int i) {
        this.zzZAa.setCellAttr(3040, Integer.valueOf(i));
    }

    public void setLeftPadding(double d) {
        this.zzZAa.setCellAttr(3090, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setOrientation(int i) {
        this.zzZAa.setCellAttr(3050, Integer.valueOf(i));
    }

    public void setPaddings(double d, double d2, double d3, double d4) {
        setLeftPadding(d);
        setTopPadding(d2);
        setRightPadding(d3);
        setBottomPadding(d4);
    }

    public void setPreferredWidth(PreferredWidth preferredWidth) {
        this.zzZAa.setCellAttr(3020, preferredWidth);
    }

    public void setRightPadding(double d) {
        this.zzZAa.setCellAttr(3100, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setTopPadding(double d) {
        this.zzZAa.setCellAttr(3070, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setVerticalAlignment(int i) {
        this.zzZAa.setCellAttr(3060, Integer.valueOf(i));
    }

    public void setVerticalMerge(int i) {
        this.zzZAa.setCellAttr(3030, Integer.valueOf(i));
    }

    public void setWidth(double d) {
        int iZzr = com.aspose.words.internal.zzSA.zzr(d);
        this.zzZAa.setCellAttr(3010, Integer.valueOf(iZzr));
        this.zzZAa.setCellAttr(3020, PreferredWidth.zzpK(iZzr));
    }

    public void setWrapText(boolean z) {
        this.zzZAa.setCellAttr(3180, Boolean.valueOf(z));
    }

    public final void zz6z() {
        this.zzZAa.clearCellAttrs();
    }
}
