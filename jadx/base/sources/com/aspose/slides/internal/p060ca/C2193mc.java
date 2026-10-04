package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.mc */
/* JADX INFO: loaded from: classes3.dex */
class C2193mc {

    /* JADX INFO: renamed from: dy */
    private int f7624dy;

    /* JADX INFO: renamed from: h4 */
    private int f7625h4;

    /* JADX INFO: renamed from: to */
    private int f7629to;

    /* JADX INFO: renamed from: x1 */
    private int f7630x1;

    /* JADX INFO: renamed from: du */
    private String[] f7623du = new String[10];

    /* JADX INFO: renamed from: k4 */
    private double[] f7626k4 = new double[100];

    /* JADX INFO: renamed from: kk */
    private int[] f7627kk = new int[100];

    /* JADX INFO: renamed from: m9 */
    private int[] f7628m9 = new int[100];

    public C2193mc() {
        m11124x1();
    }

    /* JADX INFO: renamed from: m9 */
    private void m11115m9() {
        int i = this.f7630x1 + 1;
        double[] dArr = this.f7626k4;
        if (i >= dArr.length) {
            double[] dArr2 = new double[dArr.length * 2];
            System.arraycopy(dArr, 0, dArr2, 0, dArr.length);
            this.f7626k4 = dArr2;
            m11116x1(dArr2.length);
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m11117du() {
        this.f7624dy--;
        int[] iArr = this.f7627kk;
        int i = this.f7629to;
        this.f7629to = i - 1;
        return iArr[i];
    }

    /* JADX INFO: renamed from: h4 */
    public final double m11118h4() {
        this.f7624dy--;
        double[] dArr = this.f7626k4;
        int i = this.f7630x1;
        this.f7630x1 = i - 1;
        return dArr[i];
    }

    /* JADX INFO: renamed from: k4 */
    public final double m11119k4(int i) {
        int iM11122kk = m11122kk();
        if (iM11122kk == 1) {
            return this.f7627kk[this.f7629to - i];
        }
        if (iM11122kk == 2) {
            return this.f7626k4[this.f7630x1 - i];
        }
        throw new C2023c0("Unexpected PS object type in PS program.");
    }

    /* JADX INFO: renamed from: kk */
    public final int m11122kk() {
        return this.f7628m9[this.f7624dy];
    }

    /* JADX INFO: renamed from: to */
    public final double m11123to() {
        int iM11122kk = m11122kk();
        if (iM11122kk == 1) {
            return m11117du();
        }
        if (iM11122kk == 2) {
            return m11118h4();
        }
        throw new C2023c0("Unexpected PS object type in PS program.");
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11124x1() {
        this.f7630x1 = -1;
        this.f7629to = -1;
        this.f7625h4 = -1;
        this.f7624dy = -1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m11116x1(int i) {
        int[] iArr = this.f7628m9;
        if (i > iArr.length) {
            int[] iArr2 = new int[i];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f7628m9 = iArr2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11120k4() {
        return this.f7624dy + 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11121k4(double d) {
        m11115m9();
        int i = this.f7624dy + 1;
        this.f7624dy = i;
        int i2 = this.f7630x1 + 1;
        this.f7630x1 = i2;
        this.f7626k4[i2] = d;
        this.f7628m9[i] = 2;
    }
}
