package com.aspose.slides;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3057he;
import com.aspose.slides.internal.p077d8.C3064jw;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Column extends CellCollection implements IColumn {

    /* JADX INFO: renamed from: du */
    private double f1993du;

    /* JADX INFO: renamed from: h4 */
    private ColumnFormat f1994h4;

    /* JADX INFO: renamed from: kk */
    double f1995kk;

    /* JADX INFO: renamed from: to */
    boolean f1996to;

    /* JADX INFO: renamed from: x1 */
    int f1997x1;

    public Column(ColumnCollection columnCollection, double d) {
        super(columnCollection);
        this.f1997x1 = -1;
        this.f1995kk = 0.0d;
        this.f1996to = false;
        this.f1993du = d;
        this.f1994h4 = new ColumnFormat(this);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m1136c5() {
        if (this.f1996to) {
            return;
        }
        this.f1996to = true;
        int rowSpan = 0;
        while (rowSpan < size()) {
            Cell cellM462du = mo484k4(rowSpan).m462du();
            cellM462du.m480yj();
            rowSpan += cellM462du.getRowSpan();
        }
        mo485k4().m2874rv();
    }

    /* JADX INFO: renamed from: dy */
    public final double m1137dy() {
        m1138h4().m1154m9();
        return this.f1995kk;
    }

    @Override // com.aspose.slides.IColumn
    public final IColumnFormat getColumnFormat() {
        return this.f1994h4;
    }

    @Override // com.aspose.slides.IColumn
    public final double getWidth() {
        return this.f1993du;
    }

    /* JADX INFO: renamed from: h4 */
    public final ColumnCollection m1138h4() {
        return (ColumnCollection) C7019kk.m27452k4((Object) getParent_Immediate(), ColumnCollection.class);
    }

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: k4 */
    public Cell mo484k4(int i) {
        return m1138h4().m1156x1().m2491k4(i).mo484k4(m1139m9());
    }

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: kk */
    public IGenericEnumerator<ICell> mo487kk() {
        List list = new List(size());
        for (int i = 0; i < size(); i++) {
            list.addItem(mo484k4(i));
        }
        return new C3057he(list.iterator().Clone(), CellCollection.f1267k4, null);
    }

    /* JADX INFO: renamed from: m9 */
    public final int m1139m9() {
        m1138h4().m1146h4();
        return this.f1997x1;
    }

    @Override // com.aspose.slides.IBulkTextFormattable
    public final void setTextFormat(IParagraphFormat iParagraphFormat) {
        IGenericEnumerator<IRow> it = mo485k4().getRows().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IParagraph> it2 = ((Row) it.next()).get_Item(m1139m9()).getTextFrame().getParagraphs().iterator();
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

    @Override // com.aspose.slides.IColumn
    public final void setWidth(double d) {
        if (this.f1993du != d) {
            m1138h4().m1145dy();
            m1136c5();
        }
        this.f1993du = d;
    }

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: to */
    public IGenericEnumerator<ICell> mo488to() {
        List list = new List(size());
        for (int i = 0; i < size(); i++) {
            list.addItem(mo484k4(i));
        }
        return new C3064jw(list.iteratorJava().Clone(), CellCollection.f1267k4, null);
    }

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: x1 */
    public int mo489x1() {
        return m1138h4().m1156x1().size();
    }

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: k4 */
    public Table mo485k4() {
        return m1138h4().m1149k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IBulkTextFormattable
    public final void setTextFormat(IPortionFormat iPortionFormat) {
        IGenericEnumerator<IRow> it = mo485k4().getRows().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IParagraph> it2 = ((Row) it.next()).get_Item(m1139m9()).getTextFrame().getParagraphs().iterator();
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

    @Override // com.aspose.slides.CellCollection
    /* JADX INFO: renamed from: k4 */
    public void mo486k4(AbstractC14092to abstractC14092to, int i) {
        if (size() < 1) {
            return;
        }
        ArrayList arrayList = new ArrayList(size());
        for (int i2 = 0; i2 < size(); i2++) {
            arrayList.addItem(get_Item(i2));
        }
        arrayList.copyTo(0, abstractC14092to, i, size());
    }

    @Override // com.aspose.slides.IBulkTextFormattable
    public final void setTextFormat(ITextFrameFormat iTextFrameFormat) {
        IGenericEnumerator<IRow> it = mo485k4().getRows().iterator();
        while (it.hasNext()) {
            try {
                Row row = (Row) it.next();
                ((TextFrameFormat) row.get_Item(m1139m9()).getTextFrame().getTextFrameFormat()).m2972x1(iTextFrameFormat);
                ((Cell) row.get_Item(m1139m9())).m470k4(iTextFrameFormat);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
