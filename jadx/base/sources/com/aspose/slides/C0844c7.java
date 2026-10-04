package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: renamed from: com.aspose.slides.c7 */
/* JADX INFO: loaded from: classes3.dex */
class C0844c7 {
    /* JADX INFO: renamed from: k4 */
    public static void m4498k4(ICommonSlideViewProperties iCommonSlideViewProperties, com.aspose.slides.internal.p332p7.wzx wzxVar) {
        iCommonSlideViewProperties.setScale(C7019kk.m27462to(Long.valueOf(wzxVar.m44155x1().m42382k4().m37132k4()), 11));
        iCommonSlideViewProperties.setVariableScale(wzxVar.m44153k4());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m4499x1(ICommonSlideViewProperties iCommonSlideViewProperties, com.aspose.slides.internal.p332p7.wzx wzxVar) {
        wzxVar.m44155x1().m42382k4().m37133k4(iCommonSlideViewProperties.getScale());
        wzxVar.m44155x1().m42383x1().m37133k4(iCommonSlideViewProperties.getScale());
        wzxVar.m44155x1().m42382k4().m37134x1(100L);
        wzxVar.m44155x1().m42383x1().m37134x1(100L);
        wzxVar.m44152k4(iCommonSlideViewProperties.getVariableScale());
        if (C14044b3.m66437kk(wzxVar.m44154kk().m45889k4()) || C14044b3.m66437kk(wzxVar.m44154kk().m45891x1())) {
            wzxVar.m44154kk().m45890k4(0.0d);
            wzxVar.m44154kk().m45892x1(0.0d);
        }
    }
}
