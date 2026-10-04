package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public final class LineFormat extends PVIObject implements ILineFormat {

    /* JADX INFO: renamed from: kk */
    static final AbstractC4682du<LineFormat, skr, skr> f2621kk = new AbstractC4682du<LineFormat, skr, skr>() { // from class: com.aspose.slides.LineFormat.6
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Slides.LineFormatEffectiveData.CreateEmpty(Aspose.Slides.LineFormat,Aspose.Slides.LineFormatEffectiveData)";
        }

        @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
        /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public skr mo445k4(LineFormat lineFormat, skr skrVar) {
            return skr.m70659k4(lineFormat, skrVar);
        }
    };

    /* JADX INFO: renamed from: du */
    private w7b f2622du;

    /* JADX INFO: renamed from: dy */
    private skr f2623dy;

    /* JADX INFO: renamed from: h4 */
    private LineFillFormat f2624h4;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<v9k> f2625k4;

    /* JADX INFO: renamed from: m9 */
    private SketchFormat f2626m9;

    /* JADX INFO: renamed from: to */
    private v9k f2627to;

    /* JADX INFO: renamed from: x1 */
    final AbstractC7018k4<w7b> f2628x1;

    public LineFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2625k4 = new AbstractC7018k4<v9k>() { // from class: com.aspose.slides.LineFormat.1
            {
                LineFormat.this.f2627to = new v9k() { // from class: com.aspose.slides.LineFormat.1.1
                    @Override // com.aspose.slides.v9k
                    /* JADX INFO: renamed from: k4 */
                    public void mo501k4(LineFormat lineFormat) {
                        for (v9k v9kVar : ((AbstractC7018k4) C04931.this).f19081x1) {
                            if (v9kVar != null) {
                                v9kVar.mo501k4(lineFormat);
                            }
                        }
                    }
                };
            }
        };
        this.f2628x1 = new AbstractC7018k4<w7b>() { // from class: com.aspose.slides.LineFormat.2
            {
                LineFormat.this.f2622du = new w7b() { // from class: com.aspose.slides.LineFormat.2.1
                    @Override // com.aspose.slides.w7b
                    /* JADX INFO: renamed from: k4 */
                    public void mo1905k4() {
                        for (w7b w7bVar : ((AbstractC7018k4) C04942.this).f19081x1) {
                            if (w7bVar != null) {
                                w7bVar.mo1905k4();
                            }
                        }
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ck */
    public void m1886ck() {
        w7b w7bVar = this.f2622du;
        if (w7bVar == null || this.f2628x1.m27430k4()) {
            return;
        }
        w7bVar.mo1905k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: jd */
    public void m1887jd() {
        v9k v9kVar = this.f2627to;
        if (v9kVar == null || this.f2625k4.m27430k4()) {
            return;
        }
        v9kVar.mo501k4(this);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new r1l(this.f2624h4, this.f2626m9);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        LineFillFormat lineFillFormat = new LineFillFormat(this);
        this.f2624h4 = lineFillFormat;
        lineFillFormat.f2609k4.mo27432x1(new AbstractC14383rd() { // from class: com.aspose.slides.LineFormat.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.LineFormat.OnLineFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC14383rd
            /* JADX INFO: renamed from: k4 */
            public void mo741k4() {
                LineFormat.this.m1887jd();
            }
        });
        this.f2624h4.f2613x1.mo27432x1(new w2r() { // from class: com.aspose.slides.LineFormat.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.LineFormat.OnLineFormatChanged()";
            }

            @Override // com.aspose.slides.w2r
            /* JADX INFO: renamed from: k4 */
            public void mo1885k4() {
                LineFormat.this.m1887jd();
            }
        });
        SketchFormat sketchFormat = new SketchFormat(this);
        this.f2626m9 = sketchFormat;
        sketchFormat.f3375k4.mo27432x1(new gu5() { // from class: com.aspose.slides.LineFormat.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.LineFormat.OnSketchFormatChanged()";
            }

            @Override // com.aspose.slides.gu5
            /* JADX INFO: renamed from: k4 */
            public void mo1906k4() {
                LineFormat.this.m1886ck();
            }
        });
    }

    /* JADX INFO: renamed from: c5 */
    public final void m1892c5() {
        this.f2623dy = null;
    }

    /* JADX INFO: renamed from: du */
    public final LineFormat m1893du() {
        LineFormat lineFormat = new LineFormat(getParent_Immediate());
        lineFormat.m1896k4((ILineFormat) this);
        return lineFormat;
    }

    /* JADX INFO: renamed from: dy */
    public final skr m1894dy() {
        skr[] skrVarArr = {this.f2623dy};
        skr skrVar = (skr) AbstractC0858ck.m4598k4(skr.class, skrVarArr, this, f2621kk);
        skr skrVar2 = skrVarArr[0];
        this.f2623dy = skrVar2;
        if (skrVar2 != null) {
            skrVar2.m4604k4(skr.class);
        }
        return skrVar;
    }

    @Override // com.aspose.slides.ILineFormat
    public final boolean equals(ILineFormat iLineFormat) {
        LineFormat lineFormat = (LineFormat) C7019kk.m27452k4((Object) iLineFormat, LineFormat.class);
        if (lineFormat == null) {
            return false;
        }
        if (m2138ix()) {
            return m1901x1().m69997k4(lineFormat);
        }
        if (lineFormat.m2138ix()) {
            return lineFormat.m1901x1().m69997k4(this);
        }
        return true;
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getAlignment() {
        if (m2138ix()) {
            return m1901x1().m70002m9();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getBeginArrowheadLength() {
        if (m2138ix()) {
            return m1901x1().m70013yj();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getBeginArrowheadStyle() {
        if (m2138ix()) {
            return m1901x1().m69989jd();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getBeginArrowheadWidth() {
        if (m2138ix()) {
            return m1901x1().m69986fa();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getCapStyle() {
        if (m2138ix()) {
            return m1901x1().m69982du();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFormat
    public final float[] getCustomDashPattern() {
        if (m2138ix()) {
            return m1901x1().m70007to();
        }
        return null;
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getDashStyle() {
        if (m2138ix()) {
            return m1901x1().m69998kk();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFormat
    public final ILineFormatEffectiveData getEffective() {
        return m1894dy();
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getEndArrowheadLength() {
        if (m2138ix()) {
            return m1901x1().m70001ks();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getEndArrowheadStyle() {
        if (m2138ix()) {
            return m1901x1().m69980ck();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getEndArrowheadWidth() {
        if (m2138ix()) {
            return m1901x1().m70008up();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFormat
    public final ILineFillFormat getFillFormat() {
        m2146wl();
        return this.f2624h4;
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getJoinStyle() {
        if (m2138ix()) {
            return m1901x1().m69984dy();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFormat
    public final float getMiterLimit() {
        if (m2138ix()) {
            return m1901x1().m69978c5();
        }
        return Float.NaN;
    }

    @Override // com.aspose.slides.ILineFormat
    public final ISketchFormat getSketchFormat() {
        m2146wl();
        return this.f2626m9;
    }

    @Override // com.aspose.slides.ILineFormat
    public final byte getStyle() {
        if (m2138ix()) {
            return m1901x1().m69987h4();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1901x1().m70004ne();
        }
        return 1L;
    }

    @Override // com.aspose.slides.ILineFormat
    public final double getWidth() {
        if (m2138ix()) {
            return m1901x1().m70009x1();
        }
        return Double.NaN;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m1895h4() {
        if (m2138ix() && !isFormatNotDefined()) {
            m2145uz();
            m1901x1().m70012x6();
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final boolean isFormatNotDefined() {
        return !m2138ix() || m1901x1().m69996k4();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m1899m9() {
        if (isFormatNotDefined()) {
            return;
        }
        m2145uz();
        m1901x1().m70012x6();
        m1887jd();
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setAlignment(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m70006to(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setBeginArrowheadLength(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m69990jd(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setBeginArrowheadStyle(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m69988h4(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setBeginArrowheadWidth(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m69985dy(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setCapStyle(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m70010x1(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setCustomDashPattern(float[] fArr) {
        m2141k4((float[]) null, fArr);
        if (m2138ix()) {
            m1901x1().m69995k4(fArr);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setDashStyle(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m69991k4(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setEndArrowheadLength(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m69981ck(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setEndArrowheadStyle(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m70003m9(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setEndArrowheadWidth(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m69979c5(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setJoinStyle(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m69983du(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setMiterLimit(float f) {
        m2141k4(Float.valueOf(Float.NaN), Float.valueOf(f));
        if (m2138ix()) {
            m1901x1().m69993k4(f);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setStyle(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1901x1().m69999kk(b);
            m1887jd();
        }
    }

    @Override // com.aspose.slides.ILineFormat
    public final void setWidth(double d) {
        m2141k4(Double.valueOf(Double.NaN), Double.valueOf(d));
        if (m2138ix()) {
            m1901x1().m69992k4(d);
            m1887jd();
        }
    }

    /* JADX INFO: renamed from: to */
    public final boolean m1900to() {
        if (m2138ix()) {
            return m1901x1().m70005rv();
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final r1l m1901x1() {
        return (r1l) m2144u4();
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        LineFormat lineFormat = (LineFormat) C7019kk.m27452k4(obj, LineFormat.class);
        if (lineFormat == null) {
            return false;
        }
        if (m2138ix()) {
            return m1901x1().m69997k4(lineFormat);
        }
        if (lineFormat.m2138ix()) {
            return lineFormat.m1901x1().m69997k4(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1902x1(ILineFormat iLineFormat) {
        if (isFormatNotDefined() && iLineFormat.isFormatNotDefined()) {
            return;
        }
        m2145uz();
        m1901x1().m70000kk((LineFormat) iLineFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1896k4(ILineFormat iLineFormat) {
        if (isFormatNotDefined() && iLineFormat.isFormatNotDefined()) {
            return;
        }
        m2145uz();
        m1901x1().m70011x1((LineFormat) iLineFormat);
        m1887jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1897k4(ILineFormatEffectiveData iLineFormatEffectiveData) {
        m2145uz();
        m1901x1().m69994k4(iLineFormatEffectiveData);
        m1887jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1898k4(Shape shape) {
        m2147x1(shape);
        m2143qq();
        m1892c5();
    }
}
