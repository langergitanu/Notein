package o0O0O0oo;

import android.animation.Animator;
import android.view.View;
import com.lzf.easyfloat.widget.ParentFrameLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0OO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C25875OooO0O0 f88303OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ View f88304OooO0O0;

    public OooO0OO(C25875OooO0O0 c25875OooO0O0, View view) {
        this.f88303OooO00o = c25875OooO0O0;
        this.f88304OooO0O0 = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ParentFrameLayout parentFrameLayout;
        C25875OooO0O0 c25875OooO0O0 = this.f88303OooO00o;
        c25875OooO0O0.f88293OooO0O0.setAnim(false);
        if (!c25875OooO0O0.f88293OooO0O0.getImmersionStatusBar()) {
            c25875OooO0O0.OooO0OO().flags = 40;
        }
        if (!c25875OooO0O0.f88293OooO0O0.getHasEditText() || (parentFrameLayout = c25875OooO0O0.f88297OooO0o0) == null) {
            return;
        }
        c25875OooO0O0.OooO0oO(parentFrameLayout);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f88304OooO0O0.setVisibility(0);
        this.f88303OooO00o.f88293OooO0O0.setAnim(true);
    }
}
