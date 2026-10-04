package com.aspose.slides.internal.p159h0;

import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.ri */
/* JADX INFO: loaded from: classes.dex */
public final class C4463ri {

    /* JADX INFO: renamed from: du */
    private C4487yd f12259du;

    /* JADX INFO: renamed from: dy */
    private C4488yj f12260dy;

    /* JADX INFO: renamed from: h4 */
    private C4463ri[] f12261h4;

    /* JADX INFO: renamed from: k4 */
    private double f12262k4;

    /* JADX INFO: renamed from: kk */
    private C4466ss f12263kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f12264m9;

    /* JADX INFO: renamed from: to */
    private C12025x6 f12265to;

    /* JADX INFO: renamed from: x1 */
    private double f12266x1;

    public C4463ri(double d, double d2) {
        this.f12265to = new C12025x6();
        this.f12259du = new C4487yd();
        this.f12262k4 = d;
        this.f12266x1 = d2;
        this.f12259du = new C4487yd(d, d2);
        this.f12265to = new C12025x6((float) d, (float) d2);
        this.f12263kk = new C4466ss();
        this.f12261h4 = null;
        this.f12264m9 = false;
        this.f12260dy = new C4488yj();
    }

    /* JADX INFO: renamed from: du */
    public final C4488yj m18301du() {
        return this.f12260dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final C4463ri[] m18302h4() {
        return this.f12261h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m18303k4() {
        return this.f12262k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4487yd m18307kk() {
        return this.f12259du;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m18308m9() {
        return this.f12264m9;
    }

    /* JADX INFO: renamed from: to */
    public final C4466ss m18309to() {
        return this.f12263kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m18310x1() {
        return this.f12266x1;
    }

    public C4463ri(C4463ri c4463ri) {
        this(c4463ri.m18303k4(), c4463ri.m18310x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18304k4(boolean z) {
        this.f12264m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18305k4(C4463ri[] c4463riArr) {
        this.f12261h4 = c4463riArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m18306k4(C4463ri c4463ri) {
        return C4464rv.m18313k4(m18303k4() - c4463ri.m18303k4(), 9.999999747378752E-6d) && C4464rv.m18313k4(m18310x1() - c4463ri.m18310x1(), 9.999999747378752E-6d);
    }
}
