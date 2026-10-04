package com.aspose.words;

import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2L extends zzZLD {
    private TextPath zzWWG;
    private zzZKI zzWWH;
    private OleFormat zzWWI;

    public zzY2L(ShapeBase shapeBase) {
        this.zzZBi = shapeBase;
    }

    private void zzP(int i, double d) {
        if (d < -1.0d || d > 1.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzZBi.setShapeAttr(i, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(d)));
    }

    private void zzV0(int i, int i2) {
        if (i2 < 0) {
            i2 = ((Integer) this.zzZBi.fetchInheritedShapeAttr(i)).intValue();
        }
        this.zzZBi.setShapeAttr(i, Integer.valueOf(i2));
    }

    @Override // com.aspose.words.zzZLD
    public final String getAlternativeText() {
        return (String) this.zzZBi.zzYvW().zzPj(897);
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getAspectRatioLocked() {
        return ((Boolean) this.zzZBi.zzYa6().fetchShapeAttr(120)).booleanValue();
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getBiLevel() {
        return ((Boolean) this.zzZBi.fetchShapeAttr(StyleIdentifier.GRID_TABLE_4_ACCENT_6)).booleanValue();
    }

    @Override // com.aspose.words.zzZLD
    public final double getBrightness() {
        return ImageData.zzWR(((double) ((Integer) this.zzZBi.fetchShapeAttr(StyleIdentifier.BIBLIOGRAPHY)).intValue()) / 65536.0d);
    }

    @Override // com.aspose.words.zzZLD
    public final double getContrast() {
        return ImageData.zzWP(((double) ((Integer) this.zzZBi.fetchShapeAttr(StyleIdentifier.BOOK_TITLE)).intValue()) / 65536.0d);
    }

    @Override // com.aspose.words.zzZLD
    public final double getCropBottom() {
        return ((double) ((Integer) this.zzZBi.fetchShapeAttr(257)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZLD
    public final double getCropLeft() {
        return ((double) ((Integer) this.zzZBi.fetchShapeAttr(StyleIdentifier.COLORFUL_LIST_ACCENT_6)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZLD
    public final double getCropRight() {
        return ((double) ((Integer) this.zzZBi.fetchShapeAttr(StyleIdentifier.COLORFUL_GRID_ACCENT_6)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZLD
    public final double getCropTop() {
        return ((double) ((Integer) this.zzZBi.fetchShapeAttr(256)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getExtrusionEnabled() {
        return ((Boolean) this.zzZBi.fetchShapeAttr(LogSeverity.ALERT_VALUE)).booleanValue();
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getFitShapeToText() {
        return ((Boolean) this.zzZBi.fetchShapeAttr(190)).booleanValue();
    }

    @Override // com.aspose.words.zzZLD
    public final int getFlipOrientation() {
        return ((Integer) this.zzZBi.fetchShapeAttr(4096)).intValue();
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getGrayScale() {
        return ((Boolean) this.zzZBi.fetchShapeAttr(StyleIdentifier.GRID_TABLE_3_ACCENT_6)).booleanValue();
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getHidden() {
        return ((Boolean) this.zzZBi.zzYvW().zzPj(958)).booleanValue();
    }

    @Override // com.aspose.words.zzZLD
    public final double getInternalMarginBottom() {
        return ((double) ((Integer) this.zzZBi.fetchShapeAttr(132)).intValue()) / 12700.0d;
    }

    @Override // com.aspose.words.zzZLD
    public final double getInternalMarginLeft() {
        return ((double) ((Integer) this.zzZBi.fetchShapeAttr(129)).intValue()) / 12700.0d;
    }

    @Override // com.aspose.words.zzZLD
    public final double getInternalMarginRight() {
        return ((double) ((Integer) this.zzZBi.fetchShapeAttr(131)).intValue()) / 12700.0d;
    }

    @Override // com.aspose.words.zzZLD
    public final double getInternalMarginTop() {
        return ((double) ((Integer) this.zzZBi.fetchShapeAttr(130)).intValue()) / 12700.0d;
    }

    @Override // com.aspose.words.zzZLD
    public final int getLayoutFlow() {
        return ((Integer) this.zzZBi.fetchShapeAttr(136)).intValue();
    }

    @Override // com.aspose.words.zzZLD
    public final String getName() {
        return (String) this.zzZBi.zzYvW().zzPj(896);
    }

    @Override // com.aspose.words.zzZLD
    public final OleFormat getOleFormat() {
        if (!this.zzZBi.zzZid()) {
            return null;
        }
        if (this.zzWWI == null) {
            this.zzWWI = new OleFormat(this.zzZBi);
        }
        return this.zzWWI;
    }

    @Override // com.aspose.words.zzZLD
    public final double getRotation() {
        return ((double) ((Integer) this.zzZBi.fetchShapeAttr(4)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getShadowEnabled() {
        return ((Boolean) this.zzZBi.fetchShapeAttr(574)).booleanValue();
    }

    @Override // com.aspose.words.zzZLD
    public final int getShapeType() {
        return ((Integer) this.zzZBi.zzYvW().zzPj(EditingLanguage.LULE_SAMI_NORWAY)).intValue();
    }

    @Override // com.aspose.words.zzZLD
    public final int getTextBoxWrapMode() {
        return ((Integer) this.zzZBi.fetchShapeAttr(133)).intValue();
    }

    @Override // com.aspose.words.zzZLD
    public final TextPath getTextPath() {
        if (this.zzWWG == null) {
            this.zzWWG = new TextPath(this.zzZBi);
        }
        return this.zzWWG;
    }

    @Override // com.aspose.words.zzZLD
    public final String getTitle() {
        return (String) this.zzZBi.zzYvW().zzPj(4157);
    }

    @Override // com.aspose.words.zzZLD
    public final boolean isHorizontalRule() {
        return ((Boolean) this.zzZBi.fetchShapeAttr(948)).booleanValue();
    }

    @Override // com.aspose.words.zzZLD
    public final boolean isWordArt() {
        return zzY23.zzZ0(getShapeType(), ((Boolean) this.zzZBi.fetchShapeAttr(241)).booleanValue());
    }

    @Override // com.aspose.words.zzZLD
    public final void setAlternativeText(String str) {
        this.zzZBi.zzYvW().zzQ(897, str);
    }

    @Override // com.aspose.words.zzZLD
    public final void setAspectRatioLocked(boolean z) {
        this.zzZBi.setShapeAttr(120, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZLD
    public final void setBiLevel(boolean z) {
        this.zzZBi.setShapeAttr(StyleIdentifier.GRID_TABLE_4_ACCENT_6, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZLD
    public final void setBrightness(double d) {
        this.zzZBi.setShapeAttr(StyleIdentifier.BIBLIOGRAPHY, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(ImageData.zzWQ(d))));
    }

    @Override // com.aspose.words.zzZLD
    public final void setContrast(double d) {
        this.zzZBi.setShapeAttr(StyleIdentifier.BOOK_TITLE, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(ImageData.zzWO(d))));
    }

    @Override // com.aspose.words.zzZLD
    public final void setCropBottom(double d) {
        zzP(257, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setCropLeft(double d) {
        zzP(StyleIdentifier.COLORFUL_LIST_ACCENT_6, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setCropRight(double d) {
        zzP(StyleIdentifier.COLORFUL_GRID_ACCENT_6, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setCropTop(double d) {
        zzP(256, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setFitShapeToText(boolean z) {
        this.zzZBi.setShapeAttr(190, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZLD
    public final void setFlipOrientation(int i) {
        this.zzZBi.setShapeAttr(4096, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZLD
    public final void setGrayScale(boolean z) {
        this.zzZBi.setShapeAttr(StyleIdentifier.GRID_TABLE_3_ACCENT_6, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZLD
    public final void setInternalMarginBottom(double d) {
        this.zzZBi.setShapeAttr(132, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(d)));
    }

    @Override // com.aspose.words.zzZLD
    public final void setInternalMarginLeft(double d) {
        this.zzZBi.setShapeAttr(129, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(d)));
    }

    @Override // com.aspose.words.zzZLD
    public final void setInternalMarginRight(double d) {
        this.zzZBi.setShapeAttr(131, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(d)));
    }

    @Override // com.aspose.words.zzZLD
    public final void setInternalMarginTop(double d) {
        this.zzZBi.setShapeAttr(130, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(d)));
    }

    @Override // com.aspose.words.zzZLD
    public final void setLayoutFlow(int i) {
        this.zzZBi.setShapeAttr(136, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZLD
    public final void setName(String str) {
        this.zzZBi.zzYvW().zzQ(896, str);
    }

    @Override // com.aspose.words.zzZLD
    public final void setRotation(double d) {
        this.zzZBi.setShapeAttr(4, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(d)));
    }

    @Override // com.aspose.words.zzZLD
    public final void setTextBoxWrapMode(int i) {
        this.zzZBi.setShapeAttr(133, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZLD
    public final void setTitle(String str) {
        this.zzZBi.zzYvW().zzQ(4157, str);
    }

    @Override // com.aspose.words.zzZLD
    public final void zzHC(int i) {
        zzV0(4128, i);
    }

    @Override // com.aspose.words.zzZLD
    public final void zzHD(int i) {
        zzV0(4127, i);
    }

    @Override // com.aspose.words.zzZLD
    public final void zzHv(int i) {
        this.zzZBi.setShapeAttr(4126, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZLD
    public final void zzHw(int i) {
        this.zzZBi.setShapeAttr(4125, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZLD
    public final void zzHx(int i) {
        this.zzZBi.setShapeAttr(135, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZLD
    public final void zzT(double d, boolean z) {
        ShapeBase shapeBase = this.zzZBi;
        shapeBase.setShapeAttr(4132, Double.valueOf(zzYBZ.zzZ(shapeBase, d, z, "height")));
    }

    @Override // com.aspose.words.zzZLD
    public final void zzU(double d, boolean z) {
        ShapeBase shapeBase = this.zzZBi;
        shapeBase.setShapeAttr(4131, Double.valueOf(zzYBZ.zzZ(shapeBase, d, z, "width")));
    }

    @Override // com.aspose.words.zzZLD
    public final void zzWZ(boolean z) {
        this.zzZBi.setShapeAttr(189, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZLD
    public final void zzXh(boolean z) {
        if (z) {
            this.zzZBi.zzYvW().zzQ(897, "\"\"");
        } else if ("\"\"".equals((String) this.zzZBi.zzYvW().zzPj(897))) {
            this.zzZBi.zzYvW().remove(897);
        }
    }

    @Override // com.aspose.words.zzZLD
    public final boolean zzZBM() {
        return "\"\"".equals((String) this.zzZBi.zzYvW().zzPj(897));
    }

    @Override // com.aspose.words.zzZLD
    public final zzZKI zzZyf() {
        if (this.zzWWH == null) {
            this.zzWWH = new zzZKI(this.zzZBi);
        }
        return this.zzWWH;
    }

    @Override // com.aspose.words.zzZLD
    public final int zzZyg() {
        return ((Integer) this.zzZBi.fetchShapeAttr(4126)).intValue();
    }

    @Override // com.aspose.words.zzZLD
    public final int zzZyh() {
        return ((Integer) this.zzZBi.fetchShapeAttr(4125)).intValue();
    }

    @Override // com.aspose.words.zzZLD
    public final int zzZyi() {
        return ((Integer) this.zzZBi.fetchShapeAttr(4128)).intValue();
    }

    @Override // com.aspose.words.zzZLD
    public final int zzZyj() {
        return ((Integer) this.zzZBi.fetchShapeAttr(4127)).intValue();
    }

    @Override // com.aspose.words.zzZLD
    public final int zzZyk() {
        return ((Integer) this.zzZBi.fetchShapeAttr(135)).intValue();
    }

    @Override // com.aspose.words.zzZLD
    public final boolean zzZyl() {
        return ((Boolean) this.zzZBi.fetchShapeAttr(189)).booleanValue();
    }
}
