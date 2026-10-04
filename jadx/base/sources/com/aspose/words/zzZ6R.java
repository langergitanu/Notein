package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6R implements Cloneable {
    private int zzYQD;
    private int zzYfA;
    private boolean zzYfB;
    private FixedPageSaveOptions zzYfC;
    private LayoutCollector zzYfD;
    private zzYJ7 zzYfE;
    private com.aspose.words.internal.zzPV zzYfF;
    private com.aspose.words.internal.zzPV zzYfG;
    private com.aspose.words.internal.zzPV zzYfH;
    private com.aspose.words.internal.zzPV zzYfI;
    private com.aspose.words.internal.zzPV zzYfJ;
    private com.aspose.words.internal.zzPV zzYfK;
    private com.aspose.words.internal.zzPV zzYfL;
    private com.aspose.words.internal.zzPV zzYfM;
    private com.aspose.words.internal.zzPV zzYfN;
    private com.aspose.words.internal.zzPV zzYfO;
    private com.aspose.words.internal.zzPV zzYfP;
    private com.aspose.words.internal.zzPV zzYfQ;
    private boolean zzYfR;
    private boolean zzYfS;
    private boolean zzYfT;
    private boolean zzYfU;
    private boolean zzYfV;
    private boolean zzYfW;
    private boolean zzYfX;
    private boolean zzYfY;
    private boolean zzYfZ;
    private boolean zzYfz;
    private boolean zzYg0;
    private int zzYg2;
    private boolean zzYg3;
    private IPageLayoutCallback zzYg4;
    private ITextShaperFactory zzYg5;
    private int zzYg6;
    private boolean zzYg7;
    private boolean zzYg8;
    private int zzZ0V;
    private int zzZCv;
    private boolean zzcd;
    private boolean zzrk;

    public zzZ6R() {
        com.aspose.words.internal.zzPV zzpv = com.aspose.words.internal.zzPV.zzHZ;
        this.zzYfQ = zzpv;
        this.zzYfP = zzpv;
        this.zzYfO = zzpv;
        this.zzYfN = zzpv;
        this.zzYfM = zzpv;
        this.zzYfL = zzpv;
        this.zzYfK = zzpv;
        this.zzYfJ = zzpv;
        this.zzYfI = zzpv;
        this.zzYfH = zzpv;
        this.zzYfG = zzpv;
        this.zzYfF = zzpv;
        this.zzYQD = 0;
        this.zzYg6 = 1;
        this.zzYfE = new zzYJ7();
        this.zzZ0V = 0;
        this.zzYfA = 0;
        this.zzYg3 = true;
        this.zzcd = false;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void setCommentDisplayMode(int i) {
        if (i == 2) {
            this.zzYfE.setShowInBalloons(0);
        }
        this.zzYg6 = i;
    }

    private void zzW(SaveOptions saveOptions, Document document) {
        FixedPageSaveOptions fixedPageSaveOptions = (FixedPageSaveOptions) com.aspose.words.internal.zzZKW.zzZ(saveOptions, FixedPageSaveOptions.class);
        if (fixedPageSaveOptions == null) {
            return;
        }
        int iZzZ9g = fixedPageSaveOptions.zzZ9g();
        zzZ(this.zzYQD != iZzZ9g, document);
        this.zzYQD = iZzZ9g;
    }

    private void zzX(SaveOptions saveOptions, Document document) {
        PdfSaveOptions pdfSaveOptions = (PdfSaveOptions) com.aspose.words.internal.zzZKW.zzZ(saveOptions, PdfSaveOptions.class);
        if (pdfSaveOptions == null) {
            return;
        }
        zzZ(this.zzYfY != pdfSaveOptions.zzYnw(), document);
        this.zzYfY = pdfSaveOptions.zzYnw();
    }

    private void zzY(SaveOptions saveOptions, Document document) {
        PdfSaveOptions pdfSaveOptions = (PdfSaveOptions) com.aspose.words.internal.zzZKW.zzZ(saveOptions, PdfSaveOptions.class);
        if (pdfSaveOptions != null) {
            zzZ(this.zzYg0 != pdfSaveOptions.zzYny(), document);
            this.zzYg0 = pdfSaveOptions.zzYny();
            this.zzYfZ = pdfSaveOptions.zzYny();
        } else {
            HtmlFixedSaveOptions htmlFixedSaveOptions = (HtmlFixedSaveOptions) com.aspose.words.internal.zzZKW.zzZ(saveOptions, HtmlFixedSaveOptions.class);
            if (htmlFixedSaveOptions != null) {
                this.zzYg0 = htmlFixedSaveOptions.getExportFormFields();
                this.zzYfZ = htmlFixedSaveOptions.getExportFormFields();
            }
        }
    }

    private static boolean zzxW(int i) {
        return i == 40 || i == 41;
    }

    private static int zzxX(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final IPageLayoutCallback getCallback() {
        return this.zzYg4;
    }

    public final int getCommentDisplayMode() {
        if (this.zzYg6 == 2) {
            this.zzYfE.setShowInBalloons(0);
        }
        return this.zzYg6;
    }

    public final int getContinuousSectionPageNumberingRestart() {
        return this.zzYg2;
    }

    public final boolean getKeepOriginalFontMetrics() {
        return this.zzcd;
    }

    public final int getNumeralFormat() {
        return this.zzYQD;
    }

    public final boolean getOptimizeOutput() {
        return this.zzrk;
    }

    public final ITextShaperFactory getTextShaperFactory() {
        return this.zzYg5;
    }

    public final void setTextShaperFactory(ITextShaperFactory iTextShaperFactory) {
        this.zzYg5 = iTextShaperFactory;
    }

    public final void zzUX(boolean z) {
        this.zzYfB = z;
    }

    public final void zzUY(boolean z) {
        this.zzYfR = z;
    }

    public final void zzUZ(boolean z) {
        this.zzYfS = z;
    }

    public final boolean zzYSL() {
        return this.zzYfz;
    }

    public final boolean zzYSM() {
        return this.zzYfB;
    }

    public final boolean zzYSN() {
        if (this.zzYg5 == null) {
            return false;
        }
        FixedPageSaveOptions fixedPageSaveOptions = this.zzYfC;
        return fixedPageSaveOptions == null || fixedPageSaveOptions.zzZ9d();
    }

    public final int zzYSO() {
        return this.zzYfA != 1 ? 0 : 1;
    }

    public final int zzYSP() {
        return zzxX(this.zzZ0V);
    }

    public final LayoutCollector zzYSQ() {
        return this.zzYfD;
    }

    public final zzYJ7 zzYSR() {
        return this.zzYfE;
    }

    public final com.aspose.words.internal.zzPV zzYSS() {
        return this.zzYfI;
    }

    public final com.aspose.words.internal.zzPV zzYST() {
        return this.zzYfJ;
    }

    public final com.aspose.words.internal.zzPV zzYSU() {
        return this.zzYfK;
    }

    public final com.aspose.words.internal.zzPV zzYSV() {
        return this.zzYfL;
    }

    public final com.aspose.words.internal.zzPV zzYSW() {
        return this.zzYfN;
    }

    public final com.aspose.words.internal.zzPV zzYSX() {
        return this.zzYfO;
    }

    public final com.aspose.words.internal.zzPV zzYSY() {
        return this.zzYfP;
    }

    public final com.aspose.words.internal.zzPV zzYSZ() {
        return this.zzYfQ;
    }

    public final boolean zzYT0() {
        return this.zzYg3;
    }

    public final boolean zzYT1() {
        return this.zzYfR;
    }

    public final boolean zzYT2() {
        return this.zzYfS;
    }

    public final boolean zzYT3() {
        return this.zzYfT;
    }

    public final boolean zzYT4() {
        return this.zzYfU || this.zzYg0;
    }

    public final boolean zzYT5() {
        return this.zzYfY;
    }

    public final boolean zzYT6() {
        return this.zzYfZ;
    }

    public final boolean zzYT7() {
        return this.zzYg0;
    }

    public final void zzYT8() {
        this.zzYfX = true;
    }

    public final boolean zzYT9() {
        return this.zzYfX;
    }

    public final boolean zzYTa() {
        return this.zzYg8;
    }

    public final boolean zzYTb() {
        return this.zzYfV;
    }

    public final boolean zzYTc() {
        return this.zzYg7;
    }

    public final boolean zzYTd() {
        return this.zzYfW;
    }

    public final FixedPageSaveOptions zzYTe() {
        if (this.zzYfC == null) {
            this.zzYfC = new PdfSaveOptions();
        }
        return this.zzYfC;
    }

    public final void zzYTf() {
        this.zzYfW = false;
        this.zzYfV = false;
        this.zzYg7 = false;
    }

    public final zzZ6R zzYTg() {
        return (zzZ6R) memberwiseClone();
    }

    public final void zzZ(LayoutCollector layoutCollector) {
        this.zzYfD = layoutCollector;
    }

    public final void zzl(Document document) {
        LayoutOptions layoutOptions = document.getLayoutOptions();
        if (layoutOptions.zzV0(true)) {
            this.zzYg8 = layoutOptions.getShowHiddenText();
            this.zzYg7 = layoutOptions.getShowParagraphMarks();
            setCommentDisplayMode(layoutOptions.getCommentDisplayMode());
            if (getCommentDisplayMode() == 2) {
                this.zzYfE.setShowInBalloons(0);
            }
            this.zzYg5 = layoutOptions.getTextShaperFactory();
            this.zzYg4 = layoutOptions.getCallback();
            this.zzYg3 = layoutOptions.getIgnorePrinterMetrics();
            this.zzcd = layoutOptions.getKeepOriginalFontMetrics();
            this.zzYg2 = layoutOptions.getContinuousSectionPageNumberingRestart();
        }
        RevisionOptions revisionOptions = layoutOptions.getRevisionOptions();
        if (revisionOptions.zzV0(true)) {
            this.zzYfE.zzRu(!revisionOptions.getShowRevisionMarks());
            this.zzYfE.zzRs(revisionOptions.getShowOriginalRevision());
            this.zzYfE.zzRt(true ^ revisionOptions.getShowRevisionBars());
            if (revisionOptions.getShowInBalloons() != 0 && getCommentDisplayMode() != 2) {
                this.zzYfE.setShowInBalloons(revisionOptions.getShowInBalloons());
            }
            this.zzYfE.zzZ(new zzYJ6[]{revisionOptions.zzYl2(), revisionOptions.zzYl1(), revisionOptions.zzYl0(), revisionOptions.zzYkZ(), revisionOptions.zzYkY()});
            com.aspose.words.internal.zzPV zzpvZzpx = zzYJB.zzpx(revisionOptions.getRevisionBarsColor());
            if (com.aspose.words.internal.zzPV.zzZ(zzpvZzpx, com.aspose.words.internal.zzPV.zzHZ) || com.aspose.words.internal.zzPV.zzZ(zzpvZzpx, com.aspose.words.internal.zzPV.zzI0)) {
                zzpvZzpx = zzYJB.zzXBv;
            }
            this.zzYfE.zzZO(zzpvZzpx);
            com.aspose.words.internal.zzPV zzpvZzpx2 = zzYJB.zzpx(revisionOptions.getCommentColor());
            if (com.aspose.words.internal.zzPV.zzZ(zzpvZzpx2, com.aspose.words.internal.zzPV.zzHZ) || zzpvZzpx2 == null) {
                zzpvZzpx2 = zzYJB.zzXBu;
            }
            this.zzYfE.zzZN(zzpvZzpx2);
            this.zzYfE.zzYa(revisionOptions.getRevisionBarsWidth());
            this.zzYfE.zzpr(revisionOptions.getRevisionBarsPosition());
        }
    }

    public final void zzZ(Document document, SaveOptions saveOptions) {
        if (!saveOptions.zzZ9f()) {
            this.zzYfC = (FixedPageSaveOptions) saveOptions;
        }
        if (this.zzYg5 != null) {
            zzZ(zzxW(this.zzZCv) != zzxW(saveOptions.getSaveFormat()), document);
            if (!zzxW(saveOptions.getSaveFormat()) && document.getWarningCallback() != null) {
                document.getWarningCallback().warning(zzY20.zzM("Text shaping is not supported for saving to the specified format.", null));
            }
        }
        this.zzZCv = saveOptions.getSaveFormat();
        zzZ(this.zzZ0V != saveOptions.getDmlEffectsRenderingMode(), document);
        this.zzZ0V = saveOptions.getDmlEffectsRenderingMode();
        this.zzrk = zzYTe().getOptimizeOutput();
        this.zzYfA = saveOptions.getDml3DEffectsRenderingMode();
        zzY(saveOptions, document);
        zzW(saveOptions, document);
        zzZ(saveOptions, document);
        zzX(saveOptions, document);
        zzZ(document.getLayoutOptions().zzV0(false), document);
        zzZ(document.getLayoutOptions().getRevisionOptions().zzV0(false), document);
    }

    private void zzZ(SaveOptions saveOptions, Document document) {
        PdfSaveOptions pdfSaveOptions = (PdfSaveOptions) com.aspose.words.internal.zzZKW.zzZ(saveOptions, PdfSaveOptions.class);
        if (pdfSaveOptions == null) {
            return;
        }
        zzZ(this.zzYfT != pdfSaveOptions.getCreateNoteHyperlinks(), document);
        this.zzYfT = pdfSaveOptions.getCreateNoteHyperlinks();
    }

    private static void zzZ(boolean z, Document document) {
        if (z && document.zzZqj()) {
            document.zzZqk();
        }
    }
}
