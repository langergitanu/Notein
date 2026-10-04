package com.aspose.slides.internal.p302nm;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.nm.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6926m9 {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<C14047bz, C3982jd> f18902k4 = new Dictionary<>();

    static {
        for (C3982jd c3982jd : C3982jd.m15697k4()) {
            f18902k4.set_Item(c3982jd.m15698du().Clone(), c3982jd);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C3982jd m27185k4(C3977ck c3977ck) {
        C3982jd[] c3982jdArr = {null};
        f18902k4.tryGetValue(c3977ck.m15685k4().Clone(), c3982jdArr);
        return c3982jdArr[0];
    }
}
