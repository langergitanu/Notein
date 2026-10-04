package oO0oO0Oo;

import com.aspose.slides.C22206OooOOo0;
import com.aspose.words.internal.C22245OooO0oO;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import oOO000oO.C34332OooO00o;
import oOO000oO.C34335OooO0Oo;

/* JADX INFO: renamed from: oO0oO0Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34029OooOOo0 extends AbstractC34036OooOoOO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO00o f122347OooOoO0 = new OooO00o(C34029OooOOo0.class);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f122348OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122349OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooOOo0$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return new C34029OooOOo0(c34075o00o0O.f122362OooOo0o);
        }
    }

    public C34029OooOOo0(long j) {
        this.f122349OooOo0o = BigInteger.valueOf(j).toByteArray();
        this.f122348OooOo = 0;
    }

    public static C34029OooOOo0 OooOOo0(Object obj) {
        if (obj == null || (obj instanceof C34029OooOOo0)) {
            return (C34029OooOOo0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
        }
        try {
            return (C34029OooOOo0) f122347OooOoO0.OooO0O0((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static int OooOo00(int i, byte[] bArr) {
        int length = bArr.length;
        int iMax = Math.max(i, length - 4);
        int i2 = bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i2;
            }
            i2 = (i2 << 8) | (bArr[iMax] & 255);
        }
    }

    public static boolean OooOo0O(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || C34335OooO0Oo.OooO0O0("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(2, this.f122349OooOo0o, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof C34029OooOOo0)) {
            return false;
        }
        return Arrays.equals(this.f122349OooOo0o, ((C34029OooOOo0) abstractC34036OooOoOO).f122349OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(this.f122349OooOo0o.length, z);
    }

    public final BigInteger OooOOo() {
        return new BigInteger(this.f122349OooOo0o);
    }

    public final boolean OooOOoo(int i) {
        byte[] bArr = this.f122349OooOo0o;
        int length = bArr.length;
        int i2 = this.f122348OooOo;
        return length - i2 <= 4 && OooOo00(i2, bArr) == i;
    }

    public final int OooOo0() {
        byte[] bArr = this.f122349OooOo0o;
        int length = bArr.length;
        int i = this.f122348OooOo;
        if (length - i <= 4) {
            return OooOo00(i, bArr);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public final long OooOo0o() {
        byte[] bArr = this.f122349OooOo0o;
        int length = bArr.length;
        int i = this.f122348OooOo;
        if (length - i > 8) {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
        int length2 = bArr.length;
        int iMax = Math.max(i, length2 - 8);
        long j = bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length2) {
                return j;
            }
            j = (j << 8) | ((long) (bArr[iMax] & 255));
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122349OooOo0o);
    }

    public final String toString() {
        return OooOOo().toString();
    }

    public C34029OooOOo0(BigInteger bigInteger) {
        this.f122349OooOo0o = bigInteger.toByteArray();
        this.f122348OooOo = 0;
    }

    public C34029OooOOo0(byte[] bArr) {
        if (OooOo0O(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f122349OooOo0o = bArr;
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.f122348OooOo = i;
    }
}
