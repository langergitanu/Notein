package o0O0oOo;

import OooooOo.C21385OooOOOO;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.aspose.slides.C22206OooOOo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o0O0oOo.AbstractC26133OooOO0o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0O0oOo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26132OooOO0O extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89190OooO0OO;

    public C26132OooOO0O(List list) {
        Iterator it;
        double d;
        super(list);
        this.f89190OooO0OO = list;
        PointF pointF = (PointF) list.get(0);
        PointF pointF2 = (PointF) list.get(1);
        double dOooO0O0 = AbstractC26133OooOO0o.OooO0O0(pointF, pointF2, new PointF(pointF2.x, pointF.y)) % ((double) 90);
        String str = "Empty collection can't be reduced.";
        if (dOooO0O0 < 15.0d && dOooO0O0 > -15.0d) {
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                PointF pointF3 = (PointF) it2.next();
                PointF pointF4 = (PointF) next;
                next = new PointF(pointF4.x + pointF3.x, pointF4.y + pointF3.y);
            }
            PointF pointF5 = (PointF) next;
            float f = 4;
            pointF5.x /= f;
            pointF5.y /= f;
            for (PointF pointF6 : this.f89190OooO0OO) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(pointF6, "<this>");
                float f2 = pointF6.x;
                float f3 = pointF6.y;
                float f4 = pointF5.x;
                float f5 = pointF5.y;
                PointF pointF7 = pointF5;
                double radians = Math.toRadians((float) dOooO0O0);
                double d2 = f2 - f4;
                double d3 = f3 - f5;
                PointF pointF8 = new PointF((float) (((Math.cos(radians) * d2) - (Math.sin(radians) * d3)) + ((double) f4)), (float) (C21385OooOOOO.OooO0O0(radians, d3, Math.sin(radians) * d2) + ((double) f5)));
                pointF6.set(pointF8.x, pointF8.y);
                pointF5 = pointF7;
                str = str;
            }
        }
        String str2 = str;
        if (dOooO0O0 > 75.0d || dOooO0O0 < -75.0d) {
            Iterator<T> it3 = this.f89190OooO0OO.iterator();
            if (!it3.hasNext()) {
                throw new UnsupportedOperationException(str2);
            }
            Object next2 = it3.next();
            while (it3.hasNext()) {
                PointF pointF9 = (PointF) it3.next();
                PointF pointF10 = (PointF) next2;
                next2 = new PointF(pointF10.x + pointF9.x, pointF10.y + pointF9.y);
            }
            PointF pointF11 = (PointF) next2;
            float f6 = 4;
            pointF11.x /= f6;
            pointF11.y /= f6;
            for (Iterator it4 = this.f89190OooO0OO.iterator(); it4.hasNext(); it4 = it) {
                PointF pointF12 = (PointF) it4.next();
                if (dOooO0O0 > 0.0d) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(pointF12, "<this>");
                    float f7 = pointF12.x;
                    float f8 = pointF12.y;
                    float f9 = pointF11.x;
                    float f10 = pointF11.y;
                    d = 0.0d;
                    double radians2 = Math.toRadians(((float) dOooO0O0) - 90);
                    double d4 = f7 - f9;
                    it = it4;
                    double d5 = f8 - f10;
                    PointF pointF13 = new PointF((float) (((Math.cos(radians2) * d4) - (Math.sin(radians2) * d5)) + ((double) f9)), (float) (C21385OooOOOO.OooO0O0(radians2, d5, Math.sin(radians2) * d4) + ((double) f10)));
                    pointF12.set(pointF13.x, pointF13.y);
                } else {
                    it = it4;
                    d = 0.0d;
                }
                if (dOooO0O0 < d) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(pointF12, "<this>");
                    float f11 = pointF12.x;
                    float f12 = pointF12.y;
                    float f13 = pointF11.x;
                    float f14 = pointF11.y;
                    double radians3 = Math.toRadians(((float) dOooO0O0) + 90);
                    double d6 = f11 - f13;
                    double d7 = f12 - f14;
                    PointF pointF14 = new PointF((float) (((Math.cos(radians3) * d6) - (Math.sin(radians3) * d7)) + ((double) f13)), (float) (C21385OooOOOO.OooO0O0(radians3, d7, Math.sin(radians3) * d6) + ((double) f14)));
                    pointF12.set(pointF14.x, pointF14.y);
                }
            }
        }
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final RectF OooO0OO(float f) {
        List<PointF> list = this.f89190OooO0OO;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin = ((PointF) it.next()).x;
        while (it.hasNext()) {
            fMin = Math.min(fMin, ((PointF) it.next()).x);
        }
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin2 = ((PointF) it2.next()).y;
        while (it2.hasNext()) {
            fMin2 = Math.min(fMin2, ((PointF) it2.next()).y);
        }
        Iterator<T> it3 = list.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((PointF) it3.next()).x;
        while (it3.hasNext()) {
            fMax = Math.max(fMax, ((PointF) it3.next()).x);
        }
        Iterator<T> it4 = list.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax2 = ((PointF) it4.next()).y;
        while (it4.hasNext()) {
            fMax2 = Math.max(fMax2, ((PointF) it4.next()).y);
        }
        return new RectF(fMin, fMin2, fMax, fMax2);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89190OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 8;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oo(PointF pointF) {
        return AbstractC26133OooOO0o.OooO00o.OooO0oO(pointF, this.f89190OooO0OO);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        List<PointF> list = this.f89190OooO0OO;
        PointF pointF = list.get(0);
        PointF pointF2 = list.get(1);
        double dOooO0O0 = AbstractC26133OooOO0o.OooO0O0(pointF, pointF2, new PointF(pointF2.x, pointF.y));
        List<PointF> list2 = list;
        Iterator<T> it = list2.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            PointF pointF3 = (PointF) it.next();
            PointF pointF4 = (PointF) next;
            next = new PointF(pointF4.x + pointF3.x, pointF4.y + pointF3.y);
        }
        PointF pointF5 = (PointF) next;
        float f2 = 4;
        pointF5.x /= f2;
        pointF5.y /= f2;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
            PointF pointF6 = (PointF) it2.next();
            kotlin.jvm.internal.OooOOO0.OooO0oO(pointF6, "<this>");
            float f3 = pointF6.x;
            float f4 = pointF6.y;
            float f5 = pointF5.x;
            float f6 = pointF5.y;
            double radians = Math.toRadians((float) dOooO0O0);
            double d = f3 - f5;
            double d2 = f4 - f6;
            arrayList.add(new PointF((float) (((Math.cos(radians) * d) - (Math.sin(radians) * d2)) + ((double) f5)), (float) (C21385OooOOOO.OooO0O0(radians, d2, Math.sin(radians) * d) + ((double) f6))));
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin = ((PointF) it3.next()).x;
        while (it3.hasNext()) {
            fMin = Math.min(fMin, ((PointF) it3.next()).x);
        }
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin2 = ((PointF) it4.next()).y;
        while (it4.hasNext()) {
            fMin2 = Math.min(fMin2, ((PointF) it4.next()).y);
        }
        Iterator it5 = arrayList.iterator();
        if (!it5.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((PointF) it5.next()).x;
        while (it5.hasNext()) {
            fMax = Math.max(fMax, ((PointF) it5.next()).x);
        }
        Iterator it6 = arrayList.iterator();
        if (!it6.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax2 = ((PointF) it6.next()).y;
        while (it6.hasNext()) {
            fMax2 = Math.max(fMax2, ((PointF) it6.next()).y);
        }
        oooO00o.OooOoO(new RectF(fMin, fMin2, fMax, fMax2), -((float) dOooO0O0));
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        List<PointF> list = this.f89190OooO0OO;
        PointF pointF = list.get(0);
        PointF pointF2 = list.get(1);
        double dOooO0O0 = AbstractC26133OooOO0o.OooO0O0(pointF, pointF2, new PointF(pointF2.x, pointF.y));
        Log.d("Ellipse", "getAngle: " + dOooO0O0);
        List<PointF> list2 = list;
        Iterator<T> it = list2.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        T next = it.next();
        while (it.hasNext()) {
            PointF pointF3 = (PointF) it.next();
            PointF pointF4 = next;
            next = (T) new PointF(pointF4.x + pointF3.x, pointF4.y + pointF3.y);
        }
        PointF pointF5 = next;
        float f = 4;
        pointF5.x /= f;
        pointF5.y /= f;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (Iterator<T> it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
            PointF pointF6 = (PointF) it2.next();
            kotlin.jvm.internal.OooOOO0.OooO0oO(pointF6, "<this>");
            float f2 = pointF6.x;
            float f3 = pointF6.y;
            float f4 = pointF5.x;
            float f5 = pointF5.y;
            double radians = Math.toRadians((float) dOooO0O0);
            double d = f2 - f4;
            double d2 = f3 - f5;
            arrayList.add(new PointF((float) (((Math.cos(radians) * d) - (Math.sin(radians) * d2)) + ((double) f4)), (float) (C21385OooOOOO.OooO0O0(radians, d2, Math.sin(radians) * d) + ((double) f5))));
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin = ((PointF) it3.next()).x;
        while (it3.hasNext()) {
            fMin = Math.min(fMin, ((PointF) it3.next()).x);
        }
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin2 = ((PointF) it4.next()).y;
        while (it4.hasNext()) {
            fMin2 = Math.min(fMin2, ((PointF) it4.next()).y);
        }
        Iterator it5 = arrayList.iterator();
        if (!it5.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((PointF) it5.next()).x;
        while (it5.hasNext()) {
            fMax = Math.max(fMax, ((PointF) it5.next()).x);
        }
        Iterator it6 = arrayList.iterator();
        if (!it6.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax2 = ((PointF) it6.next()).y;
        while (it6.hasNext()) {
            fMax2 = Math.max(fMax2, ((PointF) it6.next()).y);
        }
        renderEngine.OooOoO(new RectF(fMin, fMin2, fMax, fMax2), -((float) dOooO0O0));
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        List<PointF> list = this.f89190OooO0OO;
        PointF pointF2 = list.get((i + 2) % 4);
        PointF pointF3 = (PointF) C22206OooOOo0.OooO0O0(i, 3, 4, list);
        PointF pointF4 = (PointF) C22206OooOOo0.OooO0O0(i, 1, 4, list);
        PointF pointF5 = list.get(i);
        PointF pointF6 = new PointF(pointF3.x - pointF2.x, pointF3.y - pointF2.y);
        float f = pointF6.x;
        float f2 = pointF6.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        PointF pointF7 = new PointF(pointF6.x / fSqrt, pointF6.y / fSqrt);
        PointF pointF8 = new PointF(pointF2.x + pointF7.x, pointF2.y + pointF7.y);
        PointF pointF9 = new PointF(pointF4.x - pointF2.x, pointF4.y - pointF2.y);
        float f3 = pointF9.x;
        float f4 = pointF9.y;
        float fSqrt2 = (float) Math.sqrt((f4 * f4) + (f3 * f3));
        PointF pointF10 = new PointF(pointF9.x / fSqrt2, pointF9.y / fSqrt2);
        PointF pointF11 = new PointF(pointF2.x + pointF10.x, pointF2.y + pointF10.y);
        float f5 = 2;
        PointF pointFOooO0Oo = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF2, new PointF((pointF8.x + pointF11.x) / f5, (pointF8.y + pointF11.y) / f5), pointF);
        if (AbstractC26133OooOO0o.OooO00o.OooO0O0(pointFOooO0Oo, pointF) / AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF2, pointF) < 0.05f) {
            pointF.set(pointFOooO0Oo.x, pointFOooO0Oo.y);
        }
        PointF pointFOooO0Oo2 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF2, pointF3, pointF);
        PointF pointFOooO0Oo3 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF2, pointF4, pointF);
        pointF3.set(pointFOooO0Oo2);
        pointF5.set(pointF);
        pointF4.set(pointFOooO0Oo3);
    }
}
