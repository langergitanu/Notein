package com.google.android.odml.image;

import androidx.concurrent.futures.OooO00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzb extends zzh {
    private Integer zza;
    private Integer zzb;

    @Override // com.google.android.odml.image.zzh
    public final zzh zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    public final zzh zzb(int i) {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    public final ImageProperties zzc() {
        Integer num = this.zza;
        if (num != null && this.zzb != null) {
            return new zzc(num.intValue(), this.zzb.intValue(), null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" imageFormat");
        }
        if (this.zzb == null) {
            sb.append(" storageType");
        }
        String strValueOf = String.valueOf(sb);
        throw new IllegalStateException(OooO00o.OooO0OO(new StringBuilder(strValueOf.length() + 28), "Missing required properties:", strValueOf));
    }
}
