package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C8491p4;

/* JADX INFO: loaded from: classes3.dex */
class k7a {
    /* JADX INFO: renamed from: k4 */
    public static void m63710k4(IShapeBevel iShapeBevel, AbstractC4685kk<C8491p4> abstractC4685kk) {
        if (iShapeBevel.getBevelType() == -1) {
            return;
        }
        C8491p4 c8491p4Invoke = abstractC4685kk.invoke();
        c8491p4Invoke.m38613k4(iShapeBevel.getWidth());
        c8491p4Invoke.m38617x1(iShapeBevel.getHeight());
        c8491p4Invoke.m38614k4(iShapeBevel.getBevelType());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63711k4(IShapeBevel iShapeBevel, C8491p4 c8491p4) {
        if (c8491p4 == null) {
            return;
        }
        iShapeBevel.setWidth(c8491p4.m38612k4());
        iShapeBevel.setHeight(c8491p4.m38616x1());
        iShapeBevel.setBevelType(c8491p4.m38615kk());
    }
}
