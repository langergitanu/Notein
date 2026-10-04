package com.aspose.slides;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class sk2 {
    /* JADX INFO: renamed from: k4 */
    public static Double m70655k4(String str, InterfaceC0933ea interfaceC0933ea) {
        if (C14113y2.m67363du(str, C14113y2.f47374k4)) {
            return null;
        }
        double[] dArr = {0.0d};
        boolean zM66435k4 = C14044b3.m66435k4(str, 167, C11697x1.m55250kk(), dArr);
        double d = dArr[0];
        if (zM66435k4) {
            return new Double(d);
        }
        dArr[0] = d;
        boolean zM66435k42 = C14044b3.m66435k4(str, 111, C11697x1.m55250kk(), dArr);
        double d2 = dArr[0];
        if (zM66435k42) {
            return new Double(d2);
        }
        C14077m4 c14077m4 = new C14077m4();
        C14077m4[] c14077m4Arr = {c14077m4};
        boolean zM66803k4 = C14077m4.m66803k4(str, c14077m4Arr);
        c14077m4Arr[0].CloneTo(c14077m4);
        if (zM66803k4) {
            return new Double(c14077m4.m66816h4());
        }
        C14084qq c14084qq = new C14084qq();
        int iMo4951k4 = interfaceC0933ea.mo5387x1().mo4951k4();
        C14084qq[] c14084qqArr = {c14084qq};
        boolean zM67099k4 = C14084qq.m67099k4(str, C11697x1.m55250kk(), 0, c14084qqArr);
        c14084qqArr[0].CloneTo(c14084qq);
        if (zM67099k4) {
            return t5p.m70970k4(c14084qq.Clone(), iMo4951k4);
        }
        return null;
    }
}
