package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14051ck;

/* JADX INFO: renamed from: com.aspose.slides.z0 */
/* JADX INFO: loaded from: classes3.dex */
class C14868z0 extends AbstractC14611u0<IBlur, C14868z0> {

    /* JADX INFO: renamed from: k4 */
    public static final C14868z0 f50431k4 = new C14868z0();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IBlur iBlur) {
        return C14044b3.m66429k4(iBlur.getRadius()) + ((C14051ck.m66552k4(iBlur.getGrow()) - 324743029) * 486187739);
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IBlur iBlur, IBlur iBlur2) {
        return iBlur.getGrow() == iBlur2.getGrow() && C3085sv.m13088k4(iBlur.getRadius(), iBlur2.getRadius());
    }
}
