package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TextPath {
    private zzZ9A zzYtA;

    public TextPath(zzZ9A zzz9a) {
        this.zzYtA = zzz9a;
    }

    private Object zzPj(int i) {
        return this.zzYtA.fetchShapeAttr(i);
    }

    private void zzQ(int i, Object obj) {
        this.zzYtA.setShapeAttr(i, obj);
    }

    public boolean getBold() {
        return ((Boolean) zzPj(250)).booleanValue();
    }

    public boolean getFitPath() {
        return ((Boolean) zzPj(StyleIdentifier.LIGHT_LIST_ACCENT_6)).booleanValue();
    }

    public boolean getFitShape() {
        return ((Boolean) zzPj(245)).booleanValue();
    }

    public String getFontFamily() {
        return (String) zzPj(197);
    }

    public boolean getItalic() {
        return ((Boolean) zzPj(StyleIdentifier.MEDIUM_LIST_1_ACCENT_6)).booleanValue();
    }

    public boolean getKerning() {
        return ((Boolean) zzPj(243)).booleanValue();
    }

    public boolean getOn() {
        return ((Boolean) zzPj(241)).booleanValue();
    }

    public boolean getReverseRows() {
        return ((Boolean) zzPj(240)).booleanValue();
    }

    public boolean getRotateLetters() {
        return ((Boolean) zzPj(242)).booleanValue();
    }

    public boolean getSameLetterHeights() {
        return ((Boolean) zzPj(StyleIdentifier.LIGHT_GRID_ACCENT_6)).booleanValue();
    }

    public boolean getShadow() {
        return ((Boolean) zzPj(StyleIdentifier.MEDIUM_GRID_1_ACCENT_6)).booleanValue();
    }

    public double getSize() {
        return ((double) ((Integer) zzPj(195)).intValue()) / 65536.0d;
    }

    public boolean getSmallCaps() {
        return ((Boolean) zzPj(StyleIdentifier.MEDIUM_GRID_2_ACCENT_6)).booleanValue();
    }

    public double getSpacing() {
        return ((double) ((Integer) zzPj(196)).intValue()) / 65536.0d;
    }

    public boolean getStrikeThrough() {
        return ((Boolean) zzPj(255)).booleanValue();
    }

    public String getText() {
        return (String) zzPj(192);
    }

    public int getTextPathAlignment() {
        return ((Integer) zzPj(194)).intValue();
    }

    public boolean getTrim() {
        return ((Boolean) zzPj(246)).booleanValue();
    }

    public boolean getUnderline() {
        return ((Boolean) zzPj(StyleIdentifier.MEDIUM_LIST_2_ACCENT_6)).booleanValue();
    }

    public boolean getXScale() {
        return ((Boolean) zzPj(StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6)).booleanValue();
    }

    public void setBold(boolean z) {
        zzQ(250, Boolean.valueOf(z));
    }

    public void setFitPath(boolean z) {
        zzQ(StyleIdentifier.LIGHT_LIST_ACCENT_6, Boolean.valueOf(z));
    }

    public void setFitShape(boolean z) {
        zzQ(245, Boolean.valueOf(z));
    }

    public void setFontFamily(String str) {
        zzQ(197, str);
    }

    public void setItalic(boolean z) {
        zzQ(StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, Boolean.valueOf(z));
    }

    public void setKerning(boolean z) {
        zzQ(243, Boolean.valueOf(z));
    }

    public void setOn(boolean z) {
        zzQ(241, Boolean.valueOf(z));
    }

    public void setReverseRows(boolean z) {
        zzQ(240, Boolean.valueOf(z));
    }

    public void setRotateLetters(boolean z) {
        zzQ(242, Boolean.valueOf(z));
    }

    public void setSameLetterHeights(boolean z) {
        zzQ(StyleIdentifier.LIGHT_GRID_ACCENT_6, Boolean.valueOf(z));
    }

    public void setShadow(boolean z) {
        zzQ(StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, Boolean.valueOf(z));
    }

    public void setSize(double d) {
        zzQ(195, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(d)));
    }

    public void setSmallCaps(boolean z) {
        zzQ(StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, Boolean.valueOf(z));
    }

    public void setSpacing(double d) {
        zzQ(196, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(d)));
        zzQ(244, Boolean.TRUE);
    }

    public void setStrikeThrough(boolean z) {
        zzQ(255, Boolean.valueOf(z));
    }

    public void setText(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(192, str);
    }

    public void setTextPathAlignment(int i) {
        zzQ(194, Integer.valueOf(i));
    }

    public void setTrim(boolean z) {
        zzQ(246, Boolean.valueOf(z));
    }

    public void setUnderline(boolean z) {
        zzQ(StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, Boolean.valueOf(z));
    }

    public void setXScale(boolean z) {
        zzQ(StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6, Boolean.valueOf(z));
    }
}
