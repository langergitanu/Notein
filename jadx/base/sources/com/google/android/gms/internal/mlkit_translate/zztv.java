package com.google.android.gms.internal.mlkit_translate;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class zztv implements Closeable {
    private static final Map zza = new HashMap();
    private final String zzb;
    private int zzc;
    private double zzd;
    private long zze;
    private long zzf;
    private long zzg;

    private zztv(String str) {
        this.zzf = 2147483647L;
        this.zzg = -2147483648L;
        this.zzb = str;
    }

    private final void zza() {
        this.zzc = 0;
        this.zzd = 0.0d;
        this.zzf = 2147483647L;
        this.zzg = -2147483648L;
    }

    public static zztv zzd(String str) {
        zzwj.zza();
        if (!zzwj.zzb()) {
            return zztt.zza;
        }
        Map map = zza;
        if (map.get(str) == null) {
            map.put(str, new zztv(str));
        }
        return (zztv) map.get(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Did you forget to call start()?");
    }

    public void zzb(long j) {
        zzc(j * 1000);
    }

    public void zzc(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.zze;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            zza();
        }
        this.zze = jElapsedRealtimeNanos;
        this.zzc++;
        this.zzd += j;
        this.zzf = Math.min(this.zzf, j);
        this.zzg = Math.max(this.zzg, j);
        if (this.zzc % 50 == 0) {
            Locale locale = Locale.US;
            zzwj.zza();
        }
        if (this.zzc % 500 == 0) {
            zza();
        }
    }
}
