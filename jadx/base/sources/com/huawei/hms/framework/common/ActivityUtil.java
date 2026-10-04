package com.huawei.hms.framework.common;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.network.embedded.C18361t4;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ActivityUtil {
    private static final String TAG = "ActivityUtil";

    public static PendingIntent getActivities(Context context, int i, Intent[] intentArr, int i2) {
        if (context == null) {
            Logger.m76967w(TAG, "context is null");
            return null;
        }
        try {
            return PendingIntent.getActivities(context, i, intentArr, i2);
        } catch (RuntimeException e) {
            Logger.m76961e(TAG, "dealType rethrowFromSystemServer:", e);
            return null;
        }
    }

    public static boolean isForeground(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null || (activityManager = (ActivityManager) ContextCompat.getSystemService(context, C18361t4.f56218b)) == null) {
            return false;
        }
        try {
            runningAppProcesses = activityManager.getRunningAppProcesses();
        } catch (RuntimeException e) {
            Logger.m76968w(TAG, "activityManager getRunningAppProcesses occur exception: ", e);
            runningAppProcesses = null;
        }
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            String str = runningAppProcessInfo.processName;
            if (str != null && str.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                Logger.m76965v(TAG, "isForeground true");
                return true;
            }
        }
        return false;
    }
}
