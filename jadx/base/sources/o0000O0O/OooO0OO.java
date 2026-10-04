package o0000O0O;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO extends o0000O00.OooOO0O {

    public static class OooO extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setRotationX(OooO00o(f));
        }
    }

    public static class OooO00o extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setAlpha(OooO00o(f));
        }
    }

    public static class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.OooO00o> f81423OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float[] f81424OooO0oO;

        public OooO0O0() {
            throw null;
        }

        @Override // o0000O00.OooOO0O
        public final void OooO0O0(int i, float f) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // o0000O00.OooOO0O
        public final void OooO0OO(int i) {
            SparseArray<androidx.constraintlayout.widget.OooO00o> sparseArray = this.f81423OooO0o;
            int size = sparseArray.size();
            int iOooO0OO = sparseArray.valueAt(0).OooO0OO();
            double[] dArr = new double[size];
            this.f81424OooO0oO = new float[iOooO0OO];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iOooO0OO);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                androidx.constraintlayout.widget.OooO00o oooO00oValueAt = sparseArray.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                oooO00oValueAt.OooO0O0(this.f81424OooO0oO);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f81424OooO0oO.length) {
                        dArr2[i2][i3] = r7[i3];
                        i3++;
                    }
                }
            }
            this.f81404OooO00o = o0000O00.OooO0O0.OooO00o(i, dArr, dArr2);
        }

        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            this.f81404OooO00o.OooO0Oo(f, this.f81424OooO0oO);
            o0000O0O.OooO00o.OooO0O0(this.f81423OooO0o.valueAt(0), view, this.f81424OooO0oO);
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class C19604OooO0OO extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setElevation(OooO00o(f));
        }
    }

    public static class OooO0Oo extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
        }
    }

    public static class OooO0o extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setPivotY(OooO00o(f));
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static class C24149OooO0o0 extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setPivotX(OooO00o(f));
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    public static class C24150OooO0oO extends OooO0OO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f81425OooO0o;

        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(OooO00o(f));
                return;
            }
            if (this.f81425OooO0o) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f81425OooO0o = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(OooO00o(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewSpline", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewSpline", "unable to setProgress", e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0OO$OooO0oo, reason: case insensitive filesystem */
    public static class C24151OooO0oo extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setRotation(OooO00o(f));
        }
    }

    public static class OooOO0 extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setRotationY(OooO00o(f));
        }
    }

    public static class OooOO0O extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setScaleX(OooO00o(f));
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0OO$OooOO0o, reason: case insensitive filesystem */
    public static class C24152OooOO0o extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setScaleY(OooO00o(f));
        }
    }

    public static class OooOOO extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setTranslationY(OooO00o(f));
        }
    }

    public static class OooOOO0 extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setTranslationX(OooO00o(f));
        }
    }

    public static class OooOOOO extends OooO0OO {
        @Override // o0000O0O.OooO0OO
        public final void OooO0Oo(View view, float f) {
            view.setTranslationZ(OooO00o(f));
        }
    }

    public abstract void OooO0Oo(View view, float f);
}
