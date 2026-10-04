package com.huawei.hms.network.embedded;

import Oooo0oO.C21111o0ooOoO;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18377u7;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.g8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18188g8 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final C18160e8 f54924a;

    /* JADX INFO: renamed from: b */
    public final EnumC18132c8 f54925b;

    /* JADX INFO: renamed from: c */
    public final int f54926c;

    /* JADX INFO: renamed from: d */
    public final String f54927d;

    /* JADX INFO: renamed from: e */
    public final C18364t7 f54928e;

    /* JADX INFO: renamed from: f */
    public final C18377u7 f54929f;

    /* JADX INFO: renamed from: g */
    public final AbstractC18202h8 f54930g;

    /* JADX INFO: renamed from: h */
    public final C18188g8 f54931h;

    /* JADX INFO: renamed from: i */
    public final C18188g8 f54932i;

    /* JADX INFO: renamed from: j */
    public final C18188g8 f54933j;

    /* JADX INFO: renamed from: k */
    public final long f54934k;

    /* JADX INFO: renamed from: l */
    public final long f54935l;

    /* JADX INFO: renamed from: m */
    public final C18175f9 f54936m;

    /* JADX INFO: renamed from: n */
    public volatile C18145d7 f54937n;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g8$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public C18160e8 f54938a;

        /* JADX INFO: renamed from: b */
        public EnumC18132c8 f54939b;

        /* JADX INFO: renamed from: c */
        public int f54940c;

        /* JADX INFO: renamed from: d */
        public String f54941d;

        /* JADX INFO: renamed from: e */
        public C18364t7 f54942e;

        /* JADX INFO: renamed from: f */
        public C18377u7.a f54943f;

        /* JADX INFO: renamed from: g */
        public AbstractC18202h8 f54944g;

        /* JADX INFO: renamed from: h */
        public C18188g8 f54945h;

        /* JADX INFO: renamed from: i */
        public C18188g8 f54946i;

        /* JADX INFO: renamed from: j */
        public C18188g8 f54947j;

        /* JADX INFO: renamed from: k */
        public long f54948k;

        /* JADX INFO: renamed from: l */
        public long f54949l;

        /* JADX INFO: renamed from: m */
        public C18175f9 f54950m;

        public a() {
            this.f54940c = -1;
            this.f54943f = new C18377u7.a();
        }

        /* JADX INFO: renamed from: d */
        private void m78594d(C18188g8 c18188g8) {
            if (c18188g8.f54930g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* JADX INFO: renamed from: a */
        public a m78595a(int i) {
            this.f54940c = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m78607b(long j) {
            this.f54948k = j;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m78611c(C18188g8 c18188g8) {
            if (c18188g8 != null) {
                m78594d(c18188g8);
            }
            this.f54947j = c18188g8;
            return this;
        }

        public a(C18188g8 c18188g8) {
            this.f54940c = -1;
            this.f54938a = c18188g8.f54924a;
            this.f54939b = c18188g8.f54925b;
            this.f54940c = c18188g8.f54926c;
            this.f54941d = c18188g8.f54927d;
            this.f54942e = c18188g8.f54928e;
            this.f54943f = c18188g8.f54929f.m79617c();
            this.f54944g = c18188g8.f54930g;
            this.f54945h = c18188g8.f54931h;
            this.f54946i = c18188g8.f54932i;
            this.f54947j = c18188g8.f54933j;
            this.f54948k = c18188g8.f54934k;
            this.f54949l = c18188g8.f54935l;
            this.f54950m = c18188g8.f54936m;
        }

        /* JADX INFO: renamed from: a */
        public a m78596a(long j) {
            this.f54949l = j;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m78608b(C18188g8 c18188g8) {
            if (c18188g8 != null) {
                m78593a("networkResponse", c18188g8);
            }
            this.f54945h = c18188g8;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78597a(EnumC18132c8 enumC18132c8) {
            this.f54939b = enumC18132c8;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m78609b(String str) {
            this.f54943f.m79634d(str);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78598a(C18160e8 c18160e8) {
            this.f54938a = c18160e8;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m78610b(String str, String str2) {
            this.f54943f.m79635d(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78599a(C18188g8 c18188g8) {
            if (c18188g8 != null) {
                m78593a("cacheResponse", c18188g8);
            }
            this.f54946i = c18188g8;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78600a(AbstractC18202h8 abstractC18202h8) {
            this.f54944g = abstractC18202h8;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78601a(C18364t7 c18364t7) {
            this.f54942e = c18364t7;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78602a(C18377u7 c18377u7) {
            this.f54943f = c18377u7.m79617c();
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78603a(String str) {
            this.f54941d = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78604a(String str, String str2) {
            this.f54943f.m79624a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C18188g8 m78605a() {
            if (this.f54938a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f54939b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f54940c >= 0) {
                if (this.f54941d != null) {
                    return new C18188g8(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.f54940c);
        }

        /* JADX INFO: renamed from: a */
        public void m78606a(C18175f9 c18175f9) {
            this.f54950m = c18175f9;
        }

        /* JADX INFO: renamed from: a */
        private void m78593a(String str, C18188g8 c18188g8) {
            if (c18188g8.f54930g != null) {
                throw new IllegalArgumentException(C21111o0ooOoO.OooO0Oo(str, ".body != null"));
            }
            if (c18188g8.f54931h != null) {
                throw new IllegalArgumentException(C21111o0ooOoO.OooO0Oo(str, ".networkResponse != null"));
            }
            if (c18188g8.f54932i != null) {
                throw new IllegalArgumentException(C21111o0ooOoO.OooO0Oo(str, ".cacheResponse != null"));
            }
            if (c18188g8.f54933j != null) {
                throw new IllegalArgumentException(C21111o0ooOoO.OooO0Oo(str, ".priorResponse != null"));
            }
        }
    }

    public C18188g8(a aVar) {
        this.f54924a = aVar.f54938a;
        this.f54925b = aVar.f54939b;
        this.f54926c = aVar.f54940c;
        this.f54927d = aVar.f54941d;
        this.f54928e = aVar.f54942e;
        this.f54929f = aVar.f54943f.m79627a();
        this.f54930g = aVar.f54944g;
        this.f54931h = aVar.f54945h;
        this.f54932i = aVar.f54946i;
        this.f54933j = aVar.f54947j;
        this.f54934k = aVar.f54948k;
        this.f54935l = aVar.f54949l;
        this.f54936m = aVar.f54950m;
    }

    /* JADX INFO: renamed from: A */
    public boolean m78571A() {
        int i = this.f54926c;
        return i >= 200 && i < 300;
    }

    /* JADX INFO: renamed from: B */
    public String m78572B() {
        return this.f54927d;
    }

    /* JADX INFO: renamed from: C */
    public C18188g8 m78573C() {
        return this.f54931h;
    }

    /* JADX INFO: renamed from: D */
    public a m78574D() {
        return new a(this);
    }

    /* JADX INFO: renamed from: E */
    public C18188g8 m78575E() {
        return this.f54933j;
    }

    /* JADX INFO: renamed from: F */
    public EnumC18132c8 m78576F() {
        return this.f54925b;
    }

    /* JADX INFO: renamed from: G */
    public long m78577G() {
        return this.f54935l;
    }

    /* JADX INFO: renamed from: H */
    public C18160e8 m78578H() {
        return this.f54924a;
    }

    /* JADX INFO: renamed from: I */
    public long m78579I() {
        return this.f54934k;
    }

    /* JADX INFO: renamed from: J */
    public C18377u7 m78580J() throws IOException {
        C18175f9 c18175f9 = this.f54936m;
        if (c18175f9 != null) {
            return c18175f9.m78438l();
        }
        throw new IllegalStateException("trailers not available");
    }

    /* JADX INFO: renamed from: a */
    public String m78581a(String str, String str2) {
        String strM79613a = this.f54929f.m79613a(str);
        return strM79613a != null ? strM79613a : str2;
    }

    /* JADX INFO: renamed from: b */
    public String m78582b(String str) {
        return m78581a(str, null);
    }

    /* JADX INFO: renamed from: c */
    public List<String> m78583c(String str) {
        return this.f54929f.m79620d(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC18202h8 abstractC18202h8 = this.f54930g;
        if (abstractC18202h8 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC18202h8.close();
    }

    /* JADX INFO: renamed from: j */
    public AbstractC18202h8 m78584j(long j) throws IOException {
        InterfaceC18289nb interfaceC18289nbPeek = this.f54930g.mo78126x().peek();
        C18261lb c18261lb = new C18261lb();
        interfaceC18289nbPeek.mo78391g(j);
        c18261lb.mo78260a(interfaceC18289nbPeek, Math.min(j, interfaceC18289nbPeek.mo78386d().m79076B()));
        return AbstractC18202h8.m78681a(this.f54930g.mo78125w(), c18261lb.m79076B(), c18261lb);
    }

    /* JADX INFO: renamed from: s */
    public AbstractC18202h8 m78585s() {
        return this.f54930g;
    }

    /* JADX INFO: renamed from: t */
    public C18145d7 m78586t() {
        C18145d7 c18145d7 = this.f54937n;
        if (c18145d7 != null) {
            return c18145d7;
        }
        C18145d7 c18145d7M78189a = C18145d7.m78189a(this.f54929f);
        this.f54937n = c18145d7M78189a;
        return c18145d7M78189a;
    }

    public String toString() {
        return "Response{protocol=" + this.f54925b + ", code=" + this.f54926c + ", message=" + this.f54927d + ", url=" + this.f54924a.m78310k() + '}';
    }

    /* JADX INFO: renamed from: u */
    public C18188g8 m78587u() {
        return this.f54932i;
    }

    /* JADX INFO: renamed from: v */
    public List<C18201h7> m78588v() {
        String str;
        int i = this.f54926c;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return Collections.EMPTY_LIST;
            }
            str = HttpHeaders.PROXY_AUTHENTICATE;
        }
        return C18353s9.m79522a(m78591y(), str);
    }

    /* JADX INFO: renamed from: w */
    public int m78589w() {
        return this.f54926c;
    }

    /* JADX INFO: renamed from: x */
    public C18364t7 m78590x() {
        return this.f54928e;
    }

    /* JADX INFO: renamed from: y */
    public C18377u7 m78591y() {
        return this.f54929f;
    }

    /* JADX INFO: renamed from: z */
    public boolean m78592z() {
        int i = this.f54926c;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }
}
