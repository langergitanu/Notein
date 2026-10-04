package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p057c6.InterfaceC1987x1;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.ts */
/* JADX INFO: loaded from: classes.dex */
public class C4297ts extends AbstractC4282kp implements InterfaceC1987x1 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4282kp f11718k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4282kp f11719x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.ts$k4 */
    public static class k4 extends C4309x6 {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo17137k4() {
            return new C4297ts();
        }

        @Override // com.aspose.slides.internal.p150gi.C4309x6, com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            return C7019kk.m27469x1(abstractC4282kp, C4297ts.class) ? abstractC4282kp : super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
    }

    public C4297ts() {
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC4282kp m17273c5() {
        return this.f11718k4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4297ts c4297ts = (C4297ts) C7019kk.m27452k4(obj, C4297ts.class);
        return c4297ts != null && C10017to.m49170k4(this.f11719x1, c4297ts.f11719x1) && C10017to.m49170k4(this.f11718k4, c4297ts.f11718k4);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this;
    }

    public int hashCode() {
        return C10017to.m49168k4(this.f11718k4) + ((C10017to.m49168k4(this.f11719x1) + 31) * 31);
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC4282kp m17274jd() {
        return this.f11719x1;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1987x1
    /* JADX INFO: renamed from: k4 */
    public final AbstractC4282kp mo10116k4(int i) {
        if (i == 512) {
            return m17274jd();
        }
        if (i == 1536) {
            return m17273c5();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return C14113y2.m67407k4("LengthPair[", "ipd:", m17273c5().mo9922g_(), ", bpd:", m17274jd().mo9922g_(), "]");
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: u_ */
    public C4297ts mo17255u_() {
        return this;
    }

    public C4297ts(AbstractC4282kp abstractC4282kp) {
        this(abstractC4282kp, abstractC4282kp);
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1987x1
    /* JADX INFO: renamed from: k4 */
    public final void mo10117k4(int i, AbstractC4282kp abstractC4282kp, boolean z) {
        if (i == 512) {
            this.f11719x1 = abstractC4282kp;
        } else if (i == 1536) {
            this.f11718k4 = abstractC4282kp;
        }
    }

    public C4297ts(AbstractC4282kp abstractC4282kp, AbstractC4282kp abstractC4282kp2) {
        this();
        this.f11718k4 = abstractC4282kp;
        this.f11719x1 = abstractC4282kp2;
    }
}
