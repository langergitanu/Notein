package com.aspose.words;

import com.aspose.words.zzZ3W;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class PageSetup implements zzZD6 {
    private TextColumnCollection zzXH5;
    private zzZ9E zzXH6;
    private zzZ9E zzYKZ;
    private EndnoteOptions zzYSS;
    private FootnoteOptions zzYST;
    private zzZZF zzYSi;
    private StyleCollection zzYSm;
    private BorderCollection zzZsJ;
    private static com.aspose.words.internal.zzZQH<Integer, Integer> zzXH4 = new com.aspose.words.internal.zzZQH<>();
    private static HashMap<Integer, zzZ3W.zzZ> zzXH3 = new HashMap<>();

    static {
        zzXH4.zzB(3, 2130);
        zzXH4.zzB(1, 2140);
        zzXH4.zzB(0, 2150);
        zzXH4.zzB(2, 2160);
        com.aspose.words.internal.zzZQF.zzY(zzXH3, 1, new zzZ3W.zzZ(720, 720, 720, 720));
        com.aspose.words.internal.zzZQF.zzY(zzXH3, 2, new zzZ3W.zzZ(EditingLanguage.FAEROESE, EditingLanguage.FAEROESE, 1440, 1440));
        com.aspose.words.internal.zzZQF.zzY(zzXH3, 3, new zzZ3W.zzZ(2880, 2880, 1440, 1440));
        com.aspose.words.internal.zzZQF.zzY(zzXH3, 4, new zzZ3W.zzZ(1800, 1440, 1440, 1440));
    }

    public PageSetup(zzZ9E zzz9e, zzZZF zzzzf, StyleCollection styleCollection, zzZ9E zzz9e2) {
        this.zzYKZ = zzz9e;
        this.zzYSi = zzzzf;
        this.zzYSm = styleCollection;
        this.zzXH6 = zzz9e2;
    }

    private Object zzPj(int i) {
        return this.zzYKZ.fetchSectionAttr(i);
    }

    private void zzQ(int i, Object obj) {
        this.zzYKZ.setSectionAttr(i, obj);
    }

    private zzYN9 zzYJ5() {
        return new zzYN9(this.zzYKZ, this.zzYSi, ((Integer) this.zzXH6.fetchSectionAttr(2210)).intValue());
    }

    private int zzYLc() {
        return ((Integer) zzPj(2420)).intValue();
    }

    private boolean zzYpP() {
        return getTextOrientation() == 0 || getTextOrientation() == 4;
    }

    private double zzYpS() {
        return ((double) ((Integer) zzPj(2170)).intValue()) / 20.0d;
    }

    private double zzYpT() {
        return zzYpP() ? zzYRW() : zzYRX();
    }

    private boolean zzZ3() {
        return getOrientation() == 2;
    }

    private static zzZ3W.zzZ zzqH(int i) {
        return i == 0 ? zzZ3W.zzwH(zzYCZ.zzYcc()) : zzXH3.get(Integer.valueOf(i));
    }

    private void zzvC(int i) {
        this.zzYKZ.setSectionAttr(2440, Integer.valueOf(i));
    }

    private void zzvD(int i) {
        this.zzYKZ.setSectionAttr(2420, Integer.valueOf(i));
    }

    public void clearFormatting() {
        this.zzYKZ.clearSectionAttrs();
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedBorderAttr(int i) {
        return this.zzYKZ.fetchInheritedSectionAttr(i);
    }

    public boolean getBidi() {
        return ((Boolean) zzPj(2450)).booleanValue();
    }

    public boolean getBorderAlwaysInFront() {
        return ((Boolean) zzPj(2230)).booleanValue();
    }

    public int getBorderAppliesTo() {
        return ((Integer) zzPj(2220)).intValue();
    }

    public int getBorderDistanceFrom() {
        return ((Integer) zzPj(2240)).intValue();
    }

    public boolean getBorderSurroundsFooter() {
        return !this.zzYSi.zzYWs;
    }

    public boolean getBorderSurroundsHeader() {
        return !this.zzYSi.zzYWt;
    }

    public BorderCollection getBorders() {
        if (this.zzZsJ == null) {
            this.zzZsJ = new BorderCollection(this);
        }
        return this.zzZsJ;
    }

    public double getBottomMargin() {
        return ((double) ((Integer) zzPj(2310)).intValue()) / 20.0d;
    }

    public int getChapterPageSeparator() {
        return ((Integer) zzPj(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED)).intValue();
    }

    public int getCharactersPerLine() {
        return (int) com.aspose.words.internal.zzZKQ.zzZb(getTextColumns().getWidth() / ((((double) zzYLc()) / 4096.0d) + this.zzYSm.getByStyleIdentifier(0).getFont().getSize()));
    }

    public boolean getDifferentFirstPageHeaderFooter() {
        return ((Boolean) zzPj(2040)).booleanValue();
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectBorderAttr(int i) {
        return this.zzYKZ.getDirectSectionAttr(i);
    }

    public EndnoteOptions getEndnoteOptions() {
        if (this.zzYSS == null) {
            this.zzYSS = new EndnoteOptions(this.zzYKZ);
        }
        return this.zzYSS;
    }

    public int getFirstPageTray() {
        return ((Integer) zzPj(EditingLanguage.PORTUGUESE_PORTUGAL)).intValue();
    }

    public double getFooterDistance() {
        return ((double) ((Integer) zzPj(2330)).intValue()) / 20.0d;
    }

    public FootnoteOptions getFootnoteOptions() {
        if (this.zzYST == null) {
            this.zzYST = new FootnoteOptions(this.zzYKZ);
        }
        return this.zzYST;
    }

    public double getGutter() {
        return ((double) ((Integer) zzPj(2312)).intValue()) / 20.0d;
    }

    public double getHeaderDistance() {
        return ((double) ((Integer) zzPj(2320)).intValue()) / 20.0d;
    }

    public int getHeadingLevelForChapter() {
        return ((Integer) zzPj(2190)).intValue();
    }

    public int getLayoutMode() {
        return ((Integer) zzPj(2430)).intValue();
    }

    public double getLeftMargin() {
        return ((double) ((Integer) zzPj(2280)).intValue()) / 20.0d;
    }

    public int getLineNumberCountBy() {
        return ((Integer) zzPj(2120)).intValue();
    }

    public double getLineNumberDistanceFromText() {
        return ((double) ((Integer) zzPj(2400)).intValue()) / 20.0d;
    }

    public int getLineNumberRestartMode() {
        return ((Integer) zzPj(EditingLanguage.MALAY_BRUNEI_DARUSSALAM)).intValue();
    }

    public int getLineStartingNumber() {
        return ((Integer) zzPj(2180)).intValue();
    }

    public int getLinesPerPage() {
        return (int) com.aspose.words.internal.zzZKQ.zzZb(zzYpT() / zzYpS());
    }

    public int getMargins() {
        int[] iArr = {0, 1, 2, 3, 4};
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            zzZ3W.zzZ zzzZzqH = zzqH(i2);
            if (zzzZzqH.getLeft() == ((Integer) zzPj(2280)).intValue() && zzzZzqH.getRight() == ((Integer) zzPj(2290)).intValue() && zzzZzqH.getTop() == ((Integer) zzPj(2300)).intValue() && zzzZzqH.getBottom() == ((Integer) zzPj(2310)).intValue() && (i2 != 4 || this.zzYSi.zzYWh == 1)) {
                return i2;
            }
        }
        return 5;
    }

    public int getMultiplePages() {
        return this.zzYSi.zzYWh;
    }

    public boolean getOddAndEvenPagesHeaderFooter() {
        return this.zzYSi.zzYVX;
    }

    public int getOrientation() {
        return ((Integer) zzPj(2210)).intValue();
    }

    public int getOtherPagesTray() {
        return ((Integer) zzPj(2080)).intValue();
    }

    public double getPageHeight() {
        return ((double) ((Integer) zzPj(2270)).intValue()) / 20.0d;
    }

    public int getPageNumberStyle() {
        return ((Integer) zzPj(CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH)).intValue();
    }

    public final long getPageSize() {
        return com.aspose.words.internal.zzZPW.zzG((float) getPageWidth(), (float) getPageHeight());
    }

    public int getPageStartingNumber() {
        return ((Integer) zzPj(2200)).intValue();
    }

    public double getPageWidth() {
        return ((double) ((Integer) zzPj(2260)).intValue()) / 20.0d;
    }

    public int getPaperSize() {
        return zzY0C.zzX(((Integer) zzPj(2260)).intValue(), ((Integer) zzPj(2270)).intValue(), zzZ3());
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZQH<Integer, Integer> getPossibleBorderKeys() {
        return zzXH4;
    }

    public boolean getRestartPageNumbering() {
        return ((Boolean) zzPj(2050)).booleanValue();
    }

    public double getRightMargin() {
        return ((double) ((Integer) zzPj(2290)).intValue()) / 20.0d;
    }

    public boolean getRtlGutter() {
        return ((Boolean) zzPj(2410)).booleanValue();
    }

    public int getSectionStart() {
        return ((Integer) zzPj(2030)).intValue();
    }

    public int getSheetsPerBooklet() {
        return this.zzYSi.zzYVW;
    }

    public boolean getSuppressEndnotes() {
        return ((Boolean) zzPj(2100)).booleanValue();
    }

    public TextColumnCollection getTextColumns() {
        if (this.zzXH5 == null) {
            this.zzXH5 = new TextColumnCollection(this);
        }
        return this.zzXH5;
    }

    public int getTextOrientation() {
        return zzY5T.zzjK(zzYLa());
    }

    public double getTopMargin() {
        return ((double) ((Integer) zzPj(2300)).intValue()) / 20.0d;
    }

    public int getVerticalAlignment() {
        return ((Integer) zzPj(2340)).intValue();
    }

    public void setBidi(boolean z) {
        this.zzYKZ.setSectionAttr(2450, Boolean.valueOf(z));
    }

    public void setBorderAlwaysInFront(boolean z) {
        this.zzYKZ.setSectionAttr(2230, Boolean.valueOf(z));
    }

    public void setBorderAppliesTo(int i) {
        this.zzYKZ.setSectionAttr(2220, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public void setBorderAttr(int i, Object obj) {
        this.zzYKZ.setSectionAttr(i, obj);
    }

    public void setBorderDistanceFrom(int i) {
        this.zzYKZ.setSectionAttr(2240, Integer.valueOf(i));
    }

    public void setBorderSurroundsFooter(boolean z) {
        this.zzYSi.zzYWs = !z;
    }

    public void setBorderSurroundsHeader(boolean z) {
        this.zzYSi.zzYWt = !z;
    }

    public void setBottomMargin(double d) {
        this.zzYKZ.setSectionAttr(2310, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setChapterPageSeparator(int i) {
        this.zzYKZ.setSectionAttr(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, Integer.valueOf(i));
    }

    public void setCharactersPerLine(int i) {
        if (getCharactersPerLine() != i) {
            Style byStyleIdentifier = this.zzYSm.getByStyleIdentifier(0);
            com.aspose.words.internal.zzZ4.zzZ(i, 1, (int) com.aspose.words.internal.zzZKQ.zzZb(getTextColumns().getWidth() / (byStyleIdentifier.getFont().getSize() * 0.9d)), "CharsPerLine");
            zzvD((int) com.aspose.words.internal.zzZKQ.zzZb(((getTextColumns().getWidth() / ((double) i)) - byStyleIdentifier.getFont().getSize()) * 4096.0d));
        }
    }

    public void setDifferentFirstPageHeaderFooter(boolean z) {
        this.zzYKZ.setSectionAttr(2040, Boolean.valueOf(z));
    }

    public void setFirstPageTray(int i) {
        this.zzYKZ.setSectionAttr(EditingLanguage.PORTUGUESE_PORTUGAL, Integer.valueOf(i));
    }

    public void setFooterDistance(double d) {
        this.zzYKZ.setSectionAttr(2330, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setGutter(double d) {
        this.zzYKZ.setSectionAttr(2312, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setHeaderDistance(double d) {
        this.zzYKZ.setSectionAttr(2320, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setHeadingLevelForChapter(int i) {
        this.zzYKZ.setSectionAttr(2190, Integer.valueOf(i));
    }

    public void setLayoutMode(int i) {
        zzQ(2430, Integer.valueOf(i));
    }

    public void setLeftMargin(double d) {
        zzQ(2280, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setLineNumberCountBy(int i) {
        this.zzYKZ.setSectionAttr(2120, Integer.valueOf(i));
    }

    public void setLineNumberDistanceFromText(double d) {
        this.zzYKZ.setSectionAttr(2400, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setLineNumberRestartMode(int i) {
        this.zzYKZ.setSectionAttr(EditingLanguage.MALAY_BRUNEI_DARUSSALAM, Integer.valueOf(i));
    }

    public void setLineStartingNumber(int i) {
        this.zzYKZ.setSectionAttr(2180, Integer.valueOf(i));
    }

    public void setLinesPerPage(int i) {
        if (getLinesPerPage() != i) {
            com.aspose.words.internal.zzZ4.zzZ(i, 1, (int) com.aspose.words.internal.zzZKQ.zzZb((zzYpT() / this.zzYSm.getByStyleIdentifier(0).getFont().getSize()) / 1.36d), "LinesPerPage");
            zzQ(2170, Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZb((zzYpT() / ((double) i)) * 20.0d)));
        }
    }

    public void setMargins(int i) {
        zzZ3W.zzZ zzzZzqH = zzqH(i);
        zzQ(2280, Integer.valueOf(zzzZzqH.getLeft()));
        zzQ(2290, Integer.valueOf(zzzZzqH.getRight()));
        zzQ(2300, Integer.valueOf(zzzZzqH.getTop()));
        zzQ(2310, Integer.valueOf(zzzZzqH.getBottom()));
        if (i == 4) {
            this.zzYSi.zzYWh = 1;
        }
    }

    public void setMultiplePages(int i) {
        this.zzYSi.zzYWh = i;
    }

    public void setOddAndEvenPagesHeaderFooter(boolean z) {
        this.zzYSi.zzYVX = z;
    }

    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.zzYKZ.setSectionAttr(2210, Integer.valueOf(i));
            double pageWidth = getPageWidth();
            setPageWidth(getPageHeight());
            setPageHeight(pageWidth);
        }
    }

    public void setOtherPagesTray(int i) {
        this.zzYKZ.setSectionAttr(2080, Integer.valueOf(i));
    }

    public void setPageHeight(double d) {
        this.zzYKZ.setSectionAttr(2270, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setPageNumberStyle(int i) {
        this.zzYKZ.setSectionAttr(CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH, Integer.valueOf(i));
    }

    public void setPageStartingNumber(int i) {
        this.zzYKZ.setSectionAttr(2200, Integer.valueOf(i));
    }

    public void setPageWidth(double d) {
        zzQ(2260, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setPaperSize(int i) {
        if (i == 17) {
            return;
        }
        long jZzhA = zzY0C.zzhA(i);
        if (zzZ3()) {
            this.zzYKZ.setSectionAttr(2260, Integer.valueOf((int) (jZzhA >>> 32)));
            this.zzYKZ.setSectionAttr(2270, Integer.valueOf((int) jZzhA));
        } else {
            this.zzYKZ.setSectionAttr(2260, Integer.valueOf((int) jZzhA));
            this.zzYKZ.setSectionAttr(2270, Integer.valueOf((int) (jZzhA >>> 32)));
        }
    }

    public void setRestartPageNumbering(boolean z) {
        this.zzYKZ.setSectionAttr(2050, Boolean.valueOf(z));
    }

    public void setRightMargin(double d) {
        zzQ(2290, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setRtlGutter(boolean z) {
        this.zzYKZ.setSectionAttr(2410, Boolean.valueOf(z));
    }

    public void setSectionStart(int i) {
        this.zzYKZ.setSectionAttr(2030, Integer.valueOf(i));
    }

    public void setSheetsPerBooklet(int i) {
        this.zzYSi.zzYVW = i;
    }

    public void setSuppressEndnotes(boolean z) {
        this.zzYKZ.setSectionAttr(2100, Boolean.valueOf(z));
    }

    public void setTextOrientation(int i) {
        zzvC(zzY5T.zzjJ(i));
    }

    public void setTopMargin(double d) {
        this.zzYKZ.setSectionAttr(2300, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setVerticalAlignment(int i) {
        this.zzYKZ.setSectionAttr(2340, Integer.valueOf(i));
    }

    public final void zzRE(boolean z) {
        this.zzYKZ.setSectionAttr(2390, Boolean.valueOf(z));
    }

    public final int zzYLa() {
        return ((Integer) zzPj(2440)).intValue();
    }

    public final int zzYLz() {
        return ((Integer) zzPj(2090)).intValue();
    }

    public final float zzYRW() {
        zzYN9 zzyn9ZzYJ5 = zzYJ5();
        return (float) (getPageHeight() - (((double) (zzyn9ZzYJ5.zzZt(1, true) + zzyn9ZzYJ5.zzZt(3, true))) / 20.0d));
    }

    public final float zzYRX() {
        zzYN9 zzyn9ZzYJ5 = zzYJ5();
        return (float) (getPageWidth() - (((double) (zzyn9ZzYJ5.zzZt(0, true) + zzyn9ZzYJ5.zzZt(2, true))) / 20.0d));
    }

    public final zzZ9E zzYpQ() {
        return this.zzYKZ;
    }

    public final boolean zzYpR() {
        return ((Boolean) zzPj(2390)).booleanValue();
    }

    public final double zzYpU() {
        return zzYpP() ? zzYRX() : zzYRW();
    }

    public final float zzYpV() {
        return zzYRW() + zzYpW();
    }

    public final float zzYpW() {
        return (float) (((double) zzYJ5().zzZt(1, true)) / 20.0d);
    }

    public final float zzYpX() {
        return zzYRX() + zzYpY();
    }

    public final float zzYpY() {
        return (float) (((double) zzYJ5().zzZt(0, true)) / 20.0d);
    }
}
