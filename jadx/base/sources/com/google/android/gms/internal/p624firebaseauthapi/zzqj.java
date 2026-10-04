package com.google.android.gms.internal.p624firebaseauthapi;

import Oooo0oO.o0Oo0oo;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzqj {
    private final Class<?> zza;
    private final Class<? extends zzqf> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqj)) {
            return false;
        }
        zzqj zzqjVar = (zzqj) obj;
        return zzqjVar.zza.equals(this.zza) && zzqjVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return o0Oo0oo.OooO0Oo(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }

    private zzqj(Class<?> cls, Class<? extends zzqf> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
