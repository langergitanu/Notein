package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzam();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzan(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public static com.google.android.gms.internal.p624firebaseauthapi.zzah<zzan> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return com.google.android.gms.internal.p624firebaseauthapi.zzah.zzg();
        }
        com.google.android.gms.internal.p624firebaseauthapi.zzak zzakVarZzf = com.google.android.gms.internal.p624firebaseauthapi.zzah.zzf();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            zzakVarZzf.zza(new zzan(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString(CommonConstant.KEY_DISPLAY_NAME)));
        }
        return zzakVarZzf.zza();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static final zzan zza(JSONObject jSONObject) throws JSONException {
        return new zzan(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString(CommonConstant.KEY_DISPLAY_NAME));
    }

    public static final JSONObject zza(zzan zzanVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", zzanVar.zza);
        jSONObject.put("name", zzanVar.zzb);
        jSONObject.put(CommonConstant.KEY_DISPLAY_NAME, zzanVar.zzc);
        return jSONObject;
    }
}
