package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1987x1;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.bz */
/* JADX INFO: loaded from: classes.dex */
public class C4264bz extends AbstractC4282kp implements InterfaceC1987x1 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4282kp f11600k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC4282kp f11601kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4282kp f11603x1;

    /* JADX INFO: renamed from: to */
    private int f11602to = 0;

    /* JADX INFO: renamed from: du */
    private boolean f11599du = false;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.bz$k4 */
    public static class k4 extends C4309x6 {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo17137k4() {
            return new C4264bz();
        }

        @Override // com.aspose.slides.internal.p150gi.C4309x6, com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            if (C7019kk.m27469x1(abstractC4282kp, C4264bz.class)) {
                return abstractC4282kp;
            }
            int i = this.f11665k4;
            if (i != 17 && i != 127) {
                return super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
            }
            InterfaceC1984kk interfaceC1984kkMo9877dy = abstractC4282kp.mo9877dy();
            if (interfaceC1984kkMo9877dy != null && m17136k4(interfaceC1984kkMo9877dy)) {
                abstractC4282kp = C4261ar.f11596k4;
            }
            C4264bz c4264bz = (C4264bz) super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
            if ((c4264bz.f11602to & 2) != 0) {
                c4264bz.f11602to = 2;
            }
            return c4264bz;
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo17138k4(AbstractC4282kp abstractC4282kp, int i, AbstractC4282kp abstractC4282kp2) {
            InterfaceC1984kk interfaceC1984kkMo9877dy;
            InterfaceC1987x1 interfaceC1987x1 = (InterfaceC1987x1) abstractC4282kp.mo9922g_();
            int i2 = this.f11665k4;
            if ((i2 == 17 || i2 == 127) && (interfaceC1984kkMo9877dy = abstractC4282kp2.mo9877dy()) != null && m17136k4(interfaceC1984kkMo9877dy)) {
                interfaceC1987x1.mo10117k4(i, C4261ar.f11596k4, false);
                return abstractC4282kp;
            }
            interfaceC1987x1.mo10117k4(i, abstractC4282kp2, false);
            return abstractC4282kp;
        }

        /* JADX INFO: renamed from: k4 */
        private static boolean m17136k4(InterfaceC1984kk interfaceC1984kk) {
            if (!C7019kk.m27469x1(interfaceC1984kk, C4292ss.class) || ((C4292ss) interfaceC1984kk).m17269yj() >= 0.0d) {
                return interfaceC1984kk.mo9883kk() && interfaceC1984kk.mo9884to() < 0;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: du */
    private void m17125du(InterfaceC1981h4 interfaceC1981h4) {
        AbstractC4282kp abstractC4282kp;
        if (this.f11599du || interfaceC1981h4 == null) {
            return;
        }
        if (!this.f11600k4.m17256x6() && !this.f11601kk.m17256x6() && this.f11600k4.mo9877dy().mo9886x1(interfaceC1981h4) > this.f11601kk.mo9877dy().mo9886x1(interfaceC1981h4)) {
            if ((this.f11602to & 1) != 0) {
                this.f11601kk = this.f11600k4;
            } else {
                this.f11600k4 = this.f11601kk;
            }
        }
        if (!this.f11603x1.m17256x6() && !this.f11601kk.m17256x6() && this.f11603x1.mo9877dy().mo9886x1(interfaceC1981h4) > this.f11601kk.mo9877dy().mo9886x1(interfaceC1981h4)) {
            int i = this.f11602to;
            if ((i & 2) == 0 || (i & 4) != 0) {
                abstractC4282kp = this.f11601kk;
                this.f11603x1 = abstractC4282kp;
            } else {
                this.f11601kk = this.f11603x1;
            }
        } else if (!this.f11603x1.m17256x6() && !this.f11600k4.m17256x6() && this.f11603x1.mo9877dy().mo9886x1(interfaceC1981h4) < this.f11600k4.mo9877dy().mo9886x1(interfaceC1981h4)) {
            if ((this.f11602to & 1) != 0) {
                abstractC4282kp = this.f11600k4;
                this.f11603x1 = abstractC4282kp;
            } else {
                this.f11600k4 = this.f11603x1;
            }
        }
        if (this.f11603x1.m17256x6() && this.f11600k4.m17256x6() && (this.f11602to & 4) != 0) {
            this.f11603x1 = this.f11601kk;
        }
        if (this.f11603x1.m17256x6() && this.f11601kk.m17256x6() && (this.f11602to & 1) != 0) {
            this.f11603x1 = this.f11600k4;
        }
        this.f11599du = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4264bz c4264bz = (C4264bz) C7019kk.m27452k4(obj, C4264bz.class);
        return c4264bz != null && this.f11602to == c4264bz.f11602to && this.f11599du == c4264bz.f11599du && C10017to.m49170k4(this.f11600k4, c4264bz.f11600k4) && C10017to.m49170k4(this.f11603x1, c4264bz.f11603x1) && C10017to.m49170k4(this.f11601kk, c4264bz.f11601kk);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this;
    }

    public int hashCode() {
        return C10017to.m49168k4(this.f11601kk) + ((C10017to.m49168k4(this.f11603x1) + ((C10017to.m49168k4(this.f11600k4) + ((((this.f11602to + 31) * 31) + (this.f11599du ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: k_ */
    public C4264bz mo17130k_() {
        return this;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC4282kp m17131kk(InterfaceC1981h4 interfaceC1981h4) {
        m17125du(interfaceC1981h4);
        return this.f11601kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC4282kp m17133to(InterfaceC1981h4 interfaceC1981h4) {
        m17125du(interfaceC1981h4);
        return this.f11603x1;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return C14113y2.m67407k4("LengthRange[", "min:", m17134x1(null).mo9922g_(), ", max:", m17131kk(null).mo9922g_(), ", opt:", m17133to(null).mo9922g_(), "]");
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC4282kp m17134x1(InterfaceC1981h4 interfaceC1981h4) {
        m17125du(interfaceC1981h4);
        return this.f11600k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m17132kk(AbstractC4282kp abstractC4282kp, boolean z) {
        this.f11603x1 = abstractC4282kp;
        if (!z) {
            this.f11602to |= 2;
        }
        this.f11599du = false;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17135x1(AbstractC4282kp abstractC4282kp, boolean z) {
        this.f11601kk = abstractC4282kp;
        if (!z) {
            this.f11602to |= 4;
        }
        this.f11599du = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final C1375h4 m17128k4(InterfaceC1981h4 interfaceC1981h4) {
        int iMo9886x1 = m17134x1(interfaceC1981h4).m17256x6() ? 0 : m17134x1(interfaceC1981h4).mo9877dy().mo9886x1(interfaceC1981h4);
        return C1375h4.m8146k4(iMo9886x1, m17133to(interfaceC1981h4).m17256x6() ? iMo9886x1 : m17133to(interfaceC1981h4).mo9877dy().mo9886x1(interfaceC1981h4), m17131kk(interfaceC1981h4).m17256x6() ? Integer.MAX_VALUE : m17131kk(interfaceC1981h4).mo9877dy().mo9886x1(interfaceC1981h4));
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1987x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo10116k4(int i) {
        if (i == 3072) {
            return m17134x1(null);
        }
        if (i == 3584) {
            return m17133to(null);
        }
        if (i == 2560) {
            return m17131kk(null);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1987x1
    /* JADX INFO: renamed from: k4 */
    public void mo10117k4(int i, AbstractC4282kp abstractC4282kp, boolean z) {
        if (i == 3072) {
            m17129k4(abstractC4282kp, z);
        } else if (i == 3584) {
            m17132kk(abstractC4282kp, z);
        } else if (i == 2560) {
            m17135x1(abstractC4282kp, z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17129k4(AbstractC4282kp abstractC4282kp, boolean z) {
        this.f11600k4 = abstractC4282kp;
        if (!z) {
            this.f11602to |= 1;
        }
        this.f11599du = false;
    }
}
