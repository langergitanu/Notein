package o00O0OO0;

import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.core.content.ContextCompat;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import o00O0O0o.C24836OooO0oO;
import o00O0Oo.C24857OooO0O0;
import o00O0Ooo.C24911OooOOoo;
import o00O0o00.C24932OooO0OO;
import o00oOOo.C25591OooO0O0;

/* JADX INFO: renamed from: o00O0OO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24845OooO0Oo implements OooO0O0 {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final String f84328Oooo00o = o00O0O0o.OooOO0O.OooO0o0("Processor");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Context f84329OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C25591OooO0O0 f84331OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final androidx.work.OooO00o f84332OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final WorkDatabase f84333OooOoOO;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final List<InterfaceC24846OooO0o0> f84336OooOooO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final HashMap f84334OooOoo = new HashMap();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final HashMap f84335OooOoo0 = new HashMap();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final HashSet f84337OooOooo = new HashSet();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final ArrayList f84338Oooo000 = new ArrayList();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PowerManager.WakeLock f84330OooOo0o = null;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final Object f84339Oooo00O = new Object();

    /* JADX INFO: renamed from: o00O0OO0.OooO0Oo$OooO00o */
    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f84340OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C24845OooO0Oo f84341OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public C24932OooO0OO f84342OooOoO0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f84342OooOoO0.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f84341OooOo0o.OooO0O0(this.f84340OooOo, zBooleanValue);
        }
    }

    public C24845OooO0Oo(Context context, androidx.work.OooO00o oooO00o, C25591OooO0O0 c25591OooO0O0, WorkDatabase workDatabase, List list) {
        this.f84329OooOo = context;
        this.f84332OooOoO0 = oooO00o;
        this.f84331OooOoO = c25591OooO0O0;
        this.f84333OooOoOO = workDatabase;
        this.f84336OooOooO = list;
    }

    public static boolean OooO0OO(String str, OooOOO oooOOO) {
        boolean zIsDone;
        if (oooOOO == null) {
            o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84328Oooo00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        oooOOO.f84389Oooo0oO = true;
        oooOOO.OooO();
        ListenableFuture<ListenableWorker.OooO00o> listenableFuture = oooOOO.f84387Oooo0o;
        if (listenableFuture != null) {
            zIsDone = listenableFuture.isDone();
            oooOOO.f84387Oooo0o.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = oooOOO.f84376OooOoOO;
        if (listenableWorker == null || zIsDone) {
            o00O0O0o.OooOO0O.OooO0OO().OooO00o(OooOOO.f84371Oooo0oo, "WorkSpec " + oooOOO.f84374OooOoO + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.OooO0oO();
        }
        o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84328Oooo00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final boolean OooO(String str) {
        boolean zOooO0OO;
        synchronized (this.f84339Oooo00O) {
            o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84328Oooo00o, "Processor stopping foreground work " + str, new Throwable[0]);
            zOooO0OO = OooO0OO(str, (OooOOO) this.f84335OooOoo0.remove(str));
        }
        return zOooO0OO;
    }

    public final void OooO00o(OooO0O0 oooO0O0) {
        synchronized (this.f84339Oooo00O) {
            this.f84338Oooo000.add(oooO0O0);
        }
    }

    @Override // o00O0OO0.OooO0O0
    public final void OooO0O0(String str, boolean z) {
        synchronized (this.f84339Oooo00O) {
            try {
                this.f84334OooOoo.remove(str);
                o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84328Oooo00o, C24845OooO0Oo.class.getSimpleName() + " " + str + " executed; reschedule = " + z, new Throwable[0]);
                Iterator it = this.f84338Oooo000.iterator();
                while (it.hasNext()) {
                    ((OooO0O0) it.next()).OooO0O0(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OooO0Oo(String str) {
        boolean z;
        synchronized (this.f84339Oooo00O) {
            try {
                z = this.f84334OooOoo.containsKey(str) || this.f84335OooOoo0.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public final void OooO0o(String str, C24836OooO0oO c24836OooO0oO) {
        synchronized (this.f84339Oooo00O) {
            try {
                o00O0O0o.OooOO0O.OooO0OO().OooO0Oo(f84328Oooo00o, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                OooOOO oooOOO = (OooOOO) this.f84334OooOoo.remove(str);
                if (oooOOO != null) {
                    if (this.f84330OooOo0o == null) {
                        PowerManager.WakeLock wakeLockOooO00o = C24911OooOOoo.OooO00o(this.f84329OooOo, "ProcessorForegroundLck");
                        this.f84330OooOo0o = wakeLockOooO00o;
                        wakeLockOooO00o.acquire();
                    }
                    this.f84335OooOoo0.put(str, oooOOO);
                    ContextCompat.startForegroundService(this.f84329OooOo, C24857OooO0O0.OooO0OO(this.f84329OooOo, str, c24836OooO0oO));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0o0(OooO0O0 oooO0O0) {
        synchronized (this.f84339Oooo00O) {
            this.f84338Oooo000.remove(oooO0O0);
        }
    }

    public final boolean OooO0oO(String str, WorkerParameters.OooO00o oooO00o) {
        synchronized (this.f84339Oooo00O) {
            try {
                if (OooO0Oo(str)) {
                    o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84328Oooo00o, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f84329OooOo;
                androidx.work.OooO00o oooO00o2 = this.f84332OooOoO0;
                C25591OooO0O0 c25591OooO0O0 = this.f84331OooOoO;
                WorkDatabase workDatabase = this.f84333OooOoOO;
                List list = Collections.EMPTY_LIST;
                Context applicationContext = context.getApplicationContext();
                List<InterfaceC24846OooO0o0> list2 = this.f84336OooOooO;
                OooOOO oooOOO = new OooOOO();
                oooOOO.f84377OooOoo = new ListenableWorker.OooO00o.C19046OooO00o();
                oooOOO.f84388Oooo0o0 = new C24932OooO0OO<>();
                oooOOO.f84387Oooo0o = null;
                oooOOO.f84373OooOo0o = applicationContext;
                oooOOO.f84378OooOoo0 = c25591OooO0O0;
                oooOOO.f84380OooOooo = this;
                oooOOO.f84372OooOo = str;
                oooOOO.f84375OooOoO0 = list2;
                oooOOO.f84376OooOoOO = null;
                oooOOO.f84379OooOooO = oooO00o2;
                oooOOO.f84382Oooo000 = workDatabase;
                oooOOO.f84383Oooo00O = workDatabase.OooOoO();
                oooOOO.f84384Oooo00o = workDatabase.OooOo0();
                oooOOO.f84381Oooo0 = workDatabase.OooOoOO();
                C24932OooO0OO<Boolean> c24932OooO0OO = oooOOO.f84388Oooo0o0;
                OooO00o oooO00o3 = new OooO00o();
                oooO00o3.f84341OooOo0o = this;
                oooO00o3.f84340OooOo = str;
                oooO00o3.f84342OooOoO0 = c24932OooO0OO;
                c24932OooO0OO.addListener(oooO00o3, this.f84331OooOoO.f87295OooO0OO);
                this.f84334OooOoo.put(str, oooOOO);
                this.f84331OooOoO.f87293OooO00o.execute(oooOOO);
                o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84328Oooo00o, o0Oo0oo.OooO0Oo(C24845OooO0Oo.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0oo() {
        synchronized (this.f84339Oooo00O) {
            try {
                if (this.f84335OooOoo0.isEmpty()) {
                    Context context = this.f84329OooOo;
                    String str = C24857OooO0O0.f84411Oooo000;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f84329OooOo.startService(intent);
                    } catch (Throwable th) {
                        o00O0O0o.OooOO0O.OooO0OO().OooO0O0(f84328Oooo00o, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f84330OooOo0o;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f84330OooOo0o = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean OooOO0(String str) {
        boolean zOooO0OO;
        synchronized (this.f84339Oooo00O) {
            o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84328Oooo00o, "Processor stopping background work " + str, new Throwable[0]);
            zOooO0OO = OooO0OO(str, (OooOOO) this.f84334OooOoo.remove(str));
        }
        return zOooO0OO;
    }
}
