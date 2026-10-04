package o0OoOOo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;

/* JADX INFO: renamed from: o0OoOOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29143OooOOOo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AudioBarChildFragment f103307OooO00o;

    public C29143OooOOOo(AudioBarChildFragment audioBarChildFragment) {
        this.f103307OooO00o = audioBarChildFragment;
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
        View view = this.f103307OooO00o.f74161OooOooo;
        if (view != null) {
            view.setVisibility(0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
    }
}
