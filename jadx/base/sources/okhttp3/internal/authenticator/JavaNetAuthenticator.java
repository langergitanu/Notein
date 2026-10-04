package okhttp3.internal.authenticator;

import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class JavaNetAuthenticator implements Authenticator {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Dns f124309OooO0O0;

    @Metadata(m80613k = 3, m80614mv = {1, 6, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f124310OooO00o;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f124310OooO00o = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(0);
    }

    public static InetAddress OooO00o(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.f124310OooO00o[type.ordinal()]) == 1) {
            return (InetAddress) OooOo.Oooo0oO(dns.lookup(httpUrl.f124132OooO0Oo));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        OooOOO0.OooO0o(address, "address() as InetSocketAddress).address");
        return address;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    @Override // okhttp3.Authenticator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Request authenticate(Route route, Response response) throws IOException {
        String str;
        List<Challenge> list;
        Proxy proxy;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        Charset ISO_8859_1;
        OooOOO0.OooO0oO(response, "response");
        Headers headers = response.f124263OooOoo0;
        int i = response.f124259OooOoO;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                list = C34434OooOoO.f123453OooOo0o;
                Request request = response.f124258OooOo0o;
                HttpUrl httpUrl = request.f124238OooO00o;
                boolean z = response.f124259OooOoO == 407;
                proxy = route != null ? null : route.f124291OooO0O0;
                if (proxy == null) {
                    proxy = Proxy.NO_PROXY;
                }
                for (Challenge challenge : list) {
                    if ("Basic".equalsIgnoreCase(challenge.f124054OooO00o)) {
                        Dns dns = route == null ? null : route.f124290OooO00o.f124019OooO00o;
                        if (dns == null) {
                            dns = this.f124309OooO0O0;
                        }
                        if (z) {
                            SocketAddress socketAddressAddress = proxy.address();
                            if (socketAddressAddress == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                            }
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                            try {
                                passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), OooO00o(proxy, httpUrl, dns), inetSocketAddress.getPort(), httpUrl.f124129OooO00o, challenge.f124055OooO0O0.get("realm"), challenge.f124054OooO00o, new URL(httpUrl.f124128OooO), Authenticator.RequestorType.PROXY);
                            } catch (MalformedURLException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            String str2 = httpUrl.f124132OooO0Oo;
                            OooOOO0.OooO0o(proxy, "proxy");
                            try {
                                passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(str2, OooO00o(proxy, httpUrl, dns), httpUrl.f124134OooO0o0, httpUrl.f124129OooO00o, challenge.f124055OooO0O0.get("realm"), challenge.f124054OooO00o, new URL(httpUrl.f124128OooO), Authenticator.RequestorType.SERVER);
                            } catch (MalformedURLException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                        if (passwordAuthenticationRequestPasswordAuthentication != null) {
                            String str3 = z ? HttpHeaders.PROXY_AUTHORIZATION : "Authorization";
                            String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                            OooOOO0.OooO0o(userName, "auth.userName");
                            char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                            OooOOO0.OooO0o(password, "auth.password");
                            String str4 = new String(password);
                            String str5 = challenge.f124055OooO0O0.get("charset");
                            if (str5 != null) {
                                try {
                                    ISO_8859_1 = Charset.forName(str5);
                                    OooOOO0.OooO0o(ISO_8859_1, "forName(charset)");
                                } catch (Exception unused) {
                                    ISO_8859_1 = StandardCharsets.ISO_8859_1;
                                    OooOOO0.OooO0o(ISO_8859_1, "ISO_8859_1");
                                }
                            } else {
                                ISO_8859_1 = StandardCharsets.ISO_8859_1;
                                OooOOO0.OooO0o(ISO_8859_1, "ISO_8859_1");
                            }
                            int i2 = Credentials.f124102OooO00o;
                            String str6 = userName + ':' + str4;
                            C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
                            OooOOO0.OooO0oO(str6, "<this>");
                            byte[] bytes = str6.getBytes(ISO_8859_1);
                            OooOOO0.OooO0o(bytes, "this as java.lang.String).getBytes(charset)");
                            String strOooOOO0 = OooOOO0.OooOOO0(new C34527OooO0oO(bytes).OooO00o(), "Basic ");
                            Request.Builder builderOooO00o = request.OooO00o();
                            builderOooO00o.OooO0OO(str3, strOooOOO0);
                            return builderOooO00o.OooO0O0();
                        }
                    }
                }
                return null;
            }
            str = HttpHeaders.PROXY_AUTHENTICATE;
        }
        String str7 = str;
        C34527OooO0oO c34527OooO0oO2 = okhttp3.internal.http.HttpHeaders.f124437OooO00o;
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            if (str7.equalsIgnoreCase(headers.OooO0Oo(i3))) {
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                c34524OooO0Oo.o000Oo0o(headers.OooO0oO(i3));
                try {
                    okhttp3.internal.http.HttpHeaders.OooO0O0(c34524OooO0Oo, arrayList);
                } catch (EOFException e3) {
                    Platform.f124683OooO00o.getClass();
                    Platform.f124684OooO0O0.getClass();
                    Platform.OooO("Unable to parse challenge", 5, e3);
                }
            }
            i3 = i4;
        }
        list = arrayList;
        Request request2 = response.f124258OooOo0o;
        HttpUrl httpUrl2 = request2.f124238OooO00o;
        if (response.f124259OooOoO == 407) {
        }
        if (route != null) {
        }
        if (proxy == null) {
        }
        while (r0.hasNext()) {
        }
        return null;
    }

    public JavaNetAuthenticator(int i) {
        Dns defaultDns = Dns.f124108OooO00o;
        OooOOO0.OooO0oO(defaultDns, "defaultDns");
        this.f124309OooO0O0 = defaultDns;
    }
}
