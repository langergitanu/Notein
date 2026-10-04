package com.google.android.gms.internal.p624firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.util.Strings;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class zzajh implements zzaez<zzajh> {
    private static final String zza = "zzajh";
    private String zzb;
    private String zzc;
    private long zzd;
    private List<zzahy> zze;
    private String zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajh zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Strings.emptyToNull(jSONObject.optString("localId", null));
            Strings.emptyToNull(jSONObject.optString("email", null));
            Strings.emptyToNull(jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME, null));
            this.zzb = Strings.emptyToNull(jSONObject.optString(CommonConstant.KEY_ID_TOKEN, null));
            Strings.emptyToNull(jSONObject.optString("photoUrl", null));
            this.zzc = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = zzahy.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzf = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajk.zza(e, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List<zzahy> zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzf);
    }

    public final String zzb() {
        return this.zzb;
    }
}
