package com.aspose.slides.internal.p060ca;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.og */
/* JADX INFO: loaded from: classes3.dex */
public class C2231og extends AbstractC2282s0 {

    /* JADX INFO: renamed from: du */
    private int f7689du;

    /* JADX INFO: renamed from: h4 */
    private C2076ex f7690h4;

    /* JADX INFO: renamed from: kk */
    private short f7691kk;

    /* JADX INFO: renamed from: m9 */
    private C2076ex f7692m9;

    /* JADX INFO: renamed from: to */
    private short f7693to;

    /* JADX INFO: renamed from: x1 */
    private int f7694x1;

    public C2231og(long j) {
        super(j);
        this.f7689du = 0;
    }

    /* JADX INFO: renamed from: du */
    public final C2076ex m11191du() {
        return this.f7690h4;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        int iM11151fa = c2212n9.m11151fa() & 65535;
        this.f7694x1 = iM11151fa;
        if (iM11151fa < 0 || iM11151fa > 3) {
            throw new C2243pd(C14113y2.m67402k4("incorrect format number = {0} for Anchor Table", Integer.valueOf(this.f7694x1)));
        }
        this.f7691kk = c2212n9.m11147c5();
        this.f7693to = c2212n9.m11147c5();
        int i = this.f7694x1;
        if (i == 1) {
            return;
        }
        if (i == 2) {
            this.f7689du = c2212n9.m11151fa();
            return;
        }
        int iM11151fa2 = c2212n9.m11151fa() & 65535;
        int iM11151fa3 = 65535 & c2212n9.m11151fa();
        this.f7690h4 = iM11151fa2 == 0 ? null : (C2076ex) AbstractC2282s0.m11353k4(new C2076ex(((this.f7845k4 & 4294967295L) + ((long) iM11151fa2)) & 4294967295L), c2212n9);
        this.f7692m9 = iM11151fa3 != 0 ? (C2076ex) AbstractC2282s0.m11353k4(new C2076ex(((this.f7845k4 & 4294967295L) + ((long) iM11151fa3)) & 4294967295L), c2212n9) : null;
    }

    /* JADX INFO: renamed from: kk */
    public final short m11192kk() {
        return this.f7691kk;
    }

    /* JADX INFO: renamed from: to */
    public final short m11193to() {
        return this.f7693to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11194x1() {
        return this.f7694x1;
    }
}
