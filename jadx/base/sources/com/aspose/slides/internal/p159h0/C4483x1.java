package com.aspose.slides.internal.p159h0;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.x1 */
/* JADX INFO: loaded from: classes.dex */
class C4483x1 {

    /* JADX INFO: renamed from: du */
    private final long f12329du;

    /* JADX INFO: renamed from: kk */
    private int f12331kk;

    /* JADX INFO: renamed from: to */
    private C4469to f12332to;

    /* JADX INFO: renamed from: k4 */
    private C4459os f12330k4 = new C4459os();

    /* JADX INFO: renamed from: x1 */
    private C4459os f12333x1 = new C4459os();

    public C4483x1(long j, C4459os c4459os, C4459os c4459os2, int i) {
        this.f12329du = j;
        m18446k4(c4459os.Clone());
        m18453x1(c4459os2.Clone());
        m18445k4(i);
    }

    /* JADX INFO: renamed from: du */
    public final float m18440du() {
        return C4459os.m18282x1(m18449kk(), m18452x1()).m18288kk();
    }

    /* JADX INFO: renamed from: dy */
    public final C4469to m18441dy() {
        return this.f12332to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C4459os m18442h4() {
        return C4459os.m18282x1(m18449kk(), m18452x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final long m18443k4() {
        return this.f12329du;
    }

    /* JADX INFO: renamed from: kk */
    public final C4459os m18449kk() {
        return this.f12333x1.Clone();
    }

    /* JADX INFO: renamed from: m9 */
    public final C4459os m18450m9() {
        return C4459os.m18282x1(m18449kk(), m18452x1()).m18289to();
    }

    /* JADX INFO: renamed from: to */
    public final int m18451to() {
        return this.f12331kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4459os m18452x1() {
        return this.f12330k4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final C4459os m18444k4(float f) {
        return C4459os.m18279k4(m18452x1(), C4459os.m18278k4(m18442h4(), f));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18453x1(C4459os c4459os) {
        this.f12333x1 = c4459os.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18445k4(int i) {
        this.f12331kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18446k4(C4459os c4459os) {
        this.f12330k4 = c4459os.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18447k4(C4469to c4469to) {
        C4469to c4469to2 = this.f12332to;
        if (c4469to2 != null) {
            c4469to2.m18344x1(this);
        }
        this.f12332to = c4469to;
        if (c4469to != null) {
            c4469to.m18335k4(this);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m18448k4(C4483x1 c4483x1, C4459os[] c4459osArr) {
        return C4479w6.m18417k4(m18452x1().Clone(), m18449kk().Clone(), c4483x1.m18452x1().Clone(), c4483x1.m18449kk().Clone(), c4459osArr);
    }
}
