package o0O0oOo;

import OooooOo.C21385OooOOOO;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o0O0oOo.AbstractC26133OooOO0o;
import oO00ooO.C32443OooOOO;
import oO0O00oo.C32520OooO0oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.Oooo000;

/* JADX INFO: renamed from: o0O0oOo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26144OooOoO extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89207OooO0OO;

    public C26144OooOoO(List list) {
        super(list);
        this.f89207OooO0OO = list;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO00o() {
        return this.f89207OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final RectF OooO0OO(float f) {
        List<PointF> list = this.f89207OooO0OO;
        PointF pointF = new PointF(list.get(1).x - list.get(0).x, list.get(1).y - list.get(0).y);
        float f2 = pointF.x;
        float f3 = pointF.y;
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
        float f4 = f * 8.0f;
        PointF pointF2 = new PointF((pointF.x * f4) + list.get(0).x, (pointF.y * f4) + list.get(0).y);
        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF2, 90.0f, list.get(0));
        PointF pointFOooO0o2 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF2, -90.0f, list.get(0));
        PointF pointF3 = new PointF(list.get(1).x - (pointF.x * f4), list.get(1).y - (pointF.y * f4));
        List listOooOO0o = C34429OooOOo0.OooOO0o(pointFOooO0o, pointFOooO0o2, AbstractC26133OooOO0o.OooO00o.OooO0o(pointF3, 90.0f, list.get(1)), AbstractC26133OooOO0o.OooO00o.OooO0o(pointF3, -90.0f, list.get(1)));
        Iterator it = listOooOO0o.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin = ((PointF) it.next()).x;
        while (it.hasNext()) {
            fMin = Math.min(fMin, ((PointF) it.next()).x);
        }
        Iterator it2 = listOooOO0o.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin2 = ((PointF) it2.next()).y;
        while (it2.hasNext()) {
            fMin2 = Math.min(fMin2, ((PointF) it2.next()).y);
        }
        Iterator it3 = listOooOO0o.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((PointF) it3.next()).x;
        while (it3.hasNext()) {
            fMax = Math.max(fMax, ((PointF) it3.next()).x);
        }
        Iterator it4 = listOooOO0o.iterator();
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
        return this.f89207OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 20;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return false;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oo(PointF pointF) {
        List<PointF> list = this.f89207OooO0OO;
        PointF pointF2 = (PointF) oOo000Oo.OooOo.Oooo0oO(list);
        PointF pointF3 = (PointF) oOo000Oo.OooOo.OoooOOo(list);
        PointF pointF4 = new PointF((pointF2.x + pointF3.x) / 2.0f, (pointF2.y + pointF3.y) / 2.0f);
        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF2, 90.0f, pointF3);
        PointF pointF5 = new PointF(pointF3.x - pointFOooO0o.x, pointF3.y - pointFOooO0o.y);
        float f = pointF5.x;
        float f2 = pointF5.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        pointF5.x /= fSqrt;
        pointF5.y /= fSqrt;
        PointF pointF6 = new PointF(-pointF5.x, -pointF5.y);
        float f3 = 10;
        PointF pointF7 = new PointF((pointF5.x * f3) + pointF3.x, (pointF5.y * f3) + pointF3.y);
        PointF pointF8 = new PointF((pointF6.x * f3) + pointF3.x, (pointF6.y * f3) + pointF3.y);
        return AbstractC26133OooOO0o.OooO00o.OooO0oO(pointF, C34429OooOOo0.OooOO0o(pointF7, pointF8, AbstractC26133OooOO0o.OooO00o.OooO0o(pointF7, 180.0f, pointF4), AbstractC26133OooOO0o.OooO00o.OooO0o(pointF8, 180.0f, pointF4)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        List list;
        PointF pointF;
        List<PointF> list2 = this.f89207OooO0OO;
        PointF pointF2 = new PointF(list2.get(1).x - list2.get(0).x, list2.get(1).y - list2.get(0).y);
        float f2 = pointF2.x;
        float f3 = pointF2.y;
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        pointF2.x /= fSqrt;
        pointF2.y /= fSqrt;
        PointF p0 = list2.get(0);
        PointF p1 = list2.get(1);
        kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
        kotlin.jvm.internal.OooOOO0.OooO0oO(p1, "p1");
        float f4 = p0.x - p1.x;
        float fSqrt2 = (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(p0.y, p1.y, f4 * f4));
        float fSqrt3 = 8.0f * f * ((float) Math.sqrt(oooO00o.getWidth() / f));
        oO0O00oo.OooO oooO = new oO0O00oo.OooO(0, (int) (fSqrt2 / fSqrt3), 1);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(oooO, 10));
        Iterator<Integer> it = oooO.iterator();
        while (((C32520OooO0oo) it).f116817OooOoO0) {
            float fNextInt = ((Oooo000) it).nextInt();
            arrayList.add(new PointF((pointF2.x * fSqrt3 * fNextInt) + list2.get(0).x, (pointF2.y * fSqrt3 * fNextInt) + list2.get(0).y));
        }
        List listO000000 = oOo000Oo.OooOo.o000000(arrayList);
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(listO000000, 10));
        int i = 0;
        for (Object obj : listO000000) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
            PointF pointF3 = (PointF) c32443OooOOO.f116638OooOo0o;
            PointF pointF4 = (PointF) c32443OooOOO.f116637OooOo;
            PointF pointF5 = new PointF((pointF3.x + pointF4.x) / 2.0f, (pointF3.y + pointF4.y) / 2.0f);
            if (i % 2 == 0) {
                float f5 = pointF3.x;
                float f6 = pointF3.y;
                float f7 = pointF5.x;
                float f8 = pointF5.y;
                double radians = Math.toRadians(90.0f);
                double d = f5 - f7;
                double d2 = f6 - f8;
                pointF = new PointF((float) (((Math.cos(radians) * d) - (Math.sin(radians) * d2)) + ((double) f7)), (float) (C21385OooOOOO.OooO0O0(radians, d2, Math.sin(radians) * d) + ((double) f8)));
                list = listO000000;
            } else {
                float f9 = pointF3.x;
                float f10 = pointF3.y;
                float f11 = pointF5.x;
                float f12 = pointF5.y;
                double radians2 = Math.toRadians(-90.0f);
                double d3 = f9 - f11;
                double d4 = f10 - f12;
                list = listO000000;
                pointF = new PointF((float) (((double) f11) + ((Math.cos(radians2) * d3) - (Math.sin(radians2) * d4))), (float) (C21385OooOOOO.OooO0O0(radians2, d4, Math.sin(radians2) * d3) + ((double) f12)));
            }
            arrayList2.add(pointF);
            i = i2;
            listO000000 = list;
        }
        int i3 = 0;
        for (Object obj2 : listO000000) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            C32443OooOOO c32443OooOOO2 = (C32443OooOOO) obj2;
            PointF pointF6 = (PointF) c32443OooOOO2.f116638OooOo0o;
            PointF pointF7 = (PointF) c32443OooOOO2.f116637OooOo;
            oooO00o.moveTo(pointF6.x, pointF6.y);
            oooO00o.OooO0O0(((PointF) arrayList2.get(i3)).x, ((PointF) arrayList2.get(i3)).y, pointF7.x, pointF7.y);
            i3 = i4;
        }
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        List<PointF> list = this.f89207OooO0OO;
        renderEngine.moveTo(list.get(0).x, list.get(0).y);
        renderEngine.lineTo(list.get(1).x, list.get(1).y);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        int i2 = (i + 1) % 2;
        List<PointF> list = this.f89207OooO0OO;
        float f = list.get(i2).x;
        float f2 = list.get(i2).y;
        float f3 = pointF.x;
        float f4 = pointF.y;
        float fAbs = Math.abs(f3 - f);
        float fAbs2 = Math.abs(f4 - f2);
        float fSqrt = (float) Math.sqrt((fAbs2 * fAbs2) + (fAbs * fAbs));
        float f5 = f + 10.0f;
        PointF pointFOooO0Oo = AbstractC26133OooOO0o.OooO00o.OooO0Oo(new PointF(f, f2), new PointF(f5, f2 + 10.0f), new PointF(f3, f4));
        if (AbstractC26133OooOO0o.OooO00o.OooO0O0(new PointF(f3, f4), new PointF(pointFOooO0Oo.x, pointFOooO0Oo.y)) / fSqrt >= 0.05f) {
            pointFOooO0Oo = AbstractC26133OooOO0o.OooO00o.OooO0Oo(new PointF(f, f2), new PointF(f5, f2 - 10.0f), new PointF(f3, f4));
            if (AbstractC26133OooOO0o.OooO00o.OooO0O0(new PointF(f3, f4), new PointF(pointFOooO0Oo.x, pointFOooO0Oo.y)) / fSqrt >= 0.05f) {
                pointFOooO0Oo = fAbs2 / fSqrt < 0.05f ? new PointF(f3, f2) : fAbs / fSqrt < 0.05f ? new PointF(f, f4) : new PointF(f3, f4);
            }
        }
        list.get(i).set(pointFOooO0Oo);
    }
}
