package oO0oO0Oo;

import java.io.IOException;
import java.util.Arrays;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oO0Oo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34047Oooo0o0 extends AbstractC34036OooOoOO implements InterfaceC34042Oooo00O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122391OooOo = new OooO00o(AbstractC34047Oooo0o0.class);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final char[] f122392OooOoO0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122393OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.Oooo0o0$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return new o0Oo0oo(c34075o00o0O.f122362OooOo0o);
        }
    }

    public AbstractC34047Oooo0o0(byte[] bArr) {
        this.f122393OooOo0o = bArr;
    }

    public static void OooOOo0(StringBuffer stringBuffer, int i) {
        char[] cArr = f122392OooOoO0;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(28, this.f122393OooOo0o, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof AbstractC34047Oooo0o0)) {
            return false;
        }
        return Arrays.equals(this.f122393OooOo0o, ((AbstractC34047Oooo0o0) abstractC34036OooOoOO).f122393OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(this.f122393OooOo0o.length, z);
    }

    @Override // oO0oO0Oo.InterfaceC34042Oooo00O
    public final String getString() {
        int i;
        byte[] bArr = this.f122393OooOo0o;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((C34035OooOoO0.OooO0OO(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length < 128) {
            OooOOo0(stringBuffer, length);
        } else {
            byte[] bArr2 = new byte[5];
            int i2 = length;
            int i3 = 5;
            while (true) {
                i = i3 - 1;
                bArr2[i] = (byte) i2;
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3 = i;
            }
            int i4 = i3 - 2;
            bArr2[i4] = (byte) (128 | (5 - i));
            while (true) {
                int i5 = i4 + 1;
                OooOOo0(stringBuffer, bArr2[i4]);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (byte b : bArr) {
            OooOOo0(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122393OooOo0o);
    }

    public final String toString() {
        return getString();
    }
}
