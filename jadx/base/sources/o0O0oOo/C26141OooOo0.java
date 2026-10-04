package o0O0oOo;

import android.graphics.PointF;
import com.aspose.slides.C22206OooOOo0;
import java.util.List;
import o0O0oOo.AbstractC26133OooOO0o;

/* JADX INFO: renamed from: o0O0oOo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26141OooOo0 extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89203OooO0OO;

    public C26141OooOo0(List list) {
        super(list);
        this.f89203OooO0OO = list;
        PointF pointF = (PointF) list.get(0);
        PointF pointF2 = (PointF) list.get(2);
        float f = (pointF2.y - pointF.y) * (pointF2.x - pointF.x);
        if (f > 0.0f) {
            float f2 = 10;
            PointF pointFOooO0Oo = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF, new PointF(pointF.x + f2, pointF.y + f2), pointF2);
            if (AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF2, pointFOooO0Oo) / AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointF2) < 0.05f) {
                pointF2.set(pointFOooO0Oo.x, pointFOooO0Oo.y);
            }
        }
        if (f < 0.0f) {
            float f3 = 10;
            PointF pointFOooO0Oo2 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF, new PointF(pointF.x + f3, pointF.y - f3), pointF2);
            if (AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF2, pointFOooO0Oo2) / AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF, pointF2) < 0.05f) {
                pointF2.set(pointFOooO0Oo2.x, pointFOooO0Oo2.y);
            }
        }
        float f4 = 2;
        PointF pointF3 = new PointF((((PointF) list.get(2)).x + ((PointF) list.get(0)).x) / f4, (((PointF) list.get(2)).y + ((PointF) list.get(0)).y) / f4);
        PointF pointFOooO0o0 = AbstractC26133OooOO0o.OooO0o0((PointF) list.get(0), 90.0f, pointF3);
        PointF pointFOooO0o02 = AbstractC26133OooOO0o.OooO0o0((PointF) list.get(0), -90.0f, pointF3);
        ((PointF) list.get(1)).set(pointFOooO0o0);
        ((PointF) list.get(3)).set(pointFOooO0o02);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89203OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 4;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        List<PointF> list = this.f89203OooO0OO;
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
        List<PointF> list = this.f89203OooO0OO;
        renderEngine.moveTo(list.get(0).x, list.get(0).y);
        renderEngine.lineTo(list.get(1).x, list.get(1).y);
        renderEngine.lineTo(list.get(2).x, list.get(2).y);
        renderEngine.lineTo(list.get(3).x, list.get(3).y);
        renderEngine.lineTo(list.get(0).x, list.get(0).y);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0o(int i, PointF pointF) {
        List<PointF> list = this.f89203OooO0OO;
        PointF pointF2 = list.get((i + 2) % 4);
        PointF pointF3 = (PointF) C22206OooOOo0.OooO0O0(i, 3, 4, list);
        PointF pointF4 = (PointF) C22206OooOOo0.OooO0O0(i, 1, 4, list);
        PointF pointF5 = list.get(i);
        PointF pointFOooO0Oo = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF2, pointF5, pointF);
        PointF pointFOooO0Oo2 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF2, pointF3, pointFOooO0Oo);
        PointF pointFOooO0Oo3 = AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF2, pointF4, pointFOooO0Oo);
        pointF3.set(pointFOooO0Oo2);
        pointF5.set(pointFOooO0Oo);
        pointF4.set(pointFOooO0Oo3);
    }
}
