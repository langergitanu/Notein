package com.aspose.slides.internal.p416tb;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C10908ne {

    /* JADX INFO: renamed from: k4 */
    private final C10898dy f37933k4;

    /* JADX INFO: renamed from: kk */
    private C10901ix f37934kk;

    /* JADX INFO: renamed from: x1 */
    private final C10901ix f37935x1;

    public C10908ne(C10898dy c10898dy) {
        this.f37933k4 = c10898dy;
        C10901ix c10901ix = new C10901ix(c10898dy, "Root", -1, null);
        this.f37935x1 = c10901ix;
        this.f37934kk = c10901ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52505k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this.f37935x1);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/Outlines");
        C10901ix c10901ix = this.f37935x1.f37898dy;
        if (c10901ix != null) {
            c10922yj.m52666kk("/First", c10901ix.m52565c5());
        }
        C10901ix c10901ix2 = this.f37935x1.f37896c5;
        if (c10901ix2 != null) {
            c10922yj.m52666kk("/Last", c10901ix2.m52565c5());
        }
        c10922yj.m52640c5();
        c10922yj.m52678x1();
        for (C10901ix c10901ix3 = this.f37935x1.f37898dy; c10901ix3 != null; c10901ix3 = c10901ix3.f37902m9) {
            c10901ix3.mo9082k4(c10922yj);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final String m52508x1() {
        return this.f37935x1.m52565c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52506k4(String str, int i, C10895c5 c10895c5) {
        C10901ix c10901ix;
        C10901ix c10901ix2 = new C10901ix(this.f37933k4, str, i, c10895c5);
        int i2 = c10901ix2.f37901kk;
        C10901ix c10901ix3 = this.f37934kk;
        int i3 = c10901ix3.f37901kk;
        if (i2 > i3) {
            c10901ix3.m52475k4(c10901ix2);
        } else {
            if (i2 < i3) {
                while (true) {
                    c10901ix = this.f37934kk;
                    if (c10901ix.f37901kk < c10901ix2.f37901kk) {
                        break;
                    } else {
                        this.f37934kk = c10901ix.f37897du;
                    }
                }
            } else {
                c10901ix = c10901ix3.f37897du;
            }
            c10901ix.m52475k4(c10901ix2);
        }
        this.f37934kk = c10901ix2;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m52507k4() {
        return this.f37935x1.f37898dy == null;
    }
}
