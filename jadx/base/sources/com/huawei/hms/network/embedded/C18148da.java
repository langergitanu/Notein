package com.huawei.hms.network.embedded;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.messaging.Constants;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.marker.PerfConstants;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.da */
/* JADX INFO: loaded from: classes9.dex */
public final class C18148da {

    /* JADX INFO: renamed from: a */
    public static final int f54565a = 15;

    /* JADX INFO: renamed from: b */
    public static final int f54566b = 31;

    /* JADX INFO: renamed from: c */
    public static final int f54567c = 63;

    /* JADX INFO: renamed from: d */
    public static final int f54568d = 127;

    /* JADX INFO: renamed from: e */
    public static final C18134ca[] f54569e;

    /* JADX INFO: renamed from: f */
    public static final Map<C18303ob, Integer> f54570f;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.da$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<C18134ca> f54571a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC18289nb f54572b;

        /* JADX INFO: renamed from: c */
        public final int f54573c;

        /* JADX INFO: renamed from: d */
        public int f54574d;

        /* JADX INFO: renamed from: e */
        public C18134ca[] f54575e;

        /* JADX INFO: renamed from: f */
        public int f54576f;

        /* JADX INFO: renamed from: g */
        public int f54577g;

        /* JADX INFO: renamed from: h */
        public int f54578h;

        public a(int i, int i2, InterfaceC18234jc interfaceC18234jc) {
            this.f54571a = new ArrayList();
            this.f54575e = new C18134ca[8];
            this.f54576f = r0.length - 1;
            this.f54577g = 0;
            this.f54578h = 0;
            this.f54573c = i;
            this.f54574d = i2;
            this.f54572b = C18433yb.m80007a(interfaceC18234jc);
        }

        /* JADX INFO: renamed from: a */
        private int m78230a(int i) {
            return this.f54576f + 1 + i;
        }

