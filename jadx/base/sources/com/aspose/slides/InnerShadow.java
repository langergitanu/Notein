package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
public final class InnerShadow implements IInnerShadow, lft, InterfaceC14376r6, InterfaceC14397rj, Cloneable {

    /* JADX INFO: renamed from: c5 */
    private zg0 f2555c5;

    /* JADX INFO: renamed from: du */
    private double f2556du;

    /* JADX INFO: renamed from: dy */
    private long f2557dy;

    /* JADX INFO: renamed from: h4 */
    private ColorFormat f2558h4;

    /* JADX INFO: renamed from: jd */
    private IPresentationComponent f2559jd;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC1156gp> f2560k4 = new AbstractC7018k4<AbstractC1156gp>() { // from class: com.aspose.slides.InnerShadow.1
        {
            InnerShadow.this.f2564x1 = new AbstractC1156gp() { // from class: com.aspose.slides.InnerShadow.1.1
                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    for (AbstractC1156gp abstractC1156gp : ((AbstractC7018k4) C04721.this).f19081x1) {
                        if (abstractC1156gp != null) {
                            abstractC1156gp.mo1395k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private double f2561kk;

    /* JADX INFO: renamed from: m9 */
    private InterfaceC14397rj f2562m9;

    /* JADX INFO: renamed from: to */
    private float f2563to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC1156gp f2564x1;

    public InnerShadow(InterfaceC14397rj interfaceC14397rj) {
        this.f2562m9 = interfaceC14397rj;
        ColorFormat colorFormat = new ColorFormat(this, 7);
        this.f2558h4 = colorFormat;
        colorFormat.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.InnerShadow.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.InnerShadow.OnEffectChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                InnerShadow.this.m1836to();
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    private void m1835kk() {
        this.f2557dy++;
        m1836to();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m1836to() {
        AbstractC1156gp abstractC1156gp = this.f2564x1;
        if (abstractC1156gp == null || this.f2560k4.m27430k4()) {
            return;
        }
        abstractC1156gp.mo1395k4();
    }

    public boolean equals(Object obj) {
        InnerShadow innerShadow = (InnerShadow) C7019kk.m27452k4(obj, InnerShadow.class);
        if (innerShadow == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13088k4(this.f2561kk, innerShadow.f2561kk) && C3085sv.m13089k4(this.f2563to, innerShadow.f2563to) && C3085sv.m13088k4(this.f2556du, innerShadow.f2556du) && C3085sv.m13090k4(this.f2558h4, innerShadow.f2558h4);
    }

    @Override // com.aspose.slides.IInnerShadow
    public final double getBlurRadius() {
        return this.f2561kk;
    }

    @Override // com.aspose.slides.IInnerShadow
    public final float getDirection() {
        return this.f2563to;
    }

    @Override // com.aspose.slides.IInnerShadow
    public final double getDistance() {
        return this.f2556du;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f2559jd;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f2562m9, iPresentationComponentArr);
            this.f2559jd = iPresentationComponentArr[0];
        }
        return this.f2559jd;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2562m9;
    }

    @Override // com.aspose.slides.IInnerShadow
    public final IColorFormat getShadowColor() {
        return this.f2558h4;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return ((this.f2557dy & 4294967295L) + (this.f2558h4.getVersion() & 4294967295L)) & 4294967295L;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Object memberwiseClone() {
        try {
            InnerShadow innerShadow = (InnerShadow) clone();
            ColorFormat colorFormat = this.f2558h4;
            if (colorFormat == null) {
                return innerShadow;
            }
            innerShadow.f2558h4.m1079k4(colorFormat);
            return innerShadow;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.IInnerShadow
    public final void setBlurRadius(double d) {
        this.f2561kk = d;
        m1835kk();
    }

    @Override // com.aspose.slides.IInnerShadow
    public final void setDirection(float f) {
        this.f2563to = f;
        m1835kk();
    }

    @Override // com.aspose.slides.IInnerShadow
    public final void setDistance(double d) {
        this.f2556du = d;
        m1835kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final InnerShadow m1839x1() {
        final InnerShadow innerShadow = (InnerShadow) memberwiseClone();
        ColorFormat colorFormat = new ColorFormat(null);
        innerShadow.f2558h4 = colorFormat;
        colorFormat.m1079k4(this.f2558h4);
        innerShadow.f2558h4.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.InnerShadow.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(innerShadow) + "Aspose.Slides.Effects.InnerShadow.OnEffectChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                innerShadow.m1836to();
            }
        });
        return innerShadow;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IInnerShadowEffectiveData getEffective() {
        return m1837k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final zg0 m1837k4() {
        if (this.f2555c5 == null) {
            this.f2555c5 = new zg0(this);
        }
        this.f2555c5.m63282k4(zg0.class);
        return this.f2555c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1838k4(InterfaceC14397rj interfaceC14397rj) {
        this.f2562m9 = interfaceC14397rj;
        this.f2558h4.m1081k4((InterfaceC14397rj) this);
        m1835kk();
    }
}
