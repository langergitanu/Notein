package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14098up;

/* JADX INFO: renamed from: com.aspose.slides.x7 */
/* JADX INFO: loaded from: classes3.dex */
class C14767x7 extends AbstractC14611u0<IColorFormat, C14767x7> {

    /* JADX INFO: renamed from: k4 */
    public static final C14767x7 f50002k4 = new C14767x7();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IColorFormat iColorFormat) {
        int iM66409k4 = C14042ak.m66409k4(iColorFormat.getSchemeColor()) + ((C14042ak.m66409k4(iColorFormat.getSystemColor()) + ((C14042ak.m66409k4(iColorFormat.getPresetColor()) + ((C14042ak.m66409k4(iColorFormat.getColorType()) - 324743029) * 486187739)) * 486187739)) * 486187739);
        if (iColorFormat.getColorType() != 3) {
            iM66409k4 = C14064he.m66708k4(iColorFormat.getLuminance()) + ((C14064he.m66708k4(iColorFormat.getSaturation()) + ((C14064he.m66708k4(iColorFormat.getHue()) + ((C14064he.m66708k4(iColorFormat.getFloatB()) + ((C14064he.m66708k4(iColorFormat.getFloatG()) + ((C14064he.m66708k4(iColorFormat.getFloatR()) + ((C14098up.m67317k4(iColorFormat.getB()) + ((C14098up.m67317k4(iColorFormat.getG()) + ((C14098up.m67317k4(iColorFormat.getR()) + ((((ColorFormat) iColorFormat).m1084to().hashCode() + (iM66409k4 * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739);
        }
        return (iM66409k4 * 486187739) + C14674ve.f49491k4.m71465x1(iColorFormat.getColorTransform());
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IColorFormat iColorFormat, IColorFormat iColorFormat2) {
        return iColorFormat.getColorType() == iColorFormat2.getColorType() && C12003du.m56403k4(((ColorFormat) iColorFormat).m1084to(), ((ColorFormat) iColorFormat2).m1084to()) && iColorFormat.getPresetColor() == iColorFormat2.getPresetColor() && iColorFormat.getSystemColor() == iColorFormat2.getSystemColor() && iColorFormat.getSchemeColor() == iColorFormat2.getSchemeColor() && iColorFormat.getR() == iColorFormat2.getR() && iColorFormat.getG() == iColorFormat2.getG() && iColorFormat.getB() == iColorFormat2.getB() && C3085sv.m13089k4(iColorFormat.getFloatR(), iColorFormat2.getFloatR()) && C3085sv.m13089k4(iColorFormat.getFloatG(), iColorFormat2.getFloatG()) && C3085sv.m13089k4(iColorFormat.getFloatB(), iColorFormat2.getFloatB()) && C3085sv.m13089k4(iColorFormat.getHue(), iColorFormat2.getHue()) && C3085sv.m13089k4(iColorFormat.getSaturation(), iColorFormat2.getSaturation()) && C3085sv.m13089k4(iColorFormat.getLuminance(), iColorFormat2.getLuminance()) && C14674ve.f49491k4.equals(iColorFormat.getColorTransform(), iColorFormat2.getColorTransform());
    }
}
