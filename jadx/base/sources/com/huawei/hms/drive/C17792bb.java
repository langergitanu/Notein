package com.huawei.hms.drive;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.OooOOO;
import com.aspose.words.internal.C22246OooO0oo;
import com.huawei.hms.network.embedded.C18416x7;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: renamed from: com.huawei.hms.drive.bb */
/* JADX INFO: loaded from: classes6.dex */
public final class C17792bb {

    /* JADX INFO: renamed from: d */
    private static final char[] f52785d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    final String f52786a;

    /* JADX INFO: renamed from: b */
    final String f52787b;

    /* JADX INFO: renamed from: c */
    final int f52788c;

    /* JADX INFO: renamed from: e */
    private final String f52789e;

    /* JADX INFO: renamed from: f */
    private final String f52790f;

    /* JADX INFO: renamed from: g */
    private final List<String> f52791g;

    /* JADX INFO: renamed from: h */
    private final List<String> f52792h;

    /* JADX INFO: renamed from: i */
    private final String f52793i;

    /* JADX INFO: renamed from: j */
    private final String f52794j;

    /* JADX INFO: renamed from: com.huawei.hms.drive.bb$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        String f52795a;

        /* JADX INFO: renamed from: d */
        String f52798d;

        /* JADX INFO: renamed from: f */
        final List<String> f52800f;

        /* JADX INFO: renamed from: g */
        List<String> f52801g;

        /* JADX INFO: renamed from: h */
        String f52802h;

        /* JADX INFO: renamed from: b */
        String f52796b = "";

        /* JADX INFO: renamed from: c */
        String f52797c = "";

