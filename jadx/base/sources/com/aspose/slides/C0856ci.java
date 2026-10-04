package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.ci */
/* JADX INFO: loaded from: classes3.dex */
class C0856ci {
    /* JADX INFO: renamed from: k4 */
    private static float m4590k4(float f, float f2, float f3, C14347qi c14347qi, C1119fs c1119fs) {
        return zfk.m74512k4(f + c14347qi.f48325k4, f2 - c14347qi.f48326x1, c1119fs.f5120k4 + f3);
    }

    /* JADX INFO: renamed from: x1 */
    private static float m4593x1(float f, float f2, float f3, C14347qi c14347qi, C1119fs c1119fs) {
        return zfk.m74512k4(f - c14347qi.f48325k4, f2 + c14347qi.f48326x1, c1119fs.f5120k4 + f3);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14347qi m4591k4(wsf wsfVar, wsf wsfVar2, float f, C1119fs c1119fs) {
        C14347qi c14347qi = new C14347qi();
        c14347qi.f48325k4 = C14116yg.m67481k4(c1119fs.f5120k4 + f + c1119fs.f5123x1 + wsfVar.f49850x1, c1119fs.f5122to);
        c14347qi.f48326x1 = C14116yg.m67481k4(((f + c1119fs.f5121kk) + wsfVar2.f49849k4) - c1119fs.f5120k4, c1119fs.f5119du);
        return c14347qi;
    }

    /* JADX INFO: renamed from: k4 */
    public static wsf m4592k4(wsf wsfVar, wsf wsfVar2, float f, C1119fs c1119fs, C14347qi c14347qi) {
        wsf wsfVar3 = new wsf();
        wsfVar3.f49849k4 = m4590k4(wsfVar.f49849k4, wsfVar2.f49849k4, f, c14347qi.Clone(), c1119fs.Clone());
        wsfVar3.f49850x1 = m4593x1(wsfVar.f49850x1, wsfVar2.f49850x1, f, c14347qi.Clone(), c1119fs.Clone());
        return wsfVar3;
    }
}
