package com.huawei.hms.drive;

import OooOoo.C20593OooO0Oo;
import androidx.core.location.LocationRequestCompat;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.drive.C17798bh;
import com.huawei.hms.drive.C17800bj;
import com.huawei.hms.drive.C17821cd;
import com.huawei.hms.drive.C17842cy;
import com.huawei.hms.drive.InterfaceC17793bc;
import com.huawei.hms.network.embedded.C18217i9;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34525OooO0o;
import oOo00OoO.InterfaceC34526OooO0o0;
import oOo00OoO.InterfaceC34548OooOoo0;

/* JADX INFO: renamed from: com.huawei.hms.drive.ca */
/* JADX INFO: loaded from: classes6.dex */
public final class C17818ca extends C17842cy.c implements InterfaceC17779ap {

    /* JADX INFO: renamed from: a */
    public boolean f53052a;

    /* JADX INFO: renamed from: b */
    public int f53053b;

    /* JADX INFO: renamed from: k */
    private final C17780aq f53061k;

    /* JADX INFO: renamed from: l */
    private C17802bl f53062l;

    /* JADX INFO: renamed from: m */
    private Socket f53063m;

    /* JADX INFO: renamed from: n */
    private Socket f53064n;

    /* JADX INFO: renamed from: o */
    private C17787ax f53065o;

    /* JADX INFO: renamed from: p */
    private EnumC17796bf f53066p;

    /* JADX INFO: renamed from: q */
    private C17842cy f53067q;

    /* JADX INFO: renamed from: r */
    private InterfaceC34525OooO0o f53068r;

    /* JADX INFO: renamed from: s */
    private InterfaceC34526OooO0o0 f53069s;

    /* JADX INFO: renamed from: c */
    public int f53054c = 1;

    /* JADX INFO: renamed from: d */
    public final List<Reference<C17822ce>> f53055d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public long f53056e = LocationRequestCompat.PASSIVE_INTERVAL;

    /* JADX INFO: renamed from: f */
    public long f53057f = 0;

    /* JADX INFO: renamed from: t */
    private C17821cd.a f53070t = null;

    /* JADX INFO: renamed from: u */
    private C17813bw f53071u = null;

    /* JADX INFO: renamed from: v */
    private C17802bl f53072v = null;

    /* JADX INFO: renamed from: g */
    long f53058g = 0;

    /* JADX INFO: renamed from: h */
    int f53059h = 0;

    /* JADX INFO: renamed from: i */
    int f53060i = 0;

    public C17818ca(C17780aq c17780aq, C17802bl c17802bl) {
        this.f53061k = c17780aq;
        this.f53062l = c17802bl;
    }

