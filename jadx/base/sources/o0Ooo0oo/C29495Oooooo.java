package o0Ooo0oo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;

/* JADX INFO: renamed from: o0Ooo0oo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29495Oooooo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104597OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f104598OooO0O0;

    public C29495Oooooo(PenBarChildFragment penBarChildFragment, boolean z) {
        this.f104597OooO00o = penBarChildFragment;
        this.f104598OooO0O0 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.f104597OooO00o.f75248OooOooo;
        if (view != null) {
            view.setVisibility(this.f104598OooO0O0 ? 0 : 8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
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
