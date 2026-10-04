package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.OooO00o;
import androidx.dynamicanimation.animation.OooO0O0;
import com.google.android.material.progressindicator.DeterminateDrawable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0<T extends OooO0O0<T>> implements OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooOO0O f64667OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final OooOO0 f64668OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final C21857OooOO0o f64669OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooOOO0 f64670OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final OooO0OO f64671OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final OooOOO f64672OooOOo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f64673OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f64674OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f64675OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f64676OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final DeterminateDrawable f64677OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f64678OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final androidx.dynamicanimation.animation.OooO0OO f64679OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f64680OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f64681OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f64682OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList<InterfaceC21860OooOOo0> f64683OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList<InterfaceC21859OooOOo> f64684OooOO0o;

    public static class OooO extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return ViewCompat.getTranslationZ(view);
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            ViewCompat.setTranslationZ(view, f);
        }
    }

    public static class OooO00o extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setY(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C19013OooO0O0 extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return ViewCompat.getZ(view);
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            ViewCompat.setZ(view, f);
        }
    }

    public static class OooO0OO extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public static class C21854OooO0Oo extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    public class OooO0o extends androidx.dynamicanimation.animation.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ C21862OooO0Oo f64685OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C21862OooO0Oo c21862OooO0Oo) {
            super("FloatValueHolder");
            this.f64685OooO00o = c21862OooO0Oo;
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(Object obj) {
            return this.f64685OooO00o.f64689OooO00o;
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(Object obj, float f) {
            this.f64685OooO00o.f64689OooO00o = f;
        }
    }

    public static class OooO0o0 extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO0O0$OooO0oO, reason: case insensitive filesystem */
    public static class C21855OooO0oO extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO0O0$OooO0oo, reason: case insensitive filesystem */
    public static class C21856OooO0oo extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setTranslationY(f);
        }
    }

    public static class OooOO0 extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setScaleX(f);
        }
    }

    public static class OooOO0O extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO0O0$OooOO0o, reason: case insensitive filesystem */
    public static class C21857OooOO0o extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setRotation(f);
        }
    }

    public static class OooOOO extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setRotationY(f);
        }
    }

    public static class OooOOO0 extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setRotationX(f);
        }
    }

    public static class OooOOOO extends AbstractC21861OooOOoo {
        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(View view, float f) {
            view.setX(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO0O0$OooOOOo, reason: case insensitive filesystem */
    public static class C21858OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f64686OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f64687OooO0O0;
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO0O0$OooOOo, reason: case insensitive filesystem */
    public interface InterfaceC21859OooOOo {
        void OooO0o0(float f);
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO0O0$OooOOo0, reason: case insensitive filesystem */
    public interface InterfaceC21860OooOOo0 {
        void OooO00o(float f);
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO0O0$OooOOoo, reason: case insensitive filesystem */
    public static abstract class AbstractC21861OooOOoo extends androidx.dynamicanimation.animation.OooO0OO<View> {
    }

    static {
        new C21855OooO0oO("translationX");
        new C21856OooO0oo("translationY");
        new OooO("translationZ");
        f64668OooOOO0 = new OooOO0("scaleX");
        f64667OooOOO = new OooOO0O("scaleY");
        f64669OooOOOO = new C21857OooOO0o("rotation");
        f64670OooOOOo = new OooOOO0("rotationX");
        f64672OooOOo0 = new OooOOO("rotationY");
        new OooOOOO("x");
        new OooO00o("y");
        new C19013OooO0O0("z");
        f64671OooOOo = new OooO0OO("alpha");
        new C21854OooO0Oo("scrollX");
        new OooO0o0("scrollY");
    }

    public OooO0O0(C21862OooO0Oo c21862OooO0Oo) {
        this.f64674OooO00o = 0.0f;
        this.f64675OooO0O0 = Float.MAX_VALUE;
        this.f64676OooO0OO = false;
        this.f64678OooO0o = false;
        this.f64680OooO0oO = Float.MAX_VALUE;
        this.f64681OooO0oo = -3.4028235E38f;
        this.f64673OooO = 0L;
        this.f64683OooOO0O = new ArrayList<>();
        this.f64684OooOO0o = new ArrayList<>();
        this.f64677OooO0Oo = null;
        this.f64679OooO0o0 = new OooO0o(c21862OooO0Oo);
        this.f64682OooOO0 = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    @Override // androidx.dynamicanimation.animation.OooO00o.OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO00o(long j) {
        boolean z;
        ArrayList<InterfaceC21860OooOOo0> arrayList;
        long j2 = this.f64673OooO;
        int i = 0;
        if (j2 == 0) {
            this.f64673OooO = j;
            OooO0O0(this.f64675OooO0O0);
            return false;
        }
        long j3 = j - j2;
        this.f64673OooO = j;
        C21863OooO0o0 c21863OooO0o0 = (C21863OooO0o0) this;
        if (c21863OooO0o0.f64701OooOo0) {
            float f = c21863OooO0o0.f64702OooOo00;
            if (f != Float.MAX_VALUE) {
                c21863OooO0o0.f64700OooOOoo.f64690OooO = f;
                c21863OooO0o0.f64702OooOo00 = Float.MAX_VALUE;
            }
            c21863OooO0o0.f64675OooO0O0 = (float) c21863OooO0o0.f64700OooOOoo.f64690OooO;
            c21863OooO0o0.f64674OooO00o = 0.0f;
            c21863OooO0o0.f64701OooOo0 = false;
        } else {
            if (c21863OooO0o0.f64702OooOo00 != Float.MAX_VALUE) {
                androidx.dynamicanimation.animation.OooO0o oooO0o = c21863OooO0o0.f64700OooOOoo;
                double d = oooO0o.f64690OooO;
                long j4 = j3 / 2;
                C21858OooOOOo c21858OooOOOoOooO0O0 = oooO0o.OooO0O0(j4, c21863OooO0o0.f64675OooO0O0, c21863OooO0o0.f64674OooO00o);
                androidx.dynamicanimation.animation.OooO0o oooO0o2 = c21863OooO0o0.f64700OooOOoo;
                oooO0o2.f64690OooO = c21863OooO0o0.f64702OooOo00;
                c21863OooO0o0.f64702OooOo00 = Float.MAX_VALUE;
                C21858OooOOOo c21858OooOOOoOooO0O02 = oooO0o2.OooO0O0(j4, c21858OooOOOoOooO0O0.f64686OooO00o, c21858OooOOOoOooO0O0.f64687OooO0O0);
                c21863OooO0o0.f64675OooO0O0 = c21858OooOOOoOooO0O02.f64686OooO00o;
                c21863OooO0o0.f64674OooO00o = c21858OooOOOoOooO0O02.f64687OooO0O0;
            } else {
                C21858OooOOOo c21858OooOOOoOooO0O03 = c21863OooO0o0.f64700OooOOoo.OooO0O0(j3, c21863OooO0o0.f64675OooO0O0, c21863OooO0o0.f64674OooO00o);
                c21863OooO0o0.f64675OooO0O0 = c21858OooOOOoOooO0O03.f64686OooO00o;
                c21863OooO0o0.f64674OooO00o = c21858OooOOOoOooO0O03.f64687OooO0O0;
            }
            float fMax = Math.max(c21863OooO0o0.f64675OooO0O0, c21863OooO0o0.f64681OooO0oo);
            c21863OooO0o0.f64675OooO0O0 = fMax;
            c21863OooO0o0.f64675OooO0O0 = Math.min(fMax, c21863OooO0o0.f64680OooO0oO);
            float f2 = c21863OooO0o0.f64674OooO00o;
            androidx.dynamicanimation.animation.OooO0o oooO0o3 = c21863OooO0o0.f64700OooOOoo;
            oooO0o3.getClass();
            if (Math.abs(f2) >= oooO0o3.f64696OooO0o0 || Math.abs(r2 - ((float) oooO0o3.f64690OooO)) >= oooO0o3.f64694OooO0Oo) {
                z = false;
                float fMin = Math.min(this.f64675OooO0O0, this.f64680OooO0oO);
                this.f64675OooO0O0 = fMin;
                float fMax2 = Math.max(fMin, this.f64681OooO0oo);
                this.f64675OooO0O0 = fMax2;
                OooO0O0(fMax2);
                if (z) {
                    this.f64678OooO0o = false;
                    ThreadLocal<androidx.dynamicanimation.animation.OooO00o> threadLocal = androidx.dynamicanimation.animation.OooO00o.f64656OooO0o;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new androidx.dynamicanimation.animation.OooO00o());
                    }
                    androidx.dynamicanimation.animation.OooO00o oooO00o = threadLocal.get();
                    oooO00o.f64657OooO00o.remove(this);
                    ArrayList<OooO00o.OooO0O0> arrayList2 = oooO00o.f64658OooO0O0;
                    int iIndexOf = arrayList2.indexOf(this);
                    if (iIndexOf >= 0) {
                        arrayList2.set(iIndexOf, null);
                        oooO00o.f64661OooO0o0 = true;
                    }
                    this.f64673OooO = 0L;
                    this.f64676OooO0OO = false;
                    while (true) {
                        arrayList = this.f64683OooOO0O;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        if (arrayList.get(i) != null) {
                            arrayList.get(i).OooO00o(this.f64675OooO0O0);
                        }
                        i++;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return z;
            }
            c21863OooO0o0.f64675OooO0O0 = (float) c21863OooO0o0.f64700OooOOoo.f64690OooO;
            c21863OooO0o0.f64674OooO00o = 0.0f;
        }
        z = true;
        float fMin2 = Math.min(this.f64675OooO0O0, this.f64680OooO0oO);
        this.f64675OooO0O0 = fMin2;
        float fMax22 = Math.max(fMin2, this.f64681OooO0oo);
        this.f64675OooO0O0 = fMax22;
        OooO0O0(fMax22);
        if (z) {
        }
        return z;
    }

    public final void OooO0O0(float f) {
        ArrayList<InterfaceC21859OooOOo> arrayList;
        this.f64679OooO0o0.setValue(this.f64677OooO0Oo, f);
        int i = 0;
        while (true) {
            arrayList = this.f64684OooOO0o;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).OooO0o0(this.f64675OooO0O0);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public OooO0O0(DeterminateDrawable determinateDrawable, androidx.dynamicanimation.animation.OooO0OO oooO0OO) {
        this.f64674OooO00o = 0.0f;
        this.f64675OooO0O0 = Float.MAX_VALUE;
        this.f64676OooO0OO = false;
        this.f64678OooO0o = false;
        this.f64680OooO0oO = Float.MAX_VALUE;
        this.f64681OooO0oo = -3.4028235E38f;
        this.f64673OooO = 0L;
        this.f64683OooOO0O = new ArrayList<>();
        this.f64684OooOO0o = new ArrayList<>();
        this.f64677OooO0Oo = determinateDrawable;
        this.f64679OooO0o0 = oooO0OO;
        if (oooO0OO != f64669OooOOOO && oooO0OO != f64670OooOOOo && oooO0OO != f64672OooOOo0) {
            if (oooO0OO == f64671OooOOo) {
                this.f64682OooOO0 = 0.00390625f;
                return;
            } else if (oooO0OO != f64668OooOOO0 && oooO0OO != f64667OooOOO) {
                this.f64682OooOO0 = 1.0f;
                return;
            } else {
                this.f64682OooOO0 = 0.00390625f;
                return;
            }
        }
        this.f64682OooOO0 = 0.1f;
    }
}