        /* JADX INFO: renamed from: e */
        private void m78235e() {
            int i = this.f54574d;
            int i2 = this.f54578h;
            if (i < i2) {
                if (i == 0) {
                    m78237f();
                } else {
                    m78232b(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        private void m78237f() {
            Arrays.fill(this.f54575e, (Object) null);
            this.f54576f = this.f54575e.length - 1;
            this.f54577g = 0;
            this.f54578h = 0;
        }

        /* JADX INFO: renamed from: g */
        private int m78239g() throws IOException {
            return this.f54572b.readByte() & 255;
        }

        /* JADX INFO: renamed from: h */
        private void m78241h() throws IOException {
            m78231a(-1, new C18134ca(C18148da.m78228a(m78246c()), m78246c()));
        }

        /* JADX INFO: renamed from: i */
        private void m78242i() throws IOException {
            this.f54571a.add(new C18134ca(C18148da.m78228a(m78246c()), m78246c()));
        }

        /* JADX INFO: renamed from: b */
        public int m78245b() {
            return this.f54574d;
        }

        /* JADX INFO: renamed from: c */
        public C18303ob m78246c() throws IOException {
            int iM78239g = m78239g();
            boolean z = (iM78239g & 128) == 128;
            int iM78243a = m78243a(iM78239g, 127);
            return z ? C18303ob.m79300e(C18246ka.m78985b().m78988a(this.f54572b.mo78390f(iM78243a))) : this.f54572b.mo78375a(iM78243a);
        }

        /* JADX INFO: renamed from: d */
        public void m78247d() throws IOException {
            while (!this.f54572b.mo78389f()) {
                byte b = this.f54572b.readByte();
                int i = b & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                    m78236e(m78243a(i, 127) - 1);
                } else if (i == 64) {
                    m78241h();
                } else if ((b & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                    m78238f(m78243a(i, 63) - 1);
                } else if ((b & 32) == 32) {
                    int iM78243a = m78243a(i, 31);
                    this.f54574d = iM78243a;
                    if (iM78243a < 0 || iM78243a > this.f54573c) {
                        throw new IOException("Invalid dynamic table size update " + this.f54574d);
                    }
                    m78235e();
                } else if (i == 16 || i == 0) {
                    m78242i();
                } else {
                    m78240g(m78243a(i, 15) - 1);
                }
            }
        }

        public a(int i, InterfaceC18234jc interfaceC18234jc) {
            this(i, i, interfaceC18234jc);
        }

        /* JADX INFO: renamed from: b */
        private int m78232b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f54575e.length;
                while (true) {
                    length--;
                    i2 = this.f54576f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f54575e[length].f54498c;
                    i -= i4;
                    this.f54578h -= i4;
                    this.f54577g--;
                    i3++;
                }
                C18134ca[] c18134caArr = this.f54575e;
                int i5 = i2 + 1;
                System.arraycopy(c18134caArr, i5, c18134caArr, i5 + i3, this.f54577g);
                this.f54576f += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: c */
        private C18303ob m78233c(int i) throws IOException {
            C18134ca c18134ca;
            if (!m78234d(i)) {
                int iM78230a = m78230a(i - C18148da.f54569e.length);
                if (iM78230a >= 0) {
                    C18134ca[] c18134caArr = this.f54575e;
                    if (iM78230a < c18134caArr.length) {
                        c18134ca = c18134caArr[iM78230a];
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            c18134ca = C18148da.f54569e[i];
            return c18134ca.f54496a;
        }

        /* JADX INFO: renamed from: d */
        private boolean m78234d(int i) {
            return i >= 0 && i <= C18148da.f54569e.length - 1;
        }

        /* JADX INFO: renamed from: e */
        private void m78236e(int i) throws IOException {
            if (m78234d(i)) {
                this.f54571a.add(C18148da.f54569e[i]);
                return;
            }
            int iM78230a = m78230a(i - C18148da.f54569e.length);
            if (iM78230a >= 0) {
                C18134ca[] c18134caArr = this.f54575e;
                if (iM78230a < c18134caArr.length) {
                    this.f54571a.add(c18134caArr[iM78230a]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* JADX INFO: renamed from: f */
        private void m78238f(int i) throws IOException {
            m78231a(-1, new C18134ca(m78233c(i), m78246c()));
        }

        /* JADX INFO: renamed from: g */
        private void m78240g(int i) throws IOException {
            this.f54571a.add(new C18134ca(m78233c(i), m78246c()));
        }

        /* JADX INFO: renamed from: a */
        public int m78243a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iM78239g = m78239g();
                if ((iM78239g & 128) == 0) {
                    return i2 + (iM78239g << i4);
                }
                i2 += (iM78239g & 127) << i4;
                i4 += 7;
            }
        }

        /* JADX INFO: renamed from: a */
        public List<C18134ca> m78244a() {
            ArrayList arrayList = new ArrayList(this.f54571a);
            this.f54571a.clear();
            return arrayList;
        }

        /* JADX INFO: renamed from: a */
        private void m78231a(int i, C18134ca c18134ca) {
            this.f54571a.add(c18134ca);
            int i2 = c18134ca.f54498c;
            if (i != -1) {
                i2 -= this.f54575e[m78230a(i)].f54498c;
            }
            int i3 = this.f54574d;
            if (i2 > i3) {
                m78237f();
                return;
            }
            int iM78232b = m78232b((this.f54578h + i2) - i3);
            if (i == -1) {
                int i4 = this.f54577g + 1;
                C18134ca[] c18134caArr = this.f54575e;
                if (i4 > c18134caArr.length) {
                    C18134ca[] c18134caArr2 = new C18134ca[c18134caArr.length * 2];
                    System.arraycopy(c18134caArr, 0, c18134caArr2, c18134caArr.length, c18134caArr.length);
                    this.f54576f = this.f54575e.length - 1;
                    this.f54575e = c18134caArr2;
                }
                int i5 = this.f54576f;
                this.f54576f = i5 - 1;
                this.f54575e[i5] = c18134ca;
                this.f54577g++;
            } else {
                this.f54575e[m78230a(i) + iM78232b + i] = c18134ca;
            }
            this.f54578h += i2;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.da$b */
    public static final class b {

        /* JADX INFO: renamed from: k */
        public static final int f54579k = 4096;

        /* JADX INFO: renamed from: l */
        public static final int f54580l = 16384;

        /* JADX INFO: renamed from: a */
        public final C18261lb f54581a;

        /* JADX INFO: renamed from: b */
        public final boolean f54582b;

        /* JADX INFO: renamed from: c */
        public int f54583c;

        /* JADX INFO: renamed from: d */
        public boolean f54584d;

        /* JADX INFO: renamed from: e */
        public int f54585e;

        /* JADX INFO: renamed from: f */
        public int f54586f;

        /* JADX INFO: renamed from: g */
        public C18134ca[] f54587g;

        /* JADX INFO: renamed from: h */
        public int f54588h;

        /* JADX INFO: renamed from: i */
        public int f54589i;

        /* JADX INFO: renamed from: j */
        public int f54590j;

        public b(int i, boolean z, C18261lb c18261lb) {
            this.f54583c = Integer.MAX_VALUE;
            this.f54587g = new C18134ca[8];
            this.f54588h = r0.length - 1;
            this.f54589i = 0;
            this.f54590j = 0;
            this.f54585e = i;
            this.f54586f = i;
            this.f54582b = z;
            this.f54581a = c18261lb;
        }

        /* JADX INFO: renamed from: a */
        private void m78248a() {
            int i = this.f54586f;
            int i2 = this.f54590j;
            if (i < i2) {
                if (i == 0) {
                    m78251b();
                } else {
                    m78250b(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private int m78250b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f54587g.length;
                while (true) {
                    length--;
                    i2 = this.f54588h;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f54587g[length].f54498c;
                    i -= i4;
                    this.f54590j -= i4;
                    this.f54589i--;
                    i3++;
                }
                C18134ca[] c18134caArr = this.f54587g;
                int i5 = i2 + 1;
                System.arraycopy(c18134caArr, i5, c18134caArr, i5 + i3, this.f54589i);
                C18134ca[] c18134caArr2 = this.f54587g;
                int i6 = this.f54588h + 1;
                Arrays.fill(c18134caArr2, i6, i6 + i3, (Object) null);
                this.f54588h += i3;
            }
            return i3;
        }

        public b(C18261lb c18261lb) {
            this(4096, true, c18261lb);
        }

        /* JADX INFO: renamed from: b */
        private void m78251b() {
            Arrays.fill(this.f54587g, (Object) null);
            this.f54588h = this.f54587g.length - 1;
            this.f54589i = 0;
            this.f54590j = 0;
        }

        /* JADX INFO: renamed from: a */
        public void m78252a(int i) {
            this.f54585e = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.f54586f;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.f54583c = Math.min(this.f54583c, iMin);
            }
            this.f54584d = true;
            this.f54586f = iMin;
            m78248a();
        }

        /* JADX INFO: renamed from: a */
        public void m78253a(int i, int i2, int i3) {
            int i4;
            C18261lb c18261lb;
            if (i < i2) {
                c18261lb = this.f54581a;
                i4 = i | i3;
            } else {
                this.f54581a.writeByte(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f54581a.writeByte(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                c18261lb = this.f54581a;
            }
            c18261lb.writeByte(i4);
        }

        /* JADX INFO: renamed from: a */
        private void m78249a(C18134ca c18134ca) {
            int i = c18134ca.f54498c;
            int i2 = this.f54586f;
            if (i > i2) {
                m78251b();
                return;
            }
            m78250b((this.f54590j + i) - i2);
            int i3 = this.f54589i + 1;
            C18134ca[] c18134caArr = this.f54587g;
            if (i3 > c18134caArr.length) {
                C18134ca[] c18134caArr2 = new C18134ca[c18134caArr.length * 2];
                System.arraycopy(c18134caArr, 0, c18134caArr2, c18134caArr.length, c18134caArr.length);
                this.f54588h = this.f54587g.length - 1;
                this.f54587g = c18134caArr2;
            }
            int i4 = this.f54588h;
            this.f54588h = i4 - 1;
            this.f54587g[i4] = c18134ca;
            this.f54589i++;
            this.f54590j += i;
        }

        /* JADX INFO: renamed from: a */
        public void m78254a(C18303ob c18303ob) throws IOException {
            int iMo78736j;
            int i;
            if (!this.f54582b || C18246ka.m78985b().m78986a(c18303ob) >= c18303ob.mo78736j()) {
                iMo78736j = c18303ob.mo78736j();
                i = 0;
            } else {
                C18261lb c18261lb = new C18261lb();
                C18246ka.m78985b().m78987a(c18303ob, c18261lb);
                c18303ob = c18261lb.mo78401r();
                iMo78736j = c18303ob.mo78736j();
                i = 128;
            }
            m78253a(iMo78736j, 127, i);
            this.f54581a.mo78267b(c18303ob);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m78255a(List<C18134ca> list) throws IOException {
            int length;
            int length2;
            if (this.f54584d) {
                int i = this.f54583c;
                if (i < this.f54586f) {
                    m78253a(i, 31, 32);
                }
                this.f54584d = false;
                this.f54583c = Integer.MAX_VALUE;
                m78253a(this.f54586f, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C18134ca c18134ca = list.get(i2);
                C18303ob c18303obMo78737k = c18134ca.f54496a.mo78737k();
                C18303ob c18303ob = c18134ca.f54497b;
                Integer num = C18148da.f54570f.get(c18303obMo78737k);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        C18134ca[] c18134caArr = C18148da.f54569e;
                        if (Objects.equals(c18134caArr[iIntValue].f54497b, c18303ob)) {
                            length = length2;
                        } else if (Objects.equals(c18134caArr[length2].f54497b, c18303ob)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i3 = this.f54588h + 1;
                    int length3 = this.f54587g.length;
                    while (true) {
                        if (i3 >= length3) {
                            break;
                        }
                        if (Objects.equals(this.f54587g[i3].f54496a, c18303obMo78737k)) {
                            if (Objects.equals(this.f54587g[i3].f54497b, c18303ob)) {
                                length2 = (i3 - this.f54588h) + C18148da.f54569e.length;
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f54588h) + C18148da.f54569e.length;
                            }
                        }
                        i3++;
                    }
                }
                if (length2 != -1) {
                    m78253a(length2, 127, 128);
                } else {
                    if (length == -1) {
                        this.f54581a.writeByte(64);
                        m78254a(c18303obMo78737k);
                    } else if (!c18303obMo78737k.m79312h(C18134ca.f54485d) || C18134ca.f54495n.equals(c18303obMo78737k)) {
                        m78253a(length, 63, 64);
                    } else {
                        m78253a(length, 15, 0);
                        m78254a(c18303ob);
                    }
                    m78254a(c18303ob);
                    m78249a(c18134ca);
                }
            }
        }
    }

    static {
        C18134ca c18134ca = new C18134ca(C18134ca.f54495n, "");
        C18303ob c18303ob = C18134ca.f54492k;
        C18134ca c18134ca2 = new C18134ca(c18303ob, "GET");
        C18134ca c18134ca3 = new C18134ca(c18303ob, "POST");
        C18303ob c18303ob2 = C18134ca.f54493l;
        C18134ca c18134ca4 = new C18134ca(c18303ob2, "/");
        C18134ca c18134ca5 = new C18134ca(c18303ob2, "/index.html");
        C18303ob c18303ob3 = C18134ca.f54494m;
        C18134ca c18134ca6 = new C18134ca(c18303ob3, "http");
        C18134ca c18134ca7 = new C18134ca(c18303ob3, AuthenticationConstants.HTTPS_PROTOCOL_STRING);
        C18303ob c18303ob4 = C18134ca.f54491j;
        f54569e = new C18134ca[]{c18134ca, c18134ca2, c18134ca3, c18134ca4, c18134ca5, c18134ca6, c18134ca7, new C18134ca(c18303ob4, PerfConstants.ScenarioConstants.SCENARIO_BROKERED_ACQUIRE_TOKEN_SILENTLY), new C18134ca(c18303ob4, TelemetryEventStrings.Api.GET_BROKER_DEVICE_MODE), new C18134ca(c18303ob4, TelemetryEventStrings.Api.BROKER_GET_ACCOUNTS), new C18134ca(c18303ob4, "304"), new C18134ca(c18303ob4, "400"), new C18134ca(c18303ob4, "404"), new C18134ca(c18303ob4, "500"), new C18134ca("accept-charset", ""), new C18134ca("accept-encoding", "gzip, deflate"), new C18134ca("accept-language", ""), new C18134ca("accept-ranges", ""), new C18134ca("accept", ""), new C18134ca("access-control-allow-origin", ""), new C18134ca("age", ""), new C18134ca("allow", ""), new C18134ca("authorization", ""), new C18134ca("cache-control", ""), new C18134ca("content-disposition", ""), new C18134ca("content-encoding", ""), new C18134ca("content-language", ""), new C18134ca("content-length", ""), new C18134ca("content-location", ""), new C18134ca("content-range", ""), new C18134ca("content-type", ""), new C18134ca("cookie", ""), new C18134ca("date", ""), new C18134ca("etag", ""), new C18134ca("expect", ""), new C18134ca("expires", ""), new C18134ca(Constants.MessagePayloadKeys.FROM, ""), new C18134ca("host", ""), new C18134ca("if-match", ""), new C18134ca("if-modified-since", ""), new C18134ca("if-none-match", ""), new C18134ca("if-range", ""), new C18134ca("if-unmodified-since", ""), new C18134ca("last-modified", ""), new C18134ca("link", ""), new C18134ca("location", ""), new C18134ca("max-forwards", ""), new C18134ca("proxy-authenticate", ""), new C18134ca("proxy-authorization", ""), new C18134ca("range", ""), new C18134ca(RequestParameters.SUBRESOURCE_REFERER, ""), new C18134ca("refresh", ""), new C18134ca("retry-after", ""), new C18134ca("server", ""), new C18134ca("set-cookie", ""), new C18134ca("strict-transport-security", ""), new C18134ca(C18190ga.f54967l, ""), new C18134ca("user-agent", ""), new C18134ca("vary", ""), new C18134ca("via", ""), new C18134ca("www-authenticate", "")};
        f54570f = m78229a();
    }

    /* JADX INFO: renamed from: a */
    public static C18303ob m78228a(C18303ob c18303ob) throws IOException {
        int iMo78736j = c18303ob.mo78736j();
        for (int i = 0; i < iMo78736j; i++) {
            byte bMo78716a = c18303ob.mo78716a(i);
            if (bMo78716a >= 65 && bMo78716a <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c18303ob.mo78740n());
            }
        }
        return c18303ob;
    }

    /* JADX INFO: renamed from: a */
    public static Map<C18303ob, Integer> m78229a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f54569e.length);
        int i = 0;
        while (true) {
            C18134ca[] c18134caArr = f54569e;
            if (i >= c18134caArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(c18134caArr[i].f54496a)) {
                linkedHashMap.put(c18134caArr[i].f54496a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
