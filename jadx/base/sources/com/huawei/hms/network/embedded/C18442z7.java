package com.huawei.hms.network.embedded;

import Oooo0oO.C21111o0ooOoO;
import androidx.core.content.OooO0OO;
import com.aspose.slides.internal.p332p7.OooO0o;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o000oo0.C24684Oooo;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.z7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18442z7 {

    /* JADX INFO: renamed from: e */
    public static final String f56805e = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* JADX INFO: renamed from: f */
    public static final String f56806f = "\"([^\"]*)\"";

    /* JADX INFO: renamed from: g */
    public static final Pattern f56807g = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: h */
    public static final Pattern f56808h = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f56809a;

    /* JADX INFO: renamed from: b */
    public final String f56810b;

    /* JADX INFO: renamed from: c */
    public final String f56811c;

    /* JADX INFO: renamed from: d */
    public final String f56812d;

    public C18442z7(String str, String str2, String str3, String str4) {
        this.f56809a = str;
        this.f56810b = str2;
        this.f56811c = str3;
        this.f56812d = str4;
    }

    /* JADX INFO: renamed from: a */
    public static C18442z7 m80033a(String str) {
        Matcher matcher = f56807g.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(C24684Oooo.OooO00o('\"', "No subtype found for: \"", str));
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f56808h.matcher(str);
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
        return new C18442z7(str, lowerCase, lowerCase2, str2);
    }

    /* JADX INFO: renamed from: b */
    public static C18442z7 m80034b(String str) {
        try {
            return m80033a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m80038c() {
        return this.f56810b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C18442z7) && ((C18442z7) obj).f56809a.equals(this.f56809a);
    }

    public int hashCode() {
        return this.f56809a.hashCode();
    }

    public String toString() {
        return this.f56809a;
    }

    /* JADX INFO: renamed from: b */
    public String m80037b() {
        return this.f56811c;
    }

    /* JADX INFO: renamed from: a */
    public Charset m80035a() {
        return m80036a((Charset) null);
    }

    /* JADX INFO: renamed from: a */
    public Charset m80036a(Charset charset) {
        try {
            String str = this.f56812d;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
