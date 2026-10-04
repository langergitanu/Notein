package com.microsoft.identity.common.adal.internal;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes9.dex */
public class PowerManagerWrapper {
    private static PowerManagerWrapper sInstance;

    public static synchronized PowerManagerWrapper getInstance() {
        try {
            if (sInstance == null) {
                sInstance = new PowerManagerWrapper();
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    public static void setInstance(PowerManagerWrapper powerManagerWrapper) {
        sInstance = powerManagerWrapper;
    }

    public boolean isDeviceIdleMode(Context context) {
        return ((PowerManager) context.getSystemService("power")).isDeviceIdleMode();
    }

    public boolean isIgnoringBatteryOptimizations(Context context) {
        return ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
    }
}
