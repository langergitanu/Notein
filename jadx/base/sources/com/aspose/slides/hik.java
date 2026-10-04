package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class hik extends AbstractC14611u0<IOuterShadow, hik> {

    /* JADX INFO: renamed from: k4 */
    public static final hik f5509k4 = new hik();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IOuterShadow iOuterShadow) {
        return C14044b3.m66429k4(iOuterShadow.getScaleVertical()) + ((C14044b3.m66429k4(iOuterShadow.getScaleHorizontal()) + ((C14051ck.m66552k4(iOuterShadow.getRotateShadowWithShape()) + ((C14044b3.m66429k4(iOuterShadow.getSkewVertical()) + ((C14044b3.m66429k4(iOuterShadow.getSkewHorizontal()) + ((C14042ak.m66408k4(iOuterShadow.getRectangleAlign()) + ((((C14044b3.m66429k4(iOuterShadow.getDistance()) + ((C14064he.m66708k4(iOuterShadow.getDirection()) + ((C14044b3.m66429k4(iOuterShadow.getBlurRadius()) - 324743029) * 486187739)) * 486187739)) * 486187739) + C14767x7.f50002k4.m71465x1(iOuterShadow.getShadowColor())) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739)) * 486187739);
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IOuterShadow iOuterShadow, IOuterShadow iOuterShadow2) {
        return C3085sv.m13088k4(iOuterShadow.getBlurRadius(), iOuterShadow2.getBlurRadius()) && C3085sv.m13089k4(iOuterShadow.getDirection(), iOuterShadow2.getDirection()) && C3085sv.m13088k4(iOuterShadow.getDistance(), iOuterShadow2.getDistance()) && iOuterShadow.getRectangleAlign() == iOuterShadow2.getRectangleAlign() && C3085sv.m13088k4(iOuterShadow.getSkewHorizontal(), iOuterShadow2.getSkewHorizontal()) && C3085sv.m13088k4(iOuterShadow.getSkewVertical(), iOuterShadow2.getSkewVertical()) && iOuterShadow.getRotateShadowWithShape() == iOuterShadow2.getRotateShadowWithShape() && C3085sv.m13088k4(iOuterShadow.getScaleHorizontal(), iOuterShadow2.getScaleHorizontal()) && C3085sv.m13088k4(iOuterShadow.getScaleVertical(), iOuterShadow2.getScaleVertical()) && C14767x7.f50002k4.equals(iOuterShadow.getShadowColor(), iOuterShadow2.getShadowColor());
    }
}
