package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14042ak;

/* JADX INFO: renamed from: com.aspose.slides.fm */
/* JADX INFO: loaded from: classes3.dex */
class C1105fm extends AbstractC14611u0<IFillFormat, C1105fm> {

    /* JADX INFO: renamed from: k4 */
    public static final C1105fm f5063k4 = new C1105fm();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IFillFormat iFillFormat) {
        return C14042ak.m66408k4(iFillFormat.getRotateWithShape()) + ((((((((((C14042ak.m66408k4(iFillFormat.getFillType()) - 324743029) * 486187739) + C14767x7.f50002k4.m71465x1(iFillFormat.getSolidFillColor())) * 486187739) + C14844ye.f50341k4.m71465x1(iFillFormat.getGradientFormat())) * 486187739) + xut.f50205k4.m71465x1(iFillFormat.getPatternFormat())) * 486187739) + wb5.f49783k4.m71465x1(iFillFormat.getPictureFillFormat())) * 486187739);
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IFillFormat iFillFormat, IFillFormat iFillFormat2) {
        return iFillFormat.getFillType() == iFillFormat2.getFillType() && iFillFormat.getRotateWithShape() == iFillFormat2.getRotateWithShape() && C14767x7.f50002k4.equals(iFillFormat.getSolidFillColor(), iFillFormat2.getSolidFillColor()) && C14844ye.f50341k4.equals(iFillFormat.getGradientFormat(), iFillFormat2.getGradientFormat()) && xut.f50205k4.equals(iFillFormat.getPatternFormat(), iFillFormat2.getPatternFormat()) && wb5.f49783k4.equals(iFillFormat.getPictureFillFormat(), iFillFormat2.getPictureFillFormat());
    }
}
