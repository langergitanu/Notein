package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.aspose.slides.internal.p407st.OooO00o;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p624firebaseauthapi.zzcl;
import com.google.android.gms.internal.p624firebaseauthapi.zzco;
import com.google.android.gms.internal.p624firebaseauthapi.zzcv;
import com.google.android.gms.internal.p624firebaseauthapi.zzmy;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzby {
    private static zzby zza;
    private final String zzb;
    private final zzmy zzc;

    private zzby(String str, zzmy zzmyVar) {
        this.zzb = str;
        this.zzc = zzmyVar;
    }

    public static zzby zza(Context context, String str) {
        zzby zzbyVar = zza;
        if (zzbyVar == null || !Objects.equals(zzbyVar.zzb, str)) {
            zza = new zzby(str, zzc(context, str));
        }
        return zza;
    }

    private static zzmy zzb(Context context, String str) throws GeneralSecurityException, IOException {
        return new zzmy.zza().zza(context, "StorageCryptoKeyset", zzc(str)).zza(zzcv.zzb).zza("android-keystore://firebear_main_key_id_for_storage_crypto." + str).zza();
    }

    private static zzmy zzc(Context context, String str) {
        try {
            zzcl.zza();
            return zzb(context, str);
        } catch (IOException | GeneralSecurityException e) {
            OooO00o.OooO0O0("Exception encountered during crypto setup:\n", e.getMessage(), "FirebearStorageCryptoHelper");
            if (e instanceof GeneralSecurityException) {
                context.getSharedPreferences(zzc(str), 0).edit().remove("StorageCryptoKeyset").apply();
                try {
                    return zzb(context, str);
                } catch (IOException | GeneralSecurityException e2) {
                    OooO00o.OooO0O0("Exception encountered during second attempt to crypto setup:\n", e2.getMessage(), "FirebearStorageCryptoHelper");
                    return null;
                }
            }
            return null;
        }
    }

    public final String zza(String str) {
        String str2;
        Preconditions.checkNotNull(str);
        zzmy zzmyVar = this.zzc;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((com.google.android.gms.internal.p624firebaseauthapi.zzba) this.zzc.zza().zza(zzco.zza(), com.google.android.gms.internal.p624firebaseauthapi.zzba.class)).zza(Base64.decode(str, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e) {
            OooO00o.OooO0O0("Exception encountered while decrypting bytes:\n", e.getMessage(), "FirebearStorageCryptoHelper");
            return null;
        }
    }

    public final String zzb(String str) {
        String strEncodeToString;
        Preconditions.checkNotNull(str);
        zzmy zzmyVar = this.zzc;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                strEncodeToString = Base64.encodeToString(((com.google.android.gms.internal.p624firebaseauthapi.zzba) this.zzc.zza().zza(zzco.zza(), com.google.android.gms.internal.p624firebaseauthapi.zzba.class)).zzb(str.getBytes(StandardCharsets.UTF_8), null), 2);
            }
            return strEncodeToString;
        } catch (GeneralSecurityException e) {
            OooO00o.OooO0O0("Exception encountered while encrypting bytes:\n", e.getMessage(), "FirebearStorageCryptoHelper");
            return null;
        }
    }

    private static String zzc(String str) {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("com.google.firebase.auth.api.crypto.", str);
    }
}
