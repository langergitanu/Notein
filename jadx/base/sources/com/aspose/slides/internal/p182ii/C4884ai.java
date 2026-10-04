package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.ai */
/* JADX INFO: loaded from: classes.dex */
public class C4884ai extends C1569kk {
    public C4884ai(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: ar */
    public final void m20199ar(String str) {
        mo22708k4("charoff", str);
    }

    /* JADX INFO: renamed from: j2 */
    public final String m20200j2() {
        return m59490c5("charoff", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12804k4 m20201k4(int i) {
        AbstractC4908jd abstractC4908jdM20202os = m20202os();
        if (i < -1 || i > abstractC4908jdM20202os.mo20312k4()) {
            throw new C12786x1((byte) 1);
        }
        C12804k4 c12804k4 = (C12804k4) C7019kk.m27452k4((Object) mo22660v4().mo22775du("TR"), C12804k4.class);
        return (C12804k4) C7019kk.m27452k4((Object) ((i == -1 || i == abstractC4908jdM20202os.mo20312k4()) ? m22641kk((AbstractC5535bv) c12804k4) : m22636k4((AbstractC5535bv) c12804k4, (AbstractC5535bv) C7019kk.m27452k4((Object) abstractC4908jdM20202os.mo20314k4(i), AbstractC5535bv.class))), C12804k4.class);
    }

    /* JADX INFO: renamed from: os */
    public final AbstractC4908jd m20202os() {
        return new C4923ri(this, m22716m9("TR"));
    }

    /* JADX INFO: renamed from: qq */
    public final void m20203qq(String str) {
        mo22708k4("char", str);
    }

    /* JADX INFO: renamed from: qw */
    public final String m20204qw() {
        return m59490c5("align", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: tq */
    public final String m20205tq() {
        return m59490c5("char", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: um */
    public final void m20206um(String str) {
        mo22708k4("valign", str);
    }

    /* JADX INFO: renamed from: w6 */
    public final String m20207w6() {
        return m59490c5("valign", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20208wl(String str) {
        mo22708k4("align", str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20209x1(int i) {
        AbstractC4908jd abstractC4908jdM20202os = m20202os();
        if (i < -1 || i >= abstractC4908jdM20202os.mo20312k4()) {
            throw new C12786x1((byte) 1);
        }
        if (i == -1) {
            i = abstractC4908jdM20202os.mo20312k4() - 1;
        }
        C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) abstractC4908jdM20202os.mo20314k4(i), C1569kk.class);
        c1569kk.m8452xw().m22663x1((AbstractC5535bv) c1569kk);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        if ("TBODY".equals(mo22700du())) {
            interfaceC1566du.mo8431x6(this);
            m8451x1(interfaceC1566du);
            interfaceC1566du.mo8404ne(this);
        } else if ("THEAD".equals(mo22700du())) {
            interfaceC1566du.mo8368ix(this);
            m8451x1(interfaceC1566du);
            interfaceC1566du.mo8409u4(this);
        } else if ("TFOOT".equals(mo22700du())) {
            interfaceC1566du.mo8412uz(this);
            m8451x1(interfaceC1566du);
            interfaceC1566du.mo8413wl(this);
        }
    }
}
