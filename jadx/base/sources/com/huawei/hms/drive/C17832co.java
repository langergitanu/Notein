package com.huawei.hms.drive;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.drive.C17798bh;
import com.huawei.hms.drive.InterfaceC17793bc;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.huawei.hms.drive.co */
/* JADX INFO: loaded from: classes6.dex */
public final class C17832co implements InterfaceC17793bc {

    /* JADX INFO: renamed from: a */
    private final C17795be f53131a;

    /* JADX INFO: renamed from: b */
    private final boolean f53132b;

    /* JADX INFO: renamed from: c */
    private volatile C17822ce f53133c;

    /* JADX INFO: renamed from: d */
    private Object f53134d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f53135e;

    public C17832co(C17795be c17795be, boolean z) {
        this.f53131a = c17795be;
        this.f53132b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m76511a() {
        this.f53135e = true;
        C17822ce c17822ce = this.f53133c;
        if (c17822ce != null) {
            c17822ce.m76469f();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m76513b() {
        return this.f53135e;
    }

    /* JADX INFO: renamed from: a */
    public void m76512a(Object obj) {
        this.f53134d = obj;
    }

    @Override // com.huawei.hms.drive.InterfaceC17793bc
    /* JADX INFO: renamed from: a */
    public C17800bj mo76180a(InterfaceC17793bc.a aVar) throws IOException {
        C17800bj c17800bjM76495a;
        C17798bh c17798bhMo76181a = aVar.mo76181a();
        C17829cl c17829cl = (C17829cl) aVar;
        InterfaceC17775al interfaceC17775alM76499h = c17829cl.m76499h();
        AbstractC17786aw abstractC17786awM76500i = c17829cl.m76500i();
        C17822ce c17822ce = new C17822ce(this.f53131a.m76211q(), m76505a(c17798bhMo76181a.m76261a()), interfaceC17775alM76499h, abstractC17786awM76500i, this.f53134d, this.f53131a.m76218x());
        this.f53133c = c17822ce;
        c17822ce.f53092a.m75950a(c17798bhMo76181a.m76262a("host"));
        C17822ce c17822ce2 = c17822ce;
        int i = 0;
        C17800bj c17800bj = null;
        C17798bh c17798bh = c17798bhMo76181a;
        while (!this.f53135e) {
            try {
                try {
                    try {
                        c17800bjM76495a = c17829cl.m76495a(c17798bh, c17822ce2, null, null);
                        if (c17800bj != null) {
                            c17800bjM76495a = c17800bjM76495a.m76288g().m76309c(c17800bj.m76288g().m76302a((AbstractC17801bk) null).m76305a()).m76305a();
                        }
                    } catch (IOException e) {
                        if (!m76509a(e, c17822ce2, !(e instanceof C17836cs), c17798bh)) {
                            throw e;
                        }
                    }
                } catch (C17820cc e2) {
                    if (!m76509a(e2.m76432b(), c17822ce2, false, c17798bh)) {
                        throw e2.m76430a();
                    }
                }
                try {
                    C17798bh c17798bhM76506a = m76506a(c17800bjM76495a, c17822ce2.m76465b());
                    if (c17798bhM76506a == null) {
                        c17822ce2.m76467d();
                        return c17800bjM76495a;
                    }
                    C17806bp.m76338a(c17800bjM76495a.m76287f());
                    int i2 = i + 1;
                    if (i2 <= 20) {
                        if (!(c17798bhM76506a.m76265d() instanceof InterfaceC17834cq)) {
                            if (!m76507a(c17800bjM76495a, c17798bhM76506a.m76261a())) {
                                c17822ce2.m76467d();
                                C17822ce c17822ce3 = new C17822ce(this.f53131a.m76211q(), m76505a(c17798bhM76506a.m76261a()), interfaceC17775alM76499h, abstractC17786awM76500i, this.f53134d, this.f53131a.m76218x());
                                this.f53133c = c17822ce3;
                                c17822ce2 = c17822ce3;
                            } else if (c17822ce2.m76458a() != null) {
                                throw new IllegalStateException("Closing the body of a  response didn't close its backing stream. Bad interceptor?");
                            }
                            c17800bj = c17800bjM76495a;
                            c17798bh = c17798bhM76506a;
                            i = i2;
                        } else {
                            c17822ce2.m76467d();
                            throw new HttpRetryException("Cannot retry streamed HTTP body", c17800bjM76495a.m76283b());
                        }
                    } else {
                        c17822ce2.m76467d();
                        throw new ProtocolException(C21532OooOOo.OooO0OO(i2, "Too many follow-up requests: "));
                    }
                } catch (IOException e3) {
                    c17822ce2.m76467d();
                    throw e3;
                }
            } catch (Throwable th) {
                c17822ce2.m76463a((IOException) null);
                c17822ce2.m76467d();
                throw th;
            }
        }
        c17822ce2.m76467d();
        throw new IOException("Canceled");
    }

    /* JADX INFO: renamed from: a */
    private C17771ah m76505a(C17792bb c17792bb) {
        SSLSocketFactory sSLSocketFactoryM76206l;
        HostnameVerifier hostnameVerifierM76207m;
        C17777an c17777anM76208n;
        if (c17792bb.m76147c()) {
            sSLSocketFactoryM76206l = this.f53131a.m76206l();
            hostnameVerifierM76207m = this.f53131a.m76207m();
            c17777anM76208n = this.f53131a.m76208n();
        } else {
            sSLSocketFactoryM76206l = null;
            hostnameVerifierM76207m = null;
            c17777anM76208n = null;
        }
        return new C17771ah(c17792bb.m76151f(), c17792bb.m76152g(), this.f53131a.m76204j(), this.f53131a.m76205k(), sSLSocketFactoryM76206l, hostnameVerifierM76207m, c17777anM76208n, this.f53131a.m76210p(), this.f53131a.m76200f(), this.f53131a.m76216v(), this.f53131a.m76217w(), this.f53131a.m76201g());
    }

    /* JADX INFO: renamed from: a */
    private boolean m76509a(IOException iOException, C17822ce c17822ce, boolean z, C17798bh c17798bh) {
        c17822ce.m76463a(iOException);
        if (this.f53131a.m76214t()) {
            return !(z && m76508a(iOException, c17798bh)) && m76510a(iOException, z) && c17822ce.m76470g();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m76508a(IOException iOException, C17798bh c17798bh) {
        return (c17798bh.m76265d() instanceof InterfaceC17834cq) || (iOException instanceof FileNotFoundException);
    }

    /* JADX INFO: renamed from: a */
    private boolean m76510a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private C17798bh m76506a(C17800bj c17800bj, C17802bl c17802bl) throws IOException {
        String strM76281a;
        C17792bb c17792bbM76146c;
        if (c17800bj != null) {
            int iM76283b = c17800bj.m76283b();
            String strM76263b = c17800bj.m76280a().m76263b();
            if (iM76283b == 307 || iM76283b == 308) {
                if (!strM76263b.equals("GET") && !strM76263b.equals("HEAD")) {
                    return null;
                }
            } else {
                if (iM76283b == 401) {
                    return this.f53131a.m76209o().mo75963a(c17802bl, c17800bj);
                }
                if (iM76283b == 503) {
                    if ((c17800bj.m76289h() == null || c17800bj.m76289h().m76283b() != 503) && m76504a(c17800bj, Integer.MAX_VALUE) == 0) {
                        return c17800bj.m76280a();
                    }
                    return null;
                }
                if (iM76283b == 407) {
                    if (c17802bl.m76316b().type() == Proxy.Type.HTTP) {
                        return this.f53131a.m76210p().mo75963a(c17802bl, c17800bj);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (iM76283b == 408) {
                    if (!this.f53131a.m76214t() || (c17800bj.m76280a().m76265d() instanceof InterfaceC17834cq)) {
                        return null;
                    }
                    if ((c17800bj.m76289h() == null || c17800bj.m76289h().m76283b() != 408) && m76504a(c17800bj, 0) <= 0) {
                        return c17800bj.m76280a();
                    }
                    return null;
                }
                switch (iM76283b) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return null;
                }
            }
            if (!this.f53131a.m76213s() || (strM76281a = c17800bj.m76281a("Location")) == null || (c17792bbM76146c = c17800bj.m76280a().m76261a().m76146c(strM76281a)) == null) {
                return null;
            }
            if (!c17792bbM76146c.m76145b().equals(c17800bj.m76280a().m76261a().m76145b()) && !this.f53131a.m76212r()) {
                return null;
            }
            C17798bh.a aVarM76268g = c17800bj.m76280a().m76268g();
            if (C17828ck.m76492c(strM76263b)) {
                boolean zM76493d = C17828ck.m76493d(strM76263b);
                if (C17828ck.m76494e(strM76263b)) {
                    aVarM76268g.m76275a("GET", (AbstractC17799bi) null);
                } else {
                    aVarM76268g.m76275a(strM76263b, zM76493d ? c17800bj.m76280a().m76265d() : null);
                }
                if (!zM76493d) {
                    aVarM76268g.m76278b(HttpHeaders.TRANSFER_ENCODING);
                    aVarM76268g.m76278b("Content-Length");
                    aVarM76268g.m76278b("Content-Type");
                }
            }
            if (!m76507a(c17800bj, c17792bbM76146c)) {
                aVarM76268g.m76278b("Authorization");
            }
            return aVarM76268g.m76273a(c17792bbM76146c).m76277a();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: a */
    private int m76504a(C17800bj c17800bj, int i) {
        String strM76281a = c17800bj.m76281a("Retry-After");
        if (strM76281a == null) {
            return i;
        }
        if (strM76281a.matches("\\d+")) {
            return Integer.parseInt(strM76281a);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    private boolean m76507a(C17800bj c17800bj, C17792bb c17792bb) {
        C17792bb c17792bbM76261a = c17800bj.m76280a().m76261a();
        return c17792bbM76261a.m76151f().equals(c17792bb.m76151f()) && c17792bbM76261a.m76152g() == c17792bb.m76152g() && c17792bbM76261a.m76145b().equals(c17792bb.m76145b());
    }
}
