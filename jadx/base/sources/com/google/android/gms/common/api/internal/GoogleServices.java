package com.google.android.gms.common.api.internal;

import OooOoo.C20593OooO0Oo;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.C15953R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzah;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class GoogleServices {
    private static final Object zza = new Object();
    private static GoogleServices zzb;
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    public GoogleServices(String str, boolean z) {
        this.zzc = str;
        this.zzd = Status.RESULT_SUCCESS;
        this.zze = z;
        this.zzf = !z;
    }

    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        synchronized (zza) {
            try {
                googleServices = zzb;
                if (googleServices == null) {
                    throw new IllegalStateException("Initialize must be called before " + str + ".");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleServices;
    }

    public static void clearInstanceForTest() {
        synchronized (zza) {
            zzb = null;
        }
    }

    public static String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzc;
    }

    public static Status initialize(Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = new GoogleServices(context);
                }
                status = zzb.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return status;
    }

    public static boolean isMeasurementEnabled() {
        GoogleServices googleServicesCheckInitialized = checkInitialized("isMeasurementEnabled");
        return googleServicesCheckInitialized.zzd.isSuccess() && googleServicesCheckInitialized.zze;
    }

    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    public Status checkGoogleAppId(String str) {
        String str2 = this.zzc;
        return (str2 == null || str2.equals(str)) ? Status.RESULT_SUCCESS : new Status(10, C20593OooO0Oo.OooO0O0("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '", this.zzc, "'."));
    }

    public GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C15953R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z = integer == 0;
            z = integer != 0;
            this.zzf = z;
        } else {
            this.zzf = false;
        }
        this.zze = z;
        String strZzb = zzah.zzb(context);
        strZzb = strZzb == null ? new StringResourceValueReader(context).getString("google_app_id") : strZzb;
        if (TextUtils.isEmpty(strZzb)) {
            this.zzd = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzc = null;
        } else {
            this.zzc = strZzb;
            this.zzd = Status.RESULT_SUCCESS;
        }
    }

    public static Status initialize(Context context, String str, boolean z) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (zza) {
            try {
                GoogleServices googleServices = zzb;
                if (googleServices != null) {
                    return googleServices.checkGoogleAppId(str);
                }
                GoogleServices googleServices2 = new GoogleServices(str, z);
                zzb = googleServices2;
                return googleServices2.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
