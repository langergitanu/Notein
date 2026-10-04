package oO0oO0Oo;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class o000oOoO implements OooOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Oooo000 f122441OooOo0o;

    public o000oOoO(Oooo000 oooo000) {
        this.f122441OooOo0o = oooo000;
    }

    public static C34054OoooOO0 OooO00o(Oooo000 oooo000) throws IOException {
        return new C34054OoooOO0(oOO00.OooO00o.OooO00o(new C34062OooooO0(oooo000)), null);
    }

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() throws IOException {
        return OooO00o(this.f122441OooOo0o);
    }

    @Override // oO0oO0Oo.OooOo
    public final InputStream OooO0Oo() {
        return new C34062OooooO0(this.f122441OooOo0o);
    }

    @Override // oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        try {
            return OooO00o(this.f122441OooOo0o);
        } catch (IOException e) {
            throw new C34034OooOoO(C21111o0ooOoO.OooO00o(e, new StringBuilder("IOException converting stream to byte array: ")), e);
        }
    }
}
