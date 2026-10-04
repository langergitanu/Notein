package com.aspose.slides.internal.p088dn;

import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.ks */
/* JADX INFO: loaded from: classes3.dex */
public final class C3200ks {

    /* JADX INFO: renamed from: k4 */
    private static double f9532k4 = 3.6147112457961776E29d;

    /* JADX INFO: renamed from: k4 */
    public static float m13778k4(String str) {
        double dM13706k4 = C3191c5.m13706k4(str, 231, null);
        if (dM13706k4 - 3.4028234663852886E38d <= f9532k4 || C14044b3.m66424du(dM13706k4)) {
            return (float) dM13706k4;
        }
        throw new OverflowException();
    }

    /* JADX INFO: renamed from: k4 */
    public static float m13779k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        double dM13706k4 = C3191c5.m13706k4(str, i, interfaceC14073kp);
        if (dM13706k4 - 3.4028234663852886E38d <= f9532k4 || C14044b3.m66424du(dM13706k4)) {
            return (float) dM13706k4;
        }
        throw new OverflowException();
    }

    /* JADX INFO: renamed from: k4 */
    public static float m13780k4(String str, InterfaceC14073kp interfaceC14073kp) {
        double dM13706k4 = C3191c5.m13706k4(str, 231, interfaceC14073kp);
        if (dM13706k4 - 3.4028234663852886E38d <= f9532k4 || C14044b3.m66424du(dM13706k4)) {
            return (float) dM13706k4;
        }
        throw new OverflowException();
    }
}
