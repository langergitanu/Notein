package com.aspose.slides.internal.p351q5;

import com.aspose.slides.internal.p081de.C3153k4;
import com.aspose.slides.internal.p081de.C3155to;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p248lf.AbstractC6032kk;
import com.aspose.slides.internal.p248lf.C6029du;
import com.aspose.slides.internal.p248lf.C6035x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p321on.C7125kk;
import com.aspose.slides.internal.p400sk.C10230kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p535yz.C13341h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.q5.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9752k4 extends AbstractC6032kk {

    /* JADX INFO: renamed from: k4 */
    private final C3786fa f35237k4;

    /* JADX INFO: renamed from: kk */
    private final C12018u4 f35238kk;

    /* JADX INFO: renamed from: x1 */
    private final C3155to f35239x1;

    public C9752k4(C3155to c3155to, C6035x1 c6035x1, C6029du c6029du, C12018u4 c12018u4) {
        super(c6035x1, c6029du);
        this.f35237k4 = c3155to.m13485du();
        this.f35239x1 = c3155to;
        this.f35238kk = c12018u4;
    }

    @Override // com.aspose.slides.internal.p248lf.InterfaceC6031k4
    /* JADX INFO: renamed from: k4 */
    public float mo6762k4(C3181c5 c3181c5, char c, float f, float f2, float f3, C12015qq c12015qq) {
        m47973k4(c3181c5, m24358x1(c), f, f2, f3, m24357k4(), c12015qq.Clone());
        return mo24354k4(c);
    }

    /* JADX INFO: renamed from: k4 */
    private void m47973k4(C3181c5 c3181c5, C13341h4 c13341h4, float f, float f2, float f3, float f4, C12015qq c12015qq) {
        float fM15122kk = C3786fa.m15122kk() * f4;
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55764k4(fM15122kk, -fM15122kk, 1);
        c11913yj.m55765k4(f3, 1);
        c11913yj.m55786x1(f, f2, 1);
        C11896dy c11896dyM13468k4 = C3153k4.m13468k4(c13341h4.m62003k4(this.f35237k4, c12015qq.Clone()));
        c11896dyM13468k4.m55577x1(c11913yj);
        C12018u4 c12018u4 = this.f35238kk;
        if (c12018u4 != null) {
            C7125kk.m27661k4(c12018u4, c11896dyM13468k4, this.f35239x1, c3181c5, c12015qq.Clone());
            return;
        }
        C3181c5 c3181c52 = c3181c5.f9457k4;
        if (C7019kk.m27469x1(c3181c52, C10230kk.class)) {
            C7125kk.m27656k4(this.f35239x1, c11896dyM13468k4, c3181c52, c12015qq.Clone());
        } else {
            C7125kk.m27656k4(this.f35239x1, c11896dyM13468k4, c3181c5, c12015qq.Clone());
        }
    }
}
