package o0O0oOo;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o0O0oOo.AbstractC26133OooOO0o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0O0oOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26123OooO00o extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89181OooO0OO;

    public C26123OooO00o(List list) {
        super(list);
        this.f89181OooO0OO = list;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO00o() {
        return this.f89181OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final RectF OooO0OO(float f) {
        List<PointF> list = this.f89181OooO0OO;
        PointF pointF = new PointF(list.get(1).x - list.get(0).x, list.get(1).y - list.get(0).y);
        float f2 = pointF.x;
        float f3 = pointF.y;
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
        float f4 = f * 16.0f;
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
        return this.f89181OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 22;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return false;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oo(PointF pointF) {
        List<PointF> list = this.f89181OooO0OO;
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

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        float fSqrt = 16.0f * f * ((float) Math.sqrt(oooO00o.getWidth() / f));
        List<PointF> list = this.f89181OooO0OO;
        PointF pointF = new PointF(list.get(1).x - list.get(0).x, list.get(1).y - list.get(0).y);
        float f2 = pointF.x;
        float f3 = pointF.y;
        float fSqrt2 = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        PointF pointF2 = new PointF(pointF.x / fSqrt2, pointF.y / fSqrt2);
        PointF pointF3 = new PointF(list.get(1).x - (pointF2.x * fSqrt), list.get(1).y - (pointF2.y * fSqrt));
        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF3, 20.0f, list.get(1));
        PointF pointFOooO0o2 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF3, -20.0f, list.get(1));
        PointF pointF4 = new PointF(list.get(0).x - list.get(1).x, list.get(0).y - list.get(1).y);
        float f4 = pointF4.x;
        float f5 = pointF4.y;
        float fSqrt3 = (float) Math.sqrt((f5 * f5) + (f4 * f4));
        PointF pointF5 = new PointF(pointF4.x / fSqrt3, pointF4.y / fSqrt3);
        PointF pointF6 = new PointF(list.get(0).x - (pointF5.x * fSqrt), list.get(0).y - (pointF5.y * fSqrt));
        PointF pointFOooO0o3 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF6, 20.0f, list.get(0));
        PointF pointFOooO0o4 = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF6, -20.0f, list.get(0));
        float f6 = 2;
        PointF pointF7 = new PointF(list.get(1).x - (((pointF2.x * fSqrt) / f6) * 1.732f), list.get(1).y - (((pointF2.y * fSqrt) / f6) * 1.732f));
        PointF pointF8 = new PointF(list.get(0).x - (((pointF5.x * fSqrt) / f6) * 1.732f), list.get(0).y - (((pointF5.y * fSqrt) / f6) * 1.732f));
        oooO00o.OooOo(0);
        oooO00o.moveTo(pointF8.x, pointF8.y);
        oooO00o.lineTo(pointF7.x, pointF7.y);
        oooO00o.OooOOOO(f);
        oooO00o.OooOo(1);
        oooO00o.moveTo(list.get(1).x, list.get(1).y);
        oooO00o.lineTo(pointFOooO0o.x, pointFOooO0o.y);
        oooO00o.lineTo(pointFOooO0o2.x, pointFOooO0o2.y);
        oooO00o.lineTo(list.get(1).x, list.get(1).y);
        oooO00o.moveTo(list.get(0).x, list.get(0).y);
        oooO00o.lineTo(pointFOooO0o3.x, pointFOooO0o3.y);
        oooO00o.lineTo(pointFOooO0o4.x, pointFOooO0o4.y);
        oooO00o.lineTo(list.get(0).x, list.get(0).y);
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        List<PointF> list = this.f89181OooO0OO;
        renderEngine.moveTo(list.get(0).x, list.get(0).y);
        renderEngine.lineTo(list.get(1).x, list.get(1).y);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        int i2 = (i + 1) % 2;
        List<PointF> list = this.f89181OooO0OO;
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
