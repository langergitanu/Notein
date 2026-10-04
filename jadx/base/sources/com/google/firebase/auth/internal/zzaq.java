package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.concurrent.futures.OooO00o;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.FirebaseApp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaq {
    private static Logger zzc = new Logger("TokenRefresher", "FirebaseAuth:");
    volatile long zza;
    volatile long zzb;
    private final FirebaseApp zzd;
    private long zze;
    private HandlerThread zzf;
    private Handler zzg;
    private Runnable zzh;

    public zzaq(FirebaseApp firebaseApp) {
        zzc.m74923v("Initializing TokenRefresher", new Object[0]);
        FirebaseApp firebaseApp2 = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        this.zzd = firebaseApp2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzg = new com.google.android.gms.internal.p624firebaseauthapi.zze(this.zzf.getLooper());
        this.zzh = new zzat(this, firebaseApp2.getName());
        this.zze = 300000L;
    }

    public final void zzb() {
        this.zzg.removeCallbacks(this.zzh);
    }

    public final void zzc() {
        zzc.m74923v(OooO00o.OooO0O0(this.zza - this.zze, "Scheduling refresh for "), new Object[0]);
        zzb();
        this.zzb = Math.max((this.zza - DefaultClock.getInstance().currentTimeMillis()) - this.zze, 0L) / 1000;
        this.zzg.postDelayed(this.zzh, this.zzb * 1000);
    }

    public final void zzd() {
        int i = (int) this.zzb;
        this.zzb = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * this.zzb : i != 960 ? 30L : 960L;
        this.zza = (this.zzb * 1000) + DefaultClock.getInstance().currentTimeMillis();
        zzc.m74923v(OooO00o.OooO0O0(this.zza, "Scheduling refresh for "), new Object[0]);
        this.zzg.postDelayed(this.zzh, this.zzb * 1000);
    }
}
