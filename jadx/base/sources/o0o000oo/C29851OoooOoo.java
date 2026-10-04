package o0o000oo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.toolbar.ToolbarChildFragment;

/* JADX INFO: renamed from: o0o000oo.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29851OoooOoo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ToolbarChildFragment f105883OooO00o;

    public C29851OoooOoo(ToolbarChildFragment toolbarChildFragment) {
        this.f105883OooO00o = toolbarChildFragment;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f105883OooO00o.f76709OoooooO;
        if (view != null) {
            view.setVisibility(0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clSecondaryTools");
            throw null;
        }
    }
}
