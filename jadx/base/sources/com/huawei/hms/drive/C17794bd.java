package com.huawei.hms.drive;

import android.os.Bundle;
import androidx.core.content.OooO0OO;
import com.aspose.slides.internal.p332p7.OooO0o;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o000oo0.C24684Oooo;

/* JADX INFO: renamed from: com.huawei.hms.drive.bd */
/* JADX INFO: loaded from: classes6.dex */
public final class C17794bd {

    /* JADX INFO: renamed from: a */
    private static final Pattern f52803a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: b */
    private static final Pattern f52804b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: c */
    private final String f52805c;

    /* JADX INFO: renamed from: d */
    private final String f52806d;

    /* JADX INFO: renamed from: e */
    private final String f52807e;

    /* JADX INFO: renamed from: f */
    private final String f52808f;

    private C17794bd(String str, String str2, String str3, String str4) {
        this.f52805c = str;
        this.f52806d = str2;
        this.f52807e = str3;
        this.f52808f = str4;
    }

    /* JADX INFO: renamed from: a */
    public static C17794bd m76186a(String str) {
        Matcher matcher = f52803a.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(C24684Oooo.OooO00o('\"', "No subtype found for: \"", str));
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f52804b.matcher(str);
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
                    OooO0o.OooO0O0("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \"");
                    throw new IllegalArgumentException(Bundle.getString(str));
                }
                str2 = strGroup3;
            }
        }
        return new C17794bd(str, lowerCase, lowerCase2, str2);
    }

    /* JADX INFO: renamed from: b */
    public static C17794bd m76187b(String str) {
        try {
            return m76186a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C17794bd) && ((C17794bd) obj).f52805c.equals(this.f52805c);
    }

    public int hashCode() {
        return this.f52805c.hashCode();
    }

    public String toString() {
        return this.f52805c;
    }

    /* JADX INFO: renamed from: a */
    public Charset m76188a() {
        return m76189a((Charset) null);
    }

    /* JADX INFO: renamed from: a */
    public Charset m76189a(Charset charset) {
        try {
            String str = this.f52808f;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
