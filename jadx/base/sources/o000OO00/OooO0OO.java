package o000OO00;

import androidx.ink.brush.BrushNative;
import o000OO0o.C24495OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements oO0O000o.OooO00o<C24495OooO00o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f82634OooOo0o;

    public OooO0OO(OooO0O0 oooO0O0) {
        this.f82634OooOo0o = oooO0O0;
    }

    @Override // oO0O000o.OooO00o
    public final C24495OooO00o invoke() {
        return new C24495OooO00o(BrushNative.f65348OooO00o.computeComposeColorLong(this.f82634OooOo0o.OooO0o0()));
    }
}
