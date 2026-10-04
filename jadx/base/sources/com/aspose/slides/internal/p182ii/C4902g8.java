package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.g8 */
/* JADX INFO: loaded from: classes.dex */
public class C4902g8 extends C1569kk {
    public C4902g8(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        m8451x1(interfaceC1566du);
    }

    /* JADX INFO: renamed from: qw */
    public final boolean m20352qw() {
        return mo22698c5("disabled");
    }

    /* JADX INFO: renamed from: tq */
    public final String m20353tq() {
        return m59490c5(Constants.ScionAnalytics.PARAM_LABEL, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20354wl(String str) {
        mo22708k4(Constants.ScionAnalytics.PARAM_LABEL, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20351k4(boolean z) {
        m8444kk("disabled", z);
    }
}
