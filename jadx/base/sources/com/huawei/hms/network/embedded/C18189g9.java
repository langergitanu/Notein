package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18273m9;
import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.g9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18189g9 {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ boolean f54951l = true;

    /* JADX INFO: renamed from: a */
    public final C18287n9 f54952a;

    /* JADX INFO: renamed from: b */
    public final C18103a7 f54953b;

    /* JADX INFO: renamed from: c */
    public final C18231j9 f54954c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC18159e7 f54955d;

    /* JADX INFO: renamed from: e */
    public final AbstractC18338r7 f54956e;

    /* JADX INFO: renamed from: f */
    public C18273m9.a f54957f;

    /* JADX INFO: renamed from: g */
    public final C18273m9 f54958g;

    /* JADX INFO: renamed from: h */
    public C18217i9 f54959h;

    /* JADX INFO: renamed from: i */
    public boolean f54960i;

    /* JADX INFO: renamed from: j */
    public C18216i8 f54961j;

    /* JADX INFO: renamed from: k */
    public int f54962k;

    public C18189g9(C18287n9 c18287n9, C18231j9 c18231j9, C18103a7 c18103a7, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) {
        this.f54952a = c18287n9;
        this.f54954c = c18231j9;
        this.f54953b = c18103a7;
        this.f54955d = interfaceC18159e7;
        this.f54956e = abstractC18338r7;
        this.f54958g = new C18273m9(c18103a7, c18231j9.routeDatabase, interfaceC18159e7, abstractC18338r7).m79171a(c18287n9.getRequest());
        this.f54962k = 0;
    }

    /* JADX INFO: renamed from: f */
    private boolean m78614f() {
        C18217i9 c18217i9 = this.f54952a.f55787i;
        return c18217i9 != null && c18217i9.f55250l == 0 && C18313p8.m79383a(c18217i9.mo78789b().m78766a().m77862l(), this.f54953b.m77862l());
    }

    /* JADX INFO: renamed from: a */
    public C18217i9 m78615a() {
        if (f54951l || Thread.holdsLock(this.f54954c)) {
            return this.f54959h;
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: b */
    public C18273m9.a m78618b() {
        return this.f54957f;
    }

    /* JADX INFO: renamed from: c */
    public boolean m78619c() {
        boolean z;
        synchronized (this.f54954c) {
            try {
                z = true;
                if (this.f54961j == null) {
                    if (m78614f()) {
                        this.f54961j = this.f54952a.f55787i.mo78789b();
                    } else {
                        C18273m9.a aVar = this.f54957f;
                        if ((aVar == null || !aVar.m79184f()) && !this.f54958g.m79172a()) {
                            z = false;
                        }
                    }
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public boolean m78620d() {
        boolean z;
        synchronized (this.f54954c) {
            z = this.f54960i;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public void m78621e() {
        if (!f54951l && Thread.holdsLock(this.f54954c)) {
            throw new AssertionError();
        }
        synchronized (this.f54954c) {
            this.f54960i = true;
        }
    }

    public C18189g9(C18287n9 c18287n9, C18231j9 c18231j9, C18103a7 c18103a7, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7, int i) {
        this(c18287n9, c18231j9, c18103a7, interfaceC18159e7, abstractC18338r7);
        this.f54962k = i;
    }

    /* JADX INFO: renamed from: a */
    private C18217i9 m78612a(int i, int i2, int i3, int i4, boolean z) throws Throwable {
        C18217i9 c18217i9;
        Socket socketMo78790c;
        Socket socketReleaseConnectionNoEvents;
        C18217i9 c18217i92;
        boolean z2;
        C18216i8 c18216i8M79185g;
        boolean z3;
        List<C18216i8> listM79182d;
        C18217i9 c18217i93;
        C18273m9.a aVar;
        synchronized (this.f54954c) {
            try {
                if (this.f54952a.isCanceled()) {
                    throw new IOException("Canceled");
                }
                this.f54960i = false;
                C18287n9 c18287n9 = this.f54952a;
                c18217i9 = c18287n9.f55787i;
                socketMo78790c = null;
                socketReleaseConnectionNoEvents = (c18217i9 == null || !c18217i9.f55249k) ? null : c18287n9.releaseConnectionNoEvents();
                C18287n9 c18287n92 = this.f54952a;
                c18217i92 = c18287n92.f55787i;
                if (c18217i92 != null) {
                    c18217i9 = null;
                } else {
                    c18217i92 = null;
                }
                if (c18217i92 != null) {
                    z2 = false;
                    c18216i8M79185g = null;
                } else if (this.f54954c.m78899a(this.f54953b, c18287n92, null, false)) {
                    c18217i92 = this.f54952a.f55787i;
                    c18216i8M79185g = null;
                    z2 = true;
                } else {
                    c18216i8M79185g = this.f54961j;
                    if (c18216i8M79185g != null) {
                        this.f54961j = null;
                    } else {
                        if (m78614f()) {
                            c18216i8M79185g = this.f54952a.f55787i.mo78789b();
                        }
                        z2 = false;
                        c18216i8M79185g = null;
                    }
                    z2 = false;
                }
            } finally {
            }
        }
        C18313p8.m79381a(socketReleaseConnectionNoEvents);
        if (c18217i9 != null) {
            this.f54956e.connectionReleased(this.f54955d, c18217i9);
        }
        if (z2) {
            this.f54956e.connectionAcquired(this.f54955d, c18217i92);
        }
        if (c18217i92 != null) {
            this.f54957f = this.f54952a.f55787i.m78793f();
            return c18217i92;
        }
        if (c18216i8M79185g != null || ((aVar = this.f54957f) != null && aVar.m79184f())) {
            z3 = false;
        } else {
            this.f54957f = this.f54958g.m79173b();
            z3 = true;
        }
        synchronized (this.f54954c) {
            try {
                if (this.f54952a.isCanceled()) {
                    throw new IOException("Canceled");
                }
                if (z3) {
                    listM79182d = this.f54957f.m79182d();
                    if (this.f54954c.m78899a(this.f54953b, this.f54952a, listM79182d, false)) {
                        c18217i92 = this.f54952a.f55787i;
                        z2 = true;
                    }
                } else {
                    listM79182d = null;
                }
                if (!z2) {
                    if (c18216i8M79185g == null) {
                        c18216i8M79185g = this.f54957f.m79185g();
                    }
                    c18217i92 = new C18217i9(this.f54954c, c18216i8M79185g);
                    c18217i92.m78783a(this.f54957f);
                    if (this.f54957f.m79178a()) {
                        c18217i92.m78785a(this.f54957f.m79179b(), this.f54962k);
                    }
                    this.f54959h = c18217i92;
                }
                c18217i93 = c18217i92;
            } finally {
            }
        }
        if (!z2) {
            c18217i93.m78782a(i, i2, i3, i4, z, this.f54955d, this.f54956e);
            this.f54957f.m79175a(c18217i93.mo78789b());
            synchronized (this.f54954c) {
                try {
                    this.f54959h = null;
                    if (this.f54954c.m78899a(this.f54953b, this.f54952a, listM79182d, true)) {
                        c18217i93.f55249k = true;
                        socketMo78790c = c18217i93.mo78790c();
                        c18217i93 = this.f54952a.f55787i;
                        this.f54961j = c18216i8M79185g;
                    } else {
                        this.f54954c.m78905c(c18217i93);
                        this.f54952a.acquireConnectionNoEvents(c18217i93);
                    }
                } finally {
                }
            }
            C18313p8.m79381a(socketMo78790c);
        }
        this.f54956e.connectionAcquired(this.f54955d, c18217i93);
        return c18217i93;
    }

    /* JADX INFO: renamed from: a */
    private C18217i9 m78613a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            C18217i9 c18217i9M78612a = m78612a(i, i2, i3, i4, z);
            boolean z3 = z;
            int i5 = i4;
            int i6 = i3;
            int i7 = i2;
            int i8 = i;
            synchronized (this.f54954c) {
                try {
                    if (c18217i9M78612a.f55251m == 0 && !c18217i9M78612a.m78794g()) {
                        return c18217i9M78612a;
                    }
                    if (c18217i9M78612a.m78788a(z2)) {
                        return c18217i9M78612a;
                    }
                    c18217i9M78612a.m78795h();
                    i = i8;
                    i2 = i7;
                    i3 = i6;
                    i4 = i5;
                    z = z3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC18327q9 m78616a(C18118b8 c18118b8, InterfaceC18429y7.a aVar, boolean z) {
        try {
            C18217i9 c18217i9M78613a = m78613a(aVar.mo79651d(), aVar.mo79649c(), aVar.mo79647b(), c18118b8.m77959t(), c18118b8.m77965z(), z);
            if (c18217i9M78613a.m78794g() && c18217i9M78613a.f55251m == 0) {
                C18416x7 c18416x7M78310k = this.f54952a.getRequest().m78310k();
                c18118b8.m77938a(c18416x7M78310k.m79929h(), c18416x7M78310k.m79935n(), c18416x7M78310k.m79940s());
            }
            return c18217i9M78613a.m78780a(c18118b8, aVar);
        } catch (C18259l9 e) {
            m78621e();
            throw e;
        } catch (IOException e2) {
            m78621e();
            throw new C18259l9(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78617a(C18118b8 c18118b8, C18160e8 c18160e8) throws IOException {
        C18217i9 c18217i9;
        C18273m9.a aVar;
        int iM77944e = c18118b8.m77944e();
        int iM77964y = c18118b8.m77964y();
        int iM77934C = c18118b8.m77934C();
        int iM77959t = c18118b8.m77959t();
        boolean zM77965z = c18118b8.m77965z();
        if (!c18160e8.m78305f()) {
            throw new IllegalArgumentException("a normal Request without http2ConnectionIndex");
        }
        if (Integer.parseInt(c18160e8.m78298a("Http2ConnectionIndex")) > this.f54954c.m78893a(this.f54953b)) {
            if (this.f54961j == null && ((aVar = this.f54957f) == null || !aVar.m79184f())) {
                this.f54957f = this.f54958g.m79173b();
            }
            synchronized (this.f54954c) {
                try {
                    C18216i8 c18216i8M79185g = this.f54957f.m79185g();
                    this.f54961j = c18216i8M79185g;
                    c18217i9 = new C18217i9(this.f54954c, c18216i8M79185g);
                    if (this.f54957f.m79178a()) {
                        c18217i9.m78785a(this.f54957f.m79179b(), this.f54962k);
                        c18217i9.m78783a(this.f54957f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c18217i9.m78782a(iM77944e, iM77964y, iM77934C, iM77959t, zM77965z, this.f54955d, this.f54956e);
            this.f54957f.m79175a(c18217i9.mo78789b());
            c18217i9.f55262x = System.nanoTime();
            synchronized (this.f54954c) {
                this.f54954c.m78905c(c18217i9);
            }
        }
    }
}
