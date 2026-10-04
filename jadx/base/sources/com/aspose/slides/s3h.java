package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class s3h {
    /* JADX INFO: renamed from: k4 */
    public static void m70438k4(IScaleEffect iScaleEffect, C7394ca.k4 k4Var, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        com.aspose.slides.internal.p332p7.s0t s0tVar = (com.aspose.slides.internal.p332p7.s0t) k4Var.mo2788k4("animScale").m29542x1();
        no7VarArr[0] = s0tVar.m40701du();
        ScaleEffect scaleEffect = (ScaleEffect) iScaleEffect;
        if (!C14064he.m66715kk(scaleEffect.m2515x1().m56897x1()) && !C14064he.m66715kk(scaleEffect.m2515x1().m56895kk())) {
            C13670j2.m63200k4(s0tVar.m40709x1(), scaleEffect.m2515x1().Clone());
        }
        if (!C14064he.m66715kk(scaleEffect.m2512kk().m56897x1()) && !C14064he.m66715kk(scaleEffect.m2512kk().m56895kk())) {
            C13670j2.m63200k4(s0tVar.m40706kk(), scaleEffect.m2512kk().Clone());
        }
        if (!C14064he.m66715kk(scaleEffect.m2514to().m56897x1()) && !C14064he.m66715kk(scaleEffect.m2514to().m56895kk())) {
            C13670j2.m63200k4(s0tVar.m40704k4(), scaleEffect.m2514to().Clone());
        }
        s0tVar.m40705k4(iScaleEffect.getZoomContent());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70439k4(IScaleEffect iScaleEffect, com.aspose.slides.internal.p332p7.s0t s0tVar) {
        if (s0tVar.m40707m9() != null) {
            ((ScaleEffect) iScaleEffect).m2511k4(new C12025x6(s0tVar.m40707m9().m42312k4(), s0tVar.m40707m9().m42314x1()));
        }
        if (s0tVar.m40702dy() != null) {
            ((ScaleEffect) iScaleEffect).m2516x1(new C12025x6(s0tVar.m40702dy().m42312k4(), s0tVar.m40702dy().m42314x1()));
        }
        if (s0tVar.m40703h4() != null) {
            ((ScaleEffect) iScaleEffect).m2513kk(new C12025x6(s0tVar.m40703h4().m42312k4(), s0tVar.m40703h4().m42314x1()));
        }
        iScaleEffect.setZoomContent(s0tVar.m40708to());
    }
}
