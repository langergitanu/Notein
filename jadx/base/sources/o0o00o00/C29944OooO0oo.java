package o0o00o00;

import android.animation.Animator;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o00o00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29944OooO0oo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FavoriteToolBox f106322OooO00o;

    public C29944OooO0oo(FavoriteToolBox favoriteToolBox) {
        this.f106322OooO00o = favoriteToolBox;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        OooOOO0.OooO0oO(animation, "animation");
        this.f106322OooO00o.setRotation(0.0f);
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
