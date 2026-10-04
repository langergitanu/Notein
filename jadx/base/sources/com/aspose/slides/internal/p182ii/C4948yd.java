package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.yd */
/* JADX INFO: loaded from: classes.dex */
public class C4948yd extends C1569kk {
    public C4948yd(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20773k4(int i) {
        m59500k4("value", i);
    }

    /* JADX INFO: renamed from: qw */
    public final String m20774qw() {
        return m59490c5(C18437z2.f56754h, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: tq */
    public final int m20775tq() {
        return ((Integer) m59497k4("value", 0, (Class<int>) Integer.class)).intValue();
    }

    /* JADX INFO: renamed from: wl */
    public final void m20776wl(String str) {
        mo22708k4(C18437z2.f56754h, str);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        if (m8445t6().m23860uz().m54594m9() == 21) {
            return;
        }
        if ((m8445t6().m23860uz().m54594m9() == 2 || m8452xw() == null || m8452xw().m8445t6().m23860uz().m54594m9() == 1) && m8445t6().m23858um() == 2) {
            interfaceC1566du.mo8398k4(this);
            m8451x1(interfaceC1566du);
            interfaceC1566du.mo8430x1(this);
        } else {
            interfaceC1566du.mo8373k4((C1569kk) this);
            m8451x1(interfaceC1566du);
            interfaceC1566du.mo8414x1((C1569kk) this);
        }
    }
}
