package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.huawei.hms.hatool.g */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC17985g {
    /* JADX INFO: renamed from: a */
    public static String m77324a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(AbstractC17967a.m77188a(str, str2))) {
            return AbstractC17967a.m77188a(str, str2);
        }
        C18030y.m77586c("hmsSdk", "getAndroidId(): to getConfigByType()");
        return m77326c(context, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m77325b(Context context, String str, String str2) {
        if (!str2.equals("oper") && !str2.equals("maint") && !str2.equals("diffprivacy") && !str2.equals("preins")) {
            C18030y.m77591f("hmsSdk", "getChannel(): Invalid type: ".concat(str2));
            return "";
        }
        return m77327d(context, str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static String m77326c(Context context, String str, String str2) {
        if (!AbstractC17967a.m77189b(str, str2)) {
            return "";
        }
        if (TextUtils.isEmpty(AbstractC17970b.m77220d())) {
            C17991i.m77353c().m77358b().m77426b(AbstractC17982f.m77306a(context));
        }
        return AbstractC17970b.m77220d();
    }

    /* JADX INFO: renamed from: d */
    public static String m77327d(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(AbstractC17973c.m77245d(str, str2))) {
            return AbstractC17973c.m77245d(str, str2);
        }
        C18000l c18000lM77358b = C17991i.m77353c().m77358b();
        if (TextUtils.isEmpty(c18000lM77358b.m77437h())) {
            String strM77310b = AbstractC17982f.m77310b(context);
            if (!C18019s0.m77526a("channel", strM77310b, 256)) {
                strM77310b = "";
            }
            c18000lM77358b.m77434f(strM77310b);
        }
        return c18000lM77358b.m77437h();
    }
}
