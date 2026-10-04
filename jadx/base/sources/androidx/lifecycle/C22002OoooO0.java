package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22003OoooO00;
import com.huawei.hms.network.embedded.C18361t4;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.lifecycle.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m80612d2 = {"Landroidx/lifecycle/OoooO0;", "Landroidx/lifecycle/OooOO0;", "Landroid/app/Activity;", C18361t4.f56218b, "Landroid/os/Bundle;", "savedInstanceState", "LoO00ooO/OooOooO;", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class C22002OoooO0 extends OooOO0 {
    final /* synthetic */ C22003OoooO00 this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.OoooO0$OooO00o */
    @Metadata(m80611d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m80612d2 = {"androidx/lifecycle/OoooO0$OooO00o", "Landroidx/lifecycle/OooOO0;", "Landroid/app/Activity;", C18361t4.f56218b, "LoO00ooO/OooOooO;", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class OooO00o extends OooOO0 {
        final /* synthetic */ C22003OoooO00 this$0;

        public OooO00o(C22003OoooO00 c22003OoooO00) {
            this.this$0 = c22003OoooO00;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            this.this$0.OooO00o();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            C22003OoooO00 c22003OoooO00 = this.this$0;
            int i = c22003OoooO00.f65633OooOo0o + 1;
            c22003OoooO00.f65633OooOo0o = i;
            if (i == 1 && c22003OoooO00.f65634OooOoO) {
                c22003OoooO00.f65638OooOoo0.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_START);
                c22003OoooO00.f65634OooOoO = false;
            }
        }
    }

    public C22002OoooO0(C22003OoooO00 c22003OoooO00) {
        this.this$0 = c22003OoooO00;
    }

    @Override // androidx.lifecycle.OooOO0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = o000oOoO.f65680OooOo;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.OooOOO0.OooO0o0(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((o000oOoO) fragmentFindFragmentByTag).f65681OooOo0o = this.this$0.f65639OooOooO;
        }
    }

    @Override // androidx.lifecycle.OooOO0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        C22003OoooO00 c22003OoooO00 = this.this$0;
        int i = c22003OoooO00.f65632OooOo - 1;
        c22003OoooO00.f65632OooOo = i;
        if (i == 0) {
            Handler handler = c22003OoooO00.f65636OooOoOO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(handler);
            handler.postDelayed(c22003OoooO00.f65637OooOoo, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        C22003OoooO00.OooO00o.OooO00o(activity, new OooO00o(this.this$0));
    }

    @Override // androidx.lifecycle.OooOO0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        C22003OoooO00 c22003OoooO00 = this.this$0;
        int i = c22003OoooO00.f65633OooOo0o - 1;
        c22003OoooO00.f65633OooOo0o = i;
        if (i == 0 && c22003OoooO00.f65635OooOoO0) {
            c22003OoooO00.f65638OooOoo0.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_STOP);
            c22003OoooO00.f65634OooOoO = true;
        }
    }
}
