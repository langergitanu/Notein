package com.aspose.slides.internal.p255lq;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.lq.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6221x1 {
    /* JADX INFO: renamed from: k4 */
    public static void m25204k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62, int i) {
        C6005k4.m24261k4(abstractC3150x6 != null);
        C6005k4.m24261k4(abstractC3150x6.canRead());
        C6005k4.m24261k4(abstractC3150x62 != null);
        C6005k4.m24261k4(abstractC3150x62.canWrite());
        abstractC3150x6.seek(0L, 0);
        byte[] bArr = new byte[i];
        while (true) {
            int i2 = abstractC3150x6.read(bArr, 0, i);
            if (i2 <= 0) {
                return;
            } else {
                abstractC3150x62.write(bArr, 0, i2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m25205k4(AbstractC3150x6 abstractC3150x6) {
        C6005k4.m24261k4(abstractC3150x6 != null);
        C6005k4.m24261k4(abstractC3150x6.canRead());
        C3152yj c3152yj = new C3152yj();
        try {
            m25204k4(abstractC3150x6, c3152yj, 16384);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }
}
