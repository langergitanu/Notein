package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5805u4;
import com.aspose.slides.internal.p231kk.InterfaceC5806um;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.vj */
/* JADX INFO: loaded from: classes.dex */
public class C4938vj extends C1569kk implements InterfaceC5806um {

    /* JADX INFO: renamed from: kk */
    private boolean f13517kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC5775ar f13518to;

    public C4938vj(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
        this.f13517kk = false;
    }

    /* JADX INFO: renamed from: w6 */
    private void m20672w6() {
        if (C14113y2.m67411k4(mo22607e0())) {
            return;
        }
        if (C14113y2.m67411k4(m20678tq()) || C14113y2.m67432to(m20678tq(), "all", (short) 5) || C14113y2.m67432to(m20678tq(), "screen", (short) 5)) {
            this.f13518to = ((InterfaceC5805u4) mo22660v4()).mo20431k4().mo25988k4((InterfaceC12777qq) this);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final String m20673j2() {
        return m59490c5(C18437z2.f56754h, C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5806um
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC5775ar mo20674k4() {
        if (this.f13518to == null) {
            m20672w6();
        }
        return this.f13518to;
    }

    /* JADX INFO: renamed from: qq */
    public final void m20676qq(String str) {
        mo22708k4(C18437z2.f56754h, str);
    }

    /* JADX INFO: renamed from: qw */
    public final boolean m20677qw() {
        return this.f13517kk;
    }

    /* JADX INFO: renamed from: tq */
    public final String m20678tq() {
        return m59490c5("media", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20679wl(String str) {
        mo22708k4("media", str);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20675k4(boolean z) {
        this.f13517kk = z;
    }
}
