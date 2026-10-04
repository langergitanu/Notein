package com.aspose.slides.internal.p313oa;

import com.aspose.slides.exceptions.ArgumentException;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.yj */
/* JADX INFO: loaded from: classes4.dex */
class C7013yj {

    /* JADX INFO: renamed from: k4 */
    private float[] f19071k4;

    public C7013yj(float[] fArr) {
        if (fArr.length != 12 && fArr.length != 9) {
            throw new ArgumentException("Matrix can have 12 or 9 elements only");
        }
        this.f19071k4 = fArr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m27425k4(float[] fArr) {
        float fM27309kk = C6979b3.m27309kk(fArr[0]);
        float fM27309kk2 = C6979b3.m27309kk(fArr[1]);
        float fM27309kk3 = C6979b3.m27309kk(fArr[2]);
        float[] fArr2 = this.f19071k4;
        float f = (fArr2[2] * fM27309kk3) + (fArr2[1] * fM27309kk2) + (fArr2[0] * fM27309kk);
        float f2 = (fArr2[5] * fM27309kk3) + (fArr2[4] * fM27309kk2) + (fArr2[3] * fM27309kk);
        float f3 = (fArr2[8] * fM27309kk3) + (fArr2[7] * fM27309kk2) + (fArr2[6] * fM27309kk);
        if (fArr2.length == 12) {
            f += fArr2[9];
            f2 += fArr2[10];
            f3 += fArr2[11];
        }
        fArr[0] = C6979b3.m27309kk(f);
        fArr[1] = C6979b3.m27309kk(f2);
        fArr[2] = C6979b3.m27309kk(f3);
    }
}
