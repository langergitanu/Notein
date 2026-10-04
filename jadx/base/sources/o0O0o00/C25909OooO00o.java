package o0O0o00;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;

/* JADX INFO: renamed from: o0O0o00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25909OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public PDFView f88443OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ValueAnimator f88444OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OverScroller f88445OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f88446OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f88447OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f88448OooO0o0;

    /* JADX INFO: renamed from: o0O0o00.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19731OooO00o extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public C19731OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C25909OooO00o c25909OooO00o = C25909OooO00o.this;
            c25909OooO00o.f88443OooO00o.Oooo0oO();
            c25909OooO00o.f88448OooO0o0 = false;
            c25909OooO00o.OooO00o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C25909OooO00o c25909OooO00o = C25909OooO00o.this;
            c25909OooO00o.f88443OooO00o.Oooo0oO();
            c25909OooO00o.f88448OooO0o0 = false;
            c25909OooO00o.OooO00o();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C25909OooO00o c25909OooO00o = C25909OooO00o.this;
            PDFView pDFView = c25909OooO00o.f88443OooO00o;
            pDFView.Oooo(fFloatValue, pDFView.getCurrentYOffset(), true);
            c25909OooO00o.f88443OooO00o.Oooo0o();
        }
    }

    /* JADX INFO: renamed from: o0O0o00.OooO00o$OooO0O0 */
    public class OooO0O0 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public OooO0O0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C25909OooO00o c25909OooO00o = C25909OooO00o.this;
            c25909OooO00o.f88443OooO00o.Oooo0oO();
            c25909OooO00o.f88448OooO0o0 = false;
            c25909OooO00o.OooO00o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C25909OooO00o c25909OooO00o = C25909OooO00o.this;
            c25909OooO00o.f88443OooO00o.Oooo0oO();
            c25909OooO00o.f88448OooO0o0 = false;
            c25909OooO00o.OooO00o();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C25909OooO00o c25909OooO00o = C25909OooO00o.this;
            PDFView pDFView = c25909OooO00o.f88443OooO00o;
            pDFView.Oooo(pDFView.getCurrentXOffset(), fFloatValue, true);
            c25909OooO00o.f88443OooO00o.Oooo0o();
        }
    }

    /* JADX INFO: renamed from: o0O0o00.OooO00o$OooO0OO */
    public class OooO0OO implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f88451OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f88452OooO0O0;

        public OooO0OO(float f, float f2) {
            this.f88451OooO00o = f;
            this.f88452OooO0O0 = f2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C25909OooO00o c25909OooO00o = C25909OooO00o.this;
            c25909OooO00o.f88443OooO00o.Oooo0oO();
            c25909OooO00o.OooO00o();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C25909OooO00o c25909OooO00o = C25909OooO00o.this;
            c25909OooO00o.f88443OooO00o.Oooo0oO();
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = c25909OooO00o.f88443OooO00o.f69170OooOooO;
            if (abstractC22830OooO0Oo != null) {
                abstractC22830OooO0Oo.Oooo00o();
            }
            c25909OooO00o.OooO00o();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C25909OooO00o.this.f88443OooO00o.o0ooOoO(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f88451OooO00o, this.f88452OooO0O0));
        }
    }

    public final void OooO00o() {
        PDFView pDFView = this.f88443OooO00o;
        if (pDFView.getScrollHandle() != null) {
            pDFView.getScrollHandle().OooO0Oo();
        }
    }

    public final boolean OooO0O0() {
        return this.f88446OooO0Oo || this.f88448OooO0o0;
    }

    public final void OooO0OO(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        OooO0oO();
        this.f88446OooO0Oo = true;
        PDFView pDFView = this.f88443OooO00o;
        this.f88445OooO0OO.fling(i, i2, (int) (pDFView.getePageFlingVelocityFactor() * i3), (int) (pDFView.getePageFlingVelocityFactor() * i4), i5, i6, i7, i8);
    }

    public final void OooO0Oo(float f, float f2) {
        OooO0oO();
        this.f88444OooO0O0 = ValueAnimator.ofFloat(f, f2);
        C19731OooO00o c19731OooO00o = new C19731OooO00o();
        this.f88444OooO0O0.setInterpolator(new DecelerateInterpolator());
        this.f88444OooO0O0.addUpdateListener(c19731OooO00o);
        this.f88444OooO0O0.addListener(c19731OooO00o);
        this.f88444OooO0O0.setDuration(400L);
        this.f88444OooO0O0.start();
    }

    public final void OooO0o(float f, float f2, float f3, float f4) {
        OooO0oO();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f4);
        this.f88444OooO0O0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        OooO0OO oooO0OO = new OooO0OO(f, f2);
        this.f88444OooO0O0.addUpdateListener(oooO0OO);
        this.f88444OooO0O0.addListener(oooO0OO);
        this.f88444OooO0O0.setDuration(400L);
        this.f88444OooO0O0.start();
    }

    public final void OooO0o0(float f, float f2) {
        OooO0oO();
        this.f88444OooO0O0 = ValueAnimator.ofFloat(f, f2);
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f88444OooO0O0.setInterpolator(new DecelerateInterpolator());
        this.f88444OooO0O0.addUpdateListener(oooO0O0);
        this.f88444OooO0O0.addListener(oooO0O0);
        this.f88444OooO0O0.setDuration(400L);
        this.f88444OooO0O0.start();
    }

    public final void OooO0oO() {
        ValueAnimator valueAnimator = this.f88444OooO0O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f88444OooO0O0 = null;
        }
        this.f88446OooO0Oo = false;
        this.f88445OooO0OO.forceFinished(true);
    }
}
