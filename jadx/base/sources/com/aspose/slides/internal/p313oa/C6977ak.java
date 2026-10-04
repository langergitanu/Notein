package com.aspose.slides.internal.p313oa;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.ak */
/* JADX INFO: loaded from: classes4.dex */
class C6977ak {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC7008wy m27297k4(int i, AbstractC7002u4 abstractC7002u4) {
        if (i == 0) {
            return new C6984dq();
        }
        if (i == 1 || i == 2) {
            return new C6982c6(abstractC7002u4);
        }
        if (i == 6) {
            return new C7011xk();
        }
        throw new NotSupportedException(C14113y2.m67402k4("Not supported transformation type: {0}", C7019kk.m27466x1(i)));
    }
}
