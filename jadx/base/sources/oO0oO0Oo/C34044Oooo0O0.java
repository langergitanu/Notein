package oO0oO0Oo;

import java.io.IOException;
import java.util.Arrays;
import oOO000oO.C34332OooO00o;
import oOO000oO.C34336OooO0o;

/* JADX INFO: renamed from: oO0oO0Oo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34044Oooo0O0 extends AbstractC34036OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122386OooOo = new OooO00o(C34044Oooo0O0.class);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122387OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.Oooo0O0$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return new C34044Oooo0O0(c34075o00o0O.f122362OooOo0o);
        }
    }

    public C34044Oooo0O0(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.f122387OooOo0o = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b2 = bArr[1]) < 48 || b2 > 57) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(23, this.f122387OooOo0o, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof C34044Oooo0O0)) {
            return false;
        }
        return Arrays.equals(this.f122387OooOo0o, ((C34044Oooo0O0) abstractC34036OooOoOO).f122387OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(this.f122387OooOo0o.length, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122387OooOo0o);
    }

    public final String toString() {
        return C34336OooO0o.OooO00o(this.f122387OooOo0o);
    }
}
