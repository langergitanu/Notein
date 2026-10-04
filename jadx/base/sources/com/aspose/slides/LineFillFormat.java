package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;

/* JADX INFO: loaded from: classes3.dex */
public final class LineFillFormat extends PVIObject implements ILineFillFormat {

    /* JADX INFO: renamed from: du */
    private ColorFormat f2607du;

    /* JADX INFO: renamed from: h4 */
    private GradientFormat f2608h4;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC14383rd> f2609k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC14383rd f2610kk;

    /* JADX INFO: renamed from: m9 */
    private PatternFormat f2611m9;

    /* JADX INFO: renamed from: to */
    private w2r f2612to;

    /* JADX INFO: renamed from: x1 */
    final AbstractC7018k4<w2r> f2613x1;

    public LineFillFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2609k4 = new AbstractC7018k4<AbstractC14383rd>() { // from class: com.aspose.slides.LineFillFormat.1
            {
                LineFillFormat.this.f2610kk = new AbstractC14383rd() { // from class: com.aspose.slides.LineFillFormat.1.1
                    @Override // com.aspose.slides.AbstractC14383rd
                    /* JADX INFO: renamed from: k4 */
                    public void mo741k4() {
                        for (AbstractC14383rd abstractC14383rd : ((AbstractC7018k4) C04881.this).f19081x1) {
                            if (abstractC14383rd != null) {
                                abstractC14383rd.mo741k4();
                            }
                        }
                    }
                };
            }
        };
        this.f2613x1 = new AbstractC7018k4<w2r>() { // from class: com.aspose.slides.LineFillFormat.2
            {
                LineFillFormat.this.f2612to = new w2r() { // from class: com.aspose.slides.LineFillFormat.2.1
                    @Override // com.aspose.slides.w2r
                    /* JADX INFO: renamed from: k4 */
                    public void mo1885k4() {
                        for (w2r w2rVar : ((AbstractC7018k4) C04892.this).f19081x1) {
                            if (w2rVar != null) {
                                w2rVar.mo1885k4();
                            }
                        }
                    }
                };
            }
        };
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new ycd(this.f2607du, this.f2608h4, this.f2611m9);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f2607du = new ColorFormat(this, 7);
        this.f2608h4 = new GradientFormat(this);
        this.f2611m9 = new PatternFormat(this);
        this.f2607du.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.LineFillFormat.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.LineFillFormat.OnLineFillFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                LineFillFormat.this.m1880m9();
            }
        });
        this.f2608h4.f2414x1.mo27432x1(new AbstractC0923e1() { // from class: com.aspose.slides.LineFillFormat.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.LineFillFormat.OnLineFillFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC0923e1
            /* JADX INFO: renamed from: k4 */
            public void mo1464k4() {
                LineFillFormat.this.m1880m9();
            }
        });
        this.f2611m9.f2978k4.mo27432x1(new zhi() { // from class: com.aspose.slides.LineFillFormat.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.LineFillFormat.OnLineFillFormatChanged()";
            }

            @Override // com.aspose.slides.zhi
            /* JADX INFO: renamed from: k4 */
            public void mo1465k4() {
                LineFillFormat.this.m1880m9();
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final boolean m1876du() {
        if (m2138ix()) {
            return m1882x1().m73849m9();
        }
        return true;
    }

    @Override // com.aspose.slides.ILineFillFormat
    public final byte getFillType() {
        if (m2138ix()) {
            return m1882x1().m73844k4();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFillFormat
    public final IGradientFormat getGradientFormat() {
        m2146wl();
        return this.f2608h4;
    }

    @Override // com.aspose.slides.ILineFillFormat
    public final IPatternFormat getPatternFormat() {
        m2146wl();
        return this.f2611m9;
    }

    @Override // com.aspose.slides.ILineFillFormat
    public final byte getRotateWithShape() {
        if (m2138ix()) {
            return m1882x1().m73848kk();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ILineFillFormat
    public final IColorFormat getSolidFillColor() {
        m2146wl();
        return this.f2607du;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1882x1().m73843h4();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m1877h4() {
        m2145uz();
        m1882x1().m73842du();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m1880m9() {
        w2r w2rVar = this.f2612to;
        if (w2rVar == null || this.f2613x1.m27430k4()) {
            return;
        }
        w2rVar.mo1885k4();
    }

    @Override // com.aspose.slides.ILineFillFormat
    public final void setFillType(byte b) {
        if (b == 4 || b == 5) {
            throw new Exception("LineFillFormat.FillType cannot be FillType.Picture or FillType.Group.");
        }
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (!m2138ix() || m1882x1().m73844k4() == b) {
            return;
        }
        m1882x1().m73845k4(b);
        m1880m9();
        AbstractC14383rd abstractC14383rd = this.f2610kk;
        if (abstractC14383rd != null) {
            abstractC14383rd.mo741k4();
        }
    }

    @Override // com.aspose.slides.ILineFillFormat
    public final void setRotateWithShape(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1882x1().m73852x1(b);
            m1880m9();
        }
    }

    /* JADX INFO: renamed from: to */
    public final boolean m1881to() {
        if (m2138ix()) {
            return m1882x1().m73850to();
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final ycd m1882x1() {
        return (ycd) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1878k4(ILineFillFormat iLineFillFormat) {
        m2145uz();
        m1882x1().m73846k4(iLineFillFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1879k4(ILineFillFormatEffectiveData iLineFillFormatEffectiveData) {
        m2145uz();
        m1882x1().m73847k4(iLineFillFormatEffectiveData);
        m1880m9();
    }
}
