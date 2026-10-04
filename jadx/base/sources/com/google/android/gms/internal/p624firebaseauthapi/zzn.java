package com.google.android.gms.internal.p624firebaseauthapi;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes7.dex */
final class zzn extends zzm {
    private final Matcher zza;

    public zzn(Matcher matcher) {
        this.zza = (Matcher) zzu.zza(matcher);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzm
    public final int zza() {
        return this.zza.end();
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzm
    public final int zzb() {
        return this.zza.start();
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzm
    public final boolean zzc() {
        return this.zza.matches();
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzm
    public final boolean zza(int i) {
        return this.zza.find(i);
    }
}
