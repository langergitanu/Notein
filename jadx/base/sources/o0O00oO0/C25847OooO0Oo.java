package o0O00oO0;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o0O0oooO.o00oO0O;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

/* JADX INFO: renamed from: o0O00oO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public final class C25847OooO0Oo extends SSLSocketFactory {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Deprecated
    public static final StrictHostnameVerifier f88202OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static volatile C25847OooO0Oo f88203OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f88204OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SSLContext f88205OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f88206OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String[] f88207OooO0OO;

    static {
        new BrowserCompatHostnameVerifier();
        f88202OooO0Oo = new StrictHostnameVerifier();
        f88204OooO0o0 = C25847OooO0Oo.class.getSimpleName();
        f88203OooO0o = null;
    }

    @Deprecated
    public static C25847OooO0Oo OooO00o(Context context) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        System.currentTimeMillis();
        o00oO0O.OooO00o(context);
        if (f88203OooO0o == null) {
            synchronized (C25847OooO0Oo.class) {
                try {
                    if (f88203OooO0o == null) {
                        C25847OooO0Oo c25847OooO0Oo = new C25847OooO0Oo();
                        c25847OooO0Oo.f88205OooO00o = null;
                        if (context == null) {
                            o00OOOo.OooO0OO.OooO0OO(f88204OooO0o0, "SecureSSLSocketFactory: context is null");
                        } else {
                            c25847OooO0Oo.f88206OooO0O0 = context.getApplicationContext();
                            c25847OooO0Oo.f88205OooO00o = OooO0OO.OooO0O0();
                            c25847OooO0Oo.f88205OooO00o.init(null, new X509TrustManager[]{OooO0o.OooO00o(context)}, null);
                        }
                        f88203OooO0o = c25847OooO0Oo;
                    }
                } finally {
                }
            }
        }
        if (f88203OooO0o.f88206OooO0O0 == null && context != null) {
            C25847OooO0Oo c25847OooO0Oo2 = f88203OooO0o;
            c25847OooO0Oo2.getClass();
            c25847OooO0Oo2.f88206OooO0O0 = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return f88203OooO0o;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        String str2 = f88204OooO0o0;
        o00OOOo.OooO0OO.OooO0Oo(str2, "createSocket: host , port");
        Socket socketCreateSocket = this.f88205OooO00o.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            o00OOOo.OooO0OO.OooO0Oo(str2, "set default protocols");
            OooO0OO.OooO00o(sSLSocket);
            o00OOOo.OooO0OO.OooO0Oo(str2, "set default cipher suites");
            if (sSLSocket != null) {
                String[] strArr = OooO0OO.f88200OooO00o;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List listAsList = Arrays.asList(strArr);
                for (String str3 : enabledCipherSuites) {
                    if (listAsList.contains(str3.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str3);
                    }
                }
                if (arrayList.isEmpty()) {
                    String[] strArr2 = OooO0OO.f88201OooO0O0;
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str4 : enabledCipherSuites2) {
                        String upperCase = str4.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 16) {
                                arrayList2.add(str4);
                                break;
                            }
                            if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                break;
                            }
                            i2++;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                } else {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                }
            }
            this.f88207OooO0OO = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.f88207OooO0OO;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        String str2 = f88204OooO0o0;
        o00OOOo.OooO0OO.OooO0Oo(str2, "createSocket s host port autoClose");
        Socket socketCreateSocket = this.f88205OooO00o.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            o00OOOo.OooO0OO.OooO0Oo(str2, "set default protocols");
            OooO0OO.OooO00o(sSLSocket);
            o00OOOo.OooO0OO.OooO0Oo(str2, "set default cipher suites");
            if (sSLSocket != null) {
                String[] strArr = OooO0OO.f88200OooO00o;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List listAsList = Arrays.asList(strArr);
                for (String str3 : enabledCipherSuites) {
                    if (listAsList.contains(str3.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                } else {
                    String[] strArr2 = OooO0OO.f88201OooO0O0;
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str4 : enabledCipherSuites2) {
                        String upperCase = str4.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 < 16) {
                                if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                    break;
                                }
                                i2++;
                            } else {
                                arrayList2.add(str4);
                                break;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                }
            }
            this.f88207OooO0OO = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}
