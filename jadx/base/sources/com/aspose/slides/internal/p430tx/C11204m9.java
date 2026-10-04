package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.m9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11204m9 {

    /* JADX INFO: renamed from: k4 */
    private String f38607k4;

    /* JADX INFO: renamed from: x1 */
    private C11190he[] f38608x1;

    private C11204m9(ArrayList arrayList) {
        this.f38608x1 = new C11190he[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f38608x1[i] = (C11190he) arrayList.get_Item(i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C11204m9 m53858k4(C11212rv c11212rv, String str) {
        boolean[] zArr = {false};
        return zArr[0] ? new C11204m9(str) : new C11204m9(c11212rv.m53930k4(str, zArr));
    }

    private C11204m9(String str) {
        this.f38607k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m53859k4(C11234xw c11234xw, C11231x1 c11231x1) {
        if (m53860k4()) {
            return this.f38607k4;
        }
        C6765kp c6765kpM54161c5 = c11234xw.m54161c5();
        int i = 0;
        while (true) {
            C11190he[] c11190heArr = this.f38608x1;
            if (i >= c11190heArr.length) {
                c11234xw.m54169jd();
                return c6765kpM54161c5.toString();
            }
            c6765kpM54161c5.m26792k4(c11190heArr[i].mo53707x1(c11234xw, c11231x1));
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53860k4() {
        return this.f38608x1 == null;
    }
}
