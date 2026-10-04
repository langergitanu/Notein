package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.ServiceC21993Oooo00O;
import java.util.UUID;
import o00O0O0o.OooOO0O;
import o00O0Oo.C24857OooO0O0;
import o00O0Oo.RunnableC24856OooO00o;
import o00O0Ooo.C24894OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends ServiceC21993Oooo00O {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final String f66731OooOoo0 = OooOO0O.OooO0o0("SystemFgService");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Handler f66732OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C24857OooO0O0 f66733OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f66734OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public NotificationManager f66735OooOoOO;

    public final void OooO00o() {
        this.f66732OooOo = new Handler(Looper.getMainLooper());
        this.f66735OooOoOO = (NotificationManager) getApplicationContext().getSystemService("notification");
        C24857OooO0O0 c24857OooO0O0 = new C24857OooO0O0(getApplicationContext());
        this.f66733OooOoO = c24857OooO0O0;
        if (c24857OooO0O0.f84420OooOooo == null) {
            c24857OooO0O0.f84420OooOooo = this;
        } else {
            OooOO0O.OooO0OO().OooO0O0(C24857OooO0O0.f84411Oooo000, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // androidx.lifecycle.ServiceC21993Oooo00O, android.app.Service
    public final void onCreate() {
        super.onCreate();
        OooO00o();
    }

    @Override // androidx.lifecycle.ServiceC21993Oooo00O, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f66733OooOoO.OooO0oO();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.f66734OooOoO0;
        String str = f66731OooOoo0;
        if (z) {
            OooOO0O.OooO0OO().OooO0Oo(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f66733OooOoO.OooO0oO();
            OooO00o();
            this.f66734OooOoO0 = false;
        }
        if (intent == null) {
            return 3;
        }
        C24857OooO0O0 c24857OooO0O0 = this.f66733OooOoO;
        c24857OooO0O0.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = C24857OooO0O0.f84411Oooo000;
        o00O0OO0.OooOO0O oooOO0O = c24857OooO0O0.f84413OooOo0o;
        if (zEquals) {
            OooOO0O.OooO0OO().OooO0Oo(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            c24857OooO0O0.f84412OooOo.OooO00o(new RunnableC24856OooO00o(c24857OooO0O0, oooOO0O.f84362OooO0OO, intent.getStringExtra("KEY_WORKSPEC_ID")));
            c24857OooO0O0.OooO0o0(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c24857OooO0O0.OooO0o0(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            OooOO0O.OooO0OO().OooO0Oo(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra);
            oooOO0O.getClass();
            oooOO0O.f84363OooO0Oo.OooO00o(new C24894OooO00o(oooOO0O, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        OooOO0O.OooO0OO().OooO0Oo(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = c24857OooO0O0.f84420OooOooo;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f66734OooOoO0 = true;
        OooOO0O.OooO0OO().OooO00o(str, "All commands completed.", new Throwable[0]);
        systemForegroundService.stopForeground(true);
        systemForegroundService.stopSelf();
        return 3;
    }
}
