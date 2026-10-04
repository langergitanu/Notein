package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7394ca;

/* JADX INFO: loaded from: classes3.dex */
class g7b {
    /* JADX INFO: renamed from: k4 */
    public static void m6454k4(IPropertyEffect iPropertyEffect, C7394ca.k4 k4Var, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        com.aspose.slides.internal.p332p7.it6 it6Var = (com.aspose.slides.internal.p332p7.it6) k4Var.mo2788k4("anim").m29542x1();
        no7VarArr[0] = it6Var.m34447m9();
        it6Var.m34451x1(iPropertyEffect.getFrom());
        it6Var.m34446kk(iPropertyEffect.getTo());
        it6Var.m34444k4(iPropertyEffect.getBy());
        it6Var.m34450x1((byte) iPropertyEffect.getValueType());
        it6Var.m34443k4((byte) iPropertyEffect.getCalcMode());
        if (iPropertyEffect.getPoints().getCount() != 0) {
            b8y.m4048x1(iPropertyEffect.getPoints(), it6Var.m34442k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6455k4(IPropertyEffect iPropertyEffect, com.aspose.slides.internal.p332p7.it6 it6Var) {
        iPropertyEffect.setFrom(it6Var.m34445kk());
        iPropertyEffect.setTo(it6Var.m34448to());
        iPropertyEffect.setBy(it6Var.m34449x1());
        iPropertyEffect.setValueType(it6Var.m34441h4());
        iPropertyEffect.setCalcMode(it6Var.m34439du());
        b8y.m4047k4(iPropertyEffect.getPoints(), it6Var.m34440dy());
    }
}
