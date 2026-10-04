package com.aspose.slides.internal.p532yu;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.fa */
/* JADX INFO: loaded from: classes5.dex */
public final class C12981fa extends AbstractC13255vt {
    /* JADX INFO: renamed from: k4 */
    private static void m60617k4(AbstractC12998ga abstractC12998ga, C13047jd c13047jd, C13047jd c13047jd2, C13047jd[] c13047jdArr) {
        C13047jd c13047jd3 = new C13047jd(c13047jd.m60997k4());
        C13047jd c13047jd4 = new C13047jd(c13047jd2.m60997k4());
        abstractC12998ga.mo60125k4(c13047jd3, c13047jd4, c13047jdArr);
        c13047jd.m61007x1(c13047jd3);
        c13047jd2.m61007x1(c13047jd4);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12998ga
    /* JADX INFO: renamed from: k4 */
    public void mo60125k4(C13047jd c13047jd, C13047jd c13047jd2, C13047jd[] c13047jdArr) {
        C13047jd c13047jd3 = new C13047jd(c13047jd.m60997k4());
        C13047jd c13047jd4 = new C13047jd(c13047jd2.m60997k4());
        C12981fa c12981fa = this;
        while (true) {
            m60617k4(c12981fa.m61640kk(), c13047jd3, c13047jd4, c13047jdArr);
            AbstractC12998ga abstractC12998gaM61641x1 = c12981fa.m61641x1();
            C12981fa c12981fa2 = (C12981fa) C7019kk.m27452k4((Object) abstractC12998gaM61641x1, C12981fa.class);
            if (c12981fa2 == null) {
                abstractC12998gaM61641x1.mo60125k4(c13047jd, c13047jd2, c13047jdArr);
                c13047jd.m61007x1(c13047jd3);
                c13047jd2.m61007x1(c13047jd4);
                return;
            }
            c12981fa = c12981fa2;
        }
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13255vt, com.aspose.slides.internal.p532yu.AbstractC12998ga
    /* JADX INFO: renamed from: k4 */
    public void mo60040k4(AbstractC13255vt abstractC13255vt, C12930cj c12930cj, C12979f7 c12979f7) {
        m61643x1(abstractC13255vt, c12930cj, c12979f7);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12998ga
    /* JADX INFO: renamed from: k4 */
    public boolean mo60126k4() {
        C12981fa c12981fa = this;
        while (!c12981fa.m61640kk().mo60126k4()) {
            AbstractC12998ga abstractC12998gaM61641x1 = c12981fa.m61641x1();
            C12981fa c12981fa2 = (C12981fa) C7019kk.m27452k4((Object) abstractC12998gaM61641x1, C12981fa.class);
            if (c12981fa2 == null) {
                return abstractC12998gaM61641x1.mo60126k4();
            }
            c12981fa = c12981fa2;
        }
        return true;
    }
}
