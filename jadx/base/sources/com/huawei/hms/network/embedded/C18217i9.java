package com.huawei.hms.network.embedded;

import OooOoo.C20593OooO0Oo;
import androidx.core.location.LocationRequestCompat;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18160e8;
import com.huawei.hms.network.embedded.C18163eb;
import com.huawei.hms.network.embedded.C18176fa;
import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.C18273m9;
import com.huawei.hms.network.embedded.InterfaceC18429y7;
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

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.i9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18217i9 extends C18176fa.j implements InterfaceC18229j7 {

    /* JADX INFO: renamed from: A */
    public static final int f55234A = 4;

    /* JADX INFO: renamed from: B */
    public static final long f55235B = 1000000000;

    /* JADX INFO: renamed from: C */
    public static final int f55236C = 1000;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ boolean f55237D = true;

    /* JADX INFO: renamed from: y */
    public static final String f55238y = "throw with null exception";

    /* JADX INFO: renamed from: z */
    public static final int f55239z = 21;

    /* JADX INFO: renamed from: b */
    public final C18231j9 f55240b;

    /* JADX INFO: renamed from: c */
    public C18216i8 f55241c;

    /* JADX INFO: renamed from: d */
    public Socket f55242d;

    /* JADX INFO: renamed from: e */
    public Socket f55243e;

    /* JADX INFO: renamed from: f */
    public C18364t7 f55244f;

    /* JADX INFO: renamed from: g */
    public EnumC18132c8 f55245g;

    /* JADX INFO: renamed from: h */
    public C18176fa f55246h;

    /* JADX INFO: renamed from: i */
    public InterfaceC18289nb f55247i;

    /* JADX INFO: renamed from: j */
    public InterfaceC18275mb f55248j;

    /* JADX INFO: renamed from: k */
    public boolean f55249k;

    /* JADX INFO: renamed from: l */
    public int f55250l;

    /* JADX INFO: renamed from: m */
    public int f55251m;

    /* JADX INFO: renamed from: n */
    public int f55252n;

    /* JADX INFO: renamed from: o */
    public int f55253o = 1;

    /* JADX INFO: renamed from: p */
    public final List<Reference<C18287n9>> f55254p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public long f55255q = LocationRequestCompat.PASSIVE_INTERVAL;

    /* JADX INFO: renamed from: r */
    public C18273m9.a f55256r = null;

    /* JADX INFO: renamed from: s */
    public C18133c9 f55257s = null;

    /* JADX INFO: renamed from: t */
    public C18216i8 f55258t = null;

    /* JADX INFO: renamed from: u */
    public long f55259u = 0;

    /* JADX INFO: renamed from: v */
    public int f55260v = 0;

    /* JADX INFO: renamed from: w */
    public int f55261w = 0;

    /* JADX INFO: renamed from: x */
    public long f55262x = 0;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.i9$a */
    public class a extends C18163eb.f {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C18175f9 f55263d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, InterfaceC18289nb interfaceC18289nb, InterfaceC18275mb interfaceC18275mb, C18175f9 c18175f9) {
            super(z, interfaceC18289nb, interfaceC18275mb);
            this.f55263d = c18175f9;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f55263d.m78423a(-1L, true, true, null);
        }
    }

    public C18217i9(C18231j9 c18231j9, C18216i8 c18216i8) {
        this.f55240b = c18231j9;
        this.f55241c = c18216i8;
    }

    /* JADX INFO: renamed from: a */
    private C18160e8 m78770a(int i, int i2, C18160e8 c18160e8, C18416x7 c18416x7) throws IOException {
        String str = "CONNECT " + C18313p8.m79363a(c18416x7, true) + " HTTP/1.1";
        while (true) {
            C18444z9 c18444z9 = new C18444z9(null, null, this.f55247i, this.f55248j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f55247i.timeout().mo78999b(i, timeUnit);
            this.f55248j.timeout().mo78999b(i2, timeUnit);
            c18444z9.m80065a(c18160e8.m78304e(), str);
            c18444z9.mo78631c();
            C18188g8 c18188g8M78605a = c18444z9.mo78625a(false).m78598a(c18160e8).m78605a();
            c18444z9.m80066c(c18188g8M78605a);
            int iM78589w = c18188g8M78605a.m78589w();
            if (iM78589w == 200) {
                if (this.f55247i.mo78386d().mo78389f() && this.f55248j.mo78258a().mo78389f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iM78589w != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c18188g8M78605a.m78589w());
            }
            C18160e8 c18160e8Mo77929b = this.f55241c.m78766a().m77858h().mo77929b(this.f55241c, c18188g8M78605a);
            if (c18160e8Mo77929b == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(c18188g8M78605a.m78582b(HttpHeaders.CONNECTION))) {
                return c18160e8Mo77929b;
            }
            c18160e8 = c18160e8Mo77929b;
        }
    }

    /* JADX INFO: renamed from: i */
    private C18160e8 m78778i() throws IOException {
        C18160e8 c18160e8M78323a = new C18160e8.a().m78314a(this.f55241c.m78766a().m77862l()).m78318a("CONNECT", (AbstractC18174f8) null).m78327b("Host", C18313p8.m79363a(this.f55241c.m78766a().m77862l(), true)).m78327b("Proxy-Connection", HttpHeaders.KEEP_ALIVE).m78327b("User-Agent", C18326q8.m79417a()).m78323a();
        C18160e8 c18160e8Mo77929b = this.f55241c.m78766a().m77858h().mo77929b(this.f55241c, new C18188g8.a().m78598a(c18160e8M78323a).m78597a(EnumC18132c8.HTTP_1_1).m78595a(407).m78603a("Preemptive Authenticate").m78600a(C18313p8.f55895d).m78607b(-1L).m78596a(-1L).m78610b(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").m78605a());
        return c18160e8Mo77929b != null ? c18160e8Mo77929b : c18160e8M78323a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18229j7
    /* JADX INFO: renamed from: b */
    public C18216i8 mo78789b() {
        return this.f55241c;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18229j7
    /* JADX INFO: renamed from: c */
    public Socket mo78790c() {
        return this.f55243e;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18229j7
    /* JADX INFO: renamed from: d */
    public EnumC18132c8 mo78791d() {
        return this.f55245g;
    }

    /* JADX INFO: renamed from: e */
    public void m78792e() {
        C18133c9 c18133c9 = this.f55257s;
        if (c18133c9 != null) {
            c18133c9.mo77903a();
        }
        C18313p8.m79381a(this.f55242d);
    }

    /* JADX INFO: renamed from: f */
    public C18273m9.a m78793f() {
        return this.f55256r;
    }

    /* JADX INFO: renamed from: g */
    public boolean m78794g() {
        return this.f55246h != null;
    }

    /* JADX INFO: renamed from: h */
    public void m78795h() {
        if (!f55237D && Thread.holdsLock(this.f55240b)) {
            throw new AssertionError();
        }
        synchronized (this.f55240b) {
            this.f55249k = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f55241c.m78766a().m77862l().m79929h());
        sb.append(C18241k5.f55433h);
        sb.append(this.f55241c.m78766a().m77862l().m79935n());
        sb.append(", proxy=");
        sb.append(this.f55241c.m78767b());
        sb.append(" hostAddress=");
        sb.append(this.f55241c.m78769d());
        sb.append(" cipherSuite=");
        C18364t7 c18364t7 = this.f55244f;
        sb.append(c18364t7 != null ? c18364t7.m79560a() : "none");
        sb.append(" protocol=");
        sb.append(this.f55245g);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public C18163eb.f m78779a(C18175f9 c18175f9) throws SocketException {
        this.f55243e.setSoTimeout(0);
        m78795h();
        return new a(true, this.f55247i, this.f55248j, c18175f9);
    }

    /* JADX INFO: renamed from: a */
    public static C18217i9 m78771a(C18231j9 c18231j9, C18216i8 c18216i8, Socket socket, long j) {
        C18217i9 c18217i9 = new C18217i9(c18231j9, c18216i8);
        c18217i9.f55243e = socket;
        c18217i9.f55255q = j;
        return c18217i9;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC18327q9 m78780a(C18118b8 c18118b8, InterfaceC18429y7.a aVar) throws SocketException {
        C18176fa c18176fa = this.f55246h;
        if (c18176fa != null) {
            return new C18190ga(c18118b8, this, aVar, c18176fa);
        }
        this.f55243e.setSoTimeout(aVar.mo79649c());
        C18248kc c18248kcTimeout = this.f55247i.timeout();
        long jMo79649c = aVar.mo79649c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c18248kcTimeout.mo78999b(jMo79649c, timeUnit);
        this.f55248j.timeout().mo78999b(aVar.mo79647b(), timeUnit);
        return new C18444z9(c18118b8, this, this.f55247i, this.f55248j);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18229j7
    /* JADX INFO: renamed from: a */
    public C18364t7 mo78781a() {
        return this.f55244f;
    }

    /* JADX INFO: renamed from: a */
    private void m78772a(int i) throws IOException {
        this.f55243e.setSoTimeout(0);
        C18176fa c18176faM78489a = new C18176fa.h(true).m78488a(this.f55243e, this.f55241c.m78766a().m77862l().m79929h(), this.f55247i, this.f55248j).m78485a(this).m78484a(i).m78489a();
        this.f55246h = c18176faM78489a;
        c18176faM78489a.m78481w();
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
    public void m78782a(int i, int i2, int i3, int i4, boolean z, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) throws Throwable {
        InterfaceC18159e7 interfaceC18159e72;
        AbstractC18338r7 abstractC18338r72;
        IOException iOException;
        if (this.f55245g != null) {
            throw new IllegalStateException("already connected");
        }
        List<C18257l7> listM77852b = this.f55241c.m78766a().m77852b();
        C18161e9 c18161e9 = new C18161e9(listM77852b);
        if (this.f55241c.m78766a().m77861k() == null) {
            if (!listM77852b.contains(C18257l7.f55616j)) {
                throw new C18259l9(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strM79929h = this.f55241c.m78766a().m77862l().m79929h();
            if (!C18406wa.m79845f().mo79430b(strM79929h)) {
                throw new C18259l9(new UnknownServiceException(C20593OooO0Oo.OooO0O0("CLEARTEXT communication to ", strM79929h, " not permitted by network security policy")));
            }
        } else if (this.f55241c.m78766a().m77856f().contains(EnumC18132c8.H2_PRIOR_KNOWLEDGE)) {
            throw new C18259l9(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C18259l9 c18259l9 = null;
        do {
            try {
                try {
                    if (this.f55241c.m78768c()) {
                        try {
                            m78773a(i, i2, i3, interfaceC18159e7, abstractC18338r7);
                            interfaceC18159e72 = interfaceC18159e7;
                            abstractC18338r72 = abstractC18338r7;
                        } catch (IOException e) {
                            e = e;
                            interfaceC18159e72 = interfaceC18159e7;
                            abstractC18338r72 = abstractC18338r7;
                        }
                        try {
                            if (this.f55242d == null) {
                            }
                            if (!this.f55241c.m78768c() && this.f55242d == null) {
                                throw new C18259l9(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            if (this.f55246h == null) {
                                synchronized (this.f55240b) {
                                    this.f55253o = this.f55246h.m78478t();
                                }
                                return;
                            }
                            return;
                        } catch (IOException e2) {
                            e = e2;
                            iOException = e;
                            C18313p8.m79381a(this.f55243e);
                            C18313p8.m79381a(this.f55242d);
                            this.f55243e = null;
                            this.f55242d = null;
                            this.f55247i = null;
                            this.f55248j = null;
                            this.f55244f = null;
                            this.f55245g = null;
                            this.f55246h = null;
                            abstractC18338r72.connectFailed(interfaceC18159e72, this.f55241c.m78769d(), this.f55241c.m78767b(), null, iOException);
                            if (c18259l9 != null) {
                            }
                            if (z) {
                            }
                        }
                    } else {
                        interfaceC18159e72 = interfaceC18159e7;
                        abstractC18338r72 = abstractC18338r7;
                        m78774a(i, i2, interfaceC18159e72, abstractC18338r72);
                    }
                    m78776a(c18161e9, i4, interfaceC18159e72, abstractC18338r72);
                    abstractC18338r72.connectEnd(interfaceC18159e72, this.f55241c.m78769d(), this.f55241c.m78767b(), this.f55245g);
                    if (!this.f55241c.m78768c()) {
                    }
                    if (this.f55246h == null) {
                    }
                } catch (IOException e3) {
                    e = e3;
                    iOException = e;
                    C18313p8.m79381a(this.f55243e);
                    C18313p8.m79381a(this.f55242d);
                    this.f55243e = null;
                    this.f55242d = null;
                    this.f55247i = null;
                    this.f55248j = null;
                    this.f55244f = null;
                    this.f55245g = null;
                    this.f55246h = null;
                    abstractC18338r72.connectFailed(interfaceC18159e72, this.f55241c.m78769d(), this.f55241c.m78767b(), null, iOException);
                    if (c18259l9 != null) {
                        c18259l9 = new C18259l9(iOException);
                    } else {
                        c18259l9.m79065a(iOException);
                    }
                    if (z) {
                        throw c18259l9;
                    }
                }
            } catch (IOException e4) {
                e = e4;
                interfaceC18159e72 = interfaceC18159e7;
                abstractC18338r72 = abstractC18338r7;
            }
        } while (c18161e9.m78335a(iOException));
        throw c18259l9;
    }

    /* JADX INFO: renamed from: a */
    private void m78773a(int i, int i2, int i3, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) throws IOException {
        C18160e8 c18160e8M78778i = m78778i();
        C18416x7 c18416x7M78310k = c18160e8M78778i.m78310k();
        for (int i4 = 0; i4 < 21; i4++) {
            m78774a(i, i2, interfaceC18159e7, abstractC18338r7);
            c18160e8M78778i = m78770a(i2, i3, c18160e8M78778i, c18416x7M78310k);
            if (c18160e8M78778i == null) {
                return;
            }
            C18313p8.m79381a(this.f55242d);
            this.f55242d = null;
            this.f55248j = null;
            this.f55247i = null;
            abstractC18338r7.connectEnd(interfaceC18159e7, this.f55241c.m78769d(), this.f55241c.m78767b(), null);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78774a(int i, int i2, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) throws IOException {
        long jCurrentTimeMillis;
        C18216i8 c18216i8M79183e;
        if (this.f55257s == null || this.f55258t != null) {
            C18216i8 c18216i8 = this.f55258t;
            if (c18216i8 == null) {
                c18216i8 = this.f55241c;
            }
            Proxy proxyM78767b = c18216i8.m78767b();
            this.f55242d = (proxyM78767b.type() == Proxy.Type.DIRECT || proxyM78767b.type() == Proxy.Type.HTTP) ? c18216i8.m78766a().m77860j().createSocket() : new Socket(proxyM78767b);
            abstractC18338r7.connectStart(interfaceC18159e7, this.f55241c.m78769d(), proxyM78767b);
            jCurrentTimeMillis = System.currentTimeMillis();
            this.f55242d.setSoTimeout(i2);
            try {
                C18406wa.m79845f().mo79427a(this.f55242d, c18216i8.m78769d(), i);
            } catch (ConnectException e) {
                ConnectException connectException = new ConnectException("Failed to connect to " + c18216i8.m78769d());
                connectException.initCause(e);
                throw connectException;
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            this.f55242d = this.f55257s.mo77902a(i, this.f55241c.m78767b(), interfaceC18159e7, abstractC18338r7);
            if (this.f55257s.f54480i != null && (c18216i8M79183e = this.f55256r.m79183e()) != null) {
                this.f55256r.m79180b(new C18216i8(c18216i8M79183e.m78766a(), c18216i8M79183e.m78767b(), this.f55257s.f54480i));
            }
            C18273m9.a aVar = this.f55256r;
            if (aVar != null) {
                aVar.m79177a(this.f55257s.mo77904b());
                Socket socket = this.f55242d;
                if (socket != null) {
                    this.f55256r.m79176a((InetSocketAddress) socket.getRemoteSocketAddress());
                }
            }
            if (this.f55242d == null) {
                throw new ConnectException("Failed to connect to host " + this.f55241c.m78766a().m77862l().m79929h());
            }
            C18216i8 c18216i82 = new C18216i8(this.f55241c.m78766a(), this.f55241c.m78767b(), (InetSocketAddress) this.f55242d.getRemoteSocketAddress());
            this.f55258t = c18216i82;
            this.f55241c = c18216i82;
            this.f55242d.setSoTimeout(i2);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        this.f55259u = jCurrentTimeMillis2;
        if (i2 != 0) {
            this.f55261w = ((int) ((jCurrentTimeMillis2 * 4) + 1000)) / i2;
        }
        try {
            this.f55247i = C18433yb.m80007a(C18433yb.m80010b(this.f55242d));
            this.f55248j = C18433yb.m80006a(C18433yb.m80002a(this.f55242d));
        } catch (NullPointerException e2) {
            if (f55238y.equals(e2.getMessage())) {
                throw new IOException(e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78775a(C18161e9 c18161e9) throws Throwable {
        SSLSocket sSLSocket;
        C18103a7 c18103a7M78766a = this.f55241c.m78766a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) c18103a7M78766a.m77861k().createSocket(this.f55242d, c18103a7M78766a.m77862l().m79929h(), c18103a7M78766a.m77862l().m79935n(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String strM77854d = c18103a7M78766a.m77854d();
            if (strM77854d != null && strM77854d.length() != 0) {
                strM77854d = C18416x7.m79913f(c18103a7M78766a.m77862l().m79940s() + "://" + strM77854d).m79929h();
            }
            if (strM77854d == null || strM77854d.length() == 0) {
                strM77854d = c18103a7M78766a.m77862l().m79929h();
            }
            C18257l7 c18257l7M78334a = c18161e9.m78334a(sSLSocket);
            if (c18257l7M78334a.m79054c()) {
                C18406wa.m79845f().mo79399a(sSLSocket, strM77854d, c18103a7M78766a.m77856f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C18364t7 c18364t7M79558a = C18364t7.m79558a(session);
            if (c18103a7M78766a.m77855e().verify(strM77854d, session)) {
                c18103a7M78766a.m77849a().m78566a(c18103a7M78766a.m77862l().m79929h(), c18364t7M79558a.m79563d());
                String strMo79400b = c18257l7M78334a.m79054c() ? C18406wa.m79845f().mo79400b(sSLSocket) : null;
                this.f55243e = sSLSocket;
                this.f55247i = C18433yb.m80007a(C18433yb.m80010b(sSLSocket));
                this.f55248j = C18433yb.m80006a(C18433yb.m80002a(this.f55243e));
                this.f55244f = c18364t7M79558a;
                this.f55245g = strMo79400b != null ? EnumC18132c8.m78133a(strMo79400b) : EnumC18132c8.HTTP_1_1;
                C18406wa.m79845f().mo79572a(sSLSocket);
                return;
            }
            List<Certificate> listM79563d = c18364t7M79558a.m79563d();
            if (listM79563d.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c18103a7M78766a.m77862l().m79929h() + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) listM79563d.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + c18103a7M78766a.m77862l().m79929h() + " not verified:\n    certificate: " + C18187g7.m78562a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C18135cb.m78146a(x509Certificate));
        } catch (AssertionError e2) {
            e = e2;
            if (!C18313p8.m79384a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C18406wa.m79845f().mo79572a(sSLSocket2);
            }
            C18313p8.m79381a((Socket) sSLSocket2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78776a(C18161e9 c18161e9, int i, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) throws Throwable {
        if (this.f55241c.m78766a().m77861k() != null) {
            abstractC18338r7.secureConnectStart(interfaceC18159e7);
            m78775a(c18161e9);
            abstractC18338r7.secureConnectEnd(interfaceC18159e7, this.f55244f);
            if (this.f55245g == EnumC18132c8.HTTP_2) {
                m78772a(i);
                return;
            }
            return;
        }
        List<EnumC18132c8> listM77856f = this.f55241c.m78766a().m77856f();
        EnumC18132c8 enumC18132c8 = EnumC18132c8.H2_PRIOR_KNOWLEDGE;
        if (!listM77856f.contains(enumC18132c8)) {
            this.f55243e = this.f55242d;
            this.f55245g = EnumC18132c8.HTTP_1_1;
        } else {
            this.f55243e = this.f55242d;
            this.f55245g = enumC18132c8;
            m78772a(i);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18176fa.j
    /* JADX INFO: renamed from: a */
    public void mo78490a(C18176fa c18176fa) {
        synchronized (this.f55240b) {
            this.f55253o = c18176fa.m78478t();
        }
    }

    @Override // com.huawei.hms.network.embedded.C18176fa.j
    /* JADX INFO: renamed from: a */
    public void mo78491a(C18218ia c18218ia) throws IOException {
        c18218ia.m78800a(EnumC18120ba.REFUSED_STREAM, (IOException) null);
    }

    /* JADX INFO: renamed from: a */
    public void m78783a(C18273m9.a aVar) {
        this.f55256r = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m78784a(IOException iOException) {
        if (!f55237D && Thread.holdsLock(this.f55240b)) {
            throw new AssertionError();
        }
        synchronized (this.f55240b) {
            try {
                if (iOException instanceof C18288na) {
                    EnumC18120ba enumC18120ba = ((C18288na) iOException).f55797a;
                    if (enumC18120ba == EnumC18120ba.REFUSED_STREAM) {
                        int i = this.f55252n + 1;
                        this.f55252n = i;
                        if (i > 1) {
                            this.f55249k = true;
                            this.f55250l++;
                        }
                    } else if (enumC18120ba != EnumC18120ba.CANCEL) {
                        this.f55249k = true;
                        this.f55250l++;
                    }
                } else if (!m78794g() || (iOException instanceof C18106aa)) {
                    this.f55249k = true;
                    if (this.f55251m == 0) {
                        if (iOException != null) {
                            this.f55240b.m78896a(this.f55241c, iOException);
                        }
                        this.f55250l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78785a(ArrayList<InetSocketAddress> arrayList, int i) {
        if (arrayList != null) {
            this.f55257s = C18119b9.m78015a(arrayList, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m78786a(C18103a7 c18103a7, List<C18216i8> list) {
        if (this.f55254p.size() >= this.f55253o || this.f55249k || !AbstractC18286n8.f55777a.mo77974a(this.f55241c.m78766a(), c18103a7)) {
            return false;
        }
        if (c18103a7.m77862l().m79929h().equals(mo78789b().m78766a().m77862l().m79929h())) {
            return true;
        }
        if (this.f55246h == null || list == null || !m78777a(list) || c18103a7.m77855e() != C18135cb.f54499a || !m78787a(c18103a7.m77862l())) {
            return false;
        }
        try {
            c18103a7.m77849a().m78566a(c18103a7.m77862l().m79929h(), mo78781a().m79563d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m78787a(C18416x7 c18416x7) {
        if (c18416x7.m79935n() != this.f55241c.m78766a().m77862l().m79935n()) {
            return false;
        }
        if (c18416x7.m79929h().equals(this.f55241c.m78766a().m77862l().m79929h())) {
            return true;
        }
        return this.f55244f != null && C18135cb.f54499a.m78151a(c18416x7.m79929h(), (X509Certificate) this.f55244f.m79563d().get(0));
    }

    /* JADX INFO: renamed from: a */
    private boolean m78777a(List<C18216i8> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C18216i8 c18216i8 = list.get(i);
            Proxy.Type type = c18216i8.m78767b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f55241c.m78767b().type() == type2 && this.f55241c.m78769d().equals(c18216i8.m78769d())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m78788a(boolean z) {
        if (this.f55243e.isClosed() || this.f55243e.isInputShutdown() || this.f55243e.isOutputShutdown()) {
            return false;
        }
        C18176fa c18176fa = this.f55246h;
        if (c18176fa != null) {
            return c18176fa.m78475j(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.f55243e.getSoTimeout();
                try {
                    this.f55243e.setSoTimeout(1);
                    return !this.f55247i.mo78389f();
                } finally {
                    this.f55243e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }
}
