package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18416x7;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.a7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18103a7 {

    /* JADX INFO: renamed from: a */
    public final C18416x7 f54169a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC18325q7 f54170b;

    /* JADX INFO: renamed from: c */
    public final SocketFactory f54171c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC18117b7 f54172d;

    /* JADX INFO: renamed from: e */
    public final List<EnumC18132c8> f54173e;

    /* JADX INFO: renamed from: f */
    public final List<C18257l7> f54174f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f54175g;

    /* JADX INFO: renamed from: h */
    public final Proxy f54176h;

    /* JADX INFO: renamed from: i */
    public final SSLSocketFactory f54177i;

    /* JADX INFO: renamed from: j */
    public final HostnameVerifier f54178j;

    /* JADX INFO: renamed from: k */
    public final C18187g7 f54179k;

    /* JADX INFO: renamed from: l */
    public String f54180l;

    public C18103a7(String str, int i, InterfaceC18325q7 interfaceC18325q7, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C18187g7 c18187g7, InterfaceC18117b7 interfaceC18117b7, Proxy proxy, List<EnumC18132c8> list, List<C18257l7> list2, ProxySelector proxySelector) {
        this.f54169a = new C18416x7.a().m79984p(sSLSocketFactory != null ? AuthenticationConstants.HTTPS_PROTOCOL_STRING : "http").m79979k(str).m79957a(i).m79962a();
        if (interfaceC18325q7 == null) {
            throw new NullPointerException("dns == null");
        }
        this.f54170b = interfaceC18325q7;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f54171c = socketFactory;
        if (interfaceC18117b7 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f54172d = interfaceC18117b7;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f54173e = C18313p8.m79372a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f54174f = C18313p8.m79372a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f54175g = proxySelector;
        this.f54176h = proxy;
        this.f54177i = sSLSocketFactory;
        this.f54178j = hostnameVerifier;
        this.f54179k = c18187g7;
        this.f54180l = null;
    }

    /* JADX INFO: renamed from: a */
    public C18187g7 m77849a() {
        return this.f54179k;
    }

    /* JADX INFO: renamed from: b */
    public List<C18257l7> m77852b() {
        return this.f54174f;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC18325q7 m77853c() {
        return this.f54170b;
    }

    /* JADX INFO: renamed from: d */
    public String m77854d() {
        return this.f54180l;
    }

    /* JADX INFO: renamed from: e */
    public HostnameVerifier m77855e() {
        return this.f54178j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18103a7)) {
            return false;
        }
        C18103a7 c18103a7 = (C18103a7) obj;
        return this.f54169a.equals(c18103a7.f54169a) && m77851a(c18103a7);
    }

    /* JADX INFO: renamed from: f */
    public List<EnumC18132c8> m77856f() {
        return this.f54173e;
    }

    /* JADX INFO: renamed from: g */
    public Proxy m77857g() {
        return this.f54176h;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC18117b7 m77858h() {
        return this.f54172d;
    }

    public int hashCode() {
        return Objects.hashCode(this.f54179k) + ((Objects.hashCode(this.f54178j) + ((Objects.hashCode(this.f54177i) + ((Objects.hashCode(this.f54176h) + ((this.f54175g.hashCode() + ((this.f54174f.hashCode() + ((this.f54173e.hashCode() + ((this.f54172d.hashCode() + ((this.f54170b.hashCode() + ((this.f54169a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public ProxySelector m77859i() {
        return this.f54175g;
    }

    /* JADX INFO: renamed from: j */
    public SocketFactory m77860j() {
        return this.f54171c;
    }

    /* JADX INFO: renamed from: k */
    public SSLSocketFactory m77861k() {
        return this.f54177i;
    }

    /* JADX INFO: renamed from: l */
    public C18416x7 m77862l() {
        return this.f54169a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f54169a.m79929h());
        sb.append(C18241k5.f55433h);
        sb.append(this.f54169a.m79935n());
        if (this.f54176h != null) {
            sb.append(", proxy=");
            obj = this.f54176h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f54175g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m77850a(String str) {
        this.f54180l = str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m77851a(C18103a7 c18103a7) {
        return this.f54170b.equals(c18103a7.f54170b) && this.f54172d.equals(c18103a7.f54172d) && this.f54173e.equals(c18103a7.f54173e) && this.f54174f.equals(c18103a7.f54174f) && this.f54175g.equals(c18103a7.f54175g) && Objects.equals(this.f54176h, c18103a7.f54176h) && Objects.equals(this.f54177i, c18103a7.f54177i) && Objects.equals(this.f54178j, c18103a7.f54178j) && Objects.equals(this.f54179k, c18103a7.f54179k) && m77862l().m79935n() == c18103a7.m77862l().m79935n();
    }
}
