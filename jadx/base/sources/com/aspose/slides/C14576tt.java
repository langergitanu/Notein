package com.aspose.slides;

import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11869ze;

/* JADX INFO: renamed from: com.aspose.slides.tt */
/* JADX INFO: loaded from: classes3.dex */
class C14576tt {
    /* JADX INFO: renamed from: k4 */
    public static void m71303k4(IOverrideThemeManager iOverrideThemeManager, gnb gnbVar) {
        iOverrideThemeManager.getOverrideTheme().clear();
        C11709bg[] c11709bgArrM55309k4 = gnbVar.m55338u4().m55309k4(C11869ze.f39985k4);
        if (c11709bgArrM55309k4.length > 0) {
            new k1j(c11709bgArrM55309k4[0].m55296x1(), gnbVar).m63594k4(iOverrideThemeManager);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71304k4(IOverrideThemeManager iOverrideThemeManager, C11723d3 c11723d3, u8s u8sVar) {
        if (iOverrideThemeManager.isOverrideThemeEnabled()) {
            fbk.m6091k4(iOverrideThemeManager.getOverrideTheme(), u8sVar);
            c11723d3.m55311x1(u8sVar.m71556to().get_Item(iOverrideThemeManager.getOverrideTheme()));
        }
    }
}
