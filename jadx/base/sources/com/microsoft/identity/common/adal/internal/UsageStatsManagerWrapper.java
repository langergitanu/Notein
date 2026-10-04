package com.microsoft.identity.common.adal.internal;

import android.app.usage.UsageStatsManager;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class UsageStatsManagerWrapper {
    private static UsageStatsManagerWrapper sInstance;

    public static synchronized UsageStatsManagerWrapper getInstance() {
        try {
            if (sInstance == null) {
                sInstance = new UsageStatsManagerWrapper();
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    public static synchronized void setInstance(UsageStatsManagerWrapper usageStatsManagerWrapper) {
        sInstance = usageStatsManagerWrapper;
    }

    public boolean isAppInactive(Context context) {
        return ((UsageStatsManager) context.getSystemService("usagestats")).isAppInactive(context.getPackageName());
    }
}
