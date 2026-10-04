package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzan zzanVar = this.zza;
        C33609OooO0oo.OooO0OO(zzanVar.zzb, null, null, new zzaj(zzanVar, null), 3);
    }
}
