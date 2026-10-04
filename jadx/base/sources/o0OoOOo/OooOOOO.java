package o0OoOOo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AudioBarChildFragment f103305OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f103306OooO0O0;

    public OooOOOO(AudioBarChildFragment audioBarChildFragment, boolean z) {
        this.f103305OooO00o = audioBarChildFragment;
        this.f103306OooO0O0 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.f103305OooO00o.f74161OooOooo;
        if (view != null) {
            view.setVisibility(this.f103306OooO0O0 ? 0 : 8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
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
