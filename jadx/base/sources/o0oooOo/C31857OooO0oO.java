package o0oooOo;

import android.os.AsyncTask;
import androidx.fragment.app.ActivityC21897OooOo0;
import java.lang.ref.WeakReference;
import o0oooOOo.C31845OooO0Oo;
import o0oooOOo.C31850OooOO0;

/* JADX INFO: renamed from: o0oooOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31857OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31845OooO0Oo.OooO00o f113550OooO00o;

    public C31857OooO0oO() {
        C31845OooO0Oo.OooO00o oooO00o = new C31845OooO0Oo.OooO00o();
        oooO00o.f113495OooO00o = null;
        oooO00o.f113496OooO0O0 = null;
        oooO00o.f113497OooO0OO = null;
        Boolean bool = Boolean.FALSE;
        oooO00o.f113498OooO0Oo = bool;
        oooO00o.f113500OooO0o0 = ActivityC31851OooO00o.class;
        oooO00o.f113499OooO0o = "code";
        oooO00o.f113501OooO0oO = false;
        oooO00o.f113503OooOO0 = Boolean.TRUE;
        oooO00o.f113504OooOO0O = bool;
        this.f113550OooO00o = oooO00o;
    }

    public final C31850OooOO0 OooO00o(ActivityC21897OooOo0 activityC21897OooOo0) {
        C31845OooO0Oo.OooO00o oooO00o = this.f113550OooO00o;
        if (oooO00o.f113502OooO0oo == null) {
            if (activityC21897OooOo0 == null) {
                throw new IllegalArgumentException("please set Context or Activity!!!");
            }
            oooO00o.f113502OooO0oo = activityC21897OooOo0.getApplicationContext().getApplicationContext();
        }
        C31850OooOO0 c31850OooOO0 = new C31850OooOO0(new CallableC31855OooO0o(this, new WeakReference(activityC21897OooOo0)));
        AsyncTask.THREAD_POOL_EXECUTOR.execute(c31850OooOO0);
        return c31850OooOO0;
    }
}
