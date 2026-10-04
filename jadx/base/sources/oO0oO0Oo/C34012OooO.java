package oO0oO0Oo;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Arrays;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oO0Oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34012OooO extends AbstractC34036OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122311OooOo = new OooO00o(C34012OooO.class);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C34012OooO[] f122312OooOoO0 = new C34012OooO[12];

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122313OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooO$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return C34012OooO.OooOOo0(c34075o00o0O.f122362OooOo0o, false);
        }
    }

    public C34012OooO(byte[] bArr, boolean z) {
        if (C34029OooOOo0.OooOo0O(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        int i = 0;
        if ((bArr[0] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f122313OooOo0o = z ? C34332OooO00o.OooO00o(bArr) : bArr;
        int length = bArr.length - 1;
        while (i < length) {
            byte b = bArr[i];
            i++;
            if (b != (bArr[i] >> 7)) {
                return;
            }
        }
    }

    public static C34012OooO OooOOo0(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new C34012OooO(bArr, z);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        if (i >= 12) {
            return new C34012OooO(bArr, z);
        }
        C34012OooO[] c34012OooOArr = f122312OooOoO0;
        C34012OooO c34012OooO = c34012OooOArr[i];
        if (c34012OooO != null) {
            return c34012OooO;
        }
        C34012OooO c34012OooO2 = new C34012OooO(bArr, z);
        c34012OooOArr[i] = c34012OooO2;
        return c34012OooO2;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(10, this.f122313OooOo0o, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof C34012OooO)) {
            return false;
        }
        return Arrays.equals(this.f122313OooOo0o, ((C34012OooO) abstractC34036OooOoOO).f122313OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(this.f122313OooOo0o.length, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122313OooOo0o);
    }
}
