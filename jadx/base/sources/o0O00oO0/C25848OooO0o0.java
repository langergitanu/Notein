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

/* JADX INFO: renamed from: o0O00oO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25848OooO0o0 extends SSLSocketFactory {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile C25848OooO0o0 f88209OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SSLContext f88210OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f88211OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String[] f88212OooO0OO;

    @Deprecated
    public C25848OooO0o0(C25849OooO0oO c25849OooO0oO) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f88210OooO00o = null;
        SSLContext sSLContextOooO0O0 = OooO0OO.OooO0O0();
        this.f88210OooO00o = sSLContextOooO0O0;
        sSLContextOooO0O0.init(null, new X509TrustManager[]{c25849OooO0oO}, null);
    }

    @Deprecated
    public static C25848OooO0o0 OooO00o(Context context) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        System.currentTimeMillis();
        o00oO0O.OooO00o(context);
        if (f88209OooO0Oo == null) {
            synchronized (C25848OooO0o0.class) {
                try {
                    if (f88209OooO0Oo == null) {
                        C25848OooO0o0 c25848OooO0o0 = new C25848OooO0o0();
                        c25848OooO0o0.f88210OooO00o = null;
                        if (context == null) {
                            o00OOOo.OooO0OO.OooO0OO("OooO0o0", "SecureSSLSocketFactory: context is null");
                        } else {
                            c25848OooO0o0.f88211OooO0O0 = context.getApplicationContext();
                            c25848OooO0o0.f88210OooO00o = OooO0OO.OooO0O0();
                            c25848OooO0o0.f88210OooO00o.init(null, new X509TrustManager[]{OooO0o.OooO00o(context)}, null);
                        }
                        f88209OooO0Oo = c25848OooO0o0;
                    }
                } finally {
                }
            }
        }
        if (f88209OooO0Oo.f88211OooO0O0 == null && context != null) {
            C25848OooO0o0 c25848OooO0o02 = f88209OooO0Oo;
            c25848OooO0o02.getClass();
            c25848OooO0o02.f88211OooO0O0 = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return f88209OooO0Oo;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        o00OOOo.OooO0OO.OooO0Oo("OooO0o0", "createSocket: host , port");
        Socket socketCreateSocket = this.f88210OooO00o.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            o00OOOo.OooO0OO.OooO0Oo("OooO0o0", "set default protocols");
            OooO0OO.OooO00o(sSLSocket);
            o00OOOo.OooO0OO.OooO0Oo("OooO0o0", "set default cipher suites");
            if (sSLSocket != null) {
                String[] strArr = OooO0OO.f88200OooO00o;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List listAsList = Arrays.asList(strArr);
                for (String str2 : enabledCipherSuites) {
                    if (listAsList.contains(str2.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.isEmpty()) {
                    String[] strArr2 = OooO0OO.f88201OooO0O0;
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : enabledCipherSuites2) {
                        String upperCase = str3.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 16) {
                                arrayList2.add(str3);
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
            this.f88212OooO0OO = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.f88212OooO0OO;
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
        o00OOOo.OooO0OO.OooO0Oo("OooO0o0", "createSocket s host port autoClose");
        Socket socketCreateSocket = this.f88210OooO00o.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            o00OOOo.OooO0OO.OooO0Oo("OooO0o0", "set default protocols");
            OooO0OO.OooO00o(sSLSocket);
            o00OOOo.OooO0OO.OooO0Oo("OooO0o0", "set default cipher suites");
            if (sSLSocket != null) {
                String[] strArr = OooO0OO.f88200OooO00o;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List listAsList = Arrays.asList(strArr);
                for (String str2 : enabledCipherSuites) {
                    if (listAsList.contains(str2.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                } else {
                    String[] strArr2 = OooO0OO.f88201OooO0O0;
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : enabledCipherSuites2) {
                        String upperCase = str3.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 < 16) {
                                if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                    break;
                                }
                                i2++;
                            } else {
                                arrayList2.add(str3);
                                break;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                }
            }
            this.f88212OooO0OO = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}
