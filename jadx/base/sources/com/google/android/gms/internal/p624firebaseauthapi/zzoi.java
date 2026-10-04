package com.google.android.gms.internal.p624firebaseauthapi;

import androidx.core.database.OooO00o;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class zzoi extends zzcb {
    private final zzqe zza;

    public zzoi(zzqe zzqeVar) {
        this.zza = zzqeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoi)) {
            return false;
        }
        zzqe zzqeVar = ((zzoi) obj).zza;
        return this.zza.zza().zzd().equals(zzqeVar.zza().zzd()) && this.zza.zza().zzf().equals(zzqeVar.zza().zzf()) && this.zza.zza().zze().equals(zzqeVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzc());
    }

    public final String toString() {
        String strZzf = this.zza.zza().zzf();
        int i = zzoh.zza[this.zza.zza().zzd().ordinal()];
        return OooO00o.OooO00o("(typeUrl=", strZzf, ", outputPrefixType=", i != 1 ? i != 2 ? i != 3 ? i != 4 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zza.zza().zzd() != zzxz.RAW;
    }

    public final zzqe zzb() {
        return this.zza;
    }
}
