package oO0oO0Oo;

import OooOoo.C20593OooO0Oo;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oO0Oo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34032OooOo0O extends AbstractC34036OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public byte[] f122356OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f122357OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO00o f122355OooOoO0 = new OooO00o(C34032OooOo0O.class);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final ConcurrentHashMap f122354OooOoO = new ConcurrentHashMap();

    /* JADX INFO: renamed from: oO0oO0Oo.OooOo0O$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return C34032OooOo0O.OooOOo(c34075o00o0O.f122362OooOo0o, false);
        }
    }

    /* JADX INFO: renamed from: oO0oO0Oo.OooOo0O$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f122358OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f122359OooO0O0;

        public OooO0O0(byte[] bArr) {
            this.f122358OooO00o = C34332OooO00o.OooO0o0(bArr);
            this.f122359OooO0O0 = bArr;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            return Arrays.equals(this.f122359OooO0O0, ((OooO0O0) obj).f122359OooO0O0);
        }

        public final int hashCode() {
            return this.f122358OooO00o;
        }
    }

    public C34032OooOo0O(String str) {
        char cCharAt;
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        boolean zOooOOo = false;
        if (str.length() >= 3 && str.charAt(1) == '.' && (cCharAt = str.charAt(0)) >= '0' && cCharAt <= '2') {
            zOooOOo = C34037OooOoo.OooOOo(2, str);
        }
        if (!zOooOOo) {
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("string ", str, " not an OID"));
        }
        this.f122357OooOo0o = str;
    }

    public static C34032OooOo0O OooOOo(byte[] bArr, boolean z) {
        C34032OooOo0O c34032OooOo0O = (C34032OooOo0O) f122354OooOoO.get(new OooO0O0(bArr));
        return c34032OooOo0O == null ? new C34032OooOo0O(bArr, z) : c34032OooOo0O;
    }

    public static C34032OooOo0O OooOo0(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        if (interfaceC34019OooO0oO == null || (interfaceC34019OooO0oO instanceof C34032OooOo0O)) {
            return (C34032OooOo0O) interfaceC34019OooO0oO;
        }
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = interfaceC34019OooO0oO.OooO0o();
        if (abstractC34036OooOoOOOooO0o instanceof C34032OooOo0O) {
            return (C34032OooOo0O) abstractC34036OooOoOOOooO0o;
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(interfaceC34019OooO0oO.getClass().getName()));
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(6, OooOo00(), z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (abstractC34036OooOoOO == this) {
            return true;
        }
        if (!(abstractC34036OooOoOO instanceof C34032OooOo0O)) {
            return false;
        }
        return this.f122357OooOo0o.equals(((C34032OooOo0O) abstractC34036OooOoOO).f122357OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(OooOo00().length, z);
    }

    public final void OooOOo0(String str) {
        new C34032OooOo0O(this, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0079 -> B:16:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOoo(ByteArrayOutputStream byteArrayOutputStream) {
        String strSubstring;
        int i;
        String strSubstring2;
        int i2;
        String strSubstring3;
        String str = this.f122357OooOo0o;
        int iIndexOf = str.indexOf(46, 0);
        if (iIndexOf == -1) {
            strSubstring = str.substring(0);
            i = -1;
        } else {
            strSubstring = str.substring(0, iIndexOf);
            i = iIndexOf + 1;
        }
        int i3 = Integer.parseInt(strSubstring) * 40;
        if (i == -1) {
            i2 = i;
            strSubstring2 = null;
        } else {
            int iIndexOf2 = str.indexOf(46, i);
            if (iIndexOf2 == -1) {
                strSubstring2 = str.substring(i);
                i2 = -1;
            } else {
                strSubstring2 = str.substring(i, iIndexOf2);
                i2 = iIndexOf2 + 1;
            }
        }
        if (strSubstring2.length() > 18) {
            C34037OooOoo.OooOo00(byteArrayOutputStream, new BigInteger(strSubstring2).add(BigInteger.valueOf(i3)));
            while (i2 != -1) {
            }
        }
        long j = Long.parseLong(strSubstring2) + ((long) i3);
        C34037OooOoo.OooOOoo(byteArrayOutputStream, j);
        while (i2 != -1) {
            if (i2 != -1) {
                int iIndexOf3 = str.indexOf(46, i2);
                if (iIndexOf3 == -1) {
                    strSubstring3 = str.substring(i2);
                    i2 = -1;
                } else {
                    String strSubstring4 = str.substring(i2, iIndexOf3);
                    i2 = iIndexOf3 + 1;
                    strSubstring3 = strSubstring4;
                }
            } else {
                strSubstring3 = null;
            }
            if (strSubstring3.length() <= 18) {
                j = Long.parseLong(strSubstring3);
                C34037OooOoo.OooOOoo(byteArrayOutputStream, j);
                while (i2 != -1) {
                }
            } else {
                C34037OooOoo.OooOo00(byteArrayOutputStream, new BigInteger(strSubstring3));
            }
        }
    }

    public final synchronized byte[] OooOo00() {
        try {
            if (this.f122356OooOo == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OooOOoo(byteArrayOutputStream);
                this.f122356OooOo = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f122356OooOo;
    }

    public final C34032OooOo0O OooOo0O() {
        OooO0O0 oooO0O0 = new OooO0O0(OooOo00());
        ConcurrentHashMap concurrentHashMap = f122354OooOoO;
        C34032OooOo0O c34032OooOo0O = (C34032OooOo0O) concurrentHashMap.get(oooO0O0);
        if (c34032OooOo0O != null) {
            return c34032OooOo0O;
        }
        C34032OooOo0O c34032OooOo0O2 = (C34032OooOo0O) concurrentHashMap.putIfAbsent(oooO0O0, this);
        return c34032OooOo0O2 == null ? this : c34032OooOo0O2;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return this.f122357OooOo0o.hashCode();
    }

    public final String toString() {
        return this.f122357OooOo0o;
    }

    public C34032OooOo0O(C34032OooOo0O c34032OooOo0O, String str) {
        if (C34037OooOoo.OooOOo(0, str)) {
            this.f122357OooOo0o = com.aspose.slides.OooOOO.OooO0O0(new StringBuilder(), c34032OooOo0O.f122357OooOo0o, ".", str);
            return;
        }
        throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("string ", str, " not a valid OID branch"));
    }

    public C34032OooOo0O(byte[] bArr, boolean z) {
        boolean z2;
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z3 = true;
        long j = 0;
        BigInteger bigIntegerShiftLeft = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i];
            if (j <= 72057594037927808L) {
                z2 = z3;
                long j2 = j + ((long) (b & Ascii.DEL));
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                    z3 = z2;
                }
            } else {
                z2 = z3;
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j) : bigIntegerShiftLeft).or(BigInteger.valueOf(b & Ascii.DEL));
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                    stringBuffer.append(bigIntegerOr);
                    j = 0;
                    bigIntegerShiftLeft = null;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                    z3 = z2;
                }
            }
        }
        this.f122357OooOo0o = stringBuffer.toString();
        this.f122356OooOo = z ? C34332OooO00o.OooO00o(bArr2) : bArr2;
    }
}
