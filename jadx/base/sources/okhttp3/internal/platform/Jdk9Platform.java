package okhttp3.internal.platform;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33596OooOOo0;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/platform/Jdk9Platform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public class Jdk9Platform extends Platform {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Companion f124678OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f124679OooO0o0;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/Jdk9Platform$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        boolean z = false;
        z = false;
        f124678OooO0Oo = new Companion(z ? 1 : 0);
        String property = System.getProperty("java.specification.version");
        Integer numOooOOO0 = property == null ? null : C33596OooOOo0.OooOOO0(property);
        if (numOooOOO0 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numOooOOO0.intValue() >= 9) {
            z = true;
        }
        f124679OooO0o0 = z;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        OooOOO0.OooO0oO(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Platform.f124683OooO00o.getClass();
        Object[] array = Platform.Companion.OooO00o(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    public final String OooO0o(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
