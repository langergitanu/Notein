package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.motion.widget.OooO00o;
import androidx.constraintlayout.motion.widget.OooO0OO;
import androidx.constraintlayout.widget.C21628OooO0oo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.aspose.slides.C22218Oooo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o000OO.C24448OooOOOo;
import o000OO.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final /* synthetic */ int f63661ooOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Interpolator f63662OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.OooO00o f63663OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f63664OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f63665OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f63666OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f63667OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f63668OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f63669OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f63670OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f63671Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f63672Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f63673Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f63674Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f63675Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public float f63676Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f63677Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public InterfaceC21622OooO0o0 f63678Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f63679Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f63680Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o000OO.OooO0O0 f63681Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f63682OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f63683OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f63684OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public long f63685OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f63686OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ArrayList<MotionHelper> f63687OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ArrayList<MotionHelper> f63688OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public CopyOnWriteArrayList<InterfaceC21622OooO0o0> f63689OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f63690OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public long f63691OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f63692Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f63693Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f63694OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public float f63695OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f63696OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f63697Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public C21621OooO0Oo f63698Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public OooO0o f63699OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f63700Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ArrayList<MotionHelper> f63701o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public View f63702o0OoOo0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f63698Oooooo0.OooO00o();
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f63698Oooooo0.OooO00o();
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0OO f63705OooO0O0 = new OooO0OO();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public VelocityTracker f63706OooO00o;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$OooO0Oo, reason: case insensitive filesystem */
    public class C21621OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f63707OooO00o = Float.NaN;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f63708OooO0O0 = Float.NaN;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f63709OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f63710OooO0Oo = -1;

        public C21621OooO0Oo() {
        }

        public final void OooO00o() {
            C21628OooO0oo c21628OooO0oo;
            int i = this.f63709OooO0OO;
            MotionLayout motionLayout = MotionLayout.this;
            if (i != -1 || this.f63710OooO0Oo != -1) {
                if (i == -1) {
                    int i2 = this.f63710OooO0Oo;
                    if (motionLayout.isAttachedToWindow()) {
                        androidx.constraintlayout.motion.widget.OooO00o oooO00o = motionLayout.f63663OooOo0o;
                        if (oooO00o != null && (c21628OooO0oo = oooO00o.f63718OooO0O0) != null) {
                            int i3 = motionLayout.f63666OooOoOO;
                            float f = -1;
                            C21628OooO0oo.OooO00o oooO00o2 = c21628OooO0oo.f64156OooO0O0.get(i2);
                            if (oooO00o2 == null) {
                                i3 = i2;
                            } else {
                                ArrayList<C21628OooO0oo.OooO0O0> arrayList = oooO00o2.f64158OooO0O0;
                                int i4 = oooO00o2.f64159OooO0OO;
                                if (f != -1.0f && f != -1.0f) {
                                    Iterator<C21628OooO0oo.OooO0O0> it = arrayList.iterator();
                                    C21628OooO0oo.OooO0O0 oooO0O0 = null;
                                    while (true) {
                                        if (it.hasNext()) {
                                            C21628OooO0oo.OooO0O0 next = it.next();
                                            if (next.OooO00o(f, f)) {
                                                if (i3 == next.f64164OooO0o0) {
                                                    break;
                                                } else {
                                                    oooO0O0 = next;
                                                }
                                            }
                                        } else if (oooO0O0 != null) {
                                            i3 = oooO0O0.f64164OooO0o0;
                                        }
                                    }
                                } else if (i4 != i3) {
                                    Iterator<C21628OooO0oo.OooO0O0> it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        if (i3 == it2.next().f64164OooO0o0) {
                                            break;
                                        }
                                    }
                                    i3 = i4;
                                }
                            }
                            if (i3 != -1) {
                                i2 = i3;
                            }
                        }
                        int i5 = motionLayout.f63666OooOoOO;
                        if (i5 != i2) {
                            if (motionLayout.f63664OooOoO == i2) {
                                motionLayout.OooO00o(0.0f);
                            } else if (motionLayout.f63668OooOoo0 == i2) {
                                motionLayout.OooO00o(1.0f);
                            } else {
                                motionLayout.f63668OooOoo0 = i2;
                                if (i5 == -1) {
                                    motionLayout.f63676Oooo0O0 = 1.0f;
                                    motionLayout.f63674Oooo00O = 0.0f;
                                    motionLayout.f63675Oooo00o = 0.0f;
                                    motionLayout.f63672Oooo0 = motionLayout.getNanoTime();
                                    motionLayout.getNanoTime();
                                    motionLayout.f63677Oooo0OO = false;
                                    motionLayout.f63673Oooo000 = motionLayout.f63663OooOo0o.OooO0OO() / 1000.0f;
                                    motionLayout.f63664OooOoO = -1;
                                    motionLayout.f63663OooOo0o.OooOOO0(-1, motionLayout.f63668OooOoo0);
                                    new SparseArray();
                                    motionLayout.getChildCount();
                                    throw null;
                                }
                                motionLayout.OooO0o(i5, i2);
                                motionLayout.OooO00o(1.0f);
                                motionLayout.f63675Oooo00o = 0.0f;
                                motionLayout.OooO0oo();
                            }
                        }
                    } else {
                        motionLayout.f63698Oooooo0.f63710OooO0Oo = i2;
                    }
                } else {
                    int i6 = this.f63710OooO0Oo;
                    if (i6 == -1) {
                        motionLayout.setState(i, -1, -1);
                    } else {
                        motionLayout.OooO0o(i, i6);
                    }
                }
                motionLayout.setState(OooO0o.f63713OooOo0o);
            }
            if (Float.isNaN(this.f63708OooO0O0)) {
                if (Float.isNaN(this.f63707OooO00o)) {
                    return;
                }
                motionLayout.setProgress(this.f63707OooO00o);
                return;
            }
            float f2 = this.f63707OooO00o;
            float f3 = this.f63708OooO0O0;
            if (motionLayout.isAttachedToWindow()) {
                motionLayout.setProgress(f2);
                motionLayout.setState(OooO0o.f63712OooOo);
                motionLayout.f63665OooOoO0 = f3;
                if (f3 != 0.0f) {
                    motionLayout.OooO00o(f3 <= 0.0f ? 0.0f : 1.0f);
                } else if (f2 != 0.0f && f2 != 1.0f) {
                    motionLayout.OooO00o(f2 <= 0.5f ? 0.0f : 1.0f);
                }
            } else {
                C21621OooO0Oo c21621OooO0Oo = motionLayout.f63698Oooooo0;
                c21621OooO0Oo.f63707OooO00o = f2;
                c21621OooO0Oo.f63708OooO0O0 = f3;
            }
            this.f63707OooO00o = Float.NaN;
            this.f63708OooO0O0 = Float.NaN;
            this.f63709OooO0OO = -1;
            this.f63710OooO0Oo = -1;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0o f63712OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0o f63713OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0o[] f63714OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0o f63715OooOoO0;

        /* JADX INFO: Fake field, exist only in values array */
        OooO0o EF0;

        static {
            OooO0o oooO0o = new OooO0o("UNDEFINED", 0);
            OooO0o oooO0o2 = new OooO0o("SETUP", 1);
            f63713OooOo0o = oooO0o2;
            OooO0o oooO0o3 = new OooO0o("MOVING", 2);
            f63712OooOo = oooO0o3;
            OooO0o oooO0o4 = new OooO0o("FINISHED", 3);
            f63715OooOoO0 = oooO0o4;
            f63714OooOoO = new OooO0o[]{oooO0o, oooO0o2, oooO0o3, oooO0o4};
        }

        public OooO0o() {
            throw null;
        }

        public static OooO0o valueOf(String str) {
            return (OooO0o) Enum.valueOf(OooO0o.class, str);
        }

        public static OooO0o[] values() {
            return (OooO0o[]) f63714OooOoO.clone();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC21622OooO0o0 {
    }

    public final void OooO(int i, View... viewArr) {
        String str;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        C21623OooO0Oo c21623OooO0Oo = oooO00o.f63733OooOOo0;
        c21623OooO0Oo.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.constraintlayout.motion.widget.OooO0OO> it = c21623OooO0Oo.f63821OooO0O0.iterator();
        androidx.constraintlayout.motion.widget.OooO0OO oooO0OO = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            str = c21623OooO0Oo.f63823OooO0Oo;
            if (!zHasNext) {
                break;
            }
            androidx.constraintlayout.motion.widget.OooO0OO next = it.next();
            if (next.f63787OooO00o == i) {
                for (View view : viewArr) {
                    if (next.OooO0O0(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    oooO0OO = next;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = c21623OooO0Oo.f63820OooO00o;
                    int currentState = motionLayout.getCurrentState();
                    if (next.f63792OooO0o0 != 2) {
                        if (currentState == -1) {
                            Log.w(str, "No support for ViewTransition within transition yet. Currently: " + motionLayout.toString());
                        } else {
                            androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = motionLayout.f63663OooOo0o;
                            androidx.constraintlayout.widget.OooO0OO oooO0OOOooO0O0 = oooO00o2 == null ? null : oooO00o2.OooO0O0(currentState);
                            if (oooO0OOOooO0O0 != null) {
                                oooO0OO = next;
                                oooO0OO.OooO00o(c21623OooO0Oo, c21623OooO0Oo.f63820OooO00o, currentState, oooO0OOOooO0O0, viewArr2);
                            }
                        }
                        oooO0OO = next;
                    } else {
                        oooO0OO = next;
                        oooO0OO.OooO00o(c21623OooO0Oo, c21623OooO0Oo.f63820OooO00o, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (oooO0OO == null) {
            Log.e(str, " Could not find ViewTransition");
        }
    }

    public final void OooO00o(float f) {
        if (this.f63663OooOo0o == null) {
            return;
        }
        float f2 = this.f63675Oooo00o;
        float f3 = this.f63674Oooo00O;
        if (f2 != f3 && this.f63677Oooo0OO) {
            this.f63675Oooo00o = f3;
        }
        float f4 = this.f63675Oooo00o;
        if (f4 == f) {
            return;
        }
        this.f63676Oooo0O0 = f;
        this.f63673Oooo000 = r0.OooO0OO() / 1000.0f;
        setProgress(this.f63676Oooo0O0);
        this.f63662OooOo = this.f63663OooOo0o.OooO0o0();
        this.f63677Oooo0OO = false;
        getNanoTime();
        this.f63679Oooo0o0 = true;
        this.f63674Oooo00O = f4;
        this.f63675Oooo00o = f4;
        invalidate();
    }

    public final void OooO0O0(boolean z) {
        int i;
        boolean z2;
        if (this.f63672Oooo0 == -1) {
            this.f63672Oooo0 = getNanoTime();
        }
        float f = this.f63675Oooo00o;
        if (f > 0.0f && f < 1.0f) {
            this.f63666OooOoOO = -1;
        }
        boolean z3 = false;
        if (this.f63686OoooOO0 || (this.f63679Oooo0o0 && (z || this.f63676Oooo0O0 != f))) {
            float fSignum = Math.signum(this.f63676Oooo0O0 - f);
            long nanoTime = getNanoTime();
            float f2 = (((nanoTime - this.f63672Oooo0) * fSignum) * 1.0E-9f) / this.f63673Oooo000;
            float f3 = this.f63675Oooo00o + f2;
            if (this.f63677Oooo0OO) {
                f3 = this.f63676Oooo0O0;
            }
            if ((fSignum > 0.0f && f3 >= this.f63676Oooo0O0) || (fSignum <= 0.0f && f3 <= this.f63676Oooo0O0)) {
                f3 = this.f63676Oooo0O0;
                this.f63679Oooo0o0 = false;
            }
            this.f63675Oooo00o = f3;
            this.f63674Oooo00O = f3;
            this.f63672Oooo0 = nanoTime;
            this.f63665OooOoO0 = f2;
            if (Math.abs(f2) > 1.0E-5f) {
                setState(OooO0o.f63712OooOo);
            }
            if ((fSignum > 0.0f && f3 >= this.f63676Oooo0O0) || (fSignum <= 0.0f && f3 <= this.f63676Oooo0O0)) {
                f3 = this.f63676Oooo0O0;
                this.f63679Oooo0o0 = false;
            }
            OooO0o oooO0o = OooO0o.f63715OooOoO0;
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.f63679Oooo0o0 = false;
                setState(oooO0o);
            }
            int childCount = getChildCount();
            this.f63686OoooOO0 = false;
            getNanoTime();
            this.f63695OooooOO = f3;
            Interpolator interpolator = this.f63662OooOo;
            if (interpolator != null) {
                interpolator.getInterpolation(f3);
            }
            Interpolator interpolator2 = this.f63662OooOo;
            if (interpolator2 != null) {
                float interpolation = interpolator2.getInterpolation((fSignum / this.f63673Oooo000) + f3);
                this.f63665OooOoO0 = interpolation;
                this.f63665OooOoO0 = interpolation - this.f63662OooOo.getInterpolation(f3);
            }
            if (childCount > 0) {
                getChildAt(0);
                throw null;
            }
            boolean z4 = (fSignum > 0.0f && f3 >= this.f63676Oooo0O0) || (fSignum <= 0.0f && f3 <= this.f63676Oooo0O0);
            if (!this.f63686OoooOO0 && !this.f63679Oooo0o0 && z4) {
                setState(oooO0o);
            }
            this.f63686OoooOO0 = (!z4) | this.f63686OoooOO0;
            if (f3 <= 0.0f && (i = this.f63664OooOoO) != -1 && this.f63666OooOoOO != i) {
                this.f63666OooOoOO = i;
                this.f63663OooOo0o.OooO0O0(i).OooO00o(this);
                setState(oooO0o);
                z3 = true;
            }
            if (f3 >= 1.0d) {
                int i2 = this.f63666OooOoOO;
                int i3 = this.f63668OooOoo0;
                if (i2 != i3) {
                    this.f63666OooOoOO = i3;
                    this.f63663OooOo0o.OooO0O0(i3).OooO00o(this);
                    setState(oooO0o);
                    z3 = true;
                }
            }
            if (this.f63686OoooOO0 || this.f63679Oooo0o0) {
                invalidate();
            } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                setState(oooO0o);
            }
            if (!this.f63686OoooOO0 && !this.f63679Oooo0o0 && ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f))) {
                OooO0o0();
            }
        }
        float f4 = this.f63675Oooo00o;
        if (f4 < 1.0f) {
            if (f4 <= 0.0f) {
                int i4 = this.f63666OooOoOO;
                int i5 = this.f63664OooOoO;
                z2 = i4 == i5 ? z3 : true;
                this.f63666OooOoOO = i5;
            }
            this.f63700Ooooooo |= z3;
            if (z3 && !this.f63696OooooOo) {
                requestLayout();
            }
            this.f63674Oooo00O = this.f63675Oooo00o;
        }
        int i6 = this.f63666OooOoOO;
        int i7 = this.f63668OooOoo0;
        z2 = i6 == i7 ? z3 : true;
        this.f63666OooOoOO = i7;
        z3 = z2;
        this.f63700Ooooooo |= z3;
        if (z3) {
            requestLayout();
        }
        this.f63674Oooo00O = this.f63675Oooo00o;
    }

    public final void OooO0OO() {
        if ((this.f63678Oooo0o == null && this.f63689OoooOo0.isEmpty()) || this.f63694OooooO0 == this.f63674Oooo00O) {
            return;
        }
        if (this.f63693Ooooo0o != -1) {
            Iterator<InterfaceC21622OooO0o0> it = this.f63689OoooOo0.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        this.f63693Ooooo0o = -1;
        this.f63694OooooO0 = this.f63674Oooo00O;
        Iterator<InterfaceC21622OooO0o0> it2 = this.f63689OoooOo0.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    public final void OooO0Oo() {
        if (!(this.f63678Oooo0o == null && this.f63689OoooOo0.isEmpty()) && this.f63693Ooooo0o == -1) {
            this.f63693Ooooo0o = this.f63666OooOoOO;
            throw null;
        }
        if (this.f63678Oooo0o != null || !this.f63689OoooOo0.isEmpty()) {
            throw null;
        }
    }

    public final void OooO0o(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f63698Oooooo0 == null) {
                this.f63698Oooooo0 = new C21621OooO0Oo();
            }
            C21621OooO0Oo c21621OooO0Oo = this.f63698Oooooo0;
            c21621OooO0Oo.f63709OooO0OO = i;
            c21621OooO0Oo.f63710OooO0Oo = i2;
            return;
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o == null) {
            return;
        }
        this.f63664OooOoO = i;
        this.f63668OooOoo0 = i2;
        oooO00o.OooOOO0(i, i2);
        this.f63663OooOo0o.OooO0O0(i);
        this.f63663OooOo0o.OooO0O0(i2);
        throw null;
    }

    public final void OooO0o0() {
        OooO00o.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O02;
        View viewFindViewById;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o == null) {
            return;
        }
        if (oooO00o.OooO00o(this.f63666OooOoOO, this)) {
            requestLayout();
            return;
        }
        int i = this.f63666OooOoOO;
        if (i != -1) {
            androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f63663OooOo0o;
            ArrayList<OooO00o.OooO0O0> arrayList = oooO00o2.f63720OooO0Oo;
            for (OooO00o.OooO0O0 oooO0O03 : arrayList) {
                if (oooO0O03.f63749OooOOO0.size() > 0) {
                    Iterator<OooO00o.OooO0O0.ViewOnClickListenerC19002OooO00o> it = oooO0O03.f63749OooOOO0.iterator();
                    while (it.hasNext()) {
                        it.next().OooO0O0(this);
                    }
                }
            }
            ArrayList<OooO00o.OooO0O0> arrayList2 = oooO00o2.f63721OooO0o;
            for (OooO00o.OooO0O0 oooO0O04 : arrayList2) {
                if (oooO0O04.f63749OooOOO0.size() > 0) {
                    Iterator<OooO00o.OooO0O0.ViewOnClickListenerC19002OooO00o> it2 = oooO0O04.f63749OooOOO0.iterator();
                    while (it2.hasNext()) {
                        it2.next().OooO0O0(this);
                    }
                }
            }
            for (OooO00o.OooO0O0 oooO0O05 : arrayList) {
                if (oooO0O05.f63749OooOOO0.size() > 0) {
                    Iterator<OooO00o.OooO0O0.ViewOnClickListenerC19002OooO00o> it3 = oooO0O05.f63749OooOOO0.iterator();
                    while (it3.hasNext()) {
                        it3.next().OooO00o(this, i, oooO0O05);
                    }
                }
            }
            for (OooO00o.OooO0O0 oooO0O06 : arrayList2) {
                if (oooO0O06.f63749OooOOO0.size() > 0) {
                    Iterator<OooO00o.OooO0O0.ViewOnClickListenerC19002OooO00o> it4 = oooO0O06.f63749OooOOO0.iterator();
                    while (it4.hasNext()) {
                        it4.next().OooO00o(this, i, oooO0O06);
                    }
                }
            }
        }
        if (!this.f63663OooOo0o.OooOOO() || (oooO0O0 = this.f63663OooOo0o.f63719OooO0OO) == null || (oooO0O02 = oooO0O0.f63747OooOO0o) == null) {
            return;
        }
        int i2 = oooO0O02.f63762OooO0Oo;
        if (i2 != -1) {
            MotionLayout motionLayout = oooO0O02.f63773OooOOOo;
            viewFindViewById = motionLayout.findViewById(i2);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + o000OO.OooO00o.OooO0O0(motionLayout.getContext(), oooO0O02.f63762OooO0Oo));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new OooOOOO());
            nestedScrollView.setOnScrollChangeListener(new C24448OooOOOo());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if ((((r8 * r0) - (((r9 * r0) * r0) / 2.0f)) + r7) > 1.0f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if ((((((r9 * r1) * r1) / 2.0f) + (r8 * r1)) + r7) < 0.0f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r6.f63663OooOo0o.OooO0o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        r6.f63663OooOo0o.OooO0o();
        r6.f63663OooOo0o.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0oO(float f, float f2, int i) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        if (this.f63663OooOo0o == null || this.f63675Oooo00o == f) {
            return;
        }
        getNanoTime();
        this.f63673Oooo000 = this.f63663OooOo0o.OooO0OO() / 1000.0f;
        this.f63676Oooo0O0 = f;
        this.f63679Oooo0o0 = true;
        int i2 = 0;
        if (i != 0 && i != 1 && i != 2) {
            if (i == 4) {
                this.f63663OooOo0o.OooO0o();
                throw null;
            }
            if (i == 5) {
                float f3 = this.f63675Oooo00o;
                float fOooO0o = this.f63663OooOo0o.OooO0o();
                if (f2 > 0.0f) {
                    float f4 = f2 / fOooO0o;
                } else {
                    float f5 = (-f2) / fOooO0o;
                }
            } else if (i != 6 && i != 7) {
                this.f63677Oooo0OO = false;
                getNanoTime();
                invalidate();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        OooO00o.OooO0O0 oooO0O02 = oooO00o.f63719OooO0OO;
        if (oooO0O02 != null && (oooO0O0 = oooO0O02.f63747OooOO0o) != null) {
            i2 = oooO0O0.f63785OooOoo0;
        }
        if (i2 == 0) {
            oooO00o.OooO0o();
            this.f63663OooOo0o.getClass();
            throw null;
        }
        if (oooO0O02 != null) {
            androidx.constraintlayout.motion.widget.OooO0O0 oooO0O03 = oooO0O02.f63747OooOO0o;
        }
        if (oooO0O02 != null) {
            androidx.constraintlayout.motion.widget.OooO0O0 oooO0O04 = oooO0O02.f63747OooOO0o;
        }
        if (oooO0O02 != null) {
            androidx.constraintlayout.motion.widget.OooO0O0 oooO0O05 = oooO0O02.f63747OooOO0o;
        }
        if (oooO0O02 != null) {
            androidx.constraintlayout.motion.widget.OooO0O0 oooO0O06 = oooO0O02.f63747OooOO0o;
        }
        if (oooO0O02 == null) {
            throw null;
        }
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O07 = oooO0O02.f63747OooOO0o;
        throw null;
    }

    public final void OooO0oo() {
        OooO00o(1.0f);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        String resourceEntryName;
        C21623OooO0Oo c21623OooO0Oo;
        ArrayList<OooO0OO.OooO00o> arrayList;
        Iterator<MotionHelper> it = this.f63688OoooOOo.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        OooO0O0(false);
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o != null && (c21623OooO0Oo = oooO00o.f63733OooOOo0) != null && (arrayList = c21623OooO0Oo.f63825OooO0o0) != null) {
            Iterator<OooO0OO.OooO00o> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().OooO00o();
            }
            ArrayList<OooO0OO.OooO00o> arrayList2 = c21623OooO0Oo.f63825OooO0o0;
            ArrayList<OooO0OO.OooO00o> arrayList3 = c21623OooO0Oo.f63824OooO0o;
            arrayList2.removeAll(arrayList3);
            arrayList3.clear();
            if (c21623OooO0Oo.f63825OooO0o0.isEmpty()) {
                c21623OooO0Oo.f63825OooO0o0 = null;
            }
        }
        super.dispatchDraw(canvas);
        if (this.f63663OooOo0o == null) {
            return;
        }
        if ((this.f63680Oooo0oO & 1) == 1 && !isInEditMode()) {
            this.f63690OoooOoO++;
            long nanoTime = getNanoTime();
            long j = this.f63691OoooOoo;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.f63692Ooooo00 = ((int) ((this.f63690OoooOoO / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f63690OoooOoO = 0;
                    this.f63691OoooOoo = nanoTime;
                }
            } else {
                this.f63691OoooOoo = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f63692Ooooo00);
            sb.append(" fps ");
            int i = this.f63664OooOoO;
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(androidx.concurrent.futures.OooO00o.OooO0OO(sb, i == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i), " -> "));
            int i2 = this.f63668OooOoo0;
            sbOooO0OO.append(i2 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i2));
            sbOooO0OO.append(" (progress: ");
            sbOooO0OO.append(progress);
            sbOooO0OO.append(" ) state=");
            int i3 = this.f63666OooOoOO;
            if (i3 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i3 != -1 ? getContext().getResources().getResourceEntryName(i3) : "UNDEFINED";
            }
            sbOooO0OO.append(resourceEntryName);
            String string = sbOooO0OO.toString();
            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f63680Oooo0oO > 1) {
            this.f63663OooOo0o.OooO0OO();
        }
        Iterator<MotionHelper> it3 = this.f63688OoooOOo.iterator();
        while (it3.hasNext()) {
            it3.next().getClass();
        }
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.OooO0OO> sparseArray = oooO00o.f63723OooO0oO;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f63666OooOoOO;
    }

    public ArrayList<OooO00o.OooO0O0> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.f63720OooO0Oo;
    }

    public o000OO.OooO0O0 getDesignTool() {
        if (this.f63681Oooo0oo == null) {
            this.f63681Oooo0oo = new o000OO.OooO0O0();
        }
        return this.f63681Oooo0oo;
    }

    public int getEndState() {
        return this.f63668OooOoo0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f63675Oooo00o;
    }

    public androidx.constraintlayout.motion.widget.OooO00o getScene() {
        return this.f63663OooOo0o;
    }

    public int getStartState() {
        return this.f63664OooOoO;
    }

    public float getTargetPosition() {
        return this.f63676Oooo0O0;
    }

    public Bundle getTransitionState() {
        if (this.f63698Oooooo0 == null) {
            this.f63698Oooooo0 = new C21621OooO0Oo();
        }
        C21621OooO0Oo c21621OooO0Oo = this.f63698Oooooo0;
        MotionLayout motionLayout = MotionLayout.this;
        c21621OooO0Oo.f63710OooO0Oo = motionLayout.f63668OooOoo0;
        c21621OooO0Oo.f63709OooO0OO = motionLayout.f63664OooOoO;
        c21621OooO0Oo.f63708OooO0O0 = motionLayout.getVelocity();
        c21621OooO0Oo.f63707OooO00o = motionLayout.getProgress();
        C21621OooO0Oo c21621OooO0Oo2 = this.f63698Oooooo0;
        c21621OooO0Oo2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", c21621OooO0Oo2.f63707OooO00o);
        bundle.putFloat("motion.velocity", c21621OooO0Oo2.f63708OooO0O0);
        bundle.putInt("motion.StartState", c21621OooO0Oo2.f63709OooO0OO);
        bundle.putInt("motion.EndState", c21621OooO0Oo2.f63710OooO0Oo);
        return bundle;
    }

    public long getTransitionTimeMs() {
        if (this.f63663OooOo0o != null) {
            this.f63673Oooo000 = r0.OooO0OO() / 1000.0f;
        }
        return (long) (this.f63673Oooo000 * 1000.0f);
    }

    public float getVelocity() {
        return this.f63665OooOoO0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i) {
        if (i == 0) {
            this.f63663OooOo0o = null;
            return;
        }
        try {
            androidx.constraintlayout.motion.widget.OooO00o oooO00o = new androidx.constraintlayout.motion.widget.OooO00o(getContext(), this, i);
            this.f63663OooOo0o = oooO00o;
            int i2 = -1;
            if (this.f63666OooOoOO == -1) {
                OooO00o.OooO0O0 oooO0O0 = oooO00o.f63719OooO0OO;
                this.f63666OooOoOO = oooO0O0 == null ? -1 : oooO0O0.f63740OooO0Oo;
                this.f63664OooOoO = oooO0O0 == null ? -1 : oooO0O0.f63740OooO0Oo;
                if (oooO0O0 != null) {
                    i2 = oooO0O0.f63739OooO0OO;
                }
                this.f63668OooOoo0 = i2;
            }
            if (!isAttachedToWindow()) {
                this.f63663OooOo0o = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f63663OooOo0o;
                if (oooO00o2 != null) {
                    androidx.constraintlayout.widget.OooO0OO oooO0OOOooO0O0 = oooO00o2.OooO0O0(this.f63666OooOoOO);
                    this.f63663OooOo0o.OooOO0o(this);
                    Iterator<MotionHelper> it = this.f63688OoooOOo.iterator();
                    while (it.hasNext()) {
                        it.next().getClass();
                    }
                    if (oooO0OOOooO0O0 != null) {
                        oooO0OOOooO0O0.OooO0O0(this);
                    }
                    this.f63664OooOoO = this.f63666OooOoOO;
                }
                OooO0o0();
                C21621OooO0Oo c21621OooO0Oo = this.f63698Oooooo0;
                if (this.f63697Oooooo) {
                    post(new OooO00o());
                } else {
                    c21621OooO0Oo.OooO00o();
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        } catch (Exception e2) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o != null && (i = this.f63666OooOoOO) != -1) {
            androidx.constraintlayout.widget.OooO0OO oooO0OOOooO0O0 = oooO00o.OooO0O0(i);
            this.f63663OooOo0o.OooOO0o(this);
            Iterator<MotionHelper> it = this.f63688OoooOOo.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (oooO0OOOooO0O0 != null) {
                oooO0OOOooO0O0.OooO0O0(this);
            }
            this.f63664OooOoO = this.f63666OooOoOO;
        }
        OooO0o0();
        C21621OooO0Oo c21621OooO0Oo = this.f63698Oooooo0;
        if (this.f63697Oooooo) {
            post(new OooO0O0());
        } else {
            c21621OooO0Oo.OooO00o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Throwable {
        boolean z;
        Throwable th;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        int i;
        RectF rectFOooO0O0;
        MotionLayout motionLayout;
        int currentState;
        androidx.constraintlayout.widget.OooO0OO oooO0OO;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o == null || !this.f63670OooOooo) {
            return false;
        }
        C21623OooO0Oo c21623OooO0Oo = oooO00o.f63733OooOOo0;
        if (c21623OooO0Oo == null || (currentState = (motionLayout = c21623OooO0Oo.f63820OooO00o).getCurrentState()) == -1) {
            z = false;
            th = null;
        } else {
            HashSet<View> hashSet = c21623OooO0Oo.f63822OooO0OO;
            ArrayList<androidx.constraintlayout.motion.widget.OooO0OO> arrayList = c21623OooO0Oo.f63821OooO0O0;
            if (hashSet == null) {
                c21623OooO0Oo.f63822OooO0OO = new HashSet<>();
                for (androidx.constraintlayout.motion.widget.OooO0OO oooO0OO2 : arrayList) {
                    int childCount = motionLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = motionLayout.getChildAt(i2);
                        if (oooO0OO2.OooO0OO(childAt)) {
                            childAt.getId();
                            c21623OooO0Oo.f63822OooO0OO.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<OooO0OO.OooO00o> arrayList2 = c21623OooO0Oo.f63825OooO0o0;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (OooO0OO.OooO00o oooO00o2 : c21623OooO0Oo.f63825OooO0o0) {
                    if (action != 1) {
                        if (action != 2) {
                            oooO00o2.getClass();
                        } else {
                            View view = oooO00o2.f63810OooO0OO.f82596OooO00o;
                            Rect rect2 = oooO00o2.f63818OooOO0o;
                            view.getHitRect(rect2);
                            if (!rect2.contains((int) x, (int) y) && !oooO00o2.f63815OooO0oo) {
                                oooO00o2.OooO0O0();
                            }
                        }
                    } else if (!oooO00o2.f63815OooO0oo) {
                        oooO00o2.OooO0O0();
                    }
                }
            }
            z = false;
            th = null;
            if (action == 0 || action == 1) {
                androidx.constraintlayout.motion.widget.OooO00o oooO00o3 = motionLayout.f63663OooOo0o;
                androidx.constraintlayout.widget.OooO0OO oooO0OOOooO0O0 = oooO00o3 == null ? null : oooO00o3.OooO0O0(currentState);
                for (androidx.constraintlayout.motion.widget.OooO0OO oooO0OO3 : arrayList) {
                    int i3 = oooO0OO3.f63788OooO0O0;
                    if (i3 == 1) {
                        if (action == 0) {
                            for (View view2 : c21623OooO0Oo.f63822OooO0OO) {
                                if (oooO0OO3.OooO0OO(view2)) {
                                    view2.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        oooO0OO = oooO0OOOooO0O0;
                                        oooO0OO3.OooO00o(c21623OooO0Oo, c21623OooO0Oo.f63820OooO00o, currentState, oooO0OO, view2);
                                    } else {
                                        oooO0OO = oooO0OOOooO0O0;
                                    }
                                    oooO0OOOooO0O0 = oooO0OO;
                                }
                            }
                        }
                    } else if (i3 == 2) {
                        if (action == 1) {
                        }
                    } else if (i3 != 3 || action != 0) {
                    }
                    oooO0OOOooO0O0 = oooO0OOOooO0O0;
                }
            }
        }
        OooO00o.OooO0O0 oooO0O02 = this.f63663OooOo0o.f63719OooO0OO;
        if (oooO0O02 == null || oooO0O02.f63750OooOOOO || (oooO0O0 = oooO0O02.f63747OooOO0o) == null) {
            return z;
        }
        if ((motionEvent.getAction() == 0 && (rectFOooO0O0 = oooO0O0.OooO0O0(this, new RectF())) != null && !rectFOooO0O0.contains(motionEvent.getX(), motionEvent.getY())) || (i = oooO0O0.f63764OooO0o0) == -1) {
            return z;
        }
        View view3 = this.f63702o0OoOo0;
        if (view3 == null || view3.getId() != i) {
            this.f63702o0OoOo0 = findViewById(i);
        }
        View view4 = this.f63702o0OoOo0;
        if (view4 == null) {
            return z;
        }
        view4.getLeft();
        this.f63702o0OoOo0.getTop();
        this.f63702o0OoOo0.getRight();
        this.f63702o0OoOo0.getBottom();
        throw th;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        MotionLayout motionLayout;
        this.f63696OooooOo = true;
        try {
            if (this.f63663OooOo0o == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.f63696OooooOo = false;
                return;
            }
            motionLayout = this;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            try {
                if (motionLayout.f63671Oooo != i5 || motionLayout.f63684OoooO00 != i6) {
                    throw null;
                }
                motionLayout.f63671Oooo = i5;
                motionLayout.f63684OoooO00 = i6;
                motionLayout.f63696OooooOo = false;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            motionLayout = this;
        }
        Throwable th3 = th;
        motionLayout.f63696OooooOo = false;
        throw th3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f63663OooOo0o == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = (this.f63667OooOoo == i && this.f63669OooOooO == i2) ? false : true;
        if (this.f63700Ooooooo) {
            this.f63700Ooooooo = false;
            OooO0o0();
            if (this.f63678Oooo0o != null || !this.f63689OoooOo0.isEmpty()) {
                throw null;
            }
            z = true;
        }
        boolean z2 = this.mDirtyHierarchy ? true : z;
        this.f63667OooOoo = i;
        this.f63669OooOooO = i2;
        OooO00o.OooO0O0 oooO0O0 = this.f63663OooOo0o.f63719OooO0OO;
        int i3 = oooO0O0 == null ? -1 : oooO0O0.f63740OooO0Oo;
        int i4 = oooO0O0 == null ? -1 : oooO0O0.f63739OooO0OO;
        if (!z2) {
            throw null;
        }
        if (this.f63664OooOoO != -1) {
            super.onMeasure(i, i2);
            this.f63663OooOo0o.OooO0O0(i3);
            this.f63663OooOo0o.OooO0O0(i4);
            throw null;
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
        getPaddingTop();
        getPaddingBottom();
        getPaddingLeft();
        getPaddingRight();
        this.mLayoutWidget.getClass();
        this.mLayoutWidget.getClass();
        float f = 0;
        int i5 = (int) ((this.f63695OooooOO * f) + f);
        requestLayout();
        int i6 = (int) ((this.f63695OooooOO * f) + f);
        requestLayout();
        setMeasuredDimension(i5, i6);
        float fSignum = Math.signum(this.f63676Oooo0O0 - this.f63675Oooo00o);
        float nanoTime = this.f63675Oooo00o + ((((getNanoTime() - this.f63672Oooo0) * fSignum) * 1.0E-9f) / this.f63673Oooo000);
        if (this.f63677Oooo0OO) {
            nanoTime = this.f63676Oooo0O0;
        }
        if ((fSignum > 0.0f && nanoTime >= this.f63676Oooo0O0) || (fSignum <= 0.0f && nanoTime <= this.f63676Oooo0O0)) {
            nanoTime = this.f63676Oooo0O0;
        }
        if ((fSignum > 0.0f && nanoTime >= this.f63676Oooo0O0) || (fSignum <= 0.0f && nanoTime <= this.f63676Oooo0O0)) {
            nanoTime = this.f63676Oooo0O0;
        }
        this.f63695OooooOO = nanoTime;
        int childCount = getChildCount();
        getNanoTime();
        Interpolator interpolator = this.f63662OooOo;
        if (interpolator != null) {
            interpolator.getInterpolation(nanoTime);
        }
        if (childCount <= 0) {
            return;
        }
        getChildAt(0);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        OooO00o.OooO0O0 oooO0O0;
        boolean z;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O02;
        OooO00o.OooO0O0 oooO0O03;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O04;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O05;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O06;
        int i4;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o == null || (oooO0O0 = oooO00o.f63719OooO0OO) == null || (z = oooO0O0.f63750OooOOOO)) {
            return;
        }
        int i5 = -1;
        if (z || (oooO0O06 = oooO0O0.f63747OooOO0o) == null || (i4 = oooO0O06.f63764OooO0o0) == -1 || view.getId() == i4) {
            OooO00o.OooO0O0 oooO0O07 = oooO00o.f63719OooO0OO;
            if ((oooO0O07 == null || (oooO0O05 = oooO0O07.f63747OooOO0o) == null) ? false : oooO0O05.f63776OooOOoo) {
                androidx.constraintlayout.motion.widget.OooO0O0 oooO0O08 = oooO0O0.f63747OooOO0o;
                if (oooO0O08 != null && (oooO0O08.f63778OooOo0 & 4) != 0) {
                    i5 = i2;
                }
                float f = this.f63674Oooo00O;
                if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.OooO0O0 oooO0O09 = oooO0O0.f63747OooOO0o;
            if (oooO0O09 != null && (oooO0O09.f63778OooOo0 & 1) != 0 && (oooO0O03 = oooO00o.f63719OooO0OO) != null && (oooO0O04 = oooO0O03.f63747OooOO0o) != null) {
                MotionLayout motionLayout = oooO0O04.f63773OooOOOo;
                motionLayout.getProgress();
                motionLayout.getViewById(oooO0O04.f63762OooO0Oo);
                throw null;
            }
            float f2 = this.f63674Oooo00O;
            long nanoTime = getNanoTime();
            this.f63682OoooO = (float) ((nanoTime - this.f63685OoooO0O) * 1.0E-9d);
            this.f63685OoooO0O = nanoTime;
            OooO00o.OooO0O0 oooO0O010 = oooO00o.f63719OooO0OO;
            if (oooO0O010 != null && (oooO0O02 = oooO0O010.f63747OooOO0o) != null) {
                MotionLayout motionLayout2 = oooO0O02.f63773OooOOOo;
                float progress = motionLayout2.getProgress();
                if (!oooO0O02.f63768OooOO0O) {
                    oooO0O02.f63768OooOO0O = true;
                    motionLayout2.setProgress(progress);
                }
                motionLayout2.getViewById(oooO0O02.f63762OooO0Oo);
                throw null;
            }
            if (f2 != this.f63674Oooo00O) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            OooO0O0(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f63683OoooO0 = true;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f63685OoooO0O = getNanoTime();
        this.f63682OoooO = 0.0f;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o != null) {
            boolean zIsRtl = isRtl();
            oooO00o.f63731OooOOOo = zIsRtl;
            OooO00o.OooO0O0 oooO0O02 = oooO00o.f63719OooO0OO;
            if (oooO0O02 == null || (oooO0O0 = oooO0O02.f63747OooOO0o) == null) {
                return;
            }
            oooO0O0.OooO0OO(zIsRtl);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        OooO00o.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O02;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        return (oooO00o == null || (oooO0O0 = oooO00o.f63719OooO0OO) == null || (oooO0O02 = oooO0O0.f63747OooOO0o) == null || (oooO0O02.f63778OooOo0 & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i) {
        OooO00o.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O02;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o == null || this.f63682OoooO == 0.0f || (oooO0O0 = oooO00o.f63719OooO0OO) == null || (oooO0O02 = oooO0O0.f63747OooOO0o) == null) {
            return;
        }
        oooO0O02.f63768OooOO0O = false;
        MotionLayout motionLayout = oooO0O02.f63773OooOOOo;
        motionLayout.getProgress();
        motionLayout.getViewById(oooO0O02.f63762OooO0Oo);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0228  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        int i;
        char c;
        char c2;
        int i2;
        int i3;
        char c3;
        MotionEvent motionEvent2;
        OooO00o.OooO0O0 oooO0O02;
        int iOooO00o;
        Iterator it;
        RectF rectF;
        float f;
        OooO00o.OooO0O0 oooO0O03;
        float f2;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o == null || !this.f63670OooOooo || !oooO00o.OooOOO()) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f63663OooOo0o;
        OooO00o.OooO0O0 oooO0O04 = oooO00o2.f63719OooO0OO;
        if (oooO0O04 != null && oooO0O04.f63750OooOOOO) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        RectF rectF2 = new RectF();
        OooO0OO oooO0OO3 = oooO00o2.f63730OooOOOO;
        MotionLayout motionLayout = oooO00o2.f63717OooO00o;
        if (oooO0OO3 == null) {
            motionLayout.getClass();
            OooO0OO oooO0OO4 = OooO0OO.f63705OooO0O0;
            oooO0OO4.f63706OooO00o = VelocityTracker.obtain();
            oooO00o2.f63730OooOOOO = oooO0OO4;
        }
        VelocityTracker velocityTracker = oooO00o2.f63730OooOOOO.f63706OooO00o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                oooO00o2.f63732OooOOo = motionEvent.getRawX();
                oooO00o2.f63734OooOOoo = motionEvent.getRawY();
                oooO00o2.f63727OooOO0o = motionEvent;
                oooO00o2.f63729OooOOO0 = false;
                androidx.constraintlayout.motion.widget.OooO0O0 oooO0O05 = oooO00o2.f63719OooO0OO.f63747OooOO0o;
                if (oooO0O05 != null) {
                    RectF rectFOooO00o = oooO0O05.OooO00o(motionLayout, rectF2);
                    if (rectFOooO00o == null || rectFOooO00o.contains(oooO00o2.f63727OooOO0o.getX(), oooO00o2.f63727OooOO0o.getY())) {
                        RectF rectFOooO0O0 = oooO00o2.f63719OooO0OO.f63747OooOO0o.OooO0O0(motionLayout, rectF2);
                        if (rectFOooO0O0 == null || rectFOooO0O0.contains(oooO00o2.f63727OooOO0o.getX(), oooO00o2.f63727OooOO0o.getY())) {
                            oooO00o2.f63728OooOOO = false;
                        } else {
                            oooO00o2.f63728OooOOO = true;
                        }
                        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O06 = oooO00o2.f63719OooO0OO.f63747OooOO0o;
                        float f3 = oooO00o2.f63732OooOOo;
                        float f4 = oooO00o2.f63734OooOOoo;
                        oooO0O06.f63770OooOOO = f3;
                        oooO0O06.f63772OooOOOO = f4;
                    } else {
                        oooO00o2.f63727OooOO0o = null;
                        oooO00o2.f63729OooOOO0 = true;
                    }
                }
            } else if (action == 2 && !oooO00o2.f63729OooOOO0) {
                float rawY = motionEvent.getRawY() - oooO00o2.f63734OooOOoo;
                float rawX = motionEvent.getRawX() - oooO00o2.f63732OooOOo;
                if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = oooO00o2.f63727OooOO0o) != null) {
                    if (currentState != -1) {
                        C21628OooO0oo c21628OooO0oo = oooO00o2.f63718OooO0O0;
                        if (c21628OooO0oo == null || (iOooO00o = c21628OooO0oo.OooO00o(currentState)) == -1) {
                            iOooO00o = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (OooO00o.OooO0O0 oooO0O07 : oooO00o2.f63720OooO0Oo) {
                            if (oooO0O07.f63740OooO0Oo == iOooO00o || oooO0O07.f63739OooO0OO == iOooO00o) {
                                arrayList.add(oooO0O07);
                            }
                        }
                        RectF rectF3 = new RectF();
                        Iterator it2 = arrayList.iterator();
                        float f5 = 0.0f;
                        oooO0O02 = null;
                        while (it2.hasNext()) {
                            OooO00o.OooO0O0 oooO0O08 = (OooO00o.OooO0O0) it2.next();
                            if (oooO0O08.f63750OooOOOO) {
                                it = it2;
                            } else {
                                androidx.constraintlayout.motion.widget.OooO0O0 oooO0O09 = oooO0O08.f63747OooOO0o;
                                if (oooO0O09 != null) {
                                    oooO0O09.OooO0OO(oooO00o2.f63731OooOOOo);
                                    RectF rectFOooO0O02 = oooO0O08.f63747OooOO0o.OooO0O0(motionLayout, rectF3);
                                    if (rectFOooO0O02 != null) {
                                        it = it2;
                                        if (!rectFOooO0O02.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        it = it2;
                                    }
                                    RectF rectFOooO00o2 = oooO0O08.f63747OooOO0o.OooO00o(motionLayout, rectF3);
                                    if (rectFOooO00o2 == null || rectFOooO00o2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O010 = oooO0O08.f63747OooOO0o;
                                        float fAtan2 = (oooO0O010.f63767OooOO0 * rawY) + (oooO0O010.f63758OooO * rawX);
                                        if (oooO0O010.f63766OooO0oo) {
                                            float x = motionEvent2.getX();
                                            oooO0O08.f63747OooOO0o.getClass();
                                            float y = motionEvent2.getY();
                                            oooO0O08.f63747OooOO0o.getClass();
                                            rectF = rectF3;
                                            f = f5;
                                            oooO0O03 = oooO0O02;
                                            f2 = rawY;
                                            fAtan2 = ((float) (Math.atan2(rawY + r8, rawX + r5) - Math.atan2(x - 0.5f, y - 0.5f))) * 10.0f;
                                        } else {
                                            rectF = rectF3;
                                            f = f5;
                                            oooO0O03 = oooO0O02;
                                            f2 = rawY;
                                        }
                                        float f6 = fAtan2 * (oooO0O08.f63739OooO0OO == currentState ? -1.0f : 1.1f);
                                        if (f6 > f) {
                                            f5 = f6;
                                            oooO0O02 = oooO0O08;
                                        }
                                        it2 = it;
                                        rectF3 = rectF;
                                        rawY = f2;
                                    }
                                } else {
                                    it = it2;
                                    rectF = rectF3;
                                    f = f5;
                                    oooO0O03 = oooO0O02;
                                    f2 = rawY;
                                }
                                f5 = f;
                                oooO0O02 = oooO0O03;
                                it2 = it;
                                rectF3 = rectF;
                                rawY = f2;
                            }
                            it2 = it;
                        }
                    } else {
                        oooO0O02 = oooO00o2.f63719OooO0OO;
                    }
                    if (oooO0O02 != null) {
                        setTransition(oooO0O02);
                        RectF rectFOooO0O03 = oooO00o2.f63719OooO0OO.f63747OooOO0o.OooO0O0(motionLayout, rectF2);
                        oooO00o2.f63728OooOOO = (rectFOooO0O03 == null || rectFOooO0O03.contains(oooO00o2.f63727OooOO0o.getX(), oooO00o2.f63727OooOO0o.getY())) ? false : true;
                        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O011 = oooO00o2.f63719OooO0OO.f63747OooOO0o;
                        float f7 = oooO00o2.f63732OooOOo;
                        float f8 = oooO00o2.f63734OooOOoo;
                        oooO0O011.f63770OooOOO = f7;
                        oooO0O011.f63772OooOOOO = f8;
                        oooO0O011.f63768OooOO0O = false;
                    }
                    if (!oooO00o2.f63729OooOOO0) {
                    }
                }
            }
        } else if (!oooO00o2.f63729OooOOO0) {
            OooO00o.OooO0O0 oooO0O012 = oooO00o2.f63719OooO0OO;
            if (oooO0O012 != null && (oooO0O0 = oooO0O012.f63747OooOO0o) != null && !oooO00o2.f63728OooOOO) {
                OooO0OO oooO0OO5 = oooO00o2.f63730OooOOOO;
                boolean z = oooO0O0.f63766OooO0oo;
                OooO0o oooO0o = OooO0o.f63715OooOoO0;
                float[] fArr = oooO0O0.f63769OooOO0o;
                MotionLayout motionLayout2 = oooO0O0.f63773OooOOOo;
                if (z) {
                    VelocityTracker velocityTracker2 = oooO0OO5.f63706OooO00o;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        int[] iArr = oooO0O0.f63771OooOOO0;
                        if (action2 == 1) {
                            oooO0O0.f63768OooOO0O = false;
                            VelocityTracker velocityTracker3 = oooO0OO5.f63706OooO00o;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(16);
                            }
                            VelocityTracker velocityTracker4 = oooO0OO5.f63706OooO00o;
                            float xVelocity = velocityTracker4 != null ? velocityTracker4.getXVelocity() : 0.0f;
                            VelocityTracker velocityTracker5 = oooO0OO5.f63706OooO00o;
                            float yVelocity = velocityTracker5 != null ? velocityTracker5.getYVelocity() : 0.0f;
                            float progress = motionLayout2.getProgress();
                            float width = motionLayout2.getWidth() / 2.0f;
                            float height = motionLayout2.getHeight() / 2.0f;
                            int i4 = oooO0O0.f63765OooO0oO;
                            if (i4 != -1) {
                                View viewFindViewById = motionLayout2.findViewById(i4);
                                motionLayout2.getLocationOnScreen(iArr);
                                height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                width = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                i2 = -1;
                            } else {
                                int i5 = oooO0O0.f63762OooO0Oo;
                                i2 = -1;
                                if (i5 != -1) {
                                    motionLayout2.findViewById(i5);
                                    throw null;
                                }
                            }
                            float rawX2 = motionEvent.getRawX() - width;
                            double degrees = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height, rawX2));
                            int i6 = oooO0O0.f63762OooO0Oo;
                            if (i6 != i2) {
                                motionLayout2.getViewById(i6);
                                throw null;
                            }
                            fArr[1] = 360.0f;
                            float degrees2 = ((float) (Math.toDegrees(Math.atan2(yVelocity + r9, xVelocity + rawX2)) - degrees)) * 62.5f;
                            float f9 = !Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * oooO0O0.f63779OooOo00) / fArr[1]) + progress : progress;
                            if (f9 != 0.0f && f9 != 1.0f && (i3 = oooO0O0.f63761OooO0OO) != 3) {
                                float fAbs = (degrees2 * oooO0O0.f63779OooOo00) / fArr[1];
                                float f10 = ((double) f9) < 0.5d ? 0.0f : 1.0f;
                                if (i3 == 6) {
                                    if (progress + fAbs < 0.0f) {
                                        fAbs = Math.abs(fAbs);
                                    }
                                    f10 = 1.0f;
                                }
                                if (oooO0O0.f63761OooO0OO == 7) {
                                    if (progress + fAbs > 1.0f) {
                                        fAbs = -Math.abs(fAbs);
                                    }
                                    f10 = 0.0f;
                                }
                                motionLayout2.OooO0oO(f10, fAbs * 3.0f, oooO0O0.f63761OooO0OO);
                                if (0.0f >= progress || 1.0f <= progress) {
                                    motionLayout2.setState(oooO0o);
                                }
                            } else if (0.0f >= f9 || 1.0f <= f9) {
                                motionLayout2.setState(oooO0o);
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            float width2 = motionLayout2.getWidth() / 2.0f;
                            float height2 = motionLayout2.getHeight() / 2.0f;
                            int i7 = oooO0O0.f63765OooO0oO;
                            if (i7 != -1) {
                                View viewFindViewById2 = motionLayout2.findViewById(i7);
                                motionLayout2.getLocationOnScreen(iArr);
                                height2 = ((viewFindViewById2.getBottom() + viewFindViewById2.getTop()) / 2.0f) + iArr[1];
                                width2 = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                            } else {
                                int i8 = oooO0O0.f63762OooO0Oo;
                                if (i8 != -1) {
                                    motionLayout2.findViewById(i8);
                                    throw null;
                                }
                            }
                            float rawX3 = motionEvent.getRawX() - width2;
                            float rawY2 = motionEvent.getRawY() - height2;
                            float fAtan22 = (float) (((Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2) - Math.atan2(oooO0O0.f63772OooOOOO - height2, oooO0O0.f63770OooOOO - width2)) * 180.0d) / 3.141592653589793d);
                            if (fAtan22 > 330.0f) {
                                fAtan22 -= 360.0f;
                            } else if (fAtan22 < -330.0f) {
                                fAtan22 += 360.0f;
                            }
                            if (Math.abs(fAtan22) > 0.01d || oooO0O0.f63768OooOO0O) {
                                float progress2 = motionLayout2.getProgress();
                                if (oooO0O0.f63768OooOO0O) {
                                    c3 = 1;
                                } else {
                                    c3 = 1;
                                    oooO0O0.f63768OooOO0O = true;
                                    motionLayout2.setProgress(progress2);
                                }
                                int i9 = oooO0O0.f63762OooO0Oo;
                                if (i9 != -1) {
                                    motionLayout2.getViewById(i9);
                                    throw null;
                                }
                                fArr[c3] = 360.0f;
                                float fMax = Math.max(Math.min(((fAtan22 * oooO0O0.f63779OooOo00) / 360.0f) + progress2, 1.0f), 0.0f);
                                float progress3 = motionLayout2.getProgress();
                                if (fMax == progress3) {
                                    motionLayout2.f63665OooOoO0 = 0.0f;
                                } else {
                                    if ((progress3 == 0.0f || progress3 == 1.0f) && motionLayout2.getChildCount() > 0) {
                                        motionLayout2.getChildAt(0);
                                        throw null;
                                    }
                                    motionLayout2.setProgress(fMax);
                                    VelocityTracker velocityTracker6 = oooO0OO5.f63706OooO00o;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(1000);
                                    }
                                    VelocityTracker velocityTracker7 = oooO0OO5.f63706OooO00o;
                                    float xVelocity2 = velocityTracker7 != null ? velocityTracker7.getXVelocity() : 0.0f;
                                    VelocityTracker velocityTracker8 = oooO0OO5.f63706OooO00o;
                                    double yVelocity2 = velocityTracker8 != null ? velocityTracker8.getYVelocity() : 0.0f;
                                    double d = xVelocity2;
                                    motionLayout2.f63665OooOoO0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity2, d) - r8) * Math.hypot(yVelocity2, d)) / Math.hypot(rawX3, rawY2)));
                                }
                                oooO0O0.f63770OooOOO = motionEvent.getRawX();
                                oooO0O0.f63772OooOOOO = motionEvent.getRawY();
                            }
                        }
                    } else {
                        oooO0O0.f63770OooOOO = motionEvent.getRawX();
                        oooO0O0.f63772OooOOOO = motionEvent.getRawY();
                        oooO0O0.f63768OooOO0O = false;
                    }
                } else {
                    VelocityTracker velocityTracker9 = oooO0OO5.f63706OooO00o;
                    if (velocityTracker9 != null) {
                        velocityTracker9.addMovement(motionEvent);
                    }
                    int action3 = motionEvent.getAction();
                    if (action3 == 0) {
                        oooO0O0.f63770OooOOO = motionEvent.getRawX();
                        oooO0O0.f63772OooOOOO = motionEvent.getRawY();
                        oooO0O0.f63768OooOO0O = false;
                    } else if (action3 == 1) {
                        oooO0O0.f63768OooOO0O = false;
                        VelocityTracker velocityTracker10 = oooO0OO5.f63706OooO00o;
                        if (velocityTracker10 != null) {
                            velocityTracker10.computeCurrentVelocity(1000);
                        }
                        VelocityTracker velocityTracker11 = oooO0OO5.f63706OooO00o;
                        float xVelocity3 = velocityTracker11 != null ? velocityTracker11.getXVelocity() : 0.0f;
                        VelocityTracker velocityTracker12 = oooO0OO5.f63706OooO00o;
                        float yVelocity3 = velocityTracker12 != null ? velocityTracker12.getYVelocity() : 0.0f;
                        float progress4 = motionLayout2.getProgress();
                        int i10 = oooO0O0.f63762OooO0Oo;
                        if (i10 != -1) {
                            motionLayout2.getViewById(i10);
                            throw null;
                        }
                        float fMin = Math.min(motionLayout2.getWidth(), motionLayout2.getHeight());
                        float f11 = oooO0O0.f63767OooOO0 * fMin;
                        fArr[1] = f11;
                        float f12 = oooO0O0.f63758OooO;
                        float f13 = fMin * f12;
                        fArr[0] = f13;
                        float fAbs2 = f12 != 0.0f ? xVelocity3 / f13 : yVelocity3 / f11;
                        float f14 = !Float.isNaN(fAbs2) ? (fAbs2 / 3.0f) + progress4 : progress4;
                        if (f14 != 0.0f && f14 != 1.0f && (i = oooO0O0.f63761OooO0OO) != 3) {
                            float f15 = ((double) f14) < 0.5d ? 0.0f : 1.0f;
                            if (i == 6) {
                                if (progress4 + fAbs2 < 0.0f) {
                                    fAbs2 = Math.abs(fAbs2);
                                }
                                f15 = 1.0f;
                            }
                            if (oooO0O0.f63761OooO0OO == 7) {
                                if (progress4 + fAbs2 > 1.0f) {
                                    fAbs2 = -Math.abs(fAbs2);
                                }
                                f15 = 0.0f;
                            }
                            motionLayout2.OooO0oO(f15, fAbs2, oooO0O0.f63761OooO0OO);
                            if (0.0f >= progress4 || 1.0f <= progress4) {
                                motionLayout2.setState(oooO0o);
                            }
                        } else if (0.0f >= f14 || 1.0f <= f14) {
                            motionLayout2.setState(oooO0o);
                        }
                    } else if (action3 == 2) {
                        float rawY3 = motionEvent.getRawY() - oooO0O0.f63772OooOOOO;
                        float rawX4 = motionEvent.getRawX() - oooO0O0.f63770OooOOO;
                        if (Math.abs((oooO0O0.f63767OooOO0 * rawY3) + (oooO0O0.f63758OooO * rawX4)) > oooO0O0.f63780OooOo0O || oooO0O0.f63768OooOO0O) {
                            float progress5 = motionLayout2.getProgress();
                            if (!oooO0O0.f63768OooOO0O) {
                                oooO0O0.f63768OooOO0O = true;
                                motionLayout2.setProgress(progress5);
                            }
                            int i11 = oooO0O0.f63762OooO0Oo;
                            if (i11 != -1) {
                                motionLayout2.getViewById(i11);
                                throw null;
                            }
                            float fMin2 = Math.min(motionLayout2.getWidth(), motionLayout2.getHeight());
                            fArr[1] = fMin2 * oooO0O0.f63767OooOO0;
                            fArr[0] = fMin2 * oooO0O0.f63758OooO;
                            if (Math.abs(((r11 * r12) + (r13 * r10)) * oooO0O0.f63779OooOo00) < 0.01d) {
                                c2 = 0;
                                fArr[0] = 0.01f;
                                c = 1;
                                fArr[1] = 0.01f;
                            } else {
                                c = 1;
                                c2 = 0;
                            }
                            float fMax2 = Math.max(Math.min(progress5 + (oooO0O0.f63758OooO != 0.0f ? rawX4 / fArr[c2] : rawY3 / fArr[c]), 1.0f), 0.0f);
                            if (oooO0O0.f63761OooO0OO == 6) {
                                fMax2 = Math.max(fMax2, 0.01f);
                            }
                            if (oooO0O0.f63761OooO0OO == 7) {
                                fMax2 = Math.min(fMax2, 0.99f);
                            }
                            float progress6 = motionLayout2.getProgress();
                            if (fMax2 == progress6) {
                                motionLayout2.f63665OooOoO0 = 0.0f;
                            } else {
                                if ((progress6 == 0.0f || progress6 == 1.0f) && motionLayout2.getChildCount() > 0) {
                                    motionLayout2.getChildAt(0);
                                    throw null;
                                }
                                motionLayout2.setProgress(fMax2);
                                VelocityTracker velocityTracker13 = oooO0OO5.f63706OooO00o;
                                if (velocityTracker13 != null) {
                                    velocityTracker13.computeCurrentVelocity(1000);
                                }
                                VelocityTracker velocityTracker14 = oooO0OO5.f63706OooO00o;
                                float xVelocity4 = velocityTracker14 != null ? velocityTracker14.getXVelocity() : 0.0f;
                                VelocityTracker velocityTracker15 = oooO0OO5.f63706OooO00o;
                                motionLayout2.f63665OooOoO0 = oooO0O0.f63758OooO != 0.0f ? xVelocity4 / fArr[0] : (velocityTracker15 != null ? velocityTracker15.getYVelocity() : 0.0f) / fArr[1];
                            }
                            oooO0O0.f63770OooOOO = motionEvent.getRawX();
                            oooO0O0.f63772OooOOOO = motionEvent.getRawY();
                        }
                    }
                }
            }
            oooO00o2.f63732OooOOo = motionEvent.getRawX();
            oooO00o2.f63734OooOOoo = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (oooO0OO = oooO00o2.f63730OooOOOO) != null) {
                VelocityTracker velocityTracker16 = oooO0OO.f63706OooO00o;
                if (velocityTracker16 != null) {
                    velocityTracker16.recycle();
                    oooO0OO2 = null;
                    oooO0OO.f63706OooO00o = null;
                } else {
                    oooO0OO2 = null;
                }
                oooO00o2.f63730OooOOOO = oooO0OO2;
                int i12 = this.f63666OooOoOO;
                if (i12 != -1) {
                    oooO00o2.OooO00o(i12, this);
                }
            }
        }
        OooO00o.OooO0O0 oooO0O013 = this.f63663OooOo0o.f63719OooO0OO;
        if ((oooO0O013.f63752OooOOo0 & 4) != 0) {
            return oooO0O013.f63747OooOO0o.f63768OooOO0O;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f63689OoooOo0 == null) {
                this.f63689OoooOo0 = new CopyOnWriteArrayList<>();
            }
            this.f63689OoooOo0.add(motionHelper);
            if (motionHelper.f63658Oooo000) {
                if (this.f63701o000oOoO == null) {
                    this.f63701o000oOoO = new ArrayList<>();
                }
                this.f63701o000oOoO.add(motionHelper);
            }
            if (motionHelper.f63659Oooo00O) {
                if (this.f63687OoooOOO == null) {
                    this.f63687OoooOOO = new ArrayList<>();
                }
                this.f63687OoooOOO.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.f63688OoooOOo == null) {
                    this.f63688OoooOOo = new ArrayList<>();
                }
                this.f63688OoooOOo.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f63701o000oOoO;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f63687OoooOOO;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o;
        OooO00o.OooO0O0 oooO0O0;
        if (this.f63666OooOoOO == -1 && (oooO00o = this.f63663OooOo0o) != null && (oooO0O0 = oooO00o.f63719OooO0OO) != null) {
            int i = oooO0O0.f63751OooOOOo;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                if (getChildCount() <= 0) {
                    return;
                }
                getChildAt(0);
                throw null;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.f63680Oooo0oO = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f63697Oooooo = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f63670OooOooo = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f63663OooOo0o != null) {
            setState(OooO0o.f63712OooOo);
            Interpolator interpolatorOooO0o0 = this.f63663OooOo0o.OooO0o0();
            if (interpolatorOooO0o0 != null) {
                setProgress(interpolatorOooO0o0.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f63687OoooOOO;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f63687OoooOOO.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f63701o000oOoO;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f63701o000oOoO.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            this.f63698Oooooo0.f63707OooO00o = f;
            return;
        }
        OooO0o oooO0o = OooO0o.f63715OooOoO0;
        OooO0o oooO0o2 = OooO0o.f63712OooOo;
        if (f <= 0.0f) {
            if (this.f63675Oooo00o == 1.0f && this.f63666OooOoOO == this.f63668OooOoo0) {
                setState(oooO0o2);
            }
            this.f63666OooOoOO = this.f63664OooOoO;
            if (this.f63675Oooo00o == 0.0f) {
                setState(oooO0o);
            }
        } else if (f >= 1.0f) {
            if (this.f63675Oooo00o == 0.0f && this.f63666OooOoOO == this.f63664OooOoO) {
                setState(oooO0o2);
            }
            this.f63666OooOoOO = this.f63668OooOoo0;
            if (this.f63675Oooo00o == 1.0f) {
                setState(oooO0o);
            }
        } else {
            this.f63666OooOoOO = -1;
            setState(oooO0o2);
        }
        if (this.f63663OooOo0o == null) {
            return;
        }
        this.f63677Oooo0OO = true;
        this.f63676Oooo0O0 = f;
        this.f63674Oooo00O = f;
        this.f63672Oooo0 = -1L;
        this.f63679Oooo0o0 = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.OooO00o oooO00o) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        this.f63663OooOo0o = oooO00o;
        boolean zIsRtl = isRtl();
        oooO00o.f63731OooOOOo = zIsRtl;
        OooO00o.OooO0O0 oooO0O02 = oooO00o.f63719OooO0OO;
        if (oooO0O02 != null && (oooO0O0 = oooO0O02.f63747OooOO0o) != null) {
            oooO0O0.OooO0OO(zIsRtl);
        }
        throw null;
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.f63666OooOoOO = i;
            return;
        }
        if (this.f63698Oooooo0 == null) {
            this.f63698Oooooo0 = new C21621OooO0Oo();
        }
        C21621OooO0Oo c21621OooO0Oo = this.f63698Oooooo0;
        c21621OooO0Oo.f63709OooO0OO = i;
        c21621OooO0Oo.f63710OooO0Oo = i;
    }

    public void setState(OooO0o oooO0o) {
        OooO0o oooO0o2 = OooO0o.f63715OooOoO0;
        if (oooO0o == oooO0o2 && this.f63666OooOoOO == -1) {
            return;
        }
        OooO0o oooO0o3 = this.f63699OoooooO;
        this.f63699OoooooO = oooO0o;
        OooO0o oooO0o4 = OooO0o.f63712OooOo;
        if (oooO0o3 == oooO0o4 && oooO0o == oooO0o4) {
            OooO0OO();
        }
        int iOrdinal = oooO0o3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && oooO0o == oooO0o2) {
                OooO0Oo();
                return;
            }
            return;
        }
        if (oooO0o == oooO0o4) {
            OooO0OO();
        }
        if (oooO0o == oooO0o2) {
            OooO0Oo();
        }
    }

    public void setTransition(int i) {
        OooO00o.OooO0O0 next;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o != null) {
            Iterator<OooO00o.OooO0O0> it = oooO00o.f63720OooO0Oo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next.f63737OooO00o == i) {
                        break;
                    }
                }
            }
            this.f63664OooOoO = next.f63740OooO0Oo;
            this.f63668OooOoo0 = next.f63739OooO0OO;
            if (!isAttachedToWindow()) {
                C21621OooO0Oo c21621OooO0Oo = this.f63698Oooooo0;
                c21621OooO0Oo.f63709OooO0OO = this.f63664OooOoO;
                c21621OooO0Oo.f63710OooO0Oo = this.f63668OooOoo0;
                return;
            }
            androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f63663OooOo0o;
            oooO00o2.f63719OooO0OO = next;
            androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0 = next.f63747OooOO0o;
            if (oooO0O0 != null) {
                oooO0O0.OooO0OO(oooO00o2.f63731OooOOOo);
            }
            this.f63663OooOo0o.OooO0O0(this.f63664OooOoO);
            this.f63663OooOo0o.OooO0O0(this.f63668OooOoo0);
            throw null;
        }
    }

    public void setTransitionDuration(int i) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        OooO00o.OooO0O0 oooO0O0 = oooO00o.f63719OooO0OO;
        if (oooO0O0 != null) {
            oooO0O0.f63744OooO0oo = Math.max(i, 8);
        } else {
            oooO00o.f63725OooOO0 = i;
        }
    }

    public void setTransitionListener(InterfaceC21622OooO0o0 interfaceC21622OooO0o0) {
        this.f63678Oooo0o = interfaceC21622OooO0o0;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f63698Oooooo0 == null) {
            this.f63698Oooooo0 = new C21621OooO0Oo();
        }
        C21621OooO0Oo c21621OooO0Oo = this.f63698Oooooo0;
        c21621OooO0Oo.getClass();
        c21621OooO0Oo.f63707OooO00o = bundle.getFloat("motion.progress");
        c21621OooO0Oo.f63708OooO0O0 = bundle.getFloat("motion.velocity");
        c21621OooO0Oo.f63709OooO0OO = bundle.getInt("motion.StartState");
        c21621OooO0Oo.f63710OooO0Oo = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f63698Oooooo0.OooO00o();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return o000OO.OooO00o.OooO0O0(context, this.f63664OooOoO) + "->" + o000OO.OooO00o.OooO0O0(context, this.f63668OooOoo0) + " (pos:" + this.f63675Oooo00o + " Dpos/Dt:" + this.f63665OooOoO0;
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f63683OoooO0 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f63683OoooO0 = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i, int i2, int i3) {
        setState(OooO0o.f63713OooOo0o);
        this.f63666OooOoOO = i;
        this.f63664OooOoO = -1;
        this.f63668OooOoo0 = -1;
        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = this.mConstraintLayoutSpec;
        if (oooO0O0 != null) {
            oooO0O0.OooO0O0(i2, i3, i);
            return;
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        if (oooO00o != null) {
            oooO00o.OooO0O0(i).OooO0O0(this);
        }
    }

    public void setTransition(OooO00o.OooO0O0 oooO0O0) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O02;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f63663OooOo0o;
        oooO00o.f63719OooO0OO = oooO0O0;
        if (oooO0O0 != null && (oooO0O02 = oooO0O0.f63747OooOO0o) != null) {
            oooO0O02.OooO0OO(oooO00o.f63731OooOOOo);
        }
        setState(OooO0o.f63713OooOo0o);
        int i = this.f63666OooOoOO;
        OooO00o.OooO0O0 oooO0O03 = this.f63663OooOo0o.f63719OooO0OO;
        if (i == (oooO0O03 == null ? -1 : oooO0O03.f63739OooO0OO)) {
            this.f63675Oooo00o = 1.0f;
            this.f63674Oooo00O = 1.0f;
            this.f63676Oooo0O0 = 1.0f;
        } else {
            this.f63675Oooo00o = 0.0f;
            this.f63674Oooo00O = 0.0f;
            this.f63676Oooo0O0 = 0.0f;
        }
        this.f63672Oooo0 = (oooO0O0.f63752OooOOo0 & 1) != 0 ? -1L : getNanoTime();
        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f63663OooOo0o;
        OooO00o.OooO0O0 oooO0O04 = oooO00o2.f63719OooO0OO;
        int i2 = oooO0O04 == null ? -1 : oooO0O04.f63740OooO0Oo;
        int i3 = oooO0O04 != null ? oooO0O04.f63739OooO0OO : -1;
        if (i2 == this.f63664OooOoO && i3 == this.f63668OooOoo0) {
            return;
        }
        this.f63664OooOoO = i2;
        this.f63668OooOoo0 = i3;
        oooO00o2.OooOOO0(i2, i3);
        this.f63663OooOo0o.OooO0O0(this.f63664OooOoO);
        this.f63663OooOo0o.OooO0O0(this.f63668OooOoo0);
        throw null;
    }
}
