package com.huawei.hms.drive;

import com.huawei.hms.drive.C17792bb;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.huawei.hms.drive.ah */
/* JADX INFO: loaded from: classes6.dex */
public final class C17771ah {

    /* JADX INFO: renamed from: a */
    final C17792bb f52548a;

    /* JADX INFO: renamed from: b */
    final InterfaceC17785av f52549b;

    /* JADX INFO: renamed from: c */
    final SocketFactory f52550c;

    /* JADX INFO: renamed from: d */
    final InterfaceC17772ai f52551d;

    /* JADX INFO: renamed from: e */
    final List<EnumC17796bf> f52552e;

    /* JADX INFO: renamed from: f */
    final List<C17781ar> f52553f;

    /* JADX INFO: renamed from: g */
    final ProxySelector f52554g;

    /* JADX INFO: renamed from: h */
    final Proxy f52555h;

    /* JADX INFO: renamed from: i */
    final SSLSocketFactory f52556i;

    /* JADX INFO: renamed from: j */
    final HostnameVerifier f52557j;

    /* JADX INFO: renamed from: k */
    final C17777an f52558k;

    /* JADX INFO: renamed from: l */
    private String f52559l;

    public C17771ah(String str, int i, InterfaceC17785av interfaceC17785av, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C17777an c17777an, InterfaceC17772ai interfaceC17772ai, Proxy proxy, List<EnumC17796bf> list, List<C17781ar> list2, ProxySelector proxySelector) {
        this.f52548a = new C17792bb.a().m76173a(sSLSocketFactory != null ? AuthenticationConstants.HTTPS_PROTOCOL_STRING : "http").m76178d(str).m76171a(i).m76177c();
        if (interfaceC17785av == null) {
            throw new NullPointerException("dns == null");
        }
        this.f52549b = interfaceC17785av;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f52550c = socketFactory;
        if (interfaceC17772ai == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f52551d = interfaceC17772ai;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f52552e = C17806bp.m76332a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f52553f = C17806bp.m76332a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f52554g = proxySelector;
        this.f52555h = proxy;
        this.f52556i = sSLSocketFactory;
        this.f52557j = hostnameVerifier;
        this.f52558k = c17777an;
        this.f52559l = null;
    }

    /* JADX INFO: renamed from: a */
    public String m75949a() {
        return this.f52559l;
    }

    /* JADX INFO: renamed from: b */
    public C17792bb m75952b() {
        return this.f52548a;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC17785av m75953c() {
        return this.f52549b;
    }

    /* JADX INFO: renamed from: d */
    public SocketFactory m75954d() {
        return this.f52550c;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC17772ai m75955e() {
        return this.f52551d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17771ah)) {
            return false;
        }
        C17771ah c17771ah = (C17771ah) obj;
        return this.f52548a.equals(c17771ah.f52548a) && m75951a(c17771ah);
    }

    /* JADX INFO: renamed from: f */
    public List<EnumC17796bf> m75956f() {
        return this.f52552e;
    }

    /* JADX INFO: renamed from: g */
    public List<C17781ar> m75957g() {
        return this.f52553f;
    }

    /* JADX INFO: renamed from: h */
    public ProxySelector m75958h() {
        return this.f52554g;
    }

    public int hashCode() {
        int iHashCode = (this.f52554g.hashCode() + ((this.f52553f.hashCode() + ((this.f52552e.hashCode() + ((this.f52551d.hashCode() + ((this.f52549b.hashCode() + ((this.f52548a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f52555h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f52556i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f52557j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C17777an c17777an = this.f52558k;
        return iHashCode4 + (c17777an != null ? c17777an.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public Proxy m75959i() {
        return this.f52555h;
    }

    /* JADX INFO: renamed from: j */
    public SSLSocketFactory m75960j() {
        return this.f52556i;
    }

    /* JADX INFO: renamed from: k */
    public HostnameVerifier m75961k() {
        return this.f52557j;
    }

    /* JADX INFO: renamed from: l */
    public C17777an m75962l() {
        return this.f52558k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f52548a.m76151f());
        sb.append(C18241k5.f55433h);
        sb.append(this.f52548a.m76152g());
        if (this.f52555h != null) {
            sb.append(", proxy=");
            sb.append(this.f52555h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f52554g);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m75950a(String str) {
        this.f52559l = str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m75951a(C17771ah c17771ah) {
        return this.f52549b.equals(c17771ah.f52549b) && this.f52551d.equals(c17771ah.f52551d) && this.f52552e.equals(c17771ah.f52552e) && this.f52553f.equals(c17771ah.f52553f) && this.f52554g.equals(c17771ah.f52554g) && C17806bp.m76342a(this.f52555h, c17771ah.f52555h) && C17806bp.m76342a(this.f52556i, c17771ah.f52556i) && C17806bp.m76342a(this.f52557j, c17771ah.f52557j) && C17806bp.m76342a(this.f52558k, c17771ah.f52558k) && m75952b().m76152g() == c17771ah.m75952b().m76152g();
    }
}
