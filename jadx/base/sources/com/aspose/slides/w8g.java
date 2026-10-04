package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class w8g extends AbstractC14611u0<IInnerShadow, w8g> {

    /* JADX INFO: renamed from: k4 */
    public static final w8g f49774k4 = new w8g();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IInnerShadow iInnerShadow) {
        return ((C14044b3.m66429k4(iInnerShadow.getDistance()) + ((C14064he.m66708k4(iInnerShadow.getDirection()) + ((C14044b3.m66429k4(iInnerShadow.getBlurRadius()) - 324743029) * 486187739)) * 486187739)) * 486187739) + C14767x7.f50002k4.m71465x1(iInnerShadow.getShadowColor());
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IInnerShadow iInnerShadow, IInnerShadow iInnerShadow2) {
        return C3085sv.m13088k4(iInnerShadow.getBlurRadius(), iInnerShadow2.getBlurRadius()) && C3085sv.m13089k4(iInnerShadow.getDirection(), iInnerShadow2.getDirection()) && C3085sv.m13088k4(iInnerShadow.getDistance(), iInnerShadow2.getDistance()) && C14767x7.f50002k4.equals(iInnerShadow.getShadowColor(), iInnerShadow2.getShadowColor());
    }
}
