package com.google.android.gms.internal.p624firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* JADX INFO: loaded from: classes7.dex */
public final class zzafw {
    public static zzajg zza(PhoneAuthCredential phoneAuthCredential) {
        return !TextUtils.isEmpty(phoneAuthCredential.zzd()) ? zzajg.zzb(phoneAuthCredential.zzb(), phoneAuthCredential.zzd(), phoneAuthCredential.zze()) : zzajg.zza(phoneAuthCredential.zzc(), phoneAuthCredential.getSmsCode(), phoneAuthCredential.zze());
    }
}
