package com.aspose.slides.internal.p104ec;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.kk */
/* JADX INFO: loaded from: classes3.dex */
class C3624kk {
    /* JADX INFO: renamed from: k4 */
    public static String m14768k4(byte[] bArr, int i) {
        if (bArr != null) {
            return m14769k4(bArr, C12555c5.m58552k4(i));
        }
        throw new ArgumentNullException("byteArray");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m14769k4(byte[] bArr, AbstractC6747ar abstractC6747ar) {
        if (bArr == null) {
            throw new ArgumentNullException("byteArray");
        }
        if (abstractC6747ar == null) {
            throw new ArgumentNullException("encoding");
        }
        char[] cArrM26671k4 = abstractC6747ar.m26671k4(bArr);
        if (cArrM26671k4 != null) {
            return C14113y2.m67362du(C14113y2.m67405k4(cArrM26671k4), 0);
        }
        return null;
    }
}
