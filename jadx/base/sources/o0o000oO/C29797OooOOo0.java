package o0o000oO;

import android.animation.Animator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;

/* JADX INFO: renamed from: o0o000oO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29797OooOOo0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextStyleBarChildFragment f105766OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f105767OooO0O0;

    public C29797OooOOo0(TextStyleBarChildFragment textStyleBarChildFragment, boolean z) {
        this.f105766OooO00o = textStyleBarChildFragment;
        this.f105767OooO0O0 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ConstraintLayout constraintLayout = this.f105766OooO00o.f76432OooOooo;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(this.f105767OooO0O0 ? 0 : 8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clRootView");
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
