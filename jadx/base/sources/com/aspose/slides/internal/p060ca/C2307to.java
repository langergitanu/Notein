package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.to */
/* JADX INFO: loaded from: classes3.dex */
class C2307to {

    /* JADX INFO: renamed from: k4 */
    private C2135ix f7975k4;

    /* JADX INFO: renamed from: x1 */
    private C2055du f7976x1;

    public C2307to(C2135ix c2135ix, int i) {
        this.f7976x1 = new C2055du(i);
        this.f7975k4 = c2135ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final short m11447k4() {
        C2055du c2055du;
        short s;
        short s2 = 1;
        do {
            s2 = this.f7975k4.m10795x1() ? this.f7976x1.f7091k4[s2].f7096kk : this.f7976x1.f7091k4[s2].f7098x1;
            c2055du = this.f7976x1;
            s = c2055du.f7091k4[s2].f7097to;
        } while (s < 0);
        c2055du.m10429x1(s2);
        return s;
    }
}
