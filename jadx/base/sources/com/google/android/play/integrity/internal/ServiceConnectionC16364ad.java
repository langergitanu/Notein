package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ad */
/* JADX INFO: loaded from: classes7.dex */
final class ServiceConnectionC16364ad implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C16365ae f51538a;

    public /* synthetic */ ServiceConnectionC16364ad(C16365ae c16365ae, C16363ac c16363ac) {
        this.f51538a = c16365ae;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f51538a.f51541c.m75061d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f51538a.m75010c().post(new C16361aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f51538a.f51541c.m75061d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f51538a.m75010c().post(new C16362ab(this));
    }
}
