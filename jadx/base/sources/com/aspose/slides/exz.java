package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;

/* JADX INFO: loaded from: classes3.dex */
class exz {
    /* JADX INFO: renamed from: k4 */
    private static void m5771k4(IPlaceholder iPlaceholder, com.aspose.slides.internal.p332p7.vy9 vy9Var) {
        ((Placeholder) iPlaceholder).m2272kk().m64970k4(vy9Var.m43351h4());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m5774x1(IPlaceholder iPlaceholder, com.aspose.slides.internal.p332p7.vy9 vy9Var) {
        mrd mrdVarM2272kk = ((Placeholder) iPlaceholder).m2272kk();
        vy9Var.m43356k4(mrdVarM2272kk.m64972k4());
        vy9Var.m43355k4(mrdVarM2272kk.m64973x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5772k4(IShape iShape, AbstractC4685kk<com.aspose.slides.internal.p332p7.vy9> abstractC4685kk) {
        if (iShape.isTextHolder()) {
            com.aspose.slides.internal.p332p7.vy9 vy9VarInvoke = abstractC4685kk.invoke();
            vy9VarInvoke.m43354k4(iShape.getPlaceholder().getIndex());
            vy9VarInvoke.m43361x1(iShape.getPlaceholder().getOrientation());
            vy9VarInvoke.m43358kk(iShape.getPlaceholder().getSize());
            vy9VarInvoke.m43353k4(iShape.getPlaceholder().getType());
            m5774x1(iShape.getPlaceholder(), vy9VarInvoke);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5773k4(IShape iShape, com.aspose.slides.internal.p332p7.vy9 vy9Var, bjs bjsVar) {
        if (vy9Var == null) {
            return;
        }
        byte[] bArrM6793rv = bjsVar.m4229k4().m6793rv();
        ((Shape) iShape).m2554k4(vy9Var.m43360x1(), vy9Var.m43357kk(), vy9Var.m43352k4(), vy9Var.m43359to(), vy9Var.m43350du());
        if (bArrM6793rv.length == 0 || bArrM6793rv.length < 11) {
            return;
        }
        if ((bArrM6793rv[bArrM6793rv.length - 1] & 255) == 32 || (bArrM6793rv[10] & 255) == 3) {
            bjsVar.m4232k4(vy9Var.m43359to(), iShape.getPlaceholder());
            m5771k4(iShape.getPlaceholder(), vy9Var);
        }
    }
}
