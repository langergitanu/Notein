package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class MathMatrix extends MathElementBase implements IMathMatrix, InterfaceC14876z8 {

    /* JADX INFO: renamed from: c5 */
    private int f2774c5;

    /* JADX INFO: renamed from: ck */
    private final List<List<IMathElement>> f2775ck;

    /* JADX INFO: renamed from: du */
    private int f2776du;

    /* JADX INFO: renamed from: dy */
    private long f2777dy;

    /* JADX INFO: renamed from: fa */
    private int[] f2778fa;

    /* JADX INFO: renamed from: h4 */
    private long f2779h4;

    /* JADX INFO: renamed from: jd */
    private long f2780jd;

    /* JADX INFO: renamed from: k4 */
    final p8h f2781k4;

    /* JADX INFO: renamed from: m9 */
    private int f2782m9;

    /* JADX INFO: renamed from: to */
    private boolean f2783to;

    public MathMatrix(int i, int i2) {
        if (i < 1) {
            throw new ArgumentOutOfRangeException("rowCount");
        }
        if (i2 < 1) {
            throw new ArgumentOutOfRangeException("columnCount");
        }
        this.f2775ck = new List<>(i);
        for (int i3 = 0; i3 < i; i3++) {
            this.f2775ck.addItem(m1993k4(i2));
        }
        setHidePlaceholders(false);
        setBaseJustification(2);
        setMinColumnWidth(0L);
        setColumnGapRule(0);
        int[] iArr = new int[i2];
        this.f2778fa = iArr;
        setColumnsAlignment(0, ((long) iArr.length) & 4294967295L, 2);
        this.f2781k4 = new p8h();
    }

    /* JADX INFO: renamed from: k4 */
    private List<IMathElement> m1993k4(int i) {
        List<IMathElement> list = new List<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            list.addItem(null);
        }
        return list;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void deleteColumn(int i) {
        if (getColumnCount() == 1) {
            throw new InvalidOperationException("It is not allowed to delete the last existing column in the matrix");
        }
        List.Enumerator<List<IMathElement>> it = this.f2775ck.iterator();
        while (it.hasNext()) {
            try {
                it.next().removeAt(i);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void deleteRow(int i) {
        if (getRowCount() == 1) {
            throw new InvalidOperationException("It is not allowed to delete the last existing row in the matrix");
        }
        this.f2775ck.removeAt(i);
    }

    @Override // com.aspose.slides.IMathMatrix
    public final int getBaseJustification() {
        return this.f2776du;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        List.Enumerator<IMathElement> it;
        List.Enumerator<List<IMathElement>> it2 = this.f2775ck.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            try {
                it = it2.next().iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next() != null) {
                            i2++;
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } finally {
            }
        }
        if (i2 == 0) {
            return MathElementBase.f2751kk;
        }
        IMathElement[] iMathElementArr = new IMathElement[i2];
        List.Enumerator<List<IMathElement>> it3 = this.f2775ck.iterator();
        while (it3.hasNext()) {
            try {
                it = it3.next().iterator();
                while (it.hasNext()) {
                    try {
                        IMathElement next = it.next();
                        if (next != null) {
                            int i3 = i + 1;
                            iMathElementArr[i] = next;
                            i = i3;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        return iMathElementArr;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final int getColumnAlignment(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("columnIndex");
        }
        if (i < getColumnCount()) {
            return this.f2778fa[i];
        }
        throw new ArgumentOutOfRangeException("columnIndex");
    }

    @Override // com.aspose.slides.IMathMatrix
    public final int getColumnCount() {
        return this.f2775ck.get_Item(0).size();
    }

    @Override // com.aspose.slides.IMathMatrix
    public final long getColumnGap() {
        return this.f2777dy;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final int getColumnGapRule() {
        return this.f2782m9;
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2781k4;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final boolean getHidePlaceholders() {
        return this.f2783to;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final long getMinColumnWidth() {
        return this.f2779h4;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final int getRowCount() {
        return this.f2775ck.size();
    }

    @Override // com.aspose.slides.IMathMatrix
    public final long getRowGap() {
        return this.f2780jd;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final int getRowGapRule() {
        return this.f2774c5;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final IMathElement get_Item(int i, int i2) {
        return this.f2775ck.get_Item(i).get_Item(i2);
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void insertColumnAfter(int i) {
        insertColumnBefore(i + 1);
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void insertColumnBefore(int i) {
        List.Enumerator<List<IMathElement>> it = this.f2775ck.iterator();
        while (it.hasNext()) {
            try {
                it.next().insertItem(i, null);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void insertRowAfter(int i) {
        insertRowBefore(i + 1);
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void insertRowBefore(int i) {
        this.f2775ck.insertItem(i, m1993k4(getColumnCount()));
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void setBaseJustification(int i) {
        this.f2776du = i;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void setColumnAlignment(int i, int i2) {
        setColumnsAlignment(i, 1L, i2);
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void setColumnGap(long j) {
        this.f2777dy = j;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void setColumnGapRule(int i) {
        this.f2782m9 = i;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void setColumnsAlignment(int i, long j, int i2) {
        if (i < 0 || i >= getColumnCount()) {
            throw new ArgumentOutOfRangeException("columnIndex");
        }
        long j2 = j & 4294967295L;
        if (j2 >= 0) {
            long j3 = (((long) i) + j2) & 4294967295L;
            if (j3 <= getColumnCount()) {
                while (i < j3) {
                    this.f2778fa[i] = i2;
                    i++;
                }
                return;
            }
        }
        throw new ArgumentOutOfRangeException("columnsCount");
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void setHidePlaceholders(boolean z) {
        this.f2783to = z;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void setMinColumnWidth(long j) {
        this.f2779h4 = j;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void setRowGap(long j) {
        this.f2780jd = j;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void setRowGapRule(int i) {
        this.f2774c5 = i;
    }

    @Override // com.aspose.slides.IMathMatrix
    public final void set_Item(int i, int i2, IMathElement iMathElement) {
        this.f2775ck.get_Item(i).set_Item(i2, iMathElement);
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4388k4(this);
    }
}
