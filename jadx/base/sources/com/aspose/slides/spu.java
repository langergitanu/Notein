package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class spu extends AbstractC14463so {

    /* JADX INFO: renamed from: x1 */
    static final spu f48887x1 = new spu(null);

    /* JADX INFO: renamed from: du */
    private float f48888du;

    /* JADX INFO: renamed from: dy */
    private IThreeDFormat f48889dy;

    /* JADX INFO: renamed from: h4 */
    private Backdrop3DScene f48890h4;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<tat> f48891k4 = new AbstractC7018k4<tat>() { // from class: com.aspose.slides.spu.1
        {
            spu.this.f48892kk = new tat() { // from class: com.aspose.slides.spu.1.1
                @Override // com.aspose.slides.tat
                /* JADX INFO: renamed from: k4 */
                public void mo1404k4() {
                    for (tat tatVar : ((AbstractC7018k4) C144651.this).f19081x1) {
                        if (tatVar != null) {
                            tatVar.mo1404k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private tat f48892kk;

    /* JADX INFO: renamed from: m9 */
    private long f48893m9;

    /* JADX INFO: renamed from: to */
    private boolean f48894to;

    public spu(IThreeDFormat iThreeDFormat) {
        this.f48889dy = iThreeDFormat;
        this.f48890h4 = new Backdrop3DScene((InterfaceC14397rj) iThreeDFormat);
    }

    /* JADX INFO: renamed from: du */
    private void m70715du() {
        this.f48893m9++;
        if (C7019kk.m27469x1(this.f48889dy, PVIObject.class)) {
            ((PVIObject) this.f48889dy).m2145uz();
        }
        tat tatVar = this.f48892kk;
        if (tatVar == null || this.f48891k4.m27430k4()) {
            return;
        }
        tatVar.mo1404k4();
    }

    /* JADX INFO: renamed from: kk */
    public final IBackdrop3DScene m70721kk() {
        return this.f48890h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m70722to() {
        return ((this.f48893m9 & 4294967295L) + (this.f48890h4.getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m70723x1() {
        return this.f48888du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70717k4(float f) {
        if (C3085sv.m13089k4(this.f48888du, f)) {
            return;
        }
        this.f48888du = f;
        m70715du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70718k4(spu spuVar) {
        if (C3085sv.m13090k4(this.f48890h4, spuVar.f48890h4) && C3085sv.m13090k4(Boolean.valueOf(this.f48894to), Boolean.valueOf(spuVar.f48894to)) && C3085sv.m13089k4(this.f48888du, spuVar.f48888du)) {
            return;
        }
        this.f48894to = spuVar.f48894to;
        this.f48888du = spuVar.f48888du;
        this.f48890h4.m332k4(spuVar.f48890h4);
        m70715du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70719k4(boolean z) {
        if (C3085sv.m13090k4(Boolean.valueOf(this.f48894to), Boolean.valueOf(z))) {
            return;
        }
        this.f48894to = z;
        m70715du();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m70720k4() {
        return this.f48894to;
    }
}
