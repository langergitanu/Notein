package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.common.primitives.SignedBytes;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Table extends GraphicalObject implements ITable {

    /* JADX INFO: renamed from: du */
    private final TableFormat f3491du;

    /* JADX INFO: renamed from: h4 */
    private byte f3492h4;

    /* JADX INFO: renamed from: k4 */
    final RowCollection f3493k4;

    /* JADX INFO: renamed from: kk */
    C14047bz f3494kk;

    /* JADX INFO: renamed from: to */
    private muz f3495to;

    /* JADX INFO: renamed from: x1 */
    final ColumnCollection f3496x1;

    public Table(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj, new ycb());
        this.f3494kk = C14047bz.f47172k4.Clone();
        this.f3491du = new TableFormat(this);
        RowCollection rowCollection = new RowCollection(this);
        this.f3493k4 = rowCollection;
        this.f3496x1 = rowCollection.f3252kk;
        m2560k4(new sx3(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x019a  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ILineFormat m2867x1(Cell cell, Cell cell2, boolean z) {
        ILineFormat borderBottom;
        ILineFormat borderTop = null;
        if (cell == null && cell2 == null) {
            return null;
        }
        if (cell == null) {
            ICellFormat cellFormat = cell2.getCellFormat();
            ILineFormat borderLeft = z ? cellFormat.getBorderLeft() : cellFormat.getBorderTop();
            if (cell2.m463dy()) {
                ICellFormat cellFormat2 = cell2.m462du().getCellFormat();
                ILineFormat borderLeft2 = z ? cellFormat2.getBorderLeft() : cellFormat2.getBorderTop();
                if (borderLeft2.getFillFormat().getFillType() != -1) {
                    return borderLeft2;
                }
            }
            return borderLeft;
        }
        if (cell2 == null) {
            ICellFormat cellFormat3 = cell.getCellFormat();
            ILineFormat borderRight = z ? cellFormat3.getBorderRight() : cellFormat3.getBorderBottom();
            if (cell.m463dy()) {
                ICellFormat cellFormat4 = cell.m462du().getCellFormat();
                ILineFormat borderRight2 = z ? cellFormat4.getBorderRight() : cellFormat4.getBorderBottom();
                if (borderRight2.getFillFormat().getFillType() != -1) {
                    return borderRight2;
                }
            }
            return borderRight;
        }
        if (cell2.m463dy() && cell2.m462du() == cell.m462du()) {
            return null;
        }
        ICellFormat cellFormat5 = cell.getCellFormat();
        ILineFormat borderRight3 = z ? cellFormat5.getBorderRight() : cellFormat5.getBorderBottom();
        ICellFormat cellFormat6 = cell2.getCellFormat();
        ILineFormat borderLeft3 = z ? cellFormat6.getBorderLeft() : cellFormat6.getBorderTop();
        boolean z2 = false;
        boolean z3 = borderRight3.getFillFormat().getFillType() == -1;
        boolean z4 = borderLeft3.getFillFormat().getFillType() == -1;
        if (z3 && z4) {
            return z ? cell.m462du().m465h4().m2483m9() > cell2.m462du().m465h4().m2483m9() ? cell.m462du().getCellFormat().getBorderRight() : cell2.m462du().getCellFormat().getBorderLeft() : cell.m462du().m475to().m1139m9() > cell2.m462du().m475to().m1139m9() ? cell.m462du().getCellFormat().getBorderBottom() : cell2.m462du().getCellFormat().getBorderTop();
        }
        if (cell.m463dy()) {
            ICellFormat cellFormat7 = cell.m462du().getCellFormat();
            if (z) {
                borderBottom = (cellFormat7.getBorderRight().getFillFormat().getFillType() == 0 || cell.m462du().m465h4().m2483m9() >= cell2.m462du().m465h4().m2483m9()) ? cell.m462du().getCellFormat().getBorderRight() : null;
                if (borderBottom != null && borderBottom.getFillFormat().getFillType() != -1) {
                    borderRight3 = borderBottom;
                }
            } else {
                if (cellFormat7.getBorderBottom().getFillFormat().getFillType() == 0 || cell.m462du().m475to().m1139m9() >= cell2.m462du().m475to().m1139m9()) {
                    borderBottom = cell.m462du().getCellFormat().getBorderBottom();
                }
                if (borderBottom != null) {
                    borderRight3 = borderBottom;
                }
            }
        }
        if (cell2.m463dy()) {
            if (z) {
                if (cell2.m462du().getCellFormat().getBorderLeft().getFillFormat().getFillType() == 0 || cell.m462du().m465h4().m2483m9() <= cell2.m462du().m465h4().m2483m9()) {
                    borderTop = cell2.m462du().getCellFormat().getBorderLeft();
                }
            } else if (cell2.m462du().getCellFormat().getBorderTop().getFillFormat().getFillType() == 0 || cell.m462du().m475to().m1139m9() <= cell2.m462du().m475to().m1139m9()) {
                borderTop = cell2.m462du().getCellFormat().getBorderTop();
            }
            if (borderTop != null && borderTop.getFillFormat().getFillType() != -1) {
                borderLeft3 = borderTop;
            }
        }
        boolean z5 = borderRight3.getFillFormat().getFillType() == -1 || (cell.m463dy() && ((LineFormat) borderRight3).getParent_Immediate() == ((InterfaceC14397rj) cell.getCellFormat()));
        if (borderLeft3.getFillFormat().getFillType() == -1 || (cell2.m463dy() && ((LineFormat) borderLeft3).getParent_Immediate() == ((InterfaceC14397rj) cell2.getCellFormat()))) {
            z2 = true;
        }
        return (!z5 || z2) ? borderRight3 : borderLeft3;
    }

    /* JADX INFO: renamed from: ck */
    public final muz m2868ck() {
        if (this.f3495to == null) {
            this.f3495to = new muz(this);
        }
        return this.f3495to;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: dy */
    public void mo277dy() {
        IGenericEnumerator<IRow> it = getRows().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<ICell> it2 = ((Row) it.next()).iterator();
                while (it2.hasNext()) {
                    try {
                        ((Cell) it2.next()).m472k4(false);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        m2870k4().m70838to();
    }

    @Override // com.aspose.slides.ITable
    public final IColumnCollection getColumns() {
        return this.f3496x1;
    }

    @Override // com.aspose.slides.ITable
    public final boolean getFirstCol() {
        return (this.f3492h4 & 4) != 0;
    }

    @Override // com.aspose.slides.ITable
    public final boolean getFirstRow() {
        return (this.f3492h4 & 2) != 0;
    }

    @Override // com.aspose.slides.ITable
    public final boolean getHorizontalBanding() {
        return (this.f3492h4 & 32) != 0;
    }

    @Override // com.aspose.slides.ITable
    public final boolean getLastCol() {
        return (this.f3492h4 & 16) != 0;
    }

    @Override // com.aspose.slides.ITable
    public final boolean getLastRow() {
        return (this.f3492h4 & 8) != 0;
    }

    @Override // com.aspose.slides.ITable
    public final boolean getRightToLeft() {
        return (this.f3492h4 & 1) != 0;
    }

    @Override // com.aspose.slides.ITable
    public final IRowCollection getRows() {
        return this.f3493k4;
    }

    @Override // com.aspose.slides.ITable
    public final int getStylePreset() {
        return C14047bz.m66535k4(this.f3494kk, C14047bz.f47172k4) ? m2875to() == null ? 0 : -1 : ((Presentation) getPresentation()).m2394uz().m68915x1(this.f3494kk.Clone());
    }

    @Override // com.aspose.slides.ITable
    public final ITableFormat getTableFormat() {
        return this.f3491du;
    }

    @Override // com.aspose.slides.ITable
    public final boolean getVerticalBanding() {
        return (this.f3492h4 & SignedBytes.MAX_POWER_OF_TWO) != 0;
    }

    @Override // com.aspose.slides.ITable
    public final ICell get_Item(int i, int i2) {
        return this.f3493k4.get_Item(i2).get_Item(i);
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: ix */
    public IFillFormatEffectiveData mo1585ix() {
        return getTableFormat().getEffective().getFillFormat();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: jd */
    public void mo280jd() {
        super.mo280jd();
        m2559k4(((Slide) m2583vj()).m2687bv().m406x1(getPlaceholder().getIndex()).m2593xk());
    }

    /* JADX INFO: renamed from: k4 */
    public final Cell m2869k4(int i, int i2) {
        return this.f3493k4.m2491k4(i2).mo484k4(i);
    }

    @Override // com.aspose.slides.GraphicalObject
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ycb mo272to() {
        return (ycb) super.mo272to();
    }

    @Override // com.aspose.slides.ITable
    public final ICell mergeCells(ICell iCell, ICell iCell2, boolean z) {
        Cell cell = (Cell) iCell;
        Cell cell2 = (Cell) iCell2;
        if (cell == cell2) {
            return cell;
        }
        int iM67507x1 = C14116yg.m67507x1(cell.getFirstColumnIndex(), cell2.getFirstColumnIndex());
        int iM67507x12 = C14116yg.m67507x1(cell.getFirstRowIndex(), cell2.getFirstRowIndex());
        int iM67483k4 = C14116yg.m67483k4(cell.m460c5(), cell2.m460c5());
        int iM67483k42 = C14116yg.m67483k4(cell.m466jd(), cell2.m466jd());
        int colSpan = iM67507x1;
        while (colSpan < iM67483k4) {
            IColumn iColumn = this.f3496x1.get_Item(colSpan);
            Cell cell3 = (Cell) iColumn.get_Item(iM67507x12);
            int firstRowIndex = cell3.getFirstRowIndex();
            if (firstRowIndex < iM67507x12) {
                if (!z) {
                    throw new PptxEditException("Can't break merged cells");
                }
                cell3.m477x1(iM67507x12 - firstRowIndex);
            }
            Cell cell4 = (Cell) iColumn.get_Item(iM67483k42 - 1);
            int firstRowIndex2 = cell4.getFirstRowIndex();
            if (cell4.getRowSpan() + firstRowIndex2 > iM67483k42) {
                if (!z) {
                    throw new PptxEditException("Can't break merged cells");
                }
                cell4.m477x1(iM67483k42 - firstRowIndex2);
            }
            colSpan += cell4.getColSpan();
        }
        int rowSpan = iM67507x12;
        while (rowSpan < iM67483k42) {
            Row rowM2491k4 = this.f3493k4.m2491k4(rowSpan);
            Cell cell5 = (Cell) rowM2491k4.get_Item(iM67507x1);
            int firstColumnIndex = cell5.getFirstColumnIndex();
            if (firstColumnIndex < iM67507x1) {
                if (!z) {
                    throw new PptxEditException("Can't break merged cells");
                }
                cell5.m467k4(iM67507x1 - firstColumnIndex);
            }
            Cell cell6 = (Cell) rowM2491k4.get_Item(iM67483k4 - 1);
            int firstColumnIndex2 = cell6.getFirstColumnIndex();
            if (cell6.getColSpan() + firstColumnIndex2 > iM67483k4) {
                if (!z) {
                    throw new PptxEditException("Can't break merged cells");
                }
                cell6.m467k4(iM67483k42 - firstColumnIndex2);
            }
            rowSpan += cell6.getRowSpan();
        }
        Cell cellM2869k4 = m2869k4(iM67507x1, iM67507x12);
        cellM2869k4.f1259kk = null;
        int i = iM67483k4 - iM67507x1;
        cellM2869k4.f1263x1 = i;
        int i2 = iM67483k42 - iM67507x12;
        cellM2869k4.f1258k4 = i2;
        cellM2869k4.m479x1(true);
        this.f3493k4.m2494k4(iM67507x12, i2);
        this.f3496x1.m1151k4(iM67507x1, i);
        m2874rv();
        return cellM2869k4;
    }

    /* JADX INFO: renamed from: rv */
    public final void m2874rv() {
        m2870k4().m70839x1();
        this.f3495to = null;
    }

    @Override // com.aspose.slides.ITable
    public final void setFirstCol(boolean z) {
        this.f3492h4 = (byte) (z ? (this.f3492h4 & 255) | 4 : this.f3492h4 & 251);
        m2874rv();
    }

    @Override // com.aspose.slides.ITable
    public final void setFirstRow(boolean z) {
        this.f3492h4 = (byte) (z ? (this.f3492h4 & 255) | 2 : this.f3492h4 & 253);
        m2874rv();
    }

    @Override // com.aspose.slides.ITable
    public final void setHorizontalBanding(boolean z) {
        this.f3492h4 = (byte) (z ? (this.f3492h4 & 255) | 32 : this.f3492h4 & 223);
        m2874rv();
    }

    @Override // com.aspose.slides.ITable
    public final void setLastCol(boolean z) {
        this.f3492h4 = (byte) (z ? (this.f3492h4 & 255) | 16 : this.f3492h4 & 239);
        m2874rv();
    }

    @Override // com.aspose.slides.ITable
    public final void setLastRow(boolean z) {
        this.f3492h4 = (byte) (z ? (this.f3492h4 & 255) | 8 : this.f3492h4 & 247);
        m2874rv();
    }

    @Override // com.aspose.slides.ITable
    public final void setRightToLeft(boolean z) {
        this.f3492h4 = (byte) (z ? (this.f3492h4 & 255) | 1 : this.f3492h4 & 254);
    }

    @Override // com.aspose.slides.ITable
    public final void setStylePreset(int i) {
        if (i == 0) {
            m2871k4((x5o) null);
        } else {
            if (i != -1) {
                C14047bz c14047bzClone = ((Presentation) getPresentation()).m2394uz().m68911k4(i).Clone();
                if (C14047bz.m66535k4(c14047bzClone, C14047bz.f47172k4)) {
                    return;
                }
                c14047bzClone.CloneTo(this.f3494kk);
                m2871k4(((Presentation) getPresentation()).m2394uz().m68912k4(c14047bzClone.Clone()));
                m2874rv();
            }
            if (m2875to() == null) {
                m2871k4(new x5o(this, C14047bz.f47172k4.Clone(), null));
            }
        }
        C14047bz.f47172k4.CloneTo(this.f3494kk);
        m2874rv();
    }

    @Override // com.aspose.slides.IBulkTextFormattable
    public final void setTextFormat(IParagraphFormat iParagraphFormat) {
        IGenericEnumerator<IRow> it = this.f3493k4.iterator();
        while (it.hasNext()) {
            try {
                List.Enumerator<ICell> it2 = ((Row) it.next()).f3248to.iterator();
                while (it2.hasNext()) {
                    try {
                        IGenericEnumerator<IParagraph> it3 = ((Cell) it2.next()).getTextFrame().getParagraphs().iterator();
                        while (it3.hasNext()) {
                            try {
                                ((ParagraphFormat) ((Paragraph) it3.next()).getParagraphFormat()).m2195k4(iParagraphFormat);
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                                throw th;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    } catch (Throwable th2) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th2;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th3) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th3;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    @Override // com.aspose.slides.ITable
    public final void setVerticalBanding(boolean z) {
        this.f3492h4 = (byte) (z ? (this.f3492h4 & 255) | 64 : this.f3492h4 & 191);
        m2874rv();
    }

    /* JADX INFO: renamed from: to */
    public final x5o m2875to() {
        return mo271kk().m73837k4();
    }

    /* JADX INFO: renamed from: up */
    public final TableFormat m2876up() {
        return (TableFormat) getTableFormat();
    }

    /* JADX INFO: renamed from: yj */
    public final void m2877yj() {
        this.f3493k4.m2496kk();
        this.f3496x1.m1155to();
    }

    /* JADX INFO: renamed from: k4 */
    public static ILineFormat m2866k4(Cell cell, Cell cell2, boolean z) {
        if (cell == null && cell2 == null) {
            return null;
        }
        if (cell == null) {
            ILineFormat borderTop = cell2.getCellFormat().getBorderTop();
            if (z) {
                borderTop = cell2.getCellFormat().getBorderLeft();
            }
            if (borderTop.getFillFormat().getFillType() == -1 || borderTop.getFillFormat().getFillType() == 0) {
                ILineFormat borderTop2 = cell2.m462du().getCellFormat().getBorderTop();
                if (z) {
                    borderTop2 = cell2.m462du().getCellFormat().getBorderLeft();
                }
                if (borderTop2.getFillFormat().getFillType() != -1 && borderTop2.getFillFormat().getFillType() != 0) {
                    return borderTop2;
                }
            }
            return borderTop;
        }
        if (cell2 == null) {
            ILineFormat borderBottom = cell.getCellFormat().getBorderBottom();
            if (z) {
                borderBottom = cell.getCellFormat().getBorderRight();
            }
            if (borderBottom.getFillFormat().getFillType() == -1 || borderBottom.getFillFormat().getFillType() == 0) {
                ILineFormat borderBottom2 = cell.m462du().getCellFormat().getBorderBottom();
                if (z) {
                    borderBottom2 = cell.m462du().getCellFormat().getBorderRight();
                }
                if (borderBottom2.getFillFormat().getFillType() != -1 && borderBottom2.getFillFormat().getFillType() != 0) {
                    return borderBottom2;
                }
            }
            return borderBottom;
        }
        if (cell2.m463dy() && cell2.m462du() == cell.m462du()) {
            return null;
        }
        ILineFormat borderBottom3 = cell.getCellFormat().getBorderBottom();
        if (z) {
            borderBottom3 = cell.getCellFormat().getBorderRight();
        }
        ILineFormat borderTop3 = cell2.getCellFormat().getBorderTop();
        if (z) {
            borderTop3 = cell2.getCellFormat().getBorderLeft();
        }
        boolean z2 = true;
        boolean z3 = borderBottom3.getFillFormat().getFillType() == -1 || borderBottom3.getFillFormat().getFillType() == 0;
        if (borderTop3.getFillFormat().getFillType() != -1 && borderTop3.getFillFormat().getFillType() != 0) {
            z2 = false;
        }
        return (z3 && z2) ? z ? cell.m462du().m465h4().m2483m9() > cell2.m462du().m465h4().m2483m9() ? cell.m462du().getCellFormat().getBorderRight() : cell2.m462du().getCellFormat().getBorderLeft() : cell.m462du().m475to().m1139m9() > cell2.m462du().m475to().m1139m9() ? cell.m462du().getCellFormat().getBorderBottom() : cell2.m462du().getCellFormat().getBorderTop() : z2 ? borderBottom3 : borderTop3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IBulkTextFormattable
    public final void setTextFormat(IPortionFormat iPortionFormat) {
        IGenericEnumerator<IRow> it = this.f3493k4.iterator();
        while (it.hasNext()) {
            try {
                List.Enumerator<ICell> it2 = ((Row) it.next()).f3248to.iterator();
                while (it2.hasNext()) {
                    try {
                        IGenericEnumerator<IParagraph> it3 = ((Cell) it2.next()).getTextFrame().getParagraphs().iterator();
                        while (it3.hasNext()) {
                            try {
                                IGenericEnumerator<IPortion> it4 = ((Paragraph) it3.next()).getPortions().iterator();
                                while (it4.hasNext()) {
                                    try {
                                        ((PortionFormat) ((Portion) it4.next()).getPortionFormat()).m369x1((BasePortionFormat) iPortionFormat);
                                    } catch (Throwable th) {
                                        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                            it4.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                    it4.dispose();
                                }
                            } catch (Throwable th2) {
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                                throw th2;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    } catch (Throwable th3) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th3;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th4) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th4;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final sx3 m2870k4() {
        return (sx3) m2546bz();
    }

    @Override // com.aspose.slides.IBulkTextFormattable
    public final void setTextFormat(ITextFrameFormat iTextFrameFormat) {
        IGenericEnumerator<IRow> it = this.f3493k4.iterator();
        while (it.hasNext()) {
            try {
                List.Enumerator<ICell> it2 = ((Row) it.next()).f3248to.iterator();
                while (it2.hasNext()) {
                    try {
                        Cell cell = (Cell) it2.next();
                        ((TextFrameFormat) cell.getTextFrame().getTextFrameFormat()).m2972x1(iTextFrameFormat);
                        cell.m470k4(iTextFrameFormat);
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: k4 */
    public void mo282k4(float f, float f2, float f3) {
        boolean zM27456k4;
        super.mo282k4(f, f2, f3);
        IGenericEnumerator<IRow> it = this.f3493k4.iterator();
        while (it.hasNext()) {
            try {
                Row row = (Row) it.next();
                List.Enumerator<ICell> it2 = row.f3248to.iterator();
                while (it2.hasNext()) {
                    try {
                        Cell cell = (Cell) it2.next();
                        TextFrame textFrame = (TextFrame) cell.getTextFrame();
                        if (textFrame == null) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            if (zM27456k4) {
                                return;
                            } else {
                                return;
                            }
                        }
                        Shape[] shapeArrM2547c6 = m2547c6();
                        TextFrameFormat textFrameFormat = (TextFrameFormat) textFrame.getTextFrameFormat();
                        textFrameFormat.m2959m9().m2983k4(f3);
                        double d = f3;
                        cell.setMarginTop(cell.getMarginTop() * d);
                        cell.setMarginLeft(cell.getMarginLeft() * d);
                        cell.setMarginRight(cell.getMarginRight() * d);
                        cell.setMarginBottom(cell.getMarginBottom() * d);
                        IGenericEnumerator<IParagraph> it3 = textFrame.getParagraphs().iterator();
                        while (it3.hasNext()) {
                            try {
                                Paragraph paragraph = (Paragraph) it3.next();
                                paragraph.m2161k4().m2194k4(f3);
                                IGenericEnumerator<IPortion> it4 = paragraph.getPortions().iterator();
                                while (it4.hasNext()) {
                                    try {
                                        Portion portion = (Portion) it4.next();
                                        portion.m2295x1().m2306k4(f3);
                                        if (C14064he.m66715kk(portion.m2295x1().getFontHeight()) && shapeArrM2547c6.length == 0) {
                                            portion.m2295x1().setFontHeight(portion.m2295x1().m2305bv().m4837m9());
                                        }
                                    } catch (Throwable th) {
                                        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                            it4.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                    it4.dispose();
                                }
                            } catch (Throwable th2) {
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                                throw th2;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                        textFrameFormat.m2953k4(xmh.m73494k4(textFrameFormat.m2963to(), d).Clone());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                row.setMinimalHeight(row.getMinimalHeight() * ((double) f3));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<IColumn> it5 = this.f3496x1.iterator();
        while (it5.hasNext()) {
            try {
                IColumn next = it5.next();
                next.setWidth(next.getWidth() * ((double) f3));
            } finally {
                if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                    it5.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: k4 */
    public void mo2564k4(tbp tbpVar, tbp tbpVar2, C1258im c1258im) {
        super.mo2564k4(tbpVar.Clone(), tbpVar2.Clone(), c1258im.Clone());
        m2870k4().m70840x6();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2871k4(x5o x5oVar) {
        mo271kk().m73839k4(x5oVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2872k4(double[] dArr, double[] dArr2) {
        m2877yj();
        for (double d : dArr) {
            this.f3496x1.m1150k4(d);
        }
        for (double d2 : dArr2) {
            this.f3493k4.m2490k4(C14116yg.m67502x1(d2, 0.0d));
        }
        m2874rv();
    }
}
