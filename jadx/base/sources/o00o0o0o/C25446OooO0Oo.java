package o00o0o0o;

import OooooOo.C21385OooOOOO;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import com.aspose.slides.C22205OooOOo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0OO.InterfaceC26008OooO0o0;
import oO0o0O0o.C33596OooOOo0;
import oO0o0Ooo.C33841OooOo0O;

/* JADX INFO: renamed from: o00o0o0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25446OooO0Oo implements InterfaceC25445OooO0OO, InterfaceC26008OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static C25446OooO0Oo f86727OooO00o;

    public static final float OooO(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        return (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(f2, f4, f5 * f5));
    }

    public static RectF OooO0OO(List list) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        OooOOO0.OooO0oO(list, "<this>");
        if (list.isEmpty()) {
            return new RectF();
        }
        List list2 = list;
        Iterator it = list2.iterator();
        Float fValueOf4 = null;
        if (it.hasNext()) {
            float fMin = ((PointF) it.next()).x;
            while (it.hasNext()) {
                fMin = Math.min(fMin, ((PointF) it.next()).x);
            }
            fValueOf = Float.valueOf(fMin);
        } else {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        Iterator it2 = list2.iterator();
        if (it2.hasNext()) {
            float fMin2 = ((PointF) it2.next()).y;
            while (it2.hasNext()) {
                fMin2 = Math.min(fMin2, ((PointF) it2.next()).y);
            }
            fValueOf2 = Float.valueOf(fMin2);
        } else {
            fValueOf2 = null;
        }
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
        Iterator it3 = list2.iterator();
        if (it3.hasNext()) {
            float fMax = ((PointF) it3.next()).x;
            while (it3.hasNext()) {
                fMax = Math.max(fMax, ((PointF) it3.next()).x);
            }
            fValueOf3 = Float.valueOf(fMax);
        } else {
            fValueOf3 = null;
        }
        float fFloatValue3 = fValueOf3 != null ? fValueOf3.floatValue() : 0.0f;
        Iterator it4 = list2.iterator();
        if (it4.hasNext()) {
            float fMax2 = ((PointF) it4.next()).y;
            while (it4.hasNext()) {
                fMax2 = Math.max(fMax2, ((PointF) it4.next()).y);
            }
            fValueOf4 = Float.valueOf(fMax2);
        }
        return new RectF(fFloatValue * 1.0f, fFloatValue2 * 1.0f, fFloatValue3 * 1.0f, (fValueOf4 != null ? fValueOf4.floatValue() : 0.0f) * 1.0f);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [float, void] */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], float] */
    public static final float OooO0Oo(PointF pointF, PointF p1) {
        OooOOO0.OooO0oO(pointF, "<this>");
        OooOOO0.OooO0oO(p1, "p1");
        float f = pointF.x;
        float f2 = p1.x;
        float f3 = (f - f2) * (f - f2);
        ?? r3 = pointF.y;
        ?? r4 = p1.y;
        float f4 = r3 - r4;
        return (float) Math.sqrt((double) Bundle.putByteArray(r3, r4));
    }

    public static final PointF OooO0o(PointF pointF, PointF pointF2, PointF pointF3) {
        PointF pointF4 = new PointF();
        pointF4.set(pointF.x - pointF2.x, pointF.y - pointF2.y);
        PointF pointF5 = new PointF();
        pointF5.set(pointF3.x - pointF.x, pointF3.y - pointF.y);
        float f = pointF4.x;
        float f2 = pointF4.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        PointF pointF6 = new PointF(pointF4.x / fSqrt, pointF4.y / fSqrt);
        float f3 = (pointF6.y * pointF5.y) + (pointF6.x * pointF5.x);
        return new PointF((pointF6.x * f3) + pointF.x, (f3 * pointF6.y) + pointF.y);
    }

    public static synchronized C25446OooO0Oo OooO0o0() {
        try {
            if (f86727OooO00o == null) {
                f86727OooO00o = new C25446OooO0Oo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f86727OooO00o;
    }

    public static final boolean OooO0oO(PointF pointF, List polygon) {
        OooOOO0.OooO0oO(pointF, "<this>");
        OooOOO0.OooO0oO(polygon, "polygon");
        int size = polygon.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            PointF pointF2 = (PointF) polygon.get(i);
            i++;
            PointF pointF3 = (PointF) polygon.get(i % polygon.size());
            float f = pointF2.y;
            float f2 = pointF3.y;
            if (f != f2 && pointF.y >= Math.min(f, f2) && pointF.y < Math.max(pointF2.y, pointF3.y)) {
                float f3 = pointF.y;
                float f4 = pointF2.y;
                float f5 = pointF3.x;
                float f6 = pointF2.x;
                if ((((f5 - f6) * (f3 - f4)) / (pointF3.y - f4)) + f6 > pointF.x) {
                    i2++;
                }
            }
        }
        return i2 % 2 == 1;
    }

    public static final boolean OooO0oo(PointF a, PointF b, PointF c, PointF d) {
        OooOOO0.OooO0oO(a, "a");
        OooOOO0.OooO0oO(b, "b");
        OooOOO0.OooO0oO(c, "c");
        OooOOO0.OooO0oO(d, "d");
        float f = a.x;
        float f2 = c.x;
        float f3 = b.y;
        float f4 = c.y;
        float f5 = a.y;
        float f6 = b.x;
        double d2 = ((double) ((f3 - f4) * (f - f2))) - (((double) (f5 - f4)) * ((double) (f6 - f2)));
        float f7 = d.x;
        float f8 = d.y;
        double d3 = ((double) ((f3 - f8) * (f - f7))) - (((double) (f5 - f8)) * ((double) (f6 - f7)));
        if (d2 * d3 >= -1.0E-5d) {
            return false;
        }
        double d4 = ((double) ((f8 - f5) * (f2 - f))) - (((double) (f4 - f5)) * ((double) (f7 - f)));
        return ((d2 + d4) - d3) * d4 < -1.0E-5d;
    }

    public static final float OooOO0(float f, float f2, float f3, float f4, float f5, float f6) {
        float fOooO = OooO(f, f2, f3, f4);
        float fOooO2 = OooO(f, f2, f5, f6);
        float fOooO3 = OooO(f3, f4, f5, f6);
        if (fOooO3 + fOooO2 == fOooO) {
            return 0.0f;
        }
        if (fOooO > 1.0E-6d) {
            float f7 = fOooO3 * fOooO3;
            float f8 = fOooO * fOooO;
            float f9 = fOooO2 * fOooO2;
            if (f7 < f8 + f9) {
                if (f9 >= f8 + f7) {
                    return fOooO3;
                }
                float f10 = 2;
                float f11 = ((fOooO + fOooO2) + fOooO3) / f10;
                return (f10 * ((float) Math.sqrt((f11 - fOooO3) * ((f11 - fOooO2) * ((f11 - fOooO) * f11))))) / fOooO;
            }
        }
        return fOooO2;
    }

    public static final PointF OooOO0O(PointF pointF, PointF o2, float f) {
        OooOOO0.OooO0oO(pointF, "<this>");
        OooOOO0.OooO0oO(o2, "o");
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = o2.x;
        float f5 = o2.y;
        double radians = Math.toRadians(f);
        double d = f2 - f4;
        double d2 = f3 - f5;
        return new PointF((float) (((Math.cos(radians) * d) - (Math.sin(radians) * d2)) + ((double) f4)), (float) (C21385OooOOOO.OooO0O0(radians, d2, Math.sin(radians) * d) + ((double) f5)));
    }

    public static final long OooOO0o(String str, long j, long j2, long j3) {
        String property;
        int i = C33841OooOo0O.f121953OooO00o;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lOooOOO = C33596OooOOo0.OooOOO(property);
        if (lOooOOO == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lOooOOO.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j2);
        C22205OooOOo.OooO0OO(j3, "..", ", but is '", sb);
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int OooOOO0(int i, int i2, String str) {
        return (int) OooOO0o(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    @Override // o0O0o0OO.InterfaceC26008OooO0o0
    public boolean OooO00o() {
        return true;
    }

    @Override // o0O0o0OO.InterfaceC26008OooO0o0
    public void OooO0O0(MotionEvent motionEvent) {
    }
}
