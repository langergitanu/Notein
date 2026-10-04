package com.aspose.slides.internal.p088dn;

import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.jd */
/* JADX INFO: loaded from: classes3.dex */
public final class C3197jd {
    /* JADX INFO: renamed from: k4 */
    public static short m13770k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        int iM13740k4 = C3192ck.m13740k4(str, i, interfaceC14073kp);
        if ((i & 512) != 0) {
            if (iM13740k4 >= 0 && iM13740k4 <= 65535) {
                return (short) iM13740k4;
            }
        } else if (iM13740k4 <= 32767 && iM13740k4 >= -32768) {
            return (short) iM13740k4;
        }
        throw new OverflowException("Value too large or too small.");
    }
}
