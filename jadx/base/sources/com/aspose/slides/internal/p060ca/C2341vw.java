package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.vw */
/* JADX INFO: loaded from: classes3.dex */
class C2341vw implements InterfaceC2403z9 {

    /* JADX INFO: renamed from: k4 */
    private C2069ek[] f8119k4;

    /* JADX INFO: renamed from: x1 */
    private C2069ek[] f8120x1;

    public C2341vw(double[][] dArr, double[][] dArr2) {
        this.f8119k4 = new C2069ek[dArr.length];
        this.f8120x1 = new C2069ek[dArr2.length];
        for (int i = 0; i < dArr.length; i++) {
            this.f8119k4[i] = new C2069ek();
            int i2 = 0;
            while (true) {
                double[] dArr3 = dArr[i];
                if (i2 < dArr3.length) {
                    this.f8119k4[i].m10490k4(new C2332v0(dArr3[i2], dArr3[i2 + 1]));
                    i2 += 2;
                }
            }
        }
        for (int i3 = 0; i3 < dArr2.length; i3++) {
            this.f8120x1[i3] = new C2069ek();
            int i4 = 0;
            while (true) {
                double[] dArr4 = dArr2[i3];
                if (i4 < dArr4.length) {
                    this.f8120x1[i3].m10490k4(new C2413zo(dArr4[i4], dArr4[i4 + 1]));
                    i4 += 2;
                }
            }
        }
    }
}
