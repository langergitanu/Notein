package com.huawei.stylus.penengine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.huawei.stylus.penengine.version.IVersionInfo;

/* JADX INFO: loaded from: classes9.dex */
final class VersionInfo {
    private static final int CURRENT_SDK_VERSIONCODE = 110000300;
    private static final String CURRENT_SDK_VERSIONNAME = "11.0.0.300";
    private static final String HUAWEI_PENKIT_RUNTIME_PACKAGE_NAME = "com.huawei.featurelayer.sharedfeature.stylus";
    private static final String TAG = "VersionInfo";
    private IVersionInfo versionInfo;

    public VersionInfo(IVersionInfo iVersionInfo) {
        this.versionInfo = iVersionInfo;
    }

    private IVersionInfo getObject() {
        return this.versionInfo;
    }

    public static boolean isKitRuntimeAvailable(Context context) {
        if (context == null) {
            Log.e(TAG, "isKitRuntimeAvailable fail, context is null");
            return false;
        }
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "PenKit is NOT installed on this device!");
        }
        return context.getPackageManager().getPackageInfo(HUAWEI_PENKIT_RUNTIME_PACKAGE_NAME, 0) != null;
    }

    private boolean isVersionCompatible(String str, int i) {
        if (getObject() != null) {
            return getObject().isVersionCompatible(str, i);
        }
        Log.e(TAG, "SDK is NOT compatible with Runtime !");
        return false;
    }

    public boolean isAllCompatible() {
        return isVersionCompatible("11.0.0.300", 110000300);
    }
}
