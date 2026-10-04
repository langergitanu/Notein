package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.ControlChar;
import java.text.MessageFormat;

/* JADX INFO: loaded from: classes5.dex */
public class zzZKN {
    static final /* synthetic */ boolean zzVr = true;
    static final char[] zzZPi = {'\t', '\n', ControlChar.LINE_BREAK_CHAR, '\f', ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.SPACE_CHAR, 133, ControlChar.NON_BREAKING_SPACE_CHAR, 5760, 8192, 8193, ControlChar.DEFAULT_TEXT_INPUT_CHAR, 8195, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8203, 8232, 8233, 12288, 65279};

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZKN$1 */
    public static /* synthetic */ class C158801 {
        static final /* synthetic */ int[] zzZPh;

        static {
            int[] iArr = new int[zzZOF.zzim().length];
            zzZPh = iArr;
            try {
                iArr[zzZOF.CURRENT_CULTURE$4894b8c8 - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzZPh[zzZOF.INVARIANT_CULTURE$4894b8c8 - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzZPh[zzZOF.ORDINAL$4894b8c8 - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzZPh[zzZOF.CURRENT_CULTURE_IGNORE_CASE$4894b8c8 - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzZPh[zzZOF.INVARIANT_CULTURE_IGNORE_CASE$4894b8c8 - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zzZPh[zzZOF.ORDINAL_IGNORE_CASE$4894b8c8 - 1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private zzZKN() {
    }

    private static int compare(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return zzZHT.zzct().compare(str, str2);
    }

    public static boolean equals(String str, String str2) {
        if (str == str2) {
            return true;
        }
        return (str == null || str2 == null || !str.equals(str2)) ? false : true;
    }

    public static String format(String str, Object... objArr) {
        if (str == null) {
            throw new IllegalArgumentException("format");
        }
        if (objArr == null) {
            objArr = new Object[]{null};
        }
        StringBuilder sb = new StringBuilder((objArr.length * 8) + str.length());
        zzZNH.zzZ(sb, str, objArr);
        return sb.toString();
    }

    public static String zzO(String... strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (str == null) {
                str = "";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String zzQ(String str, char c) {
        if (str == null) {
            str = "";
        }
        return str + c;
    }

    public static String[] zzR(String str, char c) {
        int[] iArr = new int[str.length()];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == c) {
                iArr[i2] = i3;
                i2++;
            }
        }
        String[] strArr = new String[i2 + 1];
        if (i2 == 0) {
            strArr[0] = str;
            return strArr;
        }
        int i4 = 0;
        int i5 = 0;
        while (i < i2) {
            int i6 = iArr[i];
            strArr[i4] = str.substring(i5, i6);
            i5 = i6 + 1;
            i++;
            i4++;
        }
        strArr[i4] = str.substring(i5, str.length());
        return strArr;
    }

    public static String zzS(char c, int i) {
        if (!zzVr && i < 0) {
            throw new AssertionError(C21532OooOOo.OooO0OO(i, "count must be greater than zero, but count = "));
        }
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    private static int zzT(String str, String str2, boolean z) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return (z ? zzZHT.zzcq() : zzZHT.zzcr()).compare(str, str2);
    }

    public static String zzTX(String str) {
        return zzV(str, zzZPi);
    }

    public static String zzTY(String str) {
        return zzW(str, zzZPi);
    }

    public static String zzTZ(String str) {
        return zzX(str, zzZPi);
    }

    private static int zzU(String str, String str2, boolean z) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return z ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    private static String zzU0(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }

    public static String zzU1(String str) {
        if (str == null) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = zzZKU.zzZK(charArray[i]);
        }
        return new String(charArray);
    }

    public static String zzU2(String str) {
        if (str == null) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = zzZKU.zzZJ(charArray[i]);
        }
        return new String(charArray);
    }

    public static boolean zzU3(String str) {
        return str == null || str.isEmpty();
    }

    public static int zzV(String str, String str2, int i) {
        switch (C158801.zzZPh[i - 1]) {
            case 1:
            case 2:
            case 3:
                return str.lastIndexOf(str2);
            case 4:
            case 5:
            case 6:
                return str.toLowerCase().lastIndexOf(str2.toLowerCase());
            default:
                return str.lastIndexOf(str2);
        }
    }

    public static boolean zzW(String str, String str2, int i) {
        switch (C158801.zzZPh[i - 1]) {
            case 1:
            case 2:
            case 3:
                return str.endsWith(str2);
            case 4:
            case 5:
            case 6:
                return str.toLowerCase().endsWith(str2.toLowerCase());
            default:
                return str.endsWith(str2);
        }
    }

    public static boolean zzX(String str, String str2, int i) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        switch (C158801.zzZPh[i - 1]) {
            case 1:
            case 2:
            case 3:
                return str.equals(str2);
            case 4:
            case 5:
            case 6:
                return str.toLowerCase().equals(str2.toLowerCase());
            default:
                return str.equals(str2);
        }
    }

    public static int zzY(String str, String str2, int i, int i2) {
        switch (C158801.zzZPh[i2 - 1]) {
            case 1:
            case 2:
            case 3:
                return str.lastIndexOf(str2, i);
            case 4:
            case 5:
            case 6:
                return str.toLowerCase().lastIndexOf(str2.toLowerCase(), i);
            default:
                return str.lastIndexOf(str2, i);
        }
    }

    public static int zzZ(String str, int i, String str2, int i2, int i3) {
        switch (C158801.zzZPh[i3 - 1]) {
            case 1:
                return zzZ(str, i, str2, 0, i2, false);
            case 2:
                return zzX(str, i, str2, 0, i2, false);
            case 3:
                return zzY(str, i, str2, 0, i2, false);
            case 4:
                return zzZ(str, i, str2, 0, i2, true);
            case 5:
                return zzX(str, i, str2, 0, i2, true);
            case 6:
                return zzY(str, i, str2, 0, i2, true);
            default:
                return zzZ(str, i, str2, 0, i2, false);
        }
    }

    public static String zzZI(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return str.concat(str2);
    }

    public static int zzZJ(String str, String str2) {
        return zzU(str, str2, false);
    }

    private static String zzl(String str, int i) {
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int length = str.length(); length < i; length++) {
            sb.append(ControlChar.SPACE_CHAR);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String zzm(String str, int i) {
        return zzl(str, i);
    }

    public static String zzn(String str, int i) {
        if (i < 0 || i >= str.length()) {
            throw new IndexOutOfBoundsException(MessageFormat.format("String length = {0}, but startIndex = {1}", Integer.valueOf(str.length()), Integer.valueOf(i)));
        }
        return str.substring(0, i);
    }

    public static int zzU(String str, String str2, int i) {
        switch (C158801.zzZPh[i - 1]) {
            case 1:
                return zzV(str, str2, false);
            case 2:
                return zzT(str, str2, false);
            case 3:
                return zzU(str, str2, false);
            case 4:
                return zzV(str, str2, true);
            case 5:
                return zzT(str, str2, true);
            case 6:
                return zzU(str, str2, true);
            default:
                return zzV(str, str2, false);
        }
    }

    public static String zzT(String str, int i, int i2) {
        int length = str.length();
        int i3 = i + i2;
        if (i3 <= length) {
            int i4 = length - i2;
            char[] cArr = new char[i4];
            char[] charArray = str.toCharArray();
            System.arraycopy(charArray, 0, cArr, 0, i);
            System.arraycopy(charArray, i3, cArr, i, i4 - i);
            return new String(cArr);
        }
        throw new IndexOutOfBoundsException(MessageFormat.format("String length = {0}, but startIndex = {1} and count = {2}", Integer.valueOf(str.length()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static int zzV(String str, String str2, boolean z) {
        if (!z) {
            return compare(str, str2);
        }
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return zzZHT.zzcs().compare(str, str2);
    }

    public static int zzW(String str, String str2, int i, int i2) {
        switch (C158801.zzZPh[i2 - 1]) {
            case 1:
            case 2:
            case 3:
                return str.indexOf(str2, i);
            case 4:
            case 5:
            case 6:
                return str.toLowerCase().indexOf(str2.toLowerCase(), i);
            default:
                return str.indexOf(str2, i);
        }
    }

    private static int zzX(String str, int i, String str2, int i2, int i3, boolean z) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        int length = str.length() - i < i3 ? str.length() - i : i3;
        if (str2.length() < i3) {
            i3 = str2.length();
        }
        return zzT(str.substring(i, length + i), str2.substring(0, i3), z);
    }

    private static int zzY(String str, int i, String str2, int i2, int i3, boolean z) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        int length = str.length() - i < i3 ? str.length() - i : i3;
        if (str2.length() < i3) {
            i3 = str2.length();
        }
        return zzU(str.substring(i, length + i), str2.substring(0, i3), z);
    }

    public static String zzV(String str, int i, String str2) {
        if (i <= str.length()) {
            return new StringBuilder(str).insert(i, str2).toString();
        }
        throw new IndexOutOfBoundsException(MessageFormat.format("String length = {0}, but startIndex = {1}", Integer.valueOf(str.length()), Integer.valueOf(i)));
    }

    public static String zzW(String str, char... cArr) {
        int length = str.length();
        while (length > 0 && zzY(cArr, str.charAt(length - 1))) {
            length--;
        }
        return length < str.length() ? str.substring(0, length) : str;
    }

    public static int zzZ(String str, int i, String str2, int i2, int i3, boolean z) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        int length = str.length() - i < i3 ? str.length() - i : i3;
        if (str2.length() < i3) {
            i3 = str2.length();
        }
        return zzV(str.substring(i, length + i), str2.substring(0, i3), z);
    }

    public static String zzU(String str, char c) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) == c) {
            i++;
        }
        return i > 0 ? str.substring(i) : str;
    }

    public static String zzS(String str, char c) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) == c) {
            i++;
        }
        while (i < length && str.charAt(length - 1) == c) {
            length--;
        }
        return (i > 0 || length < str.length()) ? str.substring(i, length) : str;
    }

    public static String zzV(String str, char... cArr) {
        int length = str.length();
        int i = 0;
        while (i < length && zzY(cArr, str.charAt(i))) {
            i++;
        }
        while (i < length && zzY(cArr, str.charAt(length - 1))) {
            length--;
        }
        return (i > 0 || length < str.length()) ? str.substring(i, length) : str;
    }

    private static int zzX(String str, String str2, int i, int i2) {
        int length = str2.length();
        if (str.length() == 0) {
            return length == 0 ? 0 : -1;
        }
        char cCharAt = str2.charAt(0);
        int i3 = (i2 - length) + i;
        while (i <= i3) {
            if (str.charAt(i) != cCharAt) {
                do {
                    i++;
                    if (i > i3) {
                        break;
                    }
                } while (str.charAt(i) != cCharAt);
            }
            if (i <= i3) {
                int i4 = i + 1;
                int i5 = (i4 + length) - 1;
                for (int i6 = 1; i4 < i5 && str.charAt(i4) == str2.charAt(i6); i6++) {
                    i4++;
                }
                if (i4 == i5) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    public static int zzY(String str, int i, String str2, int i2) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        int length = str.length() - i;
        if (length > i2) {
            length = i2;
        }
        int length2 = str2.length();
        if (length2 <= i2) {
            i2 = length2;
        }
        int iMin = Math.min(length, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            char cCharAt = str.charAt(i3 + i);
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt != cCharAt2) {
                return cCharAt - cCharAt2;
            }
        }
        return length - i2;
    }

    public static int zzT(String str, String str2, int i) {
        switch (C158801.zzZPh[i - 1]) {
            case 1:
            case 2:
            case 3:
                return str.indexOf(str2);
            case 4:
            case 5:
            case 6:
                return str.toLowerCase().indexOf(str2.toLowerCase());
            default:
                return str.indexOf(str2);
        }
    }

    public static String[] zzU(String str, char[] cArr) {
        return zzY(str, cArr, Integer.MAX_VALUE, zzZOE.NONE$77a9e2fd);
    }

    public static boolean zzS(String str, String str2, int i) {
        return zzT(str, str2, i) == 0;
    }

    public static String zzZ(String str, zzZP1 zzzp1) {
        if ("de_DE".equals(zzzp1.getLocale().toString())) {
            return zzU0(str);
        }
        return str.toUpperCase(zzzp1.getLocale());
    }

    public static String zzT(String str, char c) {
        int length = str.length();
        while (length > 0 && str.charAt(length - 1) == c) {
            length--;
        }
        return length < str.length() ? str.substring(0, length) : str;
    }

    public static String zzY(String str, zzZP1 zzzp1) {
        return str.toLowerCase(zzzp1.getLocale());
    }

    public static String zzX(String str, char[] cArr) {
        int length = str.length();
        int i = 0;
        while (i < length && zzY(cArr, str.charAt(i))) {
            i++;
        }
        return i > 0 ? str.substring(i) : str;
    }

    public static int zzY(String str, char[] cArr) {
        if (str != null && str.length() > 0 && cArr != null && cArr.length > 0) {
            for (int length = str.length() - 1; length >= 0; length--) {
                for (char c : cArr) {
                    if (str.charAt(length) == c) {
                        return length;
                    }
                }
            }
        }
        return -1;
    }

    public static void zzZ(String str, int i, char[] cArr, int i2, int i3) {
        str.getChars(i, i3 + i, cArr, i2);
    }

    public static String[] zzT(String str, char[] cArr) {
        return zzY(str, cArr, 2, zzZOE.NONE$77a9e2fd);
    }

    public static int zzZ(String str, char c, int i, int i2) {
        return zzX(str, String.valueOf(c), i, i2);
    }

    public static int zzZ(String str, String str2, int i, int i2, int i3) {
        switch (C158801.zzZPh[i3 - 1]) {
            case 1:
            case 2:
            case 3:
                return zzX(str, str2, i, i2);
            case 4:
            case 5:
            case 6:
                return zzX(str.toLowerCase(), str2.toLowerCase(), i, i2);
            default:
                return zzX(str, str2, i, i2);
        }
    }

    private static boolean zzY(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public static String zzY(String str, String[] strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : strArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    public static int zzZ(String str, char[] cArr) {
        return zzZ(str, cArr, 0);
    }

    public static int zzZ(String str, char[] cArr, int i) {
        return zzZ(str, cArr, i, str.length() - i);
    }

    public static int zzZ(String str, char[] cArr, int i, int i2) {
        if (str.length() > 0 && cArr.length > 0 && i >= 0) {
            for (int i3 = i; i3 < i + i2; i3++) {
                char cCharAt = str.charAt(i3);
                for (char c : cArr) {
                    if (c == cCharAt) {
                        return i3;
                    }
                }
            }
        }
        return -1;
    }

    public static String[] zzY(String str, char[] cArr, int i) {
        return zzY(str, cArr, Integer.MAX_VALUE, i);
    }

    private static String[] zzY(String str, char[] cArr, int i, int i2) {
        if (!zzVr && i < 0) {
            throw new AssertionError();
        }
        boolean z = i2 == zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd;
        if (i != 0 && (!z || str.length() != 0)) {
            int[] iArr = new int[str.length()];
            int iZzZ = zzZ(str, cArr, iArr);
            if (iZzZ == 0 || i == 1) {
                return new String[]{str};
            }
            if (z) {
                return zzZ(str, iArr, (int[]) null, iZzZ, i);
            }
            return zzY(str, iArr, null, iZzZ, i);
        }
        return new String[0];
    }

    private static int zzZ(String str, char[] cArr, int[] iArr) {
        if (cArr != null && cArr.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < str.length() && i < iArr.length; i2++) {
                int i3 = 0;
                while (true) {
                    if (i3 >= cArr.length) {
                        break;
                    }
                    if (str.charAt(i2) == cArr[i3]) {
                        iArr[i] = i2;
                        i++;
                        break;
                    }
                    i3++;
                }
            }
            return i;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < str.length() && i4 < iArr.length; i5++) {
            if (zzZKU.zzG(str.charAt(i5))) {
                iArr[i4] = i5;
                i4++;
            }
        }
        return i4;
    }

    public static String[] zzZ(String str, String[] strArr, int i) {
        return zzY(str, strArr, i);
    }

    private static String[] zzY(String str, String[] strArr, int i) {
        boolean z = i == zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd;
        if (z && str.length() == 0) {
            return new String[0];
        }
        if (strArr != null && strArr.length != 0) {
            int[] iArr = new int[str.length()];
            int[] iArr2 = new int[str.length()];
            int iZzZ = zzZ(str, strArr, iArr, iArr2);
            if (iZzZ == 0) {
                return new String[]{str};
            }
            if (z) {
                return zzZ(str, iArr, iArr2, iZzZ, Integer.MAX_VALUE);
            }
            return zzY(str, iArr, iArr2, iZzZ, Integer.MAX_VALUE);
        }
        return zzU(str, (char[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzZ(String str, String[] strArr, int[] iArr, int[] iArr2) {
        String str2;
        if (!zzVr && (strArr == null || strArr.length <= 0)) {
            throw new AssertionError();
        }
        int i = 0;
        int i2 = 0;
        while (i < str.length() && i2 < iArr.length) {
            int i3 = 0;
            while (i3 < strArr.length) {
                String str3 = strArr[i3];
                if (!zzU3(str3)) {
                    int length = str3.length();
                    if (str.charAt(i) == str3.charAt(0) && length <= str.length() - i) {
                        if (length != 1) {
                            str2 = str;
                            if (zzZ(str2, i, str3, 0, length, false) == 0) {
                            }
                        } else {
                            str2 = str;
                        }
                        iArr[i2] = i;
                        iArr2[i2] = length;
                        i2++;
                        i += length - 1;
                        break;
                    }
                    str2 = str;
                }
                i3++;
                str = str2;
            }
            str2 = str;
            i++;
            str = str2;
        }
        return i2;
    }

    private static String[] zzZ(String str, int[] iArr, int[] iArr2, int i, int i2) {
        if (!zzVr && i2 < 2) {
            throw new AssertionError();
        }
        int i3 = i < i2 ? i + 1 : i2;
        String[] strArr = new String[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            int i7 = iArr[i4];
            if (i7 - i5 > 0) {
                strArr[i6] = str.substring(i5, i7);
                i6++;
            }
            int i8 = i7 + (iArr2 == null ? 1 : iArr2[i4]);
            if (i6 == i2 - 1) {
                while (i4 < i - 1) {
                    i4++;
                    if (i8 != iArr[i4]) {
                        break;
                    }
                    i8 += iArr2 == null ? 1 : iArr2[i4];
                }
                i5 = i8;
            } else {
                i4++;
                i5 = i8;
            }
        }
        if (!zzVr && i6 >= i3) {
            throw new AssertionError();
        }
        if (i5 < str.length()) {
            strArr[i6] = str.substring(i5);
            i6++;
        }
        if (i6 == i3) {
            return strArr;
        }
        String[] strArr2 = new String[i6];
        System.arraycopy(strArr, 0, strArr2, 0, i6);
        return strArr2;
    }

    private static String[] zzY(String str, int[] iArr, int[] iArr2, int i, int i2) {
        if (!zzVr && i2 < 2) {
            throw new AssertionError();
        }
        int i3 = i2 - 1;
        if (i >= i3) {
            i = i3;
        }
        String[] strArr = new String[i + 1];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i && i5 < str.length()) {
            int i7 = i6 + 1;
            strArr[i6] = str.substring(i5, iArr[i4]);
            i5 = iArr[i4] + (iArr2 == null ? 1 : iArr2[i4]);
            i4++;
            i6 = i7;
        }
        if (i5 < str.length() && i >= 0) {
            strArr[i6] = str.substring(i5);
            return strArr;
        }
        if (i6 == i) {
            strArr[i6] = "";
        }
        return strArr;
    }

    public static String zzZ(String str, char c, char c2) {
        return str.replace(c, c2);
    }
}
