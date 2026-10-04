package com.google.android.gms.common.api.internal;

import OooOo.OooO00o;
import OooOoo.C20593OooO0Oo;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class zzc {
    private final Map zza = Collections.synchronizedMap(new OooO00o());
    private int zzb = 0;
    private Bundle zzc;

    public final LifecycleCallback zzc(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.zza.get(str));
    }

    public final void zzd(String str, LifecycleCallback lifecycleCallback) {
        if (this.zza.containsKey(str)) {
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        this.zza.put(str, lifecycleCallback);
        if (this.zzb > 0) {
            new zzh(Looper.getMainLooper()).post(new zzb(this, lifecycleCallback, str));
        }
    }

    public final void zze(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void zzf(int i, int i2, Intent intent) {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i, i2, intent);
        }
    }

    public final void zzg(Bundle bundle) {
        this.zzb = 1;
        this.zzc = bundle;
        for (Map.Entry entry : this.zza.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void zzh() {
        this.zzb = 5;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    public final void zzi() {
        this.zzb = 3;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    public final void zzj(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.zza.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void zzk() {
        this.zzb = 2;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    public final void zzl() {
        this.zzb = 4;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    public final boolean zzm() {
        return this.zzb > 0;
    }

    public final boolean zzn() {
        return this.zzb >= 2;
    }
}
