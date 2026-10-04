package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p077d8.C3057he;
import com.aspose.slides.internal.p077d8.C3064jw;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Row extends CellCollection implements IRow {

    /* JADX INFO: renamed from: du */
    boolean f3243du;

    /* JADX INFO: renamed from: dy */
    private RowFormat f3244dy;

    /* JADX INFO: renamed from: h4 */
    private double f3245h4;

    /* JADX INFO: renamed from: kk */
    double f3246kk;

    /* JADX INFO: renamed from: m9 */
    private double f3247m9;

    /* JADX INFO: renamed from: to */
    List<ICell> f3248to;

    /* JADX INFO: renamed from: x1 */
    int f3249x1;

    public Row(RowCollection rowCollection, double d) {
        super(rowCollection);
        this.f3249x1 = -1;
        this.f3246kk = 0.0d;
        this.f3248to = new List<>();
        this.f3243du = false;
        this.f3245h4 = d;
        this.f3247m9 = d;
        this.f3244dy = new RowFormat(this);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m2478c5() {
        if (this.f3243du) {
            return;
        }
        this.f3243du = true;
        int colSpan = 0;
        while (colSpan < size()) {
            if (mo484k4(colSpan) == null) {
                throw new NullReferenceException("Cell couldn't be empty.");
            }
            Cell cellM462du = mo484k4(colSpan).m462du();
            cellM462du.m480yj();
            colSpan += cellM462du.getColSpan();
        }
        mo485k4().m2874rv();
    }

    /* JADX INFO: renamed from: dy */
    public final double m2479dy() {
        m2480h4().m2489h4();
        return this.f3246kk;
    }

    @Override // com.aspose.slides.IRow
    public final double getHeight() {
        mo485k4().m2870k4().m70837kk(false);
        return this.f3247m9;
    }

    @Override // com.aspose.slides.IRow
    public final double getMinimalHeight() {
        return this.f3245h4;
    }

    @Override // com.aspose.slides.IRow
    public final IRowFormat getRowFormat() {
        return this.f3244dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final RowCollection m2480h4() {
        return (RowCollection) C7019kk.m27452k4((Object) getParent_Immediate(), RowCollection.class);
    }

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: k4 */
    public Cell mo484k4(int i) {
        if (i < 0 || i >= size()) {
            return null;
        }
        return (Cell) this.f3248to.get_Item(i);
    }

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: kk */
    public IGenericEnumerator<ICell> mo487kk() {
        return new C3057he(this.f3248to.iterator().Clone(), CellCollection.f1267k4, null);
    }

    /* JADX INFO: renamed from: m9 */
    public final int m2483m9() {
        m2480h4().m2488du();
        return this.f3249x1;
    }

    @Override // com.aspose.slides.IRow
    public final void setMinimalHeight(double d) {
        if (C14044b3.m66439x1(d)) {
            d = 0.0d;
        }
        this.f3245h4 = d;
        if (this.f3245h4 != this.f3247m9) {
            m2478c5();
        }
    }

    @Override // com.aspose.slides.IBulkTextFormattable
    public final void setTextFormat(IParagraphFormat iParagraphFormat) {
        List.Enumerator<ICell> it = this.f3248to.iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IParagraph> it2 = ((Cell) it.next()).getTextFrame().getParagraphs().iterator();
                while (it2.hasNext()) {
                    try {
                        ((ParagraphFormat) ((Paragraph) it2.next()).getParagraphFormat()).m2195k4(iParagraphFormat);
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

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: to */
    public IGenericEnumerator<ICell> mo488to() {
        return new C3064jw(this.f3248to.iteratorJava().Clone(), CellCollection.f1267k4, null);
    }

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: x1 */
    public int mo489x1() {
        return this.f3248to.size();
    }

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: k4 */
    public Table mo485k4() {
        return m2480h4().m2493k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IBulkTextFormattable
    public final void setTextFormat(IPortionFormat iPortionFormat) {
        List.Enumerator<ICell> it = this.f3248to.iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IParagraph> it2 = ((Cell) it.next()).getTextFrame().getParagraphs().iterator();
                while (it2.hasNext()) {
                    try {
                        IGenericEnumerator<IPortion> it3 = ((Paragraph) it2.next()).getPortions().iterator();
                        while (it3.hasNext()) {
                            try {
                                ((PortionFormat) ((Portion) it3.next()).getPortionFormat()).m369x1((BasePortionFormat) iPortionFormat);
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

    /* JADX INFO: renamed from: x1 */
    public final void m2484x1(int i) {
        if (this.f3248to.size() < i) {
            m2482k4(-1, i - this.f3248to.size());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2481k4(double d) {
        if (this.f3247m9 != d) {
            m2480h4().f3251k4 = false;
        }
        this.f3247m9 = d;
    }

    @Override // com.aspose.slides.IBulkTextFormattable
    public final void setTextFormat(ITextFrameFormat iTextFrameFormat) {
        List.Enumerator<ICell> it = this.f3248to.iterator();
        while (it.hasNext()) {
            try {
                Cell cell = (Cell) it.next();
                ((TextFrameFormat) cell.getTextFrame().getTextFrameFormat()).m2972x1(iTextFrameFormat);
                cell.m470k4(iTextFrameFormat);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2485x1(int i, int i2) {
        int i3 = 0;
        int i4 = i;
        while (i3 < i2) {
            int i5 = i4 + 1;
            Cell cellMo484k4 = mo484k4(i4);
            if (cellMo484k4 == null) {
                throw new NullReferenceException("Cell couldn't be empty.");
            }
            cellMo484k4.m476up();
            i3++;
            i4 = i5;
        }
        this.f3248to.removeRange(i, i2);
        mo485k4().m2874rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2482k4(int i, int i2) {
        if (i2 < 1) {
            return;
        }
        if (i < 0 || i >= size()) {
            while (i2 > 0) {
                i2--;
                Cell cell = new Cell(this, (Column) m2480h4().f3252kk.get_Item(this.f3248to.size()));
                this.f3248to.addItem(cell);
                cell.getTextFrame().setText("");
            }
        } else {
            while (i2 > 0) {
                i2--;
                this.f3248to.insertItem(i, new Cell(this, (Column) m2480h4().f3252kk.get_Item(i)));
                i++;
            }
        }
        mo485k4().m2874rv();
    }

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: k4 */
    public void mo486k4(AbstractC14092to abstractC14092to, int i) {
        if (size() < 1) {
            return;
        }
        this.f3248to.copyTo(abstractC14092to, i);
    }
}
