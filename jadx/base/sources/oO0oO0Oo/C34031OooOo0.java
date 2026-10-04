package oO0oO0Oo;

import java.io.IOException;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oO0Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34031OooOo0 extends AbstractC34036OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122352OooOo = new OooO00o(C34031OooOo0.class);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34080ooOO f122353OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooOo0$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0OO(AbstractC34039OooOooO abstractC34039OooOooO) {
            throw new IllegalStateException("unexpected implicit constructed encoding");
        }

        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return new C34031OooOo0(new C34080ooOO(c34075o00o0O.f122362OooOo0o));
        }
    }

    public C34031OooOo0(C34080ooOO c34080ooOO) {
        this.f122353OooOo0o = c34080ooOO;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOOO0(7, z);
        c34035OooOoO0.OooOO0(25, this.f122353OooOo0o.f122338OooOo0o, false);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (abstractC34036OooOoOO instanceof C34031OooOo0) {
            return this.f122353OooOo0o.OooO0oo(((C34031OooOo0) abstractC34036OooOoOO).f122353OooOo0o);
        }
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return this.f122353OooOo0o.OooOO0O(z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOO() {
        this.f122353OooOo0o.getClass();
        return this;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOo() {
        this.f122353OooOo0o.getClass();
        return this;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return ~C34332OooO00o.OooO0o0(this.f122353OooOo0o.f122338OooOo0o);
    }
}
