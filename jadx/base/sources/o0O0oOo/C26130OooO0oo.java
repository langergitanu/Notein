package o0O0oOo;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o0O0oOo.AbstractC26133OooOO0o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0O0oOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26130OooO0oo extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89188OooO0OO;

    public C26130OooO0oo(List list) {
        super(list);
        this.f89188OooO0OO = list;
        PointF pointF = new PointF();
        PointF pointF2 = new PointF();
        Iterator it = list.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            PointF pointF3 = (PointF) it.next();
            PointF pointF4 = (PointF) oOo000Oo.OooOo.Oooo0oO(this.f89188OooO0OO);
            PointF pointF5 = (PointF) oOo000Oo.OooOo.OoooOOo(this.f89188OooO0OO);
            PointF pointF6 = new PointF();
            pointF6.set(pointF4.x - pointF5.x, pointF4.y - pointF5.y);
            PointF pointF7 = new PointF();
            pointF7.set(pointF3.x - pointF4.x, pointF3.y - pointF4.y);
            float f2 = pointF6.x;
            float f3 = pointF6.y;
            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
            PointF pointF8 = new PointF(pointF6.x / fSqrt, pointF6.y / fSqrt);
            float f4 = (pointF8.y * pointF7.y) + (pointF8.x * pointF7.x);
            PointF pointF9 = new PointF((pointF8.x * f4) + pointF4.x, (f4 * pointF8.y) + pointF4.y);
            float f5 = pointF3.x;
            float f6 = pointF3.y;
            float f7 = f5 - pointF9.x;
            float fSqrt2 = (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(f6, pointF9.y, f7 * f7));
            if (fSqrt2 > f) {
                pointF.set(pointF3);
                pointF2.set(pointF9);
                f = fSqrt2;
            }
        }
        int i = 0;
        for (Object obj : this.f89188OooO0OO) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            PointF pointF10 = (PointF) obj;
            if (i != 0 && i != C34429OooOOo0.OooOO0O(this.f89188OooO0OO)) {
                pointF10.set(pointF);
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO00o() {
        List<PointF> list = this.f89188OooO0OO;
        return C34429OooOOo0.OooOO0o(list.get(0), list.get(1), oOo000Oo.OooOo.OoooOOo(list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final RectF OooO0OO(float f) {
        List<PointF> list = this.f89188OooO0OO;
        float f2 = 2;
        PointF pointF = new PointF((list.get(0).x + ((PointF) oOo000Oo.OooOo.OoooOOo(list)).x) / f2, (list.get(0).y + ((PointF) oOo000Oo.OooOo.OoooOOo(list)).y) / f2);
        PointF pointF2 = new PointF(pointF.x - list.get(1).x, pointF.y - list.get(1).y);
        List listOooOO0o = C34429OooOOo0.OooOO0o(oOo000Oo.OooOo.Oooo0oO(list), new PointF(list.get(1).x - pointF2.x, list.get(1).y - pointF2.y), oOo000Oo.OooOo.OoooOOo(list));
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
        return this.f89188OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 0;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oo(PointF pointF) {
        List<PointF> list = this.f89188OooO0OO;
        float f = 2;
        PointF pointF2 = new PointF((list.get(0).x + ((PointF) oOo000Oo.OooOo.OoooOOo(list)).x) / f, (list.get(0).y + ((PointF) oOo000Oo.OooOo.OoooOOo(list)).y) / f);
        PointF pointF3 = new PointF(pointF2.x - list.get(1).x, pointF2.y - list.get(1).y);
        return AbstractC26133OooOO0o.OooO00o.OooO0oO(pointF, C34429OooOOo0.OooOO0o(oOo000Oo.OooOo.Oooo0oO(list), list.get(1), oOo000Oo.OooOo.OoooOOo(list), new PointF(list.get(1).x - pointF3.x, list.get(1).y - pointF3.y)));
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        Log.d("Curve", "render");
        List<PointF> list = this.f89188OooO0OO;
        float f2 = 2;
        PointF pointF = new PointF((list.get(0).x + ((PointF) oOo000Oo.OooOo.OoooOOo(list)).x) / f2, (list.get(0).y + ((PointF) oOo000Oo.OooOo.OoooOOo(list)).y) / f2);
        PointF pointF2 = new PointF(pointF.x - list.get(1).x, pointF.y - list.get(1).y);
        PointF pointF3 = new PointF(list.get(1).x - pointF2.x, list.get(1).y - pointF2.y);
        oooO00o.moveTo(list.get(0).x, list.get(0).y);
        oooO00o.OooO0O0(pointF3.x, pointF3.y, ((PointF) oOo000Oo.OooOo.OoooOOo(list)).x, ((PointF) oOo000Oo.OooOo.OoooOOo(list)).y);
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        List<PointF> list = this.f89188OooO0OO;
        float f = 2;
        PointF pointF = new PointF((list.get(0).x + ((PointF) oOo000Oo.OooOo.OoooOOo(list)).x) / f, (list.get(0).y + ((PointF) oOo000Oo.OooOo.OoooOOo(list)).y) / f);
        PointF pointF2 = new PointF(pointF.x - list.get(1).x, pointF.y - list.get(1).y);
        PointF pointF3 = new PointF(list.get(1).x - pointF2.x, list.get(1).y - pointF2.y);
        renderEngine.moveTo(list.get(0).x, list.get(0).y);
        renderEngine.OooO0O0(pointF3.x, pointF3.y, ((PointF) oOo000Oo.OooOo.OoooOOo(list)).x, ((PointF) oOo000Oo.OooOo.OoooOOo(list)).y);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        Log.d("CurveUpdateAnchorPoints", "index: " + i + ", p: " + pointF);
        List<PointF> list = this.f89188OooO0OO;
        if (i == 0) {
            ((PointF) oOo000Oo.OooOo.Oooo0oO(list)).set(pointF);
            return;
        }
        if (i == 2) {
            ((PointF) oOo000Oo.OooOo.OoooOOo(list)).set(pointF);
            return;
        }
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            PointF pointF2 = (PointF) obj;
            if (i2 != 0 && i2 != C34429OooOOo0.OooOO0O(list)) {
                pointF2.set(pointF);
            }
            i2 = i3;
        }
    }
}
