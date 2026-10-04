package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
public final class OuterShadow implements IOuterShadow, lft, InterfaceC14376r6, InterfaceC14397rj, Cloneable {

    /* JADX INFO: renamed from: c5 */
    private double f2890c5;

    /* JADX INFO: renamed from: ck */
    private boolean f2891ck;

    /* JADX INFO: renamed from: du */
    private byte f2892du;

    /* JADX INFO: renamed from: dy */
    private double f2893dy;

    /* JADX INFO: renamed from: fa */
    private double f2894fa;

    /* JADX INFO: renamed from: h4 */
    private double f2895h4;

    /* JADX INFO: renamed from: jd */
    private double f2896jd;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC1156gp> f2897k4 = new AbstractC7018k4<AbstractC1156gp>() { // from class: com.aspose.slides.OuterShadow.1
        {
            OuterShadow.this.f2898kk = new AbstractC1156gp() { // from class: com.aspose.slides.OuterShadow.1.1
                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    for (AbstractC1156gp abstractC1156gp : ((AbstractC7018k4) C05451.this).f19081x1) {
                        if (abstractC1156gp != null) {
                            abstractC1156gp.mo1395k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private AbstractC1156gp f2898kk;

    /* JADX INFO: renamed from: ks */
    private long f2899ks;

    /* JADX INFO: renamed from: m9 */
    private float f2900m9;

    /* JADX INFO: renamed from: rv */
    private vmd f2901rv;

    /* JADX INFO: renamed from: to */
    private ColorFormat f2902to;

    /* JADX INFO: renamed from: up */
    private double f2903up;

    /* JADX INFO: renamed from: x1 */
    final AbstractC14741wk f2904x1;

    /* JADX INFO: renamed from: x6 */
    private IPresentationComponent f2905x6;

    /* JADX INFO: renamed from: yj */
    private InterfaceC14397rj f2906yj;

    public OuterShadow(InterfaceC14397rj interfaceC14397rj) {
        AbstractC14741wk abstractC14741wk = new AbstractC14741wk() { // from class: com.aspose.slides.OuterShadow.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.OuterShadow.OnEffectChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                OuterShadow.this.m2096to();
            }
        };
        this.f2904x1 = abstractC14741wk;
        this.f2892du = (byte) 7;
        this.f2891ck = true;
        this.f2894fa = 100.0d;
        this.f2903up = 100.0d;
        this.f2906yj = interfaceC14397rj;
        ColorFormat colorFormat = new ColorFormat(this, 7);
        this.f2902to = colorFormat;
        colorFormat.f1951k4.mo27432x1(abstractC14741wk);
    }

    /* JADX INFO: renamed from: kk */
    private void m2095kk() {
        this.f2899ks++;
        m2096to();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m2096to() {
        AbstractC1156gp abstractC1156gp = this.f2898kk;
        if (abstractC1156gp == null || this.f2897k4.m27430k4()) {
            return;
        }
        abstractC1156gp.mo1395k4();
    }

    public boolean equals(Object obj) {
        OuterShadow outerShadow = (OuterShadow) C7019kk.m27452k4(obj, OuterShadow.class);
        if (outerShadow == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13089k4((float) this.f2892du, (float) outerShadow.f2892du) && C3085sv.m13088k4(this.f2895h4, outerShadow.f2895h4) && C3085sv.m13089k4(this.f2900m9, outerShadow.f2900m9) && C3085sv.m13088k4(this.f2893dy, outerShadow.f2893dy) && C3085sv.m13088k4(this.f2890c5, outerShadow.f2890c5) && C3085sv.m13088k4(this.f2896jd, outerShadow.f2896jd) && C3085sv.m13090k4(Boolean.valueOf(this.f2891ck), Boolean.valueOf(outerShadow.f2891ck)) && C3085sv.m13088k4(this.f2894fa, outerShadow.f2894fa) && C3085sv.m13088k4(this.f2903up, outerShadow.f2903up) && C3085sv.m13090k4(this.f2902to, outerShadow.f2902to);
    }

    @Override // com.aspose.slides.IOuterShadow
    public final double getBlurRadius() {
        return this.f2895h4;
    }

    @Override // com.aspose.slides.IOuterShadow
    public final float getDirection() {
        return this.f2900m9;
    }

    @Override // com.aspose.slides.IOuterShadow
    public final double getDistance() {
        return this.f2893dy;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f2905x6;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f2906yj, iPresentationComponentArr);
            this.f2905x6 = iPresentationComponentArr[0];
        }
        return this.f2905x6;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2906yj;
    }

    @Override // com.aspose.slides.IOuterShadow
    public final byte getRectangleAlign() {
        return this.f2892du;
    }

    @Override // com.aspose.slides.IOuterShadow
    public final boolean getRotateShadowWithShape() {
        return this.f2891ck;
    }

    @Override // com.aspose.slides.IOuterShadow
    public final double getScaleHorizontal() {
        return this.f2894fa;
    }

    @Override // com.aspose.slides.IOuterShadow
    public final double getScaleVertical() {
        return this.f2903up;
    }

    @Override // com.aspose.slides.IOuterShadow
    public final IColorFormat getShadowColor() {
        return this.f2902to;
    }

    @Override // com.aspose.slides.IOuterShadow
    public final double getSkewHorizontal() {
        return this.f2890c5;
    }

    @Override // com.aspose.slides.IOuterShadow
    public final double getSkewVertical() {
        return this.f2896jd;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return ((this.f2899ks & 4294967295L) + (this.f2902to.getVersion() & 4294967295L)) & 4294967295L;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Object memberwiseClone() {
        try {
            OuterShadow outerShadow = (OuterShadow) clone();
            ColorFormat colorFormat = this.f2902to;
            if (colorFormat == null) {
                return outerShadow;
            }
            outerShadow.f2902to.m1079k4(colorFormat);
            return outerShadow;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.IOuterShadow
    public final void setBlurRadius(double d) {
        this.f2895h4 = d;
        m2095kk();
    }

    @Override // com.aspose.slides.IOuterShadow
    public final void setDirection(float f) {
        this.f2900m9 = f;
        m2095kk();
    }

    @Override // com.aspose.slides.IOuterShadow
    public final void setDistance(double d) {
        this.f2893dy = d;
        m2095kk();
    }

    @Override // com.aspose.slides.IOuterShadow
    public final void setRectangleAlign(byte b) {
        this.f2892du = b;
        m2095kk();
    }

    @Override // com.aspose.slides.IOuterShadow
    public final void setRotateShadowWithShape(boolean z) {
        this.f2891ck = z;
        m2095kk();
    }

    @Override // com.aspose.slides.IOuterShadow
    public final void setScaleHorizontal(double d) {
        this.f2894fa = d;
        m2095kk();
    }

    @Override // com.aspose.slides.IOuterShadow
    public final void setScaleVertical(double d) {
        this.f2903up = d;
        m2095kk();
    }

    @Override // com.aspose.slides.IOuterShadow
    public final void setSkewHorizontal(double d) {
        this.f2890c5 = d;
        m2095kk();
    }

    @Override // com.aspose.slides.IOuterShadow
    public final void setSkewVertical(double d) {
        this.f2896jd = d;
        m2095kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final OuterShadow m2099x1() {
        final OuterShadow outerShadow = (OuterShadow) memberwiseClone();
        ColorFormat colorFormat = new ColorFormat(null);
        outerShadow.f2902to = colorFormat;
        colorFormat.m1079k4(this.f2902to);
        outerShadow.f2902to.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.OuterShadow.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(outerShadow) + "Aspose.Slides.Effects.OuterShadow.OnEffectChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                outerShadow.m2096to();
            }
        });
        return outerShadow;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IOuterShadowEffectiveData getEffective() {
        return m2097k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final vmd m2097k4() {
        if (this.f2901rv == null) {
            this.f2901rv = new vmd(this);
        }
        this.f2901rv.m63282k4(vmd.class);
        return this.f2901rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2098k4(InterfaceC14397rj interfaceC14397rj) {
        this.f2906yj = interfaceC14397rj;
        this.f2902to.m1081k4((InterfaceC14397rj) this);
        m2095kk();
    }
}
