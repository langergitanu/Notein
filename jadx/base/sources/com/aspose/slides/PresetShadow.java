package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
public final class PresetShadow implements IPresetShadow, lft, InterfaceC14376r6, InterfaceC14397rj, Cloneable {

    /* JADX INFO: renamed from: c5 */
    private long f3166c5;

    /* JADX INFO: renamed from: ck */
    private IPresentationComponent f3167ck;

    /* JADX INFO: renamed from: du */
    private double f3168du;

    /* JADX INFO: renamed from: dy */
    private InterfaceC14397rj f3169dy;

    /* JADX INFO: renamed from: h4 */
    private ColorFormat f3170h4;

    /* JADX INFO: renamed from: jd */
    private him f3171jd;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC1156gp> f3172k4 = new AbstractC7018k4<AbstractC1156gp>() { // from class: com.aspose.slides.PresetShadow.1
        {
            PresetShadow.this.f3173kk = new AbstractC1156gp() { // from class: com.aspose.slides.PresetShadow.1.1
                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    for (AbstractC1156gp abstractC1156gp : ((AbstractC7018k4) C05901.this).f19081x1) {
                        if (abstractC1156gp != null) {
                            abstractC1156gp.mo1395k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private AbstractC1156gp f3173kk;

    /* JADX INFO: renamed from: m9 */
    private int f3174m9;

    /* JADX INFO: renamed from: to */
    private float f3175to;

    /* JADX INFO: renamed from: x1 */
    final AbstractC14741wk f3176x1;

    public PresetShadow(InterfaceC14397rj interfaceC14397rj) {
        AbstractC14741wk abstractC14741wk = new AbstractC14741wk() { // from class: com.aspose.slides.PresetShadow.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.PresetShadow.OnEffectChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                PresetShadow.this.m2453to();
            }
        };
        this.f3176x1 = abstractC14741wk;
        this.f3174m9 = 0;
        this.f3169dy = interfaceC14397rj;
        ColorFormat colorFormat = new ColorFormat(this, 7);
        this.f3170h4 = colorFormat;
        colorFormat.f1951k4.mo27432x1(abstractC14741wk);
    }

    /* JADX INFO: renamed from: kk */
    private void m2452kk() {
        this.f3166c5++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m2453to() {
        AbstractC1156gp abstractC1156gp = this.f3173kk;
        if (abstractC1156gp == null || this.f3172k4.m27430k4()) {
            return;
        }
        abstractC1156gp.mo1395k4();
    }

    public boolean equals(Object obj) {
        PresetShadow presetShadow = (PresetShadow) C7019kk.m27452k4(obj, PresetShadow.class);
        if (presetShadow == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13089k4(this.f3175to, presetShadow.f3175to) && C3085sv.m13088k4(this.f3168du, presetShadow.f3168du) && C3085sv.m13089k4((float) this.f3174m9, (float) presetShadow.f3174m9) && C3085sv.m13090k4(this.f3170h4, presetShadow.f3170h4);
    }

    @Override // com.aspose.slides.IPresetShadow
    public final float getDirection() {
        return this.f3175to;
    }

    @Override // com.aspose.slides.IPresetShadow
    public final double getDistance() {
        return this.f3168du;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f3167ck;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f3169dy, iPresentationComponentArr);
            this.f3167ck = iPresentationComponentArr[0];
        }
        return this.f3167ck;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3169dy;
    }

    @Override // com.aspose.slides.IPresetShadow
    public final int getPreset() {
        return this.f3174m9;
    }

    @Override // com.aspose.slides.IPresetShadow
    public final IColorFormat getShadowColor() {
        return this.f3170h4;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return ((this.f3166c5 & 4294967295L) + (this.f3170h4.getVersion() & 4294967295L)) & 4294967295L;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Object memberwiseClone() {
        try {
            PresetShadow presetShadow = (PresetShadow) clone();
            ColorFormat colorFormat = this.f3170h4;
            if (colorFormat == null) {
                return presetShadow;
            }
            presetShadow.f3170h4.m1079k4(colorFormat);
            return presetShadow;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.IPresetShadow
    public final void setDirection(float f) {
        this.f3175to = f;
        m2452kk();
    }

    @Override // com.aspose.slides.IPresetShadow
    public final void setDistance(double d) {
        this.f3168du = d;
        m2452kk();
    }

    @Override // com.aspose.slides.IPresetShadow
    public final void setPreset(int i) {
        this.f3174m9 = i;
        m2452kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final PresetShadow m2456x1() {
        final PresetShadow presetShadow = (PresetShadow) memberwiseClone();
        ColorFormat colorFormat = new ColorFormat(null);
        presetShadow.f3170h4 = colorFormat;
        colorFormat.m1079k4(this.f3170h4);
        presetShadow.f3170h4.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.PresetShadow.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(presetShadow) + "Aspose.Slides.Effects.PresetShadow.OnEffectChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                presetShadow.m2453to();
            }
        });
        return presetShadow;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IPresetShadowEffectiveData getEffective() {
        return m2454k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final him m2454k4() {
        if (this.f3171jd == null) {
            this.f3171jd = new him(this);
        }
        this.f3171jd.m63282k4(him.class);
        return this.f3171jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2455k4(InterfaceC14397rj interfaceC14397rj) {
        this.f3169dy = interfaceC14397rj;
        this.f3170h4.m1081k4((InterfaceC14397rj) this);
        m2452kk();
    }
}
