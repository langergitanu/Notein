package o00O;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.C22142OooO0oo;
import com.facebook.common.callercontext.ContextChain;
import com.miui.penengine.p596e.C18773h;
import java.io.IOException;
import o00OO000.OooO0OO;
import o00OO00O.C24985OooO0oO;
import o00OO00O.C24986OooO0oo;
import o00OO00o.C24988OooO00o;

/* JADX INFO: renamed from: o00O.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24781OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinearInterpolator f84032OooO00o = new LinearInterpolator();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84033OooO0O0 = OooO0OO.OooO00o.OooO00o("t", "s", "e", "o", ContextChain.TAG_INFRA, C18773h.f57233c, "to", "ti");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84034OooO0OO = OooO0OO.OooO00o.OooO00o("x", "y");

    public static Interpolator OooO00o(PointF pointF, PointF pointF2) {
        pointF.x = C24985OooO0oO.OooO0O0(pointF.x, -1.0f, 1.0f);
        pointF.y = C24985OooO0oO.OooO0O0(pointF.y, -100.0f, 100.0f);
        pointF2.x = C24985OooO0oO.OooO0O0(pointF2.x, -1.0f, 1.0f);
        float fOooO0O0 = C24985OooO0oO.OooO0O0(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fOooO0O0;
        int i = C24986OooO0oo.f84760OooO00o;
        try {
            return PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, fOooO0O0);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0033. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> C24988OooO00o<T> OooO0O0(o00OO000.OooO0OO oooO0OO, C22142OooO0oo c22142OooO0oo, float f, InterfaceC24795Oooo0OO<T> interfaceC24795Oooo0OO, boolean z, boolean z2) throws IOException {
        T t;
        Interpolator interpolatorOooO00o;
        T t2;
        Interpolator interpolatorOooO00o2;
        Interpolator interpolatorOooO00o3;
        Interpolator interpolatorOooO00o4;
        OooO0OO.OooO00o oooO00o;
        PointF pointF;
        PointF pointF2;
        OooO0OO.OooO00o oooO00o2;
        PointF pointF3;
        PointF pointF4;
        LinearInterpolator linearInterpolator = f84032OooO00o;
        OooO0OO.OooO00o oooO00o3 = f84033OooO0O0;
        if (!z || !z2) {
            OooO0OO.OooO00o oooO00o4 = oooO00o3;
            if (!z) {
                return new C24988OooO00o<>(interfaceC24795Oooo0OO.OooO00o(oooO0OO, f));
            }
            oooO0OO.OooO0OO();
            PointF pointFOooO0O0 = null;
            PointF pointFOooO0O02 = null;
            PointF pointFOooO0O03 = null;
            boolean z3 = false;
            PointF pointFOooO0O04 = null;
            T tOooO00o = null;
            float fOooo00o = 0.0f;
            T tOooO00o2 = null;
            while (oooO0OO.OooOooo()) {
                OooO0OO.OooO00o oooO00o5 = oooO00o4;
                switch (oooO0OO.o0Oo0oo(oooO00o5)) {
                    case 0:
                        oooO00o4 = oooO00o5;
                        fOooo00o = (float) oooO0OO.Oooo00o();
                        continue;
                    case 1:
                        tOooO00o = interfaceC24795Oooo0OO.OooO00o(oooO0OO, f);
                        break;
                    case 2:
                        tOooO00o2 = interfaceC24795Oooo0OO.OooO00o(oooO0OO, f);
                        break;
                    case 3:
                        pointFOooO0O04 = C24779OooOOo.OooO0O0(oooO0OO, 1.0f);
                        break;
                    case 4:
                        pointFOooO0O0 = C24779OooOOo.OooO0O0(oooO0OO, 1.0f);
                        break;
                    case 5:
                        z3 = oooO0OO.Oooo0() == 1;
                        break;
                    case 6:
                        pointFOooO0O02 = C24779OooOOo.OooO0O0(oooO0OO, f);
                        break;
                    case 7:
                        pointFOooO0O03 = C24779OooOOo.OooO0O0(oooO0OO, f);
                        break;
                    default:
                        oooO0OO.o00000oO();
                        break;
                }
                oooO00o4 = oooO00o5;
            }
            oooO0OO.OooOOo0();
            if (z3) {
                t = tOooO00o;
            } else {
                if (pointFOooO0O04 != null && pointFOooO0O0 != null) {
                    interpolatorOooO00o = OooO00o(pointFOooO0O04, pointFOooO0O0);
                    t = tOooO00o2;
                    C24988OooO00o<T> c24988OooO00o = new C24988OooO00o<>(c22142OooO0oo, tOooO00o, t, interpolatorOooO00o, fOooo00o, (Float) null);
                    c24988OooO00o.f84769OooO0oo = pointFOooO0O02;
                    c24988OooO00o.f84761OooO = pointFOooO0O03;
                    return c24988OooO00o;
                }
                t = tOooO00o2;
            }
            interpolatorOooO00o = linearInterpolator;
            C24988OooO00o<T> c24988OooO00o2 = new C24988OooO00o<>(c22142OooO0oo, tOooO00o, t, interpolatorOooO00o, fOooo00o, (Float) null);
            c24988OooO00o2.f84769OooO0oo = pointFOooO0O02;
            c24988OooO00o2.f84761OooO = pointFOooO0O03;
            return c24988OooO00o2;
        }
        oooO0OO.OooO0OO();
        PointF pointF5 = null;
        PointF pointFOooO0O05 = null;
        PointF pointFOooO0O06 = null;
        boolean z4 = false;
        PointF pointFOooO0O07 = null;
        PointF pointFOooO0O08 = null;
        PointF pointF6 = null;
        T tOooO00o3 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        float fOooo00o2 = 0.0f;
        T tOooO00o4 = null;
        while (oooO0OO.OooOooo()) {
            int iO0Oo0oo = oooO0OO.o0Oo0oo(oooO00o3);
            OooO0OO.OooO0O0 oooO0O0 = OooO0OO.OooO0O0.f84728OooOoO0;
            LinearInterpolator linearInterpolator2 = linearInterpolator;
            OooO0OO.OooO0O0 oooO0O02 = OooO0OO.OooO0O0.f84730OooOoo;
            boolean z5 = z4;
            OooO0OO.OooO00o oooO00o6 = f84034OooO0OO;
            switch (iO0Oo0oo) {
                case 0:
                    oooO00o2 = oooO00o3;
                    pointF3 = pointFOooO0O05;
                    pointF4 = pointFOooO0O06;
                    z4 = z5;
                    fOooo00o2 = (float) oooO0OO.Oooo00o();
                    pointFOooO0O05 = pointF3;
                    oooO00o3 = oooO00o2;
                    linearInterpolator = linearInterpolator2;
                    pointFOooO0O06 = pointF4;
                    break;
                case 1:
                    oooO00o = oooO00o3;
                    tOooO00o3 = interfaceC24795Oooo0OO.OooO00o(oooO0OO, f);
                    z4 = z5;
                    oooO00o3 = oooO00o;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 2:
                    oooO00o = oooO00o3;
                    tOooO00o4 = interfaceC24795Oooo0OO.OooO00o(oooO0OO, f);
                    z4 = z5;
                    oooO00o3 = oooO00o;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 3:
                    oooO00o2 = oooO00o3;
                    pointF3 = pointFOooO0O05;
                    pointF4 = pointFOooO0O06;
                    T t3 = tOooO00o3;
                    if (oooO0OO.ooOO() == oooO0O0) {
                        oooO0OO.OooO0OO();
                        float fOooo00o3 = 0.0f;
                        float fOooo00o4 = 0.0f;
                        float fOooo00o5 = 0.0f;
                        float fOooo00o6 = 0.0f;
                        while (oooO0OO.OooOooo()) {
                            int iO0Oo0oo2 = oooO0OO.o0Oo0oo(oooO00o6);
                            if (iO0Oo0oo2 != 0) {
                                if (iO0Oo0oo2 != 1) {
                                    oooO0OO.o00000oO();
                                } else if (oooO0OO.ooOO() == oooO0O02) {
                                    fOooo00o6 = (float) oooO0OO.Oooo00o();
                                    fOooo00o4 = fOooo00o6;
                                } else {
                                    oooO0OO.OooO00o();
                                    fOooo00o4 = (float) oooO0OO.Oooo00o();
                                    fOooo00o6 = oooO0OO.ooOO() == oooO0O02 ? (float) oooO0OO.Oooo00o() : fOooo00o4;
                                    oooO0OO.OooOOO0();
                                }
                            } else if (oooO0OO.ooOO() == oooO0O02) {
                                fOooo00o5 = (float) oooO0OO.Oooo00o();
                                fOooo00o3 = fOooo00o5;
                            } else {
                                oooO0OO.OooO00o();
                                fOooo00o3 = (float) oooO0OO.Oooo00o();
                                fOooo00o5 = oooO0OO.ooOO() == oooO0O02 ? (float) oooO0OO.Oooo00o() : fOooo00o3;
                                oooO0OO.OooOOO0();
                            }
                        }
                        PointF pointF9 = new PointF(fOooo00o3, fOooo00o4);
                        pointF7 = new PointF(fOooo00o5, fOooo00o6);
                        oooO0OO.OooOOo0();
                        z4 = z5;
                        tOooO00o3 = t3;
                        pointF6 = pointF9;
                    } else {
                        pointFOooO0O07 = C24779OooOOo.OooO0O0(oooO0OO, f);
                        z4 = z5;
                        tOooO00o3 = t3;
                    }
                    pointFOooO0O05 = pointF3;
                    oooO00o3 = oooO00o2;
                    linearInterpolator = linearInterpolator2;
                    pointFOooO0O06 = pointF4;
                    break;
                case 4:
                    T t4 = tOooO00o3;
                    if (oooO0OO.ooOO() == oooO0O0) {
                        oooO0OO.OooO0OO();
                        float fOooo00o7 = 0.0f;
                        float fOooo00o8 = 0.0f;
                        float fOooo00o9 = 0.0f;
                        float fOooo00o10 = 0.0f;
                        while (oooO0OO.OooOooo()) {
                            OooO0OO.OooO00o oooO00o7 = oooO00o3;
                            int iO0Oo0oo3 = oooO0OO.o0Oo0oo(oooO00o6);
                            if (iO0Oo0oo3 != 0) {
                                pointF2 = pointFOooO0O06;
                                if (iO0Oo0oo3 != 1) {
                                    oooO0OO.o00000oO();
                                } else if (oooO0OO.ooOO() == oooO0O02) {
                                    fOooo00o10 = (float) oooO0OO.Oooo00o();
                                    pointFOooO0O05 = pointFOooO0O05;
                                    fOooo00o8 = fOooo00o10;
                                } else {
                                    pointF = pointFOooO0O05;
                                    oooO0OO.OooO00o();
                                    fOooo00o8 = (float) oooO0OO.Oooo00o();
                                    fOooo00o10 = oooO0OO.ooOO() == oooO0O02 ? (float) oooO0OO.Oooo00o() : fOooo00o8;
                                    oooO0OO.OooOOO0();
                                    pointFOooO0O05 = pointF;
                                }
                            } else {
                                pointF = pointFOooO0O05;
                                pointF2 = pointFOooO0O06;
                                if (oooO0OO.ooOO() == oooO0O02) {
                                    fOooo00o9 = (float) oooO0OO.Oooo00o();
                                    pointFOooO0O05 = pointF;
                                    fOooo00o7 = fOooo00o9;
                                } else {
                                    oooO0OO.OooO00o();
                                    fOooo00o7 = (float) oooO0OO.Oooo00o();
                                    fOooo00o9 = oooO0OO.ooOO() == oooO0O02 ? (float) oooO0OO.Oooo00o() : fOooo00o7;
                                    oooO0OO.OooOOO0();
                                    pointFOooO0O05 = pointF;
                                }
                            }
                            oooO00o3 = oooO00o7;
                            pointFOooO0O06 = pointF2;
                        }
                        oooO00o = oooO00o3;
                        PointF pointF10 = new PointF(fOooo00o7, fOooo00o8);
                        pointF5 = new PointF(fOooo00o9, fOooo00o10);
                        oooO0OO.OooOOo0();
                        z4 = z5;
                        tOooO00o3 = t4;
                        pointF8 = pointF10;
                    } else {
                        oooO00o = oooO00o3;
                        pointFOooO0O08 = C24779OooOOo.OooO0O0(oooO0OO, f);
                        z4 = z5;
                        tOooO00o3 = t4;
                    }
                    oooO00o3 = oooO00o;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 5:
                    z4 = oooO0OO.Oooo0() == 1;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 6:
                    pointFOooO0O05 = C24779OooOOo.OooO0O0(oooO0OO, f);
                    z4 = z5;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 7:
                    pointFOooO0O06 = C24779OooOOo.OooO0O0(oooO0OO, f);
                    z4 = z5;
                    linearInterpolator = linearInterpolator2;
                    break;
                default:
                    oooO0OO.o00000oO();
                    z4 = z5;
                    linearInterpolator = linearInterpolator2;
                    break;
            }
        }
        LinearInterpolator linearInterpolator3 = linearInterpolator;
        PointF pointF11 = pointFOooO0O05;
        PointF pointF12 = pointFOooO0O06;
        boolean z6 = z4;
        T t5 = tOooO00o3;
        oooO0OO.OooOOo0();
        if (z6) {
            t2 = t5;
        } else {
            if (pointFOooO0O07 != null && pointFOooO0O08 != null) {
                interpolatorOooO00o4 = OooO00o(pointFOooO0O07, pointFOooO0O08);
                t2 = tOooO00o4;
                interpolatorOooO00o2 = null;
                interpolatorOooO00o3 = null;
                if (interpolatorOooO00o2 == null) {
                }
                c24988OooO00o.f84769OooO0oo = pointF11;
                c24988OooO00o.f84761OooO = pointF12;
                return c24988OooO00o;
            }
            if (pointF6 != null && pointF7 != null && pointF8 != null && pointF5 != null) {
                interpolatorOooO00o2 = OooO00o(pointF6, pointF8);
                interpolatorOooO00o3 = OooO00o(pointF7, pointF5);
                t2 = tOooO00o4;
                interpolatorOooO00o4 = null;
                C24988OooO00o<T> c24988OooO00o3 = (interpolatorOooO00o2 == null || interpolatorOooO00o3 == null) ? new C24988OooO00o<>(c22142OooO0oo, t5, t2, interpolatorOooO00o4, fOooo00o2, (Float) null) : new C24988OooO00o<>(c22142OooO0oo, t5, t2, interpolatorOooO00o2, interpolatorOooO00o3, fOooo00o2);
                c24988OooO00o3.f84769OooO0oo = pointF11;
                c24988OooO00o3.f84761OooO = pointF12;
                return c24988OooO00o3;
            }
            t2 = tOooO00o4;
        }
        interpolatorOooO00o4 = linearInterpolator3;
        interpolatorOooO00o2 = null;
        interpolatorOooO00o3 = null;
        if (interpolatorOooO00o2 == null) {
        }
        c24988OooO00o3.f84769OooO0oo = pointF11;
        c24988OooO00o3.f84761OooO = pointF12;
        return c24988OooO00o3;
    }
}
