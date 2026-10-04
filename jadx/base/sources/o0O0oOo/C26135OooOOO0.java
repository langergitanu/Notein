package o0O0oOo;

import android.graphics.PointF;
import android.util.Log;
import com.aspose.slides.C22206OooOOo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0O0oOo.AbstractC26133OooOO0o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0O0oOo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26135OooOOO0 extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89194OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C26135OooOOO0(List<? extends PointF> list) {
        super(list);
        this.f89194OooO0OO = list;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89194OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 10;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        List<PointF> list = this.f89194OooO0OO;
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
        float fOooO0O02 = AbstractC26133OooOO0o.OooO00o.OooO0O0(list.get(1), list.get(2));
        float f2 = 2;
        PointF pointF2 = new PointF(pointF.x - (fOooO0O0 / f2), pointF.y - (fOooO0O02 / f2));
        Float fValueOf = Float.valueOf(pointF2.x);
        Float fValueOf2 = Float.valueOf(pointF2.y);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fOooO0O03 = (float) AbstractC26133OooOO0o.OooO0O0(pointF, new PointF(fFloatValue, fFloatValue2), list.get(0));
        Log.d("Cube", "rotation: " + fOooO0O03);
        float f3 = (0.5f * fOooO0O0) + fFloatValue;
        float f4 = (0.17f * fOooO0O02) + fFloatValue2;
        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f3, f4), fOooO0O03, pointF);
        float f5 = 0.15f * fOooO0O0;
        float f6 = ((-0.35f) * fOooO0O02) + fFloatValue2;
        PointF pointFOooO0o2 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f5 + fFloatValue, f6), fOooO0O03, pointF);
        float f7 = (0.45f * fOooO0O02) + fFloatValue2;
        PointF pointFOooO0o3 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(((-0.4f) * fOooO0O0) + fFloatValue, f7), fOooO0O03, pointF);
        float f8 = fOooO0O02 + fFloatValue2;
        PointF pointFOooO0o4 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f3, f8), fOooO0O03, pointF);
        PointF pointFOooO0O0 = OooOO0.OooO0O0.OooO0O0(f3, f8, fOooO0O03, pointF);
        PointF pointFOooO0o5 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(OooOO0.OooO0O0.OooO00o(fOooO0O0, 0.4f, fOooO0O0, fFloatValue), f7), fOooO0O03, pointF);
        PointF pointFOooO0o6 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF((fOooO0O0 - f5) + fFloatValue, f6), fOooO0O03, pointF);
        PointF pointFOooO0O02 = OooOO0.OooO0O0.OooO0O0(f3, f4, fOooO0O03, pointF);
        oooO00o.moveTo(pointFOooO0o.x, pointFOooO0o.y);
        oooO00o.OooO00o(pointFOooO0o2.x, pointFOooO0o2.y, pointFOooO0o3.x, pointFOooO0o3.y, pointFOooO0o4.x, pointFOooO0o4.y);
        oooO00o.moveTo(pointFOooO0O0.x, pointFOooO0O0.y);
        oooO00o.OooO00o(pointFOooO0o5.x, pointFOooO0o5.y, pointFOooO0o6.x, pointFOooO0o6.y, pointFOooO0O02.x, pointFOooO0O02.y);
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        List<PointF> list = this.f89194OooO0OO;
        float f = list.get(0).x;
        float f2 = list.get(0).y;
        float f3 = list.get(2).x - f;
        float f4 = list.get(2).y - f2;
        float f5 = (0.5f * f3) + f;
        float f6 = (0.17f * f4) + f2;
        renderEngine.moveTo(f5, f6);
        float f7 = f3 * 0.15f;
        float f8 = ((-0.35f) * f4) + f2;
        float f9 = (0.45f * f4) + f2;
        float f10 = f4 + f2;
        renderEngine.OooO00o(f7 + f, f8, ((-0.4f) * f3) + f, f9, f5, f10);
        renderEngine.moveTo(f5, f10);
        renderEngine.OooO00o((0.4f * f3) + f3 + f, f9, (f3 - f7) + f, f8, f5, f6);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        Object obj;
        List<PointF> list = this.f89194OooO0OO;
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
