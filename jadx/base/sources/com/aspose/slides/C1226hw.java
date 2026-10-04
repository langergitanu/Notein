package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14042ak;

/* JADX INFO: renamed from: com.aspose.slides.hw */
/* JADX INFO: loaded from: classes3.dex */
class C1226hw extends AbstractC14611u0<IFillOverlay, C1226hw> {

    /* JADX INFO: renamed from: k4 */
    public static final C1226hw f5573k4 = new C1226hw();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IFillOverlay iFillOverlay) {
        return ((C14042ak.m66409k4(iFillOverlay.getBlend()) - 324743029) * 486187739) + C1105fm.f5063k4.m71465x1(iFillOverlay.getFillFormat());
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IFillOverlay iFillOverlay, IFillOverlay iFillOverlay2) {
        return iFillOverlay.getBlend() == iFillOverlay2.getBlend() && C1105fm.f5063k4.equals(iFillOverlay.getFillFormat(), iFillOverlay2.getFillFormat());
    }
}