        /* JADX INFO: renamed from: e */
        int f52799e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f52800f = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: f */
        private boolean m76168f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* JADX INFO: renamed from: g */
        private boolean m76169g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* JADX INFO: renamed from: a */
        public a m76173a(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f52795a = "http";
                return this;
            }
            if (!str.equalsIgnoreCase(AuthenticationConstants.HTTPS_PROTOCOL_STRING)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.f52795a = AuthenticationConstants.HTTPS_PROTOCOL_STRING;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m76175b(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f52796b = C17792bb.m76134a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m76176c(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f52797c = C17792bb.m76134a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m76178d(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strM76166e = m76166e(str, 0, str.length());
            if (strM76166e == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.f52798d = strM76166e;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m76179e(String str) {
            this.f52801g = str != null ? C17792bb.m76141b(C17792bb.m76134a(str, C18416x7.f56645o, true, false, true, true)) : null;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f52795a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f52796b.isEmpty() || !this.f52797c.isEmpty()) {
                sb.append(this.f52796b);
                if (!this.f52797c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f52797c);
                }
                sb.append('@');
            }
            String str2 = this.f52798d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f52798d);
                    sb.append(']');
                } else {
                    sb.append(this.f52798d);
                }
            }
            if (this.f52799e != -1 || this.f52795a != null) {
                int iM76170a = m76170a();
                String str3 = this.f52795a;
                if (str3 == null || iM76170a != C17792bb.m76131a(str3)) {
                    sb.append(':');
                    sb.append(iM76170a);
                }
            }
            C17792bb.m76137a(sb, this.f52800f);
            if (this.f52801g != null) {
                sb.append('?');
                C17792bb.m76142b(sb, this.f52801g);
            }
            if (this.f52802h != null) {
                sb.append('#');
                sb.append(this.f52802h);
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: f */
        private static int m76167f(String str, int i, int i2) {
            int i3;
            try {
                i3 = Integer.parseInt(C17792bb.m76132a(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i3 <= 0 || i3 > 65535) {
                return -1;
            }
            return i3;
        }

        /* JADX INFO: renamed from: b */
        public a m76174b() {
            int size = this.f52800f.size();
            for (int i = 0; i < size; i++) {
                this.f52800f.set(i, C17792bb.m76134a(this.f52800f.get(i), C18416x7.f56644n, true, true, false, true));
            }
            List<String> list = this.f52801g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f52801g.get(i2);
                    if (str != null) {
                        this.f52801g.set(i2, C17792bb.m76134a(str, C18416x7.f56648r, true, true, true, true));
                    }
                }
            }
            String str2 = this.f52802h;
            if (str2 != null) {
                this.f52802h = C17792bb.m76134a(str2, C18416x7.f56651u, true, true, false, false);
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C17792bb m76177c() {
            if (this.f52795a != null) {
                if (this.f52798d != null) {
                    return new C17792bb(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* JADX INFO: renamed from: e */
        private static String m76166e(String str, int i, int i2) {
            return C17806bp.m76329a(C17792bb.m76133a(str, i, i2, false));
        }

        /* JADX INFO: renamed from: d */
        private void m76165d() {
            if (this.f52800f.remove(r0.size() - 1).isEmpty() && !this.f52800f.isEmpty()) {
                this.f52800f.set(r0.size() - 1, "");
            } else {
                this.f52800f.add("");
            }
        }

        /* JADX INFO: renamed from: a */
        public a m76171a(int i) {
            if (i > 0 && i <= 65535) {
                this.f52799e = i;
                return this;
            }
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "unexpected port: "));
        }

        /* JADX INFO: renamed from: c */
        private static int m76163c(String str, int i, int i2) {
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

        /* JADX INFO: renamed from: d */
        private static int m76164d(String str, int i, int i2) {
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

        /* JADX INFO: renamed from: a */
        public int m76170a() {
            int i = this.f52799e;
            return i != -1 ? i : C17792bb.m76131a(this.f52795a);
        }

        /* JADX INFO: renamed from: b */
        private static int m76162b(String str, int i, int i2) {
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

        /* JADX INFO: renamed from: a */
        public a m76172a(C17792bb c17792bb, String str) throws EOFException {
            int iM76324a;
            String str2;
            int i;
            String str3;
            String str4 = str;
            int iM76322a = C17806bp.m76322a(str4, 0, str4.length());
            int iM76348b = C17806bp.m76348b(str4, iM76322a, str4.length());
            int iM76162b = m76162b(str4, iM76322a, iM76348b);
            if (iM76162b != -1) {
                if (str4.regionMatches(true, iM76322a, "https:", 0, 6)) {
                    this.f52795a = AuthenticationConstants.HTTPS_PROTOCOL_STRING;
                    iM76322a += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iM76322a, "http:", 0, 5)) {
                        this.f52795a = "http";
                        iM76322a += 5;
                    } else {
                        throw new IllegalArgumentException(C22246OooO0oo.OooO00o(new StringBuilder("Expected URL scheme 'http' or 'https' but was '"), str4, "'", 0, iM76162b));
                    }
                }
            } else if (c17792bb != null) {
                this.f52795a = c17792bb.f52786a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iM76163c = m76163c(str4, iM76322a, iM76348b);
            char c = '#';
            if (iM76163c < 2 && c17792bb != null && c17792bb.f52786a.equals(this.f52795a)) {
                this.f52796b = c17792bb.m76149d();
                this.f52797c = c17792bb.m76150e();
                this.f52798d = c17792bb.f52787b;
                this.f52799e = c17792bb.f52788c;
                this.f52800f.clear();
                this.f52800f.addAll(c17792bb.m76154i());
                if (iM76322a == iM76348b || str4.charAt(iM76322a) == '#') {
                    m76179e(c17792bb.m76155j());
                }
                str2 = str4;
            } else {
                int i2 = iM76322a + iM76163c;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iM76324a = C17806bp.m76324a(str4, i2, iM76348b, "@/\\?#");
                    byte bCharAt = iM76324a != iM76348b ? str4.charAt(iM76324a) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt != 64) {
                        str3 = str4;
                    } else {
                        if (!z) {
                            int iM76323a = C17806bp.m76323a(str4, i2, iM76324a, ':');
                            String strM76132a = C17792bb.m76132a(str, i2, iM76323a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strM76132a = OooOOO.OooO0O0(new StringBuilder(), this.f52796b, "%40", strM76132a);
                            }
                            this.f52796b = strM76132a;
                            if (iM76323a != iM76324a) {
                                i = iM76324a;
                                this.f52797c = C17792bb.m76132a(str, iM76323a + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i = iM76324a;
                            }
                            str3 = str;
                            z2 = true;
                        } else {
                            i = iM76324a;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f52797c);
                            sb.append("%40");
                            str3 = str;
                            sb.append(C17792bb.m76132a(str3, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f52797c = sb.toString();
                        }
                        i2 = i + 1;
                    }
                    str4 = str3;
                    c = '#';
                }
                str2 = str4;
                int i3 = i2;
                int iM76164d = m76164d(str2, i3, iM76324a);
                int i4 = iM76164d + 1;
                if (i4 < iM76324a) {
                    this.f52798d = m76166e(str2, i3, iM76164d);
                    int iM76167f = m76167f(str2, i4, iM76324a);
                    this.f52799e = iM76167f;
                    if (iM76167f == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i4, iM76324a) + '\"');
                    }
                } else {
                    this.f52798d = m76166e(str2, i3, iM76164d);
                    this.f52799e = C17792bb.m76131a(this.f52795a);
                }
                if (this.f52798d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i3, iM76164d) + '\"');
                }
                iM76322a = iM76324a;
            }
            int iM76324a2 = C17806bp.m76324a(str2, iM76322a, iM76348b, "?#");
            m76160a(str2, iM76322a, iM76324a2);
            if (iM76324a2 < iM76348b && str2.charAt(iM76324a2) == '?') {
                int iM76323a2 = C17806bp.m76323a(str2, iM76324a2, iM76348b, '#');
                this.f52801g = C17792bb.m76141b(C17792bb.m76132a(str2, iM76324a2 + 1, iM76323a2, C18416x7.f56645o, true, false, true, true, null));
                iM76324a2 = iM76323a2;
            }
            if (iM76324a2 < iM76348b && str2.charAt(iM76324a2) == '#') {
                this.f52802h = C17792bb.m76132a(str2, iM76324a2 + 1, iM76348b, "", true, false, false, false, null);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        private void m76160a(String str, int i, int i2) throws EOFException {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f52800f;
                list.set(list.size() - 1, "");
            } else {
                this.f52800f.clear();
                this.f52800f.add("");
                i++;
            }
            int i3 = i;
            while (i3 < i2) {
                int iM76324a = C17806bp.m76324a(str, i3, i2, "/\\");
                boolean z = iM76324a < i2;
                String str2 = str;
                m76161a(str2, i3, iM76324a, z, true);
                if (z) {
                    iM76324a++;
                }
                i3 = iM76324a;
                str = str2;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m76161a(String str, int i, int i2, boolean z, boolean z2) throws EOFException {
            String strM76132a = C17792bb.m76132a(str, i, i2, C18416x7.f56643m, z2, false, false, true, null);
            if (m76168f(strM76132a)) {
                return;
            }
            if (m76169g(strM76132a)) {
                m76165d();
                return;
            }
            if (((String) OooO0O0.OooO00o.OooO00o(1, this.f52800f)).isEmpty()) {
                List<String> list = this.f52800f;
                list.set(list.size() - 1, strM76132a);
            } else {
                this.f52800f.add(strM76132a);
            }
            if (z) {
                this.f52800f.add("");
            }
        }
    }

    public C17792bb(a aVar) {
        this.f52786a = aVar.f52795a;
        this.f52789e = m76135a(aVar.f52796b, false);
        this.f52790f = m76135a(aVar.f52797c, false);
        this.f52787b = aVar.f52798d;
        this.f52788c = aVar.m76170a();
        this.f52791g = m76136a(aVar.f52800f, false);
        List<String> list = aVar.f52801g;
        this.f52792h = list != null ? m76136a(list, true) : null;
        String str = aVar.f52802h;
        this.f52793i = str != null ? m76135a(str, false) : null;
        this.f52794j = aVar.toString();
    }

    /* JADX INFO: renamed from: a */
    public URI m76144a() {
        String string = m76159n().m76174b().toString();
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

    /* JADX INFO: renamed from: b */
    public String m76145b() {
        return this.f52786a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m76147c() {
        return this.f52786a.equals(AuthenticationConstants.HTTPS_PROTOCOL_STRING);
    }

    /* JADX INFO: renamed from: d */
    public String m76149d() {
        if (this.f52789e.isEmpty()) {
            return "";
        }
        int length = this.f52786a.length() + 3;
        String str = this.f52794j;
        return this.f52794j.substring(length, C17806bp.m76324a(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: e */
    public String m76150e() {
        if (this.f52790f.isEmpty()) {
            return "";
        }
        return this.f52794j.substring(this.f52794j.indexOf(58, this.f52786a.length() + 3) + 1, this.f52794j.indexOf(64));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C17792bb) && ((C17792bb) obj).f52794j.equals(this.f52794j);
    }

    /* JADX INFO: renamed from: f */
    public String m76151f() {
        return this.f52787b;
    }

    /* JADX INFO: renamed from: g */
    public int m76152g() {
        return this.f52788c;
    }

    /* JADX INFO: renamed from: h */
    public String m76153h() {
        int iIndexOf = this.f52794j.indexOf(47, this.f52786a.length() + 3);
        String str = this.f52794j;
        return this.f52794j.substring(iIndexOf, C17806bp.m76324a(str, iIndexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f52794j.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public List<String> m76154i() {
        int iIndexOf = this.f52794j.indexOf(47, this.f52786a.length() + 3);
        String str = this.f52794j;
        int iM76324a = C17806bp.m76324a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM76324a) {
            int i = iIndexOf + 1;
            int iM76323a = C17806bp.m76323a(this.f52794j, i, iM76324a, IOUtils.DIR_SEPARATOR_UNIX);
            arrayList.add(this.f52794j.substring(i, iM76323a));
            iIndexOf = iM76323a;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public String m76155j() {
        if (this.f52792h == null) {
            return null;
        }
        int iIndexOf = this.f52794j.indexOf(63) + 1;
        String str = this.f52794j;
        return this.f52794j.substring(iIndexOf, C17806bp.m76323a(str, iIndexOf, str.length(), '#'));
    }

    /* JADX INFO: renamed from: k */
    public String m76156k() {
        if (this.f52792h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m76142b(sb, this.f52792h);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public String m76157l() {
        if (this.f52793i == null) {
            return null;
        }
        return this.f52794j.substring(this.f52794j.indexOf(35) + 1);
    }

    /* JADX INFO: renamed from: m */
    public String m76158m() {
        return m76148d("/...").m76175b("").m76176c("").m76177c().toString();
    }

    /* JADX INFO: renamed from: n */
    public a m76159n() {
        a aVar = new a();
        aVar.f52795a = this.f52786a;
        aVar.f52796b = m76149d();
        aVar.f52797c = m76150e();
        aVar.f52798d = this.f52787b;
        aVar.f52799e = this.f52788c != m76131a(this.f52786a) ? this.f52788c : -1;
        aVar.f52800f.clear();
        aVar.f52800f.addAll(m76154i());
        aVar.m76179e(m76155j());
        aVar.f52802h = m76157l();
        return aVar;
    }

    public String toString() {
        return this.f52794j;
    }

    /* JADX INFO: renamed from: b */
    public static void m76142b(StringBuilder sb, List<String> list) {
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

    /* JADX INFO: renamed from: c */
    public C17792bb m76146c(String str) {
        a aVarM76148d = m76148d(str);
        if (aVarM76148d != null) {
            return aVarM76148d.m76177c();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static C17792bb m76143e(String str) {
        return new a().m76172a(null, str).m76177c();
    }

    /* JADX INFO: renamed from: d */
    public a m76148d(String str) {
        try {
            return new a().m76172a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m76131a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(AuthenticationConstants.HTTPS_PROTOCOL_STRING) ? 443 : -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m76137a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(list.get(i));
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m76141b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static String m76135a(String str, boolean z) {
        return m76133a(str, 0, str.length(), z);
    }

    /* JADX INFO: renamed from: a */
    private List<String> m76136a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m76135a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static String m76133a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                c34524OooO0Oo.o000Oo0O(i, i3, str);
                m76139a(c34524OooO0Oo, str, i3, i2, z);
                return c34524OooO0Oo.o00000OO();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m76139a(C34524OooO0Oo c34524OooO0Oo, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iM76321a = C17806bp.m76321a(str.charAt(i + 1));
                int iM76321a2 = C17806bp.m76321a(str.charAt(i3));
                if (iM76321a != -1 && iM76321a2 != -1) {
                    c34524OooO0Oo.o0OoO0o((iM76321a << 4) + iM76321a2);
                    i = i3;
                }
            } else if (iCodePointAt == 43 && z) {
                c34524OooO0Oo.o0OoO0o(32);
            } else {
                c34524OooO0Oo.o000Oo(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76140a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C17806bp.m76321a(str.charAt(i + 1)) != -1 && C17806bp.m76321a(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: a */
    public static String m76132a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || m76140a(str, iCharCount, i2)))) && (iCodePointAt != 43 || !z3)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                c34524OooO0Oo.o000Oo0O(i, iCharCount, str);
                m76138a(c34524OooO0Oo, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return c34524OooO0Oo.o00000OO();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m76138a(C34524OooO0Oo c34524OooO0Oo, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
        C34524OooO0Oo c34524OooO0Oo2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    c34524OooO0Oo.o000Oo0o(z ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z && (!z2 || m76140a(str, i, i2)))))) {
                    c34524OooO0Oo.o000Oo(iCodePointAt);
                } else {
                    if (c34524OooO0Oo2 == null) {
                        c34524OooO0Oo2 = new C34524OooO0Oo();
                    }
                    if (charset != null && !charset.equals(C17806bp.f52958e)) {
                        c34524OooO0Oo2.o000Oo00(str, i, Character.charCount(iCodePointAt) + i, charset);
                    } else {
                        c34524OooO0Oo2.o000Oo(iCodePointAt);
                    }
                    while (!c34524OooO0Oo2.o0000o0O()) {
                        byte b = c34524OooO0Oo2.readByte();
                        c34524OooO0Oo.o0OoO0o(37);
                        char[] cArr = f52785d;
                        c34524OooO0Oo.o0OoO0o(cArr[((b & 255) >> 4) & 15]);
                        c34524OooO0Oo.o0OoO0o(cArr[b & 15]);
                    }
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m76134a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m76132a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
