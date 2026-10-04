package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptionsBuilder;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class AGCUtils {
    /* JADX INFO: renamed from: a */
    public static String m75855a(Context context, String str) {
        String string;
        InputStream inputStreamOpen = null;
        try {
            try {
                AGConnectOptionsBuilder aGConnectOptionsBuilder = new AGConnectOptionsBuilder();
                inputStreamOpen = context.getResources().getAssets().open("agconnect-services.json");
                aGConnectOptionsBuilder.setInputStream(inputStreamOpen);
                string = aGConnectOptionsBuilder.build(context).getString(str);
            } catch (IOException e) {
                HMSLog.m80172e("AGCUtils", "Get " + str + " failed: " + e);
                string = "";
            } catch (NullPointerException e2) {
                HMSLog.m80172e("AGCUtils", "Get " + str + " with AGConnectServicesConfig failed: " + e2);
                string = "";
            }
            IOUtils.closeQuietly(inputStreamOpen);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            HMSLog.m80172e("AGCUtils", "The " + str + " is null.");
            return "";
        } catch (Throwable th) {
            IOUtils.closeQuietly(inputStreamOpen);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m75856b(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.m80172e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.huawei.hms.client.cpid")) == null) {
                HMSLog.m80174i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
                return "";
            }
            String strValueOf = String.valueOf(obj);
            return strValueOf.startsWith("cpid=") ? strValueOf.substring(5) : strValueOf;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m80172e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (RuntimeException e) {
            HMSLog.m80173e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m75857c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService());
    }

    public static String getAppId(Context context) {
        String string;
        if (m75857c(context)) {
            string = m75855a(context, "client/app_id");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        } else {
            string = null;
        }
        try {
            AGConnectInstance aGConnectInstance = AGConnectInstance.getInstance();
            if (aGConnectInstance.getContext() != context) {
                aGConnectInstance = AGConnectInstance.buildInstance(new AGConnectOptionsBuilder().build(context));
            }
            string = aGConnectInstance.getOptions().getString("client/app_id");
        } catch (NullPointerException unused) {
            HMSLog.m80172e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM75854a = m75854a(context);
        return !TextUtils.isEmpty(strM75854a) ? strM75854a : m75855a(context, "client/app_id");
    }

    public static String getCpId(Context context) {
        String string;
        if (m75857c(context)) {
            return m75855a(context, "client/cp_id");
        }
        try {
            AGConnectInstance aGConnectInstance = AGConnectInstance.getInstance();
            if (aGConnectInstance.getContext() != context) {
                aGConnectInstance = AGConnectInstance.buildInstance(new AGConnectOptionsBuilder().build(context));
            }
            string = aGConnectInstance.getOptions().getString("client/cp_id");
        } catch (NullPointerException unused) {
            HMSLog.m80172e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
            string = null;
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM75856b = m75856b(context);
        return !TextUtils.isEmpty(strM75856b) ? strM75856b : m75855a(context, "client/cp_id");
    }

    /* JADX INFO: renamed from: a */
    public static String m75854a(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.m80172e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("com.huawei.hms.client.appid")) != null) {
                String strValueOf = String.valueOf(obj);
                return strValueOf.startsWith("appid=") ? strValueOf.substring(6) : strValueOf;
            }
            HMSLog.m80172e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m80172e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (RuntimeException e) {
            HMSLog.m80173e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.", e);
            return "";
        }
    }
}
