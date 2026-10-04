package oO0OOoo0;

import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18187g7;
import com.huawei.hms.network.embedded.C18358t1;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: oO0OOoo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33135OooO0o0 implements HostnameVerifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33135OooO0o0 f119824OooO00o = new C33135OooO0o0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f119825OooO0O0 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List<String> OooO00o(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
    
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
    
        r4 = r5.f119815OooO0Oo;
        r8 = new java.lang.String(r10, r4, r5.f119817OooO0o0 - r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c2, code lost:
    
        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(r1));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean OooO0O0(String str, X509Certificate x509Certificate) {
        boolean z;
        String str2;
        int i;
        char[] cArr;
        char c;
        int i2;
        char c2;
        boolean z2 = true;
        boolean z3 = false;
        if (f119825OooO0O0.matcher(str).matches()) {
            List<String> listOooO00o = OooO00o(x509Certificate, 7);
            int size = listOooO00o.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (str.equalsIgnoreCase(listOooO00o.get(i3))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c3 = 2;
        List<String> listOooO00o2 = OooO00o(x509Certificate, 2);
        int size2 = listOooO00o2.size();
        int i4 = 0;
        boolean z4 = false;
        while (i4 < size2) {
            if (OooO0OO(lowerCase, listOooO00o2.get(i4))) {
                return true;
            }
            i4++;
            z4 = true;
        }
        if (!z4) {
            C33132OooO0OO c33132OooO0OO = new C33132OooO0OO(x509Certificate.getSubjectX500Principal());
            c33132OooO0OO.f119814OooO0OO = 0;
            c33132OooO0OO.f119815OooO0Oo = 0;
            c33132OooO0OO.f119817OooO0o0 = 0;
            c33132OooO0OO.f119816OooO0o = 0;
            String str3 = c33132OooO0OO.f119812OooO00o;
            c33132OooO0OO.f119818OooO0oO = str3.toCharArray();
            String strOooO0OO = c33132OooO0OO.OooO0OO();
            String str4 = null;
            if (strOooO0OO == null) {
                z = z3;
            } else {
                while (true) {
                    int i5 = c33132OooO0OO.f119814OooO0OO;
                    int i6 = c33132OooO0OO.f119813OooO0O0;
                    if (i5 == i6) {
                        break;
                    }
                    char c4 = c33132OooO0OO.f119818OooO0oO[i5];
                    char c5 = c3;
                    boolean z5 = z2;
                    if (c4 == '\"') {
                        z = z3;
                        int i7 = i5 + 1;
                        c33132OooO0OO.f119814OooO0OO = i7;
                        c33132OooO0OO.f119815OooO0Oo = i7;
                        c33132OooO0OO.f119817OooO0o0 = i7;
                        while (true) {
                            int i8 = c33132OooO0OO.f119814OooO0OO;
                            if (i8 == i6) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr2 = c33132OooO0OO.f119818OooO0oO;
                            char c6 = cArr2[i8];
                            if (c6 == '\"') {
                                c33132OooO0OO.f119814OooO0OO = i8 + 1;
                                while (true) {
                                    int i9 = c33132OooO0OO.f119814OooO0OO;
                                    if (i9 >= i6 || c33132OooO0OO.f119818OooO0oO[i9] != ' ') {
                                        break;
                                    }
                                    c33132OooO0OO.f119814OooO0OO = i9 + 1;
                                }
                                char[] cArr3 = c33132OooO0OO.f119818OooO0oO;
                                int i10 = c33132OooO0OO.f119815OooO0Oo;
                                str2 = new String(cArr3, i10, c33132OooO0OO.f119817OooO0o0 - i10);
                            } else {
                                if (c6 == '\\') {
                                    cArr2[c33132OooO0OO.f119817OooO0o0] = c33132OooO0OO.OooO0O0();
                                } else {
                                    cArr2[c33132OooO0OO.f119817OooO0o0] = c6;
                                }
                                c33132OooO0OO.f119814OooO0OO++;
                                c33132OooO0OO.f119817OooO0o0++;
                            }
                        }
                    } else if (c4 == '#') {
                        z = z3;
                        if (i5 + 4 >= i6) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        c33132OooO0OO.f119815OooO0Oo = i5;
                        c33132OooO0OO.f119814OooO0OO = i5 + 1;
                        while (true) {
                            i = c33132OooO0OO.f119814OooO0OO;
                            if (i == i6 || (c = (cArr = c33132OooO0OO.f119818OooO0oO)[i]) == '+' || c == ',' || c == ';') {
                                break;
                            }
                            if (c == ' ') {
                                c33132OooO0OO.f119817OooO0o0 = i;
                                c33132OooO0OO.f119814OooO0OO = i + 1;
                                while (true) {
                                    int i11 = c33132OooO0OO.f119814OooO0OO;
                                    if (i11 >= i6 || c33132OooO0OO.f119818OooO0oO[i11] != ' ') {
                                        break;
                                    }
                                    c33132OooO0OO.f119814OooO0OO = i11 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i] = (char) (c + ControlChar.SPACE_CHAR);
                                }
                                c33132OooO0OO.f119814OooO0OO = i + 1;
                            }
                        }
                        c33132OooO0OO.f119817OooO0o0 = i;
                        int i12 = c33132OooO0OO.f119817OooO0o0;
                        int i13 = c33132OooO0OO.f119815OooO0Oo;
                        int i14 = i12 - i13;
                        if (i14 < 5 || (i14 & 1) == 0) {
                            break;
                        }
                        int i15 = i14 / 2;
                        byte[] bArr = new byte[i15];
                        int i16 = i13 + 1;
                        for (?? r12 = z; r12 < i15; r12++) {
                            bArr[r12] = (byte) c33132OooO0OO.OooO00o(i16);
                            i16 += 2;
                        }
                        str2 = new String(c33132OooO0OO.f119818OooO0oO, c33132OooO0OO.f119815OooO0Oo, i14);
                    } else if (c4 == '+' || c4 == ',' || c4 == ';') {
                        z = z3;
                        str2 = "";
                    } else {
                        c33132OooO0OO.f119815OooO0Oo = i5;
                        c33132OooO0OO.f119817OooO0o0 = i5;
                        while (true) {
                            int i17 = c33132OooO0OO.f119814OooO0OO;
                            if (i17 >= i6) {
                                char[] cArr4 = c33132OooO0OO.f119818OooO0oO;
                                int i18 = c33132OooO0OO.f119815OooO0Oo;
                                str2 = new String(cArr4, i18, c33132OooO0OO.f119817OooO0o0 - i18);
                                z = z3;
                                break;
                            }
                            char[] cArr5 = c33132OooO0OO.f119818OooO0oO;
                            char c7 = cArr5[i17];
                            if (c7 == ' ') {
                                z = z3;
                                int i19 = c33132OooO0OO.f119817OooO0o0;
                                c33132OooO0OO.f119816OooO0o = i19;
                                c33132OooO0OO.f119814OooO0OO = i17 + 1;
                                c33132OooO0OO.f119817OooO0o0 = i19 + 1;
                                cArr5[i19] = ControlChar.SPACE_CHAR;
                                while (true) {
                                    i2 = c33132OooO0OO.f119814OooO0OO;
                                    if (i2 >= i6) {
                                        break;
                                    }
                                    char[] cArr6 = c33132OooO0OO.f119818OooO0oO;
                                    if (cArr6[i2] != ' ') {
                                        break;
                                    }
                                    int i20 = c33132OooO0OO.f119817OooO0o0;
                                    c33132OooO0OO.f119817OooO0o0 = i20 + 1;
                                    cArr6[i20] = ControlChar.SPACE_CHAR;
                                    c33132OooO0OO.f119814OooO0OO = i2 + 1;
                                }
                                if (i2 == i6 || (c2 = c33132OooO0OO.f119818OooO0oO[i2]) == ',' || c2 == '+' || c2 == ';') {
                                    break;
                                }
                                z3 = z;
                            } else {
                                if (c7 == ';') {
                                    break;
                                }
                                if (c7 == '\\') {
                                    z = z3;
                                    int i21 = c33132OooO0OO.f119817OooO0o0;
                                    c33132OooO0OO.f119817OooO0o0 = i21 + 1;
                                    cArr5[i21] = c33132OooO0OO.OooO0O0();
                                    c33132OooO0OO.f119814OooO0OO++;
                                } else {
                                    if (c7 == '+' || c7 == ',') {
                                        break;
                                    }
                                    int i22 = c33132OooO0OO.f119817OooO0o0;
                                    z = z3;
                                    c33132OooO0OO.f119817OooO0o0 = i22 + 1;
                                    cArr5[i22] = c7;
                                    c33132OooO0OO.f119814OooO0OO = i17 + 1;
                                }
                                z3 = z;
                            }
                        }
                        char[] cArr7 = c33132OooO0OO.f119818OooO0oO;
                        int i23 = c33132OooO0OO.f119815OooO0Oo;
                        str2 = new String(cArr7, i23, c33132OooO0OO.f119816OooO0o - i23);
                    }
                    if ("cn".equalsIgnoreCase(strOooO0OO)) {
                        str4 = str2;
                        break;
                    }
                    int i24 = c33132OooO0OO.f119814OooO0OO;
                    if (i24 >= i6) {
                        break;
                    }
                    char c8 = c33132OooO0OO.f119818OooO0oO[i24];
                    if (c8 != ',' && c8 != ';' && c8 != '+') {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                    c33132OooO0OO.f119814OooO0OO = i24 + 1;
                    strOooO0OO = c33132OooO0OO.OooO0OO();
                    if (strOooO0OO == null) {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                    c3 = c5;
                    z2 = z5;
                    z3 = z;
                }
            }
            return str4 != null ? OooO0OO(lowerCase, str4) : z;
        }
        return false;
    }

    public static boolean OooO0OO(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains(C18358t1.g.f56183c)) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith(C18187g7.b.f54919e) || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || C18187g7.b.f54919e.equals(lowerCase)) {
            return false;
        }
        String strSubstring = lowerCase.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return OooO0O0(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
