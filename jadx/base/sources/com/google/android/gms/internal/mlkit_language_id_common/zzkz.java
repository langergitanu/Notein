package com.google.android.gms.internal.mlkit_language_id_common;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: loaded from: classes7.dex */
final class zzkz extends zzlc {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzkz(String str, boolean z, int i, zzky zzkyVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzlc) {
            zzlc zzlcVar = (zzlc) obj;
            if (this.zza.equals(zzlcVar.zzb()) && this.zzb == zzlcVar.zzc() && this.zzc == zzlcVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        boolean z = this.zzb;
        int i = this.zzc;
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(str);
        sb.append(", enableFirelog=");
        sb.append(z);
        sb.append(", firelogEventType=");
        return C21023OooO0Oo.OooO0OO("}", i, sb);
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzlc
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzlc
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzlc
    public final boolean zzc() {
        return this.zzb;
    }
}
