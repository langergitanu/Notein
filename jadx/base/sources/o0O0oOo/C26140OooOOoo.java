package o0O0oOo;

import Oooo0.C20855OooooOO;
import android.graphics.PointF;
import com.aspose.slides.C22206OooOOo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0O0oOo.AbstractC26133OooOO0o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0O0oOo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26140OooOOoo extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89201OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C26140OooOOoo(List<? extends PointF> list) {
        super(list);
        this.f89201OooO0OO = list;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89201OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 17;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        PointF pointF;
        List<PointF> list = this.f89201OooO0OO;
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
        PointF pointF2 = new PointF(fOooo000, (float) oOo000Oo.OooOo.Oooo000(arrayList2));
        float fOooO0O0 = AbstractC26133OooOO0o.OooO00o.OooO0O0(list.get(0), list.get(1));
        float fOooO0O02 = AbstractC26133OooOO0o.OooO00o.OooO0O0(list.get(1), list.get(2));
        float f2 = 2;
        float f3 = fOooO0O0 / f2;
        PointF pointF3 = new PointF(pointF2.x - f3, pointF2.y - (fOooO0O02 / f2));
        Float fValueOf = Float.valueOf(pointF3.x);
        Float fValueOf2 = Float.valueOf(pointF3.y);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fOooO0O03 = (float) AbstractC26133OooOO0o.OooO0O0(pointF2, new PointF(fFloatValue, fFloatValue2), list.get(0));
        float fSqrt = 6.0f * f * ((float) Math.sqrt(oooO00o.getWidth() / f));
        float f4 = (0.75f * fOooO0O02) / 2.0f;
        float f5 = fOooO0O02 / 12.0f;
        float f6 = fFloatValue2 + f4;
        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(fFloatValue, f6), fOooO0O03, pointF2);
        float f7 = fFloatValue + fOooO0O0;
        PointF pointFOooO0o2 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f7, f6), fOooO0O03, pointF2);
        float f8 = fOooO0O02 + fFloatValue2;
        float f9 = f8 - f4;
        PointF pointFOooO0o3 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f7, f9), fOooO0O03, pointF2);
        PointF pointFOooO0O0 = OooOO0.OooO0O0.OooO0O0(fFloatValue, f9, fOooO0O03, pointF2);
        float f10 = f3 + fFloatValue;
        PointF pointFOooO0o4 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f10, fFloatValue2), fOooO0O03, pointF2);
        float f11 = f6 - f5;
        PointF pointFOooO0o5 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f10, f11), fOooO0O03, pointF2);
        float f12 = f6 + f5;
        PointF pointFOooO0o6 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f10, f12), fOooO0O03, pointF2);
        float f13 = f9 - f5;
        PointF pointFOooO0o7 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f10, f13), fOooO0O03, pointF2);
        float f14 = f9 + f5;
        PointF pointFOooO0o8 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f10, f14), fOooO0O03, pointF2);
        PointF pointFOooO0O02 = OooOO0.OooO0O0.OooO0O0(f10, f8, fOooO0O03, pointF2);
        new PointF();
        new PointF();
        oooO00o.OooOOo();
        oooO00o.moveTo(pointFOooO0o.x, pointFOooO0o.y);
        float f15 = f4 / 2.0f;
        float f16 = fFloatValue2 + f15;
        PointF pointFOooO0o9 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(fFloatValue, f16), fOooO0O03, pointF2);
        float f17 = (fOooO0O0 / 4.0f) + fFloatValue;
        PointF pointFOooO0o10 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f17, fFloatValue2), fOooO0O03, pointF2);
        oooO00o.OooO00o(pointFOooO0o9.x, pointFOooO0o9.y, pointFOooO0o10.x, pointFOooO0o10.y, pointFOooO0o4.x, pointFOooO0o4.y);
        float fOooO00o = C20855OooooOO.OooO00o(fOooO0O0, 3, 4.0f, fFloatValue);
        PointF pointFOooO0o11 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(fOooO00o, fFloatValue2), fOooO0O03, pointF2);
        PointF pointFOooO0O03 = OooOO0.OooO0O0.OooO0O0(f7, f16, fOooO0O03, pointF2);
        oooO00o.OooO00o(pointFOooO0o11.x, pointFOooO0o11.y, pointFOooO0O03.x, pointFOooO0O03.y, pointFOooO0o2.x, pointFOooO0o2.y);
        oooO00o.moveTo(pointFOooO0o.x, pointFOooO0o.y);
        float f18 = f5 / 2.0f;
        float f19 = f6 + f18;
        PointF pointFOooO0o12 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(fFloatValue, f19), fOooO0O03, pointF2);
        PointF pointFOooO0O04 = OooOO0.OooO0O0.OooO0O0(f17, f12, fOooO0O03, pointF2);
        oooO00o.OooO00o(pointFOooO0o12.x, pointFOooO0o12.y, pointFOooO0O04.x, pointFOooO0O04.y, pointFOooO0o6.x, pointFOooO0o6.y);
        PointF pointFOooO0O05 = OooOO0.OooO0O0.OooO0O0(fOooO00o, f12, fOooO0O03, pointF2);
        PointF pointFOooO0O06 = OooOO0.OooO0O0.OooO0O0(f7, f19, fOooO0O03, pointF2);
        oooO00o.OooO00o(pointFOooO0O05.x, pointFOooO0O05.y, pointFOooO0O06.x, pointFOooO0O06.y, pointFOooO0o2.x, pointFOooO0o2.y);
        oooO00o.moveTo(pointFOooO0o3.x, pointFOooO0o3.y);
        float f20 = f9 - f18;
        PointF pointFOooO0o13 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f7, f20), fOooO0O03, pointF2);
        PointF pointFOooO0O07 = OooOO0.OooO0O0.OooO0O0(fOooO00o, f13, fOooO0O03, pointF2);
        oooO00o.OooO00o(pointFOooO0o13.x, pointFOooO0o13.y, pointFOooO0O07.x, pointFOooO0O07.y, pointFOooO0o7.x, pointFOooO0o7.y);
        PointF pointFOooO0O08 = OooOO0.OooO0O0.OooO0O0(f17, f13, fOooO0O03, pointF2);
        PointF pointFOooO0O09 = OooOO0.OooO0O0.OooO0O0(fFloatValue, f20, fOooO0O03, pointF2);
        oooO00o.OooO00o(pointFOooO0O08.x, pointFOooO0O08.y, pointFOooO0O09.x, pointFOooO0O09.y, pointFOooO0O0.x, pointFOooO0O0.y);
        if (oooO00o.getStyle() == 1) {
            oooO00o.moveTo(pointFOooO0o3.x, pointFOooO0o3.y);
            pointF = pointFOooO0O0;
        } else {
            float f21 = f9 + f18;
            PointF pointFOooO0o14 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(fFloatValue, f21), fOooO0O03, pointF2);
            PointF pointFOooO0O010 = OooOO0.OooO0O0.OooO0O0(f17, f14, fOooO0O03, pointF2);
            pointF = pointFOooO0O0;
            oooO00o.OooO00o(pointFOooO0o14.x, pointFOooO0o14.y, pointFOooO0O010.x, pointFOooO0O010.y, pointFOooO0o8.x, pointFOooO0o8.y);
            PointF pointFOooO0O011 = OooOO0.OooO0O0.OooO0O0(fOooO00o, f14, fOooO0O03, pointF2);
            PointF pointFOooO0O012 = OooOO0.OooO0O0.OooO0O0(f7, f21, fOooO0O03, pointF2);
            oooO00o.OooO00o(pointFOooO0O011.x, pointFOooO0O011.y, pointFOooO0O012.x, pointFOooO0O012.y, pointFOooO0o3.x, pointFOooO0o3.y);
        }
        float f22 = f8 - f15;
        PointF pointFOooO0o15 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f7, f22), fOooO0O03, pointF2);
        PointF pointFOooO0O013 = OooOO0.OooO0O0.OooO0O0(fOooO00o, f8, fOooO0O03, pointF2);
        oooO00o.OooO00o(pointFOooO0o15.x, pointFOooO0o15.y, pointFOooO0O013.x, pointFOooO0O013.y, pointFOooO0O02.x, pointFOooO0O02.y);
        PointF pointFOooO0O014 = OooOO0.OooO0O0.OooO0O0(f17, f8, fOooO0O03, pointF2);
        PointF pointFOooO0O015 = OooOO0.OooO0O0.OooO0O0(fFloatValue, f22, fOooO0O03, pointF2);
        PointF pointF4 = pointF;
        oooO00o.OooO00o(pointFOooO0O014.x, pointFOooO0O014.y, pointFOooO0O015.x, pointFOooO0O015.y, pointF4.x, pointF4.y);
        oooO00o.OooOOOO(f);
        if (oooO00o.getStyle() == 1) {
            return;
        }
        oooO00o.OooO0oo(new float[]{fSqrt, fSqrt});
        oooO00o.moveTo(pointFOooO0o2.x, pointFOooO0o2.y);
        float f23 = f6 - f18;
        PointF pointFOooO0o16 = AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f7, f23), fOooO0O03, pointF2);
        PointF pointFOooO0O016 = OooOO0.OooO0O0.OooO0O0(fOooO00o, f11, fOooO0O03, pointF2);
        oooO00o.OooO00o(pointFOooO0o16.x, pointFOooO0o16.y, pointFOooO0O016.x, pointFOooO0O016.y, pointFOooO0o5.x, pointFOooO0o5.y);
        PointF pointFOooO0O017 = OooOO0.OooO0O0.OooO0O0(f17, f11, fOooO0O03, pointF2);
        PointF pointFOooO0O018 = OooOO0.OooO0O0.OooO0O0(fFloatValue, f23, fOooO0O03, pointF2);
        oooO00o.OooO00o(pointFOooO0O017.x, pointFOooO0O017.y, pointFOooO0O018.x, pointFOooO0O018.y, pointFOooO0o.x, pointFOooO0o.y);
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        Object obj;
        List<PointF> list = this.f89201OooO0OO;
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
