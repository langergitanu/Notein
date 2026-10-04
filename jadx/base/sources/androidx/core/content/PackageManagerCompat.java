package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.os.UserManagerCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class PackageManagerCompat {
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    public static final String LOG_TAG = "PackageManagerCompat";

    public static class Api30Impl {
        private Api30Impl() {
        }

        public static boolean areUnusedAppRestrictionsEnabled(Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    public static boolean areUnusedAppRestrictionsAvailable(PackageManager packageManager) {
        int i = Build.VERSION.SDK_INT;
        return (i >= 30) || ((i < 30) && (getPermissionRevocationVerifierApp(packageManager) != null));
    }

    public static String getPermissionRevocationVerifierApp(PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    public static ListenableFuture<Integer> getUnusedAppRestrictionsStatus(Context context) {
        androidx.concurrent.futures.OooO<Integer> oooO = new androidx.concurrent.futures.OooO<>();
        if (!UserManagerCompat.isUserUnlocked(context)) {
            oooO.set(0);
            Log.e(LOG_TAG, "User is in locked direct boot mode");
            return oooO;
        }
        if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            oooO.set(1);
            return oooO;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i < 30) {
            oooO.set(0);
            Log.e(LOG_TAG, "Target SDK version below API 30");
            return oooO;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                oooO.set(Integer.valueOf(i >= 31 ? 5 : 4));
                return oooO;
            }
            oooO.set(2);
            return oooO;
        }
        if (i2 == 30) {
            oooO.set(Integer.valueOf(Api30Impl.areUnusedAppRestrictionsEnabled(context) ? 4 : 2));
            return oooO;
        }
        final UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
        oooO.addListener(new Runnable() { // from class: androidx.core.content.OooOoOO
            @Override // java.lang.Runnable
            public final void run() {
                unusedAppRestrictionsBackportServiceConnection.disconnectFromService();
            }
        }, Executors.newSingleThreadExecutor());
        unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(oooO);
        return oooO;
    }
}
