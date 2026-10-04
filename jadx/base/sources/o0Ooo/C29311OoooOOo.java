package o0Ooo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;

/* JADX INFO: renamed from: o0Ooo.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29311OoooOOo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103954OooO00o;

    public C29311OoooOOo(PenBoxChildFragment penBoxChildFragment) {
        this.f103954OooO00o = penBoxChildFragment;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.f103954OooO00o.f75363Oooo0;
        if (view != null) {
            view.setAlpha(1.0f);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
