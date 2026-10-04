package o0O0oOo;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: o0O0oOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26139OooOOo0 extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89200OooO0OO;

    public C26139OooOOo0(List list) {
        super(list);
        this.f89200OooO0OO = list;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89200OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 5;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oo(PointF pointF) {
        List<PointF> list = this.f89200OooO0OO;
        int size = list.size();
        if (size >= 3) {
            int i = size - 1;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                PointF pointF2 = list.get(i2);
                PointF pointF3 = list.get(i);
                float f = pointF2.y;
                float f2 = pointF.y;
                boolean z = f > f2;
                float f3 = pointF3.y;
                if (z != (f3 > f2)) {
                    float f4 = pointF.x;
                    float f5 = pointF3.x;
                    float f6 = pointF2.x;
                    if (f4 < (((f2 - f) * (f5 - f6)) / (f3 - f)) + f6) {
                        i3 = f > f3 ? i3 + 1 : i3 - 1;
                    }
                }
                i = i2;
                i2++;
            }
            if (i3 != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        List<PointF> list = this.f89200OooO0OO;
        oooO00o.moveTo(list.get(0).x, list.get(0).y);
        oooO00o.lineTo(list.get(1).x, list.get(1).y);
        oooO00o.lineTo(list.get(2).x, list.get(2).y);
        oooO00o.lineTo(list.get(3).x, list.get(3).y);
        oooO00o.lineTo(list.get(4).x, list.get(4).y);
        oooO00o.lineTo(list.get(0).x, list.get(0).y);
        oooO00o.OooO0OO();
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        List<PointF> list = this.f89200OooO0OO;
        renderEngine.moveTo(list.get(0).x, list.get(0).y);
        renderEngine.lineTo(list.get(1).x, list.get(1).y);
        renderEngine.lineTo(list.get(2).x, list.get(2).y);
        renderEngine.lineTo(list.get(3).x, list.get(3).y);
        renderEngine.lineTo(list.get(4).x, list.get(4).y);
        renderEngine.lineTo(list.get(0).x, list.get(0).y);
    }
}
