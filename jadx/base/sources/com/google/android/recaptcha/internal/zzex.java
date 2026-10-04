package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzex {
    private final zzfm zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final zzew zza(String str) throws zzbd {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(httpURLConnectionZza);
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e2.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i, C24018OooO0oo c24018OooO0oo) {
        this.zza = new zzfm();
    }
}
