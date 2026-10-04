package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.huawei.hms.stats.b */
/* JADX INFO: loaded from: classes9.dex */
public class C18450b {

    /* JADX INFO: renamed from: a */
    public static HiAnalyticsInstance f56880a;

    /* JADX INFO: renamed from: a */
    public static HiAnalyticsInstance m80083a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f56880a = analyticsInstance;
        return analyticsInstance;
    }

    /* JADX INFO: renamed from: a */
    public static void m80086a(Context context, String str, String str2) {
        if (m80083a(context) != null) {
            f56880a.onEvent(context, str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m80085a(Context context, int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (m80083a(context) != null) {
            f56880a.onEvent(i, str, linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m80084a(Context context, int i) {
        if (m80083a(context) != null) {
            f56880a.onReport(i);
        }
    }
}
