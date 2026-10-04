package com.android.billingclient.api;

import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzji;

/* JADX INFO: renamed from: com.android.billingclient.api.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22191OoooO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f67061OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Transport f67062OooO0O0;

    public final void OooO00o(zzji zzjiVar) {
        if (this.f67061OooO00o) {
            zzc.zzn("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f67062OooO0O0.send(Event.ofData(zzjiVar));
        } catch (Throwable unused) {
            zzc.zzn("BillingLogger", "logging failed.");
        }
    }
}
