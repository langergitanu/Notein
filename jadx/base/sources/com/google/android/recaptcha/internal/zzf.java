package com.google.android.recaptcha.internal;

import oO0o0OO.o0000;

/* JADX INFO: loaded from: classes7.dex */
public final class zzf {
    public static final zzbd zza(Exception exc, zzbd zzbdVar) {
        return exc instanceof o0000 ? new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage()) : exc instanceof zzbd ? (zzbd) exc : zzbdVar;
    }
}
