package com.aspose.words;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class Font implements zzZ9C, zzZAV, zzZD6 {
    private PrinterMetrics zzYxx;
    private zzZ9G zzYxy;
    private DocumentBase zzZG3;
    private Fill zzZyc;

    public Font(zzZ9G zzz9g, DocumentBase documentBase) {
        this.zzYxy = zzz9g;
        this.zzZG3 = documentBase;
    }

    private StyleCollection getStyles() {
        DocumentBase documentBase = this.zzZG3;
        if (documentBase != null) {
            return documentBase.getStyles();
        }
        return null;
    }

    private Theme getTheme() {
        DocumentBase documentBase = this.zzZG3;
        if (documentBase != null) {
            return documentBase.zzZqI();
        }
        return null;
    }

    private boolean zzBh(int i) {
        return zzZ7R.zzW(this.zzYxy, i);
    }

    private boolean zzBj(int i) {
        return this.zzYxy.getDirectRunAttr(i) != null;
    }

    private zz7X zzVF(boolean z) {
        zz7X zz7x = (zz7X) this.zzYxy.getDirectRunAttr(830);
        if (zz7x != null) {
            zz7x.zzZ(this);
            return zz7x;
        }
        if (z) {
            return zzZ7d();
        }
        return null;
    }

    public static Font zzY(zzZ9G zzz9g) {
        return zzZ(zzz9g, null);
    }

    public static Font zzZ(zzZ9G zzz9g, DocumentBase documentBase) {
        if (zzz9g != null) {
            return new Font(zzz9g, documentBase);
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: parent");
    }

    private zz7X zzZ7d() {
        zz1C zz1c = new zz1C();
        this.zzYxy.setRunAttr(830, zz1c);
        zz1c.zzZ(this);
        return zz1c;
    }

    private PrinterMetrics zzZ7e() {
        if (this.zzYxx == null) {
            this.zzYxx = new PrinterMetrics();
        }
        return this.zzYxx;
    }

    private Run zzZ7f() {
        return (Run) com.aspose.words.internal.zzZKW.zzZ(this.zzYxy, Run.class);
    }

    private int zzZ7h() {
        Object directRunAttr;
        Run runZzZ7f = zzZ7f();
        if (runZzZ7f == null || !com.aspose.words.internal.zzZYD.zzXk(runZzZ7f.getText())) {
            return 3;
        }
        int iZzzG = zzY0C.zzzG(runZzZ7f.getText().charAt(0));
        if (iZzzG == 1) {
            return 1;
        }
        return (iZzzG == 0 && (directRunAttr = this.zzYxy.getDirectRunAttr(400)) != null && ((Integer) directRunAttr).intValue() == 1) ? 1 : 3;
    }

    private int zzZ7l() {
        return ((Integer) zzPj(150)).intValue();
    }

    private int zzZ7n() {
        return ((Integer) zzPj(400)).intValue();
    }

    public static Font zzZ7o() {
        return zzZ(new zzYEF(), null);
    }

    private void zzZW(int i, boolean z) {
        this.zzYxy.setRunAttr(i, zzZU.zzYW(z));
    }

    private zzZYZ zzZqy() {
        DocumentBase documentBase = this.zzZG3;
        if (documentBase != null) {
            return documentBase.zzZqy();
        }
        return null;
    }

    public void clearFormatting() {
        this.zzYxy.clearRunAttrs();
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedBorderAttr(int i) {
        return this.zzYxy.fetchInheritedRunAttr(i);
    }

    @Override // com.aspose.words.zzZ9C
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedShadingAttr(int i) {
        return this.zzYxy.fetchInheritedRunAttr(i);
    }

    public boolean getAllCaps() {
        return zzBh(120);
    }

    public int getAutoColor() throws Exception {
        Shape shape;
        if (getColor() != com.aspose.words.internal.zzZQ1.zz2p) {
            return getColor();
        }
        Shading shadingZzX = zzZ7R.zzX(this.zzYxy);
        if (shadingZzX == null) {
            zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(this.zzYxy, zzZAM.class);
            return (zzzam == null || zzzam.getParentParagraph_IInline() == null || (shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(zzzam.getParentParagraph_IInline().zzYBd(), Shape.class)) == null || !shape.zzY9s() || shape.zzY9a().zzZTj() == null || shape.zzY9a().zzZTj().zzZu5().zzZQX().isEmpty()) ? ViewCompat.MEASURED_STATE_MASK : shape.zzY9a().zzZTj().zzZu5().zzZQX().zzZ(getTheme(), (zzZCM) null).zzPG();
        }
        if (com.aspose.words.internal.zzPV.zzZ(zzZN8.zzT(shadingZzX), com.aspose.words.internal.zzPV.zzKa)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        return -1;
    }

    public boolean getBidi() {
        return zzBh(StyleIdentifier.BIBLIOGRAPHY);
    }

    public boolean getBold() {
        return zzBh(60);
    }

    public boolean getBoldBi() {
        return zzBh(250);
    }

    public Border getBorder() {
        Border border = (Border) this.zzYxy.getDirectRunAttr(StyleIdentifier.LIST_TABLE_4_ACCENT_5);
        if (border != null) {
            return border;
        }
        Border border2 = new Border(this, StyleIdentifier.LIST_TABLE_4_ACCENT_5);
        this.zzYxy.setRunAttr(StyleIdentifier.LIST_TABLE_4_ACCENT_5, border2);
        return border2;
    }

    public int getColor() {
        return zz8Q().zzPG();
    }

    public boolean getComplexScript() {
        return zzBh(StyleIdentifier.PLAIN_TABLE_2);
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectBorderAttr(int i) {
        return this.zzYxy.getDirectRunAttr(i);
    }

    public boolean getDoubleStrikeThrough() {
        return zzBh(300);
    }

    public boolean getEmboss() {
        return zzBh(170);
    }

    public int getEmphasisMark() {
        return ((Integer) zzPj(770)).intValue();
    }

    public boolean getEngrave() {
        return zzBh(180);
    }

    public Fill getFill() {
        if (this.zzZyc == null) {
            this.zzZyc = new Fill(this);
        }
        return this.zzZyc;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillType() {
        zz7X zz7xZzVF = zzVF(false);
        if (zz7xZzVF == null) {
            return 0;
        }
        return zz7xZzVF.getFillType();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBackColor() {
        zz7X zz7xZzVF = zzVF(false);
        return zz7xZzVF == null ? com.aspose.words.internal.zzZQ1.zz2p : zz7xZzVF.zzZBx().zzPF().zzPG();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBackThemeColor() {
        return -1;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableBackTintAndShade() {
        return 0.0d;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBaseForeColor() {
        zz7X zz7xZzVF = zzVF(false);
        return zz7xZzVF == null ? com.aspose.words.internal.zzZQ1.zz2p : zz7xZzVF.zzZBy().zzPF().zzPG();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableForeColor() {
        zz7X zz7xZzVF = zzVF(false);
        return zz7xZzVF == null ? com.aspose.words.internal.zzZQ1.zz2p : zz7xZzVF.zz8Q().zzPF().zzPG();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableForeThemeColor() {
        return getThemeColor();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableForeTintAndShade() {
        return getTintAndShade();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public byte[] getFillableImageBytes() {
        return null;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public zzZ90 getFillableThemeProvider() {
        return getTheme();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableTransparency() {
        zz7X zz7xZzVF = zzVF(false);
        if (zz7xZzVF == null) {
            return 0.0d;
        }
        if (zz7xZzVF.zzZQ4() == 3) {
            return 1.0d;
        }
        if (zz7xZzVF.zzZBn() == null || zz7xZzVF.zzZBn().zzZFG() == null) {
            return 0.0d;
        }
        return zz7xZzVF.getOpacity();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public boolean getFillableVisible() {
        zz7X zz7xZzVF = zzVF(false);
        if (zz7xZzVF == null) {
            return true;
        }
        return zz7xZzVF.getOn();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFilledColor() {
        return getFillableForeColor();
    }

    public final String getFontName(int i) {
        return i != 1 ? i != 2 ? i != 3 ? getNameOther() : getNameAscii() : getNameBi() : getNameFarEast();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getGradientAngle() {
        zz7X zz7xZzVF = zzVF(false);
        if (zz7xZzVF == null) {
            return 0.0d;
        }
        return zz7xZzVF.zzZBu();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public GradientStopCollection getGradientStops() {
        zz7C zz7c = (zz7C) com.aspose.words.internal.zzZKW.zzZ(zzVF(false), zz7C.class);
        if (zz7c != null) {
            return zz7c.zzZAx();
        }
        throw new IllegalStateException("Object doesn't support this action.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getGradientStyle() {
        zz7X zz7xZzVF = zzVF(false);
        if (zz7xZzVF == null) {
            return -1;
        }
        return zz7xZzVF.getGradientStyle();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getGradientVariant() {
        zz7X zz7xZzVF = zzVF(false);
        if (zz7xZzVF == null) {
            return 0;
        }
        return zz7xZzVF.getGradientVariant();
    }

    public boolean getHidden() {
        return zzBh(130);
    }

    public int getHighlightColor() {
        return zzZ7k().zzPG();
    }

    public boolean getItalic() {
        return zzBh(70);
    }

    public boolean getItalicBi() {
        return zzBh(StyleIdentifier.SUBTLE_EMPHASIS);
    }

    public double getKerning() {
        return ((double) ((Integer) zzPj(220)).intValue()) / 2.0d;
    }

    public double getLineSpacing() {
        int iZzBi = zzBi(zzZ7h());
        float sizeBi = (float) (getBidi() ? getSizeBi() : getSize());
        com.aspose.words.internal.zzPM zzpmZzY = zzZqy().zzY(getName(), sizeBi, iZzBi);
        Run runZzZ7f = zzZ7f();
        if (runZzZ7f != null && runZzZ7f.getDocument() != null && !runZzZ7f.getDocument().zzYBb().getLayoutOptions().getIgnorePrinterMetrics() && runZzZ7f.getDocument().zzZpV().zzYVg.getUsePrinterMetrics() && zzZ7e().hasMetricsForFont(zzpmZzY.zzPl().zzPh())) {
            zzpmZzY.zzZ(zzZ7e().getPrinterFontMetrics(zzpmZzY.zzPl().zzPh(), sizeBi, zzpmZzY.zzPl().getStyle(), runZzZ7f.getDocument().zzZpV().zzYVg.getTruncateFontHeightsLikeWP6()));
        }
        return zzpmZzY.getLineSpacingPoints();
    }

    public int getLocaleId() {
        return ((Integer) zzPj(380)).intValue();
    }

    public int getLocaleIdBi() {
        return ((Integer) zzPj(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2)).intValue();
    }

    public int getLocaleIdFarEast() {
        return ((Integer) zzPj(390)).intValue();
    }

    public String getName() {
        return zzZ7h() != 1 ? getNameAscii() : getNameFarEast();
    }

    public String getNameAscii() {
        return zzU1.zzZ(zzPj(230), getTheme());
    }

    public String getNameBi() {
        return zzU1.zzZ(zzPj(270), getTheme());
    }

    public String getNameFarEast() {
        return zzU1.zzZ(zzPj(235), getTheme());
    }

    public String getNameOther() {
        return zzU1.zzZ(zzPj(240), getTheme());
    }

    public boolean getNoProofing() {
        return zzBh(440);
    }

    @ReservedForInternalUse
    @Deprecated
    public boolean getOldOn() {
        return getFillableVisible();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getOldOpacity() {
        return 1.0d - getFillableTransparency();
    }

    public boolean getOutline() {
        return zzBh(90);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getPatternType() {
        throw new IllegalStateException("Pattern cannot be applied to Font.");
    }

    public double getPosition() {
        return ((double) ((Integer) zzPj(200)).intValue()) / 2.0d;
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZQH<Integer, Integer> getPossibleBorderKeys() {
        return null;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getPresetTexture() {
        throw new IllegalStateException("Preset texture cannot be applied to Font.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public boolean getRotateWithObject() {
        throw new IllegalStateException("Object doesn't support this action.");
    }

    public int getScaling() {
        return ((Integer) zzPj(StyleIdentifier.GRID_TABLE_4_ACCENT_2)).intValue();
    }

    public Shading getShading() {
        Shading shading = (Shading) this.zzYxy.getDirectRunAttr(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6);
        if (shading != null) {
            return shading;
        }
        Shading shading2 = new Shading(this, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6);
        this.zzYxy.setRunAttr(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, shading2);
        return shading2;
    }

    public boolean getShadow() {
        return zzBh(100);
    }

    public double getSize() {
        return ((double) ((Integer) zzPj(190)).intValue()) / 2.0d;
    }

    public double getSizeBi() {
        return ((double) ((Integer) zzPj(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4)).intValue()) / 2.0d;
    }

    public boolean getSmallCaps() {
        return zzBh(110);
    }

    public boolean getSnapToGrid() {
        return zzBh(StyleIdentifier.LIST_TABLE_2_ACCENT_1);
    }

    public double getSpacing() {
        return ((double) zzZ7l()) / 20.0d;
    }

    public boolean getStrikeThrough() {
        return zzBh(80);
    }

    public Style getStyle() {
        return getStyles().zzVp(zzZ7j(), 10);
    }

    public int getStyleIdentifier() {
        return getStyle().getStyleIdentifier();
    }

    public String getStyleName() {
        return getStyle().getName();
    }

    public boolean getSubscript() {
        return getVerticalAlignment() == 2;
    }

    public boolean getSuperscript() {
        return getVerticalAlignment() == 1;
    }

    public int getTextEffect() {
        return ((Integer) zzPj(StyleIdentifier.GRID_TABLE_3_ACCENT_5)).intValue();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getTextureAlignment() {
        return 9;
    }

    public int getThemeColor() {
        return zzY5L.zzAg((String) zzPj(500));
    }

    public int getThemeFont() {
        int iZzZ7h = zzZ7h();
        return iZzZ7h != 0 ? iZzZ7h != 1 ? iZzZ7h != 2 ? getThemeFontAscii() : getThemeFontBi() : getThemeFontFarEast() : getThemeFontOther();
    }

    public int getThemeFontAscii() {
        return ((zzU1) zzPj(230)).getThemeFont();
    }

    public int getThemeFontBi() {
        return ((zzU1) zzPj(270)).getThemeFont();
    }

    public int getThemeFontFarEast() {
        return ((zzU1) zzPj(235)).getThemeFont();
    }

    public int getThemeFontOther() {
        return ((zzU1) zzPj(240)).getThemeFont();
    }

    public double getTintAndShade() {
        double dZzZe;
        double d;
        String str = (String) zzPj(520);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            dZzZe = ((double) com.aspose.words.internal.zzJB.zzZe(str)) / 255.0d;
            d = 1.0d;
        } else {
            String str2 = (String) zzPj(510);
            if (!com.aspose.words.internal.zzZYD.zzXk(str2)) {
                return 0.0d;
            }
            dZzZe = ((double) com.aspose.words.internal.zzJB.zzZe(str2)) / (-255.0d);
            d = -1.0d;
        }
        return d - dZzZe;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getTransparency(zzBW zzbw) {
        if (zzbw.zzZFG() == null) {
            return 0.0d;
        }
        return zzbw.zzZFG().getValue();
    }

    public int getUnderline() {
        return ((Integer) zzPj(140)).intValue();
    }

    public int getUnderlineColor() {
        return zzZ7m().zzPG();
    }

    public final int getVerticalAlignment() {
        return ((Integer) zzPj(210)).intValue();
    }

    public boolean hasDmlEffect(int i) {
        if (i == 0) {
            return zzBj(810);
        }
        if (i == 1) {
            return zzBj(830);
        }
        if (i == 2) {
            return zzBj(815);
        }
        if (i == 3) {
            return zzBj(825);
        }
        if (i == 4) {
            return zzBj(840) || zzBj(835);
        }
        if (i == 5) {
            return zzBj(820);
        }
        throw new IllegalStateException("Unexpected TextDmlEffect.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void oneColorGradient(int i, int i2, double d) {
        Theme themeZzXVL = getTheme() == null ? Theme.zzXVL() : getTheme();
        zz7X zz7xZzVF = zzVF(false);
        zzBW zzbwZzj = (zz7xZzVF == null || zz7xZzVF.zzZBn() == null) ? zzBW.zzj(com.aspose.words.internal.zzPV.zzKa) : zz7xZzVF.zzZBn().zzZHt();
        zzBW zzbwZzZHt = zzbwZzj.zzZHt();
        if (!com.aspose.words.internal.zzAN.zzL(d, 0.5d)) {
            zz5C zz5c = new zz5C();
            zz5B zz5b = new zz5B();
            if (com.aspose.words.internal.zzAN.zzK(d, 0.5d)) {
                zz5c.setValue(d * 2.0d);
                zz5b.setValue(0.0d);
            } else {
                zz5c.setValue((1.0d - d) * 2.0d);
                zz5b.setValue(1.0d - zz5c.getValue());
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5C>) zzbwZzZHt.zzZNX(), zz5c);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5B>) zzbwZzZHt.zzZNX(), zz5b);
        }
        setFill(new zz7C(zzbwZzj, zzbwZzZHt, i, i2, themeZzXVL));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void patterned(int i) {
        throw new IllegalStateException("Pattern cannot be applied to Font.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void presetTextured(int i) {
        throw new IllegalStateException("Preset texture cannot be applied to Font.");
    }

    public void setAllCaps(boolean z) {
        zzZW(120, z);
    }

    public void setBidi(boolean z) {
        zzZW(StyleIdentifier.BIBLIOGRAPHY, z);
    }

    public void setBold(boolean z) {
        zzZW(60, z);
    }

    public void setBoldBi(boolean z) {
        zzZW(250, z);
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public void setBorderAttr(int i, Object obj) {
        this.zzYxy.setRunAttr(i, obj);
    }

    public void setColor(int i) {
        zzm(com.aspose.words.internal.zzPV.zzYR(i));
    }

    public void setComplexScript(boolean z) {
        zzZW(StyleIdentifier.PLAIN_TABLE_2, z);
    }

    public void setDoubleStrikeThrough(boolean z) {
        zzZW(300, z);
    }

    public void setEmboss(boolean z) {
        zzZW(170, z);
    }

    public void setEmphasisMark(int i) {
        this.zzYxy.setRunAttr(770, Integer.valueOf(i));
    }

    public void setEngrave(boolean z) {
        zzZW(180, z);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFill(zzZAW zzzaw) {
        zz7X zz7x = (zz7X) com.aspose.words.internal.zzZKW.zzZ(zzzaw, zz7X.class);
        if (zz7x == null || !(zz7x.zzZQ4() == 5 || zz7x.zzZQ4() == 1 || zz7x.zzZQ4() == 3)) {
            throw new IllegalStateException("Invalid fill type for this object.");
        }
        zz7x.zzZ(this);
        this.zzYxy.setRunAttr(830, zz7x);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackColor(int i) {
        zz7X zz7xZzVF = zzVF(true);
        if (zz7xZzVF.zzZQ4() == 3) {
            return;
        }
        zz7xZzVF.zzi(com.aspose.words.internal.zzPV.zzYR(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackThemeColor(int i) {
        throw new IllegalStateException("Cannot set BackThemeColor to this Fill.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackTintAndShade(double d) {
        throw new IllegalStateException("Cannot apply BackTintAndShade to this Fill.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeColor(int i) {
        zz7X zz7xZzVF = zzVF(true);
        if (zz7xZzVF.zzZQ4() == 3) {
            zz7xZzVF = zzZ7d();
        }
        zz7xZzVF.zzm(com.aspose.words.internal.zzPV.zzYR(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeThemeColor(int i) {
        setThemeColor(i);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeTintAndShade(double d) {
        setTintAndShade(d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableTransparency(double d) {
        zz7X zz7xZzVF = zzVF(true);
        if (zz7xZzVF.zzZQ4() == 3) {
            zz7xZzVF = zzZ7d();
        }
        zz7xZzVF.setOpacity(d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableVisible(boolean z) {
        zzVF(true).setOn(z);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFilledColor(int i) {
        setFillableForeColor(i);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setGradientAngle(double d) {
        zz7X zz7xZzVF = zzVF(false);
        if (zz7xZzVF != null) {
            zz7xZzVF.zzXV(d);
        }
    }

    public void setHidden(boolean z) {
        zzZW(130, z);
    }

    public void setHighlightColor(int i) {
        zz8(com.aspose.words.internal.zzPV.zzYR(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setImage(byte[] bArr) {
        throw new IllegalStateException("SetImage cannot be applied to Font.");
    }

    public void setItalic(boolean z) {
        zzZW(70, z);
    }

    public void setItalicBi(boolean z) {
        zzZW(StyleIdentifier.SUBTLE_EMPHASIS, z);
    }

    public void setKerning(double d) {
        this.zzYxy.setRunAttr(220, Integer.valueOf(com.aspose.words.internal.zzSA.zzt(d)));
    }

    public void setLocaleId(int i) {
        this.zzYxy.setRunAttr(380, Integer.valueOf(i));
    }

    public void setLocaleIdBi(int i) {
        this.zzYxy.setRunAttr(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, Integer.valueOf(i));
    }

    public void setLocaleIdFarEast(int i) {
        this.zzYxy.setRunAttr(390, Integer.valueOf(i));
    }

    public void setName(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "value");
        setNameAscii(str);
        setNameBi(str);
        setNameFarEast(str);
        setNameOther(str);
    }

    public void setNameAscii(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "value");
        this.zzYxy.setRunAttr(230, zzU1.zzSP(str));
    }

    public void setNameBi(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "value");
        this.zzYxy.setRunAttr(270, zzU1.zzSP(str));
    }

    public void setNameFarEast(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "value");
        this.zzYxy.setRunAttr(235, zzU1.zzSP(str));
    }

    public void setNameOther(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "value");
        this.zzYxy.setRunAttr(240, zzU1.zzSP(str));
    }

    public void setNoProofing(boolean z) {
        zzZW(440, z);
    }

    @ReservedForInternalUse
    @Deprecated
    public void setOldOn(boolean z) {
        setFillableVisible(z);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setOldOpacity(double d) {
        setFillableTransparency(1.0d - d);
    }

    public void setOutline(boolean z) {
        zzZW(90, z);
    }

    public void setPosition(double d) {
        this.zzYxy.setRunAttr(200, Integer.valueOf(com.aspose.words.internal.zzSA.zzt(d)));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setRotateWithObject(boolean z) {
        throw new IllegalStateException("Object doesn't support this action.");
    }

    public void setScaling(int i) {
        this.zzYxy.setRunAttr(StyleIdentifier.GRID_TABLE_4_ACCENT_2, Integer.valueOf(i));
    }

    public void setShadow(boolean z) {
        zzZW(100, z);
    }

    public void setSize(double d) {
        this.zzYxy.setRunAttr(190, Integer.valueOf(com.aspose.words.internal.zzSA.zzt(d)));
    }

    public void setSizeBi(double d) {
        this.zzYxy.setRunAttr(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, Integer.valueOf(com.aspose.words.internal.zzSA.zzt(d)));
    }

    public void setSmallCaps(boolean z) {
        zzZW(110, z);
    }

    public void setSnapToGrid(boolean z) {
        zzZW(StyleIdentifier.LIST_TABLE_2_ACCENT_1, z);
    }

    public void setSpacing(double d) {
        zzBm(com.aspose.words.internal.zzSA.zzr(d));
    }

    public void setStrikeThrough(boolean z) {
        zzZW(80, z);
    }

    public void setStyle(Style style) {
        if (style == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        if (getStyles() != null && style.getDocument() != getStyles().getDocument()) {
            throw new IllegalArgumentException("This style belongs to a different document.");
        }
        if (style.getType() != 2) {
            throw new IllegalArgumentException("This style is not a character style.");
        }
        zzBl(style.zzZ7j());
    }

    public void setStyleIdentifier(int i) {
        setStyle(getStyles().zzkW(i));
    }

    public void setStyleName(String str) {
        setStyle(getStyles().zzAY(str));
    }

    public void setSubscript(boolean z) {
        if (z || !getSuperscript()) {
            setVerticalAlignment(z ? 2 : 0);
        }
    }

    public void setSuperscript(boolean z) {
        if (z || !getSubscript()) {
            setVerticalAlignment(z ? 1 : 0);
        }
    }

    public void setTextEffect(int i) {
        this.zzYxy.setRunAttr(StyleIdentifier.GRID_TABLE_3_ACCENT_5, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setTextureAlignment(int i) {
        throw new IllegalStateException("TextureAlignment cannot be applied to Font.");
    }

    public void setThemeColor(int i) {
        this.zzYxy.removeRunAttr(520);
        this.zzYxy.removeRunAttr(510);
        if (i == -1) {
            this.zzYxy.removeRunAttr(500);
        } else {
            this.zzYxy.setRunAttr(500, zzY5L.toString(i));
            this.zzYxy.removeRunAttr(160);
        }
    }

    public void setThemeFont(int i) {
        setThemeFontAscii(i);
        setThemeFontBi(i);
        setThemeFontFarEast(i);
        setThemeFontOther(i);
    }

    public void setThemeFontAscii(int i) {
        this.zzYxy.setRunAttr(230, i == 0 ? zzU1.zzSP(getNameAscii()) : zzU1.zzYh(i, 1));
    }

    public void setThemeFontBi(int i) {
        this.zzYxy.setRunAttr(270, i == 0 ? zzU1.zzSP(getNameBi()) : zzU1.zzYh(i, 2));
    }

    public void setThemeFontFarEast(int i) {
        this.zzYxy.setRunAttr(235, i == 0 ? zzU1.zzSP(getNameFarEast()) : zzU1.zzYh(i, 3));
    }

    public void setThemeFontOther(int i) {
        this.zzYxy.setRunAttr(240, i == 0 ? zzU1.zzSP(getNameOther()) : zzU1.zzYh(i, 4));
    }

    public void setTintAndShade(double d) {
        if (getThemeColor() == -1) {
            throw new IllegalStateException("TintAndShade cannot be applied to a non-theme color.");
        }
        com.aspose.words.internal.zzZ4.zzZ(d, -1.0d, 1.0d, "TintAndShade");
        if (com.aspose.words.internal.zzAN.zzZD(d)) {
            this.zzYxy.removeRunAttr(520);
            this.zzYxy.removeRunAttr(510);
        } else if (d > 0.0d) {
            this.zzYxy.setRunAttr(520, com.aspose.words.internal.zzJB.zzWw((int) ((1.0d - d) * 255.0d)));
            this.zzYxy.removeRunAttr(510);
        } else {
            this.zzYxy.setRunAttr(510, com.aspose.words.internal.zzJB.zzWw((int) (((-1.0d) - d) * (-255.0d))));
            this.zzYxy.removeRunAttr(520);
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setTransparency(zzBW zzbw, double d) {
        zzbw.zzY0(d);
    }

    public void setUnderline(int i) {
        this.zzYxy.setRunAttr(140, Integer.valueOf(i));
    }

    public void setUnderlineColor(int i) {
        zz9(com.aspose.words.internal.zzPV.zzYR(i));
    }

    public final void setVerticalAlignment(int i) {
        this.zzYxy.setRunAttr(210, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void solid() {
        zz7X zz7xZzVF = zzVF(false);
        if (zz7xZzVF == null || zz7xZzVF.zzZQ4() != 5) {
            zzZ7d().zzm(com.aspose.words.internal.zzPV.zzKa);
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void twoColorGradient(int i, int i2) {
        Theme themeZzXVL = getTheme() == null ? Theme.zzXVL() : getTheme();
        zz7X zz7xZzVF = zzVF(false);
        setFill(new zz7C((zz7xZzVF == null || zz7xZzVF.zzZBn() == null) ? zzBW.zzj(com.aspose.words.internal.zzPV.zzKa) : zz7xZzVF.zzZBn().zzZHt(), (zz7xZzVF == null || zz7xZzVF.zzZBm() == null) ? zzBW.zzj(com.aspose.words.internal.zzPV.zzKa) : zz7xZzVF.zzZBm().zzZHt(), i, i2, themeZzXVL));
    }

    public final void zz8(com.aspose.words.internal.zzPV zzpv) {
        this.zzYxy.setRunAttr(20, zzpv);
    }

    public final com.aspose.words.internal.zzPV zz8Q() {
        return (com.aspose.words.internal.zzPV) zzPj(160);
    }

    public final void zz9(com.aspose.words.internal.zzPV zzpv) {
        this.zzYxy.setRunAttr(450, zzpv);
    }

    public final int zzBi(int i) {
        boolean boldBi;
        boolean italicBi;
        if (i == 1 || (i == 0 && zzZ7n() == 1)) {
            boldBi = getBoldBi();
            italicBi = getItalicBi();
        } else {
            boldBi = getBold();
            italicBi = getItalic();
        }
        return boldBi ? italicBi ? 3 : 1 : italicBi ? 2 : 0;
    }

    public final int zzBk(int i) {
        return i != 1 ? i != 2 ? getLocaleId() : getLocaleIdBi() : getLocaleIdFarEast();
    }

    public final void zzBl(int i) {
        this.zzYxy.setRunAttr(50, Integer.valueOf(i));
    }

    public final void zzBm(int i) {
        this.zzYxy.setRunAttr(150, Integer.valueOf(i));
    }

    public final Object zzPj(int i) {
        DocumentBase documentBase = this.zzZG3;
        Document documentZzYBa = documentBase != null ? documentBase.zzYBa() : null;
        return zzZ7R.zzZ(this.zzYxy, i, documentZzYBa != null ? documentZzYBa.getRevisionsView() : 0);
    }

    public final zzZ9G zzZ7g() {
        return this.zzYxy;
    }

    public final float zzZ7i() {
        double size = getSize();
        if (getSubscript() || getSuperscript()) {
            size *= 0.6200000047683716d;
        }
        return (float) size;
    }

    public final int zzZ7j() {
        Object directRunAttr = this.zzYxy.getDirectRunAttr(50);
        if (directRunAttr == null) {
            directRunAttr = zzYEF.zzOt(50);
        }
        return ((Integer) directRunAttr).intValue();
    }

    public final com.aspose.words.internal.zzPV zzZ7k() {
        return (com.aspose.words.internal.zzPV) zzPj(20);
    }

    public final com.aspose.words.internal.zzPV zzZ7m() {
        return (com.aspose.words.internal.zzPV) zzPj(450);
    }

    public final void zzm(com.aspose.words.internal.zzPV zzpv) {
        this.zzYxy.setRunAttr(160, zzpv);
        if (this.zzYxy.getDirectRunAttr(500) != null) {
            this.zzYxy.removeRunAttr(500);
        }
        if (this.zzYxy.getDirectRunAttr(510) != null) {
            this.zzYxy.removeRunAttr(510);
        }
        if (this.zzYxy.getDirectRunAttr(520) != null) {
            this.zzYxy.removeRunAttr(520);
        }
    }

    public final int zzza() {
        boolean bold = getBold();
        return getItalic() ? (bold ? 1 : 0) | 2 : bold ? 1 : 0;
    }
}
