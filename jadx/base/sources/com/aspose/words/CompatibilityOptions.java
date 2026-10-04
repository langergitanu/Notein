package com.aspose.words;

import com.aspose.words.ref.RefBoolean;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class CompatibilityOptions implements Cloneable {
    private boolean zzZtj;
    private HashMap<Integer, Boolean> zzZtk;
    private int zzZFU = 0;
    private zzKQ zzZtm = new zzKQ();
    private HashMap<Integer, Boolean> zzZtl = new HashMap<>();

    public CompatibilityOptions() {
        zzZYK();
    }

    private void clear() {
        this.zzZtl.clear();
        this.zzZtm.clear();
    }

    private boolean zzMX(int i) {
        RefBoolean refBoolean = new RefBoolean(false);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzZtl, Integer.valueOf(i), refBoolean);
        boolean z = refBoolean.get();
        if (zZzZ) {
            return z;
        }
        refBoolean.set(z);
        boolean z2 = this.zzZtl.size() == 0 && com.aspose.words.internal.zzZQF.zzZ(this.zzZtk, Integer.valueOf(i), refBoolean);
        boolean z3 = refBoolean.get();
        if (z2) {
            return z3;
        }
        return false;
    }

    private static void zzU(CompatibilityOptions compatibilityOptions) {
        zzV(compatibilityOptions);
        compatibilityOptions.zzZtm.zzRZ("compatibilityMode").setValue("15");
        compatibilityOptions.zzZtm.zzZ(new zzKR("differentiateMultirowTableHeaders", "http://schemas.microsoft.com/office/word", "1"));
    }

    private static void zzV(CompatibilityOptions compatibilityOptions) {
        compatibilityOptions.zzZtm.zzZ(new zzKR("compatibilityMode", "http://schemas.microsoft.com/office/word", "14"));
        compatibilityOptions.zzZtm.zzZ(new zzKR("overrideTableStyleFontSizeAndJustification", "http://schemas.microsoft.com/office/word", "1"));
        compatibilityOptions.zzZtm.zzZ(new zzKR("enableOpenTypeFeatures", "http://schemas.microsoft.com/office/word", "1"));
        compatibilityOptions.zzZtm.zzZ(new zzKR("doNotFlipMirrorIndents", "http://schemas.microsoft.com/office/word", "1"));
    }

    private static void zzW(CompatibilityOptions compatibilityOptions) {
        compatibilityOptions.setAllowSpaceOfSameStyleInTable(true);
        compatibilityOptions.setDoNotAutofitConstrainedTables(true);
        compatibilityOptions.setDoNotBreakConstrainedForcedTable(true);
        compatibilityOptions.setDoNotUseIndentAsNumberingTabStop(true);
        compatibilityOptions.setDisplayHangulFixedWidth(true);
        compatibilityOptions.setDoNotVertAlignInTxbx(true);
        compatibilityOptions.setDoNotVertAlignCellWithSp(true);
        compatibilityOptions.setSplitPgBreakAndParaMark(true);
        compatibilityOptions.setCachedColBalance(true);
        compatibilityOptions.setUseNormalStyleForList(true);
        compatibilityOptions.setUseAltKinsokuLineBreakRules(true);
        compatibilityOptions.setDoNotSuppressIndentation(true);
        compatibilityOptions.setUseAnsiKerningPairs(true);
        compatibilityOptions.setAutofitToFirstFixedWidthCell(true);
    }

    private static void zzX(CompatibilityOptions compatibilityOptions) {
        zzW(compatibilityOptions);
        compatibilityOptions.setGrowAutofit(true);
        compatibilityOptions.setUseWord2002TableStyleRules(true);
    }

    private static void zzY(CompatibilityOptions compatibilityOptions) {
        zzX(compatibilityOptions);
        compatibilityOptions.setDoNotWrapTextWithPunct(true);
        compatibilityOptions.setDoNotBreakWrappedTables(true);
        compatibilityOptions.setDoNotSnapToGridInCell(true);
        compatibilityOptions.setDoNotUseEastAsianBreakRules(true);
        compatibilityOptions.setSelectFldWithFirstOrLastChar(true);
        compatibilityOptions.setUnderlineTabInNumList(true);
    }

    private static void zzZ(CompatibilityOptions compatibilityOptions) {
        zzY(compatibilityOptions);
        compatibilityOptions.setAlignTablesRowByRow(true);
        compatibilityOptions.setLayoutTableRowsApart(true);
        compatibilityOptions.setDoNotUseHTMLParagraphAutoSpacing(true);
        compatibilityOptions.setForgetLastTabAlignment(true);
        compatibilityOptions.setShapeLayoutLikeWW8(true);
        compatibilityOptions.setFootnoteLayoutLikeWW8(true);
        compatibilityOptions.setLayoutRawTableWidth(true);
        compatibilityOptions.setUseWord97LineBreakRules(true);
    }

    private void zzZYK() {
        HashMap<Integer, Boolean> map = new HashMap<>();
        this.zzZtk = map;
        Boolean bool = Boolean.TRUE;
        map.put(67, bool);
        this.zzZtk.put(68, bool);
        this.zzZtk.put(69, bool);
        this.zzZtk.put(70, bool);
    }

    public static CompatibilityOptions zzZYO() {
        return new CompatibilityOptions();
    }

    public static CompatibilityOptions zzZYP() {
        CompatibilityOptions compatibilityOptions = new CompatibilityOptions();
        zzW(compatibilityOptions);
        return compatibilityOptions;
    }

    public static CompatibilityOptions zzZYQ() {
        CompatibilityOptions compatibilityOptions = new CompatibilityOptions();
        zzX(compatibilityOptions);
        return compatibilityOptions;
    }

    public static CompatibilityOptions zzZYR() {
        CompatibilityOptions compatibilityOptions = new CompatibilityOptions();
        zzY(compatibilityOptions);
        return compatibilityOptions;
    }

    public static CompatibilityOptions zzZYS() {
        CompatibilityOptions compatibilityOptions = new CompatibilityOptions();
        zzZ(compatibilityOptions);
        return compatibilityOptions;
    }

    private void zzq(int i, boolean z) {
        this.zzZtl.put(Integer.valueOf(i), Boolean.valueOf(z));
    }

    public boolean getAdjustLineHeightInTable() {
        return zzMX(35);
    }

    public boolean getAlignTablesRowByRow() {
        return zzMX(38);
    }

    public boolean getAllowSpaceOfSameStyleInTable() {
        return zzMX(53);
    }

    public boolean getApplyBreakingRules() {
        return zzMX(45);
    }

    public boolean getAutoSpaceLikeWord95() {
        return zzMX(37);
    }

    public boolean getAutofitToFirstFixedWidthCell() {
        return zzMX(56);
    }

    public boolean getBalanceSingleByteDoubleByteWidth() {
        return zzMX(15);
    }

    public boolean getCachedColBalance() {
        return zzMX(64);
    }

    public boolean getConvMailMergeEsc() {
        return zzMX(6);
    }

    public boolean getDisableOpenTypeFontFormattingFeatures() {
        return zzMX(68);
    }

    public boolean getDisplayHangulFixedWidth() {
        return zzMX(58);
    }

    public boolean getDoNotAutofitConstrainedTables() {
        return zzMX(55);
    }

    public boolean getDoNotBreakConstrainedForcedTable() {
        return zzMX(61);
    }

    public boolean getDoNotBreakWrappedTables() {
        return zzMX(42);
    }

    public boolean getDoNotExpandShiftReturn() {
        return zzMX(13);
    }

    public boolean getDoNotLeaveBackslashAlone() {
        return zzMX(12);
    }

    public boolean getDoNotSnapToGridInCell() {
        return zzMX(43);
    }

    public boolean getDoNotSuppressIndentation() {
        return zzMX(54);
    }

    public boolean getDoNotSuppressParagraphBorders() {
        return zzMX(26);
    }

    public boolean getDoNotUseEastAsianBreakRules() {
        return zzMX(47);
    }

    public boolean getDoNotUseHTMLParagraphAutoSpacing() {
        return zzMX(34);
    }

    public boolean getDoNotUseIndentAsNumberingTabStop() {
        return zzMX(51);
    }

    public boolean getDoNotVertAlignCellWithSp() {
        return zzMX(60);
    }

    public boolean getDoNotVertAlignInTxbx() {
        return zzMX(62);
    }

    public boolean getDoNotWrapTextWithPunct() {
        return zzMX(46);
    }

    public boolean getFootnoteLayoutLikeWW8() {
        return zzMX(33);
    }

    public boolean getForgetLastTabAlignment() {
        return zzMX(36);
    }

    public boolean getGrowAutofit() {
        return zzMX(49);
    }

    public boolean getLayoutRawTableWidth() {
        return zzMX(39);
    }

    public boolean getLayoutTableRowsApart() {
        return zzMX(40);
    }

    public boolean getLineWrapLikeWord6() {
        return zzMX(25);
    }

    public boolean getMWSmallCaps() {
        return zzMX(21);
    }

    public final int getMswVersion() {
        return this.zzZFU;
    }

    public boolean getNoColumnBalance() {
        return zzMX(5);
    }

    public boolean getNoExtraLineSpacing() {
        return zzMX(27);
    }

    public boolean getNoLeading() {
        return zzMX(19);
    }

    public boolean getNoSpaceRaiseLower() {
        return zzMX(1);
    }

    public boolean getNoTabHangInd() {
        return zzMX(0);
    }

    public boolean getOverrideTableStyleFontSizeAndJustification() {
        return zzMX(67);
    }

    public boolean getPrintBodyTextBeforeHeader() {
        return zzMX(18);
    }

    public boolean getPrintColBlack() {
        return zzMX(4);
    }

    public boolean getSelectFldWithFirstOrLastChar() {
        return zzMX(44);
    }

    public boolean getShapeLayoutLikeWW8() {
        return zzMX(32);
    }

    public boolean getShowBreaksInFrames() {
        return zzMX(10);
    }

    public boolean getSpaceForUL() {
        return zzMX(20);
    }

    public boolean getSpacingInWholePoints() {
        return zzMX(17);
    }

    public boolean getSplitPgBreakAndParaMark() {
        return zzMX(59);
    }

    public boolean getSubFontBySize() {
        return zzMX(24);
    }

    public boolean getSuppressBottomSpacing() {
        return zzMX(28);
    }

    public boolean getSuppressSpBfAfterPgBrk() {
        return zzMX(2);
    }

    public boolean getSuppressSpacingAtTopOfPage() {
        return zzMX(16);
    }

    public boolean getSuppressTopSpacing() {
        return zzMX(7);
    }

    public boolean getSuppressTopSpacingWP() {
        return zzMX(22);
    }

    public boolean getSwapBordersFacingPgs() {
        return zzMX(11);
    }

    public boolean getSwapInsideAndOutsideForMirrorIndentsAndRelativePositioning() {
        return zzMX(69);
    }

    public boolean getTransparentMetafiles() {
        return zzMX(9);
    }

    public boolean getTruncateFontHeightsLikeWP6() {
        return zzMX(23);
    }

    public boolean getUICompat97To2003() {
        return zzMX(66);
    }

    public boolean getUlTrailSpace() {
        return zzMX(14);
    }

    public boolean getUnderlineTabInNumList() {
        return zzMX(57);
    }

    public boolean getUseAltKinsokuLineBreakRules() {
        return zzMX(52);
    }

    public boolean getUseAnsiKerningPairs() {
        return zzMX(63);
    }

    public boolean getUseFELayout() {
        return zzMX(65);
    }

    public boolean getUseNormalStyleForList() {
        return zzMX(50);
    }

    public boolean getUsePrinterMetrics() {
        return zzMX(31);
    }

    public boolean getUseSingleBorderforContiguousCells() {
        return zzMX(8);
    }

    public boolean getUseWord2002TableStyleRules() {
        return zzMX(48);
    }

    public boolean getUseWord2010TableStyleRules() {
        return zzMX(70);
    }

    public boolean getUseWord97LineBreakRules() {
        return zzMX(41);
    }

    public boolean getWPJustification() {
        return zzMX(30);
    }

    public boolean getWPSpaceWidth() {
        return zzMX(29);
    }

    public boolean getWrapTrailSpaces() {
        return zzMX(3);
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void optimizeFor(int i) {
        clear();
        switch (i) {
            case 0:
                this.zzZFU = 9;
                zzY(this);
                break;
            case 1:
                this.zzZFU = 10;
                zzX(this);
                break;
            case 2:
                this.zzZFU = 11;
                zzW(this);
                break;
            case 3:
                this.zzZFU = 12;
                break;
            case 4:
                this.zzZFU = 14;
                zzV(this);
                break;
            case 5:
                this.zzZFU = 15;
                zzU(this);
                break;
            case 6:
                this.zzZFU = 16;
                zzU(this);
                break;
            case 7:
                this.zzZFU = 17;
                zzU(this);
                break;
            default:
                throw new UnsupportedOperationException("Please report exception.");
        }
        this.zzZtj = true;
    }

    public void setAdjustLineHeightInTable(boolean z) {
        zzq(35, z);
    }

    public void setAlignTablesRowByRow(boolean z) {
        zzq(38, z);
    }

    public void setAllowSpaceOfSameStyleInTable(boolean z) {
        zzq(53, z);
    }

    public void setApplyBreakingRules(boolean z) {
        zzq(45, z);
    }

    public void setAutoSpaceLikeWord95(boolean z) {
        zzq(37, z);
    }

    public void setAutofitToFirstFixedWidthCell(boolean z) {
        zzq(56, z);
    }

    public void setBalanceSingleByteDoubleByteWidth(boolean z) {
        zzq(15, z);
    }

    public void setCachedColBalance(boolean z) {
        zzq(64, z);
    }

    public void setConvMailMergeEsc(boolean z) {
        zzq(6, z);
    }

    public void setDisableOpenTypeFontFormattingFeatures(boolean z) {
        zzq(68, z);
    }

    public void setDisplayHangulFixedWidth(boolean z) {
        zzq(58, z);
    }

    public void setDoNotAutofitConstrainedTables(boolean z) {
        zzq(55, z);
    }

    public void setDoNotBreakConstrainedForcedTable(boolean z) {
        zzq(61, z);
    }

    public void setDoNotBreakWrappedTables(boolean z) {
        zzq(42, z);
    }

    public void setDoNotExpandShiftReturn(boolean z) {
        zzq(13, z);
    }

    public void setDoNotLeaveBackslashAlone(boolean z) {
        zzq(12, z);
    }

    public void setDoNotSnapToGridInCell(boolean z) {
        zzq(43, z);
    }

    public void setDoNotSuppressIndentation(boolean z) {
        zzq(54, z);
    }

    public void setDoNotSuppressParagraphBorders(boolean z) {
        zzq(26, z);
    }

    public void setDoNotUseEastAsianBreakRules(boolean z) {
        zzq(47, z);
    }

    public void setDoNotUseHTMLParagraphAutoSpacing(boolean z) {
        zzq(34, z);
    }

    public void setDoNotUseIndentAsNumberingTabStop(boolean z) {
        zzq(51, z);
    }

    public void setDoNotVertAlignCellWithSp(boolean z) {
        zzq(60, z);
    }

    public void setDoNotVertAlignInTxbx(boolean z) {
        zzq(62, z);
    }

    public void setDoNotWrapTextWithPunct(boolean z) {
        zzq(46, z);
    }

    public void setFootnoteLayoutLikeWW8(boolean z) {
        zzq(33, z);
    }

    public void setForgetLastTabAlignment(boolean z) {
        zzq(36, z);
    }

    public void setGrowAutofit(boolean z) {
        zzq(49, z);
    }

    public void setLayoutRawTableWidth(boolean z) {
        zzq(39, z);
    }

    public void setLayoutTableRowsApart(boolean z) {
        zzq(40, z);
    }

    public void setLineWrapLikeWord6(boolean z) {
        zzq(25, z);
    }

    public void setMWSmallCaps(boolean z) {
        zzq(21, z);
    }

    public final void setMswVersion(int i) {
        this.zzZFU = i;
    }

    public void setNoColumnBalance(boolean z) {
        zzq(5, z);
    }

    public void setNoExtraLineSpacing(boolean z) {
        zzq(27, z);
    }

    public void setNoLeading(boolean z) {
        zzq(19, z);
    }

    public void setNoSpaceRaiseLower(boolean z) {
        zzq(1, z);
    }

    public void setNoTabHangInd(boolean z) {
        zzq(0, z);
    }

    public void setOverrideTableStyleFontSizeAndJustification(boolean z) {
        zzq(67, z);
    }

    public void setPrintBodyTextBeforeHeader(boolean z) {
        zzq(18, z);
    }

    public void setPrintColBlack(boolean z) {
        zzq(4, z);
    }

    public void setSelectFldWithFirstOrLastChar(boolean z) {
        zzq(44, z);
    }

    public void setShapeLayoutLikeWW8(boolean z) {
        zzq(32, z);
    }

    public void setShowBreaksInFrames(boolean z) {
        zzq(10, z);
    }

    public void setSpaceForUL(boolean z) {
        zzq(20, z);
    }

    public void setSpacingInWholePoints(boolean z) {
        zzq(17, z);
    }

    public void setSplitPgBreakAndParaMark(boolean z) {
        zzq(59, z);
    }

    public void setSubFontBySize(boolean z) {
        zzq(24, z);
    }

    public void setSuppressBottomSpacing(boolean z) {
        zzq(28, z);
    }

    public void setSuppressSpBfAfterPgBrk(boolean z) {
        zzq(2, z);
    }

    public void setSuppressSpacingAtTopOfPage(boolean z) {
        zzq(16, z);
    }

    public void setSuppressTopSpacing(boolean z) {
        zzq(7, z);
    }

    public void setSuppressTopSpacingWP(boolean z) {
        zzq(22, z);
    }

    public void setSwapBordersFacingPgs(boolean z) {
        zzq(11, z);
    }

    public void setSwapInsideAndOutsideForMirrorIndentsAndRelativePositioning(boolean z) {
        zzq(69, z);
    }

    public void setTransparentMetafiles(boolean z) {
        zzq(9, z);
    }

    public void setTruncateFontHeightsLikeWP6(boolean z) {
        zzq(23, z);
    }

    public void setUICompat97To2003(boolean z) {
        zzq(66, z);
    }

    public void setUlTrailSpace(boolean z) {
        zzq(14, z);
    }

    public void setUnderlineTabInNumList(boolean z) {
        zzq(57, z);
    }

    public void setUseAltKinsokuLineBreakRules(boolean z) {
        zzq(52, z);
    }

    public void setUseAnsiKerningPairs(boolean z) {
        zzq(63, z);
    }

    public void setUseFELayout(boolean z) {
        zzq(65, z);
    }

    public void setUseNormalStyleForList(boolean z) {
        zzq(50, z);
    }

    public void setUsePrinterMetrics(boolean z) {
        zzq(31, z);
    }

    public void setUseSingleBorderforContiguousCells(boolean z) {
        zzq(8, z);
    }

    public void setUseWord2002TableStyleRules(boolean z) {
        zzq(48, z);
    }

    public void setUseWord2010TableStyleRules(boolean z) {
        zzq(70, z);
    }

    public void setUseWord97LineBreakRules(boolean z) {
        zzq(41, z);
    }

    public void setWPJustification(boolean z) {
        zzq(30, z);
    }

    public void setWPSpaceWidth(boolean z) {
        zzq(29, z);
    }

    public void setWrapTrailSpaces(boolean z) {
        zzq(3, z);
    }

    public final boolean zzZYL() {
        return this.zzZtj && this.zzZFU >= 12;
    }

    public final boolean zzZYM() {
        return this.zzZFU >= 15;
    }

    public final boolean zzZYN() {
        return this.zzZtj;
    }

    public final zzKQ zzZYT() {
        return this.zzZtm;
    }

    public final CompatibilityOptions zzZYU() {
        CompatibilityOptions compatibilityOptions = (CompatibilityOptions) memberwiseClone();
        compatibilityOptions.zzZtm = this.zzZtm.zzZTK();
        return compatibilityOptions;
    }
}
