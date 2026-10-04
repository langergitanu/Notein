package com.google.android.gms.internal.p624firebaseauthapi;

import androidx.appcompat.widget.C21532OooOOo;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes7.dex */
final class zzll implements zzly {
    private final int zza;

    public zzll(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(C21532OooOOo.OooO0OO(i, "Unsupported key length: "));
        }
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzly
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzly
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzly
    public final byte[] zzc() throws GeneralSecurityException {
        int i = this.zza;
        if (i == 16) {
            return zzmk.zzi;
        }
        if (i == 32) {
            return zzmk.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzly
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == this.zza) {
            return new zzhs(bArr).zza(bArr2, bArr3, i, bArr4);
        }
        throw new InvalidAlgorithmParameterException(C21532OooOOo.OooO0OO(bArr.length, "Unexpected key length: "));
    }
}
