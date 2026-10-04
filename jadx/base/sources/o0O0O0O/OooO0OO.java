package o0O0O0O;

import OooOoo.C20593OooO0Oo;
import android.util.Log;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18187g7;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f88278OooO00o = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f88279OooO0O0;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f88279OooO0O0 = strArr;
        Arrays.sort(strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        r12 = r0.f88274OooO0Oo;
        r9 = new java.lang.String(r11, r12, r0.f88276OooO0o0 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012a, code lost:
    
        r0.f88276OooO0o0 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0376 A[EDGE_INSN: B:217:0x0376->B:200:0x0376 BREAK  A[LOOP:2: B:156:0x02c7->B:223:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[LOOP:2: B:156:0x02c7->B:223:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO00o(String str, X509Certificate x509Certificate) throws SSLException {
        int i;
        int i2;
        String str2;
        char[] cArr;
        char c;
        int i3;
        char c2;
        String[] strArr;
        Collection<List<?>> subjectAlternativeNames;
        int i4;
        OooO0O0 oooO0O0 = new OooO0O0(x509Certificate.getSubjectX500Principal());
        oooO0O0.f88273OooO0OO = 0;
        oooO0O0.f88274OooO0Oo = 0;
        oooO0O0.f88276OooO0o0 = 0;
        oooO0O0.f88275OooO0o = 0;
        String str3 = oooO0O0.f88271OooO00o;
        oooO0O0.f88277OooO0oO = str3.toCharArray();
        List arrayList = Collections.EMPTY_LIST;
        String strOooO0OO = oooO0O0.OooO0OO();
        if (strOooO0OO != null) {
            do {
                int i5 = oooO0O0.f88273OooO0OO;
                int i6 = oooO0O0.f88272OooO0O0;
                if (i5 < i6) {
                    char c3 = oooO0O0.f88277OooO0oO[i5];
                    char c4 = IOUtils.DIR_SEPARATOR_WINDOWS;
                    i = 1;
                    i2 = 2;
                    char c5 = '+';
                    if (c3 == '\"') {
                        int i7 = i5 + 1;
                        oooO0O0.f88273OooO0OO = i7;
                        oooO0O0.f88274OooO0Oo = i7;
                        oooO0O0.f88276OooO0o0 = i7;
                        while (true) {
                            int i8 = oooO0O0.f88273OooO0OO;
                            if (i8 == i6) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr2 = oooO0O0.f88277OooO0oO;
                            char c6 = cArr2[i8];
                            if (c6 == '\"') {
                                oooO0O0.f88273OooO0OO = i8 + 1;
                                while (true) {
                                    int i9 = oooO0O0.f88273OooO0OO;
                                    if (i9 >= i6 || oooO0O0.f88277OooO0oO[i9] != ' ') {
                                        break;
                                    } else {
                                        oooO0O0.f88273OooO0OO = i9 + 1;
                                    }
                                }
                                char[] cArr3 = oooO0O0.f88277OooO0oO;
                                int i10 = oooO0O0.f88274OooO0Oo;
                                str2 = new String(cArr3, i10, oooO0O0.f88276OooO0o0 - i10);
                            } else {
                                if (c6 == '\\') {
                                    cArr2[oooO0O0.f88276OooO0o0] = oooO0O0.OooO0O0();
                                } else {
                                    cArr2[oooO0O0.f88276OooO0o0] = c6;
                                }
                                oooO0O0.f88273OooO0OO++;
                                oooO0O0.f88276OooO0o0++;
                                c5 = '+';
                            }
                        }
                    } else if (c3 == '#') {
                        if (i5 + 4 >= i6) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        oooO0O0.f88274OooO0Oo = i5;
                        oooO0O0.f88273OooO0OO = i5 + 1;
                        while (true) {
                            int i11 = oooO0O0.f88273OooO0OO;
                            if (i11 == i6 || (c = (cArr = oooO0O0.f88277OooO0oO)[i11]) == '+' || c == ',' || c == ';') {
                                break;
                            }
                            if (c == ' ') {
                                oooO0O0.f88276OooO0o0 = i11;
                                oooO0O0.f88273OooO0OO = i11 + 1;
                                while (true) {
                                    int i12 = oooO0O0.f88273OooO0OO;
                                    if (i12 >= i6 || oooO0O0.f88277OooO0oO[i12] != ' ') {
                                        break;
                                    } else {
                                        oooO0O0.f88273OooO0OO = i12 + 1;
                                    }
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i11] = (char) (c + ControlChar.SPACE_CHAR);
                                }
                                oooO0O0.f88273OooO0OO = i11 + 1;
                            }
                        }
                        int i13 = oooO0O0.f88276OooO0o0;
                        int i14 = oooO0O0.f88274OooO0Oo;
                        int i15 = i13 - i14;
                        if (i15 < 5 || (i15 & 1) == 0) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        int i16 = i15 / 2;
                        byte[] bArr = new byte[i16];
                        int i17 = i14 + 1;
                        for (int i18 = 0; i18 < i16; i18++) {
                            bArr[i18] = (byte) oooO0O0.OooO00o(i17);
                            i17 += 2;
                        }
                        str2 = new String(oooO0O0.f88277OooO0oO, oooO0O0.f88274OooO0Oo, i15);
                    } else if (c3 == '+' || c3 == ',' || c3 == ';') {
                        str2 = "";
                    } else {
                        oooO0O0.f88274OooO0Oo = i5;
                        oooO0O0.f88276OooO0o0 = i5;
                        while (true) {
                            int i19 = oooO0O0.f88273OooO0OO;
                            if (i19 >= i6) {
                                char[] cArr4 = oooO0O0.f88277OooO0oO;
                                int i20 = oooO0O0.f88274OooO0Oo;
                                str2 = new String(cArr4, i20, oooO0O0.f88276OooO0o0 - i20);
                                break;
                            }
                            char[] cArr5 = oooO0O0.f88277OooO0oO;
                            char c7 = cArr5[i19];
                            if (c7 == ' ') {
                                int i21 = oooO0O0.f88276OooO0o0;
                                oooO0O0.f88275OooO0o = i21;
                                oooO0O0.f88273OooO0OO = i19 + 1;
                                oooO0O0.f88276OooO0o0 = i21 + 1;
                                cArr5[i21] = ControlChar.SPACE_CHAR;
                                while (true) {
                                    i3 = oooO0O0.f88273OooO0OO;
                                    if (i3 >= i6) {
                                        break;
                                    }
                                    char[] cArr6 = oooO0O0.f88277OooO0oO;
                                    if (cArr6[i3] != ' ') {
                                        break;
                                    }
                                    int i22 = oooO0O0.f88276OooO0o0;
                                    oooO0O0.f88276OooO0o0 = i22 + 1;
                                    cArr6[i22] = ControlChar.SPACE_CHAR;
                                    oooO0O0.f88273OooO0OO = i3 + 1;
                                }
                                if (i3 == i6 || (c2 = oooO0O0.f88277OooO0oO[i3]) == ',' || c2 == '+' || c2 == ';') {
                                    break;
                                } else {
                                    c4 = IOUtils.DIR_SEPARATOR_WINDOWS;
                                }
                            } else {
                                if (c7 == ';') {
                                    break;
                                }
                                if (c7 == c4) {
                                    int i23 = oooO0O0.f88276OooO0o0;
                                    oooO0O0.f88276OooO0o0 = i23 + 1;
                                    cArr5[i23] = oooO0O0.OooO0O0();
                                    oooO0O0.f88273OooO0OO++;
                                } else {
                                    if (c7 == '+' || c7 == ',') {
                                        break;
                                    }
                                    int i24 = oooO0O0.f88276OooO0o0;
                                    oooO0O0.f88276OooO0o0 = i24 + 1;
                                    cArr5[i24] = c7;
                                    oooO0O0.f88273OooO0OO = i19 + 1;
                                }
                                c4 = IOUtils.DIR_SEPARATOR_WINDOWS;
                            }
                        }
                        char[] cArr7 = oooO0O0.f88277OooO0oO;
                        int i25 = oooO0O0.f88274OooO0Oo;
                        str2 = new String(cArr7, i25, oooO0O0.f88275OooO0o - i25);
                    }
                    if ("cn".equalsIgnoreCase(strOooO0OO)) {
                        if (arrayList.isEmpty()) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(str2);
                    }
                    int i26 = oooO0O0.f88273OooO0OO;
                    if (i26 < i6) {
                        char c8 = oooO0O0.f88277OooO0oO[i26];
                        if (c8 != ',' && c8 != ';' && c8 != c5) {
                            throw new IllegalStateException("Malformed DN: ".concat(str3));
                        }
                        oooO0O0.f88273OooO0OO = i26 + 1;
                        strOooO0OO = oooO0O0.OooO0OO();
                    }
                } else {
                    i = 1;
                    i2 = 2;
                }
            } while (strOooO0OO != null);
            throw new IllegalStateException("Malformed DN: ".concat(str3));
        }
        i = 1;
        i2 = 2;
        String[] strArr2 = null;
        if (arrayList.isEmpty()) {
            strArr = null;
        } else {
            String[] strArr3 = new String[arrayList.size()];
            arrayList.toArray(strArr3);
            strArr = strArr3;
        }
        LinkedList linkedList = new LinkedList();
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            Log.e(o00OOOo.OooO0OO.OooO00o(""), "Error parsing certificate.", e);
            subjectAlternativeNames = null;
        }
        if (subjectAlternativeNames != null) {
            for (List<?> list : subjectAlternativeNames) {
                int i27 = i2;
                if (((Integer) list.get(0)).intValue() == i27) {
                    linkedList.add((String) list.get(i));
                    i = 1;
                    i2 = 2;
                } else {
                    i2 = i27;
                    i = 1;
                }
            }
        }
        if (!linkedList.isEmpty()) {
            strArr2 = new String[linkedList.size()];
            linkedList.toArray(strArr2);
        }
        Arrays.toString(strArr);
        Arrays.toString(strArr2);
        LinkedList linkedList2 = new LinkedList();
        if (strArr == null || strArr.length <= 0) {
            i4 = 0;
        } else {
            i4 = 0;
            String str4 = strArr[0];
            if (str4 != null) {
                linkedList2.add(str4);
            }
        }
        if (strArr2 != null) {
            int length = strArr2.length;
            for (int i28 = i4; i28 < length; i28++) {
                String str5 = strArr2[i28];
                if (str5 != null) {
                    linkedList2.add(str5);
                }
            }
        }
        if (linkedList2.isEmpty()) {
            throw new SSLException(C20593OooO0Oo.OooO0O0("Certificate for <", str, "> doesn't contain CN or DNS subjectAlt"));
        }
        StringBuffer stringBuffer = new StringBuffer();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList2.iterator();
        ?? Equals = i4;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            stringBuffer.append(" <");
            stringBuffer.append(lowerCase2);
            stringBuffer.append('>');
            if (it.hasNext()) {
                stringBuffer.append(" OR");
            }
            if (lowerCase2.startsWith(C18187g7.b.f54919e) && lowerCase2.indexOf(46, 2) != -1) {
                int length2 = lowerCase2.length();
                if (length2 < 7 || length2 > 9) {
                    if (f88278OooO00o.matcher(str).matches()) {
                        Equals = lowerCase.endsWith(lowerCase2.substring(1));
                        if (Equals != 0) {
                            int i29 = i4;
                            int i30 = i29;
                            while (i29 < lowerCase.length()) {
                                if (lowerCase.charAt(i29) == '.') {
                                    i30++;
                                }
                                i29++;
                            }
                            int i31 = i4;
                            int i32 = i31;
                            while (i31 < lowerCase2.length()) {
                                if (lowerCase2.charAt(i31) == '.') {
                                    i32++;
                                }
                                i31++;
                            }
                            Equals = i30 == i32 ? 1 : i4;
                        }
                    }
                    if (Equals != 0) {
                        break;
                    }
                } else {
                    int i33 = length2 - 3;
                    if (lowerCase2.charAt(i33) == '.') {
                        if (Arrays.binarySearch(f88279OooO0O0, lowerCase2.substring(2, i33)) < 0) {
                        }
                    }
                    if (f88278OooO00o.matcher(str).matches()) {
                    }
                    if (Equals != 0) {
                    }
                }
            }
            Equals = lowerCase.equals(lowerCase2);
            if (Equals != 0) {
            }
        }
        if (Equals != 0) {
            return;
        }
        throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
    }
}
