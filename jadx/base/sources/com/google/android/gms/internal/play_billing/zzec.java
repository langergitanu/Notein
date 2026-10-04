package com.google.android.gms.internal.play_billing;

import Oooo0.C20855OooooOO;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes7.dex */
final class zzec extends zzeg {
    private final int zzc;

    public zzec(byte[] bArr, int i, int i2) {
        super(bArr);
        zzei.zzh(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzeg) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C21532OooOOo.OooO0OO(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final byte zzb(int i) {
        return ((zzeg) this).zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final int zzd() {
        return this.zzc;
    }
}
