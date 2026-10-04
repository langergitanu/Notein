package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7394ca;

/* JADX INFO: loaded from: classes3.dex */
class drp {
    /* JADX INFO: renamed from: k4 */
    public static void m5224k4(ISetEffect iSetEffect, C7394ca.k4 k4Var, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        com.aspose.slides.internal.p332p7.oeg oegVar = (com.aspose.slides.internal.p332p7.oeg) k4Var.mo2788k4("set").m29542x1();
        no7VarArr[0] = oegVar.m38216x1();
        if (iSetEffect.getTo() != null) {
            oegVar.m38214k4();
            rzi.m70396k4(iSetEffect.getTo(), oegVar.m38215kk());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5225k4(ISetEffect iSetEffect, com.aspose.slides.internal.p332p7.oeg oegVar) {
        if (oegVar.m38215kk() != null) {
            iSetEffect.setTo(rzi.m70395k4(oegVar.m38215kk()));
        }
    }
}
