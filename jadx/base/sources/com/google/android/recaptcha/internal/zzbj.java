package com.google.android.recaptcha.internal;

import com.aspose.slides.OooOOO;
import com.aspose.slides.internal.p332p7.OooO0o;
import o000OoO.C24536OooO0Oo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strOooo0oo = C33599OooOo0O.Oooo0oo(10, String.valueOf(this.zzb / ((long) this.zza)));
        String strOooo0oo2 = C33599OooOo0O.Oooo0oo(10, String.valueOf(this.zzc));
        return OooOOO.OooO0O0(OooO0o.OooO0O0("avgExecutionTime: ", strOooo0oo, " us| maxExecutionTime: ", strOooo0oo2, " us| totalTime: "), C33599OooOo0O.Oooo0oo(10, String.valueOf(this.zzb)), " us| #Usages: ", C33599OooOo0O.Oooo0oo(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return C24536OooO0Oo.OooO0O0(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
