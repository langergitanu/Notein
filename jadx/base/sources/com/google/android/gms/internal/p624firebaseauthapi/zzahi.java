package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzahi implements zzafa {
    private String zza;

    public zzahi(String str) {
        this.zza = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CommonConstant.KEY_ID_TOKEN, this.zza);
        return jSONObject.toString();
    }
}
