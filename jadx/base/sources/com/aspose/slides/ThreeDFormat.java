package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ThreeDFormat extends PVIObject implements IThreeDFormat, IThreeDParamSource {

    /* JADX INFO: renamed from: x1 */
    static final AbstractC4682du<ThreeDFormat, fpw, fpw> f3559x1 = new AbstractC4682du<ThreeDFormat, fpw, fpw>() { // from class: com.aspose.slides.ThreeDFormat.9
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Slides.ThreeDFormatEffectiveData.CreateEmpty(Aspose.Slides.ThreeDFormat,Aspose.Slides.ThreeDFormatEffectiveData)";
        }

        @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
        /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public fpw mo445k4(ThreeDFormat threeDFormat, fpw fpwVar) {
            return fpw.m6251k4(threeDFormat, fpwVar);
        }
    };

    /* JADX INFO: renamed from: c5 */
    private LightRig f3560c5;

    /* JADX INFO: renamed from: ck */
    private fpw f3561ck;

    /* JADX INFO: renamed from: du */
    private ShapeBevel f3562du;

    /* JADX INFO: renamed from: dy */
    private Camera f3563dy;

    /* JADX INFO: renamed from: h4 */
    private ColorFormat f3564h4;

    /* JADX INFO: renamed from: jd */
    private spu f3565jd;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<tat> f3566k4;

    /* JADX INFO: renamed from: kk */
    private tat f3567kk;

    /* JADX INFO: renamed from: m9 */
    private ColorFormat f3568m9;

    /* JADX INFO: renamed from: to */
    private ShapeBevel f3569to;

    public ThreeDFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f3566k4 = new AbstractC7018k4<tat>() { // from class: com.aspose.slides.ThreeDFormat.1
            {
                ThreeDFormat.this.f3567kk = new tat() { // from class: com.aspose.slides.ThreeDFormat.1.1
                    @Override // com.aspose.slides.tat
                    /* JADX INFO: renamed from: k4 */
                    public void mo1404k4() {
                        for (tat tatVar : ((AbstractC7018k4) C06621.this).f19081x1) {
                            if (tatVar != null) {
                                tatVar.mo1404k4();
                            }
                        }
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fa */
    public void m2998fa() {
        tat tatVar = this.f3567kk;
        if (tatVar != null && !this.f3566k4.m27430k4()) {
            tatVar.mo1404k4();
        }
        if (C7019kk.m27469x1(getParent_IPresentationComponent(), GroupShape.class)) {
            if (this.f3569to.getBevelType() == -1 && this.f3562du.getBevelType() == -1) {
                return;
            }
            IGenericEnumerator<IShape> it = ((GroupShape) getParent_IPresentationComponent()).getShapes().iterator();
            while (it.hasNext()) {
                try {
                    IShape next = it.next();
                    if (this.f3569to.getBevelType() != -1) {
                        next.getThreeDFormat().getBevelTop().setBevelType(this.f3569to.getBevelType());
                        next.getThreeDFormat().getBevelTop().setHeight(this.f3569to.getHeight());
                        next.getThreeDFormat().getBevelTop().setWidth(this.f3569to.getWidth());
                    }
                    if (this.f3562du.getBevelType() != -1) {
                        next.getThreeDFormat().getBevelBottom().setBevelType(this.f3562du.getBevelType());
                        next.getThreeDFormat().getBevelBottom().setHeight(this.f3562du.getHeight());
                        next.getThreeDFormat().getBevelBottom().setWidth(this.f3562du.getWidth());
                    }
                    if (getMaterial() != -1) {
                        next.getThreeDFormat().setMaterial(getMaterial());
                    }
                    if (!C14044b3.m66437kk(getExtrusionHeight())) {
                        next.getThreeDFormat().setExtrusionHeight(getExtrusionHeight());
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
        }
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new k3d(this.f3569to, this.f3562du, this.f3564h4, this.f3568m9, this.f3563dy, this.f3560c5, this.f3565jd);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f3569to = new ShapeBevel(this, true);
        this.f3562du = new ShapeBevel(this, false);
        this.f3564h4 = new ColorFormat(this);
        this.f3568m9 = new ColorFormat(this);
        this.f3563dy = new Camera(this);
        this.f3560c5 = new LightRig(this);
        this.f3565jd = new spu(this);
        this.f3569to.f3340k4.mo27432x1(new r0b() { // from class: com.aspose.slides.ThreeDFormat.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.ThreeDFormat.OnThreeDFormatChanged()";
            }

            @Override // com.aspose.slides.r0b
            /* JADX INFO: renamed from: k4 */
            public void mo2605k4() {
                ThreeDFormat.this.m2998fa();
            }
        });
        this.f3562du.f3340k4.mo27432x1(new r0b() { // from class: com.aspose.slides.ThreeDFormat.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.ThreeDFormat.OnThreeDFormatChanged()";
            }

            @Override // com.aspose.slides.r0b
            /* JADX INFO: renamed from: k4 */
            public void mo2605k4() {
                ThreeDFormat.this.m2998fa();
            }
        });
        this.f3564h4.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.ThreeDFormat.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.ThreeDFormat.OnThreeDFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                ThreeDFormat.this.m2998fa();
            }
        });
        this.f3568m9.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.ThreeDFormat.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.ThreeDFormat.OnThreeDFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                ThreeDFormat.this.m2998fa();
            }
        });
        this.f3563dy.f1245k4.mo27432x1(new AbstractC0902di() { // from class: com.aspose.slides.ThreeDFormat.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.ThreeDFormat.OnThreeDFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC0902di
            /* JADX INFO: renamed from: k4 */
            public void mo456k4() {
                ThreeDFormat.this.m2998fa();
            }
        });
        this.f3560c5.f2603k4.mo27432x1(new mrw() { // from class: com.aspose.slides.ThreeDFormat.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.ThreeDFormat.OnThreeDFormatChanged()";
            }

            @Override // com.aspose.slides.mrw
            /* JADX INFO: renamed from: k4 */
            public void mo1873k4() {
                ThreeDFormat.this.m2998fa();
            }
        });
        this.f3565jd.f48891k4.mo27432x1(new tat() { // from class: com.aspose.slides.ThreeDFormat.8
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.ThreeDFormat.OnThreeDFormatChanged()";
            }

            @Override // com.aspose.slides.tat
            /* JADX INFO: renamed from: k4 */
            public void mo1404k4() {
                ThreeDFormat.this.m2998fa();
            }
        });
    }

    /* JADX INFO: renamed from: c5 */
    public final int m3001c5() {
        if (m2138ix()) {
            return m3012x1().m63598du().getBevelType();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ck */
    public final fpw m3002ck() {
        fpw[] fpwVarArr = {this.f3561ck};
        fpw fpwVar = (fpw) AbstractC0858ck.m4598k4(fpw.class, fpwVarArr, this, f3559x1);
        fpw fpwVar2 = fpwVarArr[0];
        this.f3561ck = fpwVar2;
        if (fpwVar2 != null) {
            fpwVar2.m4604k4(fpw.class);
        }
        return fpwVar;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m3003du() {
        if (m2138ix()) {
            return m3012x1().m63602jd();
        }
        return false;
    }

    /* JADX INFO: renamed from: dy */
    public final int m3004dy() {
        if (m2138ix()) {
            return m3012x1().m63612to().getBevelType();
        }
        return -1;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final IShapeBevel getBevelBottom() {
        m2146wl();
        return this.f3562du;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final IShapeBevel getBevelTop() {
        m2146wl();
        return this.f3569to;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final ICamera getCamera() {
        m2146wl();
        return this.f3563dy;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final IColorFormat getContourColor() {
        m2146wl();
        return this.f3564h4;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final double getContourWidth() {
        if (m2138ix()) {
            return m3012x1().m63603k4();
        }
        return 0.0d;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final double getDepth() {
        if (m2138ix()) {
            return m3012x1().m63609kk();
        }
        return 0.0d;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final IThreeDFormatEffectiveData getEffective() {
        return m3002ck();
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final IColorFormat getExtrusionColor() {
        m2146wl();
        return this.f3568m9;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final double getExtrusionHeight() {
        if (m2138ix()) {
            return m3012x1().m63613x1();
        }
        return 0.0d;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final ILightRig getLightRig() {
        m2146wl();
        return this.f3560c5;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final int getMaterial() {
        if (m2138ix()) {
            return m3012x1().m63599dy();
        }
        return -1;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m3012x1().m63600fa();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m3005h4() {
        if (m2138ix()) {
            return m3012x1().m63601h4().getCameraType();
        }
        return -1;
    }

    /* JADX INFO: renamed from: jd */
    public final void m3006jd() {
        if (m2138ix()) {
            m2145uz();
            m3012x1().m63597ck();
            m2998fa();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final int m3010m9() {
        if (m2138ix()) {
            return m3012x1().m63611m9().getLightType();
        }
        return -1;
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final void setContourWidth(double d) {
        m2141k4(Double.valueOf(0.0d), Double.valueOf(d));
        if (m2138ix()) {
            m3012x1().m63604k4(d);
            m2998fa();
        }
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final void setDepth(double d) {
        m2141k4(Double.valueOf(0.0d), Double.valueOf(d));
        if (m2138ix()) {
            m3012x1().m63610kk(d);
            m2998fa();
        }
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final void setExtrusionHeight(double d) {
        m2141k4(Double.valueOf(0.0d), Double.valueOf(d));
        if (m2138ix()) {
            m3012x1().m63614x1(d);
            m2998fa();
        }
    }

    @Override // com.aspose.slides.IThreeDFormat
    public final void setMaterial(int i) {
        m2141k4((Integer) (-1), Integer.valueOf(i));
        if (m2138ix()) {
            m3012x1().m63605k4(i);
            m2998fa();
        }
    }

    /* JADX INFO: renamed from: to */
    public final spu m3011to() {
        m2146wl();
        return this.f3565jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final k3d m3012x1() {
        return (k3d) m2144u4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m3007k4(IThreeDFormat iThreeDFormat) {
        if (m2138ix() || !C7019kk.m27469x1(iThreeDFormat, PVIObject.class) || ((PVIObject) iThreeDFormat).m2138ix()) {
            m2145uz();
            m3012x1().m63606k4((ThreeDFormat) iThreeDFormat);
            m2998fa();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3008k4(IThreeDFormatEffectiveData iThreeDFormatEffectiveData) {
        m2145uz();
        m3012x1().m63607k4((fpw) iThreeDFormatEffectiveData);
        m2998fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m3009k4(boolean z) {
        if (!m2138ix()) {
            return false;
        }
        m2145uz();
        return m3012x1().m63608k4(z);
    }
}
