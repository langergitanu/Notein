package com.microsoft.identity.common.internal.telemetry;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.OooO00o;
import androidx.core.content.p003pm.PackageInfoCompat;
import com.microsoft.identity.common.java.telemetry.AbstractTelemetryContext;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class AndroidTelemetryContext extends AbstractTelemetryContext {
    private static final String TAG = "AndroidTelemetryContext";

    public AndroidTelemetryContext(Context context) {
        super(new AndroidTelemetryPropertiesCache(context));
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
        addApplicationInfo(context);
        addDeviceInfo(Build.MANUFACTURER, Build.MODEL, Build.DEVICE);
        addOsInfo();
    }

    private void addApplicationInfo(Context context) {
        String str;
        String string;
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":addApplicationInfo");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            long longVersionCode = PackageInfoCompat.getLongVersionCode(packageInfo);
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                str = applicationInfo.packageName;
                int i = applicationInfo.labelRes;
                if (i == 0) {
                    CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                    if (charSequence != null) {
                        string = charSequence.toString();
                    }
                } else {
                    string = context.getString(i);
                }
                super.addApplicationInfo(str, string, packageInfo.versionName, String.valueOf(longVersionCode));
            }
            str = "";
            string = str;
            super.addApplicationInfo(str, string, packageInfo.versionName, String.valueOf(longVersionCode));
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.warn(strOooO0OO, "Unable to find the app's package name from PackageManager.");
        }
    }

    private void addOsInfo() {
        super.addOsInfo(TelemetryEventStrings.C18741Os.OS_NAME, Build.VERSION.RELEASE);
        put(TelemetryEventStrings.C18741Os.SECURITY_PATCH, Build.VERSION.SECURITY_PATCH);
    }

    public void isNetworkConnected(boolean z) {
        put(TelemetryEventStrings.Key.NETWORK_CONNECTION, String.valueOf(z));
    }

    public void isNetworkDisabledFromOptimizations(boolean z) {
        put(TelemetryEventStrings.Key.POWER_OPTIMIZATION, String.valueOf(z));
    }
}
