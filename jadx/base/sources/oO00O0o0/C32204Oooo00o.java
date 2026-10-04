package oO00O0o0;

import OooOoo.C20593OooO0Oo;
import OooooO0.C21294OooOO0O;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.List;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO00O0o0.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32204Oooo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<String> f115586OooO00o = com.facebook.soloader.OooOo.OooO0oO("");

    public static final int OooO00o(int i, int i2, String str) {
        boolean z = false;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '[') {
                z = true;
            } else if (cCharAt == ']') {
                z = false;
            } else if (cCharAt == ':' && !z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void OooO0O0(C32200OooOooO c32200OooOooO, String urlString) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32200OooOooO, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(urlString, "urlString");
        if (C33599OooOo0O.Oooo0o0(urlString)) {
            return;
        }
        try {
            OooO0OO(c32200OooOooO, urlString);
        } catch (Throwable th) {
            throw new Oooo000("Fail to parse url: ".concat(urlString), th);
        }
    }

    public static final void OooO0OO(C32200OooOooO c32200OooOooO, String urlString) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List<String> listO000oOoO;
        int iIntValue;
        int i7 = 1;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32200OooOooO, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(urlString, "urlString");
        int length = urlString.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            } else if (!io.ktor.utils.p616io.Oooo000.OooO0o0(urlString.charAt(i8))) {
                break;
            } else {
                i8++;
            }
        }
        int length2 = urlString.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i9 = length2 - 1;
                if (!io.ktor.utils.p616io.Oooo000.OooO0o0(urlString.charAt(length2))) {
                    break;
                } else if (i9 < 0) {
                    break;
                } else {
                    length2 = i9;
                }
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        int i10 = length2 + 1;
        char cCharAt = urlString.charAt(i8);
        char c = 'A';
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i = i8;
            i2 = i;
        } else {
            i2 = -1;
            i = i8;
        }
        while (true) {
            i3 = i7;
            if (i >= i10) {
                break;
            }
            char cCharAt2 = urlString.charAt(i);
            if (cCharAt2 == ':') {
                if (i2 != -1) {
                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "Illegal character in scheme at position "));
                }
                i4 = i - i8;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '?' || cCharAt2 == '#') {
                    break;
                }
                if (i2 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                    i2 = i;
                }
                i++;
                i7 = i3;
            }
        }
        i4 = -1;
        if (i4 > 0) {
            String strSubstring = urlString.substring(i8, i8 + i4);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Oooo0 oooo0 = Oooo0.f115581OooO0OO;
            int length3 = strSubstring.length();
            int i11 = 0;
            while (true) {
                if (i11 >= length3) {
                    i11 = -1;
                    break;
                }
                char cCharAt3 = strSubstring.charAt(i11);
                if ((('A' > cCharAt3 || cCharAt3 >= '[') ? (cCharAt3 < 0 || cCharAt3 >= 128) ? Character.toLowerCase(cCharAt3) : cCharAt3 : (char) (cCharAt3 + ControlChar.SPACE_CHAR)) != cCharAt3) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                StringBuilder sb = new StringBuilder(strSubstring.length());
                sb.append((CharSequence) strSubstring, 0, i11);
                int iOooo000 = C33599OooOo0O.Oooo000(strSubstring);
                if (i11 <= iOooo000) {
                    while (true) {
                        char cCharAt4 = strSubstring.charAt(i11);
                        if (c <= cCharAt4 && cCharAt4 < '[') {
                            cCharAt4 = (char) (cCharAt4 + ControlChar.SPACE_CHAR);
                        } else if (cCharAt4 < 0 || cCharAt4 >= 128) {
                            cCharAt4 = Character.toLowerCase(cCharAt4);
                        }
                        sb.append(cCharAt4);
                        if (i11 == iOooo000) {
                            break;
                        }
                        i11++;
                        c = 'A';
                    }
                }
                strSubstring = sb.toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "StringBuilder(capacity).…builderAction).toString()");
            }
            Oooo0 oooo02 = (Oooo0) Oooo0.f115582OooO0Oo.get(strSubstring);
            if (oooo02 == null) {
                oooo02 = new Oooo0(strSubstring, 0);
            }
            c32200OooOooO.f115571OooO00o = oooo02;
            i8 += i4 + 1;
        }
        int i12 = 0;
        while (true) {
            i5 = i8 + i12;
            if (i5 >= i10 || urlString.charAt(i5) != '/') {
                break;
            } else {
                i12++;
            }
        }
        if (c32200OooOooO.f115571OooO00o.f115583OooO00o.equals("file")) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException("Invalid file url: ".concat(urlString));
                }
                c32200OooOooO.f115572OooO0O0 = "";
                String strSubstring2 = urlString.substring(i5, i10);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                OoooO0O.OooOo.OooOOOo(c32200OooOooO, "/".concat(strSubstring2));
                return;
            }
            int iOooo0 = C33599OooOo0O.Oooo0(urlString, IOUtils.DIR_SEPARATOR_UNIX, i5, 4);
            if (iOooo0 == -1 || iOooo0 == i10) {
                String strSubstring3 = urlString.substring(i5, i10);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                c32200OooOooO.f115572OooO0O0 = strSubstring3;
                return;
            } else {
                String strSubstring4 = urlString.substring(i5, iOooo0);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                c32200OooOooO.f115572OooO0O0 = strSubstring4;
                String strSubstring5 = urlString.substring(iOooo0, i10);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
                OoooO0O.OooOo.OooOOOo(c32200OooOooO, strSubstring5);
                return;
            }
        }
        if (c32200OooOooO.f115571OooO00o.f115583OooO00o.equals("mailto")) {
            if (i12 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int iOooo0O0 = C33599OooOo0O.Oooo0O0(urlString, "@", i5, false, 4);
            if (iOooo0O0 == -1) {
                throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Invalid mailto url: ", urlString, ", it should contain '@'."));
            }
            String strSubstring6 = urlString.substring(i5, iOooo0O0);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring6, "this as java.lang.String…ing(startIndex, endIndex)");
            String strOooO0Oo = OooO0O0.OooO0Oo(strSubstring6);
            c32200OooOooO.f115576OooO0o0 = strOooO0Oo != null ? OooO0O0.OooO0o(strOooO0Oo, false) : null;
            String strSubstring7 = urlString.substring(iOooo0O0 + 1, i10);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring7, "this as java.lang.String…ing(startIndex, endIndex)");
            c32200OooOooO.f115572OooO0O0 = strSubstring7;
            return;
        }
        if (i12 >= 2) {
            while (true) {
                int iOooo0OO = C33599OooOo0O.Oooo0OO(urlString, C21294OooOO0O.OooO0o("@/\\?#"), i5, false);
                Integer numValueOf = Integer.valueOf(iOooo0OO);
                if (iOooo0OO <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i10;
                if (iIntValue >= i10 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iOooO00o = OooO00o(i5, iIntValue, urlString);
                if (iOooO00o != -1) {
                    String strSubstring8 = urlString.substring(i5, iOooO00o);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring8, "this as java.lang.String…ing(startIndex, endIndex)");
                    c32200OooOooO.f115576OooO0o0 = strSubstring8;
                    String strSubstring9 = urlString.substring(iOooO00o + 1, iIntValue);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring9, "this as java.lang.String…ing(startIndex, endIndex)");
                    c32200OooOooO.f115575OooO0o = strSubstring9;
                } else {
                    String strSubstring10 = urlString.substring(i5, iIntValue);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring10, "this as java.lang.String…ing(startIndex, endIndex)");
                    c32200OooOooO.f115576OooO0o0 = strSubstring10;
                }
                i5 = iIntValue + 1;
            }
            int iOooO00o2 = OooO00o(i5, iIntValue, urlString);
            Integer numValueOf2 = Integer.valueOf(iOooO00o2);
            if (iOooO00o2 <= 0) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
            String strSubstring11 = urlString.substring(i5, iIntValue2);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring11, "this as java.lang.String…ing(startIndex, endIndex)");
            c32200OooOooO.f115572OooO0O0 = strSubstring11;
            int i13 = iIntValue2 + 1;
            if (i13 < iIntValue) {
                String strSubstring12 = urlString.substring(i13, iIntValue);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring12, "this as java.lang.String…ing(startIndex, endIndex)");
                c32200OooOooO.f115573OooO0OO = Integer.parseInt(strSubstring12);
            } else {
                c32200OooOooO.f115573OooO0OO = 0;
            }
            i5 = iIntValue;
        }
        List<String> list = C34434OooOoO.f123453OooOo0o;
        List<String> list2 = f115586OooO00o;
        if (i5 >= i10) {
            if (urlString.charAt(length2) == '/') {
                list = list2;
            }
            kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<set-?>");
            c32200OooOooO.f115578OooO0oo = list;
            return;
        }
        c32200OooOooO.f115578OooO0oo = i12 == 0 ? oOo000Oo.OooOo.Oooo0OO(c32200OooOooO.f115578OooO0oo) : list;
        int iOooo0OO2 = C33599OooOo0O.Oooo0OO(urlString, C21294OooOO0O.OooO0o("?#"), i5, false);
        Integer numValueOf3 = Integer.valueOf(iOooo0OO2);
        if (iOooo0OO2 <= 0) {
            numValueOf3 = null;
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i10;
        if (iIntValue3 > i5) {
            String strSubstring13 = urlString.substring(i5, iIntValue3);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring13, "this as java.lang.String…ing(startIndex, endIndex)");
            List<String> list3 = (c32200OooOooO.f115578OooO0oo.size() == i3 && ((CharSequence) oOo000Oo.OooOo.Oooo0oO(c32200OooOooO.f115578OooO0oo)).length() == 0) ? list : c32200OooOooO.f115578OooO0oo;
            if (strSubstring13.equals("/")) {
                listO000oOoO = list2;
                i6 = 1;
            } else {
                i6 = 1;
                listO000oOoO = C33599OooOo0O.o000oOoO(strSubstring13, new char[]{IOUtils.DIR_SEPARATOR_UNIX});
            }
            if (i12 == i6) {
                list = list2;
            }
            c32200OooOooO.f115578OooO0oo = oOo000Oo.OooOo.OooooOO(list3, oOo000Oo.OooOo.OooooOO(list, listO000oOoO));
            i5 = iIntValue3;
        }
        if (i5 < i10 && urlString.charAt(i5) == '?') {
            int i14 = i5 + 1;
            if (i14 == i10) {
                c32200OooOooO.f115574OooO0Oo = true;
                i5 = i10;
            } else {
                int iOooo02 = C33599OooOo0O.Oooo0(urlString, '#', i14, 4);
                Integer numValueOf4 = iOooo02 > 0 ? Integer.valueOf(iOooo02) : null;
                int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i10;
                String strSubstring14 = urlString.substring(i14, iIntValue4);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring14, "this as java.lang.String…ing(startIndex, endIndex)");
                C32198OooOoo.OooO0O0(strSubstring14).OooO00o(new C32203Oooo00O(c32200OooOooO));
                i5 = iIntValue4;
            }
        }
        if (i5 >= i10 || urlString.charAt(i5) != '#') {
            return;
        }
        String strSubstring15 = urlString.substring(i5 + 1, i10);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring15, "this as java.lang.String…ing(startIndex, endIndex)");
        c32200OooOooO.f115577OooO0oO = strSubstring15;
    }
}
