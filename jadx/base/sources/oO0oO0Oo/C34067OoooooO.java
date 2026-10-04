package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34067OoooooO implements InterfaceC34019OooO0oO, InterfaceC34073o00000oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Oooo000 f122418OooOo0o;

    public C34067OoooooO(Oooo000 oooo000) {
        this.f122418OooOo0o = oooo000;
    }

    public static o000000O OooO00o(Oooo000 oooo000) throws IOException {
        try {
            return new o000000O(C34069o000000o.OooO00o(oooo000.OooO0OO()));
        } catch (IllegalArgumentException e) {
            throw new C34021OooOO0(e.getMessage(), e);
        }
    }

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() throws IOException {
        return OooO00o(this.f122418OooOo0o);
    }

    @Override // oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        try {
            return OooO00o(this.f122418OooOo0o);
        } catch (IOException e) {
            throw new C34034OooOoO("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new C34034OooOoO("unable to get DER object", e2);
        }
    }
}
