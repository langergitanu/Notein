package com.google.android.gms.internal.p624firebaseauthapi;

import OooOoo.C20593OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import com.google.android.gms.internal.p624firebaseauthapi.zzem;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzej extends zzcw {
    private final zzem zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    private zzej(zzem zzemVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzemVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzcw, com.google.android.gms.internal.p624firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzem) zza();
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

    public static zzej zza(zzem.zza zzaVar, zzaal zzaalVar, Integer num) throws GeneralSecurityException {
        zzaaj zzaajVarZzb;
        zzem.zza zzaVar2 = zzem.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(C20593OooO0Oo.OooO0O0("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzaalVar.zza() != 32) {
            throw new GeneralSecurityException(C21532OooOOo.OooO0OO(zzaalVar.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzem zzemVarZza = zzem.zza(zzaVar);
        if (zzemVarZza.zzb() == zzaVar2) {
            zzaajVarZzb = zzpe.zza;
        } else if (zzemVarZza.zzb() == zzem.zza.zzb) {
            zzaajVarZzb = zzpe.zza(num.intValue());
        } else {
            if (zzemVarZza.zzb() != zzem.zza.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zzemVarZza.zzb())));
            }
            zzaajVarZzb = zzpe.zzb(num.intValue());
        }
        return new zzej(zzemVarZza, zzaalVar, zzaajVarZzb, num);
    }
}
