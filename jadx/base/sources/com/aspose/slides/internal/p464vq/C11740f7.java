package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.Xml.C14010x0;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.f7 */
/* JADX INFO: loaded from: classes4.dex */
class C11740f7 extends C14010x0 {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, byte[]> f39734k4;

    public C11740f7(SortedDictionary<String, byte[]> sortedDictionary) {
        this.f39734k4 = new Dictionary<>();
        this.f39734k4 = new Dictionary<>(sortedDictionary);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14010x0, com.aspose.slides.p559ms.System.Xml.AbstractC13943n5
    /* JADX INFO: renamed from: k4 */
    public Object mo5312k4(C14062gk c14062gk, String str, AbstractC14068j5 abstractC14068j5) {
        byte[][] bArr = {null};
        boolean z = c14062gk != null && this.f39734k4.tryGetValue(c14062gk.m66697x1(), bArr);
        byte[] bArr2 = bArr[0];
        if (z) {
            try {
                return new C3152yj(bArr2, false);
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
            }
        }
        return null;
    }
}
