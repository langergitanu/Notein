package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.sv */
/* JADX INFO: loaded from: classes.dex */
public class C4927sv extends C1569kk {

    /* JADX INFO: renamed from: kk */
    private boolean f13508kk;

    /* JADX INFO: renamed from: to */
    private boolean f13509to;

    public C4927sv(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: ri */
    private void m20520ri() {
        if (this.f13508kk) {
            return;
        }
        this.f13509to = m20530tq();
        this.f13508kk = true;
    }

    /* JADX INFO: renamed from: ai */
    public final String m20521ai() {
        return m59490c5("value", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: em */
    public final String m20522em() {
        return m59490c5(Constants.ScionAnalytics.PARAM_LABEL, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: j2 */
    public final String m20523j2() {
        return mo22607e0();
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        interfaceC1566du.mo8388k4(this);
        m8451x1(interfaceC1566du);
        interfaceC1566du.mo8424x1(this);
    }

    /* JADX INFO: renamed from: kk */
    public final void m20525kk(boolean z) {
        m8444kk("disabled", z);
    }

    /* JADX INFO: renamed from: os */
    public final boolean m20526os() {
        return mo22698c5("disabled");
    }

    /* JADX INFO: renamed from: qq */
    public final void m20527qq(String str) {
        mo22708k4("value", str);
    }

    /* JADX INFO: renamed from: qw */
    public final C4918ne m20528qw() {
        return (C4918ne) m8440k4(C4918ne.class);
    }

    /* JADX INFO: renamed from: to */
    public final void m20529to(boolean z) {
        this.f13509to = z;
        this.f13508kk = true;
    }

    /* JADX INFO: renamed from: tq */
    public final boolean m20530tq() {
        return mo22698c5("selected");
    }

    /* JADX INFO: renamed from: w6 */
    public final int m20531w6() {
        return 0;
    }

    /* JADX INFO: renamed from: wl */
    public final void m20532wl(String str) {
        mo22708k4(Constants.ScionAnalytics.PARAM_LABEL, str);
    }

    /* JADX INFO: renamed from: zj */
    public final boolean m20533zj() {
        m20520ri();
        return this.f13509to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20524k4(boolean z) {
        m20520ri();
        m8444kk("selected", z);
    }
}
