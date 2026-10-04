package oO0OOo0o;

import java.security.cert.Certificate;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: oO0OOo0o.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33079OooOooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Logger f119609OooO0Oo = Logger.getLogger(C33079OooOooO.class.getName());

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C33079OooOooO f119610OooO0o0 = new C33079OooOooO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentSkipListMap f119611OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f119612OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConcurrentHashMap f119613OooO0OO;

    /* JADX INFO: renamed from: oO0OOo0o.OooOooO$OooO00o */
    public static final class OooO00o {
        public OooO00o(SSLSession sSLSession) {
            sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                Certificate certificate = localCertificates[0];
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    Certificate certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e) {
                C33079OooOooO.f119609OooO0Oo.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e);
            }
        }
    }

    public C33079OooOooO() {
        new ConcurrentSkipListMap();
        this.f119611OooO00o = new ConcurrentSkipListMap();
        this.f119612OooO0O0 = new ConcurrentHashMap();
        this.f119613OooO0OO = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
