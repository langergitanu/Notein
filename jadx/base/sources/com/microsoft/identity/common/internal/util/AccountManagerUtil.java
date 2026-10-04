package com.microsoft.identity.common.internal.util;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.UserManager;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.logging.Logger;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class AccountManagerUtil {
    private static final String MANIFEST_PERMISSION_MANAGE_ACCOUNTS = "android.permission.MANAGE_ACCOUNTS";
    private static final String TAG = "AccountManagerUtil";

    private AccountManagerUtil() {
    }

    public static boolean canUseAccountManagerOperation(Context context, Set<String> set) {
        String[] accountTypesWithManagementDisabled;
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":canUseAccountManagerOperation:");
        if (((UserManager) context.getSystemService("user")).hasUserRestriction("no_modify_accounts")) {
            Logger.verbose(strOooO0OO, "UserManager.DISALLOW_MODIFY_ACCOUNTS is enabled for this user.");
            return false;
        }
        DevicePolicyManager devicePolicyManager = getDevicePolicyManager(context);
        if (devicePolicyManager == null || (accountTypesWithManagementDisabled = devicePolicyManager.getAccountTypesWithManagementDisabled()) == null) {
            return true;
        }
        for (String str : accountTypesWithManagementDisabled) {
            if (set.contains(str)) {
                Logger.info(strOooO0OO, "Account type " + str + " is disabled by MDM.");
                return false;
            }
        }
        return true;
    }

    private static DevicePolicyManager getDevicePolicyManager(Context context) {
        try {
            return (DevicePolicyManager) context.getSystemService("device_policy");
        } catch (Throwable unused) {
            Logger.verbose(OooO00o.OooO0OO(new StringBuilder(), TAG, ":getDevicePolicyManager"), "Cannot get DevicePolicyManager.");
            return null;
        }
    }

    public static boolean isPermissionGranted(Context context, String str) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":isPermissionGranted");
        boolean z = context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        Logger.verbose(strOooO0OO, "is " + str + " granted? [" + z + "]");
        return z;
    }
}
