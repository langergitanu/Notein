package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzabu implements zzafv<zzajd> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzabu(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajd zzajdVar) {
        zzajd zzajdVar2 = zzajdVar;
        if (!zzajdVar2.zzl()) {
            zzaar.zza(this.zzb, zzajdVar2, this.zza, this);
        } else {
            this.zza.zza(new zzaas(zzajdVar2.zzf(), zzajdVar2.zzk(), zzajdVar2.zzb()));
        }
    }
}
