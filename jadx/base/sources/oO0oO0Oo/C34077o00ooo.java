package oO0oO0Oo;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: oO0oO0Oo.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34077o00ooo implements OooOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34072o00000oO f122445OooOo0o;

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() throws IOException {
        return new C34075o00o0O(this.f122445OooOo0o.OooO0OO());
    }

    @Override // oO0oO0Oo.OooOo
    public final InputStream OooO0Oo() {
        return this.f122445OooOo0o;
    }

    @Override // oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        try {
            return OooO0O0();
        } catch (IOException e) {
            throw new C34034OooOoO(C21111o0ooOoO.OooO00o(e, new StringBuilder("IOException converting stream to byte array: ")), e);
        }
    }
}
