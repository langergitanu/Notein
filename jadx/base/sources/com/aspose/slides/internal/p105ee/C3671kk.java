package com.aspose.slides.internal.p105ee;

import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ee.kk */
/* JADX INFO: loaded from: classes3.dex */
class C3671kk {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f10186k4;

    static {
        int[] iArrM14873k4 = C3673to.m14873k4();
        int[] iArrM14864k4 = C3669h4.m14864k4();
        int[] iArr = new int[iArrM14873k4.length + iArrM14864k4.length];
        AbstractC14092to.m67208k4((Object) iArrM14873k4).copyTo(AbstractC14092to.m67208k4((Object) iArr), 0);
        AbstractC14092to.m67208k4((Object) iArrM14864k4).copyTo(AbstractC14092to.m67208k4((Object) iArr), iArrM14873k4.length);
        f10186k4 = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m14872k4() {
        return f10186k4;
    }
}
