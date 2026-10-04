package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: renamed from: androidx.appcompat.app.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC21490OooOOo0 implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f62462OooOo0o;

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOOo0$OooO00o */
    public class OooO00o extends ViewPropertyAnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            RunnableC21490OooOOo0 runnableC21490OooOOo0 = RunnableC21490OooOOo0.this;
            runnableC21490OooOOo0.f62462OooOo0o.f62346OoooO0.setAlpha(1.0f);
            runnableC21490OooOOo0.f62462OooOo0o.f62349OoooOO0.setListener(null);
            runnableC21490OooOOo0.f62462OooOo0o.f62349OoooOO0 = null;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationStart(View view) {
            RunnableC21490OooOOo0.this.f62462OooOo0o.f62346OoooO0.setVisibility(0);
        }
    }

    public RunnableC21490OooOOo0(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f62462OooOo0o = appCompatDelegateImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        AppCompatDelegateImpl appCompatDelegateImpl = this.f62462OooOo0o;
        appCompatDelegateImpl.f62348OoooO0O.showAtLocation(appCompatDelegateImpl.f62346OoooO0, 55, 0, 0);
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.f62349OoooOO0;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
        if (!(appCompatDelegateImpl.f62350OoooOOO && (viewGroup = appCompatDelegateImpl.f62351OoooOOo) != null && viewGroup.isLaidOut())) {
            appCompatDelegateImpl.f62346OoooO0.setAlpha(1.0f);
            appCompatDelegateImpl.f62346OoooO0.setVisibility(0);
        } else {
            appCompatDelegateImpl.f62346OoooO0.setAlpha(0.0f);
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = ViewCompat.animate(appCompatDelegateImpl.f62346OoooO0).alpha(1.0f);
            appCompatDelegateImpl.f62349OoooOO0 = viewPropertyAnimatorCompatAlpha;
            viewPropertyAnimatorCompatAlpha.setListener(new OooO00o());
        }
    }
}
