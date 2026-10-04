package com.google.android.gms.internal.auth;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes7.dex */
final class zzdm implements zzdj {
    private static final zzdj zza = new zzdj() { // from class: com.google.android.gms.internal.auth.zzdl
        @Override // com.google.android.gms.internal.auth.zzdj
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzdj zzb;
    private Object zzc;

    public zzdm(zzdj zzdjVar) {
        this.zzb = zzdjVar;
    }

    public final String toString() {
        Object objOooO0O0 = this.zzb;
        if (objOooO0O0 == zza) {
            objOooO0O0 = C20593OooO0Oo.OooO0O0("<supplier that returned ", String.valueOf(this.zzc), ">");
        }
        return C20593OooO0Oo.OooO0O0("Suppliers.memoize(", String.valueOf(objOooO0O0), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        zzdj zzdjVar = this.zzb;
        zzdj zzdjVar2 = zza;
        if (zzdjVar != zzdjVar2) {
            synchronized (this) {
                try {
                    if (this.zzb != zzdjVar2) {
                        Object objZza = this.zzb.zza();
                        this.zzc = objZza;
                        this.zzb = zzdjVar2;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
