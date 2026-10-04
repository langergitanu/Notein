package com.google.android.gms.internal.fido;

import Oooo0.C20855OooooOO;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes7.dex */
final class zzct extends zzcw {
    private final int zzc;
    private final int zzd;

    public zzct(byte[] bArr, int i, int i2) {
        super(bArr);
        zzcz.zzj(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte zza(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C21532OooOOo.OooO0OO(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.fido.zzcw
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i3);
    }
}
