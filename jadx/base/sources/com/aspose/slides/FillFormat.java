package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public final class FillFormat extends PVIObject implements IFillFormat {

    /* JADX INFO: renamed from: du */
    private PatternFormat f2259du;

    /* JADX INFO: renamed from: h4 */
    private ColorFormat f2260h4;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC0766ax> f2261k4;

    /* JADX INFO: renamed from: kk */
    private PictureFillFormat f2262kk;

    /* JADX INFO: renamed from: m9 */
    private C14176nc f2263m9;

    /* JADX INFO: renamed from: to */
    private GradientFormat f2264to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC0766ax f2265x1;

    public FillFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2261k4 = new AbstractC7018k4<AbstractC0766ax>() { // from class: com.aspose.slides.FillFormat.1
            {
                FillFormat.this.f2265x1 = new AbstractC0766ax() { // from class: com.aspose.slides.FillFormat.1.1
                    @Override // com.aspose.slides.AbstractC0766ax
                    /* JADX INFO: renamed from: k4 */
                    public void mo1462k4() {
                        for (AbstractC0766ax abstractC0766ax : ((AbstractC7018k4) C03971.this).f19081x1) {
                            if (abstractC0766ax != null) {
                                abstractC0766ax.mo1462k4();
                            }
                        }
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: jd */
    public void m1449jd() {
        AbstractC0766ax abstractC0766ax = this.f2265x1;
        if (abstractC0766ax == null || this.f2261k4.m27430k4()) {
            return;
        }
        abstractC0766ax.mo1462k4();
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C14172n8(this.f2260h4, this.f2262kk, this.f2264to, this.f2259du);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f2260h4 = new ColorFormat(this, 7);
        this.f2262kk = new PictureFillFormat(this);
        this.f2264to = new GradientFormat(this);
        this.f2259du = new PatternFormat(this);
        this.f2260h4.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.FillFormat.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.FillFormat.OnFillFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                FillFormat.this.m1449jd();
            }
        });
        this.f2262kk.f3023k4.mo27432x1(new gb2() { // from class: com.aspose.slides.FillFormat.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.FillFormat.OnFillFormatChanged()";
            }

            @Override // com.aspose.slides.gb2
            /* JADX INFO: renamed from: k4 */
            public void mo1463k4() {
                FillFormat.this.m1449jd();
            }
        });
        this.f2264to.f2414x1.mo27432x1(new AbstractC0923e1() { // from class: com.aspose.slides.FillFormat.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.FillFormat.OnFillFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC0923e1
            /* JADX INFO: renamed from: k4 */
            public void mo1464k4() {
                FillFormat.this.m1449jd();
            }
        });
        this.f2259du.f2978k4.mo27432x1(new zhi() { // from class: com.aspose.slides.FillFormat.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.FillFormat.OnFillFormatChanged()";
            }

            @Override // com.aspose.slides.zhi
            /* JADX INFO: renamed from: k4 */
            public void mo1465k4() {
                FillFormat.this.m1449jd();
            }
        });
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m1452c5() {
        if (m2138ix()) {
            return m1460x1().m67888m9();
        }
        return true;
    }

    /* JADX INFO: renamed from: du */
    public final FillFormat m1453du() {
        FillFormat fillFormat = new FillFormat(getParent_Immediate());
        fillFormat.m1456k4((IFillFormat) this);
        return fillFormat;
    }

    /* JADX INFO: renamed from: dy */
    public final C14176nc m1454dy() {
        if (C7019kk.m27469x1(getParent_Immediate(), TableFormat.class)) {
            return (C14176nc) ((TableFormat) getParent_Immediate()).getEffective().getFillFormat();
        }
        if (C7019kk.m27469x1(getParent_Immediate(), PortionFormat.class)) {
            return (C14176nc) ((PortionFormat) getParent_Immediate()).getEffective().getFillFormat();
        }
        if (this.f2263m9 == null) {
            C14176nc c14176ncM67915du = C14176nc.m67915du(this);
            if (c14176ncM67915du != null) {
                return c14176ncM67915du;
            }
            this.f2263m9 = new C14176nc(this);
        }
        this.f2263m9.m4604k4(C14176nc.class);
        return this.f2263m9;
    }

    @Override // com.aspose.slides.IFillFormat
    public final IFillFormatEffectiveData getEffective() {
        return m1454dy();
    }

    @Override // com.aspose.slides.IFillFormat
    public final byte getFillType() {
        if (m2138ix()) {
            return m1460x1().m67883k4();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.IFillFormat
    public final IGradientFormat getGradientFormat() {
        m2146wl();
        return this.f2264to;
    }

    @Override // com.aspose.slides.IFillFormat
    public final IPatternFormat getPatternFormat() {
        m2146wl();
        return this.f2259du;
    }

    @Override // com.aspose.slides.IFillFormat
    public final IPictureFillFormat getPictureFillFormat() {
        m2146wl();
        return this.f2262kk;
    }

    @Override // com.aspose.slides.IFillFormat
    public final byte getRotateWithShape() {
        if (m2138ix()) {
            return m1460x1().m67887kk();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.IFillFormat
    public final IColorFormat getSolidFillColor() {
        m2146wl();
        return this.f2260h4;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1460x1().m67882h4();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m1455h4() {
        if (m2138ix()) {
            m2145uz();
            m1460x1().m67881du();
            m1449jd();
            m1449jd();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m1458m9() {
        if (m2138ix()) {
            m2145uz();
            m1460x1().m67881du();
            m1449jd();
        }
    }

    @Override // com.aspose.slides.IFillFormat
    public final void setFillType(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1460x1().m67884k4(b);
            m1449jd();
        }
    }

    @Override // com.aspose.slides.IFillFormat
    public final void setRotateWithShape(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1460x1().m67891x1(b);
            m1449jd();
        }
    }

    /* JADX INFO: renamed from: to */
    public final boolean m1459to() {
        if (m2138ix()) {
            return m1460x1().m67889to();
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14172n8 m1460x1() {
        return (C14172n8) m2144u4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m1456k4(IFillFormat iFillFormat) {
        if (m2138ix() || !C7019kk.m27469x1(iFillFormat, PVIObject.class) || ((PVIObject) iFillFormat).m2138ix()) {
            m2145uz();
            m1460x1().m67885k4((FillFormat) iFillFormat);
            m1449jd();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1457k4(IFillFormatEffectiveData iFillFormatEffectiveData) {
        m2145uz();
        m1460x1().m67886k4(iFillFormatEffectiveData);
        m1449jd();
    }
}
