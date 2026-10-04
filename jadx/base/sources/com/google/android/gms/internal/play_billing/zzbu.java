package com.google.android.gms.internal.play_billing;

import com.aspose.slides.OooOOO;
import com.aspose.slides.internal.p332p7.OooO0o;

/* JADX INFO: loaded from: classes7.dex */
final class zzbu {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzbu(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(OooOOO.OooO0O0(OooO0o.OooO0O0("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj3), "=", String.valueOf(obj)));
    }
}
