package com.aspose.slides.p559ms.core.resources;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p161h5.C4496h4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.core.resources.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C14142x1 {
    /* JADX INFO: renamed from: k4 */
    private static C3152yj m67701k4(AbstractC3150x6 abstractC3150x6, int i) {
        C3152yj c3152yj = new C3152yj(i);
        m67704k4(abstractC3150x6, c3152yj, i);
        c3152yj.setPosition(0L);
        C3152yj c3152yj2 = new C3152yj(i);
        try {
            m67703k4(c3152yj, c3152yj2);
            c3152yj.close();
            c3152yj2.setPosition(0L);
            return c3152yj2;
        } catch (Throwable th) {
            c3152yj.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m67705x1(AbstractC3150x6 abstractC3150x6, int i) {
        abstractC3150x6.seek(i, 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14141k4 m67702k4(AbstractC3150x6 abstractC3150x6, String str) {
        byte[] bArr = new byte[3];
        abstractC3150x6.read(bArr, 0, 3);
        if (!C14113y2.m67363du("PAK", AbstractC6747ar.m26650yj().m26681x1(bArr))) {
            throw new IllegalArgumentException("unknown format");
        }
        byte[] bArr2 = new byte[8];
        abstractC3150x6.read(bArr2, 0, 8);
        C14069jd.m66767h4(bArr2, 0);
        byte[] bArr3 = new byte[4];
        abstractC3150x6.read(bArr3, 0, 4);
        int iM66765du = C14069jd.m66765du(bArr3, 0);
        for (int i = 0; i < iM66765du; i++) {
            byte[] bArr4 = new byte[4];
            abstractC3150x6.read(bArr4, 0, 4);
            int iM66765du2 = C14069jd.m66765du(bArr4, 0);
            byte[] bArr5 = new byte[iM66765du2];
            abstractC3150x6.read(bArr5, 0, iM66765du2);
            String strM26681x1 = AbstractC6747ar.m26635ix().m26681x1(bArr5);
            byte[] bArr6 = new byte[4];
            abstractC3150x6.read(bArr6, 0, 4);
            int iM66765du3 = C14069jd.m66765du(bArr6, 0);
            if (C14113y2.m67363du(str, strM26681x1)) {
                return new C14141k4(strM26681x1, m67701k4(abstractC3150x6, iM66765du3));
            }
            m67705x1(abstractC3150x6, iM66765du3);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m67703k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        C4496h4 c4496h4 = new C4496h4(abstractC3150x6, 1, true);
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                int i = c4496h4.read(bArr, 0, 65536);
                if (i <= 0) {
                    return;
                } else {
                    abstractC3150x62.write(bArr, 0, i);
                }
            }
        } finally {
            c4496h4.close();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67704k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62, int i) {
        byte[] bArr = new byte[i];
        do {
            int i2 = abstractC3150x6.read(bArr, 0, i);
            if (i2 <= 0) {
                if (i > 0) {
                    throw new IllegalArgumentException("input stream length less then Count");
                }
                return;
            } else {
                abstractC3150x62.write(bArr, 0, i2);
                i -= i2;
            }
        } while (i > 0);
    }
}
