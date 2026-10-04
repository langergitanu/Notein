package com.huawei.hms.network.embedded;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.OooOOO;
import com.aspose.words.internal.C22246OooO0oo;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.x7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18416x7 {

    /* JADX INFO: renamed from: j */
    public static final char[] f56640j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: k */
    public static final String f56641k = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: l */
    public static final String f56642l = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: m */
    public static final String f56643m = " \"<>^`{}|/\\?#";

    /* JADX INFO: renamed from: n */
    public static final String f56644n = "[]";

    /* JADX INFO: renamed from: o */
    public static final String f56645o = " \"'<>#";

    /* JADX INFO: renamed from: p */
    public static final String f56646p = " \"'<>#&=";

    /* JADX INFO: renamed from: q */
    public static final String f56647q = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* JADX INFO: renamed from: r */
    public static final String f56648r = "\\^`{|}";

    /* JADX INFO: renamed from: s */
    public static final String f56649s = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* JADX INFO: renamed from: t */
    public static final String f56650t = "";

    /* JADX INFO: renamed from: u */
    public static final String f56651u = " \"#<>\\^`{|}";

    /* JADX INFO: renamed from: a */
    public final String f56652a;

    /* JADX INFO: renamed from: b */
    public final String f56653b;

    /* JADX INFO: renamed from: c */
    public final String f56654c;

    /* JADX INFO: renamed from: d */
    public final String f56655d;

    /* JADX INFO: renamed from: e */
    public final int f56656e;

    /* JADX INFO: renamed from: f */
    public final List<String> f56657f;

    /* JADX INFO: renamed from: g */
    public final List<String> f56658g;

    /* JADX INFO: renamed from: h */
    public final String f56659h;

    /* JADX INFO: renamed from: i */
    public final String f56660i;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.x7$a */
    public static final class a {

        /* JADX INFO: renamed from: i */
        public static final String f56661i = "Invalid URL host";

        /* JADX INFO: renamed from: a */
        public String f56662a;

        /* JADX INFO: renamed from: d */
        public String f56665d;

        /* JADX INFO: renamed from: f */
        public final List<String> f56667f;

        /* JADX INFO: renamed from: g */
        public List<String> f56668g;

        /* JADX INFO: renamed from: h */
        public String f56669h;

        /* JADX INFO: renamed from: b */
        public String f56663b = "";

        /* JADX INFO: renamed from: c */
        public String f56664c = "";

        /* JADX INFO: renamed from: e */
        public int f56666e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f56667f = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: c */
        public static int m79949c(String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    return i;
                }
                if (cCharAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* JADX INFO: renamed from: e */
        public static int m79952e(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: f */
        public static int m79953f(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* JADX INFO: renamed from: r */
        private boolean m79954r(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* JADX INFO: renamed from: s */
        private boolean m79955s(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* JADX INFO: renamed from: t */
        private void m79956t(String str) {
            for (int size = this.f56668g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f56668g.get(size))) {
                    this.f56668g.remove(size + 1);
                    this.f56668g.remove(size);
                    if (this.f56668g.isEmpty()) {
                        this.f56668g = null;
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public a m79957a(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "unexpected port: "));
            }
            this.f56666e = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public int m79963b() {
            int i = this.f56666e;
            return i != -1 ? i : C18416x7.m79912e(this.f56662a);
        }

        /* JADX INFO: renamed from: d */
        public a m79971d(String str) {
            if (str != null) {
                return m79945a(str, false);
            }
            throw new NullPointerException("pathSegments == null");
        }

        /* JADX INFO: renamed from: g */
        public a m79975g(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            }
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(str));
            }
            m79951d(str, 0, str.length());
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m79976h(String str) {
            this.f56668g = str != null ? C18416x7.m79915h(C18416x7.m79903a(str, C18416x7.f56645o, true, false, true, true)) : null;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m79977i(String str) {
            if (str == null) {
                throw new NullPointerException("encodedUsername == null");
            }
            this.f56663b = C18416x7.m79903a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m79978j(String str) {
            this.f56669h = str != null ? C18416x7.m79903a(str, "", false, false, false, false) : null;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m79979k(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strM79946a = m79946a(str, 0, str.length());
            if (strM79946a == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.f56665d = strM79946a;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m79980l(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f56664c = C18416x7.m79903a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m79981m(String str) {
            this.f56668g = str != null ? C18416x7.m79915h(C18416x7.m79903a(str, C18416x7.f56645o, false, false, true, true)) : null;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public a m79982n(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f56668g == null) {
                return this;
            }
            m79956t(C18416x7.m79903a(str, C18416x7.f56646p, true, false, true, true));
            return this;
        }

        /* JADX INFO: renamed from: o */
        public a m79983o(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.f56668g == null) {
                return this;
            }
            m79956t(C18416x7.m79903a(str, C18416x7.f56647q, false, false, true, true));
            return this;
        }

        /* JADX INFO: renamed from: p */
        public a m79984p(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f56662a = "http";
                return this;
            }
            if (!str.equalsIgnoreCase(AuthenticationConstants.HTTPS_PROTOCOL_STRING)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.f56662a = AuthenticationConstants.HTTPS_PROTOCOL_STRING;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public a m79985q(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f56663b = C18416x7.m79903a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f56662a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f56663b.isEmpty() || !this.f56664c.isEmpty()) {
                sb.append(this.f56663b);
                if (!this.f56664c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f56664c);
                }
                sb.append('@');
            }
            String str3 = this.f56665d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f56665d);
                    sb.append(']');
                } else {
                    sb.append(this.f56665d);
                }
            }
            if (this.f56666e != -1 || this.f56662a != null) {
                int iM79963b = m79963b();
                String str4 = this.f56662a;
                if (str4 == null || iM79963b != C18416x7.m79912e(str4)) {
                    sb.append(':');
                    sb.append(iM79963b);
                }
            }
            C18416x7.m79911b(sb, this.f56667f);
            if (this.f56668g != null) {
                sb.append('?');
                C18416x7.m79909a(sb, this.f56668g);
            }
            if (this.f56669h != null) {
                sb.append('#');
                sb.append(this.f56669h);
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: b */
        public static int m79948b(String str, int i, int i2) {
            int i3;
            try {
                i3 = Integer.parseInt(C18416x7.m79901a(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i3 <= 0 || i3 > 65535) {
                return -1;
            }
            return i3;
        }

        /* JADX INFO: renamed from: c */
        public a m79968c() {
            int size = this.f56667f.size();
            for (int i = 0; i < size; i++) {
                this.f56667f.set(i, C18416x7.m79903a(this.f56667f.get(i), C18416x7.f56644n, true, true, false, true));
            }
            List<String> list = this.f56668g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f56668g.get(i2);
                    if (str != null) {
                        this.f56668g.set(i2, C18416x7.m79903a(str, C18416x7.f56648r, true, true, true, true));
                    }
                }
            }
            String str2 = this.f56669h;
            if (str2 != null) {
                this.f56669h = C18416x7.m79903a(str2, C18416x7.f56651u, true, true, false, false);
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m79972d(String str, String str2) {
            m79983o(str);
            m79967b(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m79973e(String str) {
            this.f56669h = str != null ? C18416x7.m79903a(str, "", true, false, false, false) : null;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m79974f(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPassword == null");
            }
            this.f56664c = C18416x7.m79903a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        /* JADX INFO: renamed from: d */
        private void m79950d() {
            if (!this.f56667f.remove(r0.size() - 1).isEmpty() || this.f56667f.isEmpty()) {
                this.f56667f.add("");
            } else {
                this.f56667f.set(r0.size() - 1, "");
            }
        }

        /* JADX INFO: renamed from: b */
        public a m79964b(int i) {
            this.f56667f.remove(i);
            if (this.f56667f.isEmpty()) {
                this.f56667f.add("");
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m79969c(String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            m79947a(str, 0, str.length(), false, false);
            return this;
        }

        /* JADX INFO: renamed from: d */
        private void m79951d(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f56667f.clear();
                this.f56667f.add("");
                i++;
            } else {
                List<String> list = this.f56667f;
                list.set(list.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                int iM79360a = C18313p8.m79360a(str, i3, i2, "/\\");
                boolean z = iM79360a < i2;
                String str2 = str;
                m79947a(str2, i3, iM79360a, z, true);
                if (z) {
                    iM79360a++;
                }
                i3 = iM79360a;
                str = str2;
            }
        }

        /* JADX INFO: renamed from: b */
        public a m79965b(int i, String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            String strM79901a = C18416x7.m79901a(str, 0, str.length(), C18416x7.f56643m, false, false, false, true, null);
            if (m79954r(strM79901a) || m79955s(strM79901a)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            this.f56667f.set(i, strM79901a);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m79970c(String str, String str2) {
            m79982n(str);
            m79961a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m79966b(String str) {
            if (str != null) {
                return m79945a(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        /* JADX INFO: renamed from: b */
        public a m79967b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.f56668g == null) {
                this.f56668g = new ArrayList();
            }
            this.f56668g.add(C18416x7.m79903a(str, C18416x7.f56647q, false, false, true, true));
            this.f56668g.add(str2 != null ? C18416x7.m79903a(str2, C18416x7.f56647q, false, false, true, true) : null);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m79958a(int i, String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            String strM79901a = C18416x7.m79901a(str, 0, str.length(), C18416x7.f56643m, true, false, false, true, null);
            this.f56667f.set(i, strM79901a);
            if (m79954r(strM79901a) || m79955s(strM79901a)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m79959a(C18416x7 c18416x7, String str) {
            int iM79360a;
            String str2;
            int i;
            String str3;
            String str4 = str;
            int iM79388b = C18313p8.m79388b(str4, 0, str4.length());
            int iM79394c = C18313p8.m79394c(str4, iM79388b, str4.length());
            int iM79952e = m79952e(str4, iM79388b, iM79394c);
            if (iM79952e != -1) {
                if (str4.regionMatches(true, iM79388b, "https:", 0, 6)) {
                    this.f56662a = AuthenticationConstants.HTTPS_PROTOCOL_STRING;
                    iM79388b += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (!str4.regionMatches(true, iM79388b, "http:", 0, 5)) {
                        throw new IllegalArgumentException(C22246OooO0oo.OooO00o(new StringBuilder("Expected URL scheme 'http' or 'https' but was '"), str4, "'", 0, iM79952e));
                    }
                    this.f56662a = "http";
                    iM79388b += 5;
                }
            } else {
                if (c18416x7 == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f56662a = c18416x7.f56652a;
            }
            int iM79953f = m79953f(str4, iM79388b, iM79394c);
            char c = '#';
            if (iM79953f >= 2 || c18416x7 == null || !c18416x7.f56652a.equals(this.f56662a)) {
                int i2 = iM79388b + iM79953f;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iM79360a = C18313p8.m79360a(str4, i2, iM79394c, "@/\\?#");
                    byte bCharAt = iM79360a != iM79394c ? str4.charAt(iM79360a) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z) {
                            i = iM79360a;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f56664c);
                            sb.append("%40");
                            str3 = str;
                            sb.append(C18416x7.m79901a(str3, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f56664c = sb.toString();
                        } else {
                            int iM79359a = C18313p8.m79359a(str4, i2, iM79360a, ':');
                            String strM79901a = C18416x7.m79901a(str, i2, iM79359a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strM79901a = OooOOO.OooO0O0(new StringBuilder(), this.f56663b, "%40", strM79901a);
                            }
                            this.f56663b = strM79901a;
                            if (iM79359a != iM79360a) {
                                i = iM79360a;
                                this.f56664c = C18416x7.m79901a(str, iM79359a + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i = iM79360a;
                            }
                            str3 = str;
                            z2 = true;
                        }
                        i2 = i + 1;
                        str4 = str3;
                        c = '#';
                    }
                }
                str2 = str4;
                int i3 = i2;
                int iM79949c = m79949c(str2, i3, iM79360a);
                int i4 = iM79949c + 1;
                if (i4 < iM79360a) {
                    this.f56665d = m79946a(str2, i3, iM79949c);
                    int iM79948b = m79948b(str2, i4, iM79360a);
                    this.f56666e = iM79948b;
                    if (iM79948b == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i4, iM79360a) + '\"');
                    }
                } else {
                    this.f56665d = m79946a(str2, i3, iM79949c);
                    this.f56666e = C18416x7.m79912e(this.f56662a);
                }
                if (this.f56665d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i3, iM79949c) + '\"');
                }
                iM79388b = iM79360a;
            } else {
                this.f56663b = c18416x7.m79927f();
                this.f56664c = c18416x7.m79919b();
                this.f56665d = c18416x7.f56655d;
                this.f56666e = c18416x7.f56656e;
                this.f56667f.clear();
                this.f56667f.addAll(c18416x7.m79925d());
                if (iM79388b == iM79394c || str4.charAt(iM79388b) == '#') {
                    m79976h(c18416x7.m79926e());
                }
                str2 = str4;
            }
            int iM79360a2 = C18313p8.m79360a(str2, iM79388b, iM79394c, "?#");
            m79951d(str2, iM79388b, iM79360a2);
            if (iM79360a2 < iM79394c && str2.charAt(iM79360a2) == '?') {
                int iM79359a2 = C18313p8.m79359a(str2, iM79360a2, iM79394c, '#');
                this.f56668g = C18416x7.m79915h(C18416x7.m79901a(str2, iM79360a2 + 1, iM79359a2, C18416x7.f56645o, true, false, true, true, null));
                iM79360a2 = iM79359a2;
            }
            if (iM79360a2 < iM79394c && str2.charAt(iM79360a2) == '#') {
                this.f56669h = C18416x7.m79901a(str2, iM79360a2 + 1, iM79394c, "", true, false, false, false, null);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m79960a(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            m79947a(str, 0, str.length(), false, true);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m79961a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f56668g == null) {
                this.f56668g = new ArrayList();
            }
            this.f56668g.add(C18416x7.m79903a(str, C18416x7.f56646p, true, false, true, true));
            this.f56668g.add(str2 != null ? C18416x7.m79903a(str2, C18416x7.f56646p, true, false, true, true) : null);
            return this;
        }

        /* JADX INFO: renamed from: a */
        private a m79945a(String str, boolean z) {
            boolean z2;
            a aVar;
            String str2;
            boolean z3;
            int i = 0;
            while (true) {
                int iM79360a = C18313p8.m79360a(str, i, str.length(), "/\\");
                if (iM79360a < str.length()) {
                    z2 = true;
                    str2 = str;
                    z3 = z;
                    aVar = this;
                } else {
                    z2 = false;
                    aVar = this;
                    str2 = str;
                    z3 = z;
                }
                aVar.m79947a(str2, i, iM79360a, z2, z3);
                i = iM79360a + 1;
                if (i > str2.length()) {
                    return aVar;
                }
                str = str2;
                z = z3;
            }
        }

        /* JADX INFO: renamed from: a */
        public C18416x7 m79962a() {
            if (this.f56662a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f56665d != null) {
                return new C18416x7(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* JADX INFO: renamed from: a */
        public static String m79946a(String str, int i, int i2) {
            return C18313p8.m79364a(C18416x7.m79902a(str, i, i2, false));
        }

        /* JADX WARN: Type inference failed for: r11v4, types: [long] */
        /* JADX INFO: renamed from: a */
        private void m79947a(String str, int i, int i2, boolean z, boolean z2) {
            String strM79901a = C18416x7.m79901a(str, i, i2, C18416x7.f56643m, z2, false, false, true, null);
            if (m79954r(strM79901a)) {
                return;
            }
            if (m79955s(strM79901a)) {
                m79950d();
                return;
            }
            List<String> list = this.f56667f;
            if (((String) System.currentTimeMillis()).isEmpty()) {
                List<String> list2 = this.f56667f;
                list2.set(list2.size() - 1, strM79901a);
            } else {
                this.f56667f.add(strM79901a);
            }
            if (z) {
                this.f56667f.add("");
            }
        }
    }

    public C18416x7(a aVar) {
        this.f56652a = aVar.f56662a;
        this.f56653b = m79905a(aVar.f56663b, false);
        this.f56654c = m79905a(aVar.f56664c, false);
        this.f56655d = aVar.f56665d;
        this.f56656e = aVar.m79963b();
        this.f56657f = m79906a(aVar.f56667f, false);
        List<String> list = aVar.f56668g;
        this.f56658g = list != null ? m79906a(list, true) : null;
        String str = aVar.f56669h;
        this.f56659h = str != null ? m79905a(str, false) : null;
        this.f56660i = aVar.toString();
    }

    /* JADX INFO: renamed from: e */
    public static int m79912e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(AuthenticationConstants.HTTPS_PROTOCOL_STRING) ? 443 : -1;
    }

    /* JADX INFO: renamed from: f */
    public static C18416x7 m79913f(String str) {
        return new a().m79959a((C18416x7) null, str).m79962a();
    }

    /* JADX INFO: renamed from: g */
    public static C18416x7 m79914g(String str) {
        try {
            return m79913f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public a m79916a(String str) {
        try {
            return new a().m79959a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m79919b() {
        if (this.f56654c.isEmpty()) {
            return "";
        }
        return this.f56660i.substring(this.f56660i.indexOf(58, this.f56652a.length() + 3) + 1, this.f56660i.indexOf(64));
    }

    /* JADX INFO: renamed from: c */
    public String m79922c() {
        int iIndexOf = this.f56660i.indexOf(47, this.f56652a.length() + 3);
        String str = this.f56660i;
        return this.f56660i.substring(iIndexOf, C18313p8.m79360a(str, iIndexOf, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: d */
    public C18416x7 m79924d(String str) {
        a aVarM79916a = m79916a(str);
        if (aVarM79916a != null) {
            return aVarM79916a.m79962a();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C18416x7) && ((C18416x7) obj).f56660i.equals(this.f56660i);
    }

    /* JADX INFO: renamed from: h */
    public String m79929h() {
        return this.f56655d;
    }

    public int hashCode() {
        return this.f56660i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public boolean m79930i() {
        return this.f56652a.equals(AuthenticationConstants.HTTPS_PROTOCOL_STRING);
    }

    /* JADX INFO: renamed from: j */
    public a m79931j() {
        a aVar = new a();
        aVar.f56662a = this.f56652a;
        aVar.f56663b = m79927f();
        aVar.f56664c = m79919b();
        aVar.f56665d = this.f56655d;
        aVar.f56666e = this.f56656e != m79912e(this.f56652a) ? this.f56656e : -1;
        aVar.f56667f.clear();
        aVar.f56667f.addAll(m79925d());
        aVar.m79976h(m79926e());
        aVar.f56669h = m79917a();
        return aVar;
    }

    /* JADX INFO: renamed from: k */
    public String m79932k() {
        return this.f56654c;
    }

    /* JADX INFO: renamed from: l */
    public List<String> m79933l() {
        return this.f56657f;
    }

    /* JADX INFO: renamed from: m */
    public int m79934m() {
        return this.f56657f.size();
    }

    /* JADX INFO: renamed from: n */
    public int m79935n() {
        return this.f56656e;
    }

    /* JADX INFO: renamed from: o */
    public String m79936o() {
        if (this.f56658g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m79909a(sb, this.f56658g);
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public Set<String> m79937p() {
        if (this.f56658g == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f56658g.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.f56658g.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: q */
    public int m79938q() {
        List<String> list = this.f56658g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public String m79939r() {
        return m79916a("/...").m79985q("").m79980l("").m79962a().toString();
    }

    /* JADX INFO: renamed from: s */
    public String m79940s() {
        return this.f56652a;
    }

    /* JADX INFO: renamed from: t */
    public String m79941t() {
        if (C18313p8.m79396d(this.f56655d)) {
            return null;
        }
        return PublicSuffixDatabase.m80073a().m80078a(this.f56655d);
    }

    public String toString() {
        return this.f56660i;
    }

    /* JADX INFO: renamed from: u */
    public URI m79942u() {
        String string = m79931j().m79968c().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public URL m79943v() {
        try {
            return new URL(this.f56660i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: w */
    public String m79944w() {
        return this.f56653b;
    }

    /* JADX INFO: renamed from: a */
    public static C18416x7 m79899a(URI uri) {
        return m79914g(uri.toString());
    }

    /* JADX INFO: renamed from: h */
    public static List<String> m79915h(String str) {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                strSubstring = null;
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                strSubstring = str.substring(iIndexOf2 + 1, iIndexOf);
            }
            arrayList.add(strSubstring);
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public String m79920b(int i) {
        List<String> list = this.f56658g;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: c */
    public List<String> m79923c(String str) {
        if (this.f56658g == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f56658g.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f56658g.get(i))) {
                arrayList.add(this.f56658g.get(i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public List<String> m79925d() {
        int iIndexOf = this.f56660i.indexOf(47, this.f56652a.length() + 3);
        String str = this.f56660i;
        int iM79360a = C18313p8.m79360a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM79360a) {
            int i = iIndexOf + 1;
            int iM79359a = C18313p8.m79359a(this.f56660i, i, iM79360a, IOUtils.DIR_SEPARATOR_UNIX);
            arrayList.add(this.f56660i.substring(i, iM79359a));
            iIndexOf = iM79359a;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public String m79926e() {
        if (this.f56658g == null) {
            return null;
        }
        int iIndexOf = this.f56660i.indexOf(63) + 1;
        String str = this.f56660i;
        return this.f56660i.substring(iIndexOf, C18313p8.m79359a(str, iIndexOf, str.length(), '#'));
    }

    /* JADX INFO: renamed from: f */
    public String m79927f() {
        if (this.f56653b.isEmpty()) {
            return "";
        }
        int length = this.f56652a.length() + 3;
        String str = this.f56660i;
        return this.f56660i.substring(length, C18313p8.m79360a(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: g */
    public String m79928g() {
        return this.f56659h;
    }

    /* JADX INFO: renamed from: a */
    public static C18416x7 m79900a(URL url) {
        return m79914g(url.toString());
    }

    /* JADX INFO: renamed from: b */
    public String m79921b(String str) {
        List<String> list = this.f56658g;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f56658g.get(i))) {
                return this.f56658g.get(i + 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m79911b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(list.get(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public String m79917a() {
        if (this.f56659h == null) {
            return null;
        }
        return this.f56660i.substring(this.f56660i.indexOf(35) + 1);
    }

    /* JADX INFO: renamed from: a */
    public String m79918a(int i) {
        List<String> list = this.f56658g;
        if (list != null) {
            return list.get(i * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: a */
    public static String m79901a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z || (z2 && !m79910a(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                C18261lb c18261lb = new C18261lb();
                c18261lb.mo78262a(str, i, iCharCount);
                m79907a(c18261lb, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return c18261lb.mo78398o();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static String m79902a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C18261lb c18261lb = new C18261lb();
                c18261lb.mo78262a(str, i, i3);
                m79908a(c18261lb, str, i3, i2, z);
                return c18261lb.mo78398o();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static String m79903a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m79901a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* JADX INFO: renamed from: a */
    public static String m79904a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m79901a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* JADX INFO: renamed from: a */
    public static String m79905a(String str, boolean z) {
        return m79902a(str, 0, str.length(), z);
    }

    /* JADX INFO: renamed from: a */
    private List<String> m79906a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m79905a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static void m79907a(C18261lb c18261lb, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C18261lb c18261lb2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    c18261lb.mo78261a(z ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !m79910a(str, i, i2)))))) {
                    if (c18261lb2 == null) {
                        c18261lb2 = new C18261lb();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        c18261lb2.mo78268c(iCodePointAt);
                    } else {
                        c18261lb2.mo78263a(str, i, Character.charCount(iCodePointAt) + i, charset);
                    }
                    while (!c18261lb2.mo78389f()) {
                        byte b = c18261lb2.readByte();
                        c18261lb.writeByte(37);
                        char[] cArr = f56640j;
                        c18261lb.writeByte((int) cArr[((b & 255) >> 4) & 15]);
                        c18261lb.writeByte((int) cArr[b & 15]);
                    }
                } else {
                    c18261lb.mo78268c(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m79908a(C18261lb c18261lb, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iM79358a = C18313p8.m79358a(str.charAt(i + 1));
                int iM79358a2 = C18313p8.m79358a(str.charAt(i3));
                if (iM79358a != -1 && iM79358a2 != -1) {
                    c18261lb.writeByte((iM79358a << 4) + iM79358a2);
                    i = i3;
                }
            } else if (iCodePointAt == 43 && z) {
                c18261lb.writeByte(32);
            } else {
                c18261lb.mo78268c(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m79909a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79910a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C18313p8.m79358a(str.charAt(i + 1)) != -1 && C18313p8.m79358a(str.charAt(i3)) != -1;
    }
}
