package com.huawei.stylus.penengine;

import android.content.Context;
import android.util.Log;
import com.huawei.penkit.impl.KitManager;
import com.huawei.stylus.penengine.version.IVersionInfo;
import java.util.Optional;

/* JADX INFO: loaded from: classes9.dex */
public class HwPenEngineManager {
    private static final String KIT_MANAGER = "com.huawei.penkit.impl.KitManager";
    private static final String TAG = "HwPenEngineManager";

    private HwPenEngineManager() {
    }

    private static Optional<VersionInfo> getVersionInfo(KitManager kitManager) {
        IVersionInfo versionInfo;
        if (kitManager != null && (versionInfo = kitManager.getVersionInfo()) != null) {
            return Optional.ofNullable(new VersionInfo(versionInfo));
        }
        return Optional.empty();
    }

    public static boolean isEngineRuntimeAvailable(Context context) {
        if (context != null && VersionInfo.isKitRuntimeAvailable(context)) {
            try {
                Class.forName(KIT_MANAGER);
                VersionInfo versionInfo = getVersionInfo(new KitManager(context)).get();
                if (versionInfo != null && versionInfo.isAllCompatible()) {
                    return true;
                }
            } catch (ClassNotFoundException unused) {
                Log.i(TAG, "KitManager is unavailable");
                return false;
            }
        }
        return false;
    }
}
