package o0o00o00;

import android.animation.Animator;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o00o00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29943OooO0oO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FavoriteToolBox f106321OooO00o;

    public C29943OooO0oO(FavoriteToolBox favoriteToolBox) {
        this.f106321OooO00o = favoriteToolBox;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        OooOOO0.OooO0oO(animation, "animation");
        this.f106321OooO00o.setRotation(-90.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        OooOOO0.OooO0oO(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        OooOOO0.OooO0oO(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        OooOOO0.OooO0oO(animation, "animation");
    }
}
