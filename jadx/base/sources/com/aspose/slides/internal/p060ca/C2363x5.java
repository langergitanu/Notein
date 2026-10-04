package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p080dd.C3152yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.x5 */
/* JADX INFO: loaded from: classes3.dex */
class C2363x5 {
    /* JADX INFO: renamed from: k4 */
    public final byte[] m11666k4(C2274ri c2274ri, C2234os c2234os) {
        C2070em c2070em = new C2070em(c2234os.m11211to());
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < c2234os.m11210kk(); i3++) {
            int[] iArr = {i};
            int[] iArr2 = {i2};
            c2234os.m11206k4(i3, iArr, iArr2);
            i = iArr[0];
            i2 = iArr2[0];
            C2370xk c2370xk = new C2370xk();
            C2053dq c2053dq = new C2053dq(c2370xk, new C2300t6(), true);
            c2053dq.m10394k4(c2274ri);
            c2370xk.m10366k4(c2053dq);
            c2370xk.mo10372x1(new C2317u4(c2234os.m11202h4(), i, i2));
            c2053dq.mo10383c6().seek(0L, 0);
            c2053dq.mo10383c6().close();
            c2070em.m10493k4(c2053dq.mo10383c6().toArray());
        }
        C3152yj c3152yj = new C3152yj();
        try {
            new C1998ai(new C2098gi(c3152yj)).m10151k4(c2070em.m10492k4(), 0L);
            c3152yj.close();
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }
}
