package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14042ak;

/* JADX INFO: loaded from: classes3.dex */
class bbd extends AbstractC14611u0<ILineFillFormat, bbd> {

    /* JADX INFO: renamed from: k4 */
    public static final bbd f4167k4 = new bbd();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(ILineFillFormat iLineFillFormat) {
        return C14042ak.m66408k4(iLineFillFormat.getRotateWithShape()) + ((((((C14767x7.f50002k4.m71465x1(iLineFillFormat.getSolidFillColor()) - 324743029) * 486187739) + C14844ye.f50341k4.m71465x1(iLineFillFormat.getGradientFormat())) * 486187739) + xut.f50205k4.m71465x1(iLineFillFormat.getPatternFormat())) * 486187739);
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(ILineFillFormat iLineFillFormat, ILineFillFormat iLineFillFormat2) {
        return iLineFillFormat.getFillType() == iLineFillFormat2.getFillType() && iLineFillFormat.getRotateWithShape() == iLineFillFormat2.getRotateWithShape() && C14767x7.f50002k4.equals(iLineFillFormat.getSolidFillColor(), iLineFillFormat2.getSolidFillColor()) && C14844ye.f50341k4.equals(iLineFillFormat.getGradientFormat(), iLineFillFormat2.getGradientFormat()) && xut.f50205k4.equals(iLineFillFormat.getPatternFormat(), iLineFillFormat2.getPatternFormat());
    }
}
