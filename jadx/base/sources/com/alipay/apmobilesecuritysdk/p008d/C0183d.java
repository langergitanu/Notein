package com.alipay.apmobilesecuritysdk.p008d;

import android.content.Context;
import android.os.Build;
import com.alipay.apmobilesecuritysdk.p007c.C0178b;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.HashMap;
import java.util.Map;
import o00OO0O.OooO00o;
import o00OO0O.OooO0OO;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.d.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0183d {
    /* JADX INFO: renamed from: a */
    public static synchronized Map<String, String> m143a() {
        HashMap map;
        map = new HashMap();
        try {
            new C0178b();
            map.put("AE16", "");
        } catch (Throwable unused) {
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized Map<String, String> m144a(Context context) {
        HashMap map;
        try {
            OooO00o oooO00o = OooO00o.f84772OooO;
            map = new HashMap();
            map.put("AE1", TelemetryEventStrings.C18741Os.OS_NAME);
            StringBuilder sb = new StringBuilder();
            sb.append(OooO0OO.OooO0O0() ? "1" : "0");
            map.put("AE2", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(OooO0OO.OooO00o(context) ? "1" : "0");
            map.put("AE3", sb2.toString());
            map.put("AE4", Build.BOARD);
            map.put("AE5", Build.BRAND);
            map.put("AE6", Build.DEVICE);
            map.put("AE7", Build.DISPLAY);
            map.put("AE8", Build.VERSION.INCREMENTAL);
            map.put("AE9", Build.MANUFACTURER);
            map.put("AE10", Build.MODEL);
            map.put("AE11", Build.PRODUCT);
            map.put("AE12", Build.VERSION.RELEASE);
            map.put("AE13", Build.VERSION.SDK);
            map.put("AE14", Build.TAGS);
            String str = "0";
            try {
                str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "ro.kernel.qemu", "0");
            } catch (Exception unused) {
            }
            map.put("AE15", str);
            map.put("AE21", OooO00o.OooO0oo());
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }
}
