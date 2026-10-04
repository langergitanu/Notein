package com.google.android.gms.internal.p624firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
final class zzo extends zzl implements Serializable {
    private final Pattern zza;

    public zzo(Pattern pattern) {
        this.zza = (Pattern) zzu.zza(pattern);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzl
    public final zzm zza(CharSequence charSequence) {
        return new zzn(this.zza.matcher(charSequence));
    }
}
