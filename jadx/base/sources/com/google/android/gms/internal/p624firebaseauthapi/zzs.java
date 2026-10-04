package com.google.android.gms.internal.p624firebaseauthapi;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
final class zzs implements zzq {
    private zzs() {
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzq
    public final zzl zza(String str) {
        return new zzo(Pattern.compile(str));
    }
}
