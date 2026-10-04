package o00O0OO;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import o00O0O0o.OooOO0O;
import o00O0OO0.C24845OooO0Oo;
import o00O0Ooo.C24911OooOOoo;
import o00O0Ooo.C24912OooOo;
import o00O0Ooo.ExecutorC24905OooOOO;
import o00oOOo.C25591OooO0O0;

/* JADX INFO: renamed from: o00O0OO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24844OooO0o0 implements o00O0OO0.OooO0O0 {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final String f84309Oooo00O = OooOO0O.OooO0o0("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C25591OooO0O0 f84310OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f84311OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C24845OooO0Oo f84312OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C24912OooOo f84313OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o00O0OO0.OooOO0O f84314OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Handler f84315OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final o00O0OO.OooO0O0 f84316OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ArrayList f84317OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Intent f84318OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public SystemAlarmService f84319Oooo000;

    /* JADX INFO: renamed from: o00O0OO.OooO0o0$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C24844OooO0o0.this.f84317OooOooO) {
                C24844OooO0o0 c24844OooO0o0 = C24844OooO0o0.this;
                c24844OooO0o0.f84318OooOooo = (Intent) c24844OooO0o0.f84317OooOooO.get(0);
            }
            Intent intent = C24844OooO0o0.this.f84318OooOooo;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C24844OooO0o0.this.f84318OooOooo.getIntExtra("KEY_START_ID", 0);
                OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO();
                String str = C24844OooO0o0.f84309Oooo00O;
                oooOO0OOooO0OO.OooO00o(str, String.format("Processing command %s, %s", C24844OooO0o0.this.f84318OooOooo, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockOooO00o = C24911OooOOoo.OooO00o(C24844OooO0o0.this.f84311OooOo0o, action + " (" + intExtra + ")");
                try {
                    OooOO0O.OooO0OO().OooO00o(str, "Acquiring operation wake lock (" + action + ") " + wakeLockOooO00o, new Throwable[0]);
                    wakeLockOooO00o.acquire();
                    C24844OooO0o0 c24844OooO0o02 = C24844OooO0o0.this;
                    c24844OooO0o02.f84316OooOoo0.OooO0Oo(intExtra, c24844OooO0o02.f84318OooOooo, c24844OooO0o02);
                    OooOO0O.OooO0OO().OooO00o(str, "Releasing operation wake lock (" + action + ") " + wakeLockOooO00o, new Throwable[0]);
                    wakeLockOooO00o.release();
                    C24844OooO0o0 c24844OooO0o03 = C24844OooO0o0.this;
                    c24844OooO0o03.OooO0o0(new OooO0OO(c24844OooO0o03));
                } catch (Throwable th) {
                    try {
                        OooOO0O oooOO0OOooO0OO2 = OooOO0O.OooO0OO();
                        String str2 = C24844OooO0o0.f84309Oooo00O;
                        oooOO0OOooO0OO2.OooO0O0(str2, "Unexpected error in onHandleIntent", th);
                        OooOO0O.OooO0OO().OooO00o(str2, "Releasing operation wake lock (" + action + ") " + wakeLockOooO00o, new Throwable[0]);
                        wakeLockOooO00o.release();
                        C24844OooO0o0 c24844OooO0o04 = C24844OooO0o0.this;
                        c24844OooO0o04.OooO0o0(new OooO0OO(c24844OooO0o04));
                    } catch (Throwable th2) {
                        OooOO0O.OooO0OO().OooO00o(C24844OooO0o0.f84309Oooo00O, "Releasing operation wake lock (" + action + ") " + wakeLockOooO00o, new Throwable[0]);
                        wakeLockOooO00o.release();
                        C24844OooO0o0 c24844OooO0o05 = C24844OooO0o0.this;
                        c24844OooO0o05.OooO0o0(new OooO0OO(c24844OooO0o05));
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o00O0OO.OooO0o0$OooO0O0 */
    public static class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Intent f84321OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C24844OooO0o0 f84322OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f84323OooOoO0;

        public OooO0O0(int i, Intent intent, C24844OooO0o0 c24844OooO0o0) {
            this.f84322OooOo0o = c24844OooO0o0;
            this.f84321OooOo = intent;
            this.f84323OooOoO0 = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.f84321OooOo;
            this.f84322OooOo0o.OooO00o(this.f84323OooOoO0, intent);
        }
    }

    /* JADX INFO: renamed from: o00O0OO.OooO0o0$OooO0OO */
    public static class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C24844OooO0o0 f84324OooOo0o;

        public OooO0OO(C24844OooO0o0 c24844OooO0o0) {
            this.f84324OooOo0o = c24844OooO0o0;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:4:0x0019, B:6:0x001d, B:8:0x0042, B:11:0x0048, B:12:0x004f, B:13:0x0050, B:14:0x0058, B:18:0x0062, B:20:0x006a, B:21:0x006c, B:25:0x0076, B:27:0x0085, B:35:0x0097, B:31:0x008b, B:32:0x008c, B:34:0x0094, B:39:0x009b, B:22:0x006d, B:23:0x0073, B:15:0x0059, B:16:0x005f), top: B:42:0x0019, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean zIsEmpty;
            boolean zIsEmpty2;
            C24844OooO0o0 c24844OooO0o0 = this.f84324OooOo0o;
            c24844OooO0o0.getClass();
            OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO();
            String str = C24844OooO0o0.f84309Oooo00O;
            oooOO0OOooO0OO.OooO00o(str, "Checking if commands are complete.", new Throwable[0]);
            c24844OooO0o0.OooO0OO();
            synchronized (c24844OooO0o0.f84317OooOooO) {
                try {
                    if (c24844OooO0o0.f84318OooOooo != null) {
                        OooOO0O.OooO0OO().OooO00o(str, String.format("Removing command %s", c24844OooO0o0.f84318OooOooo), new Throwable[0]);
                        if (!((Intent) c24844OooO0o0.f84317OooOooO.remove(0)).equals(c24844OooO0o0.f84318OooOooo)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        c24844OooO0o0.f84318OooOooo = null;
                    }
                    ExecutorC24905OooOOO executorC24905OooOOO = c24844OooO0o0.f84310OooOo.f87293OooO00o;
                    o00O0OO.OooO0O0 oooO0O0 = c24844OooO0o0.f84316OooOoo0;
                    synchronized (oooO0O0.f84294OooOoO0) {
                        zIsEmpty = oooO0O0.f84292OooOo.isEmpty();
                    }
                    if (zIsEmpty && c24844OooO0o0.f84317OooOooO.isEmpty()) {
                        synchronized (executorC24905OooOOO.f84519OooOoO0) {
                            zIsEmpty2 = executorC24905OooOOO.f84517OooOo0o.isEmpty();
                        }
                        if (zIsEmpty2) {
                            OooOO0O.OooO0OO().OooO00o(str, "No more commands & intents.", new Throwable[0]);
                            SystemAlarmService systemAlarmService = c24844OooO0o0.f84319Oooo000;
                            if (systemAlarmService != null) {
                                systemAlarmService.OooO00o();
                            }
                        }
                    } else if (!c24844OooO0o0.f84317OooOooO.isEmpty()) {
                        c24844OooO0o0.OooO0o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C24844OooO0o0(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f84311OooOo0o = applicationContext;
        this.f84316OooOoo0 = new o00O0OO.OooO0O0(applicationContext);
        this.f84313OooOoO0 = new C24912OooOo();
        o00O0OO0.OooOO0O oooOO0OOoooooO = o00O0OO0.OooOO0O.OoooooO(systemAlarmService);
        this.f84314OooOoOO = oooOO0OOoooooO;
        C24845OooO0Oo c24845OooO0Oo = oooOO0OOoooooO.f84364OooO0o;
        this.f84312OooOoO = c24845OooO0Oo;
        this.f84310OooOo = oooOO0OOoooooO.f84363OooO0Oo;
        c24845OooO0Oo.OooO00o(this);
        this.f84317OooOooO = new ArrayList();
        this.f84318OooOooo = null;
        this.f84315OooOoo = new Handler(Looper.getMainLooper());
    }

    public final void OooO00o(int i, Intent intent) {
        OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO();
        String str = f84309Oooo00O;
        oooOO0OOooO0OO.OooO00o(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        OooO0OO();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            OooOO0O.OooO0OO().OooO0o(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            OooO0OO();
            synchronized (this.f84317OooOooO) {
                try {
                    Iterator it = this.f84317OooOooO.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f84317OooOooO) {
            try {
                boolean zIsEmpty = this.f84317OooOooO.isEmpty();
                this.f84317OooOooO.add(intent);
                if (zIsEmpty) {
                    OooO0o();
                }
            } finally {
            }
        }
    }

    @Override // o00O0OO0.OooO0O0
    public final void OooO0O0(String str, boolean z) {
        String str2 = o00O0OO.OooO0O0.f84291OooOoO;
        Intent intent = new Intent(this.f84311OooOo0o, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        OooO0o0(new OooO0O0(0, intent, this));
    }

    public final void OooO0OO() {
        if (this.f84315OooOoo.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void OooO0Oo() {
        OooOO0O.OooO0OO().OooO00o(f84309Oooo00O, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f84312OooOoO.OooO0o0(this);
        ScheduledExecutorService scheduledExecutorService = this.f84313OooOoO0.f84535OooO00o;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f84319Oooo000 = null;
    }

    public final void OooO0o() {
        OooO0OO();
        PowerManager.WakeLock wakeLockOooO00o = C24911OooOOoo.OooO00o(this.f84311OooOo0o, "ProcessCommand");
        try {
            wakeLockOooO00o.acquire();
            this.f84314OooOoOO.f84363OooO0Oo.OooO00o(new OooO00o());
        } finally {
            wakeLockOooO00o.release();
        }
    }

    public final void OooO0o0(Runnable runnable) {
        this.f84315OooOoo.post(runnable);
    }
}
