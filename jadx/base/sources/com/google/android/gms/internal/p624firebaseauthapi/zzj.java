package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes7.dex */
final class zzj extends zzk {
    static final zzf zza = new zzj();

    private zzj() {
        super("CharMatcher.none()");
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzf
    public final boolean zza(char c) {
        return false;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzf
    public final int zza(CharSequence charSequence, int i) {
        zzu.zza(i, charSequence.length(), FirebaseAnalytics.Param.INDEX);
        return -1;
    }
}
