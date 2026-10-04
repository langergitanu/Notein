package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzat;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;

/* JADX INFO: renamed from: com.android.billingclient.api.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC22185Oooo0o0 implements ServiceConnection {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C22184Oooo0o f67056OooOo0o;

    public /* synthetic */ ServiceConnectionC22185Oooo0o0(C22184Oooo0o c22184Oooo0o) {
        Objects.requireNonNull(c22184Oooo0o);
        this.f67056OooOo0o = c22184Oooo0o;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm("BillingClientTesting", "Billing Override Service connected.");
        C22184Oooo0o c22184Oooo0o = this.f67056OooOo0o;
        c22184Oooo0o.f67053OooOooo = zzat.zzc(iBinder);
        c22184Oooo0o.f67052OooOooO = 2;
        c22184Oooo0o.Oooo00o(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzc.zzn("BillingClientTesting", "Billing Override Service disconnected.");
        C22184Oooo0o c22184Oooo0o = this.f67056OooOo0o;
        c22184Oooo0o.f67053OooOooo = null;
        c22184Oooo0o.f67052OooOooO = 0;
    }
}
