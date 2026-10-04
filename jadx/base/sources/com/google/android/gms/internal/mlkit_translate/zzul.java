package com.google.android.gms.internal.mlkit_translate;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: loaded from: classes7.dex */
final class zzul extends zzus {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzul(String str, boolean z, int i, zzuk zzukVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzus) {
            zzus zzusVar = (zzus) obj;
            if (this.zza.equals(zzusVar.zzb()) && this.zzb == zzusVar.zzc() && this.zzc == zzusVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.zza);
        sb.append(", enableFirelog=");
        sb.append(this.zzb);
        sb.append(", firelogEventType=");
        return C21023OooO0Oo.OooO0OO("}", this.zzc, sb);
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzus
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzus
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzus
    public final boolean zzc() {
        return this.zzb;
    }
}
