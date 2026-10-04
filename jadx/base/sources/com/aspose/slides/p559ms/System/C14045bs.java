package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p088dn.C3208yj;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.bs */
/* JADX INFO: loaded from: classes5.dex */
public final class C14045bs {
    /* JADX INFO: renamed from: k4 */
    public static byte m66441k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        return C3208yj.m13902k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66442k4(byte b) {
        return b ^ (b << 8);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66443k4(byte b, Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() == Byte.class) {
            return b - C14080ne.m67011to(obj);
        }
        throw new ArgumentException("Object must be of type System.SByte");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66444k4(byte b, String str, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13811k4(str, b, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66445k4(String str, int i, InterfaceC14073kp interfaceC14073kp, byte[] bArr) {
        try {
            bArr[0] = m66441k4(str, i, interfaceC14073kp);
            return true;
        } catch (Exception unused) {
            bArr[0] = 0;
            return false;
        }
    }
}
