package com.aspose.slides.p559ms.System;

import androidx.core.content.OooO0O0;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p120f2.C3842k4;
import com.aspose.slides.internal.p120f2.C3843x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.network.embedded.C18416x7;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.gk */
/* JADX INFO: loaded from: classes5.dex */
public class C14062gk {

    /* JADX INFO: renamed from: bz */
    private static final String f47203bz;

    /* JADX INFO: renamed from: c5 */
    public static String f47204c5 = null;

    /* JADX INFO: renamed from: c6 */
    private static String[] f47205c6 = new String[0];

    /* JADX INFO: renamed from: ck */
    public static String f47206ck = null;

    /* JADX INFO: renamed from: du */
    public static String f47207du = null;

    /* JADX INFO: renamed from: dy */
    public static String f47208dy = null;

    /* JADX INFO: renamed from: e0 */
    private static final String f47209e0;

    /* JADX INFO: renamed from: fa */
    static final String f47210fa;

    /* JADX INFO: renamed from: h4 */
    public static String f47211h4 = null;

    /* JADX INFO: renamed from: jd */
    public static String f47212jd = null;

    /* JADX INFO: renamed from: k4 */
    public static String f47213k4 = null;

    /* JADX INFO: renamed from: kk */
    public static String f47214kk = null;

    /* JADX INFO: renamed from: m9 */
    public static String f47215m9 = null;

    /* JADX INFO: renamed from: qm */
    private static final String f47216qm;

    /* JADX INFO: renamed from: to */
    public static String f47217to = null;

    /* JADX INFO: renamed from: ts */
    private static boolean f47218ts = false;

    /* JADX INFO: renamed from: up */
    static final String f47219up;

    /* JADX INFO: renamed from: x1 */
    public static String f47220x1 = null;

    /* JADX INFO: renamed from: xk */
    private static String f47221xk = "0123456789ABCDEF";

    /* JADX INFO: renamed from: yj */
    static x1[] f47222yj;

    /* JADX INFO: renamed from: ak */
    private String f47223ak;

    /* JADX INFO: renamed from: ar */
    private boolean f47224ar;

    /* JADX INFO: renamed from: b3 */
    private String f47225b3;

    /* JADX INFO: renamed from: bv */
    private boolean f47226bv;

    /* JADX INFO: renamed from: dq */
    private int f47227dq;

    /* JADX INFO: renamed from: g8 */
    private C14119yo f47228g8;

    /* JADX INFO: renamed from: ix */
    private int f47229ix;

    /* JADX INFO: renamed from: ks */
    private boolean f47230ks;

    /* JADX INFO: renamed from: lr */
    private List<String> f47231lr;

    /* JADX INFO: renamed from: ne */
    private String f47232ne;

    /* JADX INFO: renamed from: qq */
    private String f47233qq;

    /* JADX INFO: renamed from: rv */
    private String f47234rv;

    /* JADX INFO: renamed from: u4 */
    private String f47235u4;

    /* JADX INFO: renamed from: um */
    private boolean f47236um;

    /* JADX INFO: renamed from: uz */
    private String f47237uz;

    /* JADX INFO: renamed from: v4 */
    private long f47238v4;

    /* JADX INFO: renamed from: wl */
    private String f47239wl;

    /* JADX INFO: renamed from: wy */
    private String f47240wy;

    /* JADX INFO: renamed from: x6 */
    private String f47241x6;

    /* JADX INFO: renamed from: yd */
    private boolean f47242yd;

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.gk$k4 */
    public enum k4 {
        Construct,
        WellFormed,
        TryCreate
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.gk$x1 */
    public static class x1 extends AbstractC7020m9<x1> {

        /* JADX INFO: renamed from: to */
        static final /* synthetic */ boolean f47247to = true;

        /* JADX INFO: renamed from: k4 */
        public String f47248k4;

        /* JADX INFO: renamed from: kk */
        public int f47249kk;

        /* JADX INFO: renamed from: x1 */
        public String f47250x1;

