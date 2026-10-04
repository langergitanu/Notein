package com.huawei.hms.stats;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: renamed from: com.huawei.hms.stats.a */
/* JADX INFO: loaded from: classes9.dex */
public class C18449a {

    /* JADX INFO: renamed from: a */
    public static int f56878a;

    /* JADX INFO: renamed from: b */
    public static final Object f56879b = new Object();

    /* JADX INFO: renamed from: a */
    public static boolean m80080a(Context context) {
        Bundle bundle;
        if (context == null) {
            HMSLog.m80172e("AnalyticsSwitchHolder", "In getBiIsReportSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bireport.setting");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.m80172e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.");
            } catch (RuntimeException e) {
                HMSLog.m80173e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.", e);
            }
        }
        HMSLog.m80174i("AnalyticsSwitchHolder", "In getBiIsReportSetting, configuration not found for bi report setting.");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m80081b(Context context) {
        Bundle bundle;
        if (context == null) {
            HMSLog.m80172e("AnalyticsSwitchHolder", "In getBiSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bi.setting");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.m80172e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.");
            } catch (RuntimeException e) {
                HMSLog.m80173e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.", e);
            }
        }
        HMSLog.m80174i("AnalyticsSwitchHolder", "In getBiSetting, configuration not found for bisetting.");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m80082c(Context context) {
        synchronized (f56879b) {
            try {
                boolean z = true;
                if (f56878a == 0) {
                    if (context == null) {
                        return true;
                    }
                    if (m80080a(context)) {
                        HMSLog.m80174i("AnalyticsSwitchHolder", "Builder->biReportSetting :true");
                        f56878a = 1;
                    } else if (m80081b(context)) {
                        HMSLog.m80174i("AnalyticsSwitchHolder", "Builder->biSetting :true");
                        f56878a = 2;
                    } else if ("CN".equalsIgnoreCase(GrsApp.getInstance().getIssueCountryCode(context))) {
                        f56878a = 1;
                    } else {
                        HMSLog.m80174i("AnalyticsSwitchHolder", "not ChinaROM");
                        try {
                            int i = Settings.Secure.getInt(context.getContentResolver(), "hw_app_analytics_state");
                            HMSLog.m80174i("AnalyticsSwitchHolder", "hw_app_analytics_state value is " + i);
                            if (i == 1) {
                                f56878a = 1;
                            } else {
                                f56878a = 2;
                            }
                        } catch (Settings.SettingNotFoundException unused) {
                            HMSLog.m80174i("AnalyticsSwitchHolder", "Get OOBE failed");
                            f56878a = 2;
                        }
                    }
                }
                if (f56878a == 1) {
                    z = false;
                }
                return z;
            } finally {
            }
        }
    }
}
