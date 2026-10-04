package com.orion.notein.p607ui.noteeditor.screenshot;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements ServiceConnection {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.screenshot.OooO00o f76239OooOo0o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.screenshot.OooO00o f76240OooO00o;

        public OooO00o(com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o) {
            this.f76240OooO00o = oooO00o;
        }
    }

    public OooO0O0(com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o) {
        this.f76239OooOo0o = oooO00o;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName className, IBinder service) {
        OooOOO0.OooO0oO(className, "className");
        OooOOO0.OooO0oO(service, "service");
        com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o = this.f76239OooOo0o;
        oooO00o.getClass();
        ScreenCaptureForegroundService.this.f76242OooOo = new OooO00o(oooO00o);
        oooO00o.f76236OooO0Oo = true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        OooOOO0.OooO0oO(name, "name");
        this.f76239OooOo0o.f76236OooO0Oo = false;
    }
}
