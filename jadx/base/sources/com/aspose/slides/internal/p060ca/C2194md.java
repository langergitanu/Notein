package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.md */
/* JADX INFO: loaded from: classes3.dex */
public class C2194md extends AbstractC2166kq {

    /* JADX INFO: renamed from: kk */
    private int f7631kk;

    /* JADX INFO: renamed from: x1 */
    private C2330uy f7632x1;

    public C2194md(long j, int i) {
        super(j, i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        long jM11154k4 = c2212n9.m11154k4();
        long j = this.f7845k4;
        if (jM11154k4 != (((j & 4294967295L) + 2) & 4294967295L)) {
            c2212n9.m11159k4(((j & 4294967295L) + 2) & 4294967295L);
        }
        int iM11151fa = c2212n9.m11151fa() & 65535;
        this.f7631kk = c2212n9.m11151fa();
        this.f7632x1 = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & 4294967295L, iM11151fa), c2212n9);
    }
}
