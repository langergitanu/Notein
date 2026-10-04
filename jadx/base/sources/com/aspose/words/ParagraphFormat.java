package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes6.dex */
public class ParagraphFormat implements zzZ9C, zzZD6 {
    private StyleCollection zzYSm;
    private zzZ9Q zzYvp;
    private BorderCollection zzZCb;

    public ParagraphFormat(zzZ9Q zzz9q, StyleCollection styleCollection) {
        this.zzYvp = zzz9q;
        this.zzYSm = styleCollection;
    }

    private void zzBl(int i) {
        this.zzYvp.setParaAttr(1000, Integer.valueOf(i));
    }

    private Object zzqp(int i) {
        Object directParaAttr = this.zzYvp.getDirectParaAttr(i);
        if (directParaAttr != null) {
            return directParaAttr;
        }
        zzZCY zzzcyDeepCloneComplexAttr = ((zzZCY) zzYMX.zzOt(i)).deepCloneComplexAttr();
        this.zzYvp.setParaAttr(i, zzzcyDeepCloneComplexAttr);
        return zzzcyDeepCloneComplexAttr;
    }

    private void zzqq(int i) {
        if (i == 1) {
            this.zzYvp.setParaAttr(1320, 2);
            this.zzYvp.setParaAttr(1330, 2);
        } else {
            if (i != 2) {
                return;
            }
            this.zzYvp.setParaAttr(1320, 1);
            this.zzYvp.setParaAttr(1330, 2);
        }
    }

