package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.m5 */
/* JADX INFO: loaded from: classes3.dex */
public class C2188m5 extends AbstractC2166kq {

    /* JADX INFO: renamed from: kk */
    private List<Integer> f7610kk;

    /* JADX INFO: renamed from: x1 */
    private C2330uy f7611x1;

    public C2188m5(long j, int i) {
        super(j, i);
        this.f7610kk = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public String m11105du() {
        return "Single substitution Format2";
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
        this.f7610kk = AbstractC2282s0.m11354x1(c2212n9);
        this.f7611x1 = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & 4294967295L, iM11151fa), c2212n9);
    }

    /* JADX INFO: renamed from: kk */
    public final int m11106kk() {
        return this.f7610kk.size();
    }

    /* JADX INFO: renamed from: to */
    public final Integer[] m11107to() {
        return this.f7610kk.toArray(new Integer[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final C2330uy m11108x1() {
        return this.f7611x1;
    }
}
