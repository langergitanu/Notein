package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7394ca;

/* JADX INFO: renamed from: com.aspose.slides.zo */
/* JADX INFO: loaded from: classes3.dex */
class C14907zo {
    /* JADX INFO: renamed from: k4 */
    public static void m74710k4(ICommandEffect iCommandEffect, C7394ca.k4 k4Var, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        com.aspose.slides.internal.p332p7.zv9 zv9Var = (com.aspose.slides.internal.p332p7.zv9) k4Var.mo2788k4("cmd").m29542x1();
        no7VarArr[0] = zv9Var.m45969kk();
        ((CommandEffect) iCommandEffect).mo424k4();
        zv9Var.m45967k4(iCommandEffect.getType());
        zv9Var.m45968k4(iCommandEffect.getCommandString());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74711k4(ICommandEffect iCommandEffect, com.aspose.slides.internal.p332p7.zv9 zv9Var, yqd yqdVar) {
        C13717k8 c13717k8Mo424k4 = ((CommandEffect) iCommandEffect).mo424k4();
        iCommandEffect.setCommandString(zv9Var.m45970x1());
        iCommandEffect.setType(zv9Var.m45966k4());
        c13717k8Mo424k4.m63712k4(C13670j2.m63183k4(zv9Var.m45969kk().m37765h4().m36292jd()));
        c13717k8Mo424k4.m63713x1(zv9Var.m45969kk().m37765h4().m36310ne());
        iCommandEffect.setShapeTarget(x9t.m73235k4(yqdVar, zv9Var.m45969kk().m37771m9()));
    }
}
