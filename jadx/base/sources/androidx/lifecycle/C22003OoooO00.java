package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.AbstractC21979OooOOo0;

/* JADX INFO: renamed from: androidx.lifecycle.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22003OoooO00 implements InterfaceC21987OooOoo {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final C22003OoooO00 f65631OooOooo = new C22003OoooO00();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f65632OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f65633OooOo0o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Handler f65636OooOoOO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f65635OooOoO0 = true;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f65634OooOoO = true;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C21990OooOooo f65638OooOoo0 = new C21990OooOooo(this);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final RunnableC21991Oooo f65637OooOoo = new Runnable() { // from class: androidx.lifecycle.Oooo
        @Override // java.lang.Runnable
        public final void run() {
            C22003OoooO00 this$0 = this.f65571OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
            int i = this$0.f65632OooOo;
            C21990OooOooo c21990OooOooo = this$0.f65638OooOoo0;
            if (i == 0) {
                this$0.f65635OooOoO0 = true;
                c21990OooOooo.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_PAUSE);
            }
            if (this$0.f65633OooOo0o == 0 && this$0.f65635OooOoO0) {
                c21990OooOooo.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_STOP);
                this$0.f65634OooOoO = true;
            }
        }
    };

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final OooO0O0 f65639OooOooO = new OooO0O0();

    /* JADX INFO: renamed from: androidx.lifecycle.OoooO00$OooO00o */
    public static final class OooO00o {
        public static final void OooO00o(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            kotlin.jvm.internal.OooOOO0.OooO0oO(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.OoooO00$OooO0O0 */
    public static final class OooO0O0 {
        public OooO0O0() {
        }
    }

    public final void OooO00o() {
        int i = this.f65632OooOo + 1;
        this.f65632OooOo = i;
        if (i == 1) {
            if (this.f65635OooOoO0) {
                this.f65638OooOoo0.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_RESUME);
                this.f65635OooOoO0 = false;
            } else {
                Handler handler = this.f65636OooOoOO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(handler);
                handler.removeCallbacks(this.f65637OooOoo);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC21987OooOoo
    public final AbstractC21979OooOOo0 getLifecycle() {
        return this.f65638OooOoo0;
    }
}
