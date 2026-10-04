package o00O0Oo;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: renamed from: o00O0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24859OooO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Notification f84425OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f84426OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f84427OooOoO0;

    public RunnableC24859OooO0Oo(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f84427OooOoO0 = systemForegroundService;
        this.f84426OooOo0o = i;
        this.f84425OooOo = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f84427OooOoO0.f66735OooOoOO.notify(this.f84426OooOo0o, this.f84425OooOo);
    }
}
