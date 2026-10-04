package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34018OooO0o0 extends AbstractC34036OooOoOO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte f122323OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122320OooOo = new OooO00o(C34018OooO0o0.class);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C34018OooO0o0 f122322OooOoO0 = new C34018OooO0o0((byte) 0);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final C34018OooO0o0 f122321OooOoO = new C34018OooO0o0((byte) -1);

    /* JADX INFO: renamed from: oO0oO0Oo.OooO0o0$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return C34018OooO0o0.OooOOo0(c34075o00o0O.f122362OooOo0o);
        }
    }

    public C34018OooO0o0(byte b) {
        this.f122323OooOo0o = b;
    }

    public static C34018OooO0o0 OooOOo0(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b = bArr[0];
        return b != -1 ? b != 0 ? new C34018OooO0o0(b) : f122322OooOoO0 : f122321OooOoO;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOOO0(1, z);
        c34035OooOoO0.OooO0oo(1);
        c34035OooOoO0.OooO0o(this.f122323OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        return (abstractC34036OooOoOO instanceof C34018OooO0o0) && OooOOo() == ((C34018OooO0o0) abstractC34036OooOoOO).OooOOo();
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(1, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOO() {
        return OooOOo() ? f122321OooOoO : f122322OooOoO0;
    }

    public final boolean OooOOo() {
        return this.f122323OooOo0o != 0;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return OooOOo() ? 1 : 0;
    }

    public final String toString() {
        return OooOOo() ? "TRUE" : "FALSE";
    }
}