    /* JADX INFO: renamed from: g */
    private C17798bh m76411g() throws IOException {
        C17798bh c17798bhM76277a = new C17798bh.a().m76273a(this.f53062l.m76315a().m75952b()).m76275a("CONNECT", (AbstractC17799bi) null).m76276a("Host", C17806bp.m76328a(this.f53062l.m76315a().m75952b(), true)).m76276a("Proxy-Connection", HttpHeaders.KEEP_ALIVE).m76276a("User-Agent", C17807bq.m76357a()).m76277a();
        C17798bh c17798bhMo75963a = this.f53062l.m76315a().m75955e().mo75963a(this.f53062l, new C17800bj.a().m76300a(c17798bhM76277a).m76299a(EnumC17796bf.HTTP_1_1).m76295a(407).m76303a("Preemptive Authenticate").m76302a(C17806bp.f52956c).m76296a(-1L).m76306b(-1L).m76304a(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").m76305a());
        return c17798bhMo75963a != null ? c17798bhMo75963a : c17798bhM76277a;
    }

    /* JADX INFO: renamed from: a */
    public void m76418a(ArrayList<InetSocketAddress> arrayList, int i) {
        if (arrayList != null) {
            this.f53071u = new C17813bw(arrayList, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public C17802bl m76422b() {
        return this.f53062l;
    }

    /* JADX INFO: renamed from: c */
    public void m76423c() {
        C17813bw c17813bw = this.f53071u;
        if (c17813bw != null) {
            c17813bw.m76397b();
        }
        C17806bp.m76340a(this.f53063m);
    }

    /* JADX INFO: renamed from: d */
    public Socket m76424d() {
        return this.f53064n;
    }

    /* JADX INFO: renamed from: e */
    public C17787ax m76425e() {
        return this.f53065o;
    }

    /* JADX INFO: renamed from: f */
    public boolean m76426f() {
        return this.f53067q != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f53062l.m76315a().m75952b().m76151f());
        sb.append(C18241k5.f55433h);
        sb.append(this.f53062l.m76315a().m75952b().m76152g());
        sb.append(", proxy=");
        sb.append(this.f53062l.m76316b());
        sb.append(" hostAddress=");
        sb.append(this.f53062l.m76317c());
        sb.append(" cipherSuite=");
        C17787ax c17787ax = this.f53065o;
        sb.append(c17787ax != null ? c17787ax.m76067a() : "none");
        sb.append(" protocol=");
        sb.append(this.f53066p);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m76415a(C17821cd.a aVar) {
        this.f53070t = aVar;
    }

    /* JADX INFO: renamed from: a */
    public C17821cd.a m76412a() {
        return this.f53070t;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0132 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m76414a(int i, int i2, int i3, int i4, boolean z, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw) throws Throwable {
        InterfaceC17775al interfaceC17775al2;
        AbstractC17786aw abstractC17786aw2;
        IOException iOException;
        if (this.f53066p == null) {
            List<C17781ar> listM75957g = this.f53062l.m76315a().m75957g();
            C17815by c17815by = new C17815by(listM75957g);
            if (this.f53062l.m76315a().m75960j() == null) {
                if (listM75957g.contains(C17781ar.f52710d)) {
                    String strM76151f = this.f53062l.m76315a().m75952b().m76151f();
                    if (!C17858dn.m76756e().mo76733b(strM76151f)) {
                        throw new C17820cc(new UnknownServiceException(C20593OooO0Oo.OooO0O0("CLEARTEXT communication to ", strM76151f, " not permitted by network security policy")));
                    }
                } else {
                    throw new C17820cc(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.f53062l.m76315a().m75956f().contains(EnumC17796bf.H2_PRIOR_KNOWLEDGE)) {
                throw new C17820cc(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            C17820cc c17820cc = null;
            do {
                try {
                    try {
                        if (this.f53062l.m76318d()) {
                            try {
                                m76407a(i, i2, i3, interfaceC17775al, abstractC17786aw);
                                interfaceC17775al2 = interfaceC17775al;
                                abstractC17786aw2 = abstractC17786aw;
                            } catch (IOException e) {
                                e = e;
                                interfaceC17775al2 = interfaceC17775al;
                                abstractC17786aw2 = abstractC17786aw;
                            }
                            try {
                                if (this.f53063m == null) {
                                }
                                if (!this.f53062l.m76318d() && this.f53063m == null) {
                                    throw new C17820cc(new ProtocolException("Too many tunnel connections attempted: 21"));
                                }
                                if (this.f53067q == null) {
                                    synchronized (this.f53061k) {
                                        this.f53054c = this.f53067q.m76576a();
                                    }
                                    return;
                                }
                                return;
                            } catch (IOException e2) {
                                e = e2;
                                iOException = e;
                                C17806bp.m76340a(this.f53064n);
                                C17806bp.m76340a(this.f53063m);
                                this.f53064n = null;
                                this.f53063m = null;
                                this.f53068r = null;
                                this.f53069s = null;
                                this.f53065o = null;
                                this.f53066p = null;
                                this.f53067q = null;
                                abstractC17786aw2.m76056a(interfaceC17775al2, this.f53062l.m76317c(), this.f53062l.m76316b(), null, iOException);
                                if (c17820cc != null) {
                                }
                                if (z) {
                                }
                            }
                        } else {
                            interfaceC17775al2 = interfaceC17775al;
                            abstractC17786aw2 = abstractC17786aw;
                            m76408a(i, i2, interfaceC17775al2, abstractC17786aw2);
                        }
                        m76410a(c17815by, i4, interfaceC17775al2, abstractC17786aw2);
                        abstractC17786aw2.m76055a(interfaceC17775al2, this.f53062l.m76317c(), this.f53062l.m76316b(), this.f53066p);
                        if (!this.f53062l.m76318d()) {
                        }
                        if (this.f53067q == null) {
                        }
                    } catch (IOException e3) {
                        e = e3;
                        iOException = e;
                        C17806bp.m76340a(this.f53064n);
                        C17806bp.m76340a(this.f53063m);
                        this.f53064n = null;
                        this.f53063m = null;
                        this.f53068r = null;
                        this.f53069s = null;
                        this.f53065o = null;
                        this.f53066p = null;
                        this.f53067q = null;
                        abstractC17786aw2.m76056a(interfaceC17775al2, this.f53062l.m76317c(), this.f53062l.m76316b(), null, iOException);
                        if (c17820cc != null) {
                            c17820cc = new C17820cc(iOException);
                        } else {
                            c17820cc.m76431a(iOException);
                        }
                        if (z) {
                            throw c17820cc;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    interfaceC17775al2 = interfaceC17775al;
                    abstractC17786aw2 = abstractC17786aw;
                }
            } while (c17815by.m76404a(iOException));
            throw c17820cc;
        }
        throw new IllegalStateException("already connected");
    }

    /* JADX INFO: renamed from: a */
    private void m76407a(int i, int i2, int i3, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw) throws IOException {
        C17798bh c17798bhM76411g = m76411g();
        C17792bb c17792bbM76261a = c17798bhM76411g.m76261a();
        for (int i4 = 0; i4 < 21; i4++) {
            m76408a(i, i2, interfaceC17775al, abstractC17786aw);
            c17798bhM76411g = m76405a(i2, i3, c17798bhM76411g, c17792bbM76261a);
            if (c17798bhM76411g == null) {
                return;
            }
            C17806bp.m76340a(this.f53063m);
            this.f53063m = null;
            this.f53069s = null;
            this.f53068r = null;
            abstractC17786aw.m76055a(interfaceC17775al, this.f53062l.m76317c(), this.f53062l.m76316b(), null);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76408a(int i, int i2, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw) throws IOException {
        Socket socketCreateSocket;
        long jCurrentTimeMillis;
        if (this.f53071u != null && this.f53072v == null) {
            jCurrentTimeMillis = System.currentTimeMillis();
            this.f53063m = this.f53071u.m76395a(i, this.f53062l.m76316b(), interfaceC17775al, abstractC17786aw);
            C17821cd.a aVar = this.f53070t;
            if (aVar != null && aVar.m76449d()) {
                this.f53070t.m76445a(this.f53071u.m76396a());
                Socket socket = this.f53063m;
                if (socket != null) {
                    this.f53070t.m76444a((InetSocketAddress) socket.getRemoteSocketAddress());
                }
            }
            if (this.f53063m != null) {
                C17802bl c17802bl = new C17802bl(this.f53062l.m76315a(), this.f53062l.m76316b(), (InetSocketAddress) this.f53063m.getRemoteSocketAddress());
                this.f53072v = c17802bl;
                this.f53062l = c17802bl;
                this.f53063m.setSoTimeout(i2);
            } else {
                throw new ConnectException("Failed to connect to host " + this.f53062l.m76315a().m75952b().m76151f());
            }
        } else {
            C17802bl c17802bl2 = this.f53072v;
            if (c17802bl2 == null) {
                c17802bl2 = this.f53062l;
            }
            Proxy proxyM76316b = c17802bl2.m76316b();
            C17771ah c17771ahM76315a = c17802bl2.m76315a();
            if (proxyM76316b.type() != Proxy.Type.DIRECT && proxyM76316b.type() != Proxy.Type.HTTP) {
                socketCreateSocket = new Socket(proxyM76316b);
            } else {
                socketCreateSocket = c17771ahM76315a.m75954d().createSocket();
            }
            this.f53063m = socketCreateSocket;
            abstractC17786aw.m76054a(interfaceC17775al, this.f53062l.m76317c(), proxyM76316b);
            jCurrentTimeMillis = System.currentTimeMillis();
            this.f53063m.setSoTimeout(i2);
            try {
                C17858dn.m76756e().mo76731a(this.f53063m, c17802bl2.m76317c(), i);
            } catch (ConnectException e) {
                ConnectException connectException = new ConnectException("Failed to connect to " + c17802bl2.m76317c());
                connectException.initCause(e);
                throw connectException;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        this.f53058g = jCurrentTimeMillis2;
        this.f53060i = ((int) ((jCurrentTimeMillis2 * 4) + 1000)) / i2;
        try {
            this.f53068r = C34535OooOOOo.OooO0O0(C34535OooOOOo.OooO0oO(this.f53063m));
            this.f53069s = C34535OooOOOo.OooO00o(C34535OooOOOo.OooO0Oo(this.f53063m));
        } catch (NullPointerException e2) {
            if (C18217i9.f55238y.equals(e2.getMessage())) {
                throw new IOException(e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76410a(C17815by c17815by, int i, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw) throws Throwable {
        if (this.f53062l.m76315a().m75960j() == null) {
            List<EnumC17796bf> listM75956f = this.f53062l.m76315a().m75956f();
            EnumC17796bf enumC17796bf = EnumC17796bf.H2_PRIOR_KNOWLEDGE;
            if (listM75956f.contains(enumC17796bf)) {
                this.f53064n = this.f53063m;
                this.f53066p = enumC17796bf;
                m76406a(i);
                return;
            } else {
                this.f53064n = this.f53063m;
                this.f53066p = EnumC17796bf.HTTP_1_1;
                return;
            }
        }
        abstractC17786aw.m76057b(interfaceC17775al);
        m76409a(c17815by);
        abstractC17786aw.m76048a(interfaceC17775al, this.f53065o);
        if (this.f53066p == EnumC17796bf.HTTP_2) {
            m76406a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76406a(int i) throws IOException {
        this.f53064n.setSoTimeout(0);
        C17842cy c17842cyM76601a = new C17842cy.a(true).m76600a(this.f53064n, this.f53062l.m76315a().m75952b().m76151f(), this.f53068r, this.f53069s).m76599a(this).m76598a(i).m76601a();
        this.f53067q = c17842cyM76601a;
        c17842cyM76601a.m76594c();
    }

    /* JADX INFO: renamed from: a */
    private void m76409a(C17815by c17815by) throws Throwable {
        SSLSocket sSLSocket;
        EnumC17796bf enumC17796bfM76243a;
        C17771ah c17771ahM76315a = this.f53062l.m76315a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) c17771ahM76315a.m75960j().createSocket(this.f53063m, c17771ahM76315a.m75952b().m76151f(), c17771ahM76315a.m75952b().m76152g(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String strM75949a = c17771ahM76315a.m75949a();
            if (strM75949a == null || strM75949a.length() == 0) {
                strM75949a = c17771ahM76315a.m75952b().m76151f();
            }
            C17781ar c17781arM76403a = c17815by.m76403a(sSLSocket);
            if (c17781arM76403a.m76016d()) {
                C17858dn.m76756e().mo76721a(sSLSocket, strM75949a, c17771ahM76315a.m75956f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C17787ax c17787axM76066a = C17787ax.m76066a(session);
            if (!c17771ahM76315a.m75961k().verify(strM75949a, session)) {
                List<Certificate> listM76068b = c17787axM76066a.m76068b();
                if (!listM76068b.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) listM76068b.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + c17771ahM76315a.m75952b().m76151f() + " not verified:\n    certificate: " + C17777an.m75982a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C17864dt.m76766a(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + c17771ahM76315a.m75952b().m76151f() + " not verified (no certificates)");
            }
            c17771ahM76315a.m75962l().m75987a(c17771ahM76315a.m75952b().m76151f(), c17787axM76066a.m76068b());
            String strMo76720a = c17781arM76403a.m76016d() ? C17858dn.m76756e().mo76720a(sSLSocket) : null;
            this.f53064n = sSLSocket;
            this.f53068r = C34535OooOOOo.OooO0O0(C34535OooOOOo.OooO0oO(sSLSocket));
            this.f53069s = C34535OooOOOo.OooO00o(C34535OooOOOo.OooO0Oo(this.f53064n));
            this.f53065o = c17787axM76066a;
            if (strMo76720a != null) {
                enumC17796bfM76243a = EnumC17796bf.m76243a(strMo76720a);
            } else {
                enumC17796bfM76243a = EnumC17796bf.HTTP_1_1;
            }
            this.f53066p = enumC17796bfM76243a;
            C17858dn.m76756e().mo76745b(sSLSocket);
        } catch (AssertionError e2) {
            e = e2;
            if (!C17806bp.m76341a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C17858dn.m76756e().mo76745b(sSLSocket2);
            }
            C17806bp.m76340a((Socket) sSLSocket2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private C17798bh m76405a(int i, int i2, C17798bh c17798bh, C17792bb c17792bb) throws IOException {
        String str = "CONNECT " + C17806bp.m76328a(c17792bb, true) + " HTTP/1.1";
        while (true) {
            C17835cr c17835cr = new C17835cr(null, null, this.f53068r, this.f53069s);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f53068r.timeout().timeout(i, timeUnit);
            this.f53069s.timeout().timeout(i2, timeUnit);
            c17835cr.m76518a(c17798bh.m76264c(), str);
            c17835cr.mo76477b();
            C17800bj c17800bjM76305a = c17835cr.mo76472a(false).m76300a(c17798bh).m76305a();
            long jM76485a = C17827cj.m76485a(c17800bjM76305a);
            if (jM76485a == -1) {
                jM76485a = 0;
            }
            InterfaceC34548OooOoo0 interfaceC34548OooOoo0M76520b = c17835cr.m76520b(jM76485a);
            try {
                try {
                    C17806bp.m76351b(interfaceC34548OooOoo0M76520b, Integer.MAX_VALUE, timeUnit);
                    interfaceC34548OooOoo0M76520b.close();
                    int iM76283b = c17800bjM76305a.m76283b();
                    if (iM76283b == 200) {
                        if (this.f53068r.OooOO0().o0000o0O() && this.f53069s.OooOO0().o0000o0O()) {
                            return null;
                        }
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    if (iM76283b == 407) {
                        C17798bh c17798bhMo75963a = this.f53062l.m76315a().m75955e().mo75963a(this.f53062l, c17800bjM76305a);
                        if (c17798bhMo75963a != null) {
                            if ("close".equalsIgnoreCase(c17800bjM76305a.m76281a(HttpHeaders.CONNECTION))) {
                                return c17798bhMo75963a;
                            }
                            c17798bh = c17798bhMo75963a;
                        } else {
                            throw new IOException("Failed to authenticate with proxy");
                        }
                    } else {
                        throw new IOException("Unexpected response code for CONNECT: " + c17800bjM76305a.m76283b());
                    }
                } catch (IOException e) {
                    throw e;
                }
            } catch (Throwable th) {
                interfaceC34548OooOoo0M76520b.close();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m76419a(C17771ah c17771ah, C17802bl c17802bl) {
        if (this.f53055d.size() >= this.f53054c || this.f53052a || !AbstractC17804bn.f52952a.mo76229a(this.f53062l.m76315a(), c17771ah)) {
            return false;
        }
        if (c17771ah.m75952b().m76151f().equals(m76422b().m76315a().m75952b().m76151f())) {
            return true;
        }
        if (this.f53067q == null || c17802bl == null) {
            return false;
        }
        Proxy.Type type = c17802bl.m76316b().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || this.f53062l.m76316b().type() != type2 || !this.f53062l.m76317c().equals(c17802bl.m76317c()) || c17802bl.m76315a().m75961k() != C17864dt.f53397a || !m76420a(c17771ah.m75952b())) {
            return false;
        }
        try {
            c17771ah.m75962l().m75987a(c17771ah.m75952b().m76151f(), m76425e().m76068b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m76420a(C17792bb c17792bb) {
        if (c17792bb.m76152g() != this.f53062l.m76315a().m75952b().m76152g()) {
            return false;
        }
        if (c17792bb.m76151f().equals(this.f53062l.m76315a().m75952b().m76151f())) {
            return true;
        }
        return this.f53065o != null && C17864dt.f53397a.m76771a(c17792bb.m76151f(), (X509Certificate) this.f53065o.m76068b().get(0));
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC17825ch m76413a(C17795be c17795be, InterfaceC17793bc.a aVar, C17822ce c17822ce) throws SocketException {
        if (this.f53067q != null) {
            return new C17841cx(c17795be, aVar, c17822ce, this.f53067q);
        }
        this.f53064n.setSoTimeout(aVar.mo76184c());
        C34547OooOoo c34547OooOooTimeout = this.f53068r.timeout();
        long jMo76184c = aVar.mo76184c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c34547OooOooTimeout.timeout(jMo76184c, timeUnit);
        this.f53069s.timeout().timeout(aVar.mo76185d(), timeUnit);
        return new C17835cr(c17795be, c17822ce, this.f53068r, this.f53069s);
    }

    /* JADX INFO: renamed from: a */
    public boolean m76421a(boolean z) {
        if (this.f53064n.isClosed() || this.f53064n.isInputShutdown() || this.f53064n.isOutputShutdown()) {
            return false;
        }
        C17842cy c17842cy = this.f53067q;
        if (c17842cy != null) {
            return c17842cy.m76593b(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.f53064n.getSoTimeout();
                try {
                    this.f53064n.setSoTimeout(1);
                    return !this.f53068r.o0000o0O();
                } finally {
                    this.f53064n.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.hms.drive.C17842cy.c
    /* JADX INFO: renamed from: a */
    public void mo76417a(C17845da c17845da) throws IOException {
        c17845da.m76657a(EnumC17837ct.REFUSED_STREAM);
    }

    @Override // com.huawei.hms.drive.C17842cy.c
    /* JADX INFO: renamed from: a */
    public void mo76416a(C17842cy c17842cy) {
        synchronized (this.f53061k) {
            this.f53054c = c17842cy.m76576a();
        }
    }
}
