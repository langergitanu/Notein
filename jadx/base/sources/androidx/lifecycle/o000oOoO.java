package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22003OoooO00;
import com.huawei.hms.network.embedded.C18361t4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m80612d2 = {"Landroidx/lifecycle/o000oOoO;", "Landroid/app/Fragment;", "<init>", "()V", "OooO00o", "OooO0O0", "lifecycle-runtime_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class o000oOoO extends Fragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f65680OooOo = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C22003OoooO00.OooO0O0 f65681OooOo0o;

    public static final class OooO00o {
        /* JADX WARN: Multi-variable type inference failed */
        public static void OooO00o(Activity activity, AbstractC21979OooOOo0.OooO00o event) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
            if (activity instanceof Oooo000) {
                ((Oooo000) activity).getLifecycle().OooO0o(event);
            } else if (activity instanceof InterfaceC21987OooOoo) {
                AbstractC21979OooOOo0 lifecycle = ((InterfaceC21987OooOoo) activity).getLifecycle();
                if (lifecycle instanceof C21990OooOooo) {
                    ((C21990OooOooo) lifecycle).OooO0o(event);
                }
            }
        }

        public static void OooO0O0(Activity activity) {
            if (Build.VERSION.SDK_INT >= 29) {
                OooO0O0.INSTANCE.getClass();
                activity.registerActivityLifecycleCallbacks(new OooO0O0());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new o000oOoO(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    @Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u000e¨\u0006\u001b"}, m80612d2 = {"Landroidx/lifecycle/o000oOoO$OooO0O0;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", C18361t4.f56218b, "Landroid/os/Bundle;", "bundle", "LoO00ooO/OooOooO;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "savedInstanceState", "onActivityPostCreated", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityPostStarted", "onActivityResumed", "onActivityPostResumed", "onActivityPrePaused", "onActivityPaused", "onActivityPreStopped", "onActivityStopped", "onActivitySaveInstanceState", "onActivityPreDestroyed", "onActivityDestroyed", "Companion", "OooO00o", "lifecycle-runtime_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class OooO0O0 implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: androidx.lifecycle.o000oOoO$OooO0O0$OooO00o, reason: from kotlin metadata */
        public static final class Companion {
        }

        public static final void registerIn(Activity activity) {
            INSTANCE.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new OooO0O0());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle savedInstanceState) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            int i = o000oOoO.f65680OooOo;
            OooO00o.OooO00o(activity, AbstractC21979OooOOo0.OooO00o.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            int i = o000oOoO.f65680OooOo;
            OooO00o.OooO00o(activity, AbstractC21979OooOOo0.OooO00o.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            int i = o000oOoO.f65680OooOo;
            OooO00o.OooO00o(activity, AbstractC21979OooOOo0.OooO00o.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            int i = o000oOoO.f65680OooOo;
            OooO00o.OooO00o(activity, AbstractC21979OooOOo0.OooO00o.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            int i = o000oOoO.f65680OooOo;
            OooO00o.OooO00o(activity, AbstractC21979OooOOo0.OooO00o.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            int i = o000oOoO.f65680OooOo;
            OooO00o.OooO00o(activity, AbstractC21979OooOOo0.OooO00o.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        }
    }

    public final void OooO00o(AbstractC21979OooOOo0.OooO00o oooO00o) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.OooOOO0.OooO0o(activity, "activity");
            OooO00o.OooO00o(activity, oooO00o);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        OooO00o(AbstractC21979OooOOo0.OooO00o.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OooO00o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY);
        this.f65681OooOo0o = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        OooO00o(AbstractC21979OooOOo0.OooO00o.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C22003OoooO00.OooO0O0 oooO0O0 = this.f65681OooOo0o;
        if (oooO0O0 != null) {
            C22003OoooO00.this.OooO00o();
        }
        OooO00o(AbstractC21979OooOOo0.OooO00o.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C22003OoooO00.OooO0O0 oooO0O0 = this.f65681OooOo0o;
        if (oooO0O0 != null) {
            C22003OoooO00 c22003OoooO00 = C22003OoooO00.this;
            int i = c22003OoooO00.f65633OooOo0o + 1;
            c22003OoooO00.f65633OooOo0o = i;
            if (i == 1 && c22003OoooO00.f65634OooOoO) {
                c22003OoooO00.f65638OooOoo0.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_START);
                c22003OoooO00.f65634OooOoO = false;
            }
        }
        OooO00o(AbstractC21979OooOOo0.OooO00o.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        OooO00o(AbstractC21979OooOOo0.OooO00o.ON_STOP);
    }
}
