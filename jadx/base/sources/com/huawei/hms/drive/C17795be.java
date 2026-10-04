package com.huawei.hms.drive;

import Oooo0oO.C21023OooO0Oo;
import com.huawei.hms.drive.AbstractC17786aw;
import com.huawei.hms.drive.C17780aq;
import com.huawei.hms.drive.C17788ay;
import com.huawei.hms.drive.C17800bj;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAuthorizationResponse;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.drive.be */
/* JADX INFO: loaded from: classes6.dex */
public class C17795be implements Cloneable {

    /* JADX INFO: renamed from: a */
    static final List<EnumC17796bf> f52809a = C17806bp.m76333a(EnumC17796bf.HTTP_2, EnumC17796bf.HTTP_1_1);

    /* JADX INFO: renamed from: b */
    static final List<C17781ar> f52810b = C17806bp.m76333a(C17781ar.f52708b, C17781ar.f52710d);

    /* JADX INFO: renamed from: A */
    final int f52811A;

    /* JADX INFO: renamed from: B */
    final int f52812B;

    /* JADX INFO: renamed from: C */
    final int f52813C;

    /* JADX INFO: renamed from: D */
    final int f52814D;

    /* JADX INFO: renamed from: E */
    final b f52815E;

    /* JADX INFO: renamed from: F */
    final int f52816F;

    /* JADX INFO: renamed from: c */
    final C17784au f52817c;

    /* JADX INFO: renamed from: d */
    final Proxy f52818d;

    /* JADX INFO: renamed from: e */
    final List<EnumC17796bf> f52819e;

    /* JADX INFO: renamed from: f */
    final List<C17781ar> f52820f;

    /* JADX INFO: renamed from: g */
    final List<InterfaceC17793bc> f52821g;

    /* JADX INFO: renamed from: h */
    final List<InterfaceC17793bc> f52822h;

    /* JADX INFO: renamed from: i */
    final AbstractC17786aw.a f52823i;

    /* JADX INFO: renamed from: j */
    final ProxySelector f52824j;

    /* JADX INFO: renamed from: k */
    final InterfaceC17783at f52825k;

    /* JADX INFO: renamed from: l */
    final C17773aj f52826l;

    /* JADX INFO: renamed from: m */
    final InterfaceC17812bv f52827m;

    /* JADX INFO: renamed from: n */
    final SocketFactory f52828n;

    /* JADX INFO: renamed from: o */
    final SSLSocketFactory f52829o;

    /* JADX INFO: renamed from: p */
    final AbstractC17863ds f52830p;

    /* JADX INFO: renamed from: q */
    final HostnameVerifier f52831q;

    /* JADX INFO: renamed from: r */
    final C17777an f52832r;

    /* JADX INFO: renamed from: s */
    final InterfaceC17772ai f52833s;

    /* JADX INFO: renamed from: t */
    final InterfaceC17772ai f52834t;

    /* JADX INFO: renamed from: u */
    final C17780aq f52835u;

    /* JADX INFO: renamed from: v */
    final InterfaceC17785av f52836v;

    /* JADX INFO: renamed from: w */
    final boolean f52837w;

    /* JADX INFO: renamed from: x */
    final boolean f52838x;

    /* JADX INFO: renamed from: y */
    final boolean f52839y;

    /* JADX INFO: renamed from: z */
    final int f52840z;

    /* JADX INFO: renamed from: com.huawei.hms.drive.be$a */
    public static final class a {

        /* JADX INFO: renamed from: A */
        int f52841A;

        /* JADX INFO: renamed from: B */
        int f52842B;

        /* JADX INFO: renamed from: C */
        int f52843C;

        /* JADX INFO: renamed from: b */
        Proxy f52845b;

        /* JADX INFO: renamed from: h */
        ProxySelector f52851h;

        /* JADX INFO: renamed from: i */
        InterfaceC17783at f52852i;

        /* JADX INFO: renamed from: j */
        C17773aj f52853j;

        /* JADX INFO: renamed from: k */
        InterfaceC17812bv f52854k;

        /* JADX INFO: renamed from: l */
        SocketFactory f52855l;

        /* JADX INFO: renamed from: m */
        SSLSocketFactory f52856m;

