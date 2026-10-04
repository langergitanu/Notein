package com.aspose.slides.internal.p339pk;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C9450dy implements InterfaceC9461x1 {

    /* JADX INFO: renamed from: k4 */
    private C9453jd[] f34358k4;

    /* JADX INFO: renamed from: x1 */
    private int f34359x1;

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: k4 */
    public final int mo46244k4() {
        return 10;
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: x1 */
    public final int mo46249x1() {
        return this.f34359x1;
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: k4 */
    public final void mo46246k4(int i) {
        this.f34359x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46270k4(C9456ks c9456ks) {
        this.f34359x1 = c9456ks.m13386x6();
        c9456ks.m13381rv();
        int iM13381rv = c9456ks.m13381rv();
        this.f34358k4 = new C9453jd[iM13381rv];
        for (int i = 0; i < iM13381rv; i++) {
            this.f34358k4[i] = new C9453jd(c9456ks.m13386x6());
        }
    }
}
