package o00O0o0;

import OooOoo.C20593OooO0Oo;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collections;
import o00O0O0o.OooOO0O;
import o00O0OOo.C24855OooO0Oo;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;
import o00O0o00.C24932OooO0OO;

/* JADX INFO: renamed from: o00O0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24924OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f84565OooOo0o;

    public RunnableC24924OooO00o(ConstraintTrackingWorker constraintTrackingWorker) {
        this.f84565OooOo0o = constraintTrackingWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConstraintTrackingWorker constraintTrackingWorker = this.f84565OooOo0o;
        String strOooO0O0 = constraintTrackingWorker.f66668OooOo.f66692OooO0O0.OooO0O0("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strOooO0O0)) {
            OooOO0O.OooO0OO().OooO0O0(ConstraintTrackingWorker.f66742Oooo00O, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f66746OooOooo.OooO(new ListenableWorker.OooO00o.C19046OooO00o());
            return;
        }
        ListenableWorker listenableWorkerOooO0O0 = constraintTrackingWorker.f66668OooOo.f66695OooO0o0.OooO0O0(constraintTrackingWorker.f66669OooOo0o, strOooO0O0, constraintTrackingWorker.f66744OooOoo0);
        constraintTrackingWorker.f66747Oooo000 = listenableWorkerOooO0O0;
        if (listenableWorkerOooO0O0 == null) {
            OooOO0O.OooO0OO().OooO00o(ConstraintTrackingWorker.f66742Oooo00O, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f66746OooOooo.OooO(new ListenableWorker.OooO00o.C19046OooO00o());
            return;
        }
        C24880OooOOoo c24880OooOOooOooOO0 = ((C24890OooOooo) o00O0OO0.OooOO0O.OoooooO(constraintTrackingWorker.f66669OooOo0o).f84362OooO0OO.OooOoO()).OooOO0(constraintTrackingWorker.f66668OooOo.f66691OooO00o.toString());
        if (c24880OooOOooOooOO0 == null) {
            constraintTrackingWorker.f66746OooOooo.OooO(new ListenableWorker.OooO00o.C19046OooO00o());
            return;
        }
        Context context = constraintTrackingWorker.f66669OooOo0o;
        C24855OooO0Oo c24855OooO0Oo = new C24855OooO0Oo(context, o00O0OO0.OooOO0O.OoooooO(context).f84363OooO0Oo, constraintTrackingWorker);
        c24855OooO0Oo.OooO0O0(Collections.singletonList(c24880OooOOooOooOO0));
        if (!c24855OooO0Oo.OooO00o(constraintTrackingWorker.f66668OooOo.f66691OooO00o.toString())) {
            OooOO0O.OooO0OO().OooO00o(ConstraintTrackingWorker.f66742Oooo00O, C20593OooO0Oo.OooO0O0("Constraints not met for delegate ", strOooO0O0, ". Requesting retry."), new Throwable[0]);
            constraintTrackingWorker.f66746OooOooo.OooO(new ListenableWorker.OooO00o.OooO0O0());
            return;
        }
        OooOO0O.OooO0OO().OooO00o(ConstraintTrackingWorker.f66742Oooo00O, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Constraints met for delegate ", strOooO0O0), new Throwable[0]);
        try {
            C24932OooO0OO c24932OooO0OOOooO0o0 = constraintTrackingWorker.f66747Oooo000.OooO0o0();
            c24932OooO0OOOooO0o0.addListener(new RunnableC24925OooO0O0(constraintTrackingWorker, c24932OooO0OOOooO0o0), constraintTrackingWorker.f66668OooOo.f66693OooO0OO);
        } catch (Throwable th) {
            OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO();
            String str = ConstraintTrackingWorker.f66742Oooo00O;
            oooOO0OOooO0OO.OooO00o(str, C20593OooO0Oo.OooO0O0("Delegated worker ", strOooO0O0, " threw exception in startWork."), th);
            synchronized (constraintTrackingWorker.f66743OooOoo) {
                try {
                    if (constraintTrackingWorker.f66745OooOooO) {
                        OooOO0O.OooO0OO().OooO00o(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        constraintTrackingWorker.f66746OooOooo.OooO(new ListenableWorker.OooO00o.OooO0O0());
                    } else {
                        constraintTrackingWorker.f66746OooOooo.OooO(new ListenableWorker.OooO00o.C19046OooO00o());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
