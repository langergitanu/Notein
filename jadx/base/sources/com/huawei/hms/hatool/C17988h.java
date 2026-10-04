package com.huawei.hms.hatool;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: com.huawei.hms.hatool.h */
/* JADX INFO: loaded from: classes8.dex */
public class C17988h {
    /* JADX INFO: renamed from: a */
    public static String m77339a(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return (str.equalsIgnoreCase("TD-SCDMA") || str.equalsIgnoreCase("WCDMA") || str.equalsIgnoreCase("CDMA2000")) ? "3G" : str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m77340a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            C18030y.m77591f("hmsSdk", "not have network state phone permission!");
            return "";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() == 0) {
            String subtypeName = activeNetworkInfo.getSubtypeName();
            C18030y.m77586c("hmsSdk", "Network getSubtypeName : " + subtypeName);
            return m77339a(activeNetworkInfo.getSubtype(), subtypeName);
        }
        if (activeNetworkInfo.getType() == 16) {
            C18030y.m77591f("hmsSdk", "type name = COMPANION_PROXY");
            return "COMPANION_PROXY";
        }
        if (activeNetworkInfo.getType() == 9) {
            C18030y.m77586c("hmsSdk", "type name = ETHERNET");
            return "ETHERNET";
        }
        C18030y.m77586c("hmsSdk", "type name = " + activeNetworkInfo.getType());
        return "OTHER_NETWORK_TYPE";
    }
}
