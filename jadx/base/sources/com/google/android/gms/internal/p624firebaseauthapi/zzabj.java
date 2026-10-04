package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzabj implements zzafv<zzahv> {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ zzajg zzb;
    private final /* synthetic */ zzael zzc;

    public zzabj(zzaar zzaarVar, zzajg zzajgVar, zzael zzaelVar) {
        this.zzb = zzajgVar;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzc.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        this.zzb.zza(zzahvVar.zzc());
        this.zza.zza.zza(this.zzb, new zzabm(this, this.zzc, this));
    }
}
