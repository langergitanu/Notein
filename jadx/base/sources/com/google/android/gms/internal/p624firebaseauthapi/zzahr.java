package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class zzahr implements zzaez<zzahr> {
    private static final String zza = "zzahr";
    private String zzb;

    public zzahr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahr zza(String str) throws zzacn {
        try {
            this.zzb = Strings.emptyToNull(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajk.zza(e, zza, str);
        }
    }

    public zzahr(String str) {
        this.zzb = str;
    }

    public final String zza() {
        return this.zzb;
    }
}
