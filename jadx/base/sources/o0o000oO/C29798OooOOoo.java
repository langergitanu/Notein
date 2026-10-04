package o0o000oO;

import android.animation.Animator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;

/* JADX INFO: renamed from: o0o000oO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29798OooOOoo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextStyleBarChildFragment f105768OooO00o;

    public C29798OooOOoo(TextStyleBarChildFragment textStyleBarChildFragment) {
        this.f105768OooO00o = textStyleBarChildFragment;
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
        ConstraintLayout constraintLayout = this.f105768OooO00o.f76432OooOooo;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clRootView");
            throw null;
        }
    }
}
