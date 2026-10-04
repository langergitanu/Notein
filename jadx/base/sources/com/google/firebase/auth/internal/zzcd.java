package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcd implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ zzca zza;

    public zzcd(zzca zzcaVar) {
        Objects.requireNonNull(zzcaVar);
        this.zza = zzcaVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        if (z) {
            this.zza.zzc = true;
            this.zza.zza();
        } else {
            this.zza.zzc = false;
            if (this.zza.zzb()) {
                this.zza.zzb.zzc();
            }
        }
    }
}
