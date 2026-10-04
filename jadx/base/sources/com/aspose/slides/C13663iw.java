package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.iw */
/* JADX INFO: loaded from: classes3.dex */
class C13663iw extends AbstractC14611u0<IGradientStopCollection, C13663iw> {

    /* JADX INFO: renamed from: k4 */
    public static final C13663iw f45390k4 = new C13663iw();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IGradientStopCollection iGradientStopCollection) {
        if (iGradientStopCollection.size() == 0) {
            return 0;
        }
        int iM71465x1 = 17;
        for (int i = 0; i < iGradientStopCollection.size(); i++) {
            iM71465x1 = (iM71465x1 * 486187739) + C13752ky.f45917k4.m71465x1(iGradientStopCollection.get_Item(i));
        }
        return iM71465x1;
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IGradientStopCollection iGradientStopCollection, IGradientStopCollection iGradientStopCollection2) {
        if (iGradientStopCollection.size() != iGradientStopCollection2.size()) {
            return false;
        }
        for (int i = 0; i < iGradientStopCollection.size(); i++) {
            if (!C13752ky.f45917k4.equals(iGradientStopCollection.get_Item(i), iGradientStopCollection2.get_Item(i))) {
                return false;
            }
        }
        return true;
    }
}
