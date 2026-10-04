package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzahj implements zzafa {
    private String zza = zzahh.REFRESH_TOKEN.toString();
    private String zzb;

    public zzahj(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
