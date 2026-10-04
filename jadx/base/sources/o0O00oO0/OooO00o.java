package o0O00oO0;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
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
import o0oO0O0o.C30782OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o extends SSLSocketFactory {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile OooO00o f88195OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SSLContext f88196OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f88197OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String[] f88198OooO0OO;

    public OooO00o(Context context) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException {
        this.f88196OooO00o = null;
        if (context == null) {
            o00OOOo.OooO0OO.OooO0OO("OooO00o", "SecureSSLSocketFactory: context is null");
            return;
        }
        this.f88197OooO0O0 = context.getApplicationContext();
        this.f88196OooO00o = OooO0OO.OooO0O0();
        o00oO0O.OooO00o(context);
        if (OooO0O0.f88199OooO00o == null) {
            synchronized (OooO0O0.class) {
                try {
                    if (OooO0O0.f88199OooO00o == null) {
                        InputStream inputStreamOooOO0 = C30782OooO00o.OooOO0(context);
                        if (inputStreamOooOO0 == null) {
                            o00OOOo.OooO0OO.OooO0Oo("SSFSecureX509SingleInstance", "get assets bks");
                            inputStreamOooOO0 = context.getAssets().open("hmsrootcas.bks");
                        } else {
                            o00OOOo.OooO0OO.OooO0Oo("SSFSecureX509SingleInstance", "get files bks");
                        }
                        C25849OooO0oO c25849OooO0oO = new C25849OooO0oO();
                        c25849OooO0oO.f88213OooO00o = new ArrayList();
                        c25849OooO0oO.OooO00o();
                        c25849OooO0oO.OooO0OO(inputStreamOooOO0);
                        OooO0O0.f88199OooO00o = c25849OooO0oO;
                    }
                } finally {
                }
            }
        }
        this.f88196OooO00o.init(null, new X509TrustManager[]{OooO0O0.f88199OooO00o}, null);
    }

    @Deprecated
    public static OooO00o OooO00o(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        o00oO0O.OooO00o(context);
        if (f88195OooO0Oo == null) {
            synchronized (OooO00o.class) {
                try {
                    if (f88195OooO0Oo == null) {
                        f88195OooO0Oo = new OooO00o(context);
                    }
                } finally {
                }
            }
        }
        if (f88195OooO0Oo.f88197OooO0O0 == null && context != null) {
            OooO00o oooO00o = f88195OooO0Oo;
            oooO00o.getClass();
            oooO00o.f88197OooO0O0 = context.getApplicationContext();
        }
        return f88195OooO0Oo;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        o00OOOo.OooO0OO.OooO0Oo("OooO00o", "createSocket: host , port");
        Socket socketCreateSocket = this.f88196OooO00o.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            o00OOOo.OooO0OO.OooO0Oo("OooO00o", "set default protocols");
            OooO0OO.OooO00o(sSLSocket);
            o00OOOo.OooO0OO.OooO0Oo("OooO00o", "set default cipher suites");
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
            this.f88198OooO0OO = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.f88198OooO0OO;
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
        o00OOOo.OooO0OO.OooO0Oo("OooO00o", "createSocket: s , host , port , autoClose");
        Socket socketCreateSocket = this.f88196OooO00o.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            o00OOOo.OooO0OO.OooO0Oo("OooO00o", "set default protocols");
            OooO0OO.OooO00o(sSLSocket);
            o00OOOo.OooO0OO.OooO0Oo("OooO00o", "set default cipher suites");
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
            this.f88198OooO0OO = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}
