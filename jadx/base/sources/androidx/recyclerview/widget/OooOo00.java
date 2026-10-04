package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.C22041OooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C22041OooOOo.OooO0o f66020OooO00o;

    public OooOo00(C22041OooOOo.OooO0o oooO0o) {
        this.f66020OooO00o = oooO0o;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f66020OooO00o.f65990OooOOO0 = valueAnimator.getAnimatedFraction();
    }
}
