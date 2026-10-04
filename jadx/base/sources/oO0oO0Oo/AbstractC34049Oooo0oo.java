package oO0oO0Oo;

import java.io.IOException;
import java.util.Arrays;
import oOO000oO.C34332OooO00o;
import oOO000oO.C34336OooO0o;

/* JADX INFO: renamed from: oO0oO0Oo.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34049Oooo0oo extends AbstractC34036OooOoOO implements InterfaceC34042Oooo00O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122396OooOo = new OooO00o(AbstractC34049Oooo0oo.class);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122397OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.Oooo0oo$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return new oo0o0Oo(c34075o00o0O.f122362OooOo0o);
        }
    }

    public AbstractC34049Oooo0oo(byte[] bArr) {
        this.f122397OooOo0o = bArr;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(26, this.f122397OooOo0o, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof AbstractC34049Oooo0oo)) {
            return false;
        }
        return Arrays.equals(this.f122397OooOo0o, ((AbstractC34049Oooo0oo) abstractC34036OooOoOO).f122397OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(this.f122397OooOo0o.length, z);
    }

    @Override // oO0oO0Oo.InterfaceC34042Oooo00O
    public final String getString() {
        return C34336OooO0o.OooO00o(this.f122397OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122397OooOo0o);
    }

    public final String toString() {
        return C34336OooO0o.OooO00o(this.f122397OooOo0o);
    }
}
