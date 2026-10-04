package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
class t1m extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private final C13847mr f49007k4;

    /* JADX INFO: renamed from: x1 */
    private C12025x6 f49010x1 = new C12025x6();

    /* JADX INFO: renamed from: kk */
    private C12025x6 f49008kk = new C12025x6();

    /* JADX INFO: renamed from: to */
    private C12025x6 f49009to = new C12025x6();

    /* JADX INFO: renamed from: du */
    private C12025x6 f49006du = new C12025x6();

    public t1m(C13847mr c13847mr) {
        this.f49007k4 = c13847mr;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: T_ */
    public boolean mo3221T_() {
        return this.f49007k4.m64945h4().hasSeriesLines();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70917k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64) {
        c12025x6.CloneTo(this.f49010x1);
        c12025x62.CloneTo(this.f49008kk);
        c12025x63.CloneTo(this.f49009to);
        c12025x64.CloneTo(this.f49006du);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        float fM73227xk = m73227xk();
        float fM73206c6 = m73206c6();
        C14873z5.m74322k4(this.f49010x1.Clone(), fM73227xk, fM73206c6).CloneTo(this.f49010x1);
        C14873z5.m74322k4(this.f49009to.Clone(), fM73227xk, fM73206c6).CloneTo(this.f49009to);
        C14873z5.m74322k4(this.f49008kk.Clone(), fM73227xk, fM73206c6).CloneTo(this.f49008kk);
        C14873z5.m74322k4(this.f49006du.Clone(), fM73227xk, fM73206c6).CloneTo(this.f49006du);
        this.f49007k4.m64968x1(this.f49010x1.Clone(), this.f49009to.Clone());
        this.f49007k4.m64968x1(this.f49008kk.Clone(), this.f49006du.Clone());
    }
}
