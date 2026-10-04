package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.w7 */
/* JADX INFO: loaded from: classes3.dex */
class C14726w7 {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Object, Integer> f49765k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final List<Integer> f49766x1 = new List<>();

    /* JADX INFO: renamed from: k4 */
    public final int m72644k4(ILinkEmbedController iLinkEmbedController, Object obj, byte[] bArr, String str, String str2, String str3, int[] iArr) {
        Integer[] numArr = {0};
        boolean zTryGetValue = this.f49765k4.tryGetValue(obj, numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue) {
            iArr[0] = this.f49766x1.get_Item(iIntValue - 1).intValue();
            return iIntValue;
        }
        int objectStoringLocation = iLinkEmbedController.getObjectStoringLocation(this.f49766x1.size() + 1, bArr, str, str2, str3);
        iArr[0] = objectStoringLocation;
        this.f49766x1.addItem(Integer.valueOf(objectStoringLocation));
        this.f49765k4.set_Item(obj, Integer.valueOf(this.f49766x1.size()));
        return this.f49766x1.size();
    }
}
