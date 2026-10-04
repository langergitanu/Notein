package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;

/* JADX INFO: renamed from: com.aspose.slides.eb */
/* JADX INFO: loaded from: classes3.dex */
class C0934eb {

    /* JADX INFO: renamed from: du */
    private C12013m9 f4726du;

    /* JADX INFO: renamed from: k4 */
    private String f4728k4;

    /* JADX INFO: renamed from: kk */
    private int f4729kk;

    /* JADX INFO: renamed from: to */
    private int f4730to;

    /* JADX INFO: renamed from: x1 */
    private C12007ix f4731x1 = new C12007ix();

    /* JADX INFO: renamed from: h4 */
    private C12003du f4727h4 = new C12003du();

    public C0934eb(String str, C12007ix c12007ix, int i, int i2, C12013m9 c12013m9, C12003du c12003du) {
        m5392k4(str);
        m5390k4(c12007ix.Clone());
        m5388k4(i);
        m5393x1(i2);
        m5391k4(c12013m9);
        m5389k4(c12003du.Clone());
    }

    /* JADX INFO: renamed from: du */
    public final C12013m9 m5394du() {
        return this.f4726du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m5395h4() {
        return this.f4727h4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m5396k4() {
        return this.f4728k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m5397kk() {
        return this.f4729kk;
    }

    /* JADX INFO: renamed from: to */
    public final int m5398to() {
        return this.f4730to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12007ix m5399x1() {
        return this.f4731x1.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m5388k4(int i) {
        this.f4729kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m5393x1(int i) {
        this.f4730to = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m5389k4(C12003du c12003du) {
        this.f4727h4 = c12003du.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m5390k4(C12007ix c12007ix) {
        this.f4731x1 = c12007ix.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m5391k4(C12013m9 c12013m9) {
        this.f4726du = c12013m9;
    }

    /* JADX INFO: renamed from: k4 */
    private void m5392k4(String str) {
        this.f4728k4 = str;
    }
}
