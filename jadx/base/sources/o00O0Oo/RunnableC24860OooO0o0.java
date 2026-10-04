package o00O0Oo;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: renamed from: o00O0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24860OooO0o0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f84428OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f84429OooOo0o;

    public RunnableC24860OooO0o0(SystemForegroundService systemForegroundService, int i) {
        this.f84428OooOo = systemForegroundService;
        this.f84429OooOo0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f84428OooOo.f66735OooOoOO.cancel(this.f84429OooOo0o);
    }
}
