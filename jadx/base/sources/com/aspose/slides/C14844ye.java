package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.ye */
/* JADX INFO: loaded from: classes3.dex */
class C14844ye extends AbstractC14611u0<IGradientFormat, C14844ye> {

    /* JADX INFO: renamed from: k4 */
    public static final C14844ye f50341k4 = new C14844ye();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IGradientFormat iGradientFormat) {
        return ((C14042ak.m66408k4(iGradientFormat.getGradientShape()) + ((C14042ak.m66408k4(iGradientFormat.getLinearGradientScaled()) + ((C14064he.m66708k4(iGradientFormat.getLinearGradientAngle()) + ((C14042ak.m66409k4(iGradientFormat.getGradientDirection()) + ((C14042ak.m66409k4(iGradientFormat.getTileFlip()) - 324743029) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739) + C13663iw.f45390k4.m71465x1(iGradientFormat.getGradientStops());
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IGradientFormat iGradientFormat, IGradientFormat iGradientFormat2) {
        return iGradientFormat.getTileFlip() == iGradientFormat2.getTileFlip() && iGradientFormat.getGradientDirection() == iGradientFormat2.getGradientDirection() && C3085sv.m13089k4(iGradientFormat.getLinearGradientAngle(), iGradientFormat2.getLinearGradientAngle()) && iGradientFormat.getLinearGradientScaled() == iGradientFormat2.getLinearGradientScaled() && iGradientFormat.getGradientShape() == iGradientFormat2.getGradientShape() && C13663iw.f45390k4.equals(iGradientFormat.getGradientStops(), iGradientFormat2.getGradientStops());
    }
}
