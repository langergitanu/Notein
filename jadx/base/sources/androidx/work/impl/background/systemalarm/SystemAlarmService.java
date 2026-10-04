package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.ServiceC21993Oooo00O;
import java.util.HashMap;
import java.util.WeakHashMap;
import o00O0O0o.OooOO0O;
import o00O0OO.C24844OooO0o0;
import o00O0Ooo.C24911OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends ServiceC21993Oooo00O {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final String f66724OooOoO = OooOO0O.OooO0o0("SystemAlarmService");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C24844OooO0o0 f66725OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f66726OooOoO0;

    public final void OooO00o() {
        this.f66726OooOoO0 = true;
        OooOO0O.OooO0OO().OooO00o(f66724OooOoO, "All commands completed in dispatcher", new Throwable[0]);
        String str = C24911OooOOoo.f84532OooO00o;
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = C24911OooOOoo.f84533OooO0O0;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                OooOO0O.OooO0OO().OooO0o(C24911OooOOoo.f84532OooO00o, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.ServiceC21993Oooo00O, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C24844OooO0o0 c24844OooO0o0 = new C24844OooO0o0(this);
        this.f66725OooOo = c24844OooO0o0;
        if (c24844OooO0o0.f84319Oooo000 != null) {
            OooOO0O.OooO0OO().OooO0O0(C24844OooO0o0.f84309Oooo00O, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            c24844OooO0o0.f84319Oooo000 = this;
        }
        this.f66726OooOoO0 = false;
    }

    @Override // androidx.lifecycle.ServiceC21993Oooo00O, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f66726OooOoO0 = true;
        this.f66725OooOo.OooO0Oo();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f66726OooOoO0) {
            OooOO0O.OooO0OO().OooO0Oo(f66724OooOoO, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f66725OooOo.OooO0Oo();
            C24844OooO0o0 c24844OooO0o0 = new C24844OooO0o0(this);
            this.f66725OooOo = c24844OooO0o0;
            if (c24844OooO0o0.f84319Oooo000 != null) {
                OooOO0O.OooO0OO().OooO0O0(C24844OooO0o0.f84309Oooo00O, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                c24844OooO0o0.f84319Oooo000 = this;
            }
            this.f66726OooOoO0 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f66725OooOo.OooO00o(i2, intent);
        return 3;
    }
}
