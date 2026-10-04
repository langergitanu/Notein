package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzaav implements zzafv<zzahv> {
    private final /* synthetic */ EmailAuthCredential zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzael zzc;
    private final /* synthetic */ zzaar zzd;

    public zzaav(zzaar zzaarVar, EmailAuthCredential emailAuthCredential, String str, zzael zzaelVar) {
        this.zza = emailAuthCredential;
        this.zzb = str;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzd = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzc.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        this.zzd.zza(new zzagx(this.zza, zzahvVar.zzc(), this.zzb), this.zzc);
    }
}
