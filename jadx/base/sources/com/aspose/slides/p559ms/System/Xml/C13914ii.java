package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.p559ms.System.C14062gk;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ii */
/* JADX INFO: loaded from: classes5.dex */
public class C13914ii extends C3152yj {

    /* JADX INFO: renamed from: k4 */
    private C14062gk f46576k4;

    public C13914ii(C14062gk c14062gk, AbstractC3150x6 abstractC3150x6) {
        this.f46576k4 = c14062gk;
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = abstractC3150x6.read(bArr, 0, 4096);
                if (i <= 0) {
                    super.setPosition(0L);
                    abstractC3150x6.close();
                    return;
                }
                write(bArr, 0, i);
            }
        } catch (Throwable th) {
            abstractC3150x6.close();
            throw th;
        }
    }
}
