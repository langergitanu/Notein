package o0O0ooO;

import android.animation.ValueAnimator;
import o0O0ooO.C26216OooO0Oo;

/* JADX INFO: renamed from: o0O0ooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C26214OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C26216OooO0Oo.OooO00o f89547OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C26216OooO0Oo f89548OooO0O0;

    public C26214OooO0O0(C26216OooO0Oo c26216OooO0Oo, C26216OooO0Oo.OooO00o oooO00o) {
        this.f89548OooO0O0 = c26216OooO0Oo;
        this.f89547OooO00o = oooO00o;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C26216OooO0Oo c26216OooO0Oo = this.f89548OooO0O0;
        c26216OooO0Oo.getClass();
        C26216OooO0Oo.OooO00o oooO00o = this.f89547OooO00o;
        C26216OooO0Oo.OooO0Oo(fFloatValue, oooO00o);
        c26216OooO0Oo.OooO00o(fFloatValue, oooO00o, false);
        c26216OooO0Oo.invalidateSelf();
    }
}
