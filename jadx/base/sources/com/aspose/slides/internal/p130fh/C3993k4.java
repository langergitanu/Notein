package com.aspose.slides.internal.p130fh;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p151gj.C4325rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.fh.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3993k4 {
    /* JADX INFO: renamed from: k4 */
    public static void m15774k4(AbstractC3150x6 abstractC3150x6, int i, IGenericList<C4325rv> iGenericList, C4325rv c4325rv) {
        int i2 = 0;
        while (i2 < i && i2 < iGenericList.size()) {
            C4325rv c4325rvClone = iGenericList.get_Item(i2).Clone();
            abstractC3150x6.writeByte(c4325rvClone.f11813k4);
            abstractC3150x6.writeByte(c4325rvClone.f11815x1);
            abstractC3150x6.writeByte(c4325rvClone.f11814kk);
            i2++;
        }
        while (i2 < i) {
            abstractC3150x6.writeByte(c4325rv.f11813k4);
            abstractC3150x6.writeByte(c4325rv.f11815x1);
            abstractC3150x6.writeByte(c4325rv.f11814kk);
            i2++;
        }
    }
}
