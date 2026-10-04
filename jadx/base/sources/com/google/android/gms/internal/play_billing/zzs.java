package com.google.android.gms.internal.play_billing;

import OooOoo.C20593OooO0Oo;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzs extends zzo {
    final /* synthetic */ zzt zzg;

    public zzs(zzt zztVar) {
        Objects.requireNonNull(zztVar);
        this.zzg = zztVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    public final String zza() {
        zzp zzpVar = (zzp) this.zzg.zza.get();
        return zzpVar == null ? "Completer object has been garbage collected, future will fail soon" : C20593OooO0Oo.OooO0O0("tag=[", String.valueOf(zzpVar.zza), "]");
    }
}
