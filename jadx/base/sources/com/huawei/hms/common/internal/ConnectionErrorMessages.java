package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.p589ui.NotInstalledHmsDialogHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* JADX INFO: loaded from: classes6.dex */
public class ConnectionErrorMessages {
    public static String getErrorDialogButtonMessage(Activity activity, int i) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        return ResourceLoaderUtil.getString("hms_confirm");
    }

    public static String getErrorMessage(Activity activity, int i) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i == 1 || i == 2) {
            return activity.getString(ResourceLoaderUtil.getStringId("hms_apk_not_installed_hints"), NotInstalledHmsDialogHelper.getAppName(activity));
        }
        return null;
    }

    public static String getErrorTitle(Activity activity, int i) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3) {
            return ResourceLoaderUtil.getString("hms_bindfaildlg_message");
        }
        if (i == 9) {
            HMSLog.m80172e("HuaweiApiAvailability", "Huawei Mobile Services is invalid. Cannot recover.");
            return null;
        }
        HMSLog.m80172e("HuaweiApiAvailability", "Unexpected error code " + i);
        return null;
    }
}
