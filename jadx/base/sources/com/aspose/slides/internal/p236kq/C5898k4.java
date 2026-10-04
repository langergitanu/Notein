package com.aspose.slides.internal.p236kq;

/* JADX INFO: renamed from: com.aspose.slides.internal.kq.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5898k4 {

    /* JADX INFO: renamed from: k4 */
    private final int[] f16687k4;

    public C5898k4(int i, int i2, int i3) {
        this.f16687k4 = new int[i2 + 1];
        int i4 = 0;
        while (i4 < i2) {
            int[] iArr = this.f16687k4;
            int i5 = i4 + 1;
            iArr[i5] = iArr[i4] + i3;
            i4 = i5;
        }
        this.f16687k4[r5.length - 1] = i;
    }

    /* JADX INFO: renamed from: k4 */
    public int m23751k4() {
        return this.f16687k4.length;
    }

    /* JADX INFO: renamed from: x1 */
    public int m23753x1(int i) {
        int length = this.f16687k4.length;
        int i2 = 0;
        while (length - i2 > 1) {
            int i3 = (length + i2) >> 1;
            int i4 = this.f16687k4[i3];
            if (i == i4) {
                return i3;
            }
            if (i < i4) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public int m23752k4(int i) {
        return this.f16687k4[i];
    }
}
