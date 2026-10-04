package com.google.android.gms.internal.mlkit_translate;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes7.dex */
final class zzg extends zze {
    private final Object zza;

    public zzg(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzg) {
            return this.zza.equals(((zzg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return C20593OooO0Oo.OooO0O0("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zze
    public final boolean zza() {
        return true;
    }
}
