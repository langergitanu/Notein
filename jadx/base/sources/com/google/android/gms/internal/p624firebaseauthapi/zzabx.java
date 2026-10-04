package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzabx implements zzafv<zzait> {
    private final /* synthetic */ zzael zza;

    public zzabx(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzait zzaitVar) {
        this.zza.zzb(zzaitVar.zza());
    }
}
