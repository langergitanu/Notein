package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.f9 */
/* JADX INFO: loaded from: classes.dex */
public class C4272f9 extends C4264bz {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4282kp f11647k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4282kp f11648x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.f9$k4 */
    public static class k4 extends C4309x6 {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo17137k4() {
            return new C4272f9();
        }

        @Override // com.aspose.slides.internal.p150gi.C4309x6, com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            return C7019kk.m27469x1(abstractC4282kp, C4272f9.class) ? abstractC4282kp : super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m17201du(AbstractC4282kp abstractC4282kp, boolean z) {
        this.f11648x1 = abstractC4282kp;
    }

    @Override // com.aspose.slides.internal.p150gi.C4264bz, com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this;
    }

    /* JADX INFO: renamed from: ix */
    public final boolean m17202ix() {
        return this.f11648x1.mo17251du() == 32;
    }

    @Override // com.aspose.slides.internal.p150gi.C4264bz, com.aspose.slides.internal.p057c6.InterfaceC1987x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo10116k4(int i) {
        return i == 4096 ? m17206yj() : i == 1024 ? m17203ne() : super.mo10116k4(i);
    }

    @Override // com.aspose.slides.internal.p150gi.C4264bz, com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: k_ */
    public C4264bz mo17130k_() {
        return this;
    }

    /* JADX INFO: renamed from: ne */
    public final AbstractC4282kp m17203ne() {
        return this.f11648x1;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: rv */
    public C4272f9 mo17204rv() {
        return this;
    }

    /* JADX INFO: renamed from: to */
    public final void m17205to(AbstractC4282kp abstractC4282kp, boolean z) {
        this.f11647k4 = abstractC4282kp;
    }

    @Override // com.aspose.slides.internal.p150gi.C4264bz, com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return C14113y2.m67407k4("Space[", "min:", m17134x1(null).mo9922g_(), ", max:", m17131kk(null).mo9922g_(), ", opt:", m17133to(null).mo9922g_(), ", precedence:", this.f11647k4.mo9922g_(), ", conditionality:", this.f11648x1.mo9922g_(), "]");
    }

    /* JADX INFO: renamed from: yj */
    public final AbstractC4282kp m17206yj() {
        return this.f11647k4;
    }

    @Override // com.aspose.slides.internal.p150gi.C4264bz, com.aspose.slides.internal.p057c6.InterfaceC1987x1
    /* JADX INFO: renamed from: k4 */
    public void mo10117k4(int i, AbstractC4282kp abstractC4282kp, boolean z) {
        if (i == 4096) {
            m17205to(abstractC4282kp, z);
        } else if (i == 1024) {
            m17201du(abstractC4282kp, z);
        } else {
            super.mo10117k4(i, abstractC4282kp, z);
        }
    }
}
