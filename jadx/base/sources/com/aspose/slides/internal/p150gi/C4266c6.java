package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p057c6.InterfaceC1987x1;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.c6 */
/* JADX INFO: loaded from: classes.dex */
public class C4266c6 extends AbstractC4282kp implements InterfaceC1987x1 {

    /* JADX INFO: renamed from: k4 */
    private boolean f11630k4 = false;

    /* JADX INFO: renamed from: kk */
    private AbstractC4282kp f11631kk;

    /* JADX INFO: renamed from: to */
    private AbstractC4282kp f11632to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4282kp f11633x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.c6$k4 */
    public static class k4 extends C4309x6 {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo17137k4() {
            return new C4266c6();
        }

        @Override // com.aspose.slides.internal.p150gi.C4309x6, com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            return C7019kk.m27469x1(abstractC4282kp, C4266c6.class) ? abstractC4282kp : super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC4282kp m17185c5() {
        return this.f11633x1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4266c6 c4266c6 = (C4266c6) C7019kk.m27452k4(obj, C4266c6.class);
        return c4266c6 != null && c4266c6.f11631kk == this.f11631kk && c4266c6.f11633x1 == this.f11633x1 && c4266c6.f11632to == this.f11632to;
    }

    /* JADX INFO: renamed from: fa */
    public final AbstractC4282kp m17186fa() {
        return this.f11632to;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this;
    }

    public int hashCode() {
        AbstractC4282kp abstractC4282kp = this.f11631kk;
        int iHashCode = (629 + (abstractC4282kp == null ? 0 : abstractC4282kp.hashCode())) * 37;
        AbstractC4282kp abstractC4282kp2 = this.f11633x1;
        int iHashCode2 = (iHashCode + (abstractC4282kp2 == null ? 0 : abstractC4282kp2.hashCode())) * 37;
        AbstractC4282kp abstractC4282kp3 = this.f11632to;
        return iHashCode2 + (abstractC4282kp3 != null ? abstractC4282kp3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC4282kp m17187jd() {
        return this.f11631kk;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1987x1
    /* JADX INFO: renamed from: k4 */
    public final AbstractC4282kp mo10116k4(int i) {
        if (i == 5120) {
            return m17185c5();
        }
        if (i == 4608) {
            return m17187jd();
        }
        if (i == 5632) {
            return m17186fa();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return C14113y2.m67407k4("Keep[", "withinLine:", m17185c5().mo9922g_(), ", withinColumn:", m17187jd().mo9922g_(), ", withinPage:", m17186fa().mo9922g_(), "]");
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: up */
    public C4266c6 mo17190up() {
        this.f11630k4 = true;
        return this;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17191x1(AbstractC4282kp abstractC4282kp, boolean z) {
        this.f11632to = abstractC4282kp;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1987x1
    /* JADX INFO: renamed from: k4 */
    public final void mo10117k4(int i, AbstractC4282kp abstractC4282kp, boolean z) {
        if (this.f11630k4) {
            return;
        }
        if (i == 5120) {
            m17189k4(abstractC4282kp, z);
        } else if (i == 4608) {
            m17188k4(abstractC4282kp);
        } else if (i == 5632) {
            m17191x1(abstractC4282kp, z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17188k4(AbstractC4282kp abstractC4282kp) {
        this.f11631kk = abstractC4282kp;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17189k4(AbstractC4282kp abstractC4282kp, boolean z) {
        this.f11633x1 = abstractC4282kp;
    }
}
