package o0o000oo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.toolbar.ToolbarChildFragment;

/* JADX INFO: renamed from: o0o000oo.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29849OoooOo0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ToolbarChildFragment f105879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f105880OooO0O0;

    public C29849OoooOo0(ToolbarChildFragment toolbarChildFragment, boolean z) {
        this.f105879OooO00o = toolbarChildFragment;
        this.f105880OooO0O0 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.f105879OooO00o.f76709OoooooO;
        if (view != null) {
            view.setVisibility(this.f105880OooO0O0 ? 0 : 8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clSecondaryTools");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
