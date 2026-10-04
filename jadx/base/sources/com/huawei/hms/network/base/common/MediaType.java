package com.huawei.hms.network.base.common;

import Oooo0oO.C21111o0ooOoO;
import androidx.core.content.OooO0OO;
import com.aspose.slides.internal.p332p7.OooO0o;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o000oo0.C24684Oooo;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaType {

    /* JADX INFO: renamed from: e */
    private static final String f54024e = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* JADX INFO: renamed from: f */
    private static final String f54025f = "\"([^\"]*)\"";

    /* JADX INFO: renamed from: g */
    private static final Pattern f54026g = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: h */
    private static final Pattern f54027h = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    private final String f54028a;

    /* JADX INFO: renamed from: b */
    private final String f54029b;

    /* JADX INFO: renamed from: c */
    private final String f54030c;

    /* JADX INFO: renamed from: d */
    private final String f54031d;

    private MediaType(String str, String str2, String str3, String str4) {
        this.f54028a = str;
        this.f54029b = str2;
        this.f54030c = str3;
        this.f54031d = str4;
    }

    public static MediaType get(String str) {
        Matcher matcher = f54026g.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(C24684Oooo.OooO00o('\"', "No subtype found for: \"", str));
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f54027h.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = OooO0OO.OooO00o(1, 1, strGroup3);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException(C21111o0ooOoO.OooO0OO(str, '\"', OooO0o.OooO0O0("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \"")));
                }
                str2 = strGroup3;
            }
        }
        return new MediaType(str, lowerCase, lowerCase2, str2);
    }

    public static MediaType parse(String str) {
        Matcher matcher = f54026g.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f54027h.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = OooO0OO.OooO00o(1, 1, strGroup3);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple different charsets: ".concat(str));
                }
                str2 = strGroup3;
            }
        }
        return new MediaType(str, lowerCase, lowerCase2, str2);
    }

    public Charset charset() {
        String str = this.f54031d;
        if (str != null) {
            return Charset.forName(str);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).f54028a.equals(this.f54028a);
    }

    public int hashCode() {
        return this.f54028a.hashCode();
    }

    public String subtype() {
        return this.f54030c;
    }

    public String toString() {
        return this.f54028a;
    }

    public String type() {
        return this.f54029b;
    }

    public Charset charset(Charset charset) {
        String str = this.f54031d;
        return str != null ? Charset.forName(str) : charset;
    }
}
