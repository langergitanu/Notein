package okhttp3;

import Oooo0oO.C21111o0ooOoO;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/Address;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Address {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final HttpUrl f124018OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Dns f124019OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SocketFactory f124020OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SSLSocketFactory f124021OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HostnameVerifier f124022OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Authenticator f124023OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CertificatePinner f124024OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Proxy f124025OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ProxySelector f124026OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<Protocol> f124027OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final List<ConnectionSpec> f124028OooOO0O;

    public Address(String uriHost, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, Proxy proxy, List<? extends Protocol> protocols, List<ConnectionSpec> connectionSpecs, ProxySelector proxySelector) {
        OooOOO0.OooO0oO(uriHost, "uriHost");
        OooOOO0.OooO0oO(dns, "dns");
        OooOOO0.OooO0oO(socketFactory, "socketFactory");
        OooOOO0.OooO0oO(proxyAuthenticator, "proxyAuthenticator");
        OooOOO0.OooO0oO(protocols, "protocols");
        OooOOO0.OooO0oO(connectionSpecs, "connectionSpecs");
        OooOOO0.OooO0oO(proxySelector, "proxySelector");
        this.f124019OooO00o = dns;
        this.f124020OooO0O0 = socketFactory;
        this.f124021OooO0OO = sSLSocketFactory;
        this.f124022OooO0Oo = hostnameVerifier;
        this.f124024OooO0o0 = certificatePinner;
        this.f124023OooO0o = proxyAuthenticator;
        this.f124025OooO0oO = proxy;
        this.f124026OooO0oo = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.OooO0o(sSLSocketFactory != null ? AuthenticationConstants.HTTPS_PROTOCOL_STRING : "http");
        builder.OooO0Oo(uriHost);
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(OooOOO0.OooOOO0(Integer.valueOf(i), "unexpected port: ").toString());
        }
        builder.f124144OooO0o0 = i;
        this.f124018OooO = builder.OooO0OO();
        this.f124027OooOO0 = Util.OooOoO0(protocols);
        this.f124028OooOO0O = Util.OooOoO0(connectionSpecs);
    }

    public final boolean OooO00o(Address that) {
        OooOOO0.OooO0oO(that, "that");
        return OooOOO0.OooO0O0(this.f124019OooO00o, that.f124019OooO00o) && OooOOO0.OooO0O0(this.f124023OooO0o, that.f124023OooO0o) && OooOOO0.OooO0O0(this.f124027OooOO0, that.f124027OooOO0) && OooOOO0.OooO0O0(this.f124028OooOO0O, that.f124028OooOO0O) && OooOOO0.OooO0O0(this.f124026OooO0oo, that.f124026OooO0oo) && OooOOO0.OooO0O0(this.f124025OooO0oO, that.f124025OooO0oO) && OooOOO0.OooO0O0(this.f124021OooO0OO, that.f124021OooO0OO) && OooOOO0.OooO0O0(this.f124022OooO0Oo, that.f124022OooO0Oo) && OooOOO0.OooO0O0(this.f124024OooO0o0, that.f124024OooO0o0) && this.f124018OooO.f124134OooO0o0 == that.f124018OooO.f124134OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return OooOOO0.OooO0O0(this.f124018OooO, address.f124018OooO) && OooO00o(address);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f124024OooO0o0) + ((Objects.hashCode(this.f124022OooO0Oo) + ((Objects.hashCode(this.f124021OooO0OO) + ((Objects.hashCode(this.f124025OooO0oO) + ((this.f124026OooO0oo.hashCode() + C21445Oooo.OooO00o(this.f124028OooOO0O, C21445Oooo.OooO00o(this.f124027OooOO0, (this.f124023OooO0o.hashCode() + ((this.f124019OooO00o.hashCode() + OooO00o.OooO0O0(527, 31, this.f124018OooO.f124128OooO)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.f124018OooO;
        sb.append(httpUrl.f124132OooO0Oo);
        sb.append(':');
        sb.append(httpUrl.f124134OooO0o0);
        sb.append(", ");
        Proxy proxy = this.f124025OooO0oO;
        return C21111o0ooOoO.OooO0OO(proxy != null ? OooOOO0.OooOOO0(proxy, "proxy=") : OooOOO0.OooOOO0(this.f124026OooO0oo, "proxySelector="), '}', sb);
    }
}
