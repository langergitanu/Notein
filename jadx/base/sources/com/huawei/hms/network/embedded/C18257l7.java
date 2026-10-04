package com.huawei.hms.network.embedded;

import androidx.appcompat.app.OooOOO;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.l7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18257l7 {

    /* JADX INFO: renamed from: e */
    public static final C18215i7[] f55611e;

    /* JADX INFO: renamed from: f */
    public static final C18215i7[] f55612f;

    /* JADX INFO: renamed from: g */
    public static final C18257l7 f55613g;

    /* JADX INFO: renamed from: h */
    public static final C18257l7 f55614h;

    /* JADX INFO: renamed from: i */
    public static final C18257l7 f55615i;

    /* JADX INFO: renamed from: j */
    public static final C18257l7 f55616j;

    /* JADX INFO: renamed from: a */
    public final boolean f55617a;

    /* JADX INFO: renamed from: b */
    public final boolean f55618b;

    /* JADX INFO: renamed from: c */
    public final String[] f55619c;

    /* JADX INFO: renamed from: d */
    public final String[] f55620d;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.l7$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f55621a;

        /* JADX INFO: renamed from: b */
        public String[] f55622b;

        /* JADX INFO: renamed from: c */
        public String[] f55623c;

        /* JADX INFO: renamed from: d */
        public boolean f55624d;

        public a(C18257l7 c18257l7) {
            this.f55621a = c18257l7.f55617a;
            this.f55622b = c18257l7.f55619c;
            this.f55623c = c18257l7.f55620d;
            this.f55624d = c18257l7.f55618b;
        }

        /* JADX INFO: renamed from: a */
        public a m79056a() {
            if (!this.f55621a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            this.f55622b = null;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m79061b() {
            if (!this.f55621a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            this.f55623c = null;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18257l7 m79063c() {
            return new C18257l7(this);
        }

        public a(boolean z) {
            this.f55621a = z;
        }

        /* JADX INFO: renamed from: a */
        public a m79057a(boolean z) {
            if (!this.f55621a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f55624d = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m79062b(String... strArr) {
            if (!this.f55621a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f55623c = (String[]) strArr.clone();
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m79058a(C18215i7... c18215i7Arr) {
            if (!this.f55621a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[c18215i7Arr.length];
            for (int i = 0; i < c18215i7Arr.length; i++) {
                strArr[i] = c18215i7Arr[i].f55230a;
            }
            return m79060a(strArr);
        }

        /* JADX INFO: renamed from: a */
        public a m79059a(EnumC18230j8... enumC18230j8Arr) {
            if (!this.f55621a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[enumC18230j8Arr.length];
            for (int i = 0; i < enumC18230j8Arr.length; i++) {
                strArr[i] = enumC18230j8Arr[i].f55359a;
            }
            return m79062b(strArr);
        }

        /* JADX INFO: renamed from: a */
        public a m79060a(String... strArr) {
            if (!this.f55621a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f55622b = (String[]) strArr.clone();
            return this;
        }
    }

    static {
        C18215i7 c18215i7 = C18215i7.f55201n1;
        C18215i7 c18215i72 = C18215i7.f55204o1;
        C18215i7 c18215i73 = C18215i7.f55207p1;
        C18215i7 c18215i74 = C18215i7.f55160Z0;
        C18215i7 c18215i75 = C18215i7.f55171d1;
        C18215i7 c18215i76 = C18215i7.f55162a1;
        C18215i7 c18215i77 = C18215i7.f55174e1;
        C18215i7 c18215i78 = C18215i7.f55192k1;
        C18215i7 c18215i79 = C18215i7.f55189j1;
        C18215i7[] c18215i7Arr = {c18215i7, c18215i72, c18215i73, c18215i74, c18215i75, c18215i76, c18215i77, c18215i78, c18215i79};
        f55611e = c18215i7Arr;
        C18215i7[] c18215i7Arr2 = {c18215i7, c18215i72, c18215i73, c18215i74, c18215i75, c18215i76, c18215i77, c18215i78, c18215i79, C18215i7.f55130K0, C18215i7.f55132L0, C18215i7.f55185i0, C18215i7.f55188j0, C18215i7.f55121G, C18215i7.f55129K, C18215i7.f55190k};
        f55612f = c18215i7Arr2;
        a aVarM79058a = new a(true).m79058a(c18215i7Arr);
        EnumC18230j8 enumC18230j8 = EnumC18230j8.TLS_1_3;
        EnumC18230j8 enumC18230j82 = EnumC18230j8.TLS_1_2;
        f55613g = aVarM79058a.m79059a(enumC18230j8, enumC18230j82).m79057a(true).m79063c();
        f55614h = new a(true).m79058a(c18215i7Arr2).m79059a(enumC18230j8, enumC18230j82).m79057a(true).m79063c();
        f55615i = new a(true).m79058a(c18215i7Arr2).m79059a(enumC18230j8, enumC18230j82, EnumC18230j8.TLS_1_1, EnumC18230j8.TLS_1_0).m79057a(true).m79063c();
        f55616j = new a(false).m79063c();
    }

    public C18257l7(a aVar) {
        this.f55617a = aVar.f55621a;
        this.f55619c = aVar.f55622b;
        this.f55620d = aVar.f55623c;
        this.f55618b = aVar.f55624d;
    }

    /* JADX INFO: renamed from: b */
    private C18257l7 m79049b(SSLSocket sSLSocket, boolean z) {
        String[] strArrM79386a = this.f55619c != null ? C18313p8.m79386a(C18215i7.f55163b, sSLSocket.getEnabledCipherSuites(), this.f55619c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrM79386a2 = this.f55620d != null ? C18313p8.m79386a(C18313p8.f55901j, sSLSocket.getEnabledProtocols(), this.f55620d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iM79362a = C18313p8.m79362a(C18215i7.f55163b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && iM79362a != -1) {
            strArrM79386a = C18313p8.m79387a(strArrM79386a, supportedCipherSuites[iM79362a]);
        }
        return new a(this).m79060a(strArrM79386a).m79062b(strArrM79386a2).m79063c();
    }

    /* JADX INFO: renamed from: a */
    public List<C18215i7> m79050a() {
        String[] strArr = this.f55619c;
        if (strArr != null) {
            return C18215i7.m78763a(strArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m79054c() {
        return this.f55618b;
    }

    /* JADX INFO: renamed from: d */
    public List<EnumC18230j8> m79055d() {
        String[] strArr = this.f55620d;
        if (strArr != null) {
            return EnumC18230j8.m78884a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18257l7)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C18257l7 c18257l7 = (C18257l7) obj;
        boolean z = this.f55617a;
        if (z != c18257l7.f55617a) {
            return false;
        }
        return !z || (Arrays.equals(this.f55619c, c18257l7.f55619c) && Arrays.equals(this.f55620d, c18257l7.f55620d) && this.f55618b == c18257l7.f55618b);
    }

    public int hashCode() {
        if (this.f55617a) {
            return ((((Arrays.hashCode(this.f55619c) + 527) * 31) + Arrays.hashCode(this.f55620d)) * 31) + (!this.f55618b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f55617a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(m79050a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(m79055d(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return OooOOO.OooO00o(sb, ")", this.f55618b);
    }

    /* JADX INFO: renamed from: a */
    public void m79051a(SSLSocket sSLSocket, boolean z) {
        C18257l7 c18257l7M79049b = m79049b(sSLSocket, z);
        String[] strArr = c18257l7M79049b.f55620d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = c18257l7M79049b.f55619c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m79053b() {
        return this.f55617a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m79052a(SSLSocket sSLSocket) {
        if (!this.f55617a) {
            return false;
        }
        String[] strArr = this.f55620d;
        if (strArr != null && !C18313p8.m79392b(C18313p8.f55901j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f55619c;
        return strArr2 == null || C18313p8.m79392b(C18215i7.f55163b, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
