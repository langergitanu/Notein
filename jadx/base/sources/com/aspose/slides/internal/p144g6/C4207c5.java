package com.aspose.slides.internal.p144g6;

import com.aspose.slides.internal.p060ca.C2132iq;
import com.aspose.slides.internal.p060ca.InterfaceC2201mt;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p508xq.C12596h4;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C4207c5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static C12596h4 m16883k4(InterfaceC2201mt interfaceC2201mt, String str) {
        byte[] bArrM58632x1;
        C3152yj c3152yj = new C3152yj();
        try {
            if (((C2132iq) interfaceC2201mt).m10750kk() == null) {
                interfaceC2201mt.mo11257k4(c3152yj);
                bArrM58632x1 = C12565ks.m58632x1(c3152yj);
            } else {
                bArrM58632x1 = C12565ks.m58632x1(interfaceC2201mt.mo10804yj().mo10259ck().m10333kk()[0].m11428kk().mo10245x1());
            }
            c3152yj.dispose();
            return m16884k4(bArrM58632x1, str);
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static byte[] m16886x1(byte[] bArr, String str) {
        byte[] bArrM16885k4 = m16885k4(str);
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) ((bArrM16885k4[(bArrM16885k4.length - (i % bArrM16885k4.length)) - 1] & 255) ^ (bArr[i] & 255));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12596h4 m16884k4(byte[] bArr, String str) {
        byte[] bArrM16886x1 = m16886x1(bArr, str);
        C12596h4 c12596h4 = new C12596h4(str, "application/vnd.ms-package.obfuscated-opentype");
        c12596h4.m58803to().write(bArrM16886x1, 0, bArrM16886x1.length);
        return c12596h4;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m16885k4(String str) {
        return C12565ks.m58624k4(new C14047bz(C3141rv.m13411x1(str)));
    }
}
