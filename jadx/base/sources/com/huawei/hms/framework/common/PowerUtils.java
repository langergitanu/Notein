package com.huawei.hms.framework.common;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes7.dex */
public class PowerUtils {
    private static final String TAG = "PowerUtils";

    public static final class PowerMode {
        static int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static int POWER_SAVER_MODE = 4;
        static String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isAppIdleMode(Context context) {
        if (context == null) {
            Logger.m76963i(TAG, "isAppIdleMode Context is null!");
            return false;
        }
        String packageName = context.getPackageName();
        Object systemService = context.getSystemService("usagestats");
        if (systemService instanceof UsageStatsManager) {
            UsageStatsManager usageStatsManager = (UsageStatsManager) systemService;
            if (usageStatsManager != null) {
                return usageStatsManager.isAppInactive(packageName);
            }
            Logger.m76963i(TAG, "isAppIdleMode statsManager is null!");
        }
        return false;
    }

    public static boolean isDozeIdleMode(Context context) {
        if (context == null) {
            Logger.m76963i(TAG, "isDozeIdleMode Context is null!");
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            Logger.m76963i(TAG, "isDozeIdleMode powerManager is null!");
            return false;
        }
        try {
            return powerManager.isDeviceIdleMode();
        } catch (RuntimeException e) {
            Logger.m76961e(TAG, "dealType rethrowFromSystemServer:", e);
            return false;
        }
    }

    public static boolean isInteractive(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        if (!(systemService instanceof PowerManager)) {
            return false;
        }
        try {
            return ((PowerManager) systemService).isInteractive();
        } catch (RuntimeException e) {
            Logger.m76963i(TAG, "getActiveNetworkInfo failed, exception:" + e.getClass().getSimpleName() + e.getMessage());
            return false;
        }
    }

    public static boolean isWhilteList(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        String packageName = context.getPackageName();
        if (powerManager == null) {
            return false;
        }
        try {
            return powerManager.isIgnoringBatteryOptimizations(packageName);
        } catch (RuntimeException e) {
            Logger.m76961e(TAG, "dealType rethrowFromSystemServer:", e);
            return false;
        }
    }

    public static int readDataSaverMode(Context context) {
        if (context == null) {
            Logger.m76963i(TAG, "readDataSaverMode manager is null!");
            return 0;
        }
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            Logger.m76963i(TAG, "readDataSaverMode Context is null!");
            return 0;
        }
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 0;
        }
        if (connectivityManager.isActiveNetworkMetered()) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        Logger.m76965v(TAG, "ConnectType is not Mobile Network!");
        return 0;
    }

    public static int readPowerSaverMode(Context context) {
        if (context == null) {
            Logger.m76963i(TAG, "readPowerSaverMode Context is null!");
            return 0;
        }
        int systemInt = SettingUtil.getSystemInt(context.getContentResolver(), PowerMode.SMART_MODE_STATUS, PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE);
        if (systemInt != PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE) {
            return systemInt;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return systemInt;
        }
        try {
            return powerManager.isPowerSaveMode() ? PowerMode.POWER_SAVER_MODE : PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE;
        } catch (RuntimeException e) {
            Logger.m76961e(TAG, "dealType rethrowFromSystemServer:", e);
            return systemInt;
        }
    }
}
