package com.huawei.hms.framework.network.grs.p582h;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import java.util.Locale;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.h.a */
/* JADX INFO: loaded from: classes7.dex */
public class C17955a {
    /* JADX INFO: renamed from: a */
    public static String m77147a() {
        return "5.0.10.302";
    }

    /* JADX INFO: renamed from: b */
    public static String m77150b(Context context, String str, String str2) {
        return m77149a(context, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static String m77148a(Context context) {
        if (context == null) {
            return "";
        }
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.m76968w("AgentUtil", "", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m77149a(Context context, String str, String str2) {
        if (context == null) {
            return String.format(Locale.ROOT, C21111o0ooOoO.OooO0Oo(str, "/%s"), m77147a());
        }
        String packageName = (ContextHolder.getAppContext() == null ? context : ContextHolder.getAppContext()).getPackageName();
        String strM77148a = m77148a(context);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.MODEL;
        Locale locale = Locale.ROOT;
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("%s/%s (Linux; Android %s; %s) ", str, "/%s %s");
        String strM77147a = m77147a();
        if (TextUtils.isEmpty(str2)) {
            str2 = "no_service_name";
        }
        return String.format(locale, strOooO0O0, packageName, strM77148a, str3, str4, strM77147a, str2);
    }
}
