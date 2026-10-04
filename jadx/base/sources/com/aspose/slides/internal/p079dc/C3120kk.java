package com.aspose.slides.internal.p079dc;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5545k4;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.dc.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3120kk extends C1569kk {
    public C3120kk(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        boolean z;
        if (mo22698c5("xmlns")) {
            z = false;
        } else {
            mo22708k4("xmlns", "http://www.w3.org/2000/svg");
            z = true;
        }
        int iMo59443k4 = m22704h4().mo59443k4();
        int i = 0;
        while (i < iMo59443k4) {
            C5545k4 c5545k4 = (C5545k4) m22704h4().mo59444k4(i);
            if (!C14117yj.m67519h4(c5545k4.mo22604c5().charAt(0))) {
                m22704h4().m22860x1((InterfaceC12772kk) c5545k4);
                i--;
                iMo59443k4--;
            }
            i++;
        }
        InterfaceC12772kk interfaceC12772kkMo22861x1 = m22704h4().mo22861x1("xmlns");
        if (C14113y2.m67411k4(interfaceC12772kkMo22861x1.mo22741kk()) || !C14113y2.m67432to("http://www.w3.org/2000/svg", interfaceC12772kkMo22861x1.mo22741kk(), (short) 5)) {
            interfaceC12772kkMo22861x1.mo22739k4("http://www.w3.org/2000/svg");
        }
        interfaceC1566du.mo8376k4(this);
        if (z) {
            m22701du("xmlns");
        }
    }
}
