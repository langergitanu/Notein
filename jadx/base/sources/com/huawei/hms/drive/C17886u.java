package com.huawei.hms.drive;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: renamed from: com.huawei.hms.drive.u */
/* JADX INFO: loaded from: classes6.dex */
public class C17886u extends SSLSocketFactory {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final X509HostnameVerifier f53471a = new BrowserCompatHostnameVerifier();

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final X509HostnameVerifier f53472b = new StrictHostnameVerifier();

    /* JADX INFO: renamed from: c */
    private static final String f53473c = "u";

    /* JADX INFO: renamed from: d */
    private static volatile C17886u f53474d = null;

    /* JADX INFO: renamed from: e */
    private SSLContext f53475e = null;

    /* JADX INFO: renamed from: f */
    private SSLSocket f53476f = null;

    /* JADX INFO: renamed from: g */
    private Context f53477g;

    /* JADX INFO: renamed from: h */
    private String[] f53478h;

    /* JADX INFO: renamed from: i */
    private X509TrustManager f53479i;

    /* JADX INFO: renamed from: j */
    private String[] f53480j;

    /* JADX INFO: renamed from: k */
    private String[] f53481k;

    /* JADX INFO: renamed from: l */
    private String[] f53482l;

    private C17886u(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException {
        if (context == null) {
            C17766ac.m75936d(f53473c, "SecureSSLSocketFactory: context is null");
            return;
        }
        m76882b(context);
        m76881a(AbstractC17885t.m76871a());
        C17888w c17888wM76883a = C17887v.m76883a(context);
        this.f53479i = c17888wM76883a;
        this.f53475e.init(null, new X509TrustManager[]{c17888wM76883a}, null);
    }

    /* JADX INFO: renamed from: a */
    public static C17886u m76879a(Context context) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C17891z.m76905a(context);
        if (f53474d == null) {
            synchronized (C17886u.class) {
                try {
                    if (f53474d == null) {
                        f53474d = new C17886u(context);
                    }
                } finally {
                }
            }
        }
        if (f53474d.f53477g == null && context != null) {
            f53474d.m76882b(context);
        }
        C17766ac.m75933a(f53473c, "getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return f53474d;
    }

    /* JADX INFO: renamed from: b */
    public void m76882b(Context context) {
        this.f53477g = context.getApplicationContext();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        C17766ac.m75934b(f53473c, "createSocket: host , port");
        Socket socketCreateSocket = this.f53475e.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            m76880a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f53476f = sSLSocket;
            this.f53478h = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f53478h;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        C17766ac.m75934b(f53473c, "createSocket s host port autoClose");
        Socket socketCreateSocket = this.f53475e.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            m76880a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f53476f = sSLSocket;
            this.f53478h = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    /* JADX INFO: renamed from: a */
    public void m76881a(SSLContext sSLContext) {
        this.f53475e = sSLContext;
    }

    /* JADX INFO: renamed from: a */
    private void m76880a(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (C17890y.m76903a(this.f53482l)) {
            z = false;
        } else {
            C17766ac.m75934b(f53473c, "set protocols");
            AbstractC17885t.m76877c((SSLSocket) socket, this.f53482l);
            z = true;
        }
        if (C17890y.m76903a(this.f53481k) && C17890y.m76903a(this.f53480j)) {
            z2 = false;
        } else {
            C17766ac.m75934b(f53473c, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            AbstractC17885t.m76878d(sSLSocket);
            if (!C17890y.m76903a(this.f53481k)) {
                AbstractC17885t.m76873a(sSLSocket, this.f53481k);
            } else {
                AbstractC17885t.m76875b(sSLSocket, this.f53480j);
            }
        }
        if (!z) {
            C17766ac.m75934b(f53473c, "set default protocols");
            AbstractC17885t.m76878d((SSLSocket) socket);
        }
        if (z2) {
            return;
        }
        C17766ac.m75934b(f53473c, "set default cipher suites");
        AbstractC17885t.m76872a((SSLSocket) socket);
    }
}
