package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BuildCompat;
import androidx.work.OooO00o;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.aspose.slides.internal.p332p7.OooO0O0;
import com.huawei.hms.network.embedded.C18361t4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24734OooO0O0;
import o000oooO.InterfaceC24759OooO0o;
import o00O0O0o.C24841OooOOo0;
import o00O0O0o.OooOO0O;
import o00O0OO0.OooO0o;
import o00O0OOO.C24850OooO0Oo;
import o00O0OoO.C24872OooO0Oo;
import o00O0OoO.C24878OooOOo;
import o00O0OoO.C24879OooOOo0;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;
import o00O0OoO.OooOO0;
import o00O0OoO.OooOo00;
import o00O0Ooo.C24898OooO0o;
import o00O0Ooo.C24903OooOO0O;
import o00O0Ooo.C24906OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final String f66736OooOoO = OooOO0O.OooO0o0("ForceStopRunnable");

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final long f66737OooOoOO = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o00O0OO0.OooOO0O f66738OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f66739OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f66740OooOoO0 = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final String f66741OooO00o = OooOO0O.OooO0o0("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((OooOO0O.OooO00o) OooOO0O.OooO0OO()).f84256OooO0O0 <= 2) {
                Log.v(f66741OooO00o, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.OooO0OO(context);
        }
    }

    public ForceStopRunnable(Context context, o00O0OO0.OooOO0O oooOO0O) {
        this.f66739OooOo0o = context.getApplicationContext();
        this.f66738OooOo = oooOO0O;
    }

    public static void OooO0OO(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i = BuildCompat.isAtLeastS() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f66737OooOoOO;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o() {
        boolean z;
        WorkDatabase workDatabase;
        PendingIntent broadcast;
        String string;
        String str = C24850OooO0Oo.f84395OooOoOO;
        Context context = this.f66739OooOo0o;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListOooO0Oo = C24850OooO0Oo.OooO0Oo(context, jobScheduler);
        o00O0OO0.OooOO0O oooOO0O = this.f66738OooOo;
        OooOO0 oooOO0OooOo0o = oooOO0O.f84362OooO0OO.OooOo0o();
        oooOO0OooOo0o.getClass();
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = oooOO0OooOo0o.f84444OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO.getCount());
            while (cursorOooO.moveToNext()) {
                arrayList.add(cursorOooO.getString(0));
            }
            HashSet hashSet = new HashSet(arrayListOooO0Oo != null ? arrayListOooO0Oo.size() : 0);
            if (arrayListOooO0Oo != null && !arrayListOooO0Oo.isEmpty()) {
                for (JobInfo jobInfo : arrayListOooO0Oo) {
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        string = extras.containsKey("EXTRA_WORK_SPEC_ID") ? extras.getString("EXTRA_WORK_SPEC_ID") : null;
                    }
                    if (TextUtils.isEmpty(string)) {
                        C24850OooO0Oo.OooO0O0(jobScheduler, jobInfo.getId());
                    } else {
                        hashSet.add(string);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!hashSet.contains((String) it.next())) {
                        OooOO0O.OooO0OO().OooO00o(C24850OooO0Oo.f84395OooOoOO, "Reconciling jobs", new Throwable[0]);
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                workDatabase = oooOO0O.f84362OooO0OO;
                workDatabase.OooO0OO();
                try {
                    OooOo00 oooOo00OooOoO = workDatabase.OooOoO();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((C24890OooOooo) oooOo00OooOoO).OooOO0o(-1L, (String) it2.next());
                    }
                    workDatabase.OooOOoo();
                    workDatabase.OooOOOo();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = oooOO0O.f84362OooO0OO;
            OooOo00 oooOo00OooOoO2 = workDatabase.OooOoO();
            C24878OooOOo c24878OooOOoOooOoO0 = workDatabase.OooOoO0();
            workDatabase.OooO0OO();
            try {
                C24890OooOooo c24890OooOooo = (C24890OooOooo) oooOo00OooOoO2;
                ArrayList<C24880OooOOoo> arrayListOooO0o = c24890OooOooo.OooO0o();
                boolean zIsEmpty = arrayListOooO0o.isEmpty();
                if (!zIsEmpty) {
                    for (C24880OooOOoo c24880OooOOoo : arrayListOooO0o) {
                        c24890OooOooo.OooOOOO(C24841OooOOo0.OooO00o.f84283OooOo0o, c24880OooOOoo.f84457OooO00o);
                        c24890OooOooo.OooOO0o(-1L, c24880OooOOoo.f84457OooO00o);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = c24878OooOOoOooOoO0.f84451OooO00o;
                workDatabase_Impl2.OooO0O0();
                C24879OooOOo0 c24879OooOOo0 = c24878OooOOoOooOoO0.f84453OooO0OO;
                InterfaceC24759OooO0o interfaceC24759OooO0oOooO0oo = c24879OooOOo0.OooO0oo();
                workDatabase_Impl2.OooO0OO();
                try {
                    interfaceC24759OooO0oOooO0oo.OooOo0();
                    workDatabase_Impl2.OooOOoo();
                    workDatabase_Impl2.OooOOOo();
                    c24879OooOOo0.OooOO0o(interfaceC24759OooO0oOooO0oo);
                    workDatabase.OooOOoo();
                    workDatabase.OooOOOo();
                    boolean z2 = !zIsEmpty || z;
                    Long lOooO0O0 = oooOO0O.f84366OooO0oO.f84515OooO00o.OooOo0O().OooO0O0("reschedule_needed");
                    String str2 = f66736OooOoO;
                    if (lOooO0O0 != null && lOooO0O0.longValue() == 1) {
                        OooOO0O.OooO0OO().OooO00o(str2, "Rescheduling Workers.", new Throwable[0]);
                        oooOO0O.ooOO();
                        C24903OooOO0O c24903OooOO0O = oooOO0O.f84366OooO0oO;
                        c24903OooOO0O.getClass();
                        c24903OooOO0O.f84515OooO00o.OooOo0O().OooO0OO(new C24872OooO0Oo("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i = BuildCompat.isAtLeastS() ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
                    } catch (IllegalArgumentException e) {
                        e = e;
                        OooOO0O.OooO0OO().OooO0o(str2, "Ignoring exception", e);
                    } catch (SecurityException e2) {
                        e = e2;
                        OooOO0O.OooO0OO().OooO0o(str2, "Ignoring exception", e);
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List historicalProcessExitReasons = ((ActivityManager) context.getSystemService(C18361t4.f56218b)).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                                if (C24898OooO0o.OooO00o(historicalProcessExitReasons.get(i2)).getReason() == 10) {
                                    OooOO0O.OooO0OO().OooO00o(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                                    oooOO0O.ooOO();
                                    return;
                                }
                            }
                        }
                        if (z2) {
                            return;
                        }
                        OooOO0O.OooO0OO().OooO00o(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                        OooO0o.OooO00o(oooOO0O.f84361OooO0O0, oooOO0O.f84362OooO0OO, oooOO0O.f84365OooO0o0);
                        return;
                    }
                    if (broadcast == null) {
                        OooO0OO(context);
                        OooOO0O.OooO0OO().OooO00o(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                        oooOO0O.ooOO();
                        return;
                    }
                    if (z2) {
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.OooOOOo();
                    c24879OooOOo0.OooOO0o(interfaceC24759OooO0oOooO0oo);
                    throw th2;
                }
            } finally {
                workDatabase.OooOOOo();
            }
        } finally {
            cursorOooO.close();
            c24681OooOoo0OooOOO0.release();
        }
    }

    public final boolean OooO0O0() {
        OooO00o oooO00o = this.f66738OooOo.f84361OooO0O0;
        oooO00o.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f66736OooOoO;
        if (zIsEmpty) {
            OooOO0O.OooO0OO().OooO00o(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zOooO00o = C24906OooOOO0.OooO00o(this.f66739OooOo0o, oooO00o);
        OooOO0O.OooO0OO().OooO00o(str, OooO0O0.OooO0O0("Is default app process = ", zOooO00o), new Throwable[0]);
        return zOooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f66736OooOoO;
        o00O0OO0.OooOO0O oooOO0O = this.f66738OooOo;
        try {
            if (!OooO0O0()) {
                return;
            }
            while (true) {
                o00O0OO0.OooOO0.OooO00o(this.f66739OooOo0o);
                OooOO0O.OooO0OO().OooO00o(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    OooO00o();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.f66740OooOoO0 + 1;
                    this.f66740OooOoO0 = i;
                    if (i >= 3) {
                        OooOO0O.OooO0OO().OooO0O0(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        oooOO0O.f84361OooO0O0.getClass();
                        throw illegalStateException;
                    }
                    OooOO0O.OooO0OO().OooO00o(str, "Retrying after " + (((long) i) * 300), e);
                    try {
                        Thread.sleep(((long) this.f66740OooOoO0) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            oooOO0O.o0OoOo0();
        }
    }
}