        /* JADX INFO: renamed from: n */
        AbstractC17863ds f52857n;

        /* JADX INFO: renamed from: o */
        HostnameVerifier f52858o;

        /* JADX INFO: renamed from: p */
        C17777an f52859p;

        /* JADX INFO: renamed from: q */
        InterfaceC17772ai f52860q;

        /* JADX INFO: renamed from: r */
        InterfaceC17772ai f52861r;

        /* JADX INFO: renamed from: s */
        C17780aq f52862s;

        /* JADX INFO: renamed from: t */
        InterfaceC17785av f52863t;

        /* JADX INFO: renamed from: u */
        boolean f52864u;

        /* JADX INFO: renamed from: v */
        boolean f52865v;

        /* JADX INFO: renamed from: w */
        boolean f52866w;

        /* JADX INFO: renamed from: x */
        int f52867x;

        /* JADX INFO: renamed from: y */
        int f52868y;

        /* JADX INFO: renamed from: z */
        int f52869z;

        /* JADX INFO: renamed from: e */
        final List<InterfaceC17793bc> f52848e = new ArrayList();

        /* JADX INFO: renamed from: f */
        final List<InterfaceC17793bc> f52849f = new ArrayList();

        /* JADX INFO: renamed from: a */
        C17784au f52844a = new C17784au();

        /* JADX INFO: renamed from: c */
        List<EnumC17796bf> f52846c = C17795be.f52809a;

        /* JADX INFO: renamed from: d */
        List<C17781ar> f52847d = C17795be.f52810b;

        /* JADX INFO: renamed from: g */
        AbstractC17786aw.a f52850g = AbstractC17786aw.m76044a(AbstractC17786aw.f52744a);

        public a() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f52851h = proxySelector;
            if (proxySelector == null) {
                this.f52851h = new C17859do();
            }
            this.f52852i = InterfaceC17783at.f52734a;
            this.f52855l = SocketFactory.getDefault();
            this.f52858o = C17864dt.f53397a;
            this.f52859p = C17777an.f52586a;
            InterfaceC17772ai interfaceC17772ai = InterfaceC17772ai.f52560a;
            this.f52860q = interfaceC17772ai;
            this.f52861r = interfaceC17772ai;
            this.f52862s = new C17780aq();
            this.f52863t = InterfaceC17785av.f52743a;
            this.f52864u = true;
            this.f52865v = true;
            this.f52866w = true;
            this.f52867x = 0;
            this.f52868y = 10000;
            this.f52869z = 10000;
            this.f52841A = 10000;
            this.f52842B = 0;
            this.f52843C = 200;
        }

