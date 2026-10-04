package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.vv */
/* JADX INFO: loaded from: classes3.dex */
class C14712vv {
    /* JADX INFO: renamed from: k4 */
    private static void m72553k4(C10950bv c10950bv, List<C12025x6> list, int i) {
        int i2 = i & 7;
        if (i2 == 1) {
            c10950bv.m52901x1(list.toArray(new C12025x6[0]));
        } else {
            if (i2 != 3) {
                return;
            }
            c10950bv.m52897kk(list.toArray(new C12025x6[0]));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72554k4(C10971um[] c10971umArr, C12025x6[] c12025x6Arr, int[] iArr, boolean z) {
        C10950bv c10950bv = new C10950bv();
        c10971umArr[0].m52930k4(c10950bv);
        if (z) {
            c10950bv.m52895k4(z);
            C12025x6[] c12025x6Arr2 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), iArr.length + 1));
            int[] iArr2 = new int[iArr.length + 1];
            AbstractC14092to.m67208k4((Object) c12025x6Arr).copyTo(AbstractC14092to.m67208k4((Object) c12025x6Arr2), 0);
            c12025x6Arr[0].CloneTo(c12025x6Arr2[iArr.length]);
            AbstractC14092to.m67208k4((Object) iArr).copyTo(AbstractC14092to.m67208k4((Object) iArr2), 0);
            iArr2[iArr.length] = iArr[iArr.length - 1];
            int length = iArr.length - 1;
            iArr[length] = iArr[length] & 7;
        }
        List list = null;
        int i = 0;
        for (int i2 = 0; i2 < c12025x6Arr.length; i2++) {
            if (iArr[i2] == 0) {
                list = new List();
            }
            if (i != 0 && i != iArr[i2]) {
                m72553k4(c10950bv, list, i);
                list = new List();
                if (i2 > 0) {
                    list.addItem(c12025x6Arr[i2 - 1].Clone());
                }
            }
            if (list != null) {
                list.addItem(c12025x6Arr[i2].Clone());
            }
            i = iArr[i2];
            if (i2 == c12025x6Arr.length - 1 && list != null) {
                m72553k4(c10950bv, list, i);
            }
        }
    }
}
