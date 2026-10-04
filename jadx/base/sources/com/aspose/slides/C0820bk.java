package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7503dp;

/* JADX INFO: renamed from: com.aspose.slides.bk */
/* JADX INFO: loaded from: classes3.dex */
class C0820bk {
    /* JADX INFO: renamed from: k4 */
    public static void m4239k4(IFontScheme iFontScheme, C7503dp c7503dp) {
        if (c7503dp == null) {
            return;
        }
        C14617u6.m71490k4(iFontScheme.getMajor(), c7503dp.m30489x1());
        C14617u6.m71490k4(iFontScheme.getMinor(), c7503dp.m30487kk());
        ((FontScheme) iFontScheme).m1509k4().m63210k4(c7503dp.m30488to());
        iFontScheme.setName(c7503dp.m30484k4());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m4240x1(IFontScheme iFontScheme, C7503dp c7503dp) {
        C14617u6.m71493x1(iFontScheme.getMajor(), c7503dp.m30489x1());
        C14617u6.m71493x1(iFontScheme.getMinor(), c7503dp.m30487kk());
        c7503dp.m30485k4(((FontScheme) iFontScheme).m1509k4().m63209k4());
        c7503dp.m30486k4(iFontScheme.getName());
    }
}
