package o0O0oOo;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0O0oOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26125OooO0OO extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89183OooO0OO;

    public C26125OooO0OO(List list) {
        super(list);
        this.f89183OooO0OO = list;
        RectF rectFOooOOO0 = OooOOO0();
        PointF pointF = new PointF(rectFOooOOO0.centerX(), rectFOooOOO0.centerY());
        float f = 2;
        float fMin = Math.min(rectFOooOOO0.width() / f, rectFOooOOO0.height() / f);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            int i3 = i % 4;
            if (i3 == 0) {
                this.f89183OooO0OO.get(i).set(pointF.x - fMin, pointF.y);
            } else if (i3 == 1) {
                this.f89183OooO0OO.get(i).set(pointF.x, pointF.y - fMin);
            } else if (i3 == 2) {
                this.f89183OooO0OO.get(i).set(pointF.x + fMin, pointF.y);
            } else if (i3 == 3) {
                this.f89183OooO0OO.get(i).set(pointF.x, pointF.y + fMin);
            }
            i = i2;
        }
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO00o() {
        List<PointF> list = this.f89183OooO0OO;
        return C34429OooOOo0.OooOO0o(list.get(0), list.get(1), list.get(2), list.get(3));
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89183OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 6;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oo(PointF pointF) {
        RectF rectFOooOOO0 = OooOOO0();
        PointF pointF2 = new PointF(rectFOooOOO0.centerX(), rectFOooOOO0.centerY());
        float f = 2;
        float fMin = Math.min(rectFOooOOO0.width() / f, rectFOooOOO0.height() / f);
        float f2 = pointF.x - pointF2.x;
        return ((float) Math.sqrt((double) OooOO0.OooO0OO.OooO00o(pointF.y, pointF2.y, f2 * f2))) < fMin;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        RectF rectFOooOOO0 = OooOOO0();
        PointF pointF = new PointF(rectFOooOOO0.centerX(), rectFOooOOO0.centerY());
        float f2 = 2;
        oooO00o.OooOOOo(pointF.x, pointF.y, Math.min(rectFOooOOO0.width() / f2, rectFOooOOO0.height() / f2));
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        RectF rectFOooOOO0 = OooOOO0();
        PointF pointF = new PointF(rectFOooOOO0.centerX(), rectFOooOOO0.centerY());
        float f = 2;
        renderEngine.OooOOOo(pointF.x, pointF.y, Math.min(rectFOooOOO0.width() / f, rectFOooOOO0.height() / f));
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        List<PointF> list = this.f89183OooO0OO;
        List<PointF> list2 = list;
        Iterator<T> it = list2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin = ((PointF) it.next()).x;
        while (it.hasNext()) {
            fMin = Math.min(fMin, ((PointF) it.next()).x);
        }
        Iterator<T> it2 = list2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin2 = ((PointF) it2.next()).y;
        while (it2.hasNext()) {
            fMin2 = Math.min(fMin2, ((PointF) it2.next()).y);
        }
        Iterator<T> it3 = list2.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((PointF) it3.next()).x;
        while (it3.hasNext()) {
            fMax = Math.max(fMax, ((PointF) it3.next()).x);
        }
        Iterator<T> it4 = list2.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax2 = ((PointF) it4.next()).y;
        while (it4.hasNext()) {
            fMax2 = Math.max(fMax2, ((PointF) it4.next()).y);
        }
        RectF rectF = new RectF(fMin, fMin2, fMax, fMax2);
        PointF pointF2 = new PointF(rectF.centerX(), rectF.centerY());
        float f = pointF.x - pointF2.x;
        float fSqrt = (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(pointF.y, pointF2.y, f * f));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            int i4 = i2 % 4;
            if (i4 == 0) {
                list.get(i2).set(pointF2.x - fSqrt, pointF2.y);
            } else if (i4 == 1) {
                list.get(i2).set(pointF2.x, pointF2.y - fSqrt);
            } else if (i4 == 2) {
                list.get(i2).set(pointF2.x + fSqrt, pointF2.y);
            } else if (i4 == 3) {
                list.get(i2).set(pointF2.x, pointF2.y + fSqrt);
            }
            i2 = i3;
        }
    }

    public final RectF OooOOO0() {
        List<PointF> list = this.f89183OooO0OO;
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
}
