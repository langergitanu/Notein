package o00O0Oo;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: renamed from: o00O0Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24858OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Notification f84421OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f84422OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f84423OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f84424OooOoO0;

    public RunnableC24858OooO0OO(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f84423OooOoO = systemForegroundService;
        this.f84422OooOo0o = i;
        this.f84421OooOo = notification;
        this.f84424OooOoO0 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        Notification notification = this.f84421OooOo;
        int i2 = this.f84422OooOo0o;
        SystemForegroundService systemForegroundService = this.f84423OooOoO;
        if (i >= 29) {
            systemForegroundService.startForeground(i2, notification, this.f84424OooOoO0);
        } else {
            systemForegroundService.startForeground(i2, notification);
        }
    }
}
