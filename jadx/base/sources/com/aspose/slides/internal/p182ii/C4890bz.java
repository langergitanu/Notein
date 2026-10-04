package com.aspose.slides.internal.p182ii;

import com.aspose.slides.OooOo00;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18385v2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.bz */
/* JADX INFO: loaded from: classes.dex */
public class C4890bz extends C1569kk {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f13486kk = new C7017h4("1", "a", C18385v2.f56336h, ContextChain.TAG_INFRA, "I");

    public C4890bz(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: os */
    private boolean m20281os() {
        for (AbstractC5535bv abstractC5535bvMo22653ss = mo22653ss(); abstractC5535bvMo22653ss != null; abstractC5535bvMo22653ss = abstractC5535bvMo22653ss.mo22631g8()) {
            C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) abstractC5535bvMo22653ss, C1569kk.class);
            if (c1569kk != null && OooOo00.OooO0O0(c1569kk) == 2 && c1569kk.m8445t6().m23858um() == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j2 */
    public final String m20282j2() {
        return m59490c5(C18437z2.f56754h, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20283k4(int i) {
        m59500k4("start", i);
    }

    /* JADX INFO: renamed from: qw */
    public final boolean m20285qw() {
        return mo22698c5("compact");
    }

    /* JADX INFO: renamed from: tq */
    public final int m20286tq() {
        return ((Integer) m59497k4("start", 1, (Class<int>) Integer.class)).intValue();
    }

    /* JADX INFO: renamed from: w6 */
    public final String m20287w6() {
        int iM27428k4 = f13486kk.m27428k4(mo22721to(C18437z2.f56754h));
        return iM27428k4 != 1 ? iM27428k4 != 2 ? iM27428k4 != 3 ? iM27428k4 != 4 ? "decimal" : "upper-roman" : "lower-roman" : "upper-alpha" : "lower-alpha";
    }

    /* JADX INFO: renamed from: wl */
    public final void m20288wl(String str) {
        mo22708k4(C18437z2.f56754h, str);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        if (m8445t6().m23860uz().m54594m9() == 0 || !m20281os()) {
            interfaceC1566du.mo4659m9(this);
            m8451x1(interfaceC1566du);
            interfaceC1566du.mo4647dy(this);
        } else {
            interfaceC1566du.mo4651k4(this);
            m8451x1(interfaceC1566du);
            interfaceC1566du.mo8417x1(this);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20284k4(boolean z) {
        m8444kk("compact", z);
    }
}
