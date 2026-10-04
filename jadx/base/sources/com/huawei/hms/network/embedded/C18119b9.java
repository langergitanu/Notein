package com.huawei.hms.network.embedded;

import android.os.Build;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.net.InetSocketAddress;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.b9 */
/* JADX INFO: loaded from: classes9.dex */
public class C18119b9 {
    /* JADX INFO: renamed from: a */
    public static int m78014a() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18133c9 m78015a(ArrayList<InetSocketAddress> arrayList, int i) {
        int iM78014a = m78014a();
        String property = System.getProperty("openConcurrent");
        boolean z = property == null || !property.trim().equalsIgnoreCase(TelemetryEventStrings.Value.FALSE);
        if ((iM78014a < 29 || !z) && iM78014a < 30) {
            return new C18133c9(arrayList, i);
        }
        return new C18105a9(arrayList, i);
    }
}
