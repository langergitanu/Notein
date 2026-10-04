package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7394ca;

/* JADX INFO: loaded from: classes3.dex */
class etq {
    /* JADX INFO: renamed from: k4 */
    public static void m5693k4(IRotationEffect iRotationEffect, C7394ca.k4 k4Var, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        com.aspose.slides.internal.p332p7.u4g u4gVar = (com.aspose.slides.internal.p332p7.u4g) k4Var.mo2788k4("animRot").m29542x1();
        no7VarArr[0] = u4gVar.m42101to();
        u4gVar.m42103x1(iRotationEffect.getFrom());
        u4gVar.m42100kk(iRotationEffect.getTo());
        u4gVar.m42098k4(iRotationEffect.getBy());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5694k4(IRotationEffect iRotationEffect, com.aspose.slides.internal.p332p7.u4g u4gVar) {
        iRotationEffect.setFrom(u4gVar.m42102x1());
        iRotationEffect.setTo(u4gVar.m42099kk());
        iRotationEffect.setBy(u4gVar.m42097k4());
    }
}
