package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.ky */
/* JADX INFO: loaded from: classes3.dex */
class C13752ky extends AbstractC14611u0<IGradientStop, C13752ky> {

    /* JADX INFO: renamed from: k4 */
    public static final C13752ky f45917k4 = new C13752ky();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IGradientStop iGradientStop) {
        return ((C14064he.m66708k4(iGradientStop.getPosition()) - 324743029) * 486187739) + C14767x7.f50002k4.m71465x1(iGradientStop.getColor());
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IGradientStop iGradientStop, IGradientStop iGradientStop2) {
        return C3085sv.m13089k4(iGradientStop.getPosition(), iGradientStop2.getPosition()) && C14767x7.f50002k4.equals(iGradientStop.getColor(), iGradientStop2.getColor());
    }
}
