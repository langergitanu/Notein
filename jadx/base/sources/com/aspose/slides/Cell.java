package com.aspose.slides;

import com.aspose.slides.TextFrameFormat;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
public class Cell implements ICell, InterfaceC14397rj {

    /* JADX INFO: renamed from: c5 */
    private final CellFormat f1251c5;

    /* JADX INFO: renamed from: ck */
    private byte f1252ck;

    /* JADX INFO: renamed from: du */
    private Row f1253du;

    /* JADX INFO: renamed from: dy */
    private final TextFrame f1254dy;

    /* JADX INFO: renamed from: fa */
    private byte f1255fa;

    /* JADX INFO: renamed from: h4 */
    private Column f1256h4;

    /* JADX INFO: renamed from: jd */
    private xmh f1257jd;

    /* JADX INFO: renamed from: k4 */
    int f1258k4;

    /* JADX INFO: renamed from: kk */
    Cell f1259kk;

    /* JADX INFO: renamed from: m9 */
    private final C1163gv f1260m9;

    /* JADX INFO: renamed from: to */
    private final TextFrameFormat.AbstractC0653k4 f1261to;

    /* JADX INFO: renamed from: up */
    private boolean f1262up;

    /* JADX INFO: renamed from: x1 */
    int f1263x1;

    /* JADX INFO: renamed from: yj */
    private boolean f1264yj;

    public Cell(Row row, Column column) {
        TextFrameFormat.AbstractC0653k4 abstractC0653k4 = new TextFrameFormat.AbstractC0653k4() { // from class: com.aspose.slides.Cell.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Cell.OnTextFrameChanged()";
            }

            @Override // com.aspose.slides.TextFrameFormat.AbstractC0653k4
            /* JADX INFO: renamed from: k4 */
            public void mo481k4() {
                Cell.this.m458ks();
            }
        };
        this.f1261to = abstractC0653k4;
        this.f1260m9 = new C1163gv();
        this.f1258k4 = 1;
        this.f1263x1 = 1;
        this.f1259kk = null;
        this.f1257jd = new xmh();
        this.f1252ck = (byte) 0;
        this.f1255fa = (byte) 0;
        this.f1262up = false;
        this.f1264yj = true;
        xmh xmhVar = new xmh();
        this.f1257jd = xmhVar;
        xmhVar.f50160x1 = 7.2d;
        xmhVar.f50158kk = 3.6d;
        xmhVar.f50159to = 7.2d;
        xmhVar.f50157du = 3.6d;
        this.f1253du = row;
        this.f1256h4 = column;
        TextFrame textFrame = new TextFrame(this);
        this.f1254dy = textFrame;
        textFrame.f3519k4.f3536kk = abstractC0653k4;
        this.f1251c5 = new CellFormat(this);
        this.f1264yj = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ks */
    public void m458ks() {
        m480yj();
    }

    /* JADX INFO: renamed from: c5 */
    public final int m460c5() {
        return m462du().getColSpan() + m462du().m475to().m1139m9();
    }

    /* JADX INFO: renamed from: ck */
    public final CellFormat m461ck() {
        return this.f1251c5;
    }

