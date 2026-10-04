package o00O0OO0;

import Oooo0oo.AbstractC21138OooO0oo;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.OooO00o;
import androidx.work.WorkerParameters;
import androidx.work.impl.OooO00o;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o000oo0.AbstractC24673OooOo0O;
import o000oo0.C24668OooOOOo;
import o000oooO.InterfaceC24759OooO0o;
import o00O0O0o.OooOO0O;
import o00O0OOO.C24850OooO0Oo;
import o00O0OoO.C24887OooOoo;
import o00O0OoO.C24890OooOooo;
import o00O0Ooo.C24902OooOO0;
import o00O0Ooo.C24903OooOO0O;
import o00O0Ooo.ExecutorC24905OooOOO;
import o00O0Ooo.RunnableC24907OooOOOO;
import o00O0Ooo.RunnableC24909OooOOo;
import o00oOOo.C25591OooO0O0;
import oo0o0O0.C34677OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static OooOO0O f84356OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static OooOO0O f84357OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Object f84358OooOO0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f84359OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f84360OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final androidx.work.OooO00o f84361OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final WorkDatabase f84362OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25591OooO0O0 f84363OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C24845OooO0Oo f84364OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<InterfaceC24846OooO0o0> f84365OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C24903OooOO0O f84366OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f84367OooO0oo;

    static {
        o00O0O0o.OooOO0O.OooO0o0("WorkManagerImpl");
        f84356OooOO0 = null;
        f84357OooOO0O = null;
        f84358OooOO0o = new Object();
    }

    public OooOO0O(Context context, androidx.work.OooO00o oooO00o, C25591OooO0O0 c25591OooO0O0) {
        AbstractC24673OooOo0O.OooO00o OooO00o2;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        ExecutorC24905OooOOO executor = c25591OooO0O0.f87293OooO00o;
        int i = WorkDatabase.f66708OooOOO0;
        if (z) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(context2, "context");
            OooO00o2 = new AbstractC24673OooOo0O.OooO00o(context2, null, WorkDatabase.class);
            OooO00o2.f83588OooO = true;
        } else {
            String str = OooOO0.f84354OooO00o;
            OooO00o2 = C24668OooOOOo.OooO00o(context2, "androidx.work.workdb", WorkDatabase.class);
            OooO00o2.f83596OooO0oo = new C24848OooO0oo(context2);
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        OooO00o2.f83593OooO0o = executor;
        OooO00o2.f83592OooO0Oo.add(new OooO());
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f66698OooO00o);
        OooO00o2.OooO00o(new OooO00o.C22138OooO0oo(context2, 2, 3));
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f66699OooO0O0);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f66700OooO0OO);
        OooO00o2.OooO00o(new OooO00o.C22138OooO0oo(context2, 5, 6));
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f66701OooO0Oo);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f66703OooO0o0);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f66702OooO0o);
        OooO00o2.OooO00o(new OooO00o.OooO(context2));
        OooO00o2.OooO00o(new OooO00o.C22138OooO0oo(context2, 10, 11));
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f66704OooO0oO);
        OooO00o2.f83603OooOOOo = false;
        OooO00o2.f83605OooOOo0 = true;
        WorkDatabase workDatabase = (WorkDatabase) OooO00o2.OooO0O0();
        Context applicationContext = context.getApplicationContext();
        OooOO0O.OooO00o oooO00o2 = new OooOO0O.OooO00o(oooO00o.f66679OooO0o);
        synchronized (o00O0O0o.OooOO0O.class) {
            o00O0O0o.OooOO0O.f84255OooO00o = oooO00o2;
        }
        String str2 = OooO0o.f84343OooO00o;
        C24850OooO0Oo c24850OooO0Oo = new C24850OooO0Oo(applicationContext, this);
        C24902OooOO0.OooO00o(applicationContext, SystemJobService.class, true);
        o00O0O0o.OooOO0O.OooO0OO().OooO00o(OooO0o.f84343OooO00o, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List<InterfaceC24846OooO0o0> listAsList = Arrays.asList(c24850OooO0Oo, new C34677OooO0OO(applicationContext, oooO00o, c25591OooO0O0, this));
        C24845OooO0Oo c24845OooO0Oo = new C24845OooO0Oo(context, oooO00o, c25591OooO0O0, workDatabase, listAsList);
        Context applicationContext2 = context.getApplicationContext();
        this.f84360OooO00o = applicationContext2;
        this.f84361OooO0O0 = oooO00o;
        this.f84363OooO0Oo = c25591OooO0O0;
        this.f84362OooO0OO = workDatabase;
        this.f84365OooO0o0 = listAsList;
        this.f84364OooO0o = c24845OooO0Oo;
        this.f84366OooO0oO = new C24903OooOO0O(workDatabase);
        this.f84367OooO0oo = false;
        if (applicationContext2.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f84363OooO0Oo.OooO00o(new ForceStopRunnable(applicationContext2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OooOO0O OoooooO(Context context) {
        OooOO0O oooOO0OOoooooO;
        Object obj = f84358OooOO0o;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    oooOO0OOoooooO = f84356OooOO0;
                    if (oooOO0OOoooooO == null) {
                        oooOO0OOoooooO = f84357OooOO0O;
                    }
                }
                return oooOO0OOoooooO;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (oooOO0OOoooooO == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof OooO00o.OooO0O0)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            Ooooooo(applicationContext, ((OooO00o.OooO0O0) applicationContext).OooO00o());
            oooOO0OOoooooO = OoooooO(applicationContext);
        }
        return oooOO0OOoooooO;
    }

    public static void Ooooooo(Context context, androidx.work.OooO00o oooO00o) {
        synchronized (f84358OooOO0o) {
            try {
                OooOO0O oooOO0O = f84356OooOO0;
                if (oooOO0O != null && f84357OooOO0O != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (oooOO0O == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f84357OooOO0O == null) {
                        f84357OooOO0O = new OooOO0O(applicationContext, oooO00o, new C25591OooO0O0(oooO00o.f66676OooO0O0));
                    }
                    f84356OooOO0 = f84357OooOO0O;
                }
            } finally {
            }
        }
    }

    public final void o00O0O(String str, WorkerParameters.OooO00o oooO00o) {
        C25591OooO0O0 c25591OooO0O0 = this.f84363OooO0Oo;
        RunnableC24907OooOOOO runnableC24907OooOOOO = new RunnableC24907OooOOOO();
        runnableC24907OooOOOO.f84524OooOo0o = this;
        runnableC24907OooOOOO.f84523OooOo = str;
        runnableC24907OooOOOO.f84525OooOoO0 = oooO00o;
        c25591OooO0O0.OooO00o(runnableC24907OooOOOO);
    }

    public final void o00Oo0(String str) {
        this.f84363OooO0Oo.OooO00o(new RunnableC24909OooOOo(this, str, false));
    }

    public final void o0OoOo0() {
        synchronized (f84358OooOO0o) {
            try {
                this.f84367OooO0oo = true;
                BroadcastReceiver.PendingResult pendingResult = this.f84359OooO;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f84359OooO = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ooOO() {
        ArrayList arrayListOooO0Oo;
        WorkDatabase workDatabase = this.f84362OooO0OO;
        Context context = this.f84360OooO00o;
        String str = C24850OooO0Oo.f84395OooOoOO;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListOooO0Oo = C24850OooO0Oo.OooO0Oo(context, jobScheduler)) != null && !arrayListOooO0Oo.isEmpty()) {
            Iterator it = arrayListOooO0Oo.iterator();
            while (it.hasNext()) {
                C24850OooO0Oo.OooO0O0(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        C24890OooOooo c24890OooOooo = (C24890OooOooo) workDatabase.OooOoO();
        WorkDatabase_Impl workDatabase_Impl = c24890OooOooo.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        C24887OooOoo c24887OooOoo = c24890OooOooo.f84484OooO;
        InterfaceC24759OooO0o interfaceC24759OooO0oOooO0oo = c24887OooOoo.OooO0oo();
        workDatabase_Impl.OooO0OO();
        try {
            interfaceC24759OooO0oOooO0oo.OooOo0();
            workDatabase_Impl.OooOOoo();
            workDatabase_Impl.OooOOOo();
            c24887OooOoo.OooOO0o(interfaceC24759OooO0oOooO0oo);
            OooO0o.OooO00o(this.f84361OooO0O0, workDatabase, this.f84365OooO0o0);
        } catch (Throwable th) {
            workDatabase_Impl.OooOOOo();
            c24887OooOoo.OooOO0o(interfaceC24759OooO0oOooO0oo);
            throw th;
        }
    }
}
