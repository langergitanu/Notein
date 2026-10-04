package o00O0O0o;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f84289OooO00o = OooOO0O.OooO0o0("WorkerFactory");

    public abstract ListenableWorker OooO00o(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker OooO0O0(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f84289OooO00o;
        ListenableWorker listenableWorkerOooO00o = OooO00o(context, str, workerParameters);
        if (listenableWorkerOooO00o == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                OooOO0O.OooO0OO().OooO0O0(str2, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Invalid class: ", str), th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerOooO00o = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    OooOO0O.OooO0OO().OooO0O0(str2, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Could not instantiate ", str), th2);
                }
            }
        }
        if (listenableWorkerOooO00o == null || !listenableWorkerOooO00o.f66670OooOoO) {
            return listenableWorkerOooO00o;
        }
        throw new IllegalStateException(androidx.core.database.OooO00o.OooO00o("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
