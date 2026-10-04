package com.google.android.gms.measurement.internal;

import OooOo.C20478OooOOOo;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzhm extends C20478OooOOOo {
    final /* synthetic */ zzht zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhm(zzht zzhtVar, int i) {
        super(20);
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // OooOo.C20478OooOOOo
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return this.zza.zzC(str);
    }
}