    /* JADX INFO: renamed from: du */
    public final Cell m462du() {
        return m463dy() ? this.f1259kk : this;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m463dy() {
        return this.f1259kk != null;
    }

    /* JADX INFO: renamed from: fa */
    public final yin m464fa() {
        return m473kk().m2868ck().m67740k4(m475to().m1139m9(), m465h4().m2483m9());
    }

    @Override // com.aspose.slides.ICell
    public final boolean getAnchorCenter() {
        return this.f1262up;
    }

    @Override // com.aspose.slides.ICell
    public final ICellFormat getCellFormat() {
        return this.f1251c5;
    }

    @Override // com.aspose.slides.ICell
    public final int getColSpan() {
        return this.f1263x1;
    }

    @Override // com.aspose.slides.ICell
    public final IColumn getFirstColumn() {
        return m462du().m475to();
    }

    @Override // com.aspose.slides.ICell
    public final int getFirstColumnIndex() {
        return m462du().m475to().m1139m9();
    }

    @Override // com.aspose.slides.ICell
    public final IRow getFirstRow() {
        return m462du().m465h4();
    }

    @Override // com.aspose.slides.ICell
    public final int getFirstRowIndex() {
        return m462du().m465h4().m2483m9();
    }

    @Override // com.aspose.slides.ICell
    public final double getHeight() {
        Cell cellM462du = m462du();
        Row rowM2491k4 = m465h4().m2480h4().m2491k4((cellM462du.getRowSpan() + cellM462du.m465h4().m2483m9()) - 1);
        if (cellM462du.getRowSpan() == 1) {
            return rowM2491k4.getHeight();
        }
        return (rowM2491k4.getHeight() + rowM2491k4.m2479dy()) - cellM462du.m465h4().m2479dy();
    }

    @Override // com.aspose.slides.ICell
    public final double getMarginBottom() {
        return this.f1257jd.f50157du;
    }

    @Override // com.aspose.slides.ICell
    public final double getMarginLeft() {
        return this.f1257jd.f50160x1;
    }

    @Override // com.aspose.slides.ICell
    public final double getMarginRight() {
        return this.f1257jd.f50159to;
    }

    @Override // com.aspose.slides.ICell
    public final double getMarginTop() {
        return this.f1257jd.f50158kk;
    }

    @Override // com.aspose.slides.ICell
    public final double getMinimalHeight() {
        int firstRowIndex = getFirstRowIndex();
        RowCollection rowCollectionM2480h4 = m465h4().m2480h4();
        double minimalHeight = 0.0d;
        for (int i = 0; i < this.f1258k4; i++) {
            minimalHeight += rowCollectionM2480h4.m2491k4(firstRowIndex + i).getMinimalHeight();
        }
        return minimalHeight;
    }

    @Override // com.aspose.slides.ICell
    public final double getOffsetX() {
        return m462du().m475to().m1137dy();
    }

    @Override // com.aspose.slides.ICell
    public final double getOffsetY() {
        if (m473kk() != null && m473kk().m2594xw() != null && m473kk().m2594xw().getParentGroup() != null) {
            m473kk().m2546bz().mo5640kk();
        }
        return m462du().m465h4().m2479dy();
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1253du;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return m465h4().getPresentation();
    }

    @Override // com.aspose.slides.ICell
    public final int getRowSpan() {
        return this.f1258k4;
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        if (m465h4() != null) {
            return m465h4().getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.ICell
    public final ITable getTable() {
        return m473kk();
    }

    @Override // com.aspose.slides.ICell
    public final byte getTextAnchorType() {
        return this.f1255fa;
    }

    @Override // com.aspose.slides.ICell
    public final ITextFrame getTextFrame() {
        return this.f1254dy;
    }

    @Override // com.aspose.slides.ICell
    public final byte getTextVerticalType() {
        return this.f1252ck;
    }

    @Override // com.aspose.slides.ICell
    public final double getWidth() {
        Cell cellM462du = m462du();
        Column columnM1147k4 = m475to().m1138h4().m1147k4((cellM462du.getColSpan() + cellM462du.m475to().m1139m9()) - 1);
        if (cellM462du.getColSpan() == 1) {
            return columnM1147k4.getWidth();
        }
        return (columnM1147k4.getWidth() + columnM1147k4.m1137dy()) - cellM462du.m475to().m1137dy();
    }

    /* JADX INFO: renamed from: h4 */
    public final Row m465h4() {
        return this.f1253du;
    }

    @Override // com.aspose.slides.ICell
    public final boolean isMergedCell() {
        return m474m9() || m463dy();
    }

    /* JADX INFO: renamed from: jd */
    public final int m466jd() {
        return m462du().getRowSpan() + m462du().m465h4().m2483m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final Cell m467k4(int i) {
        Cell cellMo484k4 = m465h4().mo484k4(getFirstColumnIndex() + i);
        cellMo484k4.f1258k4 = this.f1258k4;
        cellMo484k4.f1263x1 = this.f1263x1 - i;
        this.f1263x1 = i;
        cellMo484k4.m479x1(false);
        cellMo484k4.m469k4(this);
        cellMo484k4.m472k4(true);
        ((TextFrame) cellMo484k4.getTextFrame()).m2916k4("");
        m472k4(true);
        m473kk().m2874rv();
        return cellMo484k4;
    }

    /* JADX INFO: renamed from: kk */
    public final Table m473kk() {
        return m465h4().mo485k4();
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m474m9() {
        return this.f1258k4 > 1 || this.f1263x1 > 1;
    }

    @Override // com.aspose.slides.ICell
    public final void setAnchorCenter(boolean z) {
        this.f1262up = z;
        m480yj();
        this.f1254dy.f3519k4.m2938bv();
    }

    @Override // com.aspose.slides.ICell
    public final void setMarginBottom(double d) {
        this.f1257jd.f50157du = d;
        m480yj();
    }

    @Override // com.aspose.slides.ICell
    public final void setMarginLeft(double d) {
        this.f1257jd.f50160x1 = d;
        m480yj();
    }

    @Override // com.aspose.slides.ICell
    public final void setMarginRight(double d) {
        this.f1257jd.f50159to = d;
        m480yj();
    }

    @Override // com.aspose.slides.ICell
    public final void setMarginTop(double d) {
        this.f1257jd.f50158kk = d;
        m480yj();
    }

    @Override // com.aspose.slides.ICell
    public final void setTextAnchorType(byte b) {
        if (b == -1) {
            throw new Exception(C14113y2.m67408k4("Value of Cell.TextAnchorType property cannot be ", "TextAnchorType.NotDefined. Set TextAnchorType.Top default value instead."));
        }
        this.f1255fa = b;
        m480yj();
        this.f1254dy.f3519k4.m2938bv();
    }

    @Override // com.aspose.slides.ICell
    public final void setTextVerticalType(byte b) {
        if (b == -1) {
            throw new Exception(C14113y2.m67408k4("Value of Cell.TextVerticalType property cannot be ", "TextVerticalType.NotDefined. Set TextVerticalType.Horizontal default value instead."));
        }
        this.f1252ck = b;
        m480yj();
    }

    @Override // com.aspose.slides.ICell
    public final void splitByColSpan(int i) {
        if (i < 1 || i >= this.f1263x1) {
            throw new ArgumentOutOfRangeException("Index must be grater than 0 and less than ColSpan.");
        }
        m467k4(i);
    }

    @Override // com.aspose.slides.ICell
    public final void splitByHeight(double d) {
        double dM67497to = C14116yg.m67497to(d * 12700.0d) / 12700.0d;
        double height = getHeight();
        if (dM67497to <= 0.0d || dM67497to >= height) {
            throw new ArgumentOutOfRangeException("Splitting height must be in greater than 0 and less than cell's minimal height");
        }
        RowCollection rowCollectionM2480h4 = m465h4().m2480h4();
        int firstRowIndex = getFirstRowIndex();
        int i = firstRowIndex;
        while (rowCollectionM2480h4.get_Item(i).getHeight() <= dM67497to) {
            dM67497to -= rowCollectionM2480h4.get_Item(i).getHeight();
            i++;
        }
        if (dM67497to > 3.937007874015748E-5d) {
            rowCollectionM2480h4.m2499x1(i, dM67497to);
            i++;
        }
        m477x1(i - firstRowIndex);
    }

    @Override // com.aspose.slides.ICell
    public final void splitByRowSpan(int i) {
        if (i < 1 || i >= this.f1258k4) {
            throw new ArgumentOutOfRangeException("Index must be greater than 0 and less than RowSpan.");
        }
        m477x1(i);
    }

    @Override // com.aspose.slides.ICell
    public final void splitByWidth(double d) {
        double width = getWidth();
        if (d <= 0.0d || d >= width) {
            throw new ArgumentOutOfRangeException("Splitting width must be in greater than 0 and less than cell's width");
        }
        ColumnCollection columnCollectionM1138h4 = m475to().m1138h4();
        int firstColumnIndex = getFirstColumnIndex();
        while (columnCollectionM1138h4.get_Item(firstColumnIndex).getWidth() <= d) {
            d -= columnCollectionM1138h4.get_Item(firstColumnIndex).getWidth();
            firstColumnIndex++;
        }
        if (d > 0.0d) {
            columnCollectionM1138h4.m1157x1(firstColumnIndex, d);
            firstColumnIndex++;
        }
        m467k4(firstColumnIndex - getFirstColumnIndex());
    }

    /* JADX INFO: renamed from: to */
    public final Column m475to() {
        return this.f1256h4;
    }

    /* JADX INFO: renamed from: up */
    public final void m476up() {
        this.f1259kk = null;
        this.f1253du = null;
        this.f1256h4 = null;
    }

    /* JADX INFO: renamed from: x1 */
    public final Cell m477x1(int i) {
        Cell cellMo484k4 = m475to().mo484k4(getFirstRowIndex() + i);
        cellMo484k4.f1263x1 = this.f1263x1;
        cellMo484k4.f1258k4 = this.f1258k4 - i;
        this.f1258k4 = i;
        cellMo484k4.m479x1(false);
        cellMo484k4.m469k4(this);
        ((TextFrame) cellMo484k4.getTextFrame()).m2916k4("");
        m473kk().m2874rv();
        return cellMo484k4;
    }

    /* JADX INFO: renamed from: yj */
    public final void m480yj() {
        if (this.f1264yj || m465h4() == null || m473kk() == null) {
            return;
        }
        this.f1264yj = true;
        m473kk().m2874rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final xmh m468k4() {
        return this.f1257jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final C1163gv m478x1() {
        return this.f1260m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m469k4(Cell cell) {
        this.f1254dy.m2910k4((ITextFrame) cell.f1254dy);
        ((LineFormat) this.f1251c5.getBorderLeft()).m1896k4(cell.f1251c5.getBorderLeft());
        ((LineFormat) this.f1251c5.getBorderTop()).m1896k4(cell.f1251c5.getBorderTop());
        ((LineFormat) this.f1251c5.getBorderRight()).m1896k4(cell.f1251c5.getBorderRight());
        ((LineFormat) this.f1251c5.getBorderBottom()).m1896k4(cell.f1251c5.getBorderBottom());
        ((LineFormat) this.f1251c5.getBorderDiagonalDown()).m1896k4(cell.f1251c5.getBorderDiagonalDown());
        ((LineFormat) this.f1251c5.getBorderDiagonalUp()).m1896k4(cell.f1251c5.getBorderDiagonalUp());
        ((FillFormat) this.f1251c5.getFillFormat()).m1456k4(cell.f1251c5.getFillFormat());
        cell.f1257jd.CloneTo(this.f1257jd);
        this.f1252ck = cell.f1252ck;
        this.f1255fa = cell.f1255fa;
        this.f1262up = cell.f1262up;
        m478x1().m6910k4(cell.m478x1());
    }

    /* JADX INFO: renamed from: k4 */
    private void m457k4(Cell cell, boolean z) {
        if (z && !"".equals(((TextFrame) cell.getTextFrame()).m2901c5())) {
            getTextFrame().getParagraphs().add(cell.getTextFrame().getParagraphs());
            ((TextFrame) cell.getTextFrame()).m2916k4("");
        }
        cell.f1259kk = this;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m479x1(boolean z) {
        this.f1259kk = null;
        if (m474m9()) {
            int firstRowIndex = getFirstRowIndex();
            int firstColumnIndex = getFirstColumnIndex();
            Row rowM2491k4 = m465h4().m2480h4().m2491k4(firstRowIndex);
            int i = 1;
            while (true) {
                if (i >= this.f1263x1) {
                    break;
                }
                int i2 = firstColumnIndex + i;
                if (i2 > rowM2491k4.size() - 1) {
                    this.f1263x1 = i;
                    break;
                } else {
                    m457k4(rowM2491k4.mo484k4(i2), z);
                    i++;
                }
            }
            for (int i3 = 1; i3 < this.f1258k4; i3++) {
                int i4 = firstRowIndex + i3;
                if (i4 > m465h4().m2480h4().size() - 1) {
                    this.f1258k4 = i3;
                    return;
                }
                Row rowM2491k42 = m465h4().m2480h4().m2491k4(i4);
                for (int i5 = 0; i5 < this.f1263x1; i5++) {
                    m457k4(rowM2491k42.mo484k4(firstColumnIndex + i5), z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m470k4(ITextFrameFormat iTextFrameFormat) {
        if (iTextFrameFormat.getAnchoringType() != -1) {
            this.f1255fa = iTextFrameFormat.getAnchoringType();
        }
        if (iTextFrameFormat.getTextVerticalType() != -1) {
            this.f1252ck = iTextFrameFormat.getTextVerticalType();
        }
        TextFrameFormat.m2933k4(iTextFrameFormat).m73500k4(this.f1257jd.Clone()).CloneTo(this.f1257jd);
        m480yj();
        this.f1254dy.f3519k4.m2938bv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m471k4(xmh xmhVar) {
        xmhVar.CloneTo(this.f1257jd);
        m480yj();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m472k4(boolean z) {
        if (z) {
            m480yj();
        } else {
            this.f1264yj = false;
        }
    }
}