    public void clearFormatting() {
        this.zzYvp.clearParaAttrs();
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedBorderAttr(int i) {
        return this.zzYvp.fetchInheritedParaAttr(i);
    }

    @Override // com.aspose.words.zzZ9C
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedShadingAttr(int i) {
        return this.zzYvp.fetchInheritedParaAttr(i);
    }

    public boolean getAddSpaceBetweenFarEastAndAlpha() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1240)).booleanValue();
    }

    public boolean getAddSpaceBetweenFarEastAndDigit() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1250)).booleanValue();
    }

    public int getAlignment() {
        return ((Integer) this.zzYvp.fetchParaAttr(PointerIconCompat.TYPE_GRAB)).intValue();
    }

    public int getBaselineAlignment() {
        return ((Integer) this.zzYvp.fetchParaAttr(1510)).intValue();
    }

    public boolean getBidi() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1560)).booleanValue();
    }

    public BorderCollection getBorders() {
        if (this.zzZCb == null) {
            this.zzZCb = new BorderCollection(this);
        }
        return this.zzZCb;
    }

    public double getCharacterUnitFirstLineIndent() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1175)).intValue()) / 100.0d;
    }

    public double getCharacterUnitLeftIndent() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1165)).intValue()) / 100.0d;
    }

    public double getCharacterUnitRightIndent() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(EditingLanguage.CORSICAN)).intValue()) / 100.0d;
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectBorderAttr(int i) {
        return this.zzYvp.getDirectParaAttr(i);
    }

    public int getDropCapPosition() {
        return ((Integer) this.zzYvp.fetchParaAttr(1440)).intValue();
    }

    public boolean getFarEastLineBreakControl() {
        return ((Boolean) this.zzYvp.fetchParaAttr(EditingLanguage.SORBIAN)).booleanValue();
    }

    public double getFirstLineIndent() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(EditingLanguage.CENTRAL_KURDISH_IRAQ)).intValue()) / 20.0d;
    }

    public boolean getHangingPunctuation() {
        return ((Boolean) this.zzYvp.fetchParaAttr(EditingLanguage.TURKMEN)).booleanValue();
    }

    public final int getHorizontalAlignment() {
        return ((Integer) this.zzYvp.fetchParaAttr(1290)).intValue();
    }

    public boolean getKeepTogether() {
        return ((Boolean) this.zzYvp.fetchParaAttr(EditingLanguage.ITALIAN_ITALY)).booleanValue();
    }

    public boolean getKeepWithNext() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1050)).booleanValue();
    }

    public double getLeftIndent() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1160)).intValue()) / 20.0d;
    }

    public double getLineSpacing() {
        return ((double) ((zzZ52) this.zzYvp.fetchParaAttr(1650)).getValue()) / 20.0d;
    }

    public int getLineSpacingRule() {
        return ((zzZ52) this.zzYvp.fetchParaAttr(1650)).zzZ4A();
    }

    public double getLineUnitAfter() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1225)).intValue()) / 100.0d;
    }

    public double getLineUnitBefore() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1205)).intValue()) / 100.0d;
    }

    public int getLinesToDrop() {
        return ((Integer) this.zzYvp.fetchParaAttr(1450)).intValue();
    }

    public final int getListId() {
        return ((Integer) this.zzYvp.fetchParaAttr(EditingLanguage.KASHMIRI_ARABIC)).intValue();
    }

    public boolean getNoSpaceBetweenParagraphsOfSameStyle() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1022)).booleanValue();
    }

    public int getOutlineLevel() {
        return ((Integer) this.zzYvp.fetchParaAttr(1280)).intValue();
    }

    public boolean getPageBreakBefore() {
        return ((Boolean) this.zzYvp.fetchParaAttr(EditingLanguage.SLOVENIAN)).booleanValue();
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZQH<Integer, Integer> getPossibleBorderKeys() {
        return zzYMX.zzZzU;
    }

    public final int getRelativeHorizontalPosition() {
        return ((Integer) this.zzYvp.fetchParaAttr(1320)).intValue();
    }

    public final int getRelativeVerticalPosition() {
        return ((Integer) this.zzYvp.fetchParaAttr(1330)).intValue();
    }

    public double getRightIndent() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(EditingLanguage.BRETON)).intValue()) / 20.0d;
    }

    public Shading getShading() {
        Shading shading = (Shading) this.zzYvp.getDirectParaAttr(1460);
        if (shading != null) {
            return shading;
        }
        Shading shading2 = new Shading(this, 1460);
        this.zzYvp.setParaAttr(1460, shading2);
        return shading2;
    }

    public boolean getSnapToGrid() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1260)).booleanValue();
    }

    public double getSpaceAfter() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1220)).intValue()) / 20.0d;
    }

    public boolean getSpaceAfterAuto() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1230)).booleanValue();
    }

    public double getSpaceBefore() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1200)).intValue()) / 20.0d;
    }

    public boolean getSpaceBeforeAuto() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1210)).booleanValue();
    }

    public Style getStyle() {
        StyleCollection styleCollection = this.zzYSm;
        if (styleCollection == null) {
            return null;
        }
        int revisionsView = styleCollection.getDocument().getNodeType() == 1 ? ((Document) this.zzYSm.getDocument()).getRevisionsView() : 0;
        return this.zzYSm.zzVp(this.zzYvp.getDirectParaAttr(1000, revisionsView) != null ? ((Integer) this.zzYvp.getDirectParaAttr(1000, revisionsView)).intValue() : zzZ7j(), 0);
    }

    public int getStyleIdentifier() {
        return getStyle().getStyleIdentifier();
    }

    public String getStyleName() {
        return getStyle().getName();
    }

    public boolean getSuppressAutoHyphens() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1410)).booleanValue();
    }

    public boolean getSuppressLineNumbers() {
        return ((Boolean) this.zzYvp.fetchParaAttr(EditingLanguage.YORUBA)).booleanValue();
    }

    public TabStopCollection getTabStops() {
        TabStopCollection tabStopCollection = (TabStopCollection) this.zzYvp.getDirectParaAttr(EditingLanguage.GUARANI);
        if (tabStopCollection != null) {
            return tabStopCollection;
        }
        TabStopCollection tabStopCollection2 = new TabStopCollection();
        this.zzYvp.setParaAttr(EditingLanguage.GUARANI, tabStopCollection2);
        return tabStopCollection2;
    }

    public final int getVerticalAlignment() {
        return ((Integer) this.zzYvp.fetchParaAttr(1300)).intValue();
    }

    public boolean getWidowControl() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1470)).booleanValue();
    }

    public boolean getWordWrap() {
        return ((Boolean) this.zzYvp.fetchParaAttr(EditingLanguage.FAEROESE)).booleanValue();
    }

    public final int getWrapType() {
        return ((Integer) this.zzYvp.fetchParaAttr(1340)).intValue();
    }

    public boolean isHeading() {
        return getStyle().isHeading();
    }

    public boolean isListItem() {
        return getListId() != 0;
    }

    public void setAddSpaceBetweenFarEastAndAlpha(boolean z) {
        this.zzYvp.setParaAttr(1240, Boolean.valueOf(z));
    }

    public void setAddSpaceBetweenFarEastAndDigit(boolean z) {
        this.zzYvp.setParaAttr(1250, Boolean.valueOf(z));
    }

    public void setAlignment(int i) {
        this.zzYvp.setParaAttr(PointerIconCompat.TYPE_GRAB, Integer.valueOf(i));
    }

    public void setBaselineAlignment(int i) {
        this.zzYvp.setParaAttr(1510, Integer.valueOf(i));
    }

    public void setBidi(boolean z) {
        this.zzYvp.setParaAttr(1560, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public void setBorderAttr(int i, Object obj) {
        this.zzYvp.setParaAttr(i, obj);
    }

    public void setCharacterUnitFirstLineIndent(double d) {
        this.zzYvp.setParaAttr(1175, Integer.valueOf((int) (d * 100.0d)));
    }

    public void setCharacterUnitLeftIndent(double d) {
        this.zzYvp.setParaAttr(1165, Integer.valueOf((int) (d * 100.0d)));
    }

    public void setCharacterUnitRightIndent(double d) {
        this.zzYvp.setParaAttr(EditingLanguage.CORSICAN, Integer.valueOf((int) (d * 100.0d)));
    }

    public void setDropCapPosition(int i) {
        if (this.zzYvp.getDirectParaAttr(1440) == null && i == 0) {
            return;
        }
        this.zzYvp.setParaAttr(1440, Integer.valueOf(i));
        zzqq(i);
    }

    public void setFarEastLineBreakControl(boolean z) {
        this.zzYvp.setParaAttr(EditingLanguage.SORBIAN, Boolean.valueOf(z));
    }

    public void setFirstLineIndent(double d) {
        this.zzYvp.removeParaAttr(1175);
        this.zzYvp.setParaAttr(EditingLanguage.CENTRAL_KURDISH_IRAQ, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setHangingPunctuation(boolean z) {
        this.zzYvp.setParaAttr(EditingLanguage.TURKMEN, Boolean.valueOf(z));
    }

    public final void setHorizontalAlignment(int i) {
        this.zzYvp.setParaAttr(1290, Integer.valueOf(i));
    }

    public void setKeepTogether(boolean z) {
        this.zzYvp.setParaAttr(EditingLanguage.ITALIAN_ITALY, Boolean.valueOf(z));
    }

    public void setKeepWithNext(boolean z) {
        this.zzYvp.setParaAttr(1050, Boolean.valueOf(z));
    }

    public void setLeftIndent(double d) {
        this.zzYvp.removeParaAttr(1165);
        this.zzYvp.setParaAttr(1160, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setLineSpacing(double d) {
        ((zzZ52) zzqp(1650)).setValue(com.aspose.words.internal.zzSA.zzr(d));
    }

    public void setLineSpacingRule(int i) {
        ((zzZ52) zzqp(1650)).zzAe(i);
    }

    public void setLineUnitAfter(double d) {
        this.zzYvp.setParaAttr(1225, Integer.valueOf((int) (d * 100.0d)));
    }

    public void setLineUnitBefore(double d) {
        this.zzYvp.setParaAttr(1205, Integer.valueOf((int) (d * 100.0d)));
    }

    public void setLinesToDrop(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYvp.setParaAttr(1450, Integer.valueOf(i));
    }

    public void setNoSpaceBetweenParagraphsOfSameStyle(boolean z) {
        this.zzYvp.setParaAttr(1022, Boolean.valueOf(z));
    }

    public void setOutlineLevel(int i) {
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYvp.setParaAttr(1280, Integer.valueOf(i));
    }

    public void setPageBreakBefore(boolean z) {
        this.zzYvp.setParaAttr(EditingLanguage.SLOVENIAN, Boolean.valueOf(z));
    }

    public final void setRelativeHorizontalPosition(int i) {
        this.zzYvp.setParaAttr(1320, Integer.valueOf(i));
    }

    public final void setRelativeVerticalPosition(int i) {
        this.zzYvp.setParaAttr(1330, Integer.valueOf(i));
    }

    public void setRightIndent(double d) {
        this.zzYvp.removeParaAttr(EditingLanguage.CORSICAN);
        this.zzYvp.setParaAttr(EditingLanguage.BRETON, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setSnapToGrid(boolean z) {
        this.zzYvp.setParaAttr(1260, Boolean.valueOf(z));
    }

    public void setSpaceAfter(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 0.0d, 1584.0d, 1584.0d, true, "SpaceAfter");
        this.zzYvp.removeParaAttr(1225);
        this.zzYvp.setParaAttr(1220, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setSpaceAfterAuto(boolean z) {
        this.zzYvp.setParaAttr(1230, Boolean.valueOf(z));
    }

    public void setSpaceBefore(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 0.0d, 1584.0d, 1584.0d, true, "SpaceBefore");
        this.zzYvp.removeParaAttr(1205);
        this.zzYvp.setParaAttr(1200, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setSpaceBeforeAuto(boolean z) {
        this.zzYvp.setParaAttr(1210, Boolean.valueOf(z));
    }

    public void setStyle(Style style) {
        if (style == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        if (style.getDocument() != this.zzYSm.getDocument()) {
            throw new IllegalArgumentException("This style belongs to a different document.");
        }
        if (style.getType() != 1) {
            throw new IllegalArgumentException("This style is not a paragraph style.");
        }
        zzBl(style.zzZ7j());
    }

    public void setStyleIdentifier(int i) {
        setStyle(this.zzYSm.zzkW(i));
    }

    public void setStyleName(String str) {
        setStyle(this.zzYSm.zzAY(str));
    }

    public void setSuppressAutoHyphens(boolean z) {
        this.zzYvp.setParaAttr(1410, Boolean.valueOf(z));
    }

    public void setSuppressLineNumbers(boolean z) {
        this.zzYvp.setParaAttr(EditingLanguage.YORUBA, Boolean.valueOf(z));
    }

    public final void setVerticalAlignment(int i) {
        this.zzYvp.setParaAttr(1300, Integer.valueOf(i));
    }

    public void setWidowControl(boolean z) {
        this.zzYvp.setParaAttr(1470, Boolean.valueOf(z));
    }

    public void setWordWrap(boolean z) {
        this.zzYvp.setParaAttr(EditingLanguage.FAEROESE, Boolean.valueOf(z));
    }

    public final void setWrapType(int i) {
        this.zzYvp.setParaAttr(1340, Integer.valueOf(i));
    }

    public final void zzWp(double d) {
        this.zzYvp.setParaAttr(1490, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public final void zzWq(double d) {
        this.zzYvp.setParaAttr(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public final void zzWr(double d) {
        this.zzYvp.setParaAttr(1302, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public final void zzWs(double d) {
        this.zzYvp.setParaAttr(1292, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public final void zzXc(double d) {
        ((zzZKP) zzqp(1430)).setValue(com.aspose.words.internal.zzSA.zzr(d));
    }

    public final void zzXd(double d) {
        this.zzYvp.setParaAttr(1310, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public final double zzYot() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1490)).intValue()) / 20.0d;
    }

    public final double zzYou() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).intValue()) / 20.0d;
    }

    public final void zzYov() {
        this.zzYvp.setParaAttr(1520, Boolean.TRUE);
    }

    public final double zzYow() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1302)).intValue()) / 20.0d;
    }

    public final double zzYox() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1292)).intValue()) / 20.0d;
    }

    public final int zzYpA() {
        return ((zzZKP) this.zzYvp.fetchParaAttr(1430)).zzZ4A();
    }

    public final boolean zzYpo() {
        return ((Boolean) this.zzYvp.fetchParaAttr(1520)).booleanValue();
    }

    public final int zzYpr() {
        return ((Integer) this.zzYvp.fetchParaAttr(1480)).intValue();
    }

    public final int zzZ7j() {
        Object directParaAttr = this.zzYvp.getDirectParaAttr(1000);
        if (directParaAttr == null) {
            directParaAttr = zzYMX.zzOt(1000);
        }
        return ((Integer) directParaAttr).intValue();
    }

    public final double zzZrZ() {
        return ((double) ((zzZKP) this.zzYvp.fetchParaAttr(1430)).getValue()) / 20.0d;
    }

    public final double zzZs0() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1310)).intValue()) / 20.0d;
    }

    public final void zzqr(int i) {
        this.zzYvp.setParaAttr(1480, Integer.valueOf(i));
    }

    public final void zzqs(int i) {
        ((zzZKP) zzqp(1430)).zzAe(i);
    }

    public final void zzrM(int i) {
        this.zzYvp.setParaAttr(EditingLanguage.GALICIAN, Integer.valueOf(i));
    }

    public final void zzxC(int i) {
        this.zzYvp.setParaAttr(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(i));
    }
}
