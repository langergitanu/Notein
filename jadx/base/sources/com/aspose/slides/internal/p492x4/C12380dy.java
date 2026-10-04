package com.aspose.slides.internal.p492x4;

import com.aspose.slides.C22210OooOo0o;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p189iq.C5113k4;
import com.aspose.slides.p559ms.System.C14057f9;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.aspose.slides.internal.x4.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12380dy {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f41367k4 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 3, 4, 0, 0, 0, 4, 4, 5, 5, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 4, 0, 0, 0};

    /* JADX INFO: renamed from: kk */
    private String f41368kk;

    /* JADX INFO: renamed from: x1 */
    private Pattern f41369x1;

    public C12380dy(String str) {
        this.f41368kk = str;
        this.f41369x1 = Pattern.compile(C5113k4.m21959k4(str), 32);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[LOOP:1: B:8:0x001e->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[SYNTHETIC] */
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m57967du(String str) {
        int i;
        int i2 = 0;
        while (i2 < str.length()) {
            if (m57976k4(str.charAt(i2))) {
                StringBuilder sb = new StringBuilder();
                char cCharAt = str.charAt(i2);
                sb.append((CharSequence) str, 0, i2);
                while (true) {
                    sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    switch (cCharAt) {
                        case '\t':
                            cCharAt = 't';
                            sb.append(cCharAt);
                            int i3 = i2 + 1;
                            for (i = i3; i < str.length(); i++) {
                                cCharAt = str.charAt(i);
                                if (m57976k4(cCharAt)) {
                                    sb.append((CharSequence) str, i3, i);
                                    if (i < str.length()) {
                                        return sb.toString();
                                    }
                                    i2 = i;
                                }
                                break;
                            }
                            sb.append((CharSequence) str, i3, i);
                            if (i < str.length()) {
                            }
                            break;
                        case '\n':
                            cCharAt = 'n';
                            sb.append(cCharAt);
                            int i32 = i2 + 1;
                            while (i < str.length()) {
                            }
                            sb.append((CharSequence) str, i32, i);
                            if (i < str.length()) {
                            }
                            break;
                        case 11:
                        default:
                            sb.append(cCharAt);
                            int i322 = i2 + 1;
                            while (i < str.length()) {
                            }
                            sb.append((CharSequence) str, i322, i);
                            if (i < str.length()) {
                            }
                            break;
                        case '\f':
                            cCharAt = 'f';
                            sb.append(cCharAt);
                            int i3222 = i2 + 1;
                            while (i < str.length()) {
                            }
                            sb.append((CharSequence) str, i3222, i);
                            if (i < str.length()) {
                            }
                            break;
                        case '\r':
                            cCharAt = 'r';
                            sb.append(cCharAt);
                            int i32222 = i2 + 1;
                            while (i < str.length()) {
                            }
                            sb.append((CharSequence) str, i32222, i);
                            if (i < str.length()) {
                            }
                            break;
                    }
                }
            } else {
                i2++;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12380dy m57968k4(Pattern pattern) {
        if (pattern == null) {
            return null;
        }
        return new C12380dy(pattern);
    }

    /* JADX INFO: renamed from: x1 */
    public static C12381h4 m57979x1(String str, String str2) {
        return m57969k4(new C12380dy(str2), str);
    }

    /* JADX INFO: renamed from: kk */
    public C12381h4 m57986kk(String str) {
        return m57969k4(this, str);
    }

    /* JADX INFO: renamed from: to */
    public boolean m57988to(String str) {
        return this.f41369x1.matcher(str).find();
    }

    public String toString() {
        return this.f41369x1.toString();
    }

    public C12380dy(String str, int i) {
        this.f41368kk = str;
        this.f41369x1 = Pattern.compile(C5113k4.m21959k4(str), i | 32);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12381h4 m57969k4(C12380dy c12380dy, String str) {
        C12381h4 c12381h4 = new C12381h4();
        int length = str.length();
        int iEnd = 0;
        while (iEnd < length) {
            C12385to c12385to = new C12385to(m57975k4(c12380dy), str, iEnd);
            if (!c12385to.mo58006to()) {
                break;
            }
            c12381h4.m57993k4(c12385to);
            iEnd = C12385to.m58001k4(c12385to).end();
            if (iEnd == c12385to.mo57994k4()) {
                break;
            }
        }
        return c12381h4;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m57978to(String str, String str2) {
        return m57977kk(str, str2, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public static C12381h4 m57980x1(String str, String str2, int i) {
        return m57969k4(new C12380dy(str2, i), str);
    }

    /* JADX INFO: renamed from: kk */
    public String m57987kk(String str, String str2) {
        if (str2 == null) {
            throw new ArgumentNullException("replacement");
        }
        C12385to c12385toM57989x1 = m57989x1(str);
        Matcher matcherM58001k4 = C12385to.m58001k4(c12385toM57989x1);
        if (c12385toM57989x1.mo58006to()) {
            str2 = m57974k4(str2, matcherM58001k4);
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (c12385toM57989x1.mo58006to()) {
            matcherM58001k4.appendReplacement(stringBuffer, str2);
            c12385toM57989x1 = c12385toM57989x1.m58005h4();
        }
        matcherM58001k4.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private C12380dy(Pattern pattern) {
        this.f41369x1 = pattern;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m57977kk(String str, String str2, int i) {
        return new C12380dy(str2, i).m57988to(str);
    }

    /* JADX INFO: renamed from: k4 */
    public C12385to m57981k4(String str, int i, int i2) {
        if (str == null) {
            throw new ArgumentNullException("input");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("beginning");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("length");
        }
        int i3 = i2 + i;
        if (i3 <= str.length()) {
            return new C12385to(this.f41369x1, str.substring(0, i3), i);
        }
        throw new IndexOutOfRangeException("beginning + length > input.length");
    }

    /* JADX INFO: renamed from: x1 */
    public C12385to m57989x1(String str) {
        return new C12385to(this.f41369x1, str);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12385to m57970k4(String str, String str2) {
        return C22210OooOo0o.OooO00o(str2, str);
    }

    /* JADX INFO: renamed from: x1 */
    public C12385to m57990x1(String str, int i) {
        return new C12385to(this.f41369x1, str, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12385to m57971k4(String str, String str2, int i) {
        return new C12380dy(str2, i).m57989x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public String m57982k4(String str, AbstractC12384m9 abstractC12384m9) {
        if (str == null) {
            throw new ArgumentNullException("input");
        }
        if (abstractC12384m9 == null) {
            throw new ArgumentNullException("evaluator");
        }
        C12385to c12385toM57989x1 = m57989x1(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (c12385toM57989x1.mo58006to()) {
            C12385to.m58001k4(c12385toM57989x1).appendReplacement(stringBuffer, m57974k4(abstractC12384m9.mo24906k4(c12385toM57989x1), C12385to.m58001k4(c12385toM57989x1)));
            c12385toM57989x1 = c12385toM57989x1.m58005h4();
        }
        C12385to.m58001k4(c12385toM57989x1).appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public String m57983k4(String str, AbstractC12384m9 abstractC12384m9, int i, int i2) {
        if (str == null) {
            throw new ArgumentNullException("input");
        }
        if (abstractC12384m9 == null) {
            throw new ArgumentNullException("evaluator");
        }
        if (i2 < 0 || i2 > str.length()) {
            throw new ArgumentOutOfRangeException("startat");
        }
        String strSubstring = str.substring(0, i2);
        C12385to c12385toM57989x1 = m57989x1(str.substring(i2));
        StringBuffer stringBuffer = new StringBuffer(strSubstring);
        while (c12385toM57989x1.mo58006to() && i > 0) {
            C12385to.m58001k4(c12385toM57989x1).appendReplacement(stringBuffer, m57974k4(abstractC12384m9.mo24906k4(c12385toM57989x1), C12385to.m58001k4(c12385toM57989x1)));
            c12385toM57989x1 = c12385toM57989x1.m58005h4();
            i--;
        }
        C12385to.m58001k4(c12385toM57989x1).appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m57972k4(String str, String str2, String str3) {
        if (str == null) {
            throw new ArgumentNullException("input");
        }
        if (str2 == null) {
            throw new ArgumentNullException("pattern");
        }
        if (str3 == null) {
            throw new ArgumentNullException("replacement");
        }
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o(str2, str);
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcherM58001k4 = C12385to.m58001k4(c12385toOooO00o);
        if (c12385toOooO00o.mo58006to()) {
            str3 = m57974k4(str3, matcherM58001k4);
        }
        while (c12385toOooO00o.mo58006to()) {
            matcherM58001k4.appendReplacement(stringBuffer, str3);
            c12385toOooO00o = c12385toOooO00o.m58005h4();
        }
        matcherM58001k4.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m57973k4(String str, String str2, String str3, int i) {
        if (str == null) {
            throw new ArgumentNullException("input");
        }
        if (str2 == null) {
            throw new ArgumentNullException("pattern");
        }
        if (str3 == null) {
            throw new ArgumentNullException("replacement");
        }
        C12385to c12385toM57989x1 = new C12380dy(str2, i).m57989x1(str);
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcherM58001k4 = C12385to.m58001k4(c12385toM57989x1);
        if (c12385toM57989x1.mo58006to()) {
            str3 = m57974k4(str3, matcherM58001k4);
        }
        while (c12385toM57989x1.mo58006to()) {
            matcherM58001k4.appendReplacement(stringBuffer, str3);
            c12385toM57989x1 = c12385toM57989x1.m58005h4();
        }
        matcherM58001k4.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m57974k4(String str, Matcher matcher) {
        String string;
        char[] charArray = str.replace("\\", "\\\\").toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= charArray.length) {
                if (sb2.length() > 0) {
                    if (sb2.length() != 1) {
                        if (sb2.length() > 1) {
                            if (sb2.charAt(1) == '{' || Integer.valueOf(sb2.substring(1)).intValue() > matcher.groupCount()) {
                                sb.append("\\");
                            }
                            sb.append(sb2.toString());
                        }
                    }
                }
                return sb.toString();
            }
            char c = charArray[i];
            if (c != '$') {
                if (c != '{') {
                    if (c != '}') {
                        int length = sb2.length();
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                if (length == 1) {
                                    sb2.append(c);
                                } else if (sb2.length() <= 1) {
                                    sb.append(c);
                                } else {
                                    sb2.append(c);
                                    int i2 = sb2.charAt(1) == '{' ? 2 : 1;
                                    if (!z && Integer.valueOf(sb2.substring(i2)).intValue() > matcher.groupCount()) {
                                        sb.append("\\");
                                        sb.append(sb2.toString());
                                        sb2 = new StringBuilder();
                                    }
                                }
                                break;
                            default:
                                if (length == 1) {
                                    sb.append("\\");
                                    sb.append(sb2.toString());
                                    sb.append(c);
                                    sb2 = new StringBuilder();
                                    break;
                                } else if (sb2.length() > 1) {
                                    if (sb2.charAt(1) != '{') {
                                        if (Integer.valueOf(sb2.substring(1)).intValue() > matcher.groupCount()) {
                                            sb.append("\\");
                                        }
                                        sb.append(sb2.toString());
                                        sb.append(c);
                                        sb2 = new StringBuilder();
                                    } else {
                                        sb2.append(c);
                                        z = true;
                                    }
                                    break;
                                }
                                break;
                        }
                    } else if (sb2.length() == 1) {
                        sb.append("\\");
                        sb.append(sb2.toString());
                        sb.append(c);
                        sb2 = new StringBuilder();
                    } else if (sb2.length() > 1) {
                        if (sb2.charAt(1) != '{') {
                            if (Integer.valueOf(sb2.substring(1)).intValue() <= matcher.groupCount()) {
                                string = sb2.toString();
                                sb.append(string);
                            }
                            sb.append("\\");
                            sb.append(sb2.toString());
                            sb.append(c);
                        } else if (sb2.length() > 2) {
                            int[] iArr = new int[1];
                            if (C14057f9.m66590k4(sb2.substring(2), iArr)) {
                                if (iArr[0] <= matcher.groupCount()) {
                                    string = sb2.toString().replace("{", "");
                                    sb.append(string);
                                }
                                sb.append("\\");
                                sb.append(sb2.toString());
                                sb.append(c);
                            } else {
                                sb2.append(c);
                                try {
                                    try {
                                        matcher.replaceFirst(sb2.toString());
                                    } catch (IllegalArgumentException unused) {
                                        sb.append("\\");
                                    }
                                } finally {
                                    sb.append(sb2.toString());
                                    matcher.reset();
                                    matcher.find();
                                }
                            }
                        } else {
                            sb.append("\\");
                            sb.append(sb2.toString());
                            sb.append(c);
                        }
                        sb2 = new StringBuilder();
                    } else {
                        sb.append(c);
                    }
                } else if (sb2.length() != 1) {
                    if (sb2.length() > 1) {
                        if (sb2.charAt(1) == '{' || Integer.valueOf(sb2.substring(1)).intValue() > matcher.groupCount()) {
                            sb.append("\\");
                        }
                        sb.append(sb2.toString());
                        sb.append(c);
                        sb2 = new StringBuilder();
                    }
                }
                i++;
            } else if (sb2.length() == 1) {
                sb.append("\\$");
                sb2 = new StringBuilder();
            } else {
                if (sb2.length() > 1) {
                    if (sb2.charAt(1) == '{' || Integer.valueOf(sb2.substring(1)).intValue() > matcher.groupCount()) {
                        sb.append("\\");
                    }
                    sb.append(sb2.toString());
                    sb2 = new StringBuilder();
                }
                sb2.append(c);
            }
            z = false;
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static Pattern m57975k4(C12380dy c12380dy) {
        if (c12380dy == null) {
            return null;
        }
        return c12380dy.f41369x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m57976k4(char c) {
        return c <= '|' && f41367k4[c] >= 1;
    }

    /* JADX INFO: renamed from: k4 */
    public String[] m57984k4(String str) {
        return this.f41369x1.split(str);
    }

    /* JADX INFO: renamed from: k4 */
    public String[] m57985k4(String str, int i) {
        return this.f41369x1.split(str, i);
    }
}
