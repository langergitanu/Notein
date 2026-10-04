package o0Ooo;

import android.animation.ValueAnimator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import o0OoO0oo.C28971o0OO00O;

/* JADX INFO: renamed from: o0Ooo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29306OoooO0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103946OooO00o;

    public C29306OoooO0(PenBoxChildFragment penBoxChildFragment) {
        this.f103946OooO00o = penBoxChildFragment;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) C28971o0OO00O.OooO00o(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View view = this.f103946OooO00o.f75365Oooo00O;
        if (view != null) {
            view.setX(fFloatValue);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
    }
}
