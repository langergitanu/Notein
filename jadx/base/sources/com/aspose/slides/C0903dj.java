package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.dj */
/* JADX INFO: loaded from: classes3.dex */
class C0903dj extends AbstractC14611u0<IColorOperation, C0903dj> {

    /* JADX INFO: renamed from: k4 */
    public static final C0903dj f4596k4 = new C0903dj();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IColorOperation iColorOperation) {
        return C14064he.m66708k4(iColorOperation.getParameter()) + ((C14042ak.m66409k4(iColorOperation.getOperationType()) - 324743029) * 486187739);
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IColorOperation iColorOperation, IColorOperation iColorOperation2) {
        return iColorOperation.getOperationType() == iColorOperation2.getOperationType() && C3085sv.m13089k4(iColorOperation.getParameter(), iColorOperation2.getParameter());
    }
}
