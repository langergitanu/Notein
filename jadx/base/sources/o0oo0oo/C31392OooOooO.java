package o0oo0oo;

import android.graphics.Path;
import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31392OooOooO extends C31401Oooo0oO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f112095OooOoo;

    @Override // o0oo0oo.C31401Oooo0oO, o0oo0o0O.InterfaceC31322OooO0O0
    public final Path OooOOO0(String str) throws IOException {
        return o0000ooO().f111972OooO0o.OooO0o0(o0000O(str)).OooO00o();
    }

    @Override // o0oo0oo.C31401Oooo0oO
    public final C31378OooOOOo OooOooo() throws IOException {
        if (this.f112095OooOoo) {
            throw new UnsupportedOperationException("OTF fonts do not have a glyf table");
        }
        return super.OooOooo();
    }

    @Override // o0oo0oo.C31401Oooo0oO
    public final void o0000o0(float f) {
        this.f112095OooOoo = Float.floatToIntBits(f) == 1184802985;
    }

    public final C31360OooO0O0 o0000ooO() throws IOException {
        if (this.f112095OooOoo) {
            return (C31360OooO0O0) o0Oo0oo("CFF ");
        }
        throw new UnsupportedOperationException("TTF fonts do not have a CFF table");
    }
}
