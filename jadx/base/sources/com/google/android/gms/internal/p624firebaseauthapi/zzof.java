package com.google.android.gms.internal.p624firebaseauthapi;

import androidx.core.database.OooO00o;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzof extends zzbi {
    private final zzqb zza;

    public static class zza extends zzcb {
        private final String zza;
        private final zzxz zzb;

        public final String toString() {
            String str = this.zza;
            int i = zzoe.zza[this.zzb.ordinal()];
            return OooO00o.OooO00o("(typeUrl=", str, ", outputPrefixType=", i != 1 ? i != 2 ? i != 3 ? i != 4 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
        }

        @Override // com.google.android.gms.internal.p624firebaseauthapi.zzcb
        public final boolean zza() {
            return this.zzb != zzxz.RAW;
        }

        private zza(String str, zzxz zzxzVar) {
            this.zza = str;
            this.zzb = zzxzVar;
        }
    }

    public zzof(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        zza(zzqbVar, zzchVar);
        this.zza = zzqbVar;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzbi
    public final zzcb zza() {
        return new zza(this.zza.zzf(), this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzaaj zzc() throws GeneralSecurityException {
        zzqb zzqbVar = this.zza;
        if (zzqbVar.zzb().equals(zzxz.RAW)) {
            return zzaaj.zza(new byte[0]);
        }
        if (zzqbVar.zzb().equals(zzxz.TINK)) {
            return zzpe.zzb(zzqbVar.zze().intValue());
        }
        if (zzqbVar.zzb().equals(zzxz.LEGACY) || zzqbVar.zzb().equals(zzxz.CRUNCHY)) {
            return zzpe.zza(zzqbVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    public final zzqb zza(zzch zzchVar) throws GeneralSecurityException {
        zza(this.zza, zzchVar);
        return this.zza;
    }

    private static void zza(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        int i = zzoe.zzb[zzqbVar.zza().ordinal()];
        if (i == 1 || i == 2) {
            zzch.zza(zzchVar);
        }
    }
}
