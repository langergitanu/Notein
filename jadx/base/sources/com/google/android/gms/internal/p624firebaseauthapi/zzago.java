package com.google.android.gms.internal.p624firebaseauthapi;

import OooOO0.OooO0OO;
import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;

/* JADX INFO: loaded from: classes7.dex */
final class zzago extends zzaie {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzahg zzd;
    private final String zze;

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaie) {
            zzaie zzaieVar = (zzaie) obj;
            if (this.zza.equals(zzaieVar.zzd()) && ((str = this.zzb) != null ? str.equals(zzaieVar.zze()) : zzaieVar.zze() == null) && this.zzc.equals(zzaieVar.zzf()) && this.zzd.equals(zzaieVar.zzb()) && this.zze.equals(zzaieVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzc;
        String strValueOf = String.valueOf(this.zzd);
        String str4 = this.zze;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("RevokeTokenRequest{providerId=", str, ", tenantId=", str2, ", token=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", tokenType=", strValueOf, ", idToken=");
        return OooO00o.OooO0OO(sbOooO0O0, str4, "}");
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaie
    public final zzahg zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaie
    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaie
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaie
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaie
    public final String zzf() {
        return this.zzc;
    }

    private zzago(String str, String str2, String str3, zzahg zzahgVar, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzahgVar;
        this.zze = str4;
    }
}
