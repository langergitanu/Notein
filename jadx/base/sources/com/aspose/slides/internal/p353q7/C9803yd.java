package com.aspose.slides.internal.p353q7;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12570to;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C9803yd extends AbstractC9768f9 {

    /* JADX INFO: renamed from: c5 */
    public int f35534c5;

    /* JADX INFO: renamed from: ck */
    public int f35535ck;

    /* JADX INFO: renamed from: du */
    public int f35536du;

    /* JADX INFO: renamed from: dy */
    public int f35537dy;

    /* JADX INFO: renamed from: fa */
    public int f35538fa;

    /* JADX INFO: renamed from: h4 */
    public int f35539h4;

    /* JADX INFO: renamed from: jd */
    public int f35540jd;

    /* JADX INFO: renamed from: k4 */
    public long f35541k4;

    /* JADX INFO: renamed from: kk */
    public int f35542kk;

    /* JADX INFO: renamed from: ks */
    public int f35543ks;

    /* JADX INFO: renamed from: m9 */
    public int f35544m9;

    /* JADX INFO: renamed from: to */
    public int f35545to;

    /* JADX INFO: renamed from: up */
    public int f35546up;

    /* JADX INFO: renamed from: x1 */
    public int f35547x1;

    /* JADX INFO: renamed from: yj */
    public int f35548yj;

    public C9803yd(C12564kk c12564kk) {
        this.f35541k4 = c12564kk.m58604kk();
        this.f35547x1 = c12564kk.m58600du();
        long j = this.f35541k4;
        if ((j & 4294967295L) == 20480) {
            return;
        }
        if ((j & 4294967295L) != 65536) {
            throw new NotSupportedException("Unsupported maximum profile version.");
        }
        this.f35542kk = c12564kk.m58600du();
        this.f35545to = c12564kk.m58600du();
        this.f35536du = c12564kk.m58600du();
        this.f35539h4 = c12564kk.m58600du();
        this.f35544m9 = c12564kk.m58600du();
        this.f35537dy = c12564kk.m58600du();
        this.f35534c5 = c12564kk.m58600du();
        this.f35540jd = c12564kk.m58600du();
        this.f35535ck = c12564kk.m58600du();
        this.f35538fa = c12564kk.m58600du();
        this.f35546up = c12564kk.m58600du();
        this.f35548yj = c12564kk.m58600du();
        this.f35543ks = c12564kk.m58600du();
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9768f9
    /* JADX INFO: renamed from: k4 */
    public void mo48051k4(C12570to c12570to) {
        c12570to.m58669k4(this.f35541k4);
        c12570to.m58671x1(this.f35547x1 & 65535);
        if ((this.f35541k4 & 4294967295L) == 20480) {
            return;
        }
        c12570to.m58671x1(this.f35542kk & 65535);
        c12570to.m58671x1(this.f35545to & 65535);
        c12570to.m58671x1(this.f35536du & 65535);
        c12570to.m58671x1(this.f35539h4 & 65535);
        c12570to.m58671x1(this.f35544m9 & 65535);
        c12570to.m58671x1(this.f35537dy & 65535);
        c12570to.m58671x1(this.f35534c5 & 65535);
        c12570to.m58671x1(this.f35540jd & 65535);
        c12570to.m58671x1(this.f35535ck & 65535);
        c12570to.m58671x1(this.f35538fa & 65535);
        c12570to.m58671x1(this.f35546up & 65535);
        c12570to.m58671x1(this.f35548yj & 65535);
        c12570to.m58671x1(this.f35543ks & 65535);
    }
}
