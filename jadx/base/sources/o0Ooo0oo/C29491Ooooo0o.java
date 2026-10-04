package o0Ooo0oo;

import android.animation.ValueAnimator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import o0OoO0oo.C28971o0OO00O;

/* JADX INFO: renamed from: o0Ooo0oo.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29491Ooooo0o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f104592OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104593OooO0O0;

    public C29491Ooooo0o(PenBarChildFragment penBarChildFragment) {
        this.f104593OooO0O0 = penBarChildFragment;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) C28971o0OO00O.OooO00o(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View view = this.f104593OooO0O0.f75248OooOooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view.setX((fFloatValue - this.f104592OooO00o) + view.getX());
        this.f104592OooO00o = fFloatValue;
    }
}
