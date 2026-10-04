package com.aspose.slides.internal.p182ii;

import com.aspose.slides.OooOo00;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.jw */
/* JADX INFO: loaded from: classes.dex */
public class C4909jw extends C1569kk {
    public C4909jw(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: j2 */
    private boolean m20396j2() {
        for (AbstractC5535bv abstractC5535bvMo22653ss = mo22653ss(); abstractC5535bvMo22653ss != null; abstractC5535bvMo22653ss = abstractC5535bvMo22653ss.mo22631g8()) {
            C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) abstractC5535bvMo22653ss, C1569kk.class);
            if (c1569kk != null && OooOo00.OooO0O0(c1569kk) == 2 && c1569kk.m8445t6().m23858um() == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        if (m8445t6().m23853t6() == 2 && m8445t6().m23838lr().m54595dy().m26948x1() == -9999.0f) {
            return;
        }
        if (m8445t6().m23860uz().m54594m9() == 0 || !m20396j2()) {
            interfaceC1566du.mo4659m9(this);
            m8451x1(interfaceC1566du);
            interfaceC1566du.mo4647dy(this);
        } else {
            interfaceC1566du.mo4655k4(this);
            m8451x1(interfaceC1566du);
            interfaceC1566du.mo8421x1(this);
        }
    }

    /* JADX INFO: renamed from: qw */
    public final boolean m20398qw() {
        return mo22698c5("compact");
    }

    /* JADX INFO: renamed from: tq */
    public final String m20399tq() {
        return m59490c5(C18437z2.f56754h, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20400wl(String str) {
        mo22708k4(C18437z2.f56754h, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20397k4(boolean z) {
        m8444kk("compact", z);
    }
}
