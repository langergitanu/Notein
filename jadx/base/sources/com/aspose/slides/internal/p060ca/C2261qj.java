package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentException;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.qj */
/* JADX INFO: loaded from: classes3.dex */
public class C2261qj extends AbstractC2282s0 {

    /* JADX INFO: renamed from: c5 */
    private C2076ex f7768c5;

    /* JADX INFO: renamed from: ck */
    private C2076ex f7769ck;

    /* JADX INFO: renamed from: du */
    private int f7770du;

    /* JADX INFO: renamed from: dy */
    private int f7771dy;

    /* JADX INFO: renamed from: fa */
    private C2076ex f7772fa;

    /* JADX INFO: renamed from: h4 */
    private int f7773h4;

    /* JADX INFO: renamed from: jd */
    private C2076ex f7774jd;

    /* JADX INFO: renamed from: kk */
    private long f7775kk;

    /* JADX INFO: renamed from: m9 */
    private int f7776m9;

    /* JADX INFO: renamed from: to */
    private boolean f7777to;

    /* JADX INFO: renamed from: x1 */
    private int f7778x1;

    public C2261qj(int i, long j, long j2, boolean z) {
        super(j);
        this.f7768c5 = null;
        this.f7774jd = null;
        this.f7769ck = null;
        this.f7772fa = null;
        if ((65535 & i) == 0) {
            throw new ArgumentException("ValueFormat passed for ValueRecord table must not be 0");
        }
        this.f7778x1 = i;
        this.f7775kk = j2;
        this.f7777to = z;
    }

    /* JADX INFO: renamed from: c5 */
    public final C2076ex m11283c5() {
        return this.f7772fa;
    }

    /* JADX INFO: renamed from: du */
    public final int m11284du() {
        return this.f7771dy;
    }

    /* JADX INFO: renamed from: dy */
    public final C2076ex m11285dy() {
        return this.f7769ck;
    }

    /* JADX INFO: renamed from: h4 */
    public final C2076ex m11286h4() {
        return this.f7768c5;
    }

    /* JADX INFO: renamed from: jd */
    public final int m11287jd() {
        return this.f7778x1;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        long jM11154k4 = c2212n9.m11154k4();
        long j = this.f7845k4;
        if (jM11154k4 != (j & 4294967295L)) {
            c2212n9.m11159k4(j & 4294967295L);
        }
        if ((this.f7778x1 & 1) != 0) {
            this.f7770du = c2212n9.m11151fa();
        }
        if ((this.f7778x1 & 2) != 0) {
            this.f7773h4 = c2212n9.m11151fa();
        }
        if ((this.f7778x1 & 4) != 0) {
            this.f7776m9 = c2212n9.m11151fa();
        }
        if ((this.f7778x1 & 8) != 0) {
            this.f7771dy = c2212n9.m11151fa();
        }
        int iM11151fa = (this.f7778x1 & 16) != 0 ? c2212n9.m11151fa() & 65535 : 0;
        int iM11151fa2 = (this.f7778x1 & 32) != 0 ? c2212n9.m11151fa() & 65535 : 0;
        int iM11151fa3 = (this.f7778x1 & 64) != 0 ? c2212n9.m11151fa() & 65535 : 0;
        int iM11151fa4 = (this.f7778x1 & 128) != 0 ? c2212n9.m11151fa() & 65535 : 0;
        long jM11154k42 = this.f7777to ? c2212n9.m11154k4() : 0L;
        if (iM11151fa != 0) {
            this.f7768c5 = (C2076ex) AbstractC2282s0.m11353k4(new C2076ex(this.f7775kk + ((long) iM11151fa)), c2212n9);
        }
        if (iM11151fa2 != 0) {
            this.f7774jd = (C2076ex) AbstractC2282s0.m11353k4(new C2076ex(this.f7775kk + ((long) iM11151fa2)), c2212n9);
        }
        if (iM11151fa3 != 0) {
            this.f7769ck = (C2076ex) AbstractC2282s0.m11353k4(new C2076ex(this.f7775kk + ((long) iM11151fa3)), c2212n9);
        }
        if (iM11151fa4 != 0) {
            this.f7772fa = (C2076ex) AbstractC2282s0.m11353k4(new C2076ex(this.f7775kk + ((long) iM11151fa4)), c2212n9);
        }
        if (jM11154k42 != 0) {
            c2212n9.m11159k4(jM11154k42);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final int m11288kk() {
        return this.f7773h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C2076ex m11289m9() {
        return this.f7774jd;
    }

    /* JADX INFO: renamed from: to */
    public final int m11290to() {
        return this.f7776m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11291x1() {
        return this.f7770du;
    }
}
