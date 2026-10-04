package o0O0oOo;

import OooooOo.C21385OooOOOO;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C24035Oooo00o;

/* JADX INFO: renamed from: o0O0oOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f89191OooO0O0 = C24035Oooo00o.f80943OooO00o.OooO0O0(AbstractC26133OooOO0o.class).OooOO0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<PointF> f89192OooO00o;

    /* JADX INFO: renamed from: o0O0oOo.OooOO0o$OooO00o */
    public static final class OooO00o {
        public static boolean OooO00o(List points) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(points, "points");
            List<PointF> list = points;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (PointF pointF : list) {
                    if (Float.isNaN(pointF.x) || Float.isNaN(pointF.y)) {
                        z = true;
                        break;
                    }
                }
            }
            return !z;
        }

        public static float OooO0O0(PointF p0, PointF p1) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
            kotlin.jvm.internal.OooOOO0.OooO0oO(p1, "p1");
            float f = p0.x - p1.x;
            return (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(p0.y, p1.y, f * f));
        }

        public static PointF OooO0OO(PointF pointF, PointF pointF2) {
            return new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
        }

        public static PointF OooO0Oo(PointF a, PointF b, PointF o2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
            kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
            kotlin.jvm.internal.OooOOO0.OooO0oO(o2, "o");
            PointF pointF = new PointF();
            pointF.set(a.x - b.x, a.y - b.y);
            PointF pointF2 = new PointF();
            pointF2.set(o2.x - a.x, o2.y - a.y);
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            if (fSqrt == 0.0f) {
                return new PointF(a.x, a.y);
            }
            PointF pointF3 = new PointF(pointF.x / fSqrt, pointF.y / fSqrt);
            float f3 = (pointF3.y * pointF2.y) + (pointF3.x * pointF2.x);
            return new PointF((pointF3.x * f3) + a.x, (f3 * pointF3.y) + a.y);
        }

        public static PointF OooO0o(PointF pointF, float f, PointF o2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(pointF, "<this>");
            kotlin.jvm.internal.OooOOO0.OooO0oO(o2, "o");
            float f2 = pointF.x;
            float f3 = pointF.y;
            float f4 = o2.x;
            float f5 = o2.y;
            double radians = Math.toRadians(f);
            double d = f2 - f4;
            double d2 = f3 - f5;
            return new PointF((float) (((Math.cos(radians) * d) - (Math.sin(radians) * d2)) + ((double) f4)), (float) (C21385OooOOOO.OooO0O0(radians, d2, Math.sin(radians) * d) + ((double) f5)));
        }

        public static float OooO0o0(List list) {
            PointF pointF = (PointF) list.get(0);
            PointF pointF2 = (PointF) list.get(1);
            PointF pointF3 = (PointF) list.get(2);
            float fOooO0O0 = OooO0O0(pointF, pointF2);
            float fOooO0O02 = OooO0O0(pointF2, pointF3);
            return Math.min(fOooO0O0, fOooO0O02) / Math.max(fOooO0O0, fOooO0O02);
        }

        public static boolean OooO0oO(PointF pointF, List polygon) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(pointF, "<this>");
            kotlin.jvm.internal.OooOOO0.OooO0oO(polygon, "polygon");
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
    }

    public AbstractC26133OooOO0o(List points) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(points, "points");
        this.f89192OooO00o = points;
    }

    public static double OooO0O0(PointF pointF, PointF pointF2, PointF e) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(e, "e");
        float f = pointF2.x;
        float f2 = pointF.x;
        float f3 = pointF2.y;
        float f4 = pointF.y;
        double dAtan2 = ((double) ((float) Math.atan2(f - f2, f3 - f4))) - ((double) ((float) Math.atan2(e.x - f2, e.y - f4)));
        if (dAtan2 > 3.141592653589793d) {
            dAtan2 -= 6.283185307179586d;
        }
        if (dAtan2 < -3.141592653589793d) {
            dAtan2 += 6.283185307179586d;
        }
        return (dAtan2 * ((double) 180)) / 3.141592653589793d;
    }

    public static PointF OooO0o0(PointF a, float f, PointF pointF) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
        float f2 = a.x;
        float f3 = a.y;
        float f4 = pointF.x;
        float f5 = pointF.y;
        double radians = Math.toRadians(f);
        double d = f2 - f4;
        double d2 = f3 - f5;
        return new PointF((float) (((Math.cos(radians) * d) - (Math.sin(radians) * d2)) + ((double) f4)), (float) (C21385OooOOOO.OooO0O0(radians, d2, Math.sin(radians) * d) + ((double) f5)));
    }

    public boolean OooO(PointF pointF, float f) {
        return OooO0oo(pointF);
    }

    public List<PointF> OooO00o() {
        return OooO0Oo();
    }

    public RectF OooO0OO(float f) {
        List<PointF> listOooO00o = OooO00o();
        Iterator<T> it = listOooO00o.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin = ((PointF) it.next()).x;
        while (it.hasNext()) {
            fMin = Math.min(fMin, ((PointF) it.next()).x);
        }
        Iterator<T> it2 = listOooO00o.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin2 = ((PointF) it2.next()).y;
        while (it2.hasNext()) {
            fMin2 = Math.min(fMin2, ((PointF) it2.next()).y);
        }
        Iterator<T> it3 = listOooO00o.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((PointF) it3.next()).x;
        while (it3.hasNext()) {
            fMax = Math.max(fMax, ((PointF) it3.next()).x);
        }
        Iterator<T> it4 = listOooO00o.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax2 = ((PointF) it4.next()).y;
        while (it4.hasNext()) {
            fMax2 = Math.max(fMax2, ((PointF) it4.next()).y);
        }
        return new RectF(fMin, fMin2, fMax, fMax2);
    }

    public List<PointF> OooO0Oo() {
        return this.f89192OooO00o;
    }

    public abstract int OooO0o();

    public abstract boolean OooO0oO();

    public boolean OooO0oo(PointF pointF) {
        return OooO00o.OooO0oO(pointF, OooO0Oo());
    }

    public abstract void OooOO0(float f, o0O0oo00.OooO00o oooO00o);

    public <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
    }

    public void OooOO0o(int i, PointF pointF) {
        OooO0Oo().get(i).set(pointF);
    }
}
