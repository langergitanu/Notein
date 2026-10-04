package com.huawei.hms.drive;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18190ga;
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
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.InterfaceC34525OooO0o;
import oOo00OoO.InterfaceC34548OooOoo0;

/* JADX INFO: renamed from: com.huawei.hms.drive.cv */
/* JADX INFO: loaded from: classes6.dex */
final class C17839cv {

    /* JADX INFO: renamed from: a */
    static final C17838cu[] f53186a;

    /* JADX INFO: renamed from: b */
    static final Map<C34527OooO0oO, Integer> f53187b;

    /* JADX INFO: renamed from: com.huawei.hms.drive.cv$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        C17838cu[] f53188a;

        /* JADX INFO: renamed from: b */
        int f53189b;

        /* JADX INFO: renamed from: c */
        int f53190c;

        /* JADX INFO: renamed from: d */
        int f53191d;

        /* JADX INFO: renamed from: e */
        private final List<C17838cu> f53192e;

        /* JADX INFO: renamed from: f */
        private final InterfaceC34525OooO0o f53193f;

        /* JADX INFO: renamed from: g */
        private final int f53194g;

        /* JADX INFO: renamed from: h */
        private int f53195h;

        public a(int i, InterfaceC34548OooOoo0 interfaceC34548OooOoo0) {
            this(i, i, interfaceC34548OooOoo0);
        }

        /* JADX INFO: renamed from: a */
        private int m76530a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f53188a.length;
                while (true) {
                    length--;
                    i2 = this.f53189b;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f53188a[length].f53185i;
                    i -= i4;
                    this.f53191d -= i4;
                    this.f53190c--;
                    i3++;
                }
                C17838cu[] c17838cuArr = this.f53188a;
                System.arraycopy(c17838cuArr, i2 + 1, c17838cuArr, i2 + 1 + i3, this.f53190c);
                this.f53189b += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: c */
        private int m76533c(int i) {
            return this.f53189b + 1 + i;
        }

