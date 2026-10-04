package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.zza;
        C33609OooO0oo.OooO0OO(zzesVar.zzd, null, null, new zzeq(zzesVar, null), 3);
    }
}
