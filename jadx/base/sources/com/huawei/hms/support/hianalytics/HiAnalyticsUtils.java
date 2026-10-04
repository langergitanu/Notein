package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.C18449a;
import com.huawei.hms.stats.C18450b;
import com.huawei.hms.stats.C18451c;
import com.huawei.hms.support.log.HMSLog;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class HiAnalyticsUtils {

    /* JADX INFO: renamed from: c */
    public static final Object f56932c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f56933d = new Object();

    /* JADX INFO: renamed from: e */
    public static HiAnalyticsUtils f56934e;

    /* JADX INFO: renamed from: a */
    public int f56935a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f56936b = C18451c.m80087a();

    /* JADX INFO: renamed from: a */
    public static LinkedHashMap<String, String> m80114a(Map<String, String> map) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (f56932c) {
            try {
                if (f56934e == null) {
                    f56934e = new HiAnalyticsUtils();
                }
                hiAnalyticsUtils = f56934e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hiAnalyticsUtils;
    }

    public static String versionCodeToName(String str) {
        if (!TextUtils.isEmpty(str) && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + "." + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + "." + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + "." + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public void enableLog(Context context) {
        HMSLog.m80174i("HiAnalyticsUtils", "Enable Log");
        if (this.f56936b) {
            HiAnalyticTools.enableLog(context);
        } else {
            HmsHiAnalyticsUtils.enableLog();
        }
    }

    public boolean getInitFlag() {
        return !this.f56936b ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public boolean hasError(Context context) {
        return C18449a.m80082c(context);
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        if (hasError(context) || context == null) {
            return;
        }
        onEvent2(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        if (hasError(context) || map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (this.f56936b) {
            C18450b.m80085a(context, 0, str, m80114a(map));
            C18450b.m80085a(context, 1, str, m80114a(map));
        } else {
            HmsHiAnalyticsUtils.onEvent(0, str, m80114a(map));
            HmsHiAnalyticsUtils.onEvent(1, str, m80114a(map));
        }
        m80115a(context);
    }

    public void onEvent2(Context context, String str, String str2) {
        if (hasError(context) || context == null || !getInitFlag()) {
            return;
        }
        if (this.f56936b) {
            C18450b.m80086a(context, str, str2);
        } else {
            HmsHiAnalyticsUtils.onEvent(context, str, str2);
        }
    }

    public void onNewEvent(Context context, String str, Map map) {
        if (hasError(context) || map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (this.f56936b) {
            C18450b.m80085a(context, 0, str, m80114a((Map<String, String>) map));
            C18450b.m80085a(context, 1, str, m80114a((Map<String, String>) map));
        } else {
            HmsHiAnalyticsUtils.onEvent(0, str, m80114a((Map<String, String>) map));
            HmsHiAnalyticsUtils.onEvent(1, str, m80114a((Map<String, String>) map));
        }
        m80115a(context);
    }

    public void onReport(Context context, String str, Map map) {
        if (hasError(context) || map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (!this.f56936b) {
            HmsHiAnalyticsUtils.onEvent(0, str, m80114a((Map<String, String>) map));
            HmsHiAnalyticsUtils.onEvent(1, str, m80114a((Map<String, String>) map));
            HmsHiAnalyticsUtils.onReport();
        } else {
            C18450b.m80085a(context, 0, str, m80114a((Map<String, String>) map));
            C18450b.m80085a(context, 1, str, m80114a((Map<String, String>) map));
            C18450b.m80084a(context, 0);
            C18450b.m80084a(context, 1);
        }
    }

    public void enableLog() {
        HMSLog.m80174i("HiAnalyticsUtils", "Enable Log");
        if (!this.f56936b) {
            HmsHiAnalyticsUtils.enableLog();
        } else {
            HMSLog.m80174i("HiAnalyticsUtils", "cp needs to pass in the context, this method is not supported");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80115a(Context context) {
        synchronized (f56933d) {
            try {
                int i = this.f56935a;
                if (i < 60) {
                    this.f56935a = i + 1;
                } else {
                    this.f56935a = 0;
                    if (!this.f56936b) {
                        HmsHiAnalyticsUtils.onReport();
                    } else {
                        C18450b.m80084a(context, 0);
                        C18450b.m80084a(context, 1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map, int i) {
        if (hasError(context)) {
            return;
        }
        if (i != 0 && i != 1) {
            HMSLog.m80172e("HiAnalyticsUtils", "Data reporting type is not supported");
            return;
        }
        if (map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (!this.f56936b) {
            HmsHiAnalyticsUtils.onEvent(i, str, m80114a((Map<String, String>) map));
        } else {
            C18450b.m80085a(context, i, str, m80114a((Map<String, String>) map));
        }
        m80115a(context);
    }

    public void onReport(Context context, String str, Map map, int i) {
        if (hasError(context)) {
            return;
        }
        if (i != 0 && i != 1) {
            HMSLog.m80172e("HiAnalyticsUtils", "Data reporting type is not supported");
            return;
        }
        if (map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (!this.f56936b) {
            HmsHiAnalyticsUtils.onEvent(i, str, m80114a((Map<String, String>) map));
            HmsHiAnalyticsUtils.onReport();
        } else {
            C18450b.m80085a(context, i, str, m80114a((Map<String, String>) map));
            C18450b.m80084a(context, i);
        }
    }
}
