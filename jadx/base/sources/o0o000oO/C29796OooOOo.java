package o0o000oO;

import android.animation.Animator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;

/* JADX INFO: renamed from: o0o000oO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29796OooOOo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextStyleBarChildFragment f105764OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f105765OooO0O0;

    public C29796OooOOo(TextStyleBarChildFragment textStyleBarChildFragment, boolean z) {
        this.f105764OooO00o = textStyleBarChildFragment;
        this.f105765OooO0O0 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ConstraintLayout constraintLayout = this.f105764OooO00o.f76432OooOooo;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(this.f105765OooO0O0 ? 0 : 8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clRootView");
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
