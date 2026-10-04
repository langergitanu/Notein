package o0OoOOo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AudioBarChildFragment f103300OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f103301OooO0O0;

    public OooOOO(AudioBarChildFragment audioBarChildFragment, boolean z) {
        this.f103300OooO00o = audioBarChildFragment;
        this.f103301OooO0O0 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.f103300OooO00o.f74161OooOooo;
        if (view != null) {
            view.setVisibility(this.f103301OooO0O0 ? 0 : 8);
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
