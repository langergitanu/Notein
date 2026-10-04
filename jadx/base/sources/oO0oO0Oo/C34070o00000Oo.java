package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34070o00000Oo implements InterfaceC34019OooO0oO, InterfaceC34073o00000oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Oooo000 f122430OooOo0o;

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() throws IOException {
        C34020OooO0oo c34020OooO0ooOooO0OO = this.f122430OooOo0o.OooO0OO();
        o00000O0 o00000o02 = C34069o000000o.f122425OooO00o;
        if (c34020OooO0ooOooO0OO.f122326OooO0O0 < 1) {
            return C34069o000000o.f122426OooO0O0;
        }
        o00000OO o00000oo2 = new o00000OO(c34020OooO0ooOooO0OO);
        o00000oo2.f122429OooOoO = -1;
        return o00000oo2;
    }

    @Override // oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        try {
            return OooO0O0();
        } catch (IOException e) {
            throw new C34034OooOoO(e.getMessage(), e);
        }
    }
}
