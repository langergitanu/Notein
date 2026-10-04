package com.huawei.hms.drive;

import androidx.appcompat.app.OooOOO;
import com.aspose.slides.internal.p332p7.OooO0o;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.huawei.hms.drive.ar */
/* JADX INFO: loaded from: classes6.dex */
public final class C17781ar {

    /* JADX INFO: renamed from: a */
    public static final C17781ar f52707a;

    /* JADX INFO: renamed from: b */
    public static final C17781ar f52708b;

    /* JADX INFO: renamed from: c */
    public static final C17781ar f52709c;

    /* JADX INFO: renamed from: d */
    public static final C17781ar f52710d;

    /* JADX INFO: renamed from: i */
    private static final C17778ao[] f52711i;

    /* JADX INFO: renamed from: j */
    private static final C17778ao[] f52712j;

    /* JADX INFO: renamed from: e */
    final boolean f52713e;

    /* JADX INFO: renamed from: f */
    final boolean f52714f;

    /* JADX INFO: renamed from: g */
    final String[] f52715g;

    /* JADX INFO: renamed from: h */
    final String[] f52716h;

    static {
        C17778ao c17778ao = C17778ao.f52638aR;
        C17778ao c17778ao2 = C17778ao.f52639aS;
        C17778ao c17778ao3 = C17778ao.f52640aT;
        C17778ao c17778ao4 = C17778ao.f52641aU;
        C17778ao c17778ao5 = C17778ao.f52642aV;
        C17778ao c17778ao6 = C17778ao.f52625aE;
        C17778ao c17778ao7 = C17778ao.f52629aI;
        C17778ao c17778ao8 = C17778ao.f52626aF;
        C17778ao c17778ao9 = C17778ao.f52630aJ;
        C17778ao c17778ao10 = C17778ao.f52636aP;
        C17778ao c17778ao11 = C17778ao.f52635aO;
        C17778ao[] c17778aoArr = {c17778ao, c17778ao2, c17778ao3, c17778ao4, c17778ao5, c17778ao6, c17778ao7, c17778ao8, c17778ao9, c17778ao10, c17778ao11};
        f52711i = c17778aoArr;
        C17778ao[] c17778aoArr2 = {c17778ao, c17778ao2, c17778ao3, c17778ao4, c17778ao5, c17778ao6, c17778ao7, c17778ao8, c17778ao9, c17778ao10, c17778ao11, C17778ao.f52659ap, C17778ao.f52660aq, C17778ao.f52607N, C17778ao.f52608O, C17778ao.f52682n, C17778ao.f52685q, C17778ao.f52674f};
        f52712j = c17778aoArr2;
        a aVarM76018a = new a(true).m76018a(c17778aoArr);
        EnumC17803bm enumC17803bm = EnumC17803bm.TLS_1_3;
        EnumC17803bm enumC17803bm2 = EnumC17803bm.TLS_1_2;
        f52707a = aVarM76018a.m76019a(enumC17803bm, enumC17803bm2).m76017a(true).m76021a();
        a aVarM76018a2 = new a(true).m76018a(c17778aoArr2);
        EnumC17803bm enumC17803bm3 = EnumC17803bm.TLS_1_1;
        EnumC17803bm enumC17803bm4 = EnumC17803bm.TLS_1_0;
        f52708b = aVarM76018a2.m76019a(enumC17803bm, enumC17803bm2, enumC17803bm3, enumC17803bm4).m76017a(true).m76021a();
        f52709c = new a(true).m76018a(c17778aoArr2).m76019a(enumC17803bm4).m76017a(true).m76021a();
        f52710d = new a(false).m76021a();
    }

    public C17781ar(a aVar) {
        this.f52713e = aVar.f52717a;
        this.f52715g = aVar.f52718b;
        this.f52716h = aVar.f52719c;
        this.f52714f = aVar.f52720d;
    }

    /* JADX INFO: renamed from: a */
    public boolean m76012a() {
        return this.f52713e;
    }

