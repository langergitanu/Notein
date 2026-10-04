package o0O0O0oo;

import android.animation.Animator;
import android.view.View;
import com.lzf.easyfloat.data.FloatConfig;

/* JADX INFO: renamed from: o0O0O0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25878OooO0oO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C25879OooO0oo f88313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ View f88314OooO0O0;

    public C25878OooO0oO(C25879OooO0oo c25879OooO0oo, View view) {
        this.f88313OooO00o = c25879OooO0oo;
        this.f88314OooO0O0 = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        FloatConfig floatConfig = this.f88313OooO00o.f88317OooO0O0;
        floatConfig.setAnim(false);
        floatConfig.getCallbacks();
        o0O0OO0.OooO00o floatCallbacks = floatConfig.getFloatCallbacks();
        if (floatCallbacks == null) {
            return;
        }
        floatCallbacks.OooO00o();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FloatConfig floatConfig = this.f88313OooO00o.f88317OooO0O0;
        floatConfig.setAnim(false);
        floatConfig.getCallbacks();
        o0O0OO0.OooO00o floatCallbacks = floatConfig.getFloatCallbacks();
        if (floatCallbacks == null) {
            return;
        }
        floatCallbacks.OooO00o();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f88313OooO00o.f88317OooO0O0.setAnim(true);
    }
}
