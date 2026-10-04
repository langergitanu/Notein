package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;

/* JADX INFO: renamed from: androidx.fragment.app.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21898OooOo0O {
    public static int OooO00o(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OooOo0O$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Animation f64983OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AnimatorSet f64984OooO0O0;

        public OooO00o(Animation animation) {
            this.f64983OooO00o = animation;
            this.f64984OooO0O0 = null;
        }

        public OooO00o(Animator animator) {
            this.f64983OooO00o = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f64984OooO0O0 = animatorSet;
            animatorSet.play(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OooOo0O$OooO0O0 */
    public static class OooO0O0 extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final View f64985OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ViewGroup f64986OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f64987OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f64988OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f64989OooOoOO;

        public OooO0O0(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f64989OooOoOO = true;
            this.f64986OooOo0o = viewGroup;
            this.f64985OooOo = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.f64989OooOoOO = true;
            if (this.f64988OooOoO0) {
                return !this.f64987OooOoO;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f64988OooOoO0 = true;
                OneShotPreDrawListener.add(this.f64986OooOo0o, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.f64988OooOoO0;
            ViewGroup viewGroup = this.f64986OooOo0o;
            if (z || !this.f64989OooOoOO) {
                viewGroup.endViewTransition(this.f64985OooOo);
                this.f64987OooOoO = true;
            } else {
                this.f64989OooOoOO = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f64989OooOoOO = true;
            if (this.f64988OooOoO0) {
                return !this.f64987OooOoO;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f64988OooOoO0 = true;
                OneShotPreDrawListener.add(this.f64986OooOo0o, this);
            }
            return true;
        }
    }
}
