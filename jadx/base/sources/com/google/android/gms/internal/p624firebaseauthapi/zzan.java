package com.google.android.gms.internal.p624firebaseauthapi;

import com.aspose.slides.OooOOO;
import com.aspose.slides.internal.p332p7.OooO0o;

/* JADX INFO: loaded from: classes7.dex */
final class zzan {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzan(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(OooOOO.OooO0O0(OooO0o.OooO0O0("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(this.zza), "=", String.valueOf(this.zzc)));
    }
}
