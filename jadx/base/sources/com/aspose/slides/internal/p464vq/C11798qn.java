package com.aspose.slides.internal.p464vq;

import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.qn */
/* JADX INFO: loaded from: classes4.dex */
class C11798qn {

    /* JADX INFO: renamed from: k4 */
    private C11838vt[] f39833k4 = new C11838vt[0];

    /* JADX INFO: renamed from: k4 */
    public final int m55380k4(C11839vw c11839vw) {
        String strM13400h4 = C3141rv.m13400h4(c11839vw.m55427x1());
        int i = 0;
        while (true) {
            C11838vt[] c11838vtArr = this.f39833k4;
            if (i >= c11838vtArr.length) {
                int length = c11838vtArr.length;
                C11838vt[] c11838vtArr2 = new C11838vt[length + 1];
                System.arraycopy(c11838vtArr, 0, c11838vtArr2, 0, c11838vtArr.length);
                c11838vtArr2[length] = new C11838vt(strM13400h4, c11839vw.m55427x1());
                this.f39833k4 = c11838vtArr2;
                return c11838vtArr2.length - 1;
            }
            if (C14113y2.m67363du(c11838vtArr[i].m55428k4(), strM13400h4)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C11838vt m55381k4(int i) {
        return this.f39833k4[i];
    }
}
