package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.yl */
/* JADX INFO: loaded from: classes3.dex */
class C14851yl {

    /* JADX INFO: renamed from: k4 */
    private C14365qy f50367k4;

    /* JADX INFO: renamed from: kk */
    private C14250os f50368kk;

    /* JADX INFO: renamed from: x1 */
    private C12007ix f50369x1 = new C12007ix();

    public C14851yl() {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73923k4() {
        if (this.f50368kk == null) {
            this.f50367k4.m69870wy().mo64342k4(this.f50369x1.Clone());
            return;
        }
        this.f50368kk.m68790jd().m52930k4(((C14250os) C7019kk.m27452k4((Object) this.f50367k4.m69870wy(), C14250os.class)).m68790jd());
        this.f50367k4.m69843k4(this.f50368kk);
    }

    public C14851yl(C14365qy c14365qy) {
        this.f50367k4 = c14365qy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73924k4(C12007ix c12007ix) {
        C12007ix c12007ix2 = new C12007ix(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
        if (C7019kk.m27469x1(this.f50367k4.m69870wy(), C14250os.class)) {
            C14250os c14250os = (C14250os) this.f50367k4.m69870wy();
            this.f50368kk = c14250os;
            this.f50367k4.m69843k4(c14250os.m68799up());
            this.f50367k4.m69870wy().m74623ks().m17332k4(c12007ix2.Clone()).CloneTo(c12007ix2);
        }
        this.f50367k4.m69870wy().mo64335fa().CloneTo(this.f50369x1);
        this.f50367k4.m69870wy().mo64342k4(c12007ix2.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73925k4(AbstractC14897zn[] abstractC14897znArr) {
        if (this.f50368kk == null) {
            abstractC14897znArr[0].mo64342k4(this.f50369x1.Clone());
            return;
        }
        this.f50368kk.m68790jd().m52930k4(((C14250os) C7019kk.m27452k4((Object) abstractC14897znArr[0], C14250os.class)).m68790jd());
        abstractC14897znArr[0] = this.f50368kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73926k4(AbstractC14897zn[] abstractC14897znArr, C12007ix c12007ix) {
        if (C7019kk.m27469x1(abstractC14897znArr[0], C14250os.class)) {
            C14250os c14250os = (C14250os) abstractC14897znArr[0];
            this.f50368kk = c14250os;
            abstractC14897znArr[0] = c14250os.m68799up();
        }
        abstractC14897znArr[0].mo64335fa().CloneTo(this.f50369x1);
        abstractC14897znArr[0].mo64342k4(c12007ix.Clone());
    }
}
