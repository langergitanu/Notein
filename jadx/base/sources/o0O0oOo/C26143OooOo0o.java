package o0O0oOo;

import android.graphics.PointF;
import com.aspose.slides.C22206OooOOo0;
import java.util.List;
import o0O0oOo.AbstractC26133OooOO0o;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0O0oOo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26143OooOo0o extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89206OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C26143OooOo0o(List list) {
        super(list);
        this.f89206OooO0OO = list;
        for (C32443OooOOO c32443OooOOO : oOo000Oo.OooOo.o000000(oOo000Oo.OooOo.OooooOo(list, oOo000Oo.OooOo.Oooo0oO(list)))) {
            PointF pointF = (PointF) c32443OooOOO.f116638OooOo0o;
            PointF pointF2 = (PointF) c32443OooOOO.f116637OooOo;
            Math.abs(pointF.x - pointF2.x);
            float fAbs = Math.abs(pointF.y - pointF2.y);
            float f = pointF.x - pointF2.x;
            if (fAbs / ((float) Math.sqrt(OooOO0.OooO0OO.OooO00o(pointF.y, pointF2.y, f * f))) < 0.05f) {
                pointF2.y = pointF.y;
            }
        }
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89206OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 1;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        List<PointF> list = this.f89206OooO0OO;
        oooO00o.moveTo(list.get(0).x, list.get(0).y);
        oooO00o.lineTo(list.get(1).x, list.get(1).y);
        oooO00o.lineTo(list.get(2).x, list.get(2).y);
        oooO00o.lineTo(list.get(0).x, list.get(0).y);
        oooO00o.OooO0OO();
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        List<PointF> list = this.f89206OooO0OO;
        renderEngine.moveTo(list.get(0).x, list.get(0).y);
        renderEngine.lineTo(list.get(1).x, list.get(1).y);
        renderEngine.lineTo(list.get(2).x, list.get(2).y);
        renderEngine.lineTo(list.get(0).x, list.get(0).y);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        List<PointF> list = this.f89206OooO0OO;
        PointF pointF2 = list.get((i + 1) % 3);
        PointF pointF3 = (PointF) C22206OooOOo0.OooO0O0(i, 2, 3, list);
        PointF pointFOooO0Oo = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF2, AbstractC26133OooOO0o.OooO00o.OooO0o(pointF3, 90.0f, pointF2), pointF);
        if (AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointFOooO0Oo) / AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointF2) < 0.05f) {
            pointF.set(pointFOooO0Oo.x, pointFOooO0Oo.y);
            list.get(i).set(pointF.x, pointF.y);
            float fOooO0O0 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointF2);
            float fOooO0O02 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF2, pointF3);
            if (Math.abs(fOooO0O0 - fOooO0O02) < 20.0f) {
                PointF pointF4 = new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
                float f = pointF4.x;
                float f2 = pointF4.y;
                float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                PointF pointF5 = new PointF(pointF4.x / fSqrt, pointF4.y / fSqrt);
                pointF.set((pointF5.x * fOooO0O02) + pointF2.x, (fOooO0O02 * pointF5.y) + pointF2.y);
                list.get(i).set(pointF.x, pointF.y);
            }
        }
        PointF pointFOooO0Oo2 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF3, AbstractC26133OooOO0o.OooO00o.OooO0o(pointF2, 90.0f, pointF3), pointF);
        if (AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointFOooO0Oo2) / AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointF3) < 0.05f) {
            pointF.set(pointFOooO0Oo2.x, pointFOooO0Oo2.y);
            list.get(i).set(pointF.x, pointF.y);
            float fOooO0O03 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointF3);
            float fOooO0O04 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF2, pointF3);
            if (Math.abs(fOooO0O03 - fOooO0O04) < 20.0f) {
                PointF pointF6 = new PointF(pointF.x - pointF3.x, pointF.y - pointF3.y);
                float f3 = pointF6.x;
                float f4 = pointF6.y;
                float fSqrt2 = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                PointF pointF7 = new PointF(pointF6.x / fSqrt2, pointF6.y / fSqrt2);
                pointF.set((pointF7.x * fOooO0O04) + pointF3.x, (fOooO0O04 * pointF7.y) + pointF3.y);
                list.get(i).set(pointF.x, pointF.y);
            }
        }
        float f5 = 2;
        PointF pointF8 = new PointF((pointF2.x + pointF3.x) / f5, (pointF2.y + pointF3.y) / f5);
        float fOooO0O05 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF2, pointF3);
        float fOooO0O06 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointF8);
        float f6 = fOooO0O05 / f5;
        if (Math.abs(fOooO0O06 - f6) < 20.0f) {
            PointF pointF9 = new PointF(pointF.x - pointF8.x, pointF.y - pointF8.y);
            float f7 = pointF9.x;
            float f8 = pointF9.y;
            float fSqrt3 = (float) Math.sqrt((f8 * f8) + (f7 * f7));
            PointF pointF10 = new PointF(pointF9.x / fSqrt3, pointF9.y / fSqrt3);
            pointF.set((pointF10.x * f6) + pointF8.x, (pointF10.y * f6) + pointF8.y);
            list.get(i).set(pointF.x, pointF.y);
        }
        PointF pointFOooO0Oo3 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF8, AbstractC26133OooOO0o.OooO00o.OooO0o(pointF2, 90.0f, pointF8), pointF);
        if (AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointFOooO0Oo3) / fOooO0O06 < 0.05f) {
            pointF.set(pointFOooO0Oo3.x, pointFOooO0Oo3.y);
            list.get(i).set(pointF.x, pointF.y);
            float f9 = f6 * 1.732f;
            if (Math.abs(AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointF8) - f9) < 20.0f) {
                PointF pointF11 = new PointF(pointF.x - pointF8.x, pointF.y - pointF8.y);
                float f10 = pointF11.x;
                float f11 = pointF11.y;
                float fSqrt4 = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                PointF pointF12 = new PointF(pointF11.x / fSqrt4, pointF11.y / fSqrt4);
                pointF.set((pointF12.x * f9) + pointF8.x, (f9 * pointF12.y) + pointF8.y);
                list.get(i).set(pointF.x, pointF.y);
            }
        }
        list.get(i).set(pointF.x, pointF.y);
    }
}
