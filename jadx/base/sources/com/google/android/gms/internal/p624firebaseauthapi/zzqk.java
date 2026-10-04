package com.google.android.gms.internal.p624firebaseauthapi;

import Oooo0oO.o0Oo0oo;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzqk {
    private final Class<? extends zzqf> zza;
    private final zzaaj zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqk)) {
            return false;
        }
        zzqk zzqkVar = (zzqk) obj;
        return zzqkVar.zza.equals(this.zza) && zzqkVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return o0Oo0oo.OooO0Oo(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }

    private zzqk(Class<? extends zzqf> cls, zzaaj zzaajVar) {
        this.zza = cls;
        this.zzb = zzaajVar;
    }
}
