package o0O0oOo;

import android.graphics.PointF;
import java.util.List;
import o0O0oOo.AbstractC26133OooOO0o;
import o0OoOO00.C29031OoooOO0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0O0oOo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26136OooOOOO extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89195OooO0OO;

    public C26136OooOOOO(List list) {
        super(list);
        this.f89195OooO0OO = list;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO(PointF pointF, float f) {
        List<PointF> list = this.f89195OooO0OO;
        PointF pointF2 = (PointF) oOo000Oo.OooOo.Oooo0oO(list);
        PointF pointF3 = (PointF) oOo000Oo.OooOo.OoooOOo(list);
        PointF pointF4 = new PointF((pointF2.x + pointF3.x) / 2.0f, (pointF2.y + pointF3.y) / 2.0f);
        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF2, 90.0f, pointF3);
        PointF pointF5 = new PointF(pointF3.x - pointFOooO0o.x, pointF3.y - pointFOooO0o.y);
        float f2 = pointF5.x;
        float f3 = pointF5.y;
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        pointF5.x /= fSqrt;
        pointF5.y /= fSqrt;
        PointF pointF6 = new PointF(-pointF5.x, -pointF5.y);
        float f4 = f / 2;
        PointF pointF7 = new PointF((pointF5.x * f4) + pointF3.x, (pointF5.y * f4) + pointF3.y);
        PointF pointF8 = new PointF((pointF6.x * f4) + pointF3.x, (pointF6.y * f4) + pointF3.y);
        return AbstractC26133OooOO0o.OooO00o.OooO0oO(pointF, C34429OooOOo0.OooOO0o(pointF7, pointF8, AbstractC26133OooOO0o.OooO00o.OooO0o(pointF7, 180.0f, pointF4), AbstractC26133OooOO0o.OooO00o.OooO0o(pointF8, 180.0f, pointF4)));
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO00o() {
        return this.f89195OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89195OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 7;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return false;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oo(PointF pointF) {
        List<PointF> list = this.f89195OooO0OO;
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
        List<PointF> list = this.f89195OooO0OO;
        oooO00o.moveTo(list.get(0).x, list.get(0).y);
        oooO00o.lineTo(list.get(1).x, list.get(1).y);
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        List<PointF> list = this.f89195OooO0OO;
        renderEngine.moveTo(list.get(0).x, list.get(0).y);
        renderEngine.lineTo(list.get(1).x, list.get(1).y);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        int i2 = (i + 1) % 2;
        List<PointF> list = this.f89195OooO0OO;
        float f = list.get(i2).x;
        float f2 = list.get(i2).y;
        float f3 = pointF.x;
        float f4 = pointF.y;
        float fAbs = Math.abs(f3 - f);
        float fAbs2 = Math.abs(f4 - f2);
        float fSqrt = (float) Math.sqrt((fAbs2 * fAbs2) + (fAbs * fAbs));
        float f5 = f + 10.0f;
        PointF pointFOooO0Oo = AbstractC26133OooOO0o.OooO00o.OooO0Oo(new PointF(f, f2), new PointF(f5, f2 + 10.0f), new PointF(f3, f4));
        float fOooO0O0 = AbstractC26133OooOO0o.OooO00o.OooO0O0(new PointF(f3, f4), new PointF(pointFOooO0Oo.x, pointFOooO0Oo.y));
        if (!C29031OoooOO0.f102846OooO0OO || fOooO0O0 / fSqrt >= 0.05f) {
            pointFOooO0Oo = AbstractC26133OooOO0o.OooO00o.OooO0Oo(new PointF(f, f2), new PointF(f5, f2 - 10.0f), new PointF(f3, f4));
            float fOooO0O02 = AbstractC26133OooOO0o.OooO00o.OooO0O0(new PointF(f3, f4), new PointF(pointFOooO0Oo.x, pointFOooO0Oo.y));
            boolean z = C29031OoooOO0.f102846OooO0OO;
            if (!z || fOooO0O02 / fSqrt >= 0.05f) {
                pointFOooO0Oo = (!z || fAbs2 / fSqrt >= 0.05f) ? (!z || fAbs / fSqrt >= 0.05f) ? new PointF(f3, f4) : new PointF(f, f4) : new PointF(f3, f2);
            }
        }
        list.get(i).set(pointFOooO0Oo);
    }

    public C26136OooOOOO(List list, int i) {
        super(list);
        this.f89195OooO0OO = list;
    }
}
