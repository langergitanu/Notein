package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzajc implements zzafa {
    private String zza;
    private String zzb;

    public zzajc(String str, String str2) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ResponseType.TOKEN, this.zza);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
