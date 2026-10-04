package okhttp3.internal.platform;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34428OooOOo;
import oOo00OoO.C34524OooO0Oo;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidLogHandler;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/platform/Platform;", "", "<init>", "()V", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public class Platform {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Companion f124683OooO00o = new Companion(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile Platform f124684OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Logger f124685OooO0OO;

    @Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m80612d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "<init>", "()V", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/Platform;", "platform", "Lokhttp3/internal/platform/Platform;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static ArrayList OooO00o(List protocols) {
            OooOOO0.OooO0oO(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).f124237OooOo0o);
            }
            return arrayList2;
        }

        public static byte[] OooO0O0(List protocols) {
            OooOOO0.OooO0oO(protocols, "protocols");
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            for (String str : OooO00o(protocols)) {
                c34524OooO0Oo.o0OoO0o(str.length());
                c34524OooO0Oo.o000Oo0o(str);
            }
            return c34524OooO0Oo.o0000oo(c34524OooO0Oo.f123723OooOo);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[PHI: r1
      0x00b8: PHI (r1v34 okhttp3.internal.platform.Platform) = 
      (r1v19 okhttp3.internal.platform.Platform)
      (r1v27 okhttp3.internal.platform.Platform)
      (r1v32 okhttp3.internal.platform.Platform)
      (r1v38 okhttp3.internal.platform.Platform)
     binds: [B:55:0x0115, B:49:0x0102, B:41:0x00dd, B:33:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    static {
        Platform platform;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            AndroidLog.f124690OooO00o.getClass();
            for (Map.Entry<String, String> entry : AndroidLog.f124692OooO0OO.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Logger logger = Logger.getLogger(key);
                if (AndroidLog.f124691OooO0O0.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(AndroidLogHandler.f124693OooO00o);
                }
            }
            Android10Platform.f124654OooO0o0.getClass();
            platform = Android10Platform.f124653OooO0o ? new Android10Platform() : null;
            if (platform == null) {
                AndroidPlatform.f124656OooO0o.getClass();
                jdk8WithJettyBootPlatform = AndroidPlatform.f124657OooO0oO ? new AndroidPlatform() : null;
                OooOOO0.OooO0Oo(jdk8WithJettyBootPlatform);
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            ConscryptPlatform.f124666OooO0o0.getClass();
            Platform jdk9Platform = ConscryptPlatform.f124665OooO0o ? new ConscryptPlatform(0) : null;
            if (jdk9Platform != null) {
                platform = jdk9Platform;
            } else if ("BC".equals(Security.getProviders()[0].getName())) {
                BouncyCastlePlatform.f124663OooO0o0.getClass();
                jdk9Platform = BouncyCastlePlatform.f124662OooO0o ? new BouncyCastlePlatform(0) : null;
                if (jdk9Platform == null) {
                    if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                        OpenJSSEPlatform.f124681OooO0o0.getClass();
                        jdk9Platform = OpenJSSEPlatform.f124680OooO0o ? new OpenJSSEPlatform(0) : null;
                        if (jdk9Platform == null) {
                            Jdk9Platform.f124678OooO0Oo.getClass();
                            jdk9Platform = Jdk9Platform.f124679OooO0o0 ? new Jdk9Platform() : null;
                            if (jdk9Platform == null) {
                                Jdk8WithJettyBootPlatform.f124669OooO.getClass();
                                String jvmVersion = System.getProperty("java.specification.version", "unknown");
                                try {
                                    OooOOO0.OooO0o(jvmVersion, "jvmVersion");
                                } catch (NumberFormatException unused) {
                                }
                                if (Integer.parseInt(jvmVersion) < 9) {
                                    try {
                                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls2 = Class.forName(OooOOO0.OooOOO0("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                        Class<?> clientProviderClass = Class.forName(OooOOO0.OooOOO0("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                        Class<?> serverProviderClass = Class.forName(OooOOO0.OooOOO0("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                        Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                        Method getMethod = cls.getMethod("get", SSLSocket.class);
                                        Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                                        OooOOO0.OooO0o(putMethod, "putMethod");
                                        OooOOO0.OooO0o(getMethod, "getMethod");
                                        OooOOO0.OooO0o(removeMethod, "removeMethod");
                                        OooOOO0.OooO0o(clientProviderClass, "clientProviderClass");
                                        OooOOO0.OooO0o(serverProviderClass, "serverProviderClass");
                                        jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                                    }
                                }
                                platform = jdk8WithJettyBootPlatform != null ? jdk8WithJettyBootPlatform : new Platform();
                            }
                        }
                    }
                }
            }
        }
        f124684OooO0O0 = platform;
        f124685OooO0OO = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static void OooO(String message, int i, Throwable th) {
        OooOOO0.OooO0oO(message, "message");
        f124685OooO0OO.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void OooO00o(SSLSocket sSLSocket) {
    }

    public CertificateChainCleaner OooO0O0(X509TrustManager trustManager) {
        OooOOO0.OooO0oO(trustManager, "trustManager");
        return new BasicCertificateChainCleaner(OooO0OO(trustManager));
    }

    public TrustRootIndex OooO0OO(X509TrustManager trustManager) {
        OooOOO0.OooO0oO(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        OooOOO0.OooO0o(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void OooO0Oo(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        OooOOO0.OooO0oO(protocols, "protocols");
    }

    public String OooO0o(SSLSocket sSLSocket) {
        return null;
    }

    public void OooO0o0(Socket socket, InetSocketAddress address, int i) throws IOException {
        OooOOO0.OooO0oO(address, "address");
        socket.connect(address, i);
    }

    public Object OooO0oO() {
        if (f124685OooO0OO.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean OooO0oo(String hostname) {
        OooOOO0.OooO0oO(hostname, "hostname");
        return true;
    }

    public void OooOO0(Object obj, String message) {
        OooOOO0.OooO0oO(message, "message");
        if (obj == null) {
            message = OooOOO0.OooOOO0(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", message);
        }
        OooO(message, 5, (Throwable) obj);
    }

    public SSLContext OooOO0O() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        OooOOO0.OooO0o(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory OooOO0o(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextOooOO0O = OooOO0O();
            sSLContextOooOO0O.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextOooOO0O.getSocketFactory();
            OooOOO0.OooO0o(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(OooOOO0.OooOOO0(e, "No System TLS: "), e);
        }
    }

    public X509TrustManager OooOOO0() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        OooOOO0.OooO0Oo(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String string = Arrays.toString(trustManagers);
        OooOOO0.OooO0o(string, "toString(this)");
        throw new IllegalStateException(OooOOO0.OooOOO0(string, "Unexpected default trust managers: ").toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
