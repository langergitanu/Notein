package com.aspose.slides.internal.p351q5;

import com.aspose.slides.internal.p081de.C3155to;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p138fu.C4126jd;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p248lf.AbstractC6033m9;
import com.aspose.slides.internal.p248lf.C6029du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p321on.C7125kk;
import com.aspose.slides.internal.p400sk.C10230kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.q5.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9754x1 extends AbstractC6033m9 {

    /* JADX INFO: renamed from: k4 */
    private final C3155to f35242k4;

    /* JADX INFO: renamed from: kk */
    private final C4126jd f35243kk;

    /* JADX INFO: renamed from: x1 */
    private final C12018u4 f35244x1;

    public C9754x1(C3155to c3155to, C5659x1 c5659x1, C4126jd c4126jd, C6029du c6029du, C12018u4 c12018u4) {
        super(c5659x1, c6029du);
        this.f35242k4 = c3155to;
        this.f35244x1 = c12018u4;
        this.f35243kk = c4126jd;
    }

    @Override // com.aspose.slides.internal.p248lf.InterfaceC6031k4
    /* JADX INFO: renamed from: k4 */
    public float mo6762k4(C3181c5 c3181c5, char c, float f, float f2, float f3, C12015qq c12015qq) {
        C12004dy c12004dyM16507k4 = this.f35243kk.m16507k4(m24359k4());
        C12025x6 c12025x6 = new C12025x6(f, f2 - m24359k4().m23111c5());
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55552k4(C14117yj.m67537ne(c), c12004dyM16507k4, m24359k4().m23125x1(), m24359k4().m23114dy(), c12025x6.Clone(), C12019um.m56799c5());
        if (C14116yg.m67480k4(f3) > 0.0f) {
            C11913yj c11913yj = new C11913yj();
            c11913yj.m55766k4(f3, new C12025x6(f, f2));
            c11896dy.m55577x1(c11913yj);
        }
        C12018u4 c12018u4 = this.f35244x1;
        if (c12018u4 == null) {
            C3181c5 c3181c52 = c3181c5.f9457k4;
            if (C7019kk.m27469x1(c3181c52, C10230kk.class)) {
                C7125kk.m27656k4(this.f35242k4, c11896dy, c3181c52, c12015qq.Clone());
            } else {
                C7125kk.m27656k4(this.f35242k4, c11896dy, c3181c5, c12015qq.Clone());
            }
        } else {
            C7125kk.m27661k4(c12018u4, c11896dy, this.f35242k4, c3181c5, c12015qq.Clone());
        }
        return mo24354k4(c);
    }
}