        /* JADX INFO: renamed from: d */
        private void m76534d() {
            int i = this.f53195h;
            int i2 = this.f53191d;
            if (i < i2) {
                if (i == 0) {
                    m76536e();
                } else {
                    m76530a(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: e */
        private void m76536e() {
            Arrays.fill(this.f53188a, (Object) null);
            this.f53189b = this.f53188a.length - 1;
            this.f53190c = 0;
            this.f53191d = 0;
        }

        /* JADX INFO: renamed from: f */
        private void m76539f() throws IOException {
            this.f53192e.add(new C17838cu(C17839cv.m76529a(m76546c()), m76546c()));
        }

        /* JADX INFO: renamed from: g */
        private void m76540g() throws IOException {
            m76531a(-1, new C17838cu(C17839cv.m76529a(m76546c()), m76546c()));
        }

        /* JADX INFO: renamed from: h */
        private int m76542h() throws IOException {
            return this.f53193f.readByte() & 255;
        }

        /* JADX INFO: renamed from: b */
        public List<C17838cu> m76545b() {
            ArrayList arrayList = new ArrayList(this.f53192e);
            this.f53192e.clear();
            return arrayList;
        }

        public a(int i, int i2, InterfaceC34548OooOoo0 interfaceC34548OooOoo0) {
            this.f53192e = new ArrayList();
            this.f53188a = new C17838cu[8];
            this.f53189b = 7;
            this.f53190c = 0;
            this.f53191d = 0;
            this.f53194g = i;
            this.f53195h = i2;
            this.f53193f = C34535OooOOOo.OooO0O0(interfaceC34548OooOoo0);
        }

        /* JADX INFO: renamed from: c */
        public C34527OooO0oO m76546c() throws IOException {
            int iM76542h = m76542h();
            boolean z = (iM76542h & 128) == 128;
            int iM76543a = m76543a(iM76542h, 127);
            return z ? C34527OooO0oO.OooO0oO(C17847dc.m76694a().m76699a(this.f53193f.o0000oo(iM76543a))) : this.f53193f.OoooO0O(iM76543a);
        }

        /* JADX INFO: renamed from: b */
        private void m76532b(int i) throws IOException {
            if (m76541g(i)) {
                this.f53192e.add(C17839cv.f53186a[i]);
                return;
            }
            int iM76533c = m76533c(i - C17839cv.f53186a.length);
            if (iM76533c >= 0) {
                C17838cu[] c17838cuArr = this.f53188a;
                if (iM76533c < c17838cuArr.length) {
                    this.f53192e.add(c17838cuArr[iM76533c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* JADX INFO: renamed from: d */
        private void m76535d(int i) throws IOException {
            this.f53192e.add(new C17838cu(m76538f(i), m76546c()));
        }

        /* JADX INFO: renamed from: f */
        private C34527OooO0oO m76538f(int i) throws IOException {
            if (m76541g(i)) {
                return C17839cv.f53186a[i].f53183g;
            }
            int iM76533c = m76533c(i - C17839cv.f53186a.length);
            if (iM76533c >= 0) {
                C17838cu[] c17838cuArr = this.f53188a;
                if (iM76533c < c17838cuArr.length) {
                    return c17838cuArr[iM76533c].f53183g;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* JADX INFO: renamed from: g */
        private boolean m76541g(int i) {
            return i >= 0 && i <= C17839cv.f53186a.length - 1;
        }

        /* JADX INFO: renamed from: e */
        private void m76537e(int i) throws IOException {
            m76531a(-1, new C17838cu(m76538f(i), m76546c()));
        }

        /* JADX INFO: renamed from: a */
        public void m76544a() throws IOException {
            while (!this.f53193f.o0000o0O()) {
                byte b = this.f53193f.readByte();
                int i = b & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                    m76532b(m76543a(i, 127) - 1);
                } else if (i == 64) {
                    m76540g();
                } else if ((b & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                    m76537e(m76543a(i, 63) - 1);
                } else if ((b & 32) == 32) {
                    int iM76543a = m76543a(i, 31);
                    this.f53195h = iM76543a;
                    if (iM76543a >= 0 && iM76543a <= this.f53194g) {
                        m76534d();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f53195h);
                    }
                } else if (i != 16 && i != 0) {
                    m76535d(m76543a(i, 15) - 1);
                } else {
                    m76539f();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private void m76531a(int i, C17838cu c17838cu) {
            this.f53192e.add(c17838cu);
            int i2 = c17838cu.f53185i;
            if (i != -1) {
                i2 -= this.f53188a[m76533c(i)].f53185i;
            }
            int i3 = this.f53195h;
            if (i2 > i3) {
                m76536e();
                return;
            }
            int iM76530a = m76530a((this.f53191d + i2) - i3);
            if (i == -1) {
                int i4 = this.f53190c + 1;
                C17838cu[] c17838cuArr = this.f53188a;
                if (i4 > c17838cuArr.length) {
                    C17838cu[] c17838cuArr2 = new C17838cu[c17838cuArr.length * 2];
                    System.arraycopy(c17838cuArr, 0, c17838cuArr2, c17838cuArr.length, c17838cuArr.length);
                    this.f53189b = this.f53188a.length - 1;
                    this.f53188a = c17838cuArr2;
                }
                int i5 = this.f53189b;
                this.f53189b = i5 - 1;
                this.f53188a[i5] = c17838cu;
                this.f53190c++;
            } else {
                this.f53188a[m76533c(i) + iM76530a + i] = c17838cu;
            }
            this.f53191d += i2;
        }

        /* JADX INFO: renamed from: a */
        public int m76543a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iM76542h = m76542h();
                if ((iM76542h & 128) == 0) {
                    return i2 + (iM76542h << i4);
                }
                i2 += (iM76542h & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cv$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        int f53196a;

        /* JADX INFO: renamed from: b */
        int f53197b;

        /* JADX INFO: renamed from: c */
        C17838cu[] f53198c;

        /* JADX INFO: renamed from: d */
        int f53199d;

        /* JADX INFO: renamed from: e */
        int f53200e;

        /* JADX INFO: renamed from: f */
        int f53201f;

        /* JADX INFO: renamed from: g */
        private final C34524OooO0Oo f53202g;

        /* JADX INFO: renamed from: h */
        private final boolean f53203h;

        /* JADX INFO: renamed from: i */
        private int f53204i;

        /* JADX INFO: renamed from: j */
        private boolean f53205j;

        public b(C34524OooO0Oo c34524OooO0Oo) {
            this(4096, true, c34524OooO0Oo);
        }

        /* JADX INFO: renamed from: a */
        private void m76547a() {
            Arrays.fill(this.f53198c, (Object) null);
            this.f53199d = this.f53198c.length - 1;
            this.f53200e = 0;
            this.f53201f = 0;
        }

        /* JADX INFO: renamed from: b */
        private int m76549b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f53198c.length;
                while (true) {
                    length--;
                    i2 = this.f53199d;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f53198c[length].f53185i;
                    i -= i4;
                    this.f53201f -= i4;
                    this.f53200e--;
                    i3++;
                }
                C17838cu[] c17838cuArr = this.f53198c;
                System.arraycopy(c17838cuArr, i2 + 1, c17838cuArr, i2 + 1 + i3, this.f53200e);
                C17838cu[] c17838cuArr2 = this.f53198c;
                int i5 = this.f53199d;
                Arrays.fill(c17838cuArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f53199d += i3;
            }
            return i3;
        }

        public b(int i, boolean z, C34524OooO0Oo c34524OooO0Oo) {
            this.f53204i = Integer.MAX_VALUE;
            this.f53198c = new C17838cu[8];
            this.f53199d = r0.length - 1;
            this.f53200e = 0;
            this.f53201f = 0;
            this.f53196a = i;
            this.f53197b = i;
            this.f53203h = z;
            this.f53202g = c34524OooO0Oo;
        }

        /* JADX INFO: renamed from: a */
        private void m76548a(C17838cu c17838cu) {
            int i = c17838cu.f53185i;
            int i2 = this.f53197b;
            if (i > i2) {
                m76547a();
                return;
            }
            m76549b((this.f53201f + i) - i2);
            int i3 = this.f53200e + 1;
            C17838cu[] c17838cuArr = this.f53198c;
            if (i3 > c17838cuArr.length) {
                C17838cu[] c17838cuArr2 = new C17838cu[c17838cuArr.length * 2];
                System.arraycopy(c17838cuArr, 0, c17838cuArr2, c17838cuArr.length, c17838cuArr.length);
                this.f53199d = this.f53198c.length - 1;
                this.f53198c = c17838cuArr2;
            }
            int i4 = this.f53199d;
            this.f53199d = i4 - 1;
            this.f53198c[i4] = c17838cu;
            this.f53200e++;
            this.f53201f += i;
        }

        /* JADX INFO: renamed from: b */
        private void m76550b() {
            int i = this.f53197b;
            int i2 = this.f53201f;
            if (i < i2) {
                if (i == 0) {
                    m76547a();
                } else {
                    m76549b(i2 - i);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m76553a(List<C17838cu> list) throws IOException {
            int length;
            int length2;
            if (this.f53205j) {
                int i = this.f53204i;
                if (i < this.f53197b) {
                    m76552a(i, 31, 32);
                }
                this.f53205j = false;
                this.f53204i = Integer.MAX_VALUE;
                m76552a(this.f53197b, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C17838cu c17838cu = list.get(i2);
                C34527OooO0oO c34527OooO0oOOooOO0O = c17838cu.f53183g.OooOO0O();
                C34527OooO0oO c34527OooO0oO = c17838cu.f53184h;
                Integer num = C17839cv.f53187b.get(c34527OooO0oOOooOO0O);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        C17838cu[] c17838cuArr = C17839cv.f53186a;
                        if (C17806bp.m76342a(c17838cuArr[iIntValue].f53184h, c34527OooO0oO)) {
                            length = length2;
                        } else if (C17806bp.m76342a(c17838cuArr[length2].f53184h, c34527OooO0oO)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i3 = this.f53199d + 1;
                    int length3 = this.f53198c.length;
                    while (true) {
                        if (i3 >= length3) {
                            break;
                        }
                        if (C17806bp.m76342a(this.f53198c[i3].f53183g, c34527OooO0oOOooOO0O)) {
                            if (C17806bp.m76342a(this.f53198c[i3].f53184h, c34527OooO0oO)) {
                                length2 = (i3 - this.f53199d) + C17839cv.f53186a.length;
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f53199d) + C17839cv.f53186a.length;
                            }
                        }
                        i3++;
                    }
                }
                if (length2 != -1) {
                    m76552a(length2, 127, 128);
                } else if (length == -1) {
                    this.f53202g.o0OoO0o(64);
                    m76554a(c34527OooO0oOOooOO0O);
                    m76554a(c34527OooO0oO);
                    m76548a(c17838cu);
                } else if (c34527OooO0oOOooOO0O.OooOO0(C17838cu.f53177a) && !C17838cu.f53182f.equals(c34527OooO0oOOooOO0O)) {
                    m76552a(length, 15, 0);
                    m76554a(c34527OooO0oO);
                } else {
                    m76552a(length, 63, 64);
                    m76554a(c34527OooO0oO);
                    m76548a(c17838cu);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m76552a(int i, int i2, int i3) {
            if (i < i2) {
                this.f53202g.o0OoO0o(i | i3);
                return;
            }
            this.f53202g.o0OoO0o(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f53202g.o0OoO0o(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f53202g.o0OoO0o(i4);
        }

        /* JADX INFO: renamed from: a */
        public void m76554a(C34527OooO0oO c34527OooO0oO) throws IOException {
            if (this.f53203h && C17847dc.m76694a().m76697a(c34527OooO0oO) < c34527OooO0oO.OooO0OO()) {
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                C17847dc.m76694a().m76698a(c34527OooO0oO, c34524OooO0Oo);
                C34527OooO0oO c34527OooO0oOOoooO0O = c34524OooO0Oo.OoooO0O(c34524OooO0Oo.f123723OooOo);
                m76552a(c34527OooO0oOOoooO0O.OooO0OO(), 127, 128);
                this.f53202g.o0000o0(c34527OooO0oOOoooO0O);
                return;
            }
            m76552a(c34527OooO0oO.OooO0OO(), 127, 0);
            this.f53202g.o0000o0(c34527OooO0oO);
        }

        /* JADX INFO: renamed from: a */
        public void m76551a(int i) {
            this.f53196a = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.f53197b;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.f53204i = Math.min(this.f53204i, iMin);
            }
            this.f53205j = true;
            this.f53197b = iMin;
            m76550b();
        }
    }

    static {
        C17838cu c17838cu = new C17838cu(C17838cu.f53182f, "");
        C34527OooO0oO c34527OooO0oO = C17838cu.f53179c;
        C17838cu c17838cu2 = new C17838cu(c34527OooO0oO, "GET");
        C17838cu c17838cu3 = new C17838cu(c34527OooO0oO, "POST");
        C34527OooO0oO c34527OooO0oO2 = C17838cu.f53180d;
        C17838cu c17838cu4 = new C17838cu(c34527OooO0oO2, "/");
        C17838cu c17838cu5 = new C17838cu(c34527OooO0oO2, "/index.html");
        C34527OooO0oO c34527OooO0oO3 = C17838cu.f53181e;
        C17838cu c17838cu6 = new C17838cu(c34527OooO0oO3, "http");
        C17838cu c17838cu7 = new C17838cu(c34527OooO0oO3, AuthenticationConstants.HTTPS_PROTOCOL_STRING);
        C34527OooO0oO c34527OooO0oO4 = C17838cu.f53178b;
        f53186a = new C17838cu[]{c17838cu, c17838cu2, c17838cu3, c17838cu4, c17838cu5, c17838cu6, c17838cu7, new C17838cu(c34527OooO0oO4, PerfConstants.ScenarioConstants.SCENARIO_BROKERED_ACQUIRE_TOKEN_SILENTLY), new C17838cu(c34527OooO0oO4, TelemetryEventStrings.Api.GET_BROKER_DEVICE_MODE), new C17838cu(c34527OooO0oO4, TelemetryEventStrings.Api.BROKER_GET_ACCOUNTS), new C17838cu(c34527OooO0oO4, "304"), new C17838cu(c34527OooO0oO4, "400"), new C17838cu(c34527OooO0oO4, "404"), new C17838cu(c34527OooO0oO4, "500"), new C17838cu("accept-charset", ""), new C17838cu("accept-encoding", "gzip, deflate"), new C17838cu("accept-language", ""), new C17838cu("accept-ranges", ""), new C17838cu("accept", ""), new C17838cu("access-control-allow-origin", ""), new C17838cu("age", ""), new C17838cu("allow", ""), new C17838cu("authorization", ""), new C17838cu("cache-control", ""), new C17838cu("content-disposition", ""), new C17838cu("content-encoding", ""), new C17838cu("content-language", ""), new C17838cu("content-length", ""), new C17838cu("content-location", ""), new C17838cu("content-range", ""), new C17838cu("content-type", ""), new C17838cu("cookie", ""), new C17838cu("date", ""), new C17838cu("etag", ""), new C17838cu("expect", ""), new C17838cu("expires", ""), new C17838cu(Constants.MessagePayloadKeys.FROM, ""), new C17838cu("host", ""), new C17838cu("if-match", ""), new C17838cu("if-modified-since", ""), new C17838cu("if-none-match", ""), new C17838cu("if-range", ""), new C17838cu("if-unmodified-since", ""), new C17838cu("last-modified", ""), new C17838cu("link", ""), new C17838cu("location", ""), new C17838cu("max-forwards", ""), new C17838cu("proxy-authenticate", ""), new C17838cu("proxy-authorization", ""), new C17838cu("range", ""), new C17838cu(RequestParameters.SUBRESOURCE_REFERER, ""), new C17838cu("refresh", ""), new C17838cu("retry-after", ""), new C17838cu("server", ""), new C17838cu("set-cookie", ""), new C17838cu("strict-transport-security", ""), new C17838cu(C18190ga.f54967l, ""), new C17838cu("user-agent", ""), new C17838cu("vary", ""), new C17838cu("via", ""), new C17838cu("www-authenticate", "")};
        f53187b = m76528a();
    }

    /* JADX INFO: renamed from: a */
    public static C34527OooO0oO m76529a(C34527OooO0oO c34527OooO0oO) throws IOException {
        int iOooO0OO = c34527OooO0oO.OooO0OO();
        for (int i = 0; i < iOooO0OO; i++) {
            byte bOooO0o = c34527OooO0oO.OooO0o(i);
            if (bOooO0o >= 65 && bOooO0o <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c34527OooO0oO.OooOOO0()));
            }
        }
        return c34527OooO0oO;
    }

    /* JADX INFO: renamed from: a */
    private static Map<C34527OooO0oO, Integer> m76528a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f53186a.length);
        int i = 0;
        while (true) {
            C17838cu[] c17838cuArr = f53186a;
            if (i < c17838cuArr.length) {
                if (!linkedHashMap.containsKey(c17838cuArr[i].f53183g)) {
                    linkedHashMap.put(c17838cuArr[i].f53183g, Integer.valueOf(i));
                }
                i++;
            } else {
                return Collections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
