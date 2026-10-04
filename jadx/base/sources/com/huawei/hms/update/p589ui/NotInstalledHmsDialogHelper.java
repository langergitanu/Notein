package com.huawei.hms.update.p589ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* JADX INFO: loaded from: classes9.dex */
public class NotInstalledHmsDialogHelper {
    /* JADX INFO: renamed from: a */
    public static int m80184a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m80186b(Context context) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context.getApplicationContext());
        }
    }

    public static String getAppName(Activity activity) {
        return m80185a(activity, activity.getPackageName());
    }

    public static int getConfirmResId(Activity activity) {
        Checker.checkNonNull(activity, "activity must not be null");
        m80186b(activity);
        return ResourceLoaderUtil.getStringId("hms_confirm");
    }

    public static AlertDialog.Builder getDialogBuilder(Activity activity) {
        Checker.checkNonNull(activity, "activity must not be null");
        m80186b(activity);
        return new AlertDialog.Builder(activity, getDialogThemeId(activity)).setMessage(activity.getString(ResourceLoaderUtil.getStringId("hms_apk_not_installed_hints"), m80185a(activity, activity.getPackageName())));
    }

    public static int getDialogThemeId(Activity activity) {
        if (m80184a(activity) != 0) {
            return 0;
        }
        return (activity != null && (activity.getResources().getConfiguration().uiMode & 48) == 32) ? 2 : 3;
    }

    /* JADX INFO: renamed from: a */
    public static String m80185a(Context context, String str) {
        if (context == null) {
            HMSLog.m80172e("NotInstalledHmsDialogHelper", "In getAppName, context is null.");
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.m80172e("NotInstalledHmsDialogHelper", "In getAppName, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = context.getPackageName();
            }
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128));
            return applicationLabel == null ? "" : applicationLabel.toString();
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.m80172e("NotInstalledHmsDialogHelper", "In getAppName, Failed to get app name.");
            return "";
        }
    }
}
