package com.aspose.slides.internal.p474wg;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.gk */
/* JADX INFO: loaded from: classes5.dex */
class C11939gk extends AbstractC11979vh {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C11971tq f40242k4;

    /* JADX INFO: renamed from: kk */
    final /* synthetic */ byte[] f40243kk;

    /* JADX INFO: renamed from: to */
    final /* synthetic */ C11953m2 f40244to;

    /* JADX INFO: renamed from: x1 */
    final /* synthetic */ int f40245x1;

    public C11939gk(C11953m2 c11953m2, C11971tq c11971tq, int i, byte[] bArr) {
        this.f40244to = c11953m2;
        this.f40242k4 = c11971tq;
        this.f40245x1 = i;
        this.f40243kk = bArr;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11979vh
    /* JADX INFO: renamed from: k4 */
    public void mo55973k4(C11971tq c11971tq) {
        if (c11971tq.m56120dy()) {
            this.f40242k4.m56123k4(c11971tq.m56125m9(), c11971tq.m56118c5());
            return;
        }
        if (this.f40244to.f40289du.f40156kk.f40250k4 != 0 && this.f40244to.f40289du.f40156kk.f40250k4 != 100) {
            this.f40242k4.m56122k4(c11971tq.m56125m9());
            return;
        }
        if (!this.f40244to.f40304um) {
            this.f40244to.f40304um = true;
            C11917ai.m55839k4((Object) this.f40244to.f40289du);
        }
        if (this.f40245x1 != 0) {
            this.f40244to.f40289du.m55862x1(this.f40244to.f40292h4, this.f40243kk, 0, this.f40245x1, new C11987x5(this), null);
        } else {
            this.f40244to.f40307v4 = true;
            this.f40242k4.m56122k4(c11971tq.m56125m9());
        }
    }
}
