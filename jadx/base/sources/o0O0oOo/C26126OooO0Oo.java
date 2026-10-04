package o0O0oOo;

import Oooo0.C20855OooooOO;
import android.graphics.PointF;
import com.aspose.slides.C22206OooOOo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0O0oOo.AbstractC26133OooOO0o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0O0oOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26126OooO0Oo extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89184OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C26126OooO0Oo(List<? extends PointF> list) {
        super(list);
        this.f89184OooO0OO = list;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89184OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 15;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        List<PointF> list = this.f89184OooO0OO;
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
        PointF pointF2 = new PointF(pointF.x - f3, pointF.y - (fOooO0O02 / f2));
        Float fValueOf = Float.valueOf(pointF2.x);
        Float fValueOf2 = Float.valueOf(pointF2.y);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fOooO0O03 = (float) AbstractC26133OooOO0o.OooO0O0(pointF, new PointF(fFloatValue, fFloatValue2), list.get(0));
        float fSqrt = f * 6.0f * ((float) Math.sqrt(oooO00o.getWidth() / f));
        float f4 = fOooO0O0 / 6.0f;
        float f5 = fFloatValue2 + fOooO0O02;
        float f6 = f5 - f4;
        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(fFloatValue, f6), fOooO0O03, pointF);
        float f7 = f3 + fFloatValue;
        PointF pointFOooO0o2 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f7, fFloatValue2), fOooO0O03, pointF);
        float f8 = fFloatValue + fOooO0O0;
        PointF pointFOooO0o3 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f8, f6), fOooO0O03, pointF);
        float f9 = f5 - (f2 * f4);
        PointF pointFOooO0o4 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f7, f9), fOooO0O03, pointF);
        PointF pointFOooO0O0 = OooOO0.OooO0O0.OooO0O0(f7, f5, fOooO0O03, pointF);
        new PointF();
        new PointF();
        oooO00o.OooOOo();
        oooO00o.moveTo(pointFOooO0o.x, pointFOooO0o.y);
        oooO00o.lineTo(pointFOooO0o2.x, pointFOooO0o2.y);
        oooO00o.lineTo(pointFOooO0o3.x, pointFOooO0o3.y);
        float f10 = f4 / 2.0f;
        float f11 = f5 - f10;
        PointF pointFOooO0o5 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f8, f11), fOooO0O03, pointF);
        float fOooO00o = C20855OooooOO.OooO00o(fOooO0O0, 3, 4.0f, fFloatValue);
        PointF pointFOooO0o6 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(fOooO00o, f5), fOooO0O03, pointF);
        oooO00o.OooO00o(pointFOooO0o5.x, pointFOooO0o5.y, pointFOooO0o6.x, pointFOooO0o6.y, pointFOooO0O0.x, pointFOooO0O0.y);
        float f12 = (fOooO0O0 / 4.0f) + fFloatValue;
        PointF pointFOooO0o7 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f12, f5), fOooO0O03, pointF);
        PointF pointFOooO0O02 = OooOO0.OooO0O0.OooO0O0(fFloatValue, f11, fOooO0O03, pointF);
        oooO00o.OooO00o(pointFOooO0o7.x, pointFOooO0o7.y, pointFOooO0O02.x, pointFOooO0O02.y, pointFOooO0o.x, pointFOooO0o.y);
        oooO00o.OooOOOO(f);
        if (oooO00o.getStyle() == 1) {
            return;
        }
        oooO00o.OooO0oo(new float[]{fSqrt, fSqrt});
        oooO00o.moveTo(pointFOooO0o.x, pointFOooO0o.y);
        float f13 = f6 - f10;
        PointF pointFOooO0o8 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(fFloatValue, f13), fOooO0O03, pointF);
        PointF pointFOooO0O03 = OooOO0.OooO0O0.OooO0O0(f12, f9, fOooO0O03, pointF);
        oooO00o.OooO00o(pointFOooO0o8.x, pointFOooO0o8.y, pointFOooO0O03.x, pointFOooO0O03.y, pointFOooO0o4.x, pointFOooO0o4.y);
        PointF pointFOooO0O04 = OooOO0.OooO0O0.OooO0O0(fOooO00o, f9, fOooO0O03, pointF);
        PointF pointFOooO0O05 = OooOO0.OooO0O0.OooO0O0(f8, f13, fOooO0O03, pointF);
        oooO00o.OooO00o(pointFOooO0O04.x, pointFOooO0O04.y, pointFOooO0O05.x, pointFOooO0O05.y, pointFOooO0o3.x, pointFOooO0o3.y);
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        Object obj;
        List<PointF> list = this.f89184OooO0OO;
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
