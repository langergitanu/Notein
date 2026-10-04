package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18273m9;
import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.n9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18287n9 {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ boolean f55778q = true;

    /* JADX INFO: renamed from: a */
    public final C18118b8 f55779a;

    /* JADX INFO: renamed from: b */
    public final C18231j9 f55780b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC18159e7 f55781c;

    /* JADX INFO: renamed from: d */
    public final AbstractC18338r7 f55782d;

    /* JADX INFO: renamed from: e */
    public final C18233jb f55783e;

    /* JADX INFO: renamed from: f */
    public Object f55784f;

    /* JADX INFO: renamed from: g */
    public C18160e8 f55785g;

    /* JADX INFO: renamed from: h */
    public C18189g9 f55786h;

    /* JADX INFO: renamed from: i */
    public C18217i9 f55787i;

    /* JADX INFO: renamed from: j */
    public C18175f9 f55788j;

    /* JADX INFO: renamed from: k */
    public boolean f55789k;

    /* JADX INFO: renamed from: l */
    public boolean f55790l;

    /* JADX INFO: renamed from: m */
    public boolean f55791m;

    /* JADX INFO: renamed from: n */
    public boolean f55792n;

    /* JADX INFO: renamed from: o */
    public boolean f55793o;

    /* JADX INFO: renamed from: p */
    public final int f55794p;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.n9$a */
    public class a extends C18233jb {
        public a() {
        }

        @Override // com.huawei.hms.network.embedded.C18233jb
        /* JADX INFO: renamed from: i */
        public void mo78828i() {
            C18287n9.this.cancel();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.n9$b */
    public static final class b extends WeakReference<C18287n9> {

        /* JADX INFO: renamed from: a */
        public final Object f55796a;

        public b(C18287n9 c18287n9, Object obj) {
            super(c18287n9);
            this.f55796a = obj;
        }
    }

    public C18287n9(C18118b8 c18118b8, InterfaceC18159e7 interfaceC18159e7) {
        a aVar = new a();
        this.f55783e = aVar;
        this.f55779a = c18118b8;
        this.f55780b = AbstractC18286n8.f55777a.mo77969a(c18118b8.m77946g());
        this.f55781c = interfaceC18159e7;
        this.f55782d = c18118b8.m77951l().create(interfaceC18159e7);
        aVar.mo78999b(c18118b8.m77941c(), TimeUnit.MILLISECONDS);
        this.f55794p = c18118b8.m77945f();
    }

    private C18103a7 createAddress(C18416x7 c18416x7) {
        SSLSocketFactory sSLSocketFactoryM77933B;
        HostnameVerifier hostnameVerifierM77954o;
        C18187g7 c18187g7M77943d;
        if (c18416x7.m79930i()) {
            sSLSocketFactoryM77933B = this.f55779a.m77933B();
            hostnameVerifierM77954o = this.f55779a.m77954o();
            c18187g7M77943d = this.f55779a.m77943d();
        } else {
            sSLSocketFactoryM77933B = null;
            hostnameVerifierM77954o = null;
            c18187g7M77943d = null;
        }
        return new C18103a7(c18416x7.m79929h(), c18416x7.m79935n(), this.f55779a.m77950k(), this.f55779a.m77932A(), sSLSocketFactoryM77933B, hostnameVerifierM77954o, c18187g7M77943d, this.f55779a.m77962w(), this.f55779a.m77961v(), this.f55779a.m77960u(), this.f55779a.m77947h(), this.f55779a.m77963x());
    }

    private IOException maybeReleaseConnection(IOException iOException, boolean z) {
        C18217i9 c18217i9;
        Socket socketReleaseConnectionNoEvents;
        boolean z2;
        synchronized (this.f55780b) {
            if (z) {
                try {
                    if (this.f55788j != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c18217i9 = this.f55787i;
            socketReleaseConnectionNoEvents = (c18217i9 != null && this.f55788j == null && (z || this.f55793o)) ? releaseConnectionNoEvents() : null;
            if (this.f55787i != null) {
                c18217i9 = null;
            }
            z2 = this.f55793o && this.f55788j == null;
        }
        C18313p8.m79381a(socketReleaseConnectionNoEvents);
        if (c18217i9 != null) {
            this.f55782d.connectionReleased(this.f55781c, c18217i9);
        }
        if (z2) {
            boolean z3 = iOException != null;
            iOException = timeoutExit(iOException);
            AbstractC18338r7 abstractC18338r7 = this.f55782d;
            InterfaceC18159e7 interfaceC18159e7 = this.f55781c;
            if (z3) {
                abstractC18338r7.callFailed(interfaceC18159e7, iOException);
                return iOException;
            }
            abstractC18338r7.callEnd(interfaceC18159e7);
        }
        return iOException;
    }

    private IOException timeoutExit(IOException iOException) {
        if (this.f55792n || !this.f55783e.m78930h()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void acquireConnectionNoEvents(C18217i9 c18217i9) {
        if (!f55778q && !Thread.holdsLock(this.f55780b)) {
            throw new AssertionError();
        }
        if (this.f55787i != null) {
            throw new IllegalStateException();
        }
        this.f55787i = c18217i9;
        c18217i9.f55254p.add(new b(this, this.f55784f));
    }

    public void callStart() {
        this.f55784f = C18406wa.m79845f().mo79424a("response.body().close()");
        this.f55782d.callStart(this.f55781c);
    }

    public boolean canRetry() {
        return this.f55786h.m78620d() && this.f55786h.m78619c();
    }

    public void cancel() {
        C18175f9 c18175f9;
        C18217i9 c18217i9M78615a;
        synchronized (this.f55780b) {
            try {
                this.f55791m = true;
                c18175f9 = this.f55788j;
                C18189g9 c18189g9 = this.f55786h;
                c18217i9M78615a = (c18189g9 == null || c18189g9.m78615a() == null) ? this.f55787i : this.f55786h.m78615a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c18175f9 != null) {
            c18175f9.m78424a();
        } else if (c18217i9M78615a != null) {
            c18217i9M78615a.m78792e();
        }
    }

    public void exchangeDoneDueToException() {
        synchronized (this.f55780b) {
            try {
                if (this.f55793o) {
                    throw new IllegalStateException();
                }
                this.f55788j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public IOException exchangeMessageDone(C18175f9 c18175f9, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        synchronized (this.f55780b) {
            try {
                C18175f9 c18175f92 = this.f55788j;
                if (c18175f9 != c18175f92) {
                    return iOException;
                }
                boolean z4 = true;
                if (z) {
                    z3 = !this.f55789k;
                    this.f55789k = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (!this.f55790l) {
                        z3 = true;
                    }
                    this.f55790l = true;
                }
                if (this.f55789k && this.f55790l && z3) {
                    c18175f92.m78427b().f55251m++;
                    this.f55788j = null;
                } else {
                    z4 = false;
                }
                return z4 ? maybeReleaseConnection(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C18189g9 getExchangeFinder() {
        return this.f55786h;
    }

    public C18160e8 getRequest() {
        return this.f55785g;
    }

    public C18273m9.a getSelection() {
        return this.f55786h.m78618b();
    }

    public boolean hasExchange() {
        boolean z;
        synchronized (this.f55780b) {
            z = this.f55788j != null;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.f55780b) {
            z = this.f55791m;
        }
        return z;
    }

    public C18175f9 newExchange(InterfaceC18429y7.a aVar, boolean z) throws Throwable {
        synchronized (this.f55780b) {
            try {
                try {
                    if (this.f55793o) {
                        throw new IllegalStateException("released");
                    }
                    if (this.f55788j != null) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                    C18175f9 c18175f9 = new C18175f9(this, this.f55781c, this.f55782d, this.f55786h, this.f55786h.m78616a(this.f55779a, aVar, z));
                    synchronized (this.f55780b) {
                        this.f55788j = c18175f9;
                        this.f55789k = false;
                        this.f55790l = false;
                    }
                    return c18175f9;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public IOException noMoreExchanges(IOException iOException) {
        synchronized (this.f55780b) {
            this.f55793o = true;
        }
        return maybeReleaseConnection(iOException, false);
    }

    public void prepareToConnect(C18160e8 c18160e8) {
        C18160e8 c18160e82 = this.f55785g;
        if (c18160e82 != null) {
            if (C18313p8.m79383a(c18160e82.m78310k(), c18160e8.m78310k()) && this.f55786h.m78619c()) {
                return;
            }
            if (this.f55788j != null) {
                throw new IllegalStateException();
            }
            if (this.f55786h != null) {
                maybeReleaseConnection(null, true);
                this.f55786h = null;
            }
        }
        this.f55785g = c18160e8;
        C18189g9 c18189g9 = new C18189g9(this, this.f55780b, createAddress(c18160e8.m78310k()), this.f55781c, this.f55782d, this.f55794p);
        this.f55786h = c18189g9;
        c18189g9.f54953b.m77850a(c18160e8.m78298a("host"));
    }

    public Socket releaseConnectionNoEvents() {
        if (!f55778q && !Thread.holdsLock(this.f55780b)) {
            throw new AssertionError();
        }
        int size = this.f55787i.f55254p.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.f55787i.f55254p.get(i).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException();
        }
        C18217i9 c18217i9 = this.f55787i;
        c18217i9.f55254p.remove(i);
        this.f55787i = null;
        if (c18217i9.f55254p.isEmpty()) {
            c18217i9.f55255q = System.nanoTime();
            if (this.f55780b.m78902b(c18217i9)) {
                return c18217i9.mo78790c();
            }
        }
        return null;
    }

    public C18248kc timeout() {
        return this.f55783e;
    }

    public void timeoutEarlyExit() {
        if (this.f55792n) {
            throw new IllegalStateException();
        }
        this.f55792n = true;
        this.f55783e.m78930h();
    }

    public void timeoutEnter() {
        this.f55783e.m78929g();
    }
}
