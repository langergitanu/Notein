package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: renamed from: com.aspose.slides.f8 */
/* JADX INFO: loaded from: classes3.dex */
class C1081f8 extends AbstractC14611u0<IGlow, C1081f8> {

    /* JADX INFO: renamed from: k4 */
    public static final C1081f8 f5003k4 = new C1081f8();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IGlow iGlow) {
        return ((C14044b3.m66429k4(iGlow.getRadius()) - 324743029) * 486187739) + C14767x7.f50002k4.m71465x1(iGlow.getColor());
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IGlow iGlow, IGlow iGlow2) {
        return C3085sv.m13088k4(iGlow.getRadius(), iGlow2.getRadius()) && C14767x7.f50002k4.equals(iGlow.getColor(), iGlow2.getColor());
    }
}
