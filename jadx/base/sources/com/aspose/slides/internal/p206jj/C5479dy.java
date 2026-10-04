package com.aspose.slides.internal.p206jj;

import com.aspose.slides.internal.p019ac.AbstractC1349ne;
import com.aspose.slides.internal.p019ac.C1338ck;
import com.aspose.slides.internal.p019ac.C1341fa;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.jj.dy */
/* JADX INFO: loaded from: classes.dex */
public class C5479dy extends AbstractC5496yj {
    /* JADX INFO: renamed from: k4 */
    public AbstractC1349ne m22569k4(C3134k4 c3134k4) {
        C1341fa c1341fa = new C1341fa((C1338ck) new C5476c5().m22564k4(c3134k4));
        c1341fa.m7885k4(c3134k4.m13372dy(256));
        c1341fa.m7891x1(m22568k4(c1341fa.m7884ix(), 0, 128));
        c1341fa.m7887kk(m22568k4(c1341fa.m7884ix(), 128, 64));
        c1341fa.m7890to(m22568k4(c1341fa.m7884ix(), 192, 64));
        return c1341fa;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m22568k4(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        int i4 = i;
        while (true) {
            if (i4 < C14116yg.m67507x1(bArr.length - 1, i3)) {
                if ((bArr[i4] & 255) == 0 && (bArr[i4 + 1] & 255) == 0) {
                    i3 = i4;
                    break;
                }
                i4 += 2;
            } else {
                break;
            }
        }
        return AbstractC6747ar.m26643rv().mo26682x1(bArr, i, i3 - i);
    }
}
