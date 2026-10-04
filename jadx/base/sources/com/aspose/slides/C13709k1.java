package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.k1 */
/* JADX INFO: loaded from: classes3.dex */
class C13709k1 extends cdv {

    /* JADX INFO: renamed from: k4 */
    private final C0886d8 f45597k4;

    public C13709k1(C0886d8 c0886d8, double d) {
        super(d, c0886d8.m4989k4());
        this.f45597k4 = c0886d8;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: U_ */
    public void mo5524U_() {
        if (mo3221T_()) {
            this.f45597k4.m5010to(m73209e0().Clone().Clone());
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C12007ix c12007ixClone = m73209e0().Clone();
        if (this.f45597k4.m5002kk(c12007ixClone.Clone())) {
            return;
        }
        this.f45597k4.m5017x1(c12007ixClone.Clone());
        this.f45597k4.m4996k4(c12007ixClone.Clone());
    }
}
