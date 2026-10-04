package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34058OoooOoO implements InterfaceC34019OooO0oO, InterfaceC34073o00000oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Oooo000 f122406OooOo0o;

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() throws IOException {
        return new C34057OoooOo0(this.f122406OooOo0o.OooO0OO());
    }

    @Override // oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        try {
            return new C34057OoooOo0(this.f122406OooOo0o.OooO0OO());
        } catch (IOException e) {
            throw new C34034OooOoO(e.getMessage(), e);
        }
    }
}
