package oO0oO0Oo;

import java.io.IOException;
import java.util.Arrays;
import oOO000oO.C34332OooO00o;
import oOO000oO.C34336OooO0o;

/* JADX INFO: renamed from: oO0oO0Oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34038OooOoo0 extends AbstractC34036OooOoOO implements InterfaceC34042Oooo00O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122368OooOo = new OooO00o(AbstractC34038OooOoo0.class);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122369OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooOoo0$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return new C34076o00oO0o(c34075o00o0O.f122362OooOo0o);
        }
    }

    public AbstractC34038OooOoo0(byte[] bArr) {
        this.f122369OooOo0o = bArr;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(19, this.f122369OooOo0o, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof AbstractC34038OooOoo0)) {
            return false;
        }
        return Arrays.equals(this.f122369OooOo0o, ((AbstractC34038OooOoo0) abstractC34036OooOoOO).f122369OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(this.f122369OooOo0o.length, z);
    }

    @Override // oO0oO0Oo.InterfaceC34042Oooo00O
    public final String getString() {
        return C34336OooO0o.OooO00o(this.f122369OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122369OooOo0o);
    }

    public final String toString() {
        return C34336OooO0o.OooO00o(this.f122369OooOo0o);
    }
}
