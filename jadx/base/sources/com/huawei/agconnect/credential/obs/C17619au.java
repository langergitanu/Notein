package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.util.Log;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.au */
/* JADX INFO: loaded from: classes8.dex */
public class C17619au {

    /* JADX INFO: renamed from: a */
    private static final String[] f52141a;

    /* JADX INFO: renamed from: b */
    private static final List<String> f52142b;

    static {
        String[] strArr = {"CN", "DE", "SG", "RU", GrsBaseInfo.CountryCodeSource.UNKNOWN};
        f52141a = strArr;
        f52142b = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC17620av m75505a(Context context, String str, String str2) {
        return C17622ax.m75514a(context, new C17623ay(str, str2, ""));
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC17620av m75506a(Context context, String str, String str2, String str3) {
        if (str3 != null) {
            List<String> list = f52142b;
            Locale locale = Locale.ENGLISH;
            if (list.contains(str3.toUpperCase(locale))) {
                return C17622ax.m75514a(context, new C17623ay(str, str2, str3.toUpperCase(locale)));
            }
        }
        Log.e("HiAnalyticsBridge", "RoutePolicy check failed: ".concat(String.valueOf(str3)));
        return null;
    }
}
