package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.ve */
/* JADX INFO: loaded from: classes3.dex */
class C14674ve extends AbstractC14611u0<IColorOperationCollection, C14674ve> {

    /* JADX INFO: renamed from: k4 */
    public static final C14674ve f49491k4 = new C14674ve();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IColorOperationCollection iColorOperationCollection) {
        if (iColorOperationCollection.size() == 0) {
            return 0;
        }
        int iM71465x1 = 17;
        for (int i = 0; i < iColorOperationCollection.size(); i++) {
            iM71465x1 = (iM71465x1 * 486187739) + C0903dj.f4596k4.m71465x1(iColorOperationCollection.get_Item(i));
        }
        return iM71465x1;
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IColorOperationCollection iColorOperationCollection, IColorOperationCollection iColorOperationCollection2) {
        if (iColorOperationCollection.size() != iColorOperationCollection2.size()) {
            return false;
        }
        for (int i = 0; i < iColorOperationCollection.size(); i++) {
            if (!C0903dj.f4596k4.equals(iColorOperationCollection.get_Item(i), iColorOperationCollection2.get_Item(i))) {
                return false;
            }
        }
        return true;
    }
}
