package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p407st.C10543mi;
import com.aspose.slides.internal.p407st.C10695wm;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: loaded from: classes3.dex */
class pya {

    /* JADX INFO: renamed from: k4 */
    private C3134k4 f48200k4;

    /* JADX INFO: renamed from: x1 */
    private C12016rv f48202x1 = new C12016rv(0, 0);

    /* JADX INFO: renamed from: kk */
    private C12023wl f48201kk = new C12023wl(0, 0);

    public pya(C3134k4 c3134k4) {
        this.f48200k4 = c3134k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12016rv m69329k4(C12016rv c12016rv) {
        return new C12016rv(c12016rv.m56708k4() + this.f48202x1.m56708k4(), c12016rv.m56713x1() + this.f48202x1.m56713x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69330k4(C10695wm c10695wm) {
        C10543mi c10543mi = new C10543mi();
        c10543mi.m51405k4(this.f48200k4, c10695wm);
        this.f48202x1 = new C12016rv(c10543mi.m51294x1(), c10543mi.m51290kk());
        this.f48201kk = new C12023wl(c10543mi.m51292to(), c10543mi.m51287du());
    }
}
