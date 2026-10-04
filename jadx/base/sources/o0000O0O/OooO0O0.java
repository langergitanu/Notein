package o0000O0O;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0 extends o0000O00.OooO0o {

    public static class OooO extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            view.setScaleX(OooO00o(f));
        }
    }

    public static class OooO00o extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            view.setAlpha(OooO00o(f));
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C19603OooO0O0 extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float[] f81420OooO0oO = new float[1];

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public androidx.constraintlayout.widget.OooO00o f81421OooO0oo;

        @Override // o0000O00.OooO0o
        public final void OooO0O0(androidx.constraintlayout.widget.OooO00o oooO00o) {
            this.f81421OooO0oo = oooO00o;
        }

        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            float fOooO00o = OooO00o(f);
            float[] fArr = this.f81420OooO0oO;
            fArr[0] = fOooO00o;
            o0000O0O.OooO00o.OooO0O0(this.f81421OooO0oo, view, fArr);
        }
    }

    public static class OooO0OO extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            view.setElevation(OooO00o(f));
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public static class C24145OooO0Oo extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
        }
    }

    public static class OooO0o extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            view.setRotation(OooO00o(f));
        }
    }

    public static class OooO0o0 extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f81422OooO0oO;

        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(OooO00o(f));
                return;
            }
            if (this.f81422OooO0oO) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f81422OooO0oO = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(OooO00o(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewOscillator", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewOscillator", "unable to setProgress", e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0O0$OooO0oO, reason: case insensitive filesystem */
    public static class C24146OooO0oO extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            view.setRotationX(OooO00o(f));
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0O0$OooO0oo, reason: case insensitive filesystem */
    public static class C24147OooO0oo extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            view.setRotationY(OooO00o(f));
        }
    }

    public static class OooOO0 extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            view.setScaleY(OooO00o(f));
        }
    }

    public static class OooOO0O extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            view.setTranslationX(OooO00o(f));
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0O0$OooOO0o, reason: case insensitive filesystem */
    public static class C24148OooOO0o extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            view.setTranslationY(OooO00o(f));
        }
    }

    public static class OooOOO0 extends OooO0O0 {
        @Override // o0000O0O.OooO0O0
        public final void OooO0o0(View view, float f) {
            view.setTranslationZ(OooO00o(f));
        }
    }

    public OooO0O0() {
        this.f81378OooO0OO = 0;
        this.f81379OooO0Oo = null;
        this.f81381OooO0o0 = 0;
        this.f81380OooO0o = new ArrayList<>();
    }

    public static OooO0O0 OooO0Oo(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C19603OooO0O0();
        }
        switch (str) {
            case "rotationX":
                return new C24146OooO0oO();
            case "rotationY":
                return new C24147OooO0oo();
            case "translationX":
                return new OooOO0O();
            case "translationY":
                return new C24148OooOO0o();
            case "translationZ":
                return new OooOOO0();
            case "progress":
                OooO0o0 oooO0o0 = new OooO0o0();
                oooO0o0.f81422OooO0oO = false;
                return oooO0o0;
            case "scaleX":
                return new OooO();
            case "scaleY":
                return new OooOO0();
            case "waveVariesBy":
                return new OooO00o();
            case "rotation":
                return new OooO0o();
            case "elevation":
                return new OooO0OO();
            case "transitionPathRotate":
                return new C24145OooO0Oo();
            case "alpha":
                return new OooO00o();
            case "waveOffset":
                return new OooO00o();
            default:
                return null;
        }
    }

    public abstract void OooO0o0(View view, float f);
}
