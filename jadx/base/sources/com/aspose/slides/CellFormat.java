package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class CellFormat extends PVIObject implements ICellFormat {

    /* JADX INFO: renamed from: k4 */
    static final AbstractC4682du<CellFormat, C1231hx, C1231hx> f1270k4 = new AbstractC4682du<CellFormat, C1231hx, C1231hx>() { // from class: com.aspose.slides.CellFormat.5
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Slides.CellFormatEffectiveData.CreateEmpty(Aspose.Slides.CellFormat,Aspose.Slides.CellFormatEffectiveData)";
        }

        @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
        /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public C1231hx mo445k4(CellFormat cellFormat, C1231hx c1231hx) {
            return C1231hx.m7318k4(cellFormat, c1231hx);
        }
    };

    /* JADX INFO: renamed from: c5 */
    private Cell f1271c5;

    /* JADX INFO: renamed from: du */
    private LineFormat f1272du;

    /* JADX INFO: renamed from: dy */
    private LineFormat f1273dy;

    /* JADX INFO: renamed from: h4 */
    private LineFormat f1274h4;

    /* JADX INFO: renamed from: jd */
    private C1231hx f1275jd;

    /* JADX INFO: renamed from: kk */
    private LineFormat f1276kk;

    /* JADX INFO: renamed from: m9 */
    private LineFormat f1277m9;

    /* JADX INFO: renamed from: to */
    private LineFormat f1278to;

    /* JADX INFO: renamed from: x1 */
    private FillFormat f1279x1;

    public CellFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1271c5 = (Cell) interfaceC14397rj;
    }

    /* JADX INFO: renamed from: c5 */
    private void m491c5() {
        for (int size = getFillFormat().getSolidFillColor().getColorTransform().size() - 1; size >= 0; size--) {
            if (getFillFormat().getSolidFillColor().getColorTransform().get_Item(size).getOperationType() == 5) {
                getFillFormat().getSolidFillColor().getColorTransform().removeAt(size);
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m492dy() {
        if (!m498m9()) {
            throw new InvalidOperationException("Transparency can only be set or retrieved when FillType is Solid.");
        }
    }

    /* JADX INFO: renamed from: jd */
    private float m493jd() {
        IGenericEnumerator<IColorOperation> it = getFillFormat().getSolidFillColor().getColorTransform().iterator();
        while (it.hasNext()) {
            try {
                IColorOperation next = it.next();
                if (next.getOperationType() == 5) {
                    return 1.0f - next.getParameter();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return 0.0f;
        }
        it.dispose();
        return 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m494k4(float f) {
        float f2 = 1.0f - f;
        m491c5();
        if (f != 0.0f) {
            if (getFillFormat().getFillType() == -1) {
                ((FillFormat) getFillFormat()).m1456k4(this.f1271c5.m464fa().m73904k4().m6070x1());
            }
            getFillFormat().getSolidFillColor().getColorTransform().add(5, f2);
        }
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C1208hl(getParent_Immediate(), this.f1279x1, this.f1276kk, this.f1278to, this.f1272du, this.f1274h4, this.f1277m9, this.f1273dy);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f1279x1 = new FillFormat(this);
        this.f1276kk = new LineFormat(this);
        this.f1278to = new LineFormat(this);
        this.f1272du = new LineFormat(this);
        this.f1274h4 = new LineFormat(this);
        this.f1277m9 = new LineFormat(this);
        this.f1273dy = new LineFormat(this);
        this.f1276kk.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.CellFormat.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
        this.f1278to.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.CellFormat.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
        this.f1272du.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.CellFormat.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
        this.f1274h4.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.CellFormat.8
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final void m495du() {
        m2146wl();
        this.f1276kk.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.CellFormat.13
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
        this.f1278to.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.CellFormat.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
        this.f1272du.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.CellFormat.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
        this.f1274h4.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.CellFormat.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
    }

    @Override // com.aspose.slides.ICellFormat
    public final ILineFormat getBorderBottom() {
        m2146wl();
        return this.f1274h4;
    }

    @Override // com.aspose.slides.ICellFormat
    public final ILineFormat getBorderDiagonalDown() {
        m2146wl();
        return this.f1277m9;
    }

    @Override // com.aspose.slides.ICellFormat
    public final ILineFormat getBorderDiagonalUp() {
        m2146wl();
        return this.f1273dy;
    }

    @Override // com.aspose.slides.ICellFormat
    public final ILineFormat getBorderLeft() {
        m2146wl();
        return this.f1276kk;
    }

    @Override // com.aspose.slides.ICellFormat
    public final ILineFormat getBorderRight() {
        m2146wl();
        return this.f1272du;
    }

    @Override // com.aspose.slides.ICellFormat
    public final ILineFormat getBorderTop() {
        m2146wl();
        return this.f1278to;
    }

    @Override // com.aspose.slides.ICellFormat
    public final ICellFormatEffectiveData getEffective() {
        return m496h4();
    }

    @Override // com.aspose.slides.ICellFormat
    public final IFillFormat getFillFormat() {
        m2146wl();
        return this.f1279x1;
    }

    @Override // com.aspose.slides.ICellFormat
    public final float getTransparency() {
        m492dy();
        return m493jd();
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m500x1().m7218k4();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final C1231hx m496h4() {
        C1231hx[] c1231hxArr = {this.f1275jd};
        C1231hx c1231hx = (C1231hx) AbstractC0858ck.m4598k4(C1231hx.class, c1231hxArr, this, f1270k4);
        C1231hx c1231hx2 = c1231hxArr[0];
        this.f1275jd = c1231hx2;
        if (c1231hx2 != null) {
            c1231hx2.m4604k4(C1231hx.class);
        }
        return c1231hx;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m498m9() {
        return getFillFormat().getFillType() == 1 || (getFillFormat().getFillType() == -1 && this.f1271c5.m464fa().m73904k4().m6070x1().getFillType() == 1);
    }

    @Override // com.aspose.slides.ICellFormat
    public final void setTransparency(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new ArgumentException("Value should be defined in the range [0..1].");
        }
        m492dy();
        m494k4(f);
    }

    /* JADX INFO: renamed from: to */
    public final void m499to() {
        m2146wl();
        this.f1276kk.f2625k4.mo27429k4(new v9k() { // from class: com.aspose.slides.CellFormat.9
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
        this.f1278to.f2625k4.mo27429k4(new v9k() { // from class: com.aspose.slides.CellFormat.10
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
        this.f1272du.f2625k4.mo27429k4(new v9k() { // from class: com.aspose.slides.CellFormat.11
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
        this.f1274h4.f2625k4.mo27429k4(new v9k() { // from class: com.aspose.slides.CellFormat.12
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CellFormat.BorderChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                CellFormat.this.m497k4(lineFormat);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C1208hl m500x1() {
        return (C1208hl) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m497k4(LineFormat lineFormat) {
        if (this.f1271c5.m463dy() || lineFormat.getFillFormat().getFillType() == 0 || lineFormat.getFillFormat().getFillType() == -1) {
            return;
        }
        if (lineFormat == this.f1276kk) {
            if (this.f1271c5.getFirstColumnIndex() < 1) {
                return;
            }
            for (int i = 0; i < this.f1271c5.getRowSpan(); i++) {
                if (i > 0) {
                    this.f1271c5.m473kk().m2869k4(this.f1271c5.m475to().m1139m9(), this.f1271c5.m465h4().m2483m9() + i).getCellFormat().getBorderLeft().getFillFormat().setFillType((byte) -1);
                }
                Cell cellM2869k4 = this.f1271c5.m473kk().m2869k4(this.f1271c5.m475to().m1139m9() - 1, this.f1271c5.m465h4().m2483m9() + i);
                if (cellM2869k4 != null) {
                    if (cellM2869k4.m462du().m465h4().m2483m9() == this.f1271c5.m465h4().m2483m9() + i) {
                        cellM2869k4 = cellM2869k4.m462du();
                    }
                    ((LineFormat) cellM2869k4.getCellFormat().getBorderRight()).m1902x1((ILineFormat) lineFormat);
                }
            }
        }
        if (lineFormat == this.f1278to) {
            if (this.f1271c5.getFirstRowIndex() < 1) {
                return;
            }
            for (int i2 = 0; i2 < this.f1271c5.getColSpan(); i2++) {
                if (i2 > 0) {
                    this.f1271c5.m473kk().m2869k4(this.f1271c5.m475to().m1139m9() + i2, this.f1271c5.m465h4().m2483m9()).getCellFormat().getBorderTop().getFillFormat().setFillType((byte) -1);
                }
                Cell cellM2869k42 = this.f1271c5.m473kk().m2869k4(this.f1271c5.m475to().m1139m9() + i2, this.f1271c5.m465h4().m2483m9() - 1);
                if (cellM2869k42 != null) {
                    if (cellM2869k42.m462du().m475to().m1139m9() == this.f1271c5.m475to().m1139m9() + i2) {
                        cellM2869k42 = cellM2869k42.m462du();
                    }
                    ((LineFormat) cellM2869k42.getCellFormat().getBorderBottom()).m1902x1((ILineFormat) lineFormat);
                }
            }
        }
        if (lineFormat == this.f1272du) {
            if (this.f1271c5.getFirstColumnIndex() >= this.f1271c5.m473kk().getColumns().size() - 1) {
                return;
            }
            for (int i3 = 0; i3 < this.f1271c5.getRowSpan(); i3++) {
                if (this.f1271c5.getColSpan() > 1) {
                    this.f1271c5.m473kk().m2869k4((this.f1271c5.getColSpan() + this.f1271c5.m475to().m1139m9()) - 1, this.f1271c5.m465h4().m2483m9() + i3).getCellFormat().getBorderRight().getFillFormat().setFillType((byte) -1);
                }
                if (this.f1271c5.getColSpan() + this.f1271c5.m475to().m1139m9() < this.f1271c5.m473kk().getColumns().size()) {
                    Cell cellM2869k43 = this.f1271c5.m473kk().m2869k4(this.f1271c5.getColSpan() + this.f1271c5.m475to().m1139m9(), this.f1271c5.m465h4().m2483m9() + i3);
                    if (cellM2869k43 != null) {
                        ((LineFormat) cellM2869k43.getCellFormat().getBorderLeft()).m1902x1((ILineFormat) lineFormat);
                    }
                }
            }
        }
        if (lineFormat != this.f1274h4 || this.f1271c5.getFirstRowIndex() >= this.f1271c5.m473kk().getRows().size() - 1) {
            return;
        }
        for (int i4 = 0; i4 < this.f1271c5.getColSpan(); i4++) {
            if (this.f1271c5.getRowSpan() > 1) {
                this.f1271c5.m473kk().m2869k4(this.f1271c5.m475to().m1139m9() + i4, (this.f1271c5.getRowSpan() + this.f1271c5.m465h4().m2483m9()) - 1).getCellFormat().getBorderBottom().getFillFormat().setFillType((byte) -1);
            }
            if (this.f1271c5.getRowSpan() + this.f1271c5.m465h4().m2483m9() < this.f1271c5.m473kk().getRows().size()) {
                Cell cellM2869k44 = this.f1271c5.m473kk().m2869k4(this.f1271c5.m475to().m1139m9() + i4, this.f1271c5.getRowSpan() + this.f1271c5.m465h4().m2483m9());
                if (cellM2869k44 != null) {
                    ((LineFormat) cellM2869k44.getCellFormat().getBorderTop()).m1902x1((ILineFormat) lineFormat);
                }
            }
        }
    }
}
