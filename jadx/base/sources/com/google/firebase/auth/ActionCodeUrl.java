package com.google.firebase.auth;

import android.net.Uri;
import com.aspose.words.OooO0OO;
import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class ActionCodeUrl {
    private static final com.google.android.gms.internal.p624firebaseauthapi.zzal<String, Integer> zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    static {
        HashMap map = new HashMap();
        OooO0OO.OooO0O0(2, map, "recoverEmail", 0, "resetPassword");
        OooO0OO.OooO0O0(4, map, "signIn", 1, "verifyEmail");
        OooO0OO.OooO0O0(5, map, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        zza = com.google.android.gms.internal.p624firebaseauthapi.zzal.zza(map);
    }

    private ActionCodeUrl(String str) {
        String strZza = zza(str, "apiKey");
        String strZza2 = zza(str, "oobCode");
        String strZza3 = zza(str, "mode");
        if (strZza == null || strZza2 == null || strZza3 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        this.zzb = Preconditions.checkNotEmpty(strZza);
        this.zzc = Preconditions.checkNotEmpty(strZza2);
        this.zzd = Preconditions.checkNotEmpty(strZza3);
        this.zze = zza(str, "continueUrl");
        this.zzf = zza(str, CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL);
        this.zzg = zza(str, "tenantId");
    }

    public static ActionCodeUrl parseLink(String str) {
        Preconditions.checkNotEmpty(str);
        try {
            return new ActionCodeUrl(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String getApiKey() {
        return this.zzb;
    }

    public String getCode() {
        return this.zzc;
    }

    public String getContinueUrl() {
        return this.zze;
    }

    public String getLanguageCode() {
        return this.zzf;
    }

    public int getOperation() {
        com.google.android.gms.internal.p624firebaseauthapi.zzal<String, Integer> zzalVar = zza;
        if (zzalVar.containsKey(this.zzd)) {
            return zzalVar.get(this.zzd).intValue();
        }
        return 3;
    }

    public final String zza() {
        return this.zzg;
    }

    private static String zza(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(Preconditions.checkNotEmpty(uri.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
