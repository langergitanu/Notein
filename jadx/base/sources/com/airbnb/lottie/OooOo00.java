package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o000o0o.C24611OooO00o;
import o00OO00O.C24983OooO0Oo;
import o00OO00O.ThreadFactoryC24984OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final ThreadPoolExecutor f66800OooOooO = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC24984OooO0o0());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO00o f66801OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00OO00O.OooO0o f66802OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f66803OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList<Object> f66804OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final boolean f66805OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f66806OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Semaphore f66807OooOoo0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f66808OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f66809OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f66810OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f66811OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("NONE", 0);
            f66809OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("PLAY", 1);
            f66808OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("RESUME", 2);
            f66811OooOoO0 = oooO00o3;
            f66810OooOoO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f66810OooOoO.clone();
        }
    }

    public OooOo00() {
        o00OO00O.OooO0o oooO0o = new o00OO00O.OooO0o();
        oooO0o.f84751OooOoO = 1.0f;
        oooO0o.f84752OooOoOO = false;
        oooO0o.f84754OooOoo0 = 0.0f;
        oooO0o.f84753OooOoo = 0.0f;
        oooO0o.f84755OooOooO = false;
        this.f66802OooOo0o = oooO0o;
        this.f66801OooOo = OooO00o.f66809OooOo0o;
        this.f66804OooOoO0 = new ArrayList<>();
        this.f66803OooOoO = 255;
        this.f66805OooOoOO = false;
        new Matrix();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.OooOOo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        };
        this.f66807OooOoo0 = new Semaphore(1);
        new Runnable() { // from class: com.airbnb.lottie.OooOOoo
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        this.f66806OooOoo = false;
        oooO0o.addUpdateListener(animatorUpdateListener);
    }

    public final void OooO00o() {
        this.f66804OooOoO0.clear();
        o00OO00O.OooO0o oooO0o = this.f66802OooOo0o;
        oooO0o.OooO0OO(true);
        Iterator it = oooO0o.f84747OooOoO0.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(oooO0o);
        }
        if (isVisible()) {
            return;
        }
        this.f66801OooOo = OooO00o.f66809OooOo0o;
    }

    public final void OooO0O0() {
        this.f66804OooOoO0.add(new C24611OooO00o());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f66803OooOoO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f66806OooOoo) {
            return;
        }
        this.f66806OooOoo = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        o00OO00O.OooO0o oooO0o = this.f66802OooOo0o;
        if (oooO0o == null) {
            return false;
        }
        return oooO0o.f84755OooOooO;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f66803OooOoO = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C24983OooO0Oo.OooO0O0("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        OooO00o oooO00o = OooO00o.f66811OooOoO0;
        o00OO00O.OooO0o oooO0o = this.f66802OooOo0o;
        OooO00o oooO00o2 = OooO00o.f66809OooOo0o;
        if (z) {
            OooO00o oooO00o3 = this.f66801OooOo;
            if (oooO00o3 == OooO00o.f66808OooOo) {
                OooO0O0();
                return visible;
            }
            if (oooO00o3 == oooO00o) {
                this.f66804OooOoO0.add(new C24611OooO00o());
                return visible;
            }
        } else {
            if (oooO0o.f84755OooOooO) {
                OooO00o();
                this.f66801OooOo = oooO00o;
                return visible;
            }
            if (zIsVisible) {
                this.f66801OooOo = oooO00o2;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        OooO0O0();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f66804OooOoO0.clear();
        o00OO00O.OooO0o oooO0o = this.f66802OooOo0o;
        oooO0o.OooO0OO(true);
        oooO0o.OooO00o(oooO0o.OooO0O0());
        if (isVisible()) {
            return;
        }
        this.f66801OooOo = OooO00o.f66809OooOo0o;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
