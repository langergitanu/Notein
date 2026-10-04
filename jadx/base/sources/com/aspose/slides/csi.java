package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class csi extends AbstractC14611u0<ILineFormat, csi> {

    /* JADX INFO: renamed from: k4 */
    public static final csi f4436k4 = new csi();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(ILineFormat iLineFormat) {
        return C14042ak.m66408k4(iLineFormat.getEndArrowheadLength()) + ((C14042ak.m66408k4(iLineFormat.getBeginArrowheadLength()) + ((C14042ak.m66408k4(iLineFormat.getEndArrowheadWidth()) + ((C14042ak.m66408k4(iLineFormat.getBeginArrowheadWidth()) + ((C14042ak.m66408k4(iLineFormat.getEndArrowheadStyle()) + ((C14042ak.m66408k4(iLineFormat.getBeginArrowheadStyle()) + ((C14064he.m66708k4(iLineFormat.getMiterLimit()) + ((C14042ak.m66408k4(iLineFormat.getJoinStyle()) + ((C14042ak.m66408k4(iLineFormat.getAlignment()) + ((C14042ak.m66408k4(iLineFormat.getStyle()) + ((C14042ak.m66408k4(iLineFormat.getCapStyle()) + ((((C14042ak.m66408k4(iLineFormat.getDashStyle()) + ((C14044b3.m66429k4(iLineFormat.getWidth()) + ((((((C14051ck.m66552k4(iLineFormat.isFormatNotDefined()) - 324743029) * 486187739) + bbd.f4167k4.m71465x1(iLineFormat.getFillFormat())) * 486187739) + fkw.f5054k4.m71465x1(iLineFormat.getSketchFormat())) * 486187739)) * 486187739)) * 486187739) + m4805k4(iLineFormat.getCustomDashPattern())) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739);
    }

    /* JADX INFO: renamed from: k4 */
    private int m4805k4(float[] fArr) {
        if (fArr == null) {
            return 0;
        }
        int iM66708k4 = 17;
        for (float f : fArr) {
            iM66708k4 = (iM66708k4 * 486187739) + C14064he.m66708k4(f);
        }
        return iM66708k4;
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(ILineFormat iLineFormat, ILineFormat iLineFormat2) {
        return iLineFormat.isFormatNotDefined() == iLineFormat2.isFormatNotDefined() && C3085sv.m13088k4(iLineFormat.getWidth(), iLineFormat2.getWidth()) && iLineFormat.getDashStyle() == iLineFormat2.getDashStyle() && iLineFormat.getCapStyle() == iLineFormat2.getCapStyle() && iLineFormat.getStyle() == iLineFormat2.getStyle() && iLineFormat.getAlignment() == iLineFormat2.getAlignment() && iLineFormat.getJoinStyle() == iLineFormat2.getJoinStyle() && C3085sv.m13089k4(iLineFormat.getMiterLimit(), iLineFormat2.getMiterLimit()) && iLineFormat.getBeginArrowheadStyle() == iLineFormat2.getBeginArrowheadStyle() && iLineFormat.getEndArrowheadStyle() == iLineFormat2.getEndArrowheadStyle() && iLineFormat.getBeginArrowheadWidth() == iLineFormat2.getBeginArrowheadWidth() && iLineFormat.getEndArrowheadWidth() == iLineFormat2.getEndArrowheadWidth() && iLineFormat.getBeginArrowheadLength() == iLineFormat2.getBeginArrowheadLength() && iLineFormat.getEndArrowheadLength() == iLineFormat2.getEndArrowheadLength() && m4806k4(iLineFormat.getCustomDashPattern(), iLineFormat2.getCustomDashPattern()) && bbd.f4167k4.equals(iLineFormat.getFillFormat(), iLineFormat2.getFillFormat()) && fkw.f5054k4.equals(iLineFormat.getSketchFormat(), iLineFormat2.getSketchFormat());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m4806k4(float[] fArr, float[] fArr2) {
        if (fArr == null && fArr2 == null) {
            return true;
        }
        if (((fArr == null) || (fArr2 == null)) || fArr.length != fArr2.length) {
            return false;
        }
        for (int i = 0; i < fArr.length; i++) {
            if (!C3085sv.m13089k4(fArr[i], fArr2[i])) {
                return false;
            }
        }
        return true;
    }
}
