package o0000O0O;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import o0000O00.C24140OooO0Oo;

/* JADX INFO: renamed from: o0000O0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24153OooO0Oo extends o0000O00.OooOOO0 {

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooO */
    public static class OooO extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            view.setScaleX(OooO0Oo(f, j, view, c24140OooO0Oo));
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooO00o */
    public static class OooO00o extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            view.setAlpha(OooO0Oo(f, j, view, c24140OooO0Oo));
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooO0O0 */
    public static class OooO0O0 extends AbstractC24153OooO0Oo {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public String f81426OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.OooO00o> f81427OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float[] f81428OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public SparseArray<float[]> f81429OooOOO0;

        public OooO0O0() {
            throw null;
        }

        @Override // o0000O00.OooOOO0
        public final void OooO0O0(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // o0000O00.OooOOO0
        public final void OooO0OO(int i) {
            SparseArray<androidx.constraintlayout.widget.OooO00o> sparseArray = this.f81427OooOO0o;
            int size = sparseArray.size();
            int iOooO0OO = sparseArray.valueAt(0).OooO0OO();
            double[] dArr = new double[size];
            int i2 = iOooO0OO + 2;
            this.f81428OooOOO = new float[i2];
            this.f81417OooO0oO = new float[iOooO0OO];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = sparseArray.keyAt(i3);
                androidx.constraintlayout.widget.OooO00o oooO00oValueAt = sparseArray.valueAt(i3);
                float[] fArrValueAt = this.f81429OooOOO0.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                oooO00oValueAt.OooO0O0(this.f81428OooOOO);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f81428OooOOO.length) {
                        dArr2[i3][i4] = r10[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iOooO0OO] = fArrValueAt[0];
                dArr3[iOooO0OO + 1] = fArrValueAt[1];
            }
            this.f81411OooO00o = o0000O00.OooO0O0.OooO00o(i, dArr, dArr2);
        }

        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            this.f81411OooO00o.OooO0Oo(f, this.f81428OooOOO);
            float[] fArr = this.f81428OooOOO;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f81410OooO;
            if (Float.isNaN(this.f81419OooOO0)) {
                float fOooO00o = c24140OooO0Oo.OooO00o(view, this.f81426OooOO0O);
                this.f81419OooOO0 = fOooO00o;
                if (Float.isNaN(fOooO00o)) {
                    this.f81419OooOO0 = 0.0f;
                }
            }
            float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.f81419OooOO0)) % 1.0d);
            this.f81419OooOO0 = f4;
            this.f81410OooO = j;
            float fOooO00o2 = OooO00o(f4);
            this.f81418OooO0oo = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f81417OooO0oO;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f81418OooO0oo;
                float f5 = this.f81428OooOOO[i];
                this.f81418OooO0oo = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fOooO00o2) + f3;
                i++;
            }
            o0000O0O.OooO00o.OooO0O0(this.f81427OooOO0o.valueAt(0), view, this.f81417OooO0oO);
            if (f2 != 0.0f) {
                this.f81418OooO0oo = true;
            }
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooO0OO */
    public static class OooO0OO extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            view.setElevation(OooO0Oo(f, j, view, c24140OooO0Oo));
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    public static class C19605OooO0Oo extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooO0o */
    public static class OooO0o extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            view.setRotation(OooO0Oo(f, j, view, c24140OooO0Oo));
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooO0o0, reason: case insensitive filesystem */
    public static class C24154OooO0o0 extends AbstractC24153OooO0Oo {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f81430OooOO0O;

        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            Method method;
            C24154OooO0o0 c24154OooO0o0;
            float fOooO0Oo;
            if (view instanceof MotionLayout) {
                float fOooO0Oo2 = OooO0Oo(f, j, view, c24140OooO0Oo);
                c24154OooO0o0 = this;
                ((MotionLayout) view).setProgress(fOooO0Oo2);
            } else {
                if (this.f81430OooOO0O) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f81430OooOO0O = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        fOooO0Oo = OooO0Oo(f, j, view, c24140OooO0Oo);
                        c24154OooO0o0 = this;
                    } catch (IllegalAccessException e) {
                        e = e;
                        c24154OooO0o0 = this;
                    } catch (InvocationTargetException e2) {
                        e = e2;
                        c24154OooO0o0 = this;
                    }
                    try {
                        method.invoke(view, Float.valueOf(fOooO0Oo));
                    } catch (IllegalAccessException e3) {
                        e = e3;
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    }
                } else {
                    c24154OooO0o0 = this;
                }
            }
            return c24154OooO0o0.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooO0oO, reason: case insensitive filesystem */
    public static class C24155OooO0oO extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            view.setRotationX(OooO0Oo(f, j, view, c24140OooO0Oo));
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooO0oo, reason: case insensitive filesystem */
    public static class C24156OooO0oo extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            view.setRotationY(OooO0Oo(f, j, view, c24140OooO0Oo));
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooOO0 */
    public static class OooOO0 extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            view.setScaleY(OooO0Oo(f, j, view, c24140OooO0Oo));
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooOO0O */
    public static class OooOO0O extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            view.setTranslationX(OooO0Oo(f, j, view, c24140OooO0Oo));
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooOO0o, reason: case insensitive filesystem */
    public static class C24157OooOO0o extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            view.setTranslationY(OooO0Oo(f, j, view, c24140OooO0Oo));
            return this.f81418OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0Oo$OooOOO0 */
    public static class OooOOO0 extends AbstractC24153OooO0Oo {
        @Override // o0000O0O.AbstractC24153OooO0Oo
        public final boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
            view.setTranslationZ(OooO0Oo(f, j, view, c24140OooO0Oo));
            return this.f81418OooO0oo;
        }
    }

    public AbstractC24153OooO0Oo() {
        this.f81412OooO0O0 = 0;
        this.f81413OooO0OO = new int[10];
        this.f81414OooO0Oo = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
        this.f81417OooO0oO = new float[3];
        this.f81418OooO0oo = false;
        this.f81419OooOO0 = Float.NaN;
    }

    public final float OooO0Oo(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
        this.f81411OooO00o.OooO0Oo(f, this.f81417OooO0oO);
        float[] fArr = this.f81417OooO0oO;
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f81418OooO0oo = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f81419OooOO0)) {
            float fOooO00o = c24140OooO0Oo.OooO00o(view, this.f81415OooO0o);
            this.f81419OooOO0 = fOooO00o;
            if (Float.isNaN(fOooO00o)) {
                this.f81419OooOO0 = 0.0f;
            }
        }
        float f3 = (float) (((((j - this.f81410OooO) * 1.0E-9d) * ((double) f2)) + ((double) this.f81419OooOO0)) % 1.0d);
        this.f81419OooOO0 = f3;
        String str = this.f81415OooO0o;
        HashMap<Object, HashMap<String, float[]>> map = c24140OooO0Oo.f81375OooO00o;
        if (map.containsKey(view)) {
            HashMap<String, float[]> map2 = map.get(view);
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f3;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f3});
                map.put(view, map2);
            }
        } else {
            HashMap<String, float[]> map3 = new HashMap<>();
            map3.put(str, new float[]{f3});
            map.put(view, map3);
        }
        this.f81410OooO = j;
        float f4 = this.f81417OooO0oO[0];
        float fOooO00o2 = (OooO00o(this.f81419OooOO0) * f4) + this.f81417OooO0oO[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.f81418OooO0oo = z;
        return fOooO00o2;
    }

    public abstract boolean OooO0o0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo);
}
