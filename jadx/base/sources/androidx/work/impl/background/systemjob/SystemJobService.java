package androidx.work.impl.background.systemjob;

import Oooo0oO.C21111o0ooOoO;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o00O0O0o.OooOO0O;
import o00O0OO0.C24845OooO0Oo;
import o00O0OO0.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements OooO0O0 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final String f66727OooOoO0 = OooOO0O.OooO0o0("SystemJobService");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HashMap f66728OooOo = new HashMap();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o00O0OO0.OooOO0O f66729OooOo0o;

    @Override // o00O0OO0.OooO0O0
    public final void OooO0O0(String str, boolean z) {
        JobParameters jobParameters;
        OooOO0O.OooO0OO().OooO00o(f66727OooOoO0, C21111o0ooOoO.OooO0Oo(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f66728OooOo) {
            jobParameters = (JobParameters) this.f66728OooOo.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            o00O0OO0.OooOO0O oooOO0OOoooooO = o00O0OO0.OooOO0O.OoooooO(getApplicationContext());
            this.f66729OooOo0o = oooOO0OOoooooO;
            oooOO0OOoooooO.f84364OooO0o.OooO00o(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            OooOO0O.OooO0OO().OooO0o(f66727OooOoO0, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o00O0OO0.OooOO0O oooOO0O = this.f66729OooOo0o;
        if (oooOO0O != null) {
            oooOO0O.f84364OooO0o.OooO0o0(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f66729OooOo0o == null) {
            OooOO0O.OooO0OO().OooO00o(f66727OooOoO0, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            OooOO0O.OooO0OO().OooO0O0(f66727OooOoO0, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f66728OooOo) {
            try {
                if (this.f66728OooOo.containsKey(string)) {
                    OooOO0O.OooO0OO().OooO00o(f66727OooOoO0, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                OooOO0O.OooO0OO().OooO00o(f66727OooOoO0, "onStartJob for " + string, new Throwable[0]);
                this.f66728OooOo.put(string, jobParameters);
                int i = Build.VERSION.SDK_INT;
                WorkerParameters.OooO00o oooO00o = new WorkerParameters.OooO00o();
                List list = Collections.EMPTY_LIST;
                oooO00o.f66696OooO00o = list;
                oooO00o.f66697OooO0O0 = list;
                if (jobParameters.getTriggeredContentUris() != null) {
                    oooO00o.f66697OooO0O0 = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    oooO00o.f66696OooO00o = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    jobParameters.getNetwork();
                }
                this.f66729OooOo0o.o00O0O(string, oooO00o);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        PersistableBundle extras;
        if (this.f66729OooOo0o == null) {
            OooOO0O.OooO0OO().OooO00o(f66727OooOoO0, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            OooOO0O.OooO0OO().OooO0O0(f66727OooOoO0, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        OooOO0O.OooO0OO().OooO00o(f66727OooOoO0, OooO00o.OooO00o("onStopJob for ", string), new Throwable[0]);
        synchronized (this.f66728OooOo) {
            this.f66728OooOo.remove(string);
        }
        this.f66729OooOo0o.o00Oo0(string);
        C24845OooO0Oo c24845OooO0Oo = this.f66729OooOo0o.f84364OooO0o;
        synchronized (c24845OooO0Oo.f84339Oooo00O) {
            zContains = c24845OooO0Oo.f84337OooOooo.contains(string);
        }
        return !zContains;
    }
}
