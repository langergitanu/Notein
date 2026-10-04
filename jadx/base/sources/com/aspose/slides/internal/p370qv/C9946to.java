package com.aspose.slides.internal.p370qv;

import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.qv.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9946to extends AbstractC9947x1 {

    /* JADX INFO: renamed from: c5 */
    public double f35839c5;

    /* JADX INFO: renamed from: ck */
    public double f35840ck;

    /* JADX INFO: renamed from: du */
    public C12003du f35841du;

    /* JADX INFO: renamed from: dy */
    public C9468x1 f35842dy;

    /* JADX INFO: renamed from: fa */
    public C9468x1 f35843fa;

    /* JADX INFO: renamed from: h4 */
    public C9468x1 f35844h4;

    /* JADX INFO: renamed from: jd */
    public double f35845jd;

    /* JADX INFO: renamed from: k4 */
    public C12025x6 f35846k4;

    /* JADX INFO: renamed from: kk */
    public C12025x6 f35847kk;

    /* JADX INFO: renamed from: m9 */
    public C9468x1 f35848m9;

    /* JADX INFO: renamed from: to */
    public C12003du f35849to;

    /* JADX INFO: renamed from: up */
    public C9468x1 f35850up;

    /* JADX INFO: renamed from: x1 */
    public C12025x6 f35851x1;

    /* JADX INFO: renamed from: yj */
    public C9468x1 f35852yj;

    public C9946to(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12003du c12003du, C12003du c12003du2) {
        this.f35846k4 = c12025x6;
        this.f35851x1 = c12025x62;
        this.f35847kk = c12025x63;
        this.f35849to = c12003du;
        this.f35841du = c12003du2;
        this.f35844h4 = new C9468x1(c12025x6, C9467to.m46535x1(c12025x62, c12025x63));
        this.f35848m9 = new C9468x1(this.f35851x1, C9467to.m46535x1(this.f35846k4, this.f35847kk));
        this.f35842dy = new C9468x1(this.f35847kk, C9467to.m46535x1(this.f35846k4, this.f35851x1));
        this.f35839c5 = C9467to.m46521k4(this.f35846k4, C9467to.m46535x1(this.f35851x1, this.f35847kk));
        this.f35845jd = C9467to.m46521k4(this.f35851x1, C9467to.m46535x1(this.f35846k4, this.f35847kk));
        this.f35840ck = C9467to.m46521k4(this.f35847kk, C9467to.m46535x1(this.f35846k4, this.f35851x1));
        this.f35843fa = new C9468x1(this.f35846k4, this.f35851x1);
        this.f35850up = new C9468x1(this.f35846k4, this.f35847kk);
        this.f35852yj = new C9468x1(this.f35851x1, this.f35847kk);
    }

    @Override // com.aspose.slides.internal.p370qv.AbstractC9947x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo48883k4(double d, double d2) {
        return AbstractC9947x1.m48891k4(this.f35846k4, this.f35851x1, this.f35847kk, d, d2);
    }

    @Override // com.aspose.slides.internal.p370qv.AbstractC9947x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo48885x1(double d, double d2) {
        if (d == this.f35851x1.m56897x1() && d2 == this.f35851x1.m56895kk()) {
            return false;
        }
        if (d == this.f35847kk.m56897x1() && d2 == this.f35847kk.m56895kk()) {
            return false;
        }
        return m48889k4(d, d2, this.f35852yj) || m48889k4(d, d2, this.f35843fa) || m48889k4(d, d2, this.f35850up);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m48889k4(double d, double d2, C9468x1 c9468x1) {
        return !c9468x1.m46542k4() && !c9468x1.m46543x1() && m48890x1(d, d2, c9468x1) && ((double) c9468x1.m46538k4((float) d, (float) d2)) < c9468x1.f34469dy;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m48890x1(double d, double d2, C9468x1 c9468x1) {
        return d >= ((double) c9468x1.f34474to) && d <= ((double) c9468x1.f34468du) && d2 >= ((double) c9468x1.f34470h4) && d2 <= ((double) c9468x1.f34473m9);
    }
}
