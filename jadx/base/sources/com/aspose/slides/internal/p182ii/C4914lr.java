package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.lr */
/* JADX INFO: loaded from: classes.dex */
public class C4914lr extends C1569kk {
    public C4914lr(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
    }

    /* JADX INFO: renamed from: qw */
    public final C4918ne m20451qw() {
        return (C4918ne) m8440k4(C4918ne.class);
    }

    /* JADX INFO: renamed from: tq */
    public final String m20452tq() {
        return m59490c5(AuthenticationConstants.AAD.QUERY_PROMPT, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20453wl(String str) {
        mo22708k4(AuthenticationConstants.AAD.QUERY_PROMPT, str);
    }
}