        /* JADX INFO: renamed from: a */
        public a m76232a(long j, TimeUnit timeUnit) {
            int iM76325a = C17806bp.m76325a("timeout", j, timeUnit);
            this.f52868y = iM76325a;
            if (this.f52843C < iM76325a) {
                return this;
            }
            StringBuilder sb = new StringBuilder("Connection Attempt Delay (");
            sb.append(this.f52843C);
            sb.append(" ms) is greater than or equal to Connect Timeout (");
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" ms)", this.f52868y, sb));
        }

        /* JADX INFO: renamed from: b */
        public a m76239b(long j, TimeUnit timeUnit) {
            this.f52869z = C17806bp.m76325a("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m76241c(long j, TimeUnit timeUnit) {
            this.f52841A = C17806bp.m76325a("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m76242d(long j, TimeUnit timeUnit) {
            this.f52842B = C17806bp.m76325a(MicrosoftAuthorizationResponse.INTERVAL, j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m76240b(boolean z) {
            this.f52865v = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76236a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            if (x509TrustManager != null) {
                this.f52856m = sSLSocketFactory;
                this.f52857n = AbstractC17863ds.m76765a(x509TrustManager);
                return this;
            }
            throw new NullPointerException("trustManager == null");
        }

        /* JADX INFO: renamed from: a */
        public a m76235a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f52858o = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        /* JADX INFO: renamed from: a */
        public a m76233a(C17780aq c17780aq) {
            if (c17780aq != null) {
                this.f52862s = c17780aq;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        /* JADX INFO: renamed from: a */
        public a m76237a(boolean z) {
            this.f52864u = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76234a(C17784au c17784au) {
            if (c17784au != null) {
                this.f52844a = c17784au;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        /* JADX INFO: renamed from: a */
        public C17795be m76238a() {
            return new C17795be(this);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.be$b */
    public class b implements C17780aq.a {
        private b() {
        }

        @Override // com.huawei.hms.drive.C17780aq.a
        /* JADX INFO: renamed from: a */
        public void mo76009a(String str, int i, String str2) {
            C17795be.this.f52817c.mo75948b(str, i, str2);
        }
    }

    static {
        AbstractC17804bn.f52952a = new AbstractC17804bn() { // from class: com.huawei.hms.drive.be.1
            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: a */
            public void mo76227a(C17788ay.a aVar, String str) {
                aVar.m76079a(str);
            }

            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: b */
            public void mo76231b(C17780aq c17780aq, C17818ca c17818ca) {
                c17780aq.m76006a(c17818ca);
            }

            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: a */
            public void mo76228a(C17788ay.a aVar, String str, String str2) {
                aVar.m76083b(str, str2);
            }

            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: a */
            public boolean mo76230a(C17780aq c17780aq, C17818ca c17818ca) {
                return c17780aq.m76007b(c17818ca);
            }

            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: a */
            public C17818ca mo76222a(C17780aq c17780aq, C17771ah c17771ah, C17822ce c17822ce, C17802bl c17802bl) {
                return c17780aq.m76003a(c17771ah, c17822ce, c17802bl);
            }

            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: a */
            public boolean mo76229a(C17771ah c17771ah, C17771ah c17771ah2) {
                return c17771ah.m75951a(c17771ah2);
            }

            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: a */
            public Socket mo76225a(C17795be c17795be, C17780aq c17780aq, C17771ah c17771ah, C17822ce c17822ce) {
                return c17780aq.m76004a(c17771ah, c17822ce, c17795be.m76215u().mo76042c());
            }

            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: a */
            public C17819cb mo76223a(C17780aq c17780aq) {
                return c17780aq.f52698a;
            }

            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: a */
            public int mo76221a(C17800bj.a aVar) {
                return aVar.f52929c;
            }

            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: a */
            public void mo76226a(C17781ar c17781ar, SSLSocket sSLSocket, boolean z) {
                c17781ar.m76011a(sSLSocket, z);
            }

            @Override // com.huawei.hms.drive.AbstractC17804bn
            /* JADX INFO: renamed from: a */
            public IOException mo76224a(InterfaceC17775al interfaceC17775al, IOException iOException) {
                return ((C17797bg) interfaceC17775al).m76247a(iOException);
            }
        };
    }

    public C17795be() {
        this(new a());
    }

    /* JADX INFO: renamed from: a */
    private static SSLSocketFactory m76190a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextMo76734c = C17858dn.m76756e().mo76734c();
            sSLContextMo76734c.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextMo76734c.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C17806bp.m76327a("No System TLS", (Exception) e);
        }
    }

    /* JADX INFO: renamed from: A */
    public AbstractC17786aw.a m76191A() {
        return this.f52823i;
    }

    /* JADX INFO: renamed from: b */
    public int m76195b() {
        return this.f52811A;
    }

    /* JADX INFO: renamed from: c */
    public int m76197c() {
        return this.f52812B;
    }

    /* JADX INFO: renamed from: d */
    public int m76198d() {
        return this.f52813C;
    }

    /* JADX INFO: renamed from: e */
    public int m76199e() {
        return this.f52814D;
    }

    /* JADX INFO: renamed from: f */
    public Proxy m76200f() {
        return this.f52818d;
    }

    /* JADX INFO: renamed from: g */
    public ProxySelector m76201g() {
        return this.f52824j;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC17783at m76202h() {
        return this.f52825k;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC17812bv m76203i() {
        C17773aj c17773aj = this.f52826l;
        return c17773aj != null ? c17773aj.f52561a : this.f52827m;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC17785av m76204j() {
        return this.f52836v;
    }

    /* JADX INFO: renamed from: k */
    public SocketFactory m76205k() {
        return this.f52828n;
    }

    /* JADX INFO: renamed from: l */
    public SSLSocketFactory m76206l() {
        return this.f52829o;
    }

    /* JADX INFO: renamed from: m */
    public HostnameVerifier m76207m() {
        return this.f52831q;
    }

    /* JADX INFO: renamed from: n */
    public C17777an m76208n() {
        return this.f52832r;
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC17772ai m76209o() {
        return this.f52834t;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC17772ai m76210p() {
        return this.f52833s;
    }

    /* JADX INFO: renamed from: q */
    public C17780aq m76211q() {
        return this.f52835u;
    }

    /* JADX INFO: renamed from: r */
    public boolean m76212r() {
        return this.f52837w;
    }

    /* JADX INFO: renamed from: s */
    public boolean m76213s() {
        return this.f52838x;
    }

    /* JADX INFO: renamed from: t */
    public boolean m76214t() {
        return this.f52839y;
    }

    /* JADX INFO: renamed from: u */
    public C17784au m76215u() {
        return this.f52817c;
    }

    /* JADX INFO: renamed from: v */
    public List<EnumC17796bf> m76216v() {
        return this.f52819e;
    }

    /* JADX INFO: renamed from: w */
    public List<C17781ar> m76217w() {
        return this.f52820f;
    }

    /* JADX INFO: renamed from: x */
    public int m76218x() {
        return this.f52816F;
    }

    /* JADX INFO: renamed from: y */
    public List<InterfaceC17793bc> m76219y() {
        return this.f52821g;
    }

    /* JADX INFO: renamed from: z */
    public List<InterfaceC17793bc> m76220z() {
        return this.f52822h;
    }

    public C17795be(a aVar) {
        boolean z;
        this.f52815E = new b();
        this.f52817c = aVar.f52844a;
        this.f52818d = aVar.f52845b;
        this.f52819e = aVar.f52846c;
        List<C17781ar> list = aVar.f52847d;
        this.f52820f = list;
        this.f52821g = C17806bp.m76332a(aVar.f52848e);
        this.f52822h = C17806bp.m76332a(aVar.f52849f);
        this.f52823i = aVar.f52850g;
        this.f52824j = aVar.f52851h;
        this.f52825k = aVar.f52852i;
        this.f52826l = aVar.f52853j;
        this.f52827m = aVar.f52854k;
        this.f52828n = aVar.f52855l;
        Iterator<C17781ar> it = list.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                z = (z || it.next().m76012a()) ? true : z;
            }
        }
        SSLSocketFactory sSLSocketFactory = aVar.f52856m;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerM76336a = C17806bp.m76336a();
            this.f52829o = m76190a(x509TrustManagerM76336a);
            this.f52830p = AbstractC17863ds.m76765a(x509TrustManagerM76336a);
        } else {
            this.f52829o = sSLSocketFactory;
            this.f52830p = aVar.f52857n;
        }
        if (this.f52829o != null) {
            C17858dn.m76756e().mo76742a(this.f52829o);
        }
        this.f52831q = aVar.f52858o;
        this.f52832r = aVar.f52859p.m75985a(this.f52830p);
        this.f52833s = aVar.f52860q;
        this.f52834t = aVar.f52861r;
        C17780aq c17780aq = aVar.f52862s;
        this.f52835u = c17780aq;
        this.f52836v = aVar.f52863t;
        this.f52837w = aVar.f52864u;
        this.f52838x = aVar.f52865v;
        this.f52839y = aVar.f52866w;
        this.f52840z = aVar.f52867x;
        this.f52811A = aVar.f52868y;
        this.f52812B = aVar.f52869z;
        this.f52813C = aVar.f52841A;
        this.f52814D = aVar.f52842B;
        if (this.f52821g.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f52821g);
        }
        if (this.f52822h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f52822h);
        }
        c17780aq.m76005a(this.f52815E);
        this.f52816F = aVar.f52843C;
    }

    /* JADX INFO: renamed from: b */
    public int m76196b(String str, int i, String str2) {
        return this.f52835u.m76001a(str, i, str2);
    }

    /* JADX INFO: renamed from: a */
    public int m76192a() {
        return this.f52840z;
    }

    /* JADX INFO: renamed from: a */
    public void m76194a(String str, int i, String str2) {
        this.f52817c.mo75946a(str, i, str2);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC17775al m76193a(C17798bh c17798bh) {
        return C17797bg.m76245a(this, c17798bh, false);
    }
}
