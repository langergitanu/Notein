package o00O0oOo;

import android.graphics.PointF;
import java.util.List;
import o00OO00o.C24988OooO00o;

/* JADX INFO: renamed from: o00O0oOo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24947OooO implements InterfaceC24957OooOO0O<PointF, PointF> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C24949OooO0O0 f84646OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C24949OooO0O0 f84647OooOo0o;

    public C24947OooO(C24949OooO0O0 c24949OooO0O0, C24949OooO0O0 c24949OooO0O02) {
        this.f84647OooOo0o = c24949OooO0O0;
        this.f84646OooOo = c24949OooO0O02;
    }

    @Override // o00O0oOo.InterfaceC24957OooOO0O
    public final boolean OooO0o0() {
        return this.f84647OooOo0o.OooO0o0() && this.f84646OooOo.OooO0o0();
    }

    @Override // o00O0oOo.InterfaceC24957OooOO0O
    public final List<C24988OooO00o<PointF>> OooO0oo() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
