package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14042ak;

/* JADX INFO: loaded from: classes3.dex */
class xut extends AbstractC14611u0<IPatternFormat, xut> {

    /* JADX INFO: renamed from: k4 */
    public static final xut f50205k4 = new xut();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IPatternFormat iPatternFormat) {
        int iM66408k4 = (C14042ak.m66408k4(iPatternFormat.getPatternStyle()) - 324743029) * 486187739;
        C14767x7 c14767x7 = C14767x7.f50002k4;
        return ((iM66408k4 + c14767x7.m71465x1(iPatternFormat.getForeColor())) * 486187739) + c14767x7.m71465x1(iPatternFormat.getBackColor());
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IPatternFormat iPatternFormat, IPatternFormat iPatternFormat2) {
        if (iPatternFormat.getPatternStyle() != iPatternFormat2.getPatternStyle()) {
            return false;
        }
        C14767x7 c14767x7 = C14767x7.f50002k4;
        return c14767x7.equals(iPatternFormat.getForeColor(), iPatternFormat2.getForeColor()) && c14767x7.equals(iPatternFormat.getBackColor(), iPatternFormat2.getBackColor());
    }
}
