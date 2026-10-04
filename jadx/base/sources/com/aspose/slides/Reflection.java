package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
public final class Reflection implements IReflection, lft, InterfaceC14376r6, InterfaceC14397rj, Cloneable {

    /* JADX INFO: renamed from: du */
    private float f3205du;

    /* JADX INFO: renamed from: fa */
    private double f3207fa;

    /* JADX INFO: renamed from: h4 */
    private double f3208h4;

    /* JADX INFO: renamed from: ix */
    private rhs f3209ix;

    /* JADX INFO: renamed from: ne */
    private long f3215ne;

    /* JADX INFO: renamed from: to */
    private double f3217to;

    /* JADX INFO: renamed from: u4 */
    private IPresentationComponent f3218u4;

    /* JADX INFO: renamed from: up */
    private double f3219up;

    /* JADX INFO: renamed from: x1 */
    private AbstractC1156gp f3220x1;

    /* JADX INFO: renamed from: x6 */
    private InterfaceC14397rj f3221x6;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC1156gp> f3211k4 = new AbstractC7018k4<AbstractC1156gp>() { // from class: com.aspose.slides.Reflection.1
        {
            Reflection.this.f3220x1 = new AbstractC1156gp() { // from class: com.aspose.slides.Reflection.1.1
                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    for (AbstractC1156gp abstractC1156gp : ((AbstractC7018k4) C06011.this).f19081x1) {
                        if (abstractC1156gp != null) {
                            abstractC1156gp.mo1395k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private byte f3212kk = -1;

    /* JADX INFO: renamed from: m9 */
    private float f3214m9 = 0.0f;

    /* JADX INFO: renamed from: dy */
    private float f3206dy = 100.0f;

    /* JADX INFO: renamed from: c5 */
    private float f3203c5 = 90.0f;

    /* JADX INFO: renamed from: jd */
    private float f3210jd = 100.0f;

    /* JADX INFO: renamed from: ck */
    private float f3204ck = 0.0f;

    /* JADX INFO: renamed from: yj */
    private boolean f3222yj = true;

    /* JADX INFO: renamed from: ks */
    private double f3213ks = 100.0d;

    /* JADX INFO: renamed from: rv */
    private double f3216rv = 100.0d;

    public Reflection(InterfaceC14397rj interfaceC14397rj) {
        this.f3221x6 = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: kk */
    private void m2468kk() {
        this.f3215ne++;
        m2469to();
    }

    /* JADX INFO: renamed from: to */
    private void m2469to() {
        AbstractC1156gp abstractC1156gp = this.f3220x1;
        if (abstractC1156gp == null || this.f3211k4.m27430k4()) {
            return;
        }
        abstractC1156gp.mo1395k4();
    }

    public boolean equals(Object obj) {
        Reflection reflection = (Reflection) C7019kk.m27452k4(obj, Reflection.class);
        if (reflection == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13089k4((float) this.f3212kk, (float) reflection.f3212kk) && C3085sv.m13088k4(this.f3217to, reflection.f3217to) && C3085sv.m13089k4(this.f3205du, reflection.f3205du) && C3085sv.m13088k4(this.f3208h4, reflection.f3208h4) && C3085sv.m13089k4(this.f3214m9, reflection.f3214m9) && C3085sv.m13089k4(this.f3206dy, reflection.f3206dy) && C3085sv.m13089k4(this.f3203c5, reflection.f3203c5) && C3085sv.m13089k4(this.f3210jd, reflection.f3210jd) && C3085sv.m13089k4(this.f3204ck, reflection.f3204ck) && C3085sv.m13088k4(this.f3207fa, reflection.f3207fa) && C3085sv.m13088k4(this.f3219up, reflection.f3219up) && C3085sv.m13090k4(Boolean.valueOf(this.f3222yj), Boolean.valueOf(reflection.f3222yj)) && C3085sv.m13088k4(this.f3213ks, reflection.f3213ks) && C3085sv.m13088k4(this.f3216rv, reflection.f3216rv);
    }

    @Override // com.aspose.slides.IReflection
    public final double getBlurRadius() {
        return this.f3217to;
    }

    @Override // com.aspose.slides.IReflection
    public final float getDirection() {
        return this.f3205du;
    }

    @Override // com.aspose.slides.IReflection
    public final double getDistance() {
        return this.f3208h4;
    }

    @Override // com.aspose.slides.IReflection
    public final float getEndPosAlpha() {
        return this.f3206dy;
    }

    @Override // com.aspose.slides.IReflection
    public final float getEndReflectionOpacity() {
        return this.f3204ck;
    }

    @Override // com.aspose.slides.IReflection
    public final float getFadeDirection() {
        return this.f3203c5;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f3218u4;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f3221x6, iPresentationComponentArr);
            this.f3218u4 = iPresentationComponentArr[0];
        }
        return this.f3218u4;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3221x6;
    }

    @Override // com.aspose.slides.IReflection
    public final byte getRectangleAlign() {
        return this.f3212kk;
    }

    @Override // com.aspose.slides.IReflection
    public final boolean getRotateShadowWithShape() {
        return this.f3222yj;
    }

    @Override // com.aspose.slides.IReflection
    public final double getScaleHorizontal() {
        return this.f3213ks;
    }

    @Override // com.aspose.slides.IReflection
    public final double getScaleVertical() {
        return this.f3216rv;
    }

    @Override // com.aspose.slides.IReflection
    public final double getSkewHorizontal() {
        return this.f3207fa;
    }

    @Override // com.aspose.slides.IReflection
    public final double getSkewVertical() {
        return this.f3219up;
    }

    @Override // com.aspose.slides.IReflection
    public final float getStartPosAlpha() {
        return this.f3214m9;
    }

    @Override // com.aspose.slides.IReflection
    public final float getStartReflectionOpacity() {
        return this.f3210jd;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return this.f3215ne;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Object memberwiseClone() {
        try {
            return (Reflection) clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.IReflection
    public final void setBlurRadius(double d) {
        this.f3217to = d;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setDirection(float f) {
        this.f3205du = f;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setDistance(double d) {
        this.f3208h4 = d;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setEndPosAlpha(float f) {
        this.f3206dy = f;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setEndReflectionOpacity(float f) {
        this.f3204ck = f;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setFadeDirection(float f) {
        this.f3203c5 = f;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setRectangleAlign(byte b) {
        this.f3212kk = b;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setRotateShadowWithShape(boolean z) {
        this.f3222yj = z;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setScaleHorizontal(double d) {
        this.f3213ks = d;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setScaleVertical(double d) {
        this.f3216rv = d;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setSkewHorizontal(double d) {
        this.f3207fa = d;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setSkewVertical(double d) {
        this.f3219up = d;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setStartPosAlpha(float f) {
        this.f3214m9 = f;
        m2468kk();
    }

    @Override // com.aspose.slides.IReflection
    public final void setStartReflectionOpacity(float f) {
        this.f3210jd = f;
        m2468kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final Reflection m2472x1() {
        return (Reflection) memberwiseClone();
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IReflectionEffectiveData getEffective() {
        return m2470k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final rhs m2470k4() {
        if (this.f3209ix == null) {
            this.f3209ix = new rhs(this);
        }
        return this.f3209ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2471k4(InterfaceC14397rj interfaceC14397rj) {
        this.f3221x6 = interfaceC14397rj;
        m2468kk();
    }
}
