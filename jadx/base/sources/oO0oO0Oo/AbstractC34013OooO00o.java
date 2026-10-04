package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34013OooO00o extends AbstractC34036OooOoOO implements InterfaceC34073o00000oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Oooo0 f122314OooOo0o;

    public AbstractC34013OooO00o(Oooo0 oooo0) {
        if (64 != oooo0.f122377OooOo) {
            throw new IllegalArgumentException();
        }
        this.f122314OooOo0o = oooo0;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        this.f122314OooOo0o.OooO(c34035OooOoO0, z);
    }

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() {
        return this;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        Oooo0 oooo0;
        if (abstractC34036OooOoOO instanceof AbstractC34013OooO00o) {
            oooo0 = ((AbstractC34013OooO00o) abstractC34036OooOoOO).f122314OooOo0o;
        } else {
            if (!(abstractC34036OooOoOO instanceof Oooo0)) {
                return false;
            }
            oooo0 = (Oooo0) abstractC34036OooOoOO;
        }
        return this.f122314OooOo0o.OooOO0o(oooo0);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return this.f122314OooOo0o.OooOO0();
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        return this.f122314OooOo0o.OooOO0O(z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOO() {
        return new C34063OooooOO((Oooo0) this.f122314OooOo0o.OooOOOO());
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOo() {
        return new o0O0O00((Oooo0) this.f122314OooOo0o.OooOOOo());
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return this.f122314OooOo0o.hashCode();
    }
}
