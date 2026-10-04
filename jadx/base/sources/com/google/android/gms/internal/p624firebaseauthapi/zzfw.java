package com.google.android.gms.internal.p624firebaseauthapi;

import OooOoo.C20593OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import com.google.android.gms.internal.p624firebaseauthapi.zzfz;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfw extends zzcw {
    private final zzfz zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    private zzfw(zzfz zzfzVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzfzVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzcw, com.google.android.gms.internal.p624firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzfz) zza();
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzcw
    /* JADX INFO: renamed from: zzc */
    public final /* synthetic */ zzcy zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzcw
    public final zzaaj zzd() {
        return this.zzc;
    }

    public final zzaal zze() {
        return this.zzb;
    }

    public static zzfw zza(zzfz zzfzVar, zzaal zzaalVar, Integer num) throws GeneralSecurityException {
        zzaaj zzaajVarZzb;
        zzfz.zza zzaVarZzc = zzfzVar.zzc();
        zzfz.zza zzaVar = zzfz.zza.zzb;
        if (zzaVarZzc != zzaVar && num == null) {
            throw new GeneralSecurityException(C20593OooO0Oo.OooO0O0("For given Variant ", String.valueOf(zzfzVar.zzc()), " the value of idRequirement must be non-null"));
        }
        if (zzfzVar.zzc() == zzaVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzaalVar.zza() != 32) {
            throw new GeneralSecurityException(C21532OooOOo.OooO0OO(zzaalVar.zza(), "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (zzfzVar.zzc() == zzaVar) {
            zzaajVarZzb = zzpe.zza;
        } else {
            if (zzfzVar.zzc() != zzfz.zza.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zzfzVar.zzc())));
            }
            zzaajVarZzb = zzpe.zzb(num.intValue());
        }
        return new zzfw(zzfzVar, zzaalVar, zzaajVarZzb, num);
    }
}
