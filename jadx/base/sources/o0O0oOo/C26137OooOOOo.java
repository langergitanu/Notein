package o0O0oOo;

import android.graphics.PointF;
import com.aspose.slides.C22206OooOOo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0O0oOo.AbstractC26133OooOO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0O0oOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26137OooOOOo extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89196OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C26137OooOOOo(List<? extends PointF> list) {
        super(list);
        this.f89196OooO0OO = list;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO00o() {
        List<PointF> list = this.f89196OooO0OO;
        List<PointF> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((PointF) it.next()).x));
        }
        float fOooo000 = (float) oOo000Oo.OooOo.Oooo000(arrayList);
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((PointF) it2.next()).y));
        }
        PointF pointF = new PointF(fOooo000, (float) oOo000Oo.OooOo.Oooo000(arrayList2));
        float fOooO0O0 = AbstractC26133OooOO0o.OooO00o.OooO0O0(list.get(0), list.get(1));
        float f = 2;
        float f2 = fOooO0O0 / f;
        float fOooO0O02 = AbstractC26133OooOO0o.OooO00o.OooO0O0(list.get(1), list.get(2)) / f;
        PointF pointF2 = new PointF(pointF.x - f2, pointF.y - fOooO0O02);
        Float fValueOf = Float.valueOf(pointF2.x);
        Float fValueOf2 = Float.valueOf(pointF2.y);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fOooO0O03 = (float) AbstractC26133OooOO0o.OooO0O0(pointF, new PointF(fFloatValue, fFloatValue2), list.get(0));
        float f3 = fFloatValue + f2;
        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f3, fFloatValue2), fOooO0O03, pointF);
        PointF pointFOooO0o2 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o, 72.0f, pointF);
        PointF pointFOooO0o3 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o, 144.0f, pointF);
        PointF pointFOooO0o4 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o, 216.0f, pointF);
        PointF pointFOooO0o5 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o, 288.0f, pointF);
        PointF pointFOooO0o6 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f3, fFloatValue2 + fOooO0O02 + (fOooO0O0 / 4.0f)), fOooO0O03, pointF);
        return C34429OooOOo0.OooOO0o(pointFOooO0o, pointFOooO0o2, pointFOooO0o3, pointFOooO0o4, pointFOooO0o5, pointFOooO0o6, AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o6, 72.0f, pointF), AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o6, 144.0f, pointF), AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o6, 216.0f, pointF), AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o6, 288.0f, pointF));
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89196OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 18;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        List<PointF> list = this.f89196OooO0OO;
        List<PointF> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((PointF) it.next()).x));
        }
        float fOooo000 = (float) oOo000Oo.OooOo.Oooo000(arrayList);
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((PointF) it2.next()).y));
        }
        PointF pointF = new PointF(fOooo000, (float) oOo000Oo.OooOo.Oooo000(arrayList2));
        float fOooO0O0 = AbstractC26133OooOO0o.OooO00o.OooO0O0(list.get(0), list.get(1));
        float f2 = 2;
        float f3 = fOooO0O0 / f2;
        float fOooO0O02 = AbstractC26133OooOO0o.OooO00o.OooO0O0(list.get(1), list.get(2)) / f2;
        PointF pointF2 = new PointF(pointF.x - f3, pointF.y - fOooO0O02);
        Float fValueOf = Float.valueOf(pointF2.x);
        Float fValueOf2 = Float.valueOf(pointF2.y);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fOooO0O03 = (float) AbstractC26133OooOO0o.OooO0O0(pointF, new PointF(fFloatValue, fFloatValue2), list.get(0));
        float f4 = fFloatValue + f3;
        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f4, fFloatValue2), fOooO0O03, pointF);
        PointF pointFOooO0o2 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o, 72.0f, pointF);
        PointF pointFOooO0o3 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o, 144.0f, pointF);
        PointF pointFOooO0o4 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o, 216.0f, pointF);
        PointF pointFOooO0o5 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o, 288.0f, pointF);
        PointF pointFOooO0o6 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f4, fFloatValue2 + fOooO0O02 + (fOooO0O0 / 4.0f)), fOooO0O03, pointF);
        PointF pointFOooO0o7 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o6, 72.0f, pointF);
        PointF pointFOooO0o8 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o6, 144.0f, pointF);
        PointF pointFOooO0o9 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o6, 216.0f, pointF);
        PointF pointFOooO0o10 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointFOooO0o6, 288.0f, pointF);
        oooO00o.moveTo(pointFOooO0o.x, pointFOooO0o.y);
        oooO00o.lineTo(pointFOooO0o9.x, pointFOooO0o9.y);
        oooO00o.lineTo(pointFOooO0o2.x, pointFOooO0o2.y);
        oooO00o.lineTo(pointFOooO0o10.x, pointFOooO0o10.y);
        oooO00o.lineTo(pointFOooO0o3.x, pointFOooO0o3.y);
        oooO00o.lineTo(pointFOooO0o6.x, pointFOooO0o6.y);
        oooO00o.lineTo(pointFOooO0o4.x, pointFOooO0o4.y);
        oooO00o.lineTo(pointFOooO0o7.x, pointFOooO0o7.y);
        oooO00o.lineTo(pointFOooO0o5.x, pointFOooO0o5.y);
        oooO00o.lineTo(pointFOooO0o8.x, pointFOooO0o8.y);
        oooO00o.lineTo(pointFOooO0o.x, pointFOooO0o.y);
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        Object obj;
        List<PointF> list = this.f89196OooO0OO;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                PointF p0 = (PointF) next;
                kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
                float f = p0.x - pointF.x;
                float fSqrt = (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(p0.y, pointF.y, f * f));
                do {
                    Object next2 = it.next();
                    PointF p02 = (PointF) next2;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(p02, "p0");
                    float f2 = p02.x - pointF.x;
                    float fSqrt2 = (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(p02.y, pointF.y, f2 * f2));
                    if (Float.compare(fSqrt, fSqrt2) > 0) {
                        next = next2;
                        fSqrt = fSqrt2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        PointF pointF2 = (PointF) obj;
        if (pointF2 != null) {
            i = list.indexOf(pointF2);
        }
        PointF pointF3 = (PointF) C22206OooOOo0.OooO0O0(i, 2, 4, list);
        PointF pointF4 = (PointF) C22206OooOOo0.OooO0O0(i, 3, 4, list);
        PointF pointF5 = (PointF) C22206OooOOo0.OooO0O0(i, 1, 4, list);
        PointF pointF6 = list.get(i);
        PointF pointF7 = new PointF(pointF4.x - pointF3.x, pointF4.y - pointF3.y);
        float f3 = pointF7.x;
        float f4 = pointF7.y;
        float fSqrt3 = (float) Math.sqrt((f4 * f4) + (f3 * f3));
        PointF pointF8 = new PointF(pointF7.x / fSqrt3, pointF7.y / fSqrt3);
        PointF pointF9 = new PointF(pointF3.x + pointF8.x, pointF3.y + pointF8.y);
        PointF pointF10 = new PointF(pointF5.x - pointF3.x, pointF5.y - pointF3.y);
        float f5 = pointF10.x;
        float f6 = pointF10.y;
        float fSqrt4 = (float) Math.sqrt((f6 * f6) + (f5 * f5));
        PointF pointF11 = new PointF(pointF10.x / fSqrt4, pointF10.y / fSqrt4);
        PointF pointF12 = new PointF(pointF3.x + pointF11.x, pointF3.y + pointF11.y);
        float f7 = 2;
        PointF pointFOooO0Oo = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF3, new PointF((pointF9.x + pointF12.x) / f7, (pointF9.y + pointF12.y) / f7), pointF);
        if (AbstractC26133OooOO0o.OooO00o.OooO0O0(pointFOooO0Oo, pointF) / AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF3, pointF) < 0.05f) {
            pointF.set(pointFOooO0Oo.x, pointFOooO0Oo.y);
        }
        PointF pointFOooO0Oo2 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF3, pointF4, pointF);
        PointF pointFOooO0Oo3 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF3, pointF5, pointF);
        pointF4.set(pointFOooO0Oo2);
        pointF6.set(pointF);
        pointF5.set(pointFOooO0Oo3);
    }
}
