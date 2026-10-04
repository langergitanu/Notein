package o00OO00O;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.Choreographer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends OooO00o implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f84751OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f84752OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f84753OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f84754OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f84755OooOooO;

    public final boolean OooO0O0() {
        return this.f84751OooOoO < 0.0f;
    }

    public final void OooO0OO(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f84755OooOooO = false;
        }
    }

    public final void OooO0Oo(float f) {
        if (this.f84754OooOoo0 == f) {
            return;
        }
        float fOooO0O0 = C24985OooO0oO.OooO0O0(f, 0.0f, 0.0f);
        this.f84754OooOoo0 = fOooO0O0;
        this.f84753OooOoo = fOooO0O0;
        Iterator it = this.f84746OooOo0o.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f84745OooOo.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        OooO00o(OooO0O0());
        OooO0OO(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f84755OooOooO) {
            OooO0OO(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        return 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(0.0f);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        return 0L;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f84755OooOooO;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f84752OooOoOO) {
            return;
        }
        this.f84752OooOoOO = false;
        this.f84751OooOoO = -this.f84751OooOoO;
    }
}
