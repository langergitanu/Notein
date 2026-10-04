package com.google.android.gms.internal.p624firebaseauthapi;

import com.huawei.hms.support.feature.result.CommonConstant;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzaie implements zzafa {
    public static zzaih zzg() {
        return new zzagr();
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CommonConstant.KEY_ID_TOKEN, zzc());
        jSONObject.put(ResponseType.TOKEN, zzf());
        jSONObject.put("providerId", zzd());
        jSONObject.put("tokenType", zzb().toString());
        jSONObject.put("tenantId", zze());
        return jSONObject.toString();
    }

    public abstract zzahg zzb();

    public abstract String zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract String zzf();
}
