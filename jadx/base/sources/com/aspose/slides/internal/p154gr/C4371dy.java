package com.aspose.slides.internal.p154gr;

import com.aspose.slides.internal.p282mu.C6541k4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.gr.dy */
/* JADX INFO: loaded from: classes.dex */
class C4371dy {

    /* JADX INFO: renamed from: kk */
    private static String f11880kk = "c:/tmp/fillPath-debug.java";

    /* JADX INFO: renamed from: x1 */
    private static int f11881x1;

    /* JADX INFO: renamed from: k4 */
    private final C4369ck f11882k4;

    public C4371dy(C4369ck c4369ck) {
        this.f11882k4 = c4369ck;
    }

    /* JADX INFO: renamed from: k4 */
    public void m17607k4(AbstractC12024x1 abstractC12024x1, C11896dy c11896dy) {
        InterfaceC14122k4 interfaceC14122k4Mo17582wl = this.f11882k4.mo17582wl();
        C4376m9 c4376m9 = new C4376m9(this.f11882k4, abstractC12024x1);
        try {
            this.f11882k4.m17578um();
            C11913yj c11913yjM17472bv = this.f11882k4.m17472bv();
            c11913yjM17472bv.m55769k4(interfaceC14122k4Mo17582wl.mo67596kk(), 1);
            interfaceC14122k4Mo17582wl.mo67593k4(C11913yj.f40121k4);
            if (!(abstractC12024x1 instanceof C11900jd)) {
                C11913yj c11913yjM56867du = abstractC12024x1.m56867du();
                c11913yjM56867du.m55769k4(c11913yjM17472bv, 1);
                abstractC12024x1.m56871k4(c11913yjM56867du);
            }
            interfaceC14122k4Mo17582wl.mo67595k4(abstractC12024x1);
            interfaceC14122k4Mo17582wl.mo67598kk(this.f11882k4.m17484k4(C6541k4.m26346k4(c11913yjM17472bv, c11896dy.m55568ne())));
            c4376m9.m17637k4(this.f11882k4, abstractC12024x1);
        } catch (Throwable th) {
            c4376m9.m17637k4(this.f11882k4, abstractC12024x1);
            throw th;
        }
    }
}
