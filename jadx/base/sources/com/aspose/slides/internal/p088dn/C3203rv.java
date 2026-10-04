package com.aspose.slides.internal.p088dn;

import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.rv */
/* JADX INFO: loaded from: classes3.dex */
public final class C3203rv {
    /* JADX INFO: renamed from: k4 */
    public static int m13784k4(String str, int i) {
        return m13785k4(str, i, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13785k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        long jM67458k4 = C14114y9.m67458k4(str, i, interfaceC14073kp);
        if (jM67458k4 <= C18177fb.f54859s) {
            return (int) (jM67458k4 & 4294967295L);
        }
        throw new OverflowException("Value too large.");
    }
}
