package o00O0OOO;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.os.BuildCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o00O0O0o.C24834OooO0Oo;
import o00O0O0o.C24841OooOOo0;
import o00O0O0o.EnumC24833OooO00o;
import o00O0O0o.EnumC24838OooOO0o;
import o00O0O0o.OooOO0O;
import o00O0O0o.OooOOOO;
import o00O0OO0.InterfaceC24846OooO0o0;
import o00O0OoO.C24872OooO0Oo;
import o00O0OoO.C24874OooO0oO;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;
import o00O0Ooo.C24901OooO0oo;

/* JADX INFO: renamed from: o00O0OOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24850OooO0Oo implements InterfaceC24846OooO0o0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final String f84395OooOoOO = OooOO0O.OooO0o0("SystemJobScheduler");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final JobScheduler f84396OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f84397OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO0OO f84398OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final o00O0OO0.OooOO0O f84399OooOoO0;

    public C24850OooO0Oo(Context context, o00O0OO0.OooOO0O oooOO0O) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        OooO0OO oooO0OO = new OooO0OO(context);
        this.f84397OooOo0o = context;
        this.f84399OooOoO0 = oooOO0O;
        this.f84396OooOo = jobScheduler;
        this.f84398OooOoO = oooO0OO;
    }

    public static void OooO0O0(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            OooOO0O.OooO0OO().OooO0O0(f84395OooOoOO, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList OooO0Oo(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            OooOO0O.OooO0OO().OooO0O0(f84395OooOoOO, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // o00O0OO0.InterfaceC24846OooO0o0
    public final boolean OooO00o() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // o00O0OO0.InterfaceC24846OooO0o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0OO(String str) {
        String string;
        Context context = this.f84397OooOo0o;
        JobScheduler jobScheduler = this.f84396OooOo;
        ArrayList<JobInfo> arrayListOooO0Oo = OooO0Oo(context, jobScheduler);
        ArrayList arrayList = null;
        if (arrayListOooO0Oo != null) {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListOooO0Oo) {
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    string = extras.containsKey("EXTRA_WORK_SPEC_ID") ? extras.getString("EXTRA_WORK_SPEC_ID") : null;
                }
                if (str.equals(string)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooO0O0(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f84399OooOoO0.f84362OooO0OO.OooOo0o().OooO0OO(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o(C24880OooOOoo c24880OooOOoo, int i) {
        int i2;
        JobScheduler jobScheduler = this.f84396OooOo;
        OooO0OO oooO0OO = this.f84398OooOoO;
        oooO0OO.getClass();
        o00O0O0o.OooO0OO oooO0OO2 = c24880OooOOoo.f84465OooOO0;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c24880OooOOoo.f84457OooO00o);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c24880OooOOoo.OooO0OO());
        JobInfo.Builder extras = new JobInfo.Builder(i, oooO0OO.f84394OooO00o).setRequiresCharging(oooO0OO2.f84233OooO0O0).setRequiresDeviceIdle(oooO0OO2.f84234OooO0OO).setExtras(persistableBundle);
        EnumC24838OooOO0o enumC24838OooOO0o = oooO0OO2.f84232OooO00o;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || enumC24838OooOO0o != EnumC24838OooOO0o.f84263OooOoo0) {
            int iOrdinal = enumC24838OooOO0o.ordinal();
            if (iOrdinal == 0) {
                i2 = 0;
            } else if (iOrdinal != 1) {
                i2 = 2;
                if (iOrdinal != 2) {
                    i2 = 3;
                    if (iOrdinal != 3) {
                        i2 = 4;
                        if (iOrdinal != 4) {
                            OooOO0O.OooO0OO().OooO00o(OooO0OO.f84393OooO0O0, "API version too low. Cannot convert network type value " + enumC24838OooOO0o, new Throwable[0]);
                            i2 = 1;
                        }
                    }
                }
            } else {
                i2 = 1;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!oooO0OO2.f84234OooO0OO) {
            extras.setBackoffCriteria(c24880OooOOoo.f84469OooOOO0, c24880OooOOoo.f84467OooOO0o == EnumC24833OooO00o.f84226OooOo ? 0 : 1);
        }
        long jMax = Math.max(c24880OooOOoo.OooO00o() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c24880OooOOoo.f84473OooOOo0) {
            extras.setImportantWhileForeground(true);
        }
        if (oooO0OO2.f84239OooO0oo.f84240OooO00o.size() > 0) {
            for (C24834OooO0Oo.OooO00o oooO00o : oooO0OO2.f84239OooO0oo.f84240OooO00o) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(oooO00o.f84241OooO00o, oooO00o.f84242OooO0O0 ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(oooO0OO2.f84236OooO0o);
            extras.setTriggerContentMaxDelay(oooO0OO2.f84238OooO0oO);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(oooO0OO2.f84235OooO0Oo);
        extras.setRequiresStorageNotLow(oooO0OO2.f84237OooO0o0);
        Object[] objArr = c24880OooOOoo.f84466OooOO0O > 0;
        boolean z = jMax > 0;
        if (BuildCompat.isAtLeastS() && c24880OooOOoo.f84473OooOOo0 && objArr == false && !z) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO();
        String str = c24880OooOOoo.f84457OooO00o;
        String str2 = f84395OooOoOO;
        oooOO0OOooO0OO.OooO00o(str2, "Scheduling work ID " + str + " Job ID " + i, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                OooOO0O.OooO0OO().OooO0o(str2, "Unable to schedule work ID " + c24880OooOOoo.f84457OooO00o, new Throwable[0]);
                if (c24880OooOOoo.f84473OooOOo0 && c24880OooOOoo.f84472OooOOo == OooOOOO.f84268OooOo0o) {
                    c24880OooOOoo.f84473OooOOo0 = false;
                    OooOO0O.OooO0OO().OooO00o(str2, "Scheduling a non-expedited job (work ID " + c24880OooOOoo.f84457OooO00o + ")", new Throwable[0]);
                    OooO0o(c24880OooOOoo, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListOooO0Oo = OooO0Oo(this.f84397OooOo0o, jobScheduler);
            int size = arrayListOooO0Oo != null ? arrayListOooO0Oo.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            o00O0OO0.OooOO0O oooOO0O = this.f84399OooOoO0;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(((C24890OooOooo) oooOO0O.f84362OooO0OO.OooOoO()).OooO0oO().size()), Integer.valueOf(oooOO0O.f84361OooO0O0.f66682OooO0oo));
            OooOO0O.OooO0OO().OooO0O0(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e);
        } catch (Throwable th) {
            OooOO0O.OooO0OO().OooO0O0(str2, "Unable to schedule " + c24880OooOOoo, th);
        }
    }

    @Override // o00O0OO0.InterfaceC24846OooO0o0
    public final void OooO0o0(C24880OooOOoo... c24880OooOOooArr) {
        int i;
        o00O0OO0.OooOO0O oooOO0O = this.f84399OooOoO0;
        WorkDatabase workDatabase = oooOO0O.f84362OooO0OO;
        C24901OooO0oo c24901OooO0oo = new C24901OooO0oo(workDatabase);
        for (C24880OooOOoo c24880OooOOoo : c24880OooOOooArr) {
            workDatabase.OooO0OO();
            try {
                C24880OooOOoo c24880OooOOooOooOO0 = ((C24890OooOooo) workDatabase.OooOoO()).OooOO0(c24880OooOOoo.f84457OooO00o);
                String str = f84395OooOoOO;
                if (c24880OooOOooOooOO0 == null) {
                    OooOO0O.OooO0OO().OooO0o(str, "Skipping scheduling " + c24880OooOOoo.f84457OooO00o + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.OooOOoo();
                } else if (c24880OooOOooOooOO0.f84458OooO0O0 != C24841OooOOo0.OooO00o.f84283OooOo0o) {
                    OooOO0O.OooO0OO().OooO0o(str, "Skipping scheduling " + c24880OooOOoo.f84457OooO00o + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.OooOOoo();
                } else {
                    C24874OooO0oO c24874OooO0oOOooO00o = workDatabase.OooOo0o().OooO00o(c24880OooOOoo.f84457OooO00o);
                    if (c24874OooO0oOOooO00o != null) {
                        i = c24874OooO0oOOooO00o.f84443OooO0O0;
                    } else {
                        oooOO0O.f84361OooO0O0.getClass();
                        int i2 = oooOO0O.f84361OooO0O0.f66681OooO0oO;
                        synchronized (C24901OooO0oo.class) {
                            int iOooO00o = c24901OooO0oo.OooO00o("next_job_scheduler_id");
                            if (iOooO00o < 0 || iOooO00o > i2) {
                                c24901OooO0oo.f84513OooO00o.OooOo0O().OooO0OO(new C24872OooO0Oo("next_job_scheduler_id", 1));
                                i = 0;
                            } else {
                                i = iOooO00o;
                            }
                        }
                    }
                    if (c24874OooO0oOOooO00o == null) {
                        oooOO0O.f84362OooO0OO.OooOo0o().OooO0O0(new C24874OooO0oO(c24880OooOOoo.f84457OooO00o, i));
                    }
                    OooO0o(c24880OooOOoo, i);
                    workDatabase.OooOOoo();
                }
            } finally {
                workDatabase.OooOOOo();
            }
        }
    }
}
