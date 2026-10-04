package o0O0oOo;

import android.graphics.PointF;
import com.aspose.slides.C22206OooOOo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0O0oOo.AbstractC26133OooOO0o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0O0oOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26128OooO0o0 extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89186OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C26128OooO0o0(List<? extends PointF> list) {
        super(list);
        this.f89186OooO0OO = list;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89186OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 23;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return false;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        float fSqrt = 14.0f * f * ((float) Math.sqrt(oooO00o.getWidth() / f));
        List<PointF> list = this.f89186OooO0OO;
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
        float f3 = fOooO0O0 / f2;
        float f4 = fOooO0O02 / f2;
        PointF pointF2 = new PointF(pointF.x - f3, pointF.y - f4);
        Float fValueOf = Float.valueOf(pointF2.x);
        Float fValueOf2 = Float.valueOf(pointF2.y);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fOooO0O03 = (float) AbstractC26133OooOO0o.OooO0O0(pointF, new PointF(fFloatValue, fFloatValue2), list.get(0));
        float f5 = f4 + fFloatValue2;
        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(fFloatValue, f5), fOooO0O03, pointF);
        PointF pointFOooO0o2 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(fOooO0O0 + fFloatValue, f5), fOooO0O03, pointF);
        float f6 = fFloatValue + f3;
        PointF pointFOooO0o3 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f6, fFloatValue2 + fOooO0O02), fOooO0O03, pointF);
        PointF pointFOooO0O0 = OooOO0.OooO0O0.OooO0O0(f6, fFloatValue2, fOooO0O03, pointF);
        PointF pointF3 = new PointF(pointFOooO0o2.x - pointFOooO0o.x, pointFOooO0o2.y - pointFOooO0o.y);
        float f7 = pointF3.x;
        float f8 = pointF3.y;
        float fSqrt2 = (float) Math.sqrt((f8 * f8) + (f7 * f7));
        PointF pointF4 = new PointF(pointF3.x / fSqrt2, pointF3.y / fSqrt2);
        PointF pointF5 = new PointF(pointFOooO0o2.x - (((pointF4.x * fSqrt) / f2) * 1.732f), pointFOooO0o2.y - (((pointF4.y * fSqrt) / f2) * 1.732f));
        PointF pointF6 = new PointF(pointFOooO0O0.x - pointFOooO0o3.x, pointFOooO0O0.y - pointFOooO0o3.y);
        float f9 = pointF6.x;
        float f10 = pointF6.y;
        float fSqrt3 = (float) Math.sqrt((f10 * f10) + (f9 * f9));
        PointF pointF7 = new PointF(pointF6.x / fSqrt3, pointF6.y / fSqrt3);
        PointF pointF8 = new PointF(pointFOooO0O0.x - (((pointF7.x * fSqrt) / f2) * 1.732f), pointFOooO0O0.y - (((pointF7.y * fSqrt) / f2) * 1.732f));
        oooO00o.OooOo(0);
        oooO00o.moveTo(pointFOooO0o.x, pointFOooO0o.y);
        oooO00o.lineTo(pointF5.x, pointF5.y);
        oooO00o.moveTo(pointFOooO0o3.x, pointFOooO0o3.y);
        oooO00o.lineTo(pointF8.x, pointF8.y);
        oooO00o.OooOOOO(f);
        PointF pointF9 = new PointF(pointFOooO0o2.x - (pointF4.x * fSqrt), pointFOooO0o2.y - (pointF4.y * fSqrt));
        PointF pointFOooO0o4 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF9, 20.0f, pointFOooO0o2);
        PointF pointFOooO0o5 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF9, -20.0f, pointFOooO0o2);
        oooO00o.OooOo(1);
        oooO00o.moveTo(pointFOooO0o2.x, pointFOooO0o2.y);
        oooO00o.lineTo(pointFOooO0o4.x, pointFOooO0o4.y);
        oooO00o.lineTo(pointFOooO0o5.x, pointFOooO0o5.y);
        oooO00o.lineTo(pointFOooO0o2.x, pointFOooO0o2.y);
        PointF pointF10 = new PointF(pointFOooO0O0.x - (pointF7.x * fSqrt), pointFOooO0O0.y - (pointF7.y * fSqrt));
        PointF pointFOooO0o6 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF10, 20.0f, pointFOooO0O0);
        PointF pointFOooO0o7 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF10, -20.0f, pointFOooO0O0);
        oooO00o.moveTo(pointFOooO0O0.x, pointFOooO0O0.y);
        oooO00o.lineTo(pointFOooO0o6.x, pointFOooO0o6.y);
        oooO00o.lineTo(pointFOooO0o7.x, pointFOooO0o7.y);
        oooO00o.lineTo(pointFOooO0O0.x, pointFOooO0O0.y);
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        Object obj;
        List<PointF> list = this.f89186OooO0OO;
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
