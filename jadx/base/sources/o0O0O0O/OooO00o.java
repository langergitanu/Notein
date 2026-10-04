package o0O0O0O;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import o0oO0O0o.AsyncTaskC30783OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            o00OOOo.OooO0OO.OooO0Oo("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            OooO0OO.OooO00o(str, x509Certificate);
            AsyncTaskC30783OooO0O0.OooO00o();
            return true;
        } catch (SSLException e) {
            o00OOOo.OooO0OO.OooO0OO("", "SSLException : " + e.getMessage());
            return false;
        }
    }
}
