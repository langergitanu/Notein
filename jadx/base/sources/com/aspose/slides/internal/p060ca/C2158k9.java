package com.aspose.slides.internal.p060ca;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.k9 */
/* JADX INFO: loaded from: classes3.dex */
public class C2158k9 extends AbstractC2166kq {

    /* JADX INFO: renamed from: du */
    private C2134iv f7479du;

    /* JADX INFO: renamed from: h4 */
    private int f7480h4;

    /* JADX INFO: renamed from: kk */
    private C2330uy f7481kk;

    /* JADX INFO: renamed from: to */
    private C2021by f7482to;

    /* JADX INFO: renamed from: x1 */
    private C2330uy f7483x1;

    public C2158k9(long j, int i) {
        super(j, i);
    }

    /* JADX INFO: renamed from: du */
    public final C2134iv m10921du() {
        return this.f7479du;
    }

    /* JADX INFO: renamed from: h4 */
    public String m10922h4() {
        return "Lookup mark to base";
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        long jM11154k4 = c2212n9.m11154k4();
        long j = this.f7845k4;
        if (jM11154k4 != (((j & 4294967295L) + 2) & 4294967295L)) {
            c2212n9.m11159k4(((j & 4294967295L) + 2) & 4294967295L);
        }
        int iM11151fa = c2212n9.m11151fa();
        int iM11151fa2 = c2212n9.m11151fa();
        this.f7480h4 = c2212n9.m11151fa() & 65535;
        int iM11151fa3 = c2212n9.m11151fa() & 65535;
        int iM11151fa4 = c2212n9.m11151fa() & 65535;
        this.f7483x1 = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & 4294967295L, iM11151fa & 65535), c2212n9);
        this.f7481kk = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & 4294967295L, iM11151fa2 & 65535), c2212n9);
        C2021by c2021by = (C2021by) AbstractC2282s0.m11353k4(new C2021by(((this.f7845k4 & 4294967295L) + ((long) iM11151fa3)) & 4294967295L), c2212n9);
        this.f7482to = c2021by;
        if (c2021by.m10284x1() != this.f7483x1.m11549du()) {
            throw new C2243pd(C14113y2.m67402k4("Length in glyphs for MarkCoverage={0}and MarkArray={1} differs but must be the same for {2}", Integer.valueOf(this.f7483x1.m11549du()), Integer.valueOf(this.f7482to.m10284x1()), m10922h4()));
        }
        this.f7479du = (C2134iv) AbstractC2282s0.m11353k4(new C2134iv(((this.f7845k4 & 4294967295L) + ((long) iM11151fa4)) & 4294967295L, this.f7481kk.m11549du(), this.f7480h4), c2212n9);
    }

    /* JADX INFO: renamed from: kk */
    public final C2330uy m10923kk() {
        return this.f7481kk;
    }

    /* JADX INFO: renamed from: to */
    public final C2021by m10924to() {
        return this.f7482to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2330uy m10925x1() {
        return this.f7483x1;
    }
}
