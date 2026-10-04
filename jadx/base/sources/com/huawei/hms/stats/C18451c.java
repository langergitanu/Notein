package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: renamed from: com.huawei.hms.stats.c */
/* JADX INFO: loaded from: classes9.dex */
public class C18451c {

    /* JADX INFO: renamed from: a */
    public static final Object f56881a = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean f56882b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f56883c = false;

    /* JADX INFO: renamed from: a */
    public static boolean m80087a() {
        synchronized (f56881a) {
            if (!f56882b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                    HMSLog.m80174i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                }
                f56882b = true;
                HMSLog.m80174i("HianalyticsExist", "hianalytics exist: " + f56883c);
            }
        }
        return f56883c;
    }
}
