package com.aspose.slides.internal.p174hz;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4711e0 {

    /* JADX INFO: renamed from: k4 */
    private int f13135k4;

    /* JADX INFO: renamed from: kk */
    private int f13136kk;

    /* JADX INFO: renamed from: x1 */
    private int f13137x1;

    public C4711e0(int i, int i2, int i3) {
        this.f13135k4 = i2;
        this.f13137x1 = i;
        this.f13136kk = i3;
    }

    /* JADX INFO: renamed from: k4 */
    public int m19599k4() {
        return this.f13135k4;
    }

    /* JADX INFO: renamed from: kk */
    public int m19601kk() {
        return this.f13136kk;
    }

    /* JADX INFO: renamed from: x1 */
    public int m19602x1() {
        return this.f13137x1;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m19600k4(int i) {
        int iM19602x1 = i - m19602x1();
        boolean z = iM19602x1 >= 0 && i <= m19599k4();
        return m19601kk() == 0 ? z : z && iM19602x1 % m19601kk() == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m19598k4(C4711e0[] c4711e0Arr, int i) {
        for (C4711e0 c4711e0 : c4711e0Arr) {
            if (c4711e0.m19600k4(i)) {
                return true;
            }
        }
        return false;
    }
}
