package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: loaded from: classes3.dex */
class jdz {
    /* JADX INFO: renamed from: k4 */
    public static void m63286k4(ISlideSize iSlideSize, AbstractC4685kk<com.aspose.slides.internal.p332p7.kaf> abstractC4685kk) {
        if (iSlideSize == null) {
            return;
        }
        com.aspose.slides.internal.p332p7.kaf kafVarInvoke = abstractC4685kk.invoke();
        SlideSize slideSize = (SlideSize) iSlideSize;
        kafVarInvoke.m35242k4(slideSize.m2755k4().m56699x1());
        kafVarInvoke.m35246x1(slideSize.m2755k4().m56697kk());
        if (iSlideSize.getType() != 16) {
            kafVarInvoke.m35243k4(iSlideSize.getType());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63287k4(ISlideSize iSlideSize, com.aspose.slides.internal.p332p7.kaf kafVar) {
        if (kafVar == null) {
            return;
        }
        iSlideSize.setSize((float) kafVar.m35241k4(), (float) kafVar.m35245x1(), 0);
        if (C14044b3.m66437kk(kafVar.m35241k4()) || C14044b3.m66437kk(kafVar.m35245x1()) || ((SlideSize) iSlideSize).m2756k4(kafVar.m35244kk())) {
            iSlideSize.setSize(kafVar.m35244kk(), 0);
        }
    }
}
