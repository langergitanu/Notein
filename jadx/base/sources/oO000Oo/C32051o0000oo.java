package oO000Oo;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO0OOo0o.AbstractC33109OooooO0;
import oO0OOo0o.C33078OooOoo0;
import oO0OOo0o.InterfaceC33110OooooOO;

/* JADX INFO: renamed from: oO000Oo.o0000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32051o0000oo implements InterfaceC33110OooooOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Supplier<ProxySelector> f114571OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f114572OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InetSocketAddress f114573OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Logger f114568OooO0Oo = Logger.getLogger(C32051o0000oo.class.getName());

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f114570OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO0O0 f114569OooO0o = new OooO0O0();

    /* JADX INFO: renamed from: oO000Oo.o0000oo$OooO00o */
    public class OooO00o implements OooO0OO {
        @Override // oO000Oo.C32051o0000oo.OooO0OO
        public final PasswordAuthentication OooO00o(String str, InetAddress inetAddress, int i) {
            URL url;
            try {
                url = new URL(AuthenticationConstants.HTTPS_PROTOCOL_STRING, str, i, "");
            } catch (MalformedURLException unused) {
                C32051o0000oo.f114568OooO0Oo.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{AuthenticationConstants.HTTPS_PROTOCOL_STRING, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i, AuthenticationConstants.HTTPS_PROTOCOL_STRING, "", null, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000oo$OooO0O0 */
    public class OooO0O0 implements Supplier<ProxySelector> {
        @Override // com.google.common.base.Supplier
        public final ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000oo$OooO0OO */
    public interface OooO0OO {
        PasswordAuthentication OooO00o(String str, InetAddress inetAddress, int i);
    }

    public C32051o0000oo() {
        String str = System.getenv("GRPC_PROXY_EXP");
        this.f114571OooO00o = (Supplier) Preconditions.checkNotNull(f114569OooO0o);
        this.f114572OooO0O0 = (OooO0OO) Preconditions.checkNotNull(f114570OooO0o0);
        if (str == null) {
            this.f114573OooO0OO = null;
            return;
        }
        String[] strArrSplit = str.split(C18241k5.f55433h, 2);
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f114568OooO0Oo.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f114573OooO0OO = new InetSocketAddress(strArrSplit[0], i);
    }

    @Override // oO0OOo0o.InterfaceC33110OooooOO
    public final AbstractC33109OooooO0 OooO00o(InetSocketAddress inetSocketAddress) throws IOException {
        if (inetSocketAddress != null) {
            InetSocketAddress inetSocketAddress2 = this.f114573OooO0OO;
            if (inetSocketAddress2 != null) {
                int i = C33078OooOoo0.f119604OooOoOO;
                return new C33078OooOoo0((SocketAddress) Preconditions.checkNotNull(inetSocketAddress2, "proxyAddress"), (InetSocketAddress) Preconditions.checkNotNull(inetSocketAddress, "targetAddress"), null, null);
            }
            Logger logger = f114568OooO0Oo;
            try {
                try {
                    URI uri = new URI(AuthenticationConstants.HTTPS_PROTOCOL_STRING, null, C31989OoooO0O.OooO0Oo(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    ProxySelector proxySelector = this.f114571OooO00o.get();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> listSelect = proxySelector.select(uri);
                    if (listSelect.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = listSelect.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        PasswordAuthentication passwordAuthenticationOooO00o = this.f114572OooO0O0.OooO00o(C31989OoooO0O.OooO0Oo(inetSocketAddress3), inetSocketAddress3.getAddress(), inetSocketAddress3.getPort());
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i2 = C33078OooOoo0.f119604OooOoOO;
                        InetSocketAddress inetSocketAddress4 = (InetSocketAddress) Preconditions.checkNotNull(inetSocketAddress, "targetAddress");
                        SocketAddress socketAddress = (SocketAddress) Preconditions.checkNotNull(inetSocketAddress3, "proxyAddress");
                        if (passwordAuthenticationOooO00o == null) {
                            return new C33078OooOoo0(socketAddress, inetSocketAddress4, null, null);
                        }
                        return new C33078OooOoo0(socketAddress, inetSocketAddress4, passwordAuthenticationOooO00o.getUserName(), passwordAuthenticationOooO00o.getPassword() != null ? new String(passwordAuthenticationOooO00o.getPassword()) : null);
                    }
                } catch (URISyntaxException e) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                }
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            }
        }
        return null;
    }
}
