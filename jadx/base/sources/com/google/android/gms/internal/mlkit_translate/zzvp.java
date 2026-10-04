package com.google.android.gms.internal.mlkit_translate;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzvp {
    private JSONObject zza = new JSONObject();
    private Date zzb = zzvq.zza;
    private JSONArray zzc = new JSONArray();

    private zzvp() {
    }

    public final zzvp zza(JSONObject jSONObject) {
        try {
            this.zza = new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return this;
    }

    public final zzvp zzb(JSONArray jSONArray) {
        try {
            this.zzc = new JSONArray(jSONArray.toString());
        } catch (JSONException unused) {
        }
        return this;
    }

    public final zzvp zzc(Date date) {
        this.zzb = date;
        return this;
    }

    public final zzvq zzd() throws JSONException {
        return new zzvq(this.zza, this.zzb, this.zzc);
    }

    public /* synthetic */ zzvp(zzvo zzvoVar) {
    }
}
