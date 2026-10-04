package com.aspose.slides.internal.p348q1;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7186k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.q1.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9610kk {

    /* JADX INFO: renamed from: du */
    private int f34759du;

    /* JADX INFO: renamed from: h4 */
    private C7186k4 f34760h4;

    /* JADX INFO: renamed from: k4 */
    private float[] f34761k4;

    /* JADX INFO: renamed from: kk */
    private int[] f34762kk;

    /* JADX INFO: renamed from: m9 */
    private int[][] f34763m9;

    /* JADX INFO: renamed from: to */
    private int f34764to;

    /* JADX INFO: renamed from: x1 */
    private int[] f34765x1;

    public C9610kk(float[] fArr, int[] iArr, int[] iArr2, int i, C7186k4 c7186k4, int[][] iArr3) {
        this.f34761k4 = fArr;
        this.f34765x1 = iArr;
        this.f34762kk = iArr2;
        this.f34764to = fArr.length;
        this.f34759du = i;
        this.f34760h4 = c7186k4;
        this.f34763m9 = iArr3;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m46936k4(float f, float f2, float f3, float f4, float f5) {
        return (((f5 - f4) * (f - f2)) / (f3 - f2)) + f4;
    }

    /* JADX INFO: renamed from: k4 */
    private int m46934k4(int[] iArr) {
        float[] fArrM27788x1 = this.f34760h4.m27788x1();
        int length = iArr.length;
        int iM27462to = 1;
        for (int i = length - 2; i >= 0; i--) {
            iM27462to *= C7019kk.m27462to(Float.valueOf(fArrM27788x1[i]), 13);
        }
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3--) {
            i2 += iArr[i3] * iM27462to;
            int i4 = i3 - 1;
            if (i4 >= 0) {
                iM27462to /= C7019kk.m27462to(Float.valueOf(fArrM27788x1[i4]), 13);
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m46937k4() {
        return m46935k4(new int[this.f34764to], 0);
    }

    /* JADX INFO: renamed from: k4 */
    private float[] m46935k4(int[] iArr, int i) {
        float[] fArr = new float[this.f34759du];
        int i2 = 0;
        if (i == this.f34761k4.length - 1) {
            int i3 = this.f34765x1[i];
            if (i3 == this.f34762kk[i]) {
                iArr[i] = i3;
                int[] iArr2 = this.f34763m9[m46934k4(iArr)];
                while (i2 < this.f34759du) {
                    fArr[i2] = iArr2[i2];
                    i2++;
                }
            } else {
                iArr[i] = i3;
                int[] iArr3 = this.f34763m9[m46934k4(iArr)];
                iArr[i] = this.f34762kk[i];
                int[] iArr4 = this.f34763m9[m46934k4(iArr)];
                while (i2 < this.f34759du) {
                    fArr[i2] = m46936k4(this.f34761k4[i], this.f34765x1[i], this.f34762kk[i], iArr3[i2], iArr4[i2]);
                    i2++;
                }
            }
        } else {
            C9610kk c9610kk = this;
            int i4 = c9610kk.f34765x1[i];
            if (i4 == c9610kk.f34762kk[i]) {
                iArr[i] = i4;
                return m46935k4(iArr, i + 1);
            }
            iArr[i] = i4;
            int i5 = i + 1;
            float[] fArrM46935k4 = m46935k4(iArr, i5);
            iArr[i] = c9610kk.f34762kk[i];
            float[] fArrM46935k42 = m46935k4(iArr, i5);
            while (i2 < c9610kk.f34759du) {
                fArr[i2] = c9610kk.m46936k4(c9610kk.f34761k4[i], c9610kk.f34765x1[i], c9610kk.f34762kk[i], fArrM46935k4[i2], fArrM46935k42[i2]);
                i2++;
                c9610kk = this;
            }
        }
        return fArr;
    }
}
