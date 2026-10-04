package oO0oO0Oo;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: oO0oO0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34014OooO0O0 extends AbstractC34036OooOoOO implements InterfaceC34042Oooo00O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122315OooOo = new OooO00o(AbstractC34014OooO0O0.class);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final char[] f122316OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooO0O0$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return new C34064OooooOo(c34075o00o0O.f122362OooOo0o);
        }
    }

    public AbstractC34014OooO0O0(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.f122316OooOo0o = cArr;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        char[] cArr = this.f122316OooOo0o;
        int length = cArr.length;
        c34035OooOoO0.OooOOO0(30, z);
        c34035OooOoO0.OooO0oo(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            c34035OooOoO0.OooO0oO(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            c34035OooOoO0.OooO0oO(bArr, 0, i3);
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof AbstractC34014OooO0O0)) {
            return false;
        }
        return Arrays.equals(this.f122316OooOo0o, ((AbstractC34014OooO0O0) abstractC34036OooOoOO).f122316OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(this.f122316OooOo0o.length * 2, z);
    }

    @Override // oO0oO0Oo.InterfaceC34042Oooo00O
    public final String getString() {
        return new String(this.f122316OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        char[] cArr = this.f122316OooOo0o;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public final String toString() {
        return getString();
    }

    public AbstractC34014OooO0O0(char[] cArr) {
        this.f122316OooOo0o = cArr;
    }
}
