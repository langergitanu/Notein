package com.google.android.gms.internal.mlkit_translate;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class zzpg {
    private final zzpc zza;
    private final zzpe zzb = null;
    private final zzpe zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzpg(zzpd zzpdVar, zzpf zzpfVar) {
        this.zza = zzpdVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzpg) && Objects.equal(this.zza, ((zzpg) obj).zza) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, null, null);
    }

    public final zzpc zza() {
        return this.zza;
    }
}
