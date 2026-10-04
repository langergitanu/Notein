package o00000o0;

import OooooOO.AbstractC21341OoooOO0;
import OooooOO.C21348Ooooo0o;

/* JADX INFO: renamed from: o00000o0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24115OooO0OO implements OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f81259OooO00o;

    public C24115OooO0OO(long j) {
        this.f81259OooO00o = j;
        if (j == C21348Ooooo0o.f61766OooO0oO) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // o00000o0.OooOO0O
    public final long OooO00o() {
        return this.f81259OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24115OooO0OO) && C21348Ooooo0o.OooO0OO(this.f81259OooO00o, ((C24115OooO0OO) obj).f81259OooO00o);
    }

    @Override // o00000o0.OooOO0O
    public final float getAlpha() {
        return C21348Ooooo0o.OooO0Oo(this.f81259OooO00o);
    }

    @Override // o00000o0.OooOO0O
    public final AbstractC21341OoooOO0 getBrush() {
        return null;
    }

    public final int hashCode() {
        int i = C21348Ooooo0o.f61767OooO0oo;
        return Long.hashCode(this.f81259OooO00o);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C21348Ooooo0o.OooO(this.f81259OooO00o)) + ')';
    }
}
