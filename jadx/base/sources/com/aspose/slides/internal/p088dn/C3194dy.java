package com.aspose.slides.internal.p088dn;

import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.dy */
/* JADX INFO: loaded from: classes3.dex */
public final class C3194dy {
    /* JADX INFO: renamed from: k4 */
    public static byte m13765k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        if (C3207x6.m13899k4(str, i, interfaceC14073kp) <= 255) {
            return (byte) (r2 & 4294967295L);
        }
        throw new OverflowException("Value too large.");
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m13766k4(String str, InterfaceC14073kp interfaceC14073kp) {
        return m13765k4(str, 7, interfaceC14073kp);
    }
}
