package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb = new Object();
    private static Method zzc = null;
    private static boolean zzd = false;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, Intent intent);

        void onProviderInstalled();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:37:0x0015, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x0027, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:37:0x0015, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: all -> 0x0027, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:37:0x0015, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void installIfNeeded(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context moduleContext;
        Context remoteContext;
        Preconditions.checkNotNull(context, "Context must not be null");
        zza.verifyGooglePlayServicesIsAvailable(context, 11925000);
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (zzb) {
            Context context2 = null;
            if (!zzd) {
                try {
                    moduleContext = DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
                } catch (DynamiteModule.LoadingException e) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                    moduleContext = null;
                }
                if (moduleContext != null) {
                    zzb(moduleContext, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
                boolean z = zzd;
                remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                if (remoteContext == null) {
                    zzd = true;
                    if (!z) {
                        try {
                            zzl.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", remoteContext.getClassLoader(), zzj.zzb(Context.class, context), zzi.zza(jUptimeMillis), zzi.zza(SystemClock.uptimeMillis()));
                        } catch (Exception e2) {
                            Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                        }
                    }
                    context2 = remoteContext;
                }
                if (context2 == null) {
                    zzb(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            }
            boolean z2 = zzd;
            remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
            }
            if (context2 == null) {
            }
        }
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    private static void zzb(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            zzc.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
