package o0o00Oo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;

/* JADX INFO: renamed from: o0o00Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29905OooOOo0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBox f106104OooO00o;

    public C29905OooOOo0(PenBox penBox) {
        this.f106104OooO00o = penBox;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.f106104OooO00o.f76791o0ooOoO;
        if (view != null) {
            view.setAlpha(1.0f);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
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
