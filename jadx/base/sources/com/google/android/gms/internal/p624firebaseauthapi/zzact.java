package com.google.android.gms.internal.p624firebaseauthapi;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzav;

/* JADX INFO: loaded from: classes7.dex */
final class zzact extends zzaff<Void, zzav> {
    public zzact() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final String zza() {
        return RequestParameters.SUBRESOURCE_DELETE;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaff
    public final void zzb() {
        ((zzav) this.zze).zza();
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzd.zze(), this.zzb);
    }
}
