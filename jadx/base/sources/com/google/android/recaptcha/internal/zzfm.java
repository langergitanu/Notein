package com.google.android.recaptcha.internal;

import OooOoOO.C20519OooO0Oo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfm {
    private final InterfaceC32440OooOO0 zza;

    public zzfm() {
        int i = zzav.zza;
        this.zza = C20519OooO0Oo.OooO0OO(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) throws IOException, zzbd {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        OooOOO0.OooO0o0(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