        public x1() {
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m66700x1(x1 x1Var) {
            return C14067j2.m66728k4(x1Var.f47248k4, this.f47248k4) && C14067j2.m66728k4(x1Var.f47250x1, this.f47250x1) && x1Var.f47249kk == this.f47249kk;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (!f47247to && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof x1) {
                return m66700x1((x1) obj);
            }
            return false;
        }

        public int hashCode() {
            String str = this.f47248k4;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f47250x1;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f47249kk;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public x1 Clone() {
            x1 x1Var = new x1();
            CloneTo(x1Var);
            return x1Var;
        }

        public x1(String str, String str2, int i) {
            this.f47248k4 = str;
            this.f47250x1 = str2;
            this.f47249kk = i;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(x1 x1Var) {
            x1Var.f47248k4 = this.f47248k4;
            x1Var.f47250x1 = this.f47250x1;
            x1Var.f47249kk = this.f47249kk;
        }
    }

    static {
        f47218ts = C3141rv.f9302kk == '\\';
        f47213k4 = "://";
        f47220x1 = "file";
        f47214kk = "ftp";
        f47217to = "gopher";
        f47207du = "http";
        f47211h4 = AuthenticationConstants.HTTPS_PROTOCOL_STRING;
        f47215m9 = "mailto";
        f47208dy = "news";
        f47204c5 = "nntp";
        f47212jd = "net.pipe";
        f47206ck = "net.tcp";
        f47209e0 = C14113y2.m67408k4("<>%\"{}|\\^`", C18416x7.f56644n, MsalUtils.QUERY_STRING_SYMBOL);
        f47203bz = C14113y2.m67408k4("<>%\"{}|\\^`", "#");
        f47216qm = C14113y2.m67408k4("<>%\"{}|\\^`", C18416x7.f56644n);
        String strM67408k4 = C14113y2.m67408k4("<>%\"{}|\\^`", "#", C18416x7.f56644n);
        f47210fa = strM67408k4;
        f47219up = C14113y2.m67408k4(strM67408k4, MsalUtils.QUERY_STRING_SYMBOL);
        f47222yj = new x1[]{new x1(f47207du, f47213k4, 80), new x1(f47211h4, f47213k4, 443), new x1(f47214kk, f47213k4, 21), new x1(f47220x1, f47213k4, -1), new x1(f47215m9, C18241k5.f55433h, 25), new x1(f47208dy, C18241k5.f55433h, 119), new x1(f47204c5, f47213k4, 119), new x1(f47217to, f47213k4, 70)};
    }

    public C14062gk(C14062gk c14062gk, String str) {
        String str2 = C14113y2.f47374k4;
        this.f47241x6 = str2;
        this.f47232ne = str2;
        this.f47229ix = -1;
        this.f47235u4 = str2;
        this.f47237uz = str2;
        this.f47239wl = str2;
        this.f47226bv = true;
        m66645k4(c14062gk, str);
    }

    /* JADX INFO: renamed from: ar */
    private String m66622ar() {
        return this.f47236um ? C18241k5.f55433h : m66658m9(this.f47241x6);
    }

    /* JADX INFO: renamed from: bv */
    private void m66623bv() {
        if (!m66683ix()) {
            throw new InvalidOperationException("This operation is not supported for a relative URI.");
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static String m66624c5(String str) {
        if (str == null) {
            throw new ArgumentNullException("stringToEscape");
        }
        if (str.length() > 65519) {
            throw new UriFormatException(C14113y2.m67402k4("Uri is longer than the maximum {0} characters.", 65519));
        }
        for (int i = 0; i < str.length(); i++) {
            if (m66662to(str.charAt(i))) {
                C6765kp c6765kp = new C6765kp();
                for (byte b : AbstractC6747ar.m26635ix().mo26677to(str)) {
                    char c = (char) (b & 255);
                    if (m66662to(c)) {
                        c6765kp.m26792k4(m66669x1(c));
                    } else {
                        c6765kp.m26780k4(c);
                    }
                }
                return c6765kp.toString();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: dy */
    public static int m66628dy(String str) {
        C14119yo c14119yoM67564x1 = C14119yo.m67564x1(str);
        if (c14119yoM67564x1 == null) {
            return -1;
        }
        return c14119yoM67564x1.m67566k4();
    }

    /* JADX INFO: renamed from: jd */
    public static String m66632jd(String str) {
        if (str == null) {
            throw new ArgumentNullException("stringToEscape");
        }
        if (str.length() > 65519) {
            throw new UriFormatException(C14113y2.m67402k4("Uri is longer than the maximum {0} characters.", 65519));
        }
        for (int i = 0; i < str.length(); i++) {
            if (m66627du(str.charAt(i))) {
                C6765kp c6765kp = new C6765kp();
                for (byte b : AbstractC6747ar.m26635ix().mo26677to(str)) {
                    char c = (char) (b & 255);
                    if (m66627du(c)) {
                        c6765kp.m26792k4(m66669x1(c));
                    } else {
                        c6765kp.m26780k4(c);
                    }
                }
                return c6765kp.toString();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    private static char m66633k4(String str, int[] iArr, char[] cArr) {
        cArr[0] = 0;
        if (str == null) {
            throw new ArgumentException("pattern");
        }
        int i = iArr[0];
        if (i < 0 || i >= str.length()) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (!m66649k4(str, iArr[0])) {
            int i2 = iArr[0];
            iArr[0] = i2 + 1;
            return str.charAt(i2);
        }
        int i3 = iArr[0];
        int i4 = i3 + 1;
        iArr[0] = i4;
        iArr[0] = i3 + 2;
        int iM66635k4 = m66635k4(str.charAt(i4));
        int i5 = iArr[0];
        iArr[0] = i5 + 1;
        int iM66635k42 = m66635k4(str.charAt(i5));
        int i6 = 0;
        for (int i7 = iM66635k4; (i7 & 8) == 8; i7 <<= 1) {
            i6++;
        }
        if (i6 <= 1) {
            return (char) ((iM66635k4 << 4) | iM66635k42);
        }
        byte[] bArr = new byte[i6];
        bArr[0] = (byte) ((iM66635k4 << 4) | iM66635k42);
        for (int i8 = 1; i8 < i6; i8++) {
            int i9 = iArr[0];
            iArr[0] = i9 + 1;
            if (m66649k4(str, i9)) {
                int i10 = iArr[0];
                iArr[0] = i10 + 1;
                int iM66635k43 = m66635k4(str.charAt(i10));
                if ((iM66635k43 & 12) == 8) {
                    int i11 = iArr[0];
                    iArr[0] = i11 + 1;
                    bArr[i8] = (byte) (m66635k4(str.charAt(i11)) | (iM66635k43 << 4));
                }
            }
            iArr[0] = i3 + 3;
            return (char) (bArr[0] & 255);
        }
        int i12 = ((byte) (255 >> (i6 + 1))) & 255 & bArr[0] & 255;
        for (int i13 = 1; i13 < i6; i13++) {
            i12 = (i12 << 6) | (bArr[i13] & 63);
        }
        if (i12 <= 65535) {
            return (char) i12;
        }
        int i14 = i12 - 65536;
        cArr[0] = (char) ((i14 & 1023) | 56320);
        return (char) ((i14 >> 10) | 55296);
    }

    /* JADX INFO: renamed from: m9 */
    public static String m66658m9(String str) {
        int i = 0;
        while (true) {
            x1[] x1VarArr = f47222yj;
            if (i >= x1VarArr.length) {
                return f47213k4;
            }
            if (C14113y2.m67363du(x1VarArr[i].f47248k4, str)) {
                return f47222yj[i].f47250x1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: qq */
    private boolean m66660qq() {
        return (C14113y2.m67363du(this.f47241x6, f47204c5) || C14113y2.m67363du(this.f47241x6, f47214kk) || C14113y2.m67363du(this.f47241x6, f47220x1)) ? false : true;
    }

    /* JADX INFO: renamed from: um */
    private C14119yo m66665um() {
        if (this.f47228g8 == null) {
            C14119yo c14119yoM67564x1 = C14119yo.m67564x1(m66689ks());
            this.f47228g8 = c14119yoM67564x1;
            if (c14119yoM67564x1 == null) {
                this.f47228g8 = new C14075lr(C18358t1.g.f56183c);
            }
        }
        return this.f47228g8;
    }

    /* JADX INFO: renamed from: wl */
    private boolean m66668wl() {
        if (m66679dy() || C14113y2.m67363du(this.f47241x6, f47208dy) || C14113y2.m67363du(this.f47241x6, f47204c5) || C14113y2.m67363du(this.f47241x6, f47214kk)) {
            return false;
        }
        return m66696uz();
    }

    /* JADX INFO: renamed from: ck */
    public String m66677ck() {
        String strM67393k4;
        String strM67408k4;
        m66623bv();
        String str = this.f47223ak;
        if (str != null) {
            return str;
        }
        if (m66668wl()) {
            String strM66682h4 = m66682h4(m66686k4());
            this.f47223ak = strM66682h4;
            return strM66682h4;
        }
        if (m66684jd()) {
            if (this.f47235u4.length() > 1 && this.f47235u4.charAt(1) == ':') {
                strM67393k4 = C14113y2.m67393k4(this.f47235u4, C3141rv.f9305x1, C3141rv.f9302kk);
            } else if (C3141rv.f9302kk == '\\') {
                String strM67400k4 = this.f47232ne;
                if (this.f47235u4.length() > 0) {
                    if (this.f47235u4.length() > 1 || this.f47235u4.charAt(0) != '/') {
                        strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67393k4(this.f47235u4, IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS));
                    }
                    if (C14113y2.m67424kk(this.f47234rv, "/") && !C14113y2.m67424kk(strM67400k4, "\\")) {
                        strM67400k4 = C14113y2.m67400k4(strM67400k4, "\\");
                    }
                }
                strM67408k4 = C14113y2.m67408k4("\\\\", m66682h4(strM67400k4));
            } else {
                strM67393k4 = this.f47235u4;
            }
            strM67408k4 = m66682h4(strM67393k4);
        } else {
            strM67408k4 = m66682h4(m66653kk(this.f47235u4, false));
            if (this.f47235u4.length() > 3 && this.f47235u4.charAt(1) == ':' && (this.f47235u4.charAt(2) == '\\' || this.f47235u4.charAt(2) == '/')) {
                strM67408k4 = C14113y2.m67393k4(strM67408k4, IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS);
            }
        }
        this.f47223ak = strM67408k4;
        if (this.f47223ak.length() == 0) {
            this.f47223ak = C14117yj.m67537ne(C3141rv.f9302kk);
        }
        return this.f47223ak;
    }

    /* JADX INFO: renamed from: du */
    public String m66678du() {
        m66623bv();
        return this.f47232ne;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C14062gk c14062gk = obj instanceof C14062gk ? (C14062gk) obj : null;
        if (c14062gk == null) {
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return false;
            }
            C14062gk[] c14062gkArr = {c14062gk};
            boolean zM66650k4 = m66650k4(str, 0, c14062gkArr);
            C14062gk c14062gk2 = c14062gkArr[0];
            if (!zM66650k4) {
                return false;
            }
            c14062gk = c14062gk2;
        }
        return m66655kk(c14062gk);
    }

    /* JADX INFO: renamed from: fa */
    public String m66680fa() {
        m66623bv();
        return C14113y2.m67408k4(this.f47235u4, m66699yj());
    }

    /* JADX INFO: renamed from: h4 */
    public int m66681h4() {
        m66623bv();
        int iM66636k4 = m66636k4(m66678du());
        if (iM66636k4 == 0) {
            if ("mailto".equals(this.f47241x6)) {
                return 1;
            }
            String str = this.f47232ne;
            if ((str != null && str.length() > 0) || m66679dy()) {
                return 1;
            }
        }
        return iM66636k4;
    }

    public int hashCode() {
        int iHashCode;
        if (this.f47227dq == 0) {
            C11697x1 c11697x1M55250kk = C11697x1.m55250kk();
            if (this.f47226bv) {
                iHashCode = (((C14113y2.m67398k4(this.f47232ne, c11697x1M55250kk).hashCode() ^ C14113y2.m67398k4(this.f47241x6, c11697x1M55250kk).hashCode()) ^ this.f47229ix) ^ this.f47237uz.hashCode()) ^ this.f47235u4.hashCode();
            } else {
                iHashCode = this.f47234rv.hashCode();
            }
            this.f47227dq = iHashCode;
        }
        return this.f47227dq;
    }

    /* JADX INFO: renamed from: ix */
    public boolean m66683ix() {
        return this.f47226bv;
    }

    /* JADX INFO: renamed from: kk */
    public String m66688kk() {
        m66623bv();
        int iM66628dy = m66628dy(m66689ks());
        int i = this.f47229ix;
        return iM66628dy == i ? this.f47232ne : C14113y2.m67407k4(this.f47232ne, C18241k5.f55433h, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ks */
    public String m66689ks() {
        m66623bv();
        return this.f47241x6;
    }

    /* JADX INFO: renamed from: ne */
    public String m66691ne() {
        m66623bv();
        String strM66678du = m66678du();
        if (m66681h4() == 4) {
            strM66678du = C14113y2.m67443x1(m66678du(), 1, m66678du().length() - 2);
            long j = this.f47238v4;
            if (j != 0) {
                strM66678du = C14113y2.m67400k4(strM66678du, C14113y2.m67408k4("%", C14091t6.m67191x1(j)));
            }
        }
        return m66682h4(strM66678du);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX INFO: renamed from: rv */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] m66692rv() {
        m66623bv();
        if (this.f47235u4.length() == 0) {
            return f47205c6;
        }
        List<String> list = this.f47231lr;
        int i = 0;
        if (list != null) {
            String[] strArr = new String[list.size()];
            while (i < this.f47231lr.size()) {
                strArr[i] = this.f47231lr.get_Item(i);
                i++;
            }
            return strArr;
        }
        List<String> list2 = new List<>();
        C6765kp c6765kp = new C6765kp();
        int i2 = 0;
        while (i2 < this.f47235u4.length()) {
            char cCharAt = this.f47235u4.charAt(i2);
            if (cCharAt != '%') {
                if (cCharAt == '/' || cCharAt == '\\') {
                    c6765kp.m26780k4(this.f47235u4.charAt(i2));
                    list2.addItem(c6765kp.toString());
                    c6765kp.m26801k4(0);
                } else {
                    c6765kp.m26780k4(this.f47235u4.charAt(i2));
                }
            } else if (i2 >= this.f47235u4.length() - 2 || this.f47235u4.charAt(i2 + 1) != '5') {
                c6765kp.m26780k4('%');
            } else {
                int i3 = i2 + 2;
                if (this.f47235u4.charAt(i3) == 'C') {
                    c6765kp.m26792k4("%5C");
                    list2.addItem(c6765kp.toString());
                    c6765kp.m26801k4(0);
                    i2 = i3;
                }
            }
            i2++;
        }
        if (c6765kp.m26807x1() > 0) {
            list2.addItem(c6765kp.toString());
        }
        if (m66679dy() && list2.size() > 0) {
            String str = list2.get_Item(0);
            if (str.length() > 1 && str.charAt(1) == ':') {
                list2.insertItem(0, "/");
            }
        }
        this.f47231lr = list2;
        String[] strArr2 = new String[list2.size()];
        while (i < list2.size()) {
            strArr2[i] = this.f47231lr.get_Item(i);
            i++;
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: to */
    public String m66693to() {
        m66623bv();
        return this.f47239wl;
    }

    public String toString() {
        String str;
        String str2 = this.f47240wy;
        if (str2 != null) {
            return str2;
        }
        if (this.f47226bv) {
            String strM66641k4 = m66641k4(m66687k4(2), true);
            this.f47240wy = strM66641k4;
            String[] strArr = {strM66641k4};
            m66646k4(strArr);
            str = strArr[0];
        } else {
            str = this.f47235u4;
        }
        this.f47240wy = str;
        return this.f47240wy;
    }

    /* JADX INFO: renamed from: u4 */
    public String m66694u4() {
        String str = this.f47234rv;
        return str != null ? str : toString();
    }

    /* JADX INFO: renamed from: up */
    public int m66695up() {
        m66623bv();
        return this.f47229ix;
    }

    /* JADX INFO: renamed from: uz */
    public boolean m66696uz() {
        return C14113y2.m67363du(m66639k4(m66694u4(), f47216qm), m66694u4());
    }

    /* JADX INFO: renamed from: x1 */
    public String m66697x1() {
        m66623bv();
        if (this.f47225b3 == null) {
            this.f47225b3 = m66687k4(2);
            if (this.f47237uz.length() > 0) {
                this.f47225b3 = C14113y2.m67400k4(this.f47225b3, this.f47237uz);
            }
            if (this.f47239wl.length() > 0) {
                this.f47225b3 = C14113y2.m67400k4(this.f47225b3, this.f47239wl);
            }
        }
        return this.f47225b3;
    }

    /* JADX INFO: renamed from: x6 */
    public String m66698x6() {
        m66623bv();
        String str = this.f47233qq;
        return str == null ? C14113y2.f47374k4 : str;
    }

    /* JADX INFO: renamed from: yj */
    public String m66699yj() {
        m66623bv();
        return this.f47237uz;
    }

    public C14062gk(String str) {
        this(str, false);
    }

    /* JADX INFO: renamed from: ck */
    public static String m66625ck(String str) {
        return m66671x1(str, false);
    }

    @Deprecated
    /* JADX INFO: renamed from: du */
    public static String m66626du(String str) {
        return m66639k4(str, f47210fa);
    }

    /* JADX INFO: renamed from: fa */
    private static boolean m66629fa(String str) {
        if (str.length() > 2 && str.matches("[a-zA-Z]:.*") && !str.matches("[a-zA-Z]:\\\\.*") && !str.matches("[a-zA-Z]:/.*")) {
            throw new UriFormatException();
        }
        if (str.matches("[a-zA-Z]\\|.*")) {
            throw new UriFormatException();
        }
        if ((str.length() > 3 && ((str.startsWith("/") || str.startsWith("\\")) && (str.matches("[\\\\]{2}[\\\\/]+.*") || str.matches("[\\\\/]+/@[^/]*")))) || str.matches("//[a-zA-Z].*")) {
            return true;
        }
        if (str.matches("//.*")) {
            throw new UriFormatException();
        }
        return false;
    }

    /* JADX INFO: renamed from: ix */
    private static boolean m66631ix(String str) {
        if (str != null && str.length() >= 4) {
            char cCharAt = str.charAt(0);
            if (cCharAt == 'h') {
                return "http".equals(str) || AuthenticationConstants.HTTPS_PROTOCOL_STRING.equals(str);
            }
            if (cCharAt == 'f' && "file".equals(str)) {
                return true;
            }
            if (cCharAt == 'n') {
                return "net.pipe".equals(str) || "net.tcp".equals(str);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m66634k4(byte b) {
        char c = (char) (b & 255);
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: kk */
    private static String m66653kk(String str, boolean z) {
        if ("/".equals(str)) {
            return str;
        }
        String strM67393k4 = (!z || C14113y2.m67429to(str, '%') == -1) ? C14113y2.m67393k4(str, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX) : m66664u4(str);
        List<String> list = new List();
        int i = 0;
        boolean z2 = true;
        while (i < strM67393k4.length()) {
            int iM67434x1 = C14113y2.m67434x1(strM67393k4, IOUtils.DIR_SEPARATOR_UNIX, i);
            if (iM67434x1 == -1) {
                iM67434x1 = strM67393k4.length();
            }
            String strM67443x1 = C14113y2.m67443x1(strM67393k4, i, iM67434x1 - i);
            int i2 = iM67434x1 + 1;
            if ((!z2 || strM67443x1.length() != 0) && !".".equals(strM67443x1)) {
                if ("..".equals(strM67443x1)) {
                    int size = list.size();
                    if (size != 0) {
                        list.removeAt(size - 1);
                    }
                } else {
                    list.addItem(strM67443x1);
                }
            }
            z2 = false;
            i = i2;
        }
        if (list.size() == 0) {
            return "/";
        }
        C6765kp c6765kp = new C6765kp();
        if (strM67393k4.charAt(0) == '/') {
            c6765kp.m26780k4(IOUtils.DIR_SEPARATOR_UNIX);
        }
        boolean z3 = true;
        for (String str2 : list) {
            if (z3) {
                z3 = false;
            } else {
                c6765kp.m26780k4(IOUtils.DIR_SEPARATOR_UNIX);
            }
            c6765kp.m26792k4(str2);
        }
        if (OooO0O0.OooO00o(1, strM67393k4) == '/') {
            c6765kp.m26780k4(IOUtils.DIR_SEPARATOR_UNIX);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: ks */
    private void m66657ks(String str) {
        this.f47230ks = true;
        this.f47241x6 = f47220x1;
        this.f47229ix = -1;
        String str2 = C14113y2.f47374k4;
        this.f47239wl = str2;
        this.f47237uz = str2;
        this.f47232ne = str2;
        this.f47235u4 = null;
        if (str.length() >= 2 && str.charAt(0) == '/' && str.charAt(1) == '/') {
            str = C14113y2.m67431to(str, IOUtils.DIR_SEPARATOR_UNIX);
            this.f47235u4 = C14113y2.m67407k4(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), str);
        }
        if (this.f47235u4 == null) {
            this.f47235u4 = str;
        }
    }

    /* JADX INFO: renamed from: ne */
    private static boolean m66659ne(String str) {
        String[] strArrM66661rv = m66661rv(str);
        if (strArrM66661rv == null) {
            return false;
        }
        String str2 = strArrM66661rv[1];
        String str3 = strArrM66661rv[2];
        String str4 = strArrM66661rv[3];
        String str5 = strArrM66661rv[4];
        return ((!((str2 != null && str2.length() > 0) || ((str3 != null && str3.length() > 0) || ((str4 != null && str4.length() > 0) || (str5 != null && str5.length() > 0)))) && !(str2 != null && str3 != null && str4 != null)) || (str2 == null && str3 != null && str3.length() > 0 && str4 == null && str5 != null) || ((str2 == null || str2.length() == 0) && ((str3 == null || str3.length() == 0) && ((str4 == null || str4.length() == 0) && str5 != null)))) ? false : true;
    }

    /* JADX INFO: renamed from: rv */
    private static String[] m66661rv(String str) {
        Matcher matcher = Pattern.compile(C14119yo.f47383to.toString()).matcher(str);
        if (matcher.matches()) {
            return new String[]{matcher.group(2), matcher.group(4), matcher.group(5), matcher.group(7), matcher.group(9)};
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m66662to(char c) {
        if (c >= 'A' && c <= 'Z') {
            return false;
        }
        if (c < 'a' || c > 'z') {
            return ((c >= '0' && c <= '9') || c == '_' || c == '~' || c == '!' || c == '\'' || c == '(' || c == ')' || c == '*' || c == '-' || c == '.') ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u4 */
    private static String m66664u4(String str) {
        C6765kp c6765kp = new C6765kp();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '%') {
                if (cCharAt == '\\') {
                    cCharAt = '/';
                }
            } else if (i < str.length() - 2) {
                char cCharAt2 = str.charAt(i + 1);
                int i2 = i + 2;
                char cM67521ix = C14117yj.m67521ix(str.charAt(i2));
                if (cCharAt2 == '2' && cM67521ix == 'E') {
                    cCharAt = FilenameUtils.EXTENSION_SEPARATOR;
                } else if ((cCharAt2 == '2' && cM67521ix == 'F') || (cCharAt2 == '5' && cM67521ix == 'C')) {
                    cCharAt = '/';
                }
                i = i2;
            }
            c6765kp.m26780k4(cCharAt);
            i++;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: up */
    private void m66666up(String str) {
        this.f47241x6 = f47220x1;
        this.f47229ix = -1;
        String str2 = C14113y2.f47374k4;
        this.f47239wl = str2;
        this.f47237uz = str2;
        this.f47224ar = true;
        String strM67431to = C14113y2.m67431to(str, IOUtils.DIR_SEPARATOR_WINDOWS);
        int iM67429to = C14113y2.m67429to(strM67431to, IOUtils.DIR_SEPARATOR_WINDOWS);
        if (iM67429to > 0) {
            this.f47235u4 = C14113y2.m67422kk(strM67431to, iM67429to);
            this.f47232ne = C14113y2.m67443x1(strM67431to, 0, iM67429to);
        } else {
            this.f47232ne = strM67431to;
            this.f47235u4 = C14113y2.f47374k4;
        }
        this.f47226bv = false;
        this.f47235u4 = C14113y2.m67401k4(this.f47235u4, "\\", "/");
    }

    /* JADX INFO: renamed from: uz */
    private static boolean m66667uz(String str) {
        if (str != null && str.length() >= 3) {
            char cCharAt = str.charAt(0);
            if (cCharAt == 'h') {
                return "http".equals(str) || AuthenticationConstants.HTTPS_PROTOCOL_STRING.equals(str);
            }
            if (cCharAt == 'f') {
                return "file".equals(str) || "ftp".equals(str);
            }
            if (cCharAt == 'n') {
                return str.charAt(1) == 'e' ? "news".equals(str) || "net.pipe".equals(str) || "net.tcp".equals(str) : "nntp".equals(str);
            }
            if ((cCharAt == 'g' && "gopher".equals(str)) || (cCharAt == 'm' && "mailto".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m66669x1(char c) {
        if (c <= 255) {
            return C14113y2.m67407k4("%", Character.valueOf(f47221xk.charAt((c & 240) >> 4)), Character.valueOf(f47221xk.charAt(c & 15)));
        }
        throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.CHARACTER);
    }

    /* JADX INFO: renamed from: x6 */
    private static boolean m66674x6(String str) {
        String[] strArrM66661rv = m66661rv(str);
        if (strArrM66661rv == null) {
            return false;
        }
        String str2 = strArrM66661rv[0];
        String str3 = strArrM66661rv[1];
        String str4 = strArrM66661rv[2];
        String str5 = strArrM66661rv[3];
        String str6 = strArrM66661rv[4];
        return (((str3 != null && str3.length() > 0) || ((str4 != null && str4.length() > 0) || ((str5 != null && str5.length() > 0) || (str6 != null && str6.length() > 0)))) || (str3 != null && str4 != null)) && !(str3 == null && str4 != null && str4.matches("[a-zA-Z][\\|].*")) && (str2 == null || str2.length() == 0);
    }

    /* JADX INFO: renamed from: yj */
    private String m66675yj(String str) {
        if (str.length() > 2 && str.charAt(2) != '\\' && str.charAt(2) != '/') {
            return "Relative file path is not allowed.";
        }
        this.f47241x6 = f47220x1;
        this.f47232ne = C14113y2.f47374k4;
        this.f47229ix = -1;
        this.f47235u4 = C14113y2.m67401k4(str, "\\", "/");
        String str2 = C14113y2.f47374k4;
        this.f47239wl = str2;
        this.f47237uz = str2;
        return null;
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m66676c5() {
        m66623bv();
        if (m66678du().length() == 0) {
            return m66679dy();
        }
        if ("loopback".equals(this.f47232ne) || "localhost".equals(this.f47232ne)) {
            return true;
        }
        C3842k4[] c3842k4Arr = {null};
        boolean zM15383k4 = C3842k4.m15383k4(this.f47232ne, c3842k4Arr);
        C3842k4 c3842k4 = c3842k4Arr[0];
        if (zM15383k4 && C3842k4.f10484kk.equals(c3842k4)) {
            return true;
        }
        C3843x1[] c3843x1Arr = {null};
        return C3843x1.m15398k4(this.f47232ne, c3843x1Arr) && C3843x1.m15396k4(c3843x1Arr[0]);
    }

    /* JADX INFO: renamed from: dy */
    public boolean m66679dy() {
        m66623bv();
        return C14113y2.m67363du(m66689ks(), f47220x1);
    }

    @Deprecated
    /* JADX INFO: renamed from: h4 */
    public String m66682h4(String str) {
        return m66642k4(str, false, false);
    }

    /* JADX INFO: renamed from: jd */
    public boolean m66684jd() {
        m66623bv();
        return this.f47224ar;
    }

    /* JADX INFO: renamed from: m9 */
    public boolean m66690m9() {
        m66623bv();
        return m66628dy(m66689ks()) == this.f47229ix;
    }

    public C14062gk(String str, int i) {
        String str2 = C14113y2.f47374k4;
        this.f47241x6 = str2;
        this.f47232ne = str2;
        this.f47229ix = -1;
        this.f47235u4 = str2;
        this.f47237uz = str2;
        this.f47239wl = str2;
        this.f47226bv = true;
        this.f47234rv = str;
        m66643k4(i, k4.Construct);
        if (i != 0) {
            if (i == 1) {
                if (!m66683ix()) {
                    throw new UriFormatException(C14113y2.m67408k4("Invalid URI: The format of the URI could not be ", "determined."));
                }
            } else {
                if (i != 2) {
                    throw new ArgumentException(C14113y2.m67402k4("Invalid UriKind value '{0}'.", Integer.valueOf(i)));
                }
                if (m66683ix()) {
                    throw new UriFormatException(C14113y2.m67408k4("Invalid URI: The format of the URI could not be ", "determined because the parameter 'uriString' represents an absolute URI."));
                }
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public static boolean m66627du(char c) {
        if (c >= 'A' && c <= 'Z') {
            return false;
        }
        if (c < 'a' || c > 'z') {
            return ((c >= '&' && c <= ';') || c == '!' || c == '#' || c == '$' || c == '=' || c == '?' || c == '@' || c == '_' || c == '~') ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    private static boolean m66630h4(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66635k4(char c) {
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        if ('a' <= c && c <= 'f') {
            return c - 'W';
        }
        if ('A' > c || c > 'F') {
            throw new ArgumentException("digit");
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: to */
    public static boolean m66663to(String str) {
        if (str == null || str.length() == 0 || !m66630h4(str.charAt(0))) {
            return false;
        }
        int length = str.length();
        for (int i = 1; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (!C14117yj.m67539to(cCharAt) && !m66630h4(cCharAt) && cCharAt != '.' && cCharAt != '+' && cCharAt != '-') {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0389 A[PHI: r12
      0x0389: PHI (r12v8 int) = (r12v6 int), (r12v5 int) binds: [B:249:0x0387, B:241:0x0376] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04aa  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m66670x1(int i, String str, k4 k4Var) {
        boolean z;
        int i2;
        int i3;
        int iM67435x1;
        int i4;
        int iM67435x12;
        int i5;
        int iM67373k4;
        int i6;
        String strM67408k4;
        String strM67537ne;
        UriFormatException uriFormatException;
        int i7;
        int i8;
        int iM67435x13;
        String strM67440x1 = C14113y2.m67440x1(str);
        int length = strM67440x1.length();
        if (length == 0 && (i == 2 || i == 0)) {
            this.f47226bv = false;
            return null;
        }
        if (length <= 1 && i == 1) {
            return "Absolute URI is too short";
        }
        if (strM67440x1.charAt(0) == '/' && C3141rv.f9302kk == '/') {
            m66657ks(strM67440x1);
            if (i == 2) {
                this.f47226bv = false;
            }
            return null;
        }
        if (strM67440x1.length() >= 2 && strM67440x1.charAt(0) == '\\' && strM67440x1.charAt(1) == '\\') {
            m66666up(strM67440x1);
            if (i == 1) {
                this.f47226bv = true;
            }
            return null;
        }
        if (strM67440x1.startsWith("file:") && C14113y2.m67364dy(strM67440x1, "\\\\") > 0) {
            this.f47241x6 = f47220x1;
            this.f47229ix = -1;
            String str2 = C14113y2.f47374k4;
            this.f47239wl = str2;
            this.f47237uz = str2;
            this.f47224ar = true;
            if (i == 1) {
                this.f47226bv = true;
            }
            String strReplace = strM67440x1.replace("file:", "");
            if (strReplace.startsWith("/")) {
                strReplace = C14113y2.m67431to(strReplace, IOUtils.DIR_SEPARATOR_UNIX);
            }
            String strM67431to = C14113y2.m67431to(strReplace, IOUtils.DIR_SEPARATOR_WINDOWS);
            int iM67429to = C14113y2.m67429to(strM67431to, IOUtils.DIR_SEPARATOR_WINDOWS);
            if (iM67429to > 0) {
                this.f47235u4 = C14113y2.m67422kk(strM67431to, iM67429to);
                this.f47232ne = C14113y2.m67443x1(strM67431to, 0, iM67429to);
            } else {
                this.f47232ne = strM67431to;
                this.f47235u4 = C14113y2.f47374k4;
            }
            this.f47235u4 = C14113y2.m67401k4(this.f47235u4, "\\", "/");
            return null;
        }
        int iM67429to2 = C14113y2.m67429to(strM67440x1, ':');
        if (iM67429to2 == 0) {
            if (i == 1) {
                return "Invalid URI: The format of the URI could not be determined.";
            }
            this.f47226bv = false;
            this.f47235u4 = strM67440x1;
            return null;
        }
        if (iM67429to2 < 0) {
            this.f47226bv = false;
            this.f47235u4 = strM67440x1;
            if (k4Var == k4.WellFormed) {
                if (m66659ne(strM67440x1)) {
                    return null;
                }
            } else if (k4Var != k4.Construct || m66674x6(strM67440x1)) {
                return null;
            }
            return "Not match to the RFC 2396";
        }
        if (iM67429to2 == 1) {
            if (m66630h4(strM67440x1.charAt(0))) {
                String strM66675yj = m66675yj(strM67440x1);
                if (strM66675yj != null) {
                    return strM66675yj;
                }
                return null;
            }
            if (i == 1) {
                return "Invalid URI: The URI scheme is not valid.";
            }
            this.f47226bv = false;
            this.f47235u4 = strM67440x1;
            return null;
        }
        String strM67398k4 = C14113y2.m67398k4(C14113y2.m67443x1(strM67440x1, 0, iM67429to2), C11697x1.m55250kk());
        this.f47241x6 = strM67398k4;
        if (!m66663to(strM67398k4)) {
            if (i == 1) {
                return "Invalid URI: The URI scheme is not valid.";
            }
            this.f47226bv = false;
            this.f47235u4 = strM67440x1;
            if (m66674x6(strM67440x1)) {
                return null;
            }
            return "Not match to the RFC 2396";
        }
        int i9 = iM67429to2 + 1;
        int length2 = strM67440x1.length();
        int iM67434x1 = C14113y2.m67434x1(strM67440x1, '#', i9);
        if (!m66684jd() && iM67434x1 != -1) {
            if (this.f47242yd) {
                this.f47239wl = C14113y2.m67422kk(strM67440x1, iM67434x1);
            } else {
                this.f47239wl = C14113y2.m67408k4("#", m66626du(C14113y2.m67422kk(strM67440x1, iM67434x1 + 1)));
            }
            length2 = iM67434x1;
        }
        if (C14113y2.m67363du(this.f47241x6, f47208dy)) {
            int length3 = this.f47241x6.length() + 1;
            this.f47235u4 = m66639k4(C14113y2.m67443x1(strM67440x1, length3, length2 - length3), f47209e0);
            return null;
        }
        if (m66660qq() && (iM67435x13 = C14113y2.m67435x1(strM67440x1, '?', i9, length2 - i9)) != -1) {
            String strM67443x1 = C14113y2.m67443x1(strM67440x1, iM67435x13, length2 - iM67435x13);
            this.f47237uz = strM67443x1;
            if (!this.f47242yd) {
                this.f47237uz = m66626du(strM67443x1);
            }
            length2 = iM67435x13;
        }
        if (k4Var != k4.TryCreate && i != 1 && m66667uz(this.f47241x6) && !C14113y2.m67363du(this.f47241x6, f47215m9) && !C14113y2.m67363du(this.f47241x6, f47208dy) && ((i8 = length2 - i9) < 2 || (i8 >= 2 && strM67440x1.charAt(i9) == '/' && strM67440x1.charAt(iM67429to2 + 2) != '/'))) {
            this.f47226bv = false;
            return null;
        }
        if (m66667uz(this.f47241x6) && !C14113y2.m67363du(this.f47241x6, f47215m9) && ((i7 = length2 - i9) < 2 || (i7 >= 2 && strM67440x1.charAt(i9) == '/' && strM67440x1.charAt(iM67429to2 + 2) != '/'))) {
            return "Invalid URI: The Authority/Host could not be parsed.";
        }
        int i10 = length2 - i9;
        if (i10 >= 2 && strM67440x1.charAt(i9) == '/' && strM67440x1.charAt(iM67429to2 + 2) == '/') {
            z = true;
            i2 = 0;
        } else {
            z = false;
            i2 = 0;
        }
        int i11 = (C14113y2.m67363du(this.f47241x6, f47220x1) && z && (i10 == 2 || strM67440x1.charAt(iM67429to2 + 3) == '/')) ? 1 : i2;
        if (z) {
            if (i == 2) {
                return "Absolute URI when we expected a relative one";
            }
            if (!C14113y2.m67363du(this.f47241x6, f47215m9)) {
                i9 = iM67429to2 + 3;
            }
            if (C14113y2.m67363du(this.f47241x6, f47220x1)) {
                int i12 = 2;
                for (int i13 = i9; i13 < length2 && strM67440x1.charAt(i13) == '/'; i13++) {
                    i12++;
                }
                if (i12 >= 4) {
                    while (i9 < length2 && strM67440x1.charAt(i9) == '/') {
                        i9++;
                    }
                    i11 = i2;
                } else if (i12 >= 3) {
                    i9++;
                }
            }
            if (length2 - i9 > 1 && strM67440x1.charAt(i9 + 1) == ':') {
                i3 = 1;
                i11 = i2;
            }
            if (i11 == 0) {
                iM67435x1 = -1;
                i4 = -1;
            } else {
                int i14 = length2 - i9;
                iM67435x1 = C14113y2.m67435x1(strM67440x1, IOUtils.DIR_SEPARATOR_UNIX, i9, i14);
                i4 = -1;
                if (iM67435x1 == -1 && i3 != 0) {
                    iM67435x1 = C14113y2.m67435x1(strM67440x1, IOUtils.DIR_SEPARATOR_WINDOWS, i9, i14);
                }
            }
            if (iM67435x1 == i4) {
                this.f47235u4 = C14113y2.m67443x1(strM67440x1, iM67435x1, length2 - iM67435x1);
                if (!m66660qq()) {
                    if (!C14113y2.m67363du(this.f47241x6, f47204c5)) {
                        this.f47235u4 = C14113y2.m67393k4(this.f47235u4, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
                    }
                    this.f47235u4 = m66639k4(this.f47235u4, f47209e0);
                }
                length2 = iM67435x1;
            } else if (!C14113y2.m67363du(this.f47241x6, f47215m9)) {
                this.f47235u4 = "/";
            }
            iM67435x12 = i11 == 0 ? -1 : C14113y2.m67435x1(strM67440x1, '@', i9, length2 - i9);
            i5 = -1;
            if (iM67435x12 != -1) {
                if (C14113y2.m67363du(this.f47241x6, f47220x1)) {
                    return "Invalid host";
                }
                this.f47233qq = C14113y2.m67443x1(strM67440x1, i9, iM67435x12 - i9);
                i9 = iM67435x12 + 1;
                i5 = -1;
            }
            this.f47229ix = i5;
            iM67373k4 = i11 == 0 ? i5 : C14113y2.m67373k4(strM67440x1, ':', length2 - 1, length2 - i9);
            if (iM67373k4 != i5 || iM67373k4 == length2 - 1) {
                if (!m66679dy()) {
                    if (iM67373k4 == length2 - 1) {
                        length2--;
                    }
                    if (this.f47229ix == -1) {
                        this.f47229ix = m66628dy(this.f47241x6);
                    }
                }
                i6 = 1;
            } else {
                int i15 = iM67373k4 + 1;
                String strM67443x12 = C14113y2.m67443x1(strM67440x1, i15, length2 - i15);
                if (strM67443x12.length() <= 0 || OooO0O0.OooO00o(1, strM67443x12) == ']') {
                    if (this.f47229ix == -1) {
                    }
                    i6 = 1;
                } else {
                    int[] iArr = {this.f47229ix};
                    boolean zM66589k4 = C14057f9.m66589k4(strM67443x12, 7, C11697x1.m55250kk(), iArr);
                    if (zM66589k4) {
                        this.f47229ix = iArr[i2];
                    }
                    int i16 = ((zM66589k4 || this.f47229ix >= 0) && this.f47229ix <= 65535) ? i2 : 1;
                    if (i16 == 0) {
                        length2 = iM67373k4;
                    }
                    i6 = i16 ^ 1;
                }
            }
            String strM67443x13 = C14113y2.m67443x1(strM67440x1, i9, length2 - i9);
            this.f47232ne = strM67443x13;
            if (i11 == 0) {
                strM67408k4 = m66653kk(C14113y2.m67407k4(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), strM67443x13), true);
            } else if (strM67443x13.length() != 2 || this.f47232ne.charAt(1) != ':') {
                if (this.f47230ks) {
                    C14113y2.m67408k4("//", strM67443x13);
                    strM67537ne = C14113y2.f47374k4;
                    this.f47232ne = strM67537ne;
                    if (this.f47232ne.length() > 0) {
                        int iM66636k4 = m66636k4(this.f47232ne);
                        if (iM66636k4 == 0) {
                            if (this.f47232ne.charAt(0) == ':' || this.f47232ne.charAt(0) == '@') {
                                return "Invalid URI: The hostname could not be parsed.";
                            }
                            if (C14113y2.m67429to(this.f47232ne, ':') != -1) {
                                return "Invalid URI: Invalid port specified.";
                            }
                        } else if (iM66636k4 == 4) {
                            C3843x1[] c3843x1Arr = {null};
                            boolean zM15398k4 = C3843x1.m15398k4(this.f47232ne, c3843x1Arr);
                            C3843x1 c3843x1 = c3843x1Arr[0];
                            if (zM15398k4) {
                                this.f47232ne = "[" + c3843x1.m15399k4(true) + "]";
                                this.f47238v4 = c3843x1.m15404x1();
                            }
                        }
                    }
                    if (i6 == 0) {
                        return "Invalid URI: Invalid port number";
                    }
                    if (m66665um() != null) {
                        UriFormatException[] uriFormatExceptionArr = {null};
                        m66665um().m67568k4(this, uriFormatExceptionArr);
                        uriFormatException = uriFormatExceptionArr[0];
                    } else {
                        uriFormatException = null;
                    }
                    if (uriFormatException != null) {
                        return uriFormatException.getMessage();
                    }
                    if (!C14113y2.m67363du(this.f47241x6, f47215m9) && !C14113y2.m67363du(this.f47241x6, f47220x1)) {
                        this.f47235u4 = m66653kk(this.f47235u4, m66631ix(this.f47241x6));
                    }
                    return null;
                }
                if (C14113y2.m67363du(this.f47241x6, f47220x1)) {
                    this.f47224ar = f47218ts;
                } else if (this.f47232ne.length() == 0 && (C14113y2.m67363du(this.f47241x6, f47207du) || C14113y2.m67363du(this.f47241x6, f47217to) || C14113y2.m67363du(this.f47241x6, f47204c5) || C14113y2.m67363du(this.f47241x6, f47211h4) || C14113y2.m67363du(this.f47241x6, f47214kk))) {
                    return "Invalid URI: The Authority/Host could not be parsed.";
                }
                if (this.f47232ne.length() > 0) {
                }
                if (i6 == 0) {
                }
            } else if (C14113y2.m67363du(this.f47241x6, f47220x1)) {
                strM67408k4 = C14113y2.m67408k4(this.f47232ne, this.f47235u4);
            } else {
                strM67537ne = C14117yj.m67537ne(this.f47232ne.charAt(i2));
                this.f47232ne = strM67537ne;
                if (this.f47232ne.length() > 0) {
                }
                if (i6 == 0) {
                }
            }
            this.f47235u4 = strM67408k4;
            strM67537ne = C14113y2.f47374k4;
            this.f47232ne = strM67537ne;
            if (this.f47232ne.length() > 0) {
            }
            if (i6 == 0) {
            }
        } else if (!m66667uz(this.f47241x6)) {
            this.f47235u4 = C14113y2.m67443x1(strM67440x1, i9, i10);
            this.f47236um = true;
            return null;
        }
        i3 = i2;
        if (i11 == 0) {
        }
        if (iM67435x1 == i4) {
        }
        if (i11 == 0) {
        }
        i5 = -1;
        if (iM67435x12 != -1) {
        }
        this.f47229ix = i5;
        if (i11 == 0) {
        }
        if (iM67373k4 != i5) {
            if (!m66679dy()) {
            }
            i6 = 1;
        }
        String strM67443x132 = C14113y2.m67443x1(strM67440x1, i9, length2 - i9);
        this.f47232ne = strM67443x132;
        if (i11 == 0) {
        }
        this.f47235u4 = strM67408k4;
        strM67537ne = C14113y2.f47374k4;
        this.f47232ne = strM67537ne;
        if (this.f47232ne.length() > 0) {
        }
        if (i6 == 0) {
        }
    }

    private C14062gk(String str, int i, boolean[] zArr, k4 k4Var) {
        String str2 = C14113y2.f47374k4;
        this.f47241x6 = str2;
        this.f47232ne = str2;
        this.f47229ix = -1;
        this.f47235u4 = str2;
        this.f47237uz = str2;
        this.f47239wl = str2;
        this.f47226bv = true;
        if (str == null) {
            zArr[0] = false;
            return;
        }
        if (i != 0 && i != 1 && i != 2) {
            throw new ArgumentException(C14113y2.m67402k4("Invalid UriKind value '{0}'.", Integer.valueOf(i)));
        }
        this.f47234rv = str;
        if (m66670x1(i, str, k4Var) != null) {
            zArr[0] = false;
            return;
        }
        zArr[0] = true;
        if (!this.f47242yd) {
            String strM66640k4 = m66640k4(this.f47232ne, f47203bz, false);
            this.f47232ne = strM66640k4;
            if (strM66640k4.length() > 1 && this.f47232ne.charAt(0) != '[' && OooO0O0.OooO00o(1, this.f47232ne) != ']') {
                this.f47232ne = C14113y2.m67398k4(this.f47232ne, C11697x1.m55250kk());
            }
            if (this.f47226bv && this.f47235u4.length() > 0) {
                this.f47235u4 = m66626du(this.f47235u4);
            }
        }
        if (i != 0) {
            if (i == 1) {
                if (m66683ix()) {
                    return;
                }
                zArr[0] = false;
            } else if (i != 2) {
                zArr[0] = false;
            } else if (m66683ix()) {
                zArr[0] = false;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66636k4(String str) {
        if (str != null && str.length() != 0) {
            if (m66673x1(str)) {
                return 3;
            }
            if (m66656kk(str)) {
                return 2;
            }
            if (C3843x1.m15398k4(str, new C3843x1[]{null})) {
                return 4;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m66637k4(String str, int i, int i2, boolean z) {
        char c;
        int iM66634k4;
        int i3 = i2 + i;
        if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            int i4 = 0;
            while (i < i3) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 127 || (iM66634k4 = m66634k4((byte) cCharAt)) == -1) {
                    return -1;
                }
                i4 = (i4 << 4) + iM66634k4;
                i++;
            }
            if (!z || ((c = (char) i4) != '#' && c != '/' && c != '\\' && c != '%' && c != '&' && c != '?' && c != '@')) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m66654kk(char c) {
        if ('0' <= c && c <= '9') {
            return true;
        }
        if ('a' > c || c > 'f') {
            return 'A' <= c && c <= 'F';
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public C14062gk m66685k4(C14062gk c14062gk) {
        if (!C14113y2.m67363du(m66678du() + C18241k5.f55433h + m66695up(), c14062gk.m66678du() + C18241k5.f55433h + c14062gk.m66695up()) || !C14113y2.m67363du(m66689ks(), c14062gk.m66689ks())) {
            return c14062gk;
        }
        String strM67400k4 = C14113y2.f47374k4;
        if (!C14113y2.m67363du(this.f47235u4, c14062gk.f47235u4)) {
            String[] strArrM66692rv = m66692rv();
            String[] strArrM66692rv2 = c14062gk.m66692rv();
            int iMin = Math.min(strArrM66692rv.length, strArrM66692rv2.length);
            int i = 0;
            while (i < iMin && C14113y2.m67363du(strArrM66692rv[i], strArrM66692rv2[i])) {
                i++;
            }
            for (int i2 = i + 1; i2 < strArrM66692rv.length; i2++) {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, "../");
            }
            while (i < strArrM66692rv2.length) {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, strArrM66692rv2[i]);
                i++;
            }
            if (strM67400k4.length() == 0 && strArrM66692rv[strArrM66692rv.length - 1].endsWith("/")) {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, "../");
            }
        }
        String[] strArr = {strM67400k4};
        c14062gk.m66646k4(strArr);
        return new C14062gk(strArr[0], 2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14062gk m66638k4(URI uri) {
        if (uri == null) {
            return null;
        }
        return new C14062gk(uri.toString());
    }

    /* JADX INFO: renamed from: kk */
    private boolean m66655kk(C14062gk c14062gk) {
        boolean z = this.f47226bv;
        if (z != c14062gk.f47226bv) {
            return false;
        }
        if (!z) {
            return C14113y2.m67363du(this.f47234rv, c14062gk.f47234rv);
        }
        C11697x1 c11697x1M55250kk = C11697x1.m55250kk();
        return C14113y2.m67363du(C14113y2.m67398k4(this.f47241x6, c11697x1M55250kk), C14113y2.m67398k4(c14062gk.f47241x6, c11697x1M55250kk)) && C14113y2.m67363du(C14113y2.m67398k4(this.f47232ne, c11697x1M55250kk), C14113y2.m67398k4(c14062gk.f47232ne, c11697x1M55250kk)) && this.f47229ix == c14062gk.f47229ix && C14113y2.m67363du(this.f47237uz, c14062gk.f47237uz) && C14113y2.m67363du(this.f47235u4, c14062gk.f47235u4);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m66671x1(String str, boolean z) {
        if (str == null) {
            throw new ArgumentNullException("stringToUnescape");
        }
        if (C14113y2.m67429to(str, '%') == -1 && C14113y2.m67429to(str, '+') == -1) {
            return str;
        }
        C6765kp c6765kp = new C6765kp();
        long length = str.length();
        C3152yj c3152yj = new C3152yj();
        int i = 0;
        while (i < length) {
            if (str.charAt(i) == '%') {
                int i2 = i + 2;
                if (i2 < length) {
                    int i3 = i + 1;
                    if (str.charAt(i3) != '%') {
                        int iM66637k4 = m66637k4(str, i3, 2, z);
                        if (iM66637k4 != -1) {
                            c3152yj.writeByte((byte) iM66637k4);
                            i = i2;
                        } else {
                            if (!z) {
                                throw new UriFormatException();
                            }
                            c6765kp.m26780k4('%');
                        }
                    } else {
                        if (str.charAt(i) == '%') {
                            throw new UriFormatException();
                        }
                        if (c3152yj.getLength() > 0) {
                            c6765kp.m26798k4(m66652k4(c3152yj, AbstractC6747ar.m26635ix()));
                            c3152yj.setLength(0L);
                        }
                        c6765kp.m26780k4(str.charAt(i));
                    }
                }
            }
            i++;
        }
        if (c3152yj.getLength() > 0) {
            c6765kp.m26798k4(m66652k4(c3152yj, AbstractC6747ar.m26635ix()));
        }
        return c6765kp.toString();
    }

    @Deprecated
    public C14062gk(String str, boolean z) {
        String str2 = C14113y2.f47374k4;
        this.f47241x6 = str2;
        this.f47232ne = str2;
        this.f47229ix = -1;
        this.f47235u4 = str2;
        this.f47237uz = str2;
        this.f47239wl = str2;
        this.f47226bv = true;
        this.f47242yd = z;
        this.f47234rv = str;
        m66643k4(1, k4.Construct);
        if (!this.f47226bv) {
            throw new UriFormatException(C14113y2.m67408k4("Invalid URI: The format of the URI could not be ", "determined: ", str));
        }
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m66656kk(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (i == 0) {
                if (!C14117yj.m67535m9(cCharAt)) {
                    return false;
                }
            } else if (cCharAt == '.') {
                int i3 = i2 + 1;
                if (i3 < length && str.charAt(i3) == '.') {
                    return false;
                }
                i = 0;
            } else if (!C14117yj.m67535m9(cCharAt) && cCharAt != '-' && cCharAt != '_') {
                return false;
            }
            i++;
            if (i == 64) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public static URI m66672x1(C14062gk c14062gk) {
        if (c14062gk == null) {
            return null;
        }
        try {
            return new URI(c14062gk.toString());
        } catch (URISyntaxException e) {
            throw new UriFormatException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public String m66686k4() {
        m66623bv();
        if (this.f47235u4.length() == 0) {
            return (C14113y2.m67412k4(this.f47235u4, C14113y2.m67408k4(this.f47241x6, f47213k4), (short) 4) || "file".equals(this.f47241x6)) ? "/" : C14113y2.f47374k4;
        }
        return ("mailto".equals(this.f47241x6) || "file".equals(this.f47241x6)) ? this.f47235u4 : this.f47235u4;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m66673x1(String str) {
        String[] strArrM67369h4 = C14113y2.m67369h4(str, FilenameUtils.EXTENSION_SEPARATOR);
        if (strArrM67369h4.length != 4) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (strArrM67369h4[i].length() == 0) {
                return false;
            }
            long[] jArr = {0};
            boolean zM67463k4 = C14114y9.m67463k4(strArrM67369h4[i], jArr);
            long j = jArr[0];
            if (!zM67463k4 || (4294967295L & j) > 255) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public String m66687k4(int i) {
        m66623bv();
        if (i == 0) {
            return C14113y2.m67408k4(this.f47241x6, m66622ar());
        }
        if (i == 1) {
            if (C14113y2.m67363du(this.f47241x6, f47215m9) || C14113y2.m67363du(this.f47241x6, f47208dy)) {
                return C14113y2.f47374k4;
            }
            C6765kp c6765kp = new C6765kp();
            c6765kp.m26792k4(this.f47241x6);
            c6765kp.m26792k4(m66622ar());
            if (this.f47235u4.length() > 1 && this.f47235u4.charAt(1) == ':' && C14113y2.m67363du(f47220x1, this.f47241x6)) {
                c6765kp.m26780k4(IOUtils.DIR_SEPARATOR_UNIX);
            }
            String str = this.f47233qq;
            if (str != null) {
                c6765kp.m26792k4(str).m26780k4('@');
            }
            c6765kp.m26792k4(this.f47232ne);
            int iM66628dy = m66628dy(this.f47241x6);
            int i2 = this.f47229ix;
            if (i2 != -1 && i2 != iM66628dy) {
                c6765kp.m26780k4(':').m26805kk(this.f47229ix);
            }
            return c6765kp.toString();
        }
        if (i == 2) {
            C6765kp c6765kp2 = new C6765kp();
            c6765kp2.m26792k4(this.f47241x6);
            c6765kp2.m26792k4(m66622ar());
            if (this.f47235u4.length() > 1 && this.f47235u4.charAt(1) == ':' && C14113y2.m67363du(f47220x1, this.f47241x6)) {
                c6765kp2.m26780k4(IOUtils.DIR_SEPARATOR_UNIX);
            }
            String str2 = this.f47233qq;
            if (str2 != null) {
                c6765kp2.m26792k4(str2).m26780k4('@');
            }
            c6765kp2.m26792k4(this.f47232ne);
            int iM66628dy2 = m66628dy(this.f47241x6);
            int i3 = this.f47229ix;
            if (i3 != -1 && i3 != iM66628dy2) {
                c6765kp2.m26780k4(':').m26805kk(this.f47229ix);
            }
            if (this.f47235u4.length() > 0) {
                c6765kp2.m26792k4(("mailto".equals(this.f47241x6) || "news".equals(this.f47241x6)) ? this.f47235u4 : m66653kk(this.f47235u4, m66631ix(this.f47241x6)));
            } else if (this.f47235u4.length() == 0 && C14113y2.m67363du(f47220x1, this.f47241x6)) {
                c6765kp2.m26780k4(IOUtils.DIR_SEPARATOR_UNIX);
            }
            return c6765kp2.toString();
        }
        if (i != 3) {
            throw new ArgumentException();
        }
        if (this.f47235u4.length() == 0) {
            return "";
        }
        C6765kp c6765kp3 = new C6765kp();
        c6765kp3.m26792k4(this.f47241x6);
        c6765kp3.m26792k4(m66622ar());
        if (this.f47235u4.length() > 1 && this.f47235u4.charAt(1) == ':' && C14113y2.m67363du(f47220x1, this.f47241x6)) {
            c6765kp3.m26780k4(IOUtils.DIR_SEPARATOR_UNIX);
        }
        String str3 = this.f47233qq;
        if (str3 != null) {
            c6765kp3.m26792k4(str3).m26780k4('@');
        }
        c6765kp3.m26792k4(this.f47232ne);
        int iM66628dy3 = m66628dy(this.f47241x6);
        int i4 = this.f47229ix;
        if (i4 != -1 && i4 != iM66628dy3) {
            c6765kp3.m26780k4(':').m26805kk(this.f47229ix);
        }
        if (this.f47235u4.length() > 0) {
            c6765kp3.m26792k4(("mailto".equals(this.f47241x6) || "news".equals(this.f47241x6)) ? this.f47235u4 : m66653kk(this.f47235u4, m66631ix(this.f47241x6)));
        } else if (this.f47235u4.length() == 0 && C14113y2.m67363du(f47220x1, this.f47241x6)) {
            c6765kp3.m26780k4(IOUtils.DIR_SEPARATOR_UNIX);
        }
        return c6765kp3.toString() + m66699yj();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66639k4(String str, String str2) {
        return m66640k4(str, str2, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66640k4(String str, String str2, boolean z) {
        if (C14113y2.m67411k4(str)) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m66649k4(str, i)) {
                c6765kp.m26792k4(C14113y2.m67443x1(str, i, 3));
                i += 2;
            } else {
                char cCharAt = str.charAt(i);
                boolean z2 = cCharAt <= ' ' || cCharAt >= 127;
                boolean z3 = C14113y2.m67429to(str2, cCharAt) != -1;
                if (z && z2) {
                    for (byte b : AbstractC6747ar.m26635ix().m26683x1(new char[]{cCharAt})) {
                        char cM67037x1 = C14080ne.m67037x1(Integer.valueOf(b & 255));
                        if (z3 || z) {
                            c6765kp.m26792k4(m66669x1(cM67037x1));
                        } else {
                            c6765kp.m26780k4(cM67037x1);
                        }
                    }
                } else if (z3) {
                    c6765kp.m26792k4(m66669x1(cCharAt));
                } else {
                    c6765kp.m26780k4(cCharAt);
                }
            }
            i++;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66641k4(String str, boolean z) {
        return m66642k4(str, z, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66642k4(String str, boolean z, boolean z2) {
        String str2;
        if (C14113y2.m67411k4(str)) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%') {
                int[] iArr = {i};
                char[] cArr = {0};
                char cM66633k4 = m66633k4(str, iArr, cArr);
                int i2 = iArr[0];
                char c = cArr[0];
                if (z && cM66633k4 == '#') {
                    str2 = "%23";
                } else if (z && cM66633k4 == '%') {
                    str2 = "%25";
                } else if (z && cM66633k4 == '?') {
                    str2 = "%3F";
                } else if (z2 && cM66633k4 == '\\') {
                    str2 = "%5C";
                } else {
                    c6765kp.m26780k4(cM66633k4);
                    if (c != 0) {
                        c6765kp.m26780k4(c);
                    }
                    i = i2 - 1;
                }
                c6765kp.m26792k4(str2);
                i = i2 - 1;
            } else {
                c6765kp.m26780k4(cCharAt);
            }
            i++;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private void m66643k4(int i, k4 k4Var) {
        m66644k4(i, this.f47234rv, k4Var);
        if (this.f47242yd) {
            return;
        }
        String strM66640k4 = m66640k4(this.f47232ne, f47203bz, false);
        this.f47232ne = strM66640k4;
        if (strM66640k4.length() > 1 && this.f47232ne.charAt(0) != '[' && OooO0O0.OooO00o(1, this.f47232ne) != ']') {
            this.f47232ne = C14113y2.m67398k4(this.f47232ne, C11697x1.m55250kk());
        }
        if (!this.f47226bv || this.f47235u4.length() <= 0) {
            return;
        }
        this.f47235u4 = m66626du(this.f47235u4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m66644k4(int i, String str, k4 k4Var) {
        if (str == null) {
            throw new ArgumentNullException("uriString");
        }
        String strM66670x1 = m66670x1(i, str, k4Var);
        if (strM66670x1 != null) {
            throw new UriFormatException(strM66670x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66645k4(C14062gk c14062gk, String str) {
        boolean z;
        int iM67418kk;
        String strM67396k4;
        int iM67384k4;
        int i;
        if (c14062gk == null) {
            throw new ArgumentNullException("baseUri");
        }
        if (!c14062gk.m66683ix()) {
            throw new ArgumentOutOfRangeException("baseUri");
        }
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        if (!m66629fa(str) && str.matches("\\\\.*")) {
            if (str.length() <= 2 || !str.matches("\\\\\\\\[a-zA-Z]+.*")) {
                throw new UriFormatException();
            }
            this.f47234rv = str;
            m66643k4(1, k4.Construct);
            return;
        }
        int iM67429to = C14113y2.m67429to(str, ':');
        int i2 = 0;
        if (iM67429to != -1 && ((iM67384k4 = C14113y2.m67384k4(str, new char[]{IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS, '?'})) > iM67429to || iM67384k4 < 0)) {
            if (C14113y2.m67436x1(c14062gk.m66689ks(), 0, str, 0, iM67429to) == 0 && m66667uz(c14062gk.m66689ks()) && (str.length() <= (i = iM67429to + 1) || str.charAt(i) != '/')) {
                str = C14113y2.m67422kk(str, i);
            } else if (m66650k4(str, 1, new C14062gk[]{null})) {
                this.f47234rv = str;
                m66643k4(1, k4.Construct);
                return;
            }
        }
        this.f47241x6 = c14062gk.f47241x6;
        this.f47232ne = c14062gk.f47232ne;
        this.f47229ix = c14062gk.f47229ix;
        this.f47233qq = c14062gk.f47233qq;
        this.f47224ar = c14062gk.f47224ar;
        this.f47230ks = c14062gk.f47230ks;
        this.f47236um = c14062gk.f47236um;
        if (str.length() == 0) {
            this.f47235u4 = c14062gk.f47235u4;
            this.f47237uz = c14062gk.f47237uz;
            this.f47239wl = c14062gk.f47239wl;
            return;
        }
        String strM67422kk = C14113y2.f47374k4;
        int iM67429to2 = C14113y2.m67429to(str, '#');
        if (iM67429to2 != -1) {
            strM67422kk = C14113y2.m67422kk(str, iM67429to2);
            if (this.f47242yd) {
                this.f47239wl = strM67422kk;
            } else {
                this.f47239wl = C14113y2.m67408k4("#", m66626du(C14113y2.m67422kk(str, iM67429to2 + 1)));
            }
            str = iM67429to2 == 0 ? C14113y2.f47374k4 : C14113y2.m67443x1(str, 0, iM67429to2);
        }
        int iM67429to3 = C14113y2.m67429to(str, '?');
        if (iM67429to3 != -1) {
            String strM67422kk2 = C14113y2.m67422kk(str, iM67429to3);
            this.f47237uz = strM67422kk2;
            if (!this.f47242yd) {
                this.f47237uz = m66626du(strM67422kk2);
            }
            z = this.f47237uz.length() > 0;
            str = iM67429to3 == 0 ? C14113y2.f47374k4 : C14113y2.m67443x1(str, 0, iM67429to3);
        } else {
            if (str.length() == 0) {
                this.f47237uz = c14062gk.f47237uz;
            }
            z = false;
        }
        if (str.length() > 0 && str.charAt(0) == '/') {
            if (str.length() > 1 && str.charAt(1) == '/') {
                this.f47234rv = C14113y2.m67407k4(this.f47241x6, ':', str);
                m66643k4(1, k4.Construct);
                return;
            } else {
                this.f47235u4 = str;
                if (this.f47242yd) {
                    return;
                }
                this.f47235u4 = m66626du(str);
                return;
            }
        }
        this.f47235u4 = c14062gk.f47235u4;
        if ((str.length() > 0 || z) && (iM67418kk = C14113y2.m67418kk(this.f47235u4, IOUtils.DIR_SEPARATOR_UNIX)) >= 0) {
            this.f47235u4 = C14113y2.m67443x1(this.f47235u4, 0, iM67418kk + 1);
        }
        if (str.length() == 0) {
            this.f47234rv = C14113y2.m67408k4(m66687k4(1), this.f47237uz, strM67422kk);
            return;
        }
        this.f47235u4 = C14113y2.m67400k4(this.f47235u4, str);
        int i3 = 0;
        while (true) {
            int iM67378k4 = C14113y2.m67378k4(this.f47235u4, "./", i3);
            if (iM67378k4 == -1) {
                break;
            }
            if (iM67378k4 == 0) {
                strM67396k4 = C14113y2.m67396k4(this.f47235u4, 0, 2);
            } else if (this.f47235u4.charAt(iM67378k4 - 1) != '.') {
                strM67396k4 = C14113y2.m67396k4(this.f47235u4, iM67378k4, 2);
            } else {
                i3 = iM67378k4 + 1;
            }
            this.f47235u4 = strM67396k4;
        }
        if (this.f47235u4.length() > 1 && OooO0O0.OooO00o(1, this.f47235u4) == '.' && OooO0O0.OooO00o(2, this.f47235u4) == '/') {
            String str2 = this.f47235u4;
            this.f47235u4 = C14113y2.m67396k4(str2, str2.length() - 1, 1);
        }
        while (true) {
            int iM67378k42 = C14113y2.m67378k4(this.f47235u4, "/../", i2);
            if (iM67378k42 == -1) {
                break;
            }
            if (iM67378k42 == 0) {
                i2 = 3;
            } else {
                int iM67372k4 = C14113y2.m67372k4(this.f47235u4, IOUtils.DIR_SEPARATOR_UNIX, iM67378k42 - 1);
                if (iM67372k4 != -1) {
                    int i4 = iM67372k4 + 1;
                    int i5 = iM67378k42 - iM67372k4;
                    if (!"..".equals(C14113y2.m67443x1(this.f47235u4, i4, i5 - 1))) {
                        this.f47235u4 = C14113y2.m67396k4(this.f47235u4, i4, i5 + 3);
                    }
                }
                i2 = iM67378k42 + 1;
            }
        }
        if (this.f47235u4.length() > 3 && C14113y2.m67424kk(this.f47235u4, "/..")) {
            String str3 = this.f47235u4;
            int iM67372k42 = C14113y2.m67372k4(str3, IOUtils.DIR_SEPARATOR_UNIX, str3.length() - 4);
            if (iM67372k42 != -1) {
                String str4 = this.f47235u4;
                int i6 = iM67372k42 + 1;
                if (!"..".equals(C14113y2.m67443x1(str4, i6, (str4.length() - iM67372k42) - 4))) {
                    String str5 = this.f47235u4;
                    this.f47235u4 = C14113y2.m67396k4(str5, i6, (str5.length() - iM67372k42) - 1);
                }
            }
        }
        while (C14113y2.m67412k4(this.f47235u4, "/../", (short) 4)) {
            this.f47235u4 = C14113y2.m67422kk(this.f47235u4, 3);
        }
        if (!this.f47242yd) {
            this.f47235u4 = m66626du(this.f47235u4);
        }
        this.f47234rv = C14113y2.m67408k4(m66687k4(1), this.f47235u4, this.f47237uz, strM67422kk);
    }

    /* JADX INFO: renamed from: k4 */
    private void m66646k4(String[] strArr) {
        if (this.f47237uz.length() > 0) {
            strArr[0] = C14113y2.m67400k4(strArr[0], this.f47237uz.charAt(0) == '?' ? C14113y2.m67407k4('?', m66642k4(C14113y2.m67422kk(this.f47237uz, 1), true, false)) : m66641k4(this.f47237uz, false));
        }
        if (this.f47239wl.length() > 0) {
            strArr[0] = C14113y2.m67400k4(strArr[0], m66642k4(this.f47239wl, true, false));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66647k4(C14062gk c14062gk, C14062gk c14062gk2) {
        return C14067j2.m66728k4(c14062gk, c14062gk2);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66648k4(C14062gk c14062gk, C14062gk c14062gk2, C14062gk[] c14062gkArr) {
        c14062gkArr[0] = null;
        if (c14062gk != null && c14062gk.m66683ix()) {
            try {
                c14062gkArr[0] = new C14062gk(c14062gk, c14062gk2.m66694u4());
                return true;
            } catch (UriFormatException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66649k4(String str, int i) {
        if (i + 3 > str.length()) {
            return false;
        }
        int i2 = i + 1;
        if (str.charAt(i) == '%') {
            int i3 = i + 2;
            if (m66654kk(str.charAt(i2)) && m66654kk(str.charAt(i3))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66650k4(String str, int i, C14062gk[] c14062gkArr) {
        return m66651k4(str, i, c14062gkArr, (k4) null);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m66651k4(String str, int i, C14062gk[] c14062gkArr, k4 k4Var) {
        boolean[] zArr = {false};
        C14062gk c14062gk = new C14062gk(str, i, zArr, k4Var);
        if (zArr[0]) {
            c14062gkArr[0] = c14062gk;
            return true;
        }
        c14062gkArr[0] = null;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static char[] m66652k4(C3152yj c3152yj, AbstractC6747ar abstractC6747ar) {
        return abstractC6747ar.m26672kk(c3152yj.getBuffer(), 0, (int) c3152yj.getLength());
    }
}
