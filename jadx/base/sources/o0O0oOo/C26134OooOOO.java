package o0O0oOo;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: o0O0oOo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26134OooOOO extends AbstractC26133OooOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PointF> f89193OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C26134OooOOO(List<? extends PointF> list) {
        super(list);
        this.f89193OooO0OO = list;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final List<PointF> OooO0Oo() {
        return this.f89193OooO0OO;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final int OooO0o() {
        return 9;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final void OooOO0(float f, o0O0oo00.OooO00o oooO00o) {
        List<PointF> list = this.f89193OooO0OO;
        oooO00o.moveTo(list.get(0).x, list.get(0).y);
        oooO00o.lineTo(list.get(1).x, list.get(1).y);
        oooO00o.lineTo(list.get(2).x, list.get(2).y);
        oooO00o.lineTo(list.get(3).x, list.get(3).y);
        oooO00o.lineTo(list.get(4).x, list.get(4).y);
        oooO00o.lineTo(list.get(5).x, list.get(5).y);
        oooO00o.lineTo(list.get(0).x, list.get(0).y);
        oooO00o.OooOOOO(f);
    }

    @Override // o0O0oOo.AbstractC26133OooOO0o
    public final <T> void OooOO0O(o0O0oo00.OooO00o<T> renderEngine) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        List<PointF> list = this.f89193OooO0OO;
        renderEngine.moveTo(list.get(0).x, list.get(0).y);
        renderEngine.lineTo(list.get(1).x, list.get(1).y);
        renderEngine.lineTo(list.get(2).x, list.get(2).y);
        renderEngine.lineTo(list.get(3).x, list.get(3).y);
        renderEngine.lineTo(list.get(4).x, list.get(4).y);
        renderEngine.lineTo(list.get(5).x, list.get(5).y);
        renderEngine.lineTo(list.get(0).x, list.get(0).y);
    }
}
