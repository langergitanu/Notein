package com.aspose.slides.internal.p351q5;

import com.aspose.slides.internal.p081de.C3155to;
import com.aspose.slides.internal.p148gb.C4251h4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p248lf.AbstractC6030h4;
import com.aspose.slides.internal.p248lf.AbstractC6032kk;
import com.aspose.slides.internal.p248lf.AbstractC6033m9;
import com.aspose.slides.internal.p248lf.C6029du;
import com.aspose.slides.internal.p248lf.C6035x1;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q5.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9753kk extends AbstractC6030h4 {

    /* JADX INFO: renamed from: c5 */
    private final C12018u4 f35240c5;

    /* JADX INFO: renamed from: dy */
    private final C3155to f35241dy;

    public C9753kk(C3155to c3155to, C12018u4 c12018u4) {
        super(c3155to.m13494to(), c3155to.m13485du(), c3155to.m13487h4(), c3155to.m13495x1());
        this.f35241dy = c3155to;
        this.f35240c5 = c12018u4;
    }

    @Override // com.aspose.slides.internal.p248lf.AbstractC6030h4
    /* JADX INFO: renamed from: k4 */
    public AbstractC6032kk mo24344k4(C6029du c6029du, C6035x1 c6035x1) {
        return new C9752k4(this.f35241dy, c6035x1, c6029du, this.f35240c5);
    }

    @Override // com.aspose.slides.internal.p248lf.AbstractC6030h4
    /* JADX INFO: renamed from: k4 */
    public AbstractC6033m9 mo24345k4(C6029du c6029du, C5659x1 c5659x1) {
        C5659x1 c5659x12;
        if (c6029du.f17088jd) {
            c6029du.f17083du /= 1.3f;
            c6029du.f17084dy = C14113y2.m67358c5(c6029du.f17084dy);
            c5659x12 = new C5659x1(c6029du.f17083du, c5659x1.m23125x1(), c5659x1.m23120k4());
        } else {
            c5659x12 = c5659x1;
        }
        C3155to c3155to = this.f35241dy;
        return new C9754x1(c3155to, c5659x12, c3155to.m13486dy(), c6029du, this.f35240c5);
    }

    @Override // com.aspose.slides.internal.p248lf.AbstractC6030h4
    /* JADX INFO: renamed from: k4 */
    public void mo24350k4(C4251h4 c4251h4, C12015qq c12015qq) {
        this.f35241dy.m13492kk(c4251h4, c12015qq.Clone(), this.f35240c5);
    }
}
