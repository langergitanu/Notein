package oO0oO0Oo;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import oOO000oO.C34332OooO00o;
import oOO000oO.C34336OooO0o;
import oOO000oo.C34344OooO0oO;

/* JADX INFO: renamed from: oO0oO0Oo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34045Oooo0OO extends AbstractC34036OooOoOO implements InterfaceC34042Oooo00O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122388OooOo = new OooO00o(AbstractC34045Oooo0OO.class);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122389OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.Oooo0OO$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return new o0OOO0o(c34075o00o0O.f122362OooOo0o);
        }
    }

    public AbstractC34045Oooo0OO(byte[] bArr) {
        this.f122389OooOo0o = bArr;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(12, this.f122389OooOo0o, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof AbstractC34045Oooo0OO)) {
            return false;
        }
        return Arrays.equals(this.f122389OooOo0o, ((AbstractC34045Oooo0OO) abstractC34036OooOoOO).f122389OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(this.f122389OooOo0o.length, z);
    }

    @Override // oO0oO0Oo.InterfaceC34042Oooo00O
    public final String getString() {
        String str = C34336OooO0o.f123266OooO00o;
        byte[] bArr = this.f122389OooOo0o;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = C34344OooO0oO.f123275OooO00o;
        int i = 0;
        int i2 = 0;
        loop0: while (i < bArr.length) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = C34344OooO0oO.f123275OooO00o[b & Ascii.DEL];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i3 >= bArr.length) {
                            break loop0;
                        }
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        i4 = (i4 << 6) | (b3 & 63);
                        b2 = C34344OooO0oO.f123276OooO0O0[b2 + ((b3 & 255) >>> 4)];
                        i3 = i5;
                    } else if (b2 != -2) {
                        if (i4 <= 65535) {
                            if (i2 < length) {
                                cArr[i2] = (char) i4;
                                i2++;
                                i = i3;
                            }
                        } else if (i2 < length - 1) {
                            int i6 = i2 + 1;
                            cArr[i2] = (char) ((i4 >>> 10) + 55232);
                            i2 += 2;
                            cArr[i6] = (char) ((i4 & 1023) | 56320);
                            i = i3;
                        }
                    }
                }
                i2 = -1;
                break;
            }
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            cArr[i2] = (char) b;
            i = i3;
            i2++;
        }
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122389OooOo0o);
    }

    public final String toString() {
        return getString();
    }
}
