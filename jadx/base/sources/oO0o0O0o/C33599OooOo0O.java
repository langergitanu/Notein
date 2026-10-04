package oO0o0O0o;

import Oooo0oO.o0Oo0oo;
import com.aspose.words.ControlChar;
import com.facebook.soloader.OooOo;
import io.ktor.utils.p616io.Oooo000;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O00oo.C32519OooO0oO;
import oO0o0O0O.C33573OooOOO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oO0o0O0o.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33599OooOo0O extends C33595OooOOo {
    public static boolean OooOoOO(CharSequence charSequence, CharSequence other, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        if (other instanceof String) {
            if (Oooo0O0(charSequence, (String) other, 0, z, 2) >= 0) {
                return true;
            }
        } else if (Oooo00o(charSequence, other, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean OooOoo0(CharSequence charSequence, char c) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        return Oooo0(charSequence, c, 0, 2) >= 0;
    }

    public static boolean OooOooO(CharSequence charSequence, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        return charSequence instanceof String ? C33595OooOOo.OooOOo0((String) charSequence, str, false) : OoooO00(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean OooOooo(String str, char c) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        return str.length() > 0 && Oooo000.OooO0OO(str.charAt(Oooo000(str)), c, false);
    }

    public static String Oooo(int i, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static int Oooo0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        return !(charSequence instanceof String) ? Oooo0OO(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static int Oooo000(CharSequence charSequence) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Oooo00O(CharSequence charSequence, String string, int i, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(string, "string");
        return (z || !(charSequence instanceof String)) ? Oooo00o(charSequence, string, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(string, i);
    }

    public static final int Oooo00o(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C32519OooO0oO c32519OooO0oO;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iOooo000 = Oooo000(charSequence);
            if (i3 > iOooo000) {
                i3 = iOooo000;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            c32519OooO0oO = new C32519OooO0oO(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            c32519OooO0oO = new oO0O00oo.OooO(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = c32519OooO0oO.f116813OooOoO0;
        int i6 = c32519OooO0oO.f116811OooOo;
        int i7 = c32519OooO0oO.f116812OooOo0o;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    if (!C33595OooOOo.OooOOoo(str, 0, (String) charSequence, i8, str.length(), z)) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!OoooO00(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static /* synthetic */ int Oooo0O0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Oooo00O(charSequence, str, i, z);
    }

    public static final int Oooo0OO(CharSequence charSequence, char[] cArr, int i, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iOooo000 = Oooo000(charSequence);
        if (i > iOooo000) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (Oooo000.OooO0OO(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iOooo000) {
                return -1;
            }
            i++;
        }
    }

    public static int Oooo0o(int i, String str, String string) {
        int iOooo000 = (i & 2) != 0 ? Oooo000(str) : 0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(string, "string");
        return str.lastIndexOf(string, iOooo000);
    }

    public static boolean Oooo0o0(CharSequence charSequence) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!Oooo000.OooO0o0(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int Oooo0oO(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = Oooo000(str);
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    public static String Oooo0oo(int i, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(ControlChar.SPACE_CHAR);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final List OoooO(CharSequence charSequence, String str) {
        int iOooo00O = Oooo00O(charSequence, str, 0, false);
        if (iOooo00O == -1) {
            return OooOo.OooO0oO(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iOooo00O).toString());
            length = str.length() + iOooo00O;
            iOooo00O = Oooo00O(charSequence, str, length, false);
        } while (iOooo00O != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static String OoooO0(String str, String str2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (!OoooOOO(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean OoooO00(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!Oooo000.OooO0OO(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String OoooO0O(String str, String str2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (!OooOooO(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static List OoooOO0(CharSequence charSequence, String[] strArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return OoooO(charSequence, str);
            }
        }
        final List listOooO0Oo = Oooo.OooO0OO.OooO0Oo(strArr);
        C33581OooO0O0 c33581OooO0O0 = new C33581OooO0O0(charSequence, new InterfaceC32508OooOOOo() { // from class: oO0o0O0o.OooOo00
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0030 A[EDGE_INSN: B:53:0x0030->B:6:0x0030 BREAK  A[LOOP:0: B:18:0x005c->B:29:0x0090]] */
            @Override // oO0O000o.InterfaceC32508OooOOOo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj, Object obj2) {
                int i;
                Object next;
                C32443OooOOO c32443OooOOO;
                Object next2;
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = listOooO0Oo;
                if (list.size() == 1) {
                    String str2 = (String) oOo000Oo.OooOo.Oooooo(list);
                    int iOooo0O0 = C33599OooOo0O.Oooo0O0(DelimitedRangesSequence, str2, iIntValue, false, 4);
                    c32443OooOOO = iOooo0O0 < 0 ? null : new C32443OooOOO(Integer.valueOf(iOooo0O0), str2);
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    oO0O00oo.OooO oooO = new oO0O00oo.OooO(iIntValue, DelimitedRangesSequence.length(), 1);
                    boolean z = DelimitedRangesSequence instanceof String;
                    int i2 = oooO.f116813OooOoO0;
                    int i3 = oooO.f116811OooOo;
                    if (z) {
                        if ((i2 > 0 && iIntValue <= i3) || (i2 < 0 && i3 <= iIntValue)) {
                            int i4 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it.next();
                                    String str3 = (String) next2;
                                    if (C33595OooOOo.OooOOoo(str3, 0, (String) DelimitedRangesSequence, i4, str3.length(), false)) {
                                        break;
                                    }
                                }
                                String str4 = (String) next2;
                                if (str4 == null) {
                                    if (i4 == i3) {
                                        break;
                                    }
                                    i4 += i2;
                                } else {
                                    c32443OooOOO = new C32443OooOOO(Integer.valueOf(i4), str4);
                                    break;
                                }
                            }
                        }
                    } else if ((i2 > 0 && iIntValue <= i3) || (i2 < 0 && i3 <= iIntValue)) {
                        int i5 = iIntValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    i = i3;
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                String str5 = (String) next;
                                i = i3;
                                if (C33599OooOo0O.OoooO00(str5, 0, DelimitedRangesSequence, i5, str5.length(), false)) {
                                    break;
                                }
                                i3 = i;
                            }
                            String str6 = (String) next;
                            if (str6 == null) {
                                if (i5 == i) {
                                    break;
                                }
                                i5 += i2;
                                i3 = i;
                            } else {
                                c32443OooOOO = new C32443OooOOO(Integer.valueOf(i5), str6);
                                break;
                            }
                        }
                    }
                }
                if (c32443OooOOO != null) {
                    return new C32443OooOOO(c32443OooOOO.f116638OooOo0o, Integer.valueOf(((String) c32443OooOOO.f116637OooOo).length()));
                }
                return null;
            }
        });
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(new C33573OooOOO(c33581OooO0O0), 10));
        for (oO0O00oo.OooO range : c33581OooO0O0) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(range, "range");
            arrayList.add(charSequence.subSequence(range.f116812OooOo0o, range.f116811OooOo + 1).toString());
        }
        return arrayList;
    }

    public static boolean OoooOOO(CharSequence charSequence, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        return charSequence instanceof String ? C33595OooOOo.OooOoO0((String) charSequence, str, false) : OoooO00(charSequence, 0, str, 0, str.length(), false);
    }

    public static boolean OoooOOo(String str, char c) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        return str.length() > 0 && Oooo000.OooO0OO(str.charAt(0), c, false);
    }

    public static String OoooOo0(char c, String str, String str2) {
        int iOooo0 = Oooo0(str, c, 0, 6);
        if (iOooo0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iOooo0 + 1, str.length());
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String OoooOoO(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(delimiter, "delimiter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(missingDelimiterValue, "missingDelimiterValue");
        int iOooo0O0 = Oooo0O0(str, delimiter, 0, false, 6);
        if (iOooo0O0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iOooo0O0, str.length());
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String OoooOoo(char c, String str, String missingDelimiterValue) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(missingDelimiterValue, "missingDelimiterValue");
        int iOooo0oO = Oooo0oO(str, c, 0, 6);
        if (iOooo0oO == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iOooo0oO + 1, str.length());
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Ooooo00(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(missingDelimiterValue, "missingDelimiterValue");
        int iOooo0o = Oooo0o(6, missingDelimiterValue, str);
        if (iOooo0o == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(str.length() + iOooo0o, missingDelimiterValue.length());
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Ooooo0o(String missingDelimiterValue, char c) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(missingDelimiterValue, "missingDelimiterValue");
        int iOooo0 = Oooo0(missingDelimiterValue, c, 0, 6);
        if (iOooo0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iOooo0);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String OooooO0(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(missingDelimiterValue, "missingDelimiterValue");
        int iOooo0O0 = Oooo0O0(missingDelimiterValue, str, 0, false, 6);
        if (iOooo0O0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iOooo0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String OooooOO(String str, String str2, String missingDelimiterValue) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(missingDelimiterValue, "missingDelimiterValue");
        int iOooo0o = Oooo0o(6, str, str2);
        if (iOooo0o == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iOooo0o);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence Oooooo0(CharSequence charSequence) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zOooO0o0 = Oooo000.OooO0o0(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zOooO0o0) {
                    break;
                }
                length--;
            } else if (zOooO0o0) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static List o000oOoO(String str, final char[] cArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (cArr.length == 1) {
            return OoooO(str, String.valueOf(cArr[0]));
        }
        C33581OooO0O0 c33581OooO0O0 = new C33581OooO0O0(str, new InterfaceC32508OooOOOo() { // from class: oO0o0O0o.OooOOoo
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iOooo0OO = C33599OooOo0O.Oooo0OO(DelimitedRangesSequence, cArr, iIntValue, false);
                if (iOooo0OO < 0) {
                    return null;
                }
                return new C32443OooOOO(Integer.valueOf(iOooo0OO), 1);
            }
        });
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(new C33573OooOOO(c33581OooO0O0), 10));
        for (oO0O00oo.OooO range : c33581OooO0O0) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(range, "range");
            arrayList.add(str.subSequence(range.f116812OooOo0o, range.f116811OooOo + 1).toString());
        }
        return arrayList;
    }
}
