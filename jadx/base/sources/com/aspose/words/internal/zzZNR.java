package com.aspose.words.internal;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNR {
    private static final int[] zzZW5 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 3, 4, 0, 0, 0, 4, 4, 5, 5, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 4, 0, 0, 0};
    private final int zzZW2;
    private final ThreadLocal<zzZNT> zzZW3;
    private final Pattern zzZW4;

    public zzZNR(String str) {
        this(str, 32);
    }

    private static Pattern compile(String str, int i) {
        try {
            return Pattern.compile(str, i);
        } catch (PatternSyntaxException unused) {
            return Pattern.compile(zzZNP.zzr(str, i), i);
        }
    }

    public static String zzN(String str, String str2, String str3) {
        return zzZ(str, str2, str3, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[LOOP:1: B:8:0x001e->B:25:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zzUU(String str) {
        int i;
        int i2 = 0;
        while (i2 < str.length()) {
            if (zzZQ(str.charAt(i2))) {
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
                                if (zzZQ(cCharAt)) {
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

    public static boolean zzZP(String str, String str2) {
        return zzZQ(str, str2);
    }

    private static boolean zzZQ(String str, String str2) {
        return new zzZNR(str2, 0).zzUV(str);
    }

    public static zzZNS zzZT(String str, String str2) {
        return zzZ(new zzZNR(str2), str, 0);
    }

    public static zzZNT zzZU(String str, String str2) {
        return new zzZNR(str2).zzUX(str);
    }

    public final int getOptions() {
        return this.zzZW2;
    }

    public final String[] split(String str) {
        return this.zzZW4.split(str);
    }

    public final String toString() {
        return this.zzZW4.toString();
    }

    public final zzZNT zzU(String str, int i, int i2) {
        return this.zzZW3.get().zzV(str, i, i2);
    }

    public final boolean zzUV(String str) {
        return this.zzZW3.get().zzV1(str).zzhL();
    }

    public final zzZNS zzUW(String str) {
        return zzZ(this, str, 0);
    }

    public final zzZNT zzUX(String str) {
        return this.zzZW3.get().zzV1(str);
    }

    public final String[] zzUY(String str) {
        String strSubstring = str.substring(0, 1);
        String[] strArrSplit = split(str.substring(1), 0);
        if (strArrSplit.length > 0) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strSubstring);
            sbOooO0OO.append(strArrSplit[0]);
            strArrSplit[0] = sbOooO0OO.toString();
        }
        return strArrSplit;
    }

    public final String zzZR(String str, String str2) {
        return this.zzZW3.get().zzY(str, str2, 1);
    }

    public final String zzZS(String str, String str2) {
        return this.zzZW3.get().replaceAll(str, str2);
    }

    public final zzZNS zzs(String str, int i) {
        return zzZ(this, str, i);
    }

    public final zzZNT zzt(String str, int i) {
        return this.zzZW3.get().zzu(str, i);
    }

    public zzZNR(String str, int i) {
        String strZzUT = zzZNQ.zzUT(str);
        int i2 = i | 33;
        this.zzZW2 = i2;
        this.zzZW4 = compile(strZzUT, i2);
        this.zzZW3 = new ThreadLocal<zzZNT>() { // from class: com.aspose.words.internal.zzZNR.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: zzhH, reason: merged with bridge method [inline-methods] */
            public zzZNT initialValue() {
                return new zzZNT(zzZNR.this.zzZW4);
            }
        };
    }

    private static zzZNS zzZ(zzZNR zzznr, String str, int i) {
        zzZNS zzzns = new zzZNS();
        Matcher matcher = zzznr.zzZW4.matcher(str);
        while (matcher.find()) {
            zzZNT zzznt = new zzZNT(zzznr.zzZW4, str, i);
            if (!zzznt.zzhL()) {
                break;
            }
            zzzns.zzY(zzznt);
            i = zzznt.zzhI().end();
            if (i == zzznt.getIndex()) {
                break;
            }
        }
        return zzzns;
    }

    public final String[] split(String str, int i) {
        return this.zzZW4.split(str, i);
    }

    private static boolean zzZQ(char c) {
        return c <= '|' && zzZW5[c] > 0;
    }

    private zzZNR(Pattern pattern) {
        this.zzZW2 = pattern.flags();
        this.zzZW4 = pattern;
        this.zzZW3 = new ThreadLocal<zzZNT>() { // from class: com.aspose.words.internal.zzZNR.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: zzhH, reason: merged with bridge method [inline-methods] */
            public zzZNT initialValue() {
                return new zzZNT(zzZNR.this.zzZW4);
            }
        };
    }

    public static String zzZ(String str, String str2, String str3, int i) {
        return new zzZNR(str2, i).zzZS(str, str3);
    }

    public static zzZNR zzZ(Pattern pattern) {
        return new zzZNR(pattern);
    }
}
