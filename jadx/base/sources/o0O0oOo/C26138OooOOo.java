package o0O0oOo;

import android.graphics.PointF;
import com.aspose.slides.C22206OooOOo0;
import java.util.List;
import o0O0oOo.AbstractC26133OooOO0o;

/* JADX INFO: renamed from: o0O0oOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26138OooOOo extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89197OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PointF f89198OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final PointF f89199OooO0o0;

    public C26138OooOOo(List list) {
        super(list);
        this.f89197OooO0OO = list;
        PointF pointF = (PointF) list.get(0);
        PointF pointF2 = (PointF) list.get(1);
        PointF pointF3 = (PointF) list.get(2);
        float f = 10;
        float fOooO0O0 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF2, AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF, new PointF(pointF.x + f, pointF.y), pointF2));
        float fOooO0O02 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointF2);
        if (fOooO0O0 / fOooO0O02 < 0.05f) {
            pointF2.set(pointF3.x, pointF.y);
        }
        if (AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF2, AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF, new PointF(pointF.x, pointF.y + f), pointF2)) / fOooO0O02 < 0.05f) {
            pointF2.set(pointF.x, pointF3.y);
        }
        float f2 = 2;
        PointF pointF4 = new PointF((((PointF) list.get(2)).x + ((PointF) list.get(0)).x) / f2, (((PointF) list.get(2)).y + ((PointF) list.get(0)).y) / f2);
        PointF pointF5 = new PointF(((PointF) list.get(2)).x - pointF4.x, ((PointF) list.get(2)).y - pointF4.y);
        PointF pointF6 = new PointF(((PointF) list.get(1)).x - pointF4.x, ((PointF) list.get(1)).y - pointF4.y);
        float f3 = pointF5.x;
        float f4 = pointF5.y;
        float f5 = pointF6.x;
        float f6 = pointF6.y;
        float degrees = (float) Math.toDegrees((float) Math.acos(((f4 * f6) + (f3 * f5)) / (((float) Math.sqrt((f4 * f4) + (f3 * f3))) * ((float) Math.sqrt((f6 * f6) + (f5 * f5))))));
        degrees = Float.isNaN(degrees) ? 0.0f : degrees;
        if ((f3 * f6) - (f5 * f4) < 0.0f) {
            this.f89198OooO0Oo = AbstractC26133OooOO0o.OooO0o0((PointF) list.get(0), -degrees, pointF4);
            this.f89199OooO0o0 = AbstractC26133OooOO0o.OooO0o0((PointF) list.get(0), 180 - degrees, pointF4);
        } else {
            this.f89198OooO0Oo = AbstractC26133OooOO0o.OooO0o0((PointF) list.get(0), degrees, pointF4);
            this.f89199OooO0o0 = AbstractC26133OooOO0o.OooO0o0((PointF) list.get(0), degrees - 180, pointF4);
        }
        ((PointF) list.get(1)).set(this.f89198OooO0Oo);
        ((PointF) list.get(3)).set(this.f89199OooO0o0);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89197OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 3;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        List<PointF> list = this.f89197OooO0OO;
        oooO00o.moveTo(list.get(0).x, list.get(0).y);
        oooO00o.lineTo(list.get(1).x, list.get(1).y);
        oooO00o.lineTo(list.get(2).x, list.get(2).y);
        oooO00o.lineTo(list.get(3).x, list.get(3).y);
        oooO00o.lineTo(list.get(0).x, list.get(0).y);
        oooO00o.OooO0OO();
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        List<PointF> list = this.f89197OooO0OO;
        renderEngine.moveTo(list.get(0).x, list.get(0).y);
        renderEngine.lineTo(list.get(1).x, list.get(1).y);
        renderEngine.lineTo(list.get(2).x, list.get(2).y);
        renderEngine.lineTo(list.get(3).x, list.get(3).y);
        renderEngine.lineTo(list.get(0).x, list.get(0).y);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        List<PointF> list = this.f89197OooO0OO;
        PointF pointF2 = list.get((i + 2) % 4);
        PointF pointF3 = (PointF) C22206OooOOo0.OooO0O0(i, 3, 4, list);
        PointF pointF4 = (PointF) C22206OooOOo0.OooO0O0(i, 1, 4, list);
        PointF pointF5 = list.get(i);
        PointF pointF6 = new PointF(pointF3.x - pointF2.x, pointF3.y - pointF2.y);
        float f = pointF6.x;
        float f2 = pointF6.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (fSqrt != 0.0f) {
            PointF pointF7 = new PointF(pointF6.x / fSqrt, pointF6.y / fSqrt);
            pointF6 = new PointF(pointF2.x + pointF7.x, pointF2.y + pointF7.y);
        }
        PointF pointF8 = new PointF(pointF4.x - pointF2.x, pointF4.y - pointF2.y);
        float f3 = pointF8.x;
        float f4 = pointF8.y;
        float fSqrt2 = (float) Math.sqrt((f4 * f4) + (f3 * f3));
        if (fSqrt2 != 0.0f) {
            PointF pointF9 = new PointF(pointF8.x / fSqrt2, pointF8.y / fSqrt2);
            pointF8 = new PointF(pointF2.x + pointF9.x, pointF2.y + pointF9.y);
        }
        float f5 = 2;
        PointF pointFOooO0Oo = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF2, new PointF((pointF6.x + pointF8.x) / f5, (pointF6.y + pointF8.y) / f5), pointF);
        if (AbstractC26133OooOO0o.OooO00o.OooO0O0(pointFOooO0Oo, pointF) / AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF2, pointF) < 0.05f) {
            pointF.set(pointFOooO0Oo.x, pointFOooO0Oo.y);
        }
        PointF pointFOooO0Oo2 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF2, pointF3, pointF);
        PointF pointFOooO0Oo3 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF2, pointF4, pointF);
        pointF3.set(pointFOooO0Oo2);
        pointF5.set(pointF);
        pointF4.set(pointFOooO0Oo3);
    }
}
