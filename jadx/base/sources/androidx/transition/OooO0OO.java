package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.OooOOO0;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends Oooo0 {

    public static class OooO00o extends AnimatorListenerAdapter implements OooOOO0.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f66333OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f66334OooO0O0 = false;

        public OooO00o(View view) {
            this.f66333OooO00o = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C22110OooOoOO.f66401OooO00o.OooO0O0(this.f66333OooO00o, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.f66333OooO00o;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f66334OooO0O0 = true;
                view.setLayerType(2, null);
            }
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionCancel(OooOOO0 oooOOO0) {
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionEnd(OooOOO0 oooOOO0) {
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionPause(OooOOO0 oooOOO0) {
            View view = this.f66333OooO00o;
            view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? C22110OooOoOO.f66401OooO00o.OooO00o(view) : 0.0f));
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionResume(OooOOO0 oooOOO0) {
            this.f66333OooO00o.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionStart(OooOOO0 oooOOO0) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            boolean z2 = this.f66334OooO0O0;
            View view = this.f66333OooO00o;
            if (z2) {
                view.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            C22115Oooo00O c22115Oooo00O = C22110OooOoOO.f66401OooO00o;
            c22115Oooo00O.OooO0O0(view, 1.0f);
            c22115Oooo00O.getClass();
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionStart(OooOOO0 oooOOO0, boolean z) {
        }
    }

    public OooO0OO(int i) {
        setMode(i);
    }

    public static float OooO0O0(C22107OooOo0o c22107OooOo0o, float f) {
        Float f2;
        return (c22107OooOo0o == null || (f2 = (Float) c22107OooOo0o.f66394OooO00o.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    public final ObjectAnimator OooO00o(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C22110OooOoOO.f66401OooO00o.OooO0O0(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C22110OooOoOO.f66402OooO0O0, f2);
        OooO00o oooO00o = new OooO00o(view);
        objectAnimatorOfFloat.addListener(oooO00o);
        getRootTransition().addListener(oooO00o);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Oooo0, androidx.transition.OooOOO0
    public final void captureStartValues(C22107OooOo0o c22107OooOo0o) {
        super.captureStartValues(c22107OooOo0o);
        Float fValueOf = (Float) c22107OooOo0o.f66395OooO0O0.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            if (c22107OooOo0o.f66395OooO0O0.getVisibility() == 0) {
                fValueOf = Float.valueOf(C22110OooOoOO.f66401OooO00o.OooO00o(c22107OooOo0o.f66395OooO0O0));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        c22107OooOo0o.f66394OooO00o.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.OooOOO0
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Oooo0
    public final Animator onAppear(ViewGroup viewGroup, View view, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        C22110OooOoOO.f66401OooO00o.getClass();
        return OooO00o(view, OooO0O0(c22107OooOo0o, 0.0f), 1.0f);
    }

    @Override // androidx.transition.Oooo0
    public final Animator onDisappear(ViewGroup viewGroup, View view, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        C22115Oooo00O c22115Oooo00O = C22110OooOoOO.f66401OooO00o;
        c22115Oooo00O.getClass();
        ObjectAnimator objectAnimatorOooO00o = OooO00o(view, OooO0O0(c22107OooOo0o, 1.0f), 0.0f);
        if (objectAnimatorOooO00o == null) {
            c22115Oooo00O.OooO0O0(view, OooO0O0(c22107OooOo0o2, 1.0f));
        }
        return objectAnimatorOooO00o;
    }
}
