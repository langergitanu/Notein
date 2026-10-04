package com.microsoft.identity.common.internal.platform;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.platform.AbstractDeviceMetadata;

/* JADX INFO: loaded from: classes9.dex */
public class AndroidDeviceMetadata extends AbstractDeviceMetadata {
    private static final String ANDROID_DEVICE_TYPE = "Android";
    private static final String DEVICE_TYPE = "DeviceType";
    private static final String MOBILE_DEVICE = "mobileDevice";
    private static final String TAG = "AndroidDeviceMetadata";
    private static final String UNKNOWN_DEVICE = "unknown";

    public static String getAndroidDeviceTypeFromMetadata(Context context) {
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, " :getDeviceType");
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(DEVICE_TYPE, MOBILE_DEVICE);
            Logger.verbose(strOooO0OO, "Setting the deviceType as " + string);
            return string;
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.warn(strOooO0OO, "Unable to find the app's package name from PackageManager.");
            return "unknown";
        }
    }

    @Override // com.microsoft.identity.common.java.platform.IDeviceMetadata
    public String getCpu() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return (strArr == null || strArr.length <= 0) ? GrsBaseInfo.CountryCodeSource.UNKNOWN : strArr[0];
    }

    @Override // com.microsoft.identity.common.java.platform.IDeviceMetadata
    public String getDeviceModel() {
        return Build.MODEL;
    }

    @Override // com.microsoft.identity.common.java.platform.IDeviceMetadata
    public String getDeviceType() {
        return "Android";
    }

    @Override // com.microsoft.identity.common.java.platform.IDeviceMetadata
    public String getManufacturer() {
        return Build.MANUFACTURER;
    }

    @Override // com.microsoft.identity.common.java.platform.IDeviceMetadata
    public String getOsForDrs() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.microsoft.identity.common.java.platform.IDeviceMetadata
    public String getOsForEsts() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @Override // com.microsoft.identity.common.java.platform.IDeviceMetadata
    public String getOsForMats() {
        return Build.VERSION.RELEASE;
    }
}
