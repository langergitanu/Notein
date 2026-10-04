package com.aspose.slides.internal.p422tl;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p260ly.AbstractC6280ne;
import com.aspose.slides.internal.p260ly.C6269ck;
import com.aspose.slides.internal.p260ly.C6272fa;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.tl.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C11048dy extends AbstractC11065yj {
    /* JADX INFO: renamed from: k4 */
    public AbstractC6280ne m53480k4(C3134k4 c3134k4) {
        C6272fa c6272fa = new C6272fa((C6269ck) new C11045c5().m53475k4(c3134k4));
        c6272fa.m25499k4(c3134k4.m13372dy(256));
        c6272fa.m25505x1(m53479k4(c6272fa.m25504u4(), 0, 128));
        c6272fa.m25501kk(m53479k4(c6272fa.m25504u4(), 128, 64));
        c6272fa.m25503to(m53479k4(c6272fa.m25504u4(), 192, 64));
        return c6272fa;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m53479k4(byte[] bArr, int i, int i2) {
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
