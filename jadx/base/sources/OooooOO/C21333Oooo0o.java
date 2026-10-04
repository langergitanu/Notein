package OooooOO;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: OooooOO.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21333Oooo0o implements InterfaceC21358o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PathMeasure f61746OooO00o;

    public C21333Oooo0o(PathMeasure pathMeasure) {
        this.f61746OooO00o = pathMeasure;
    }

    @Override // OooooOO.InterfaceC21358o00Oo0
    public final boolean OooO00o(float f, float f2, C21334Oooo0o0 destination) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
        return this.f61746OooO00o.getSegment(f, f2, destination.f61747OooO00o, true);
    }

    @Override // OooooOO.InterfaceC21358o00Oo0
    public final void OooO0O0(C21334Oooo0o0 c21334Oooo0o0) {
        this.f61746OooO00o.setPath(c21334Oooo0o0 != null ? c21334Oooo0o0.f61747OooO00o : null, false);
    }

    @Override // OooooOO.InterfaceC21358o00Oo0
    public final float getLength() {
        return this.f61746OooO00o.getLength();
    }
}
