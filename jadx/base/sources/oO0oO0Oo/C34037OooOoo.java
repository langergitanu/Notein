package oO0oO0Oo;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: oO0oO0Oo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34037OooOoo extends AbstractC34036OooOoOO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO00o f122365OooOoO0 = new OooO00o(C34037OooOoo.class);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public byte[] f122366OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f122367OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooOoo$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return new C34037OooOoo(c34075o00o0O.f122362OooOo0o);
        }
    }

    public C34037OooOoo(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigIntegerShiftLeft = null;
        long j = 0;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & Ascii.DEL));
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                    }
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j) : bigIntegerShiftLeft).or(BigInteger.valueOf(b & Ascii.DEL));
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                    }
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        this.f122367OooOo0o = stringBuffer.toString();
        this.f122366OooOo = bArr;
    }

    public static boolean OooOOo(int i, String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 < i) {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                return true;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == '.') {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i2 = 0;
                length = i3;
            } else {
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                i2++;
                length = i3;
            }
        }
        return false;
    }

    public static void OooOOoo(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static void OooOo00(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Ascii.DEL);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(13, OooOOo0(), z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (this == abstractC34036OooOoOO) {
            return true;
        }
        if (abstractC34036OooOoOO instanceof C34037OooOoo) {
            return this.f122367OooOo0o.equals(((C34037OooOoo) abstractC34036OooOoOO).f122367OooOo0o);
        }
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(OooOOo0().length, z);
    }

    public final synchronized byte[] OooOOo0() {
        String strSubstring;
        try {
            if (this.f122366OooOo == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i = 0;
                while (i != -1) {
                    if (i == -1) {
                        strSubstring = null;
                    } else {
                        String str = this.f122367OooOo0o;
                        int iIndexOf = str.indexOf(46, i);
                        if (iIndexOf == -1) {
                            strSubstring = str.substring(i);
                            i = -1;
                        } else {
                            strSubstring = str.substring(i, iIndexOf);
                            i = iIndexOf + 1;
                        }
                    }
                    if (strSubstring.length() <= 18) {
                        OooOOoo(byteArrayOutputStream, Long.parseLong(strSubstring));
                    } else {
                        OooOo00(byteArrayOutputStream, new BigInteger(strSubstring));
                    }
                }
                this.f122366OooOo = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f122366OooOo;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return this.f122367OooOo0o.hashCode();
    }

    public final String toString() {
        return this.f122367OooOo0o;
    }
}
