package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.aspose.slides.internal.p407st.OooO00o;
import com.google.android.gms.internal.p624firebaseauthapi.zzks;
import com.google.android.gms.internal.p624firebaseauthapi.zzkt;
import com.google.android.gms.internal.p624firebaseauthapi.zzlh;
import com.google.android.gms.internal.p624firebaseauthapi.zzmy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzq {
    private static zzq zza;
    private final String zzb;
    private final zzmy zzc;

    private zzq(Context context, String str, boolean z) {
        zzmy zzmyVarZza;
        this.zzb = str;
        try {
            zzkt.zza();
            zzmy.zza zzaVarZza = new zzmy.zza().zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzlh.zza);
            zzaVarZza.zza("android-keystore://firebear_master_key_id." + str);
            zzmyVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e) {
            OooO00o.OooO0O0("Exception encountered during crypto setup:\n", e.getMessage(), "FirebearCryptoHelper");
            zzmyVarZza = null;
        }
        this.zzc = zzmyVarZza;
    }

    public static zzq zza(Context context, String str) {
        zzq zzqVar = zza;
        if (zzqVar == null || !Objects.equals(zzqVar.zzb, str)) {
            zza = new zzq(context, str, true);
        }
        return zza;
    }

    public final String zza(String str) {
        String str2;
        zzmy zzmyVar = this.zzc;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((com.google.android.gms.internal.p624firebaseauthapi.zzbd) this.zzc.zza().zza(zzks.zza(), com.google.android.gms.internal.p624firebaseauthapi.zzbd.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            OooO00o.OooO0O0("Exception encountered while decrypting bytes:\n", e.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }

    public final String zza() {
        if (this.zzc == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.internal.p624firebaseauthapi.zzby zzbyVarZza = com.google.android.gms.internal.p624firebaseauthapi.zzbc.zza(byteArrayOutputStream);
        try {
            synchronized (this.zzc) {
                this.zzc.zza().zzb().zza(zzbyVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            OooO00o.OooO0O0("Exception encountered when attempting to get Public Key:\n", e.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }
}
