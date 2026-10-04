package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0 {
    Animatable2.AnimationCallback mPlatformCallback;

    public class OooO00o extends Animatable2.AnimationCallback {
        public OooO00o() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            OooO0O0.this.onAnimationEnd(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public final void onAnimationStart(Drawable drawable) {
            OooO0O0.this.onAnimationStart(drawable);
        }
    }

    public Animatable2.AnimationCallback getPlatformCallback() {
        if (this.mPlatformCallback == null) {
            this.mPlatformCallback = new OooO00o();
        }
        return this.mPlatformCallback;
    }

    public void onAnimationEnd(Drawable drawable) {
    }

    public void onAnimationStart(Drawable drawable) {
    }
}
