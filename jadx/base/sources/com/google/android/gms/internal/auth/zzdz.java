package com.google.android.gms.internal.auth;

import Oooo0.C20855OooooOO;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes7.dex */
final class zzdz extends zzec {
    private final int zzc;

    public zzdz(byte[] bArr, int i, int i2) {
        super(bArr);
        zzef.zzi(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C21532OooOOo.OooO0OO(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.auth.zzec
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
        return this.zzc;
    }
}
