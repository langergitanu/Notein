package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.zg */
/* JADX INFO: loaded from: classes3.dex */
public class C2408zg extends AbstractC2166kq {

    /* JADX INFO: renamed from: kk */
    private int f8352kk;

    /* JADX INFO: renamed from: to */
    private C2261qj f8353to;

    /* JADX INFO: renamed from: x1 */
    private C2330uy f8354x1;

    public C2408zg(long j, int i) {
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
        int iM11151fa2 = c2212n9.m11151fa();
        this.f8352kk = iM11151fa2;
        this.f8353to = (65535 & iM11151fa2) == 0 ? null : (C2261qj) AbstractC2282s0.m11353k4(new C2261qj(iM11151fa2, c2212n9.m11154k4(), this.f7845k4 & 4294967295L, false), c2212n9);
        this.f8354x1 = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & 4294967295L, iM11151fa), c2212n9);
    }

    /* JADX INFO: renamed from: kk */
    public final C2261qj m11823kk() {
        return this.f8353to;
    }

    /* JADX INFO: renamed from: to */
    public final int m11824to() {
        return this.f8352kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2330uy m11825x1() {
        return this.f8354x1;
    }
}
