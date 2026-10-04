package okhttp3.internal.connection;

import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooOo.C32474OooO0O0;
import okhttp3.CipherSuite;
import okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class ConnectionSpecSelector {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<ConnectionSpec> f124342OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f124343OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f124344OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f124345OooO0Oo;

    public ConnectionSpecSelector(List<ConnectionSpec> connectionSpecs) {
        OooOOO0.OooO0oO(connectionSpecs, "connectionSpecs");
        this.f124342OooO00o = connectionSpecs;
    }

    public final ConnectionSpec OooO00o(SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        int i;
        boolean z;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i2 = this.f124343OooO0O0;
        List<ConnectionSpec> list = this.f124342OooO00o;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                connectionSpec = null;
                break;
            }
            int i3 = i2 + 1;
            connectionSpec = list.get(i2);
            if (connectionSpec.OooO0O0(sSLSocket)) {
                this.f124343OooO0O0 = i3;
                break;
            }
            i2 = i3;
        }
        if (connectionSpec == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f124345OooO0Oo);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            OooOOO0.OooO0Oo(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            OooOOO0.OooO0o(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i4 = this.f124343OooO0O0;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i4 >= size2) {
                z = false;
                break;
            }
            int i5 = i4 + 1;
            if (list.get(i4).OooO0O0(sSLSocket)) {
                z = true;
                break;
            }
            i4 = i5;
        }
        this.f124344OooO0OO = z;
        boolean z2 = this.f124345OooO0Oo;
        String[] strArr = connectionSpec.f124080OooO0OO;
        if (strArr != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            OooOOO0.OooO0o(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            CipherSuite.f124057OooO0O0.getClass();
            cipherSuitesIntersection = Util.OooOOOo(CipherSuite.f124058OooO0OO, enabledCipherSuites, strArr);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = connectionSpec.f124081OooO0Oo;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            OooOOO0.OooO0o(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Util.OooOOOo(C32474OooO0O0.f116717OooOo0o, enabledProtocols2, strArr2);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        OooOOO0.OooO0o(supportedCipherSuites, "supportedCipherSuites");
        CipherSuite.f124057OooO0O0.getClass();
        CipherSuite$Companion$ORDER_BY_NAME$1 comparator = CipherSuite.f124058OooO0OO;
        byte[] bArr = Util.f124301OooO00o;
        OooOOO0.OooO0oO(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            OooOOO0.OooO0o(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            OooOOO0.OooO0o(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        ConnectionSpec.Builder builder = new ConnectionSpec.Builder();
        builder.f124082OooO00o = connectionSpec.f124078OooO00o;
        builder.f124083OooO0O0 = strArr;
        builder.f124084OooO0OO = strArr2;
        builder.f124085OooO0Oo = connectionSpec.f124079OooO0O0;
        OooOOO0.OooO0o(cipherSuitesIntersection, "cipherSuitesIntersection");
        builder.OooO0O0((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        OooOOO0.OooO0o(tlsVersionsIntersection, "tlsVersionsIntersection");
        builder.OooO0Oo((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        ConnectionSpec connectionSpecOooO00o = builder.OooO00o();
        if (connectionSpecOooO00o.OooO0OO() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecOooO00o.f124081OooO0Oo);
        }
        if (connectionSpecOooO00o.OooO00o() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecOooO00o.f124080OooO0OO);
        }
        return connectionSpec;
    }
}
