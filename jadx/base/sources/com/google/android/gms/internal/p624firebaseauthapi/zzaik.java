package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class zzaik implements zzaez<zzaik> {
    private static final String zza = "zzaik";
    private String zzb;
    private zzaia zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaik zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("email"));
            Strings.emptyToNull(jSONObject.optString("passwordHash"));
            jSONObject.optBoolean("emailVerified", false);
            Strings.emptyToNull(jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME));
            Strings.emptyToNull(jSONObject.optString("photoUrl"));
            this.zzc = zzaia.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = Strings.emptyToNull(jSONObject.optString(CommonConstant.KEY_ID_TOKEN));
            this.zze = Strings.emptyToNull(jSONObject.optString("refreshToken"));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajk.zza(e, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzaib> zze() {
        zzaia zzaiaVar = this.zzc;
        if (zzaiaVar != null) {
            return zzaiaVar.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
