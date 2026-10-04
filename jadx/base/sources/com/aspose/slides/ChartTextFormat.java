package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class ChartTextFormat implements IChartTextFormat, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC14397rj f1521k4;

    /* JADX INFO: renamed from: x1 */
    private final TextFrameFormat f1524x1 = new TextFrameFormat(this);

    /* JADX INFO: renamed from: kk */
    private final ParagraphFormat f1522kk = new ParagraphFormat(this);

    /* JADX INFO: renamed from: to */
    private final ChartPortionFormat f1523to = new ChartPortionFormat(this);

    public ChartTextFormat(InterfaceC14397rj interfaceC14397rj) {
        this.f1521k4 = interfaceC14397rj;
    }

    @Override // com.aspose.slides.IChartTextFormat
    public final void copyFrom(ITextFrame iTextFrame) {
        if (iTextFrame == null) {
            return;
        }
        this.f1524x1.m2952k4((TextFrameFormat) iTextFrame.getTextFrameFormat());
        if (iTextFrame.getParagraphs().getCount() > 0) {
            this.f1522kk.m2196k4((ParagraphFormat) iTextFrame.getParagraphs().get_Item(0).getParagraphFormat());
            this.f1523to.m361k4((BasePortionFormat) iTextFrame.getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat());
        }
    }

    @Override // com.aspose.slides.IChartTextFormat
    public final void copyTo(ITextFrame iTextFrame) {
        if (iTextFrame == null) {
            return;
        }
        ((TextFrameFormat) iTextFrame.getTextFrameFormat()).m2952k4(this.f1524x1);
        if (iTextFrame.getParagraphs().getCount() == 0) {
            iTextFrame.getParagraphs().add(new Paragraph());
        }
        ((ParagraphFormat) iTextFrame.getParagraphs().get_Item(0).getParagraphFormat()).m2196k4(this.f1522kk);
        ((PortionFormat) iTextFrame.getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat()).m361k4((BasePortionFormat) this.f1523to);
    }

    @Override // com.aspose.slides.IChartTextFormat
    public final IChartParagraphFormat getParagraphFormat() {
        return this.f1522kk;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1521k4;
    }

    @Override // com.aspose.slides.IChartTextFormat
    public final IChartPortionFormat getPortionFormat() {
        return this.f1523to;
    }

    @Override // com.aspose.slides.IChartTextFormat
    public final IChartTextBlockFormat getTextBlockFormat() {
        return this.f1524x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m753k4() {
        return ((((this.f1524x1.getVersion() & 4294967295L) + (this.f1522kk.getVersion() & 4294967295L)) & 4294967295L) + (this.f1523to.getVersion() & 4294967295L)) & 4294967295L;
    }
}