    /* JADX INFO: renamed from: b */
    public List<C17778ao> m76014b() {
        String[] strArr = this.f52715g;
        if (strArr != null) {
            return C17778ao.m75992a(strArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public List<EnumC17803bm> m76015c() {
        String[] strArr = this.f52716h;
        if (strArr != null) {
            return EnumC17803bm.m76320a(strArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m76016d() {
        return this.f52714f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17781ar)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C17781ar c17781ar = (C17781ar) obj;
        boolean z = this.f52713e;
        if (z != c17781ar.f52713e) {
            return false;
        }
        return !z || (Arrays.equals(this.f52715g, c17781ar.f52715g) && Arrays.equals(this.f52716h, c17781ar.f52716h) && this.f52714f == c17781ar.f52714f);
    }

    public int hashCode() {
        if (this.f52713e) {
            return ((((527 + Arrays.hashCode(this.f52715g)) * 31) + Arrays.hashCode(this.f52716h)) * 31) + (!this.f52714f ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.f52713e) {
            return OooOOO.OooO00o(OooO0o.OooO0O0("ConnectionSpec(cipherSuites=", this.f52715g != null ? m76014b().toString() : "[all enabled]", ", tlsVersions=", this.f52716h != null ? m76015c().toString() : "[all enabled]", ", supportsTlsExtensions="), ")", this.f52714f);
        }
        return "ConnectionSpec()";
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.ar$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        boolean f52717a;

        /* JADX INFO: renamed from: b */
        String[] f52718b;

        /* JADX INFO: renamed from: c */
        String[] f52719c;

        /* JADX INFO: renamed from: d */
        boolean f52720d;

        public a(boolean z) {
            this.f52717a = z;
        }

        /* JADX INFO: renamed from: a */
        public a m76018a(C17778ao... c17778aoArr) {
            if (!this.f52717a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[c17778aoArr.length];
            for (int i = 0; i < c17778aoArr.length; i++) {
                strArr[i] = c17778aoArr[i].f52695aW;
            }
            return m76020a(strArr);
        }

        /* JADX INFO: renamed from: b */
        public a m76022b(String... strArr) {
            if (!this.f52717a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f52719c = (String[]) strArr.clone();
            return this;
        }

        public a(C17781ar c17781ar) {
            this.f52717a = c17781ar.f52713e;
            this.f52718b = c17781ar.f52715g;
            this.f52719c = c17781ar.f52716h;
            this.f52720d = c17781ar.f52714f;
        }

        /* JADX INFO: renamed from: a */
        public a m76020a(String... strArr) {
            if (this.f52717a) {
                if (strArr.length != 0) {
                    this.f52718b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* JADX INFO: renamed from: a */
        public a m76019a(EnumC17803bm... enumC17803bmArr) {
            if (this.f52717a) {
                String[] strArr = new String[enumC17803bmArr.length];
                for (int i = 0; i < enumC17803bmArr.length; i++) {
                    strArr[i] = enumC17803bmArr[i].f52951f;
                }
                return m76022b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* JADX INFO: renamed from: a */
        public a m76017a(boolean z) {
            if (this.f52717a) {
                this.f52720d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* JADX INFO: renamed from: a */
        public C17781ar m76021a() {
            return new C17781ar(this);
        }
    }

    /* JADX INFO: renamed from: b */
    private C17781ar m76010b(SSLSocket sSLSocket, boolean z) {
        String[] strArrM76345a = this.f52715g != null ? C17806bp.m76345a(C17778ao.f52620a, sSLSocket.getEnabledCipherSuites(), this.f52715g) : sSLSocket.getEnabledCipherSuites();
        String[] strArrM76345a2 = this.f52716h != null ? C17806bp.m76345a(C17806bp.f52961h, sSLSocket.getEnabledProtocols(), this.f52716h) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iM76326a = C17806bp.m76326a(C17778ao.f52620a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && iM76326a != -1) {
            strArrM76345a = C17806bp.m76346a(strArrM76345a, supportedCipherSuites[iM76326a]);
        }
        return new a(this).m76020a(strArrM76345a).m76022b(strArrM76345a2).m76021a();
    }

    /* JADX INFO: renamed from: a */
    public void m76011a(SSLSocket sSLSocket, boolean z) {
        C17781ar c17781arM76010b = m76010b(sSLSocket, z);
        String[] strArr = c17781arM76010b.f52716h;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = c17781arM76010b.f52715g;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m76013a(SSLSocket sSLSocket) {
        if (!this.f52713e) {
            return false;
        }
        String[] strArr = this.f52716h;
        if (strArr != null && !C17806bp.m76350b(C17806bp.f52961h, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f52715g;
        return strArr2 == null || C17806bp.m76350b(C17778ao.f52620a, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
