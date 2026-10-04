package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentException;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.aa */
/* JADX INFO: loaded from: classes3.dex */
class C1995aa extends C2056dv {

    /* JADX INFO: renamed from: k4 */
    public int f6955k4;

    /* JADX INFO: renamed from: kk */
    private short[] f6956kk;

    /* JADX INFO: renamed from: x1 */
    private int[] f6957x1;

    public C1995aa(int i, byte[] bArr) {
        super("hmtx", bArr);
        if (i <= 0) {
            throw new ArgumentException("Number of metrics in 'htmx' table must be more than zero");
        }
        C2364x6 c2364x6 = new C2364x6(bArr);
        this.f6955k4 = i;
        this.f6957x1 = new int[i];
        this.f6956kk = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f6957x1[i2] = c2364x6.m11669h4();
            this.f6956kk[i2] = c2364x6.m11673m9();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m10133k4(int i) {
        int i2 = this.f6955k4;
        return i < i2 ? this.f6957x1[i] : this.f6957x1[i2 - 1];
    }

    /* JADX INFO: renamed from: x1 */
    public final short m10134x1(int i) {
        int i2 = this.f6955k4;
        return i < i2 ? this.f6956kk[i] : this.f6956kk[i2 - 1];
    }
}
