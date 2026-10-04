package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;

/* JADX INFO: loaded from: classes7.dex */
final class zzed extends AbstractC32479OooO0OO {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;
    int zzd;
    zzef zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzef zzefVar, Continuation continuation) {
        super(continuation);
        this.zzc = zzefVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zza(null, null, 0L, this);
    }
}
