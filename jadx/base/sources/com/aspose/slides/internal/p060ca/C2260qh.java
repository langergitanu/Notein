package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.qh */
/* JADX INFO: loaded from: classes3.dex */
public class C2260qh extends AbstractC2166kq {

    /* JADX INFO: renamed from: kk */
    private C2083fb f7765kk;

    /* JADX INFO: renamed from: to */
    private List<C2376xu<C2365x7>> f7766to;

    /* JADX INFO: renamed from: x1 */
    private C2330uy f7767x1;

    public C2260qh(long j, int i) {
        super(j, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2376xu<C2365x7> m11279k4(int i) {
        return this.f7766to.get_Item(i);
    }

    /* JADX INFO: renamed from: kk */
    public final C2083fb m11280kk() {
        return this.f7765kk;
    }

    /* JADX INFO: renamed from: to */
    public String m11281to() {
        return "Context substitution Format2";
    }

    /* JADX INFO: renamed from: x1 */
    public final C2330uy m11282x1() {
        return this.f7767x1;
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
        int iM11151fa2 = 65535 & c2212n9.m11151fa();
        this.f7766to = C2376xu.m11698k4(C2365x7.class, this.f7845k4 & 4294967295L, c2212n9, true);
        this.f7767x1 = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & 4294967295L, iM11151fa), c2212n9);
        this.f7765kk = (C2083fb) AbstractC2282s0.m11353k4(new C2083fb(this.f7845k4 & 4294967295L, iM11151fa2), c2212n9);
    }
}
