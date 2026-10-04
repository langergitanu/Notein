package com.aspose.slides.internal.p150gi;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1987x1;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.ne */
/* JADX INFO: loaded from: classes.dex */
public class C4286ne extends AbstractC4282kp implements InterfaceC1987x1 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4282kp f11701k4;

    /* JADX INFO: renamed from: kk */
    private boolean f11702kk = false;

    /* JADX INFO: renamed from: to */
    private int f11703to = -1;

    /* JADX INFO: renamed from: x1 */
    private C4288qq f11704x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.ne$k4 */
    public static class k4 extends C4309x6 {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo17137k4() {
            return new C4286ne();
        }

        @Override // com.aspose.slides.internal.p150gi.C4309x6, com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            return C7019kk.m27469x1(abstractC4282kp, C4266c6.class) ? abstractC4282kp : super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public int mo17182c5() {
        return this.f11701k4.mo9877dy().mo9884to();
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: ck */
    public C4286ne mo17250ck() {
        if (this.f11701k4.mo9877dy().mo9883kk()) {
            this.f11702kk = true;
        }
        return this;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: dy */
    public InterfaceC1984kk mo9877dy() {
        return this.f11701k4.mo9877dy();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4286ne c4286ne = (C4286ne) C7019kk.m27452k4(obj, C4286ne.class);
        return c4286ne != null && this.f11701k4 == c4286ne.f11701k4 && this.f11704x1 == c4286ne.f11704x1;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this;
    }

    public int hashCode() {
        if (this.f11703to == -1) {
            AbstractC4282kp abstractC4282kp = this.f11701k4;
            int iHashCode = (629 + (abstractC4282kp == null ? 0 : abstractC4282kp.hashCode())) * 37;
            C4288qq c4288qq = this.f11704x1;
            this.f11703to = iHashCode + (c4288qq != null ? c4288qq.hashCode() : 0);
        }
        return this.f11703to;
    }

    /* JADX INFO: renamed from: jd */
    public boolean mo17183jd() {
        return this.f11704x1.mo17251du() == 32;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo17184k4(InterfaceC1981h4 interfaceC1981h4) {
        return this.f11701k4.mo9877dy().mo9886x1(interfaceC1981h4);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return C14113y2.m67408k4("CondLength[", this.f11701k4.mo9922g_().toString(), ", ", mo17183jd() ? C14113y2.m67368h4(this.f11704x1.toString()) : this.f11704x1.toString(), "]");
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo10116k4(int i) {
        if (i == 2048) {
            return this.f11701k4;
        }
        if (i == 1024) {
            return this.f11704x1;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo10117k4(int i, AbstractC4282kp abstractC4282kp, boolean z) {
        if (this.f11702kk) {
            throw new Exception("CondLengthProperty.setComponent() called on a cached value!");
        }
        if (i == 2048) {
            this.f11701k4 = abstractC4282kp;
        } else if (i == 1024) {
            this.f11704x1 = (C4288qq) abstractC4282kp;
        }
    }
}
