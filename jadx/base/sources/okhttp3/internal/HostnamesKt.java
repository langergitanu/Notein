package okhttp3.internal;

import com.huawei.hms.network.embedded.C18241k5;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oo0.C24684Oooo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m80612d2 = {"okhttp"}, m80613k = 2, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class HostnamesKt {
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
    
        if (r7 == 16) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ce, code lost:
    
        if (r8 != (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d2, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e2, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress OooO00o(int i, int i2, String str) {
        int i3;
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            if (i5 == 16) {
                return null;
            }
            int i8 = i4 + 2;
            if (i8 <= i2 && C33595OooOOo.OooOo(i4, str, "::", false)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                int i9 = 0;
                i4 = i7;
                while (i4 < i2) {
                }
                i3 = i4 - i7;
                return i3 == 0 ? null : null;
            }
            if (i5 != 0) {
                if (C33595OooOOo.OooOo(i4, str, C18241k5.f55433h, false)) {
                    i4++;
                } else {
                    if (!C33595OooOOo.OooOo(i4, str, ".", false)) {
                        return null;
                    }
                    int i10 = i5 - 2;
                    int i11 = i10;
                    while (i7 < i2) {
                        if (i11 == 16) {
                            return null;
                        }
                        if (i11 != i10) {
                            if (str.charAt(i7) != '.') {
                                return null;
                            }
                            i7++;
                        }
                        int i12 = 0;
                        int i13 = i7;
                        while (i13 < i2) {
                            char cCharAt = str.charAt(i13);
                            if (OooOOO0.OooO(cCharAt, 48) < 0 || OooOOO0.OooO(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i12 == 0 && i7 != i13) || ((i12 * 10) + cCharAt) - 48 > 255) {
                                return null;
                            }
                            i13++;
                        }
                        if (i13 - i7 == 0) {
                            return null;
                        }
                        bArr[i11] = (byte) i12;
                        i11++;
                        i7 = i13;
                    }
                    if (i11 != i5 + 2) {
                        return null;
                    }
                    i5 += 2;
                }
            }
            i7 = i4;
            int i92 = 0;
            i4 = i7;
            while (i4 < i2) {
                int iOooOOo = Util.OooOOo(str.charAt(i4));
                if (iOooOOo == -1) {
                    break;
                }
                i92 = (i92 << 4) + iOooOOo;
                i4++;
            }
            i3 = i4 - i7;
            if (i3 == 0 && i3 <= 4) {
                int i14 = i5 + 1;
                bArr[i5] = (byte) (255 & (i92 >>> 8));
                i5 += 2;
                bArr[i14] = (byte) (i92 & 255);
            }
        }
    }

    public static final String OooO0O0(String str) {
        OooOOO0.OooO0oO(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!C33599OooOo0O.OooOoOO(str, C18241k5.f55433h, false)) {
            try {
                String ascii = IDN.toASCII(str);
                OooOOO0.OooO0o(ascii, "toASCII(host)");
                Locale US = Locale.US;
                OooOOO0.OooO0o(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    char cCharAt = lowerCase.charAt(i3);
                    if (OooOOO0.OooO(cCharAt, 31) <= 0 || OooOOO0.OooO(cCharAt, 127) >= 0 || C33599OooOo0O.Oooo0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                    i3 = i4;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressOooO00o = (C33595OooOOo.OooOoO0(str, "[", false) && C33595OooOOo.OooOOo0(str, "]", false)) ? OooO00o(1, str.length() - 1, str) : OooO00o(0, str.length(), str);
        if (inetAddressOooO00o == null) {
            return null;
        }
        byte[] address = inetAddressOooO00o.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressOooO00o.getHostAddress();
            }
            throw new AssertionError(C24684Oooo.OooO00o('\'', "Invalid IPv6 address: '", str));
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i2 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        while (i < address.length) {
            if (i == i2) {
                c34524OooO0Oo.o0OoO0o(58);
                i += i6;
                if (i == 16) {
                    c34524OooO0Oo.o0OoO0o(58);
                }
            } else {
                if (i > 0) {
                    c34524OooO0Oo.o0OoO0o(58);
                }
                byte b = address[i];
                byte[] bArr = Util.f124301OooO00o;
                c34524OooO0Oo.o000OOO(((b & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return c34524OooO0Oo.o00000OO();
    }
}
