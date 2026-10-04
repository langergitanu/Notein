package com.huawei.hms.network.embedded;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.d8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18146d8 implements InterfaceC18159e7 {

    /* JADX INFO: renamed from: a */
    public final C18118b8 f54554a;

    /* JADX INFO: renamed from: b */
    public C18287n9 f54555b;

    /* JADX INFO: renamed from: c */
    public final C18160e8 f54556c;

    /* JADX INFO: renamed from: d */
    public final boolean f54557d;

    /* JADX INFO: renamed from: e */
    public boolean f54558e;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.d8$a */
    public final class a extends AbstractRunnableC18300o8 {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ boolean f54559f = true;

        /* JADX INFO: renamed from: b */
        public final InterfaceC18173f7 f54560b;

        /* JADX INFO: renamed from: c */
        public boolean f54561c;

        /* JADX INFO: renamed from: d */
        public volatile AtomicInteger f54562d;

        public a(InterfaceC18173f7 interfaceC18173f7) {
            super("OkHttp %s", C18146d8.this.m78216c());
            this.f54561c = false;
            this.f54562d = new AtomicInteger(0);
            this.f54560b = interfaceC18173f7;
        }

        /* JADX INFO: renamed from: a */
        public void m78218a(a aVar) {
            this.f54562d = aVar.f54562d;
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() {
            C18146d8.this.f54555b.timeoutEnter();
            boolean z = false;
            try {
                try {
                    try {
                        this.f54560b.onResponse(C18146d8.this, this.f54561c ? C18146d8.this.m78214a() : C18146d8.this.m78215b());
                        C18146d8.this.f54554a.m77949j().mo79353b(this);
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            C18406wa.m79845f().mo79425a(4, "Callback failure for " + C18146d8.this.m78217d(), e);
                        } else {
                            this.f54560b.onFailure(C18146d8.this, e);
                        }
                        C18146d8.this.f54554a.m77949j().mo79353b(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        C18146d8.this.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.addSuppressed(th);
                            this.f54560b.onFailure(C18146d8.this, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    C18146d8.this.f54554a.m77949j().mo79353b(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: renamed from: c */
        public AtomicInteger m78221c() {
            return this.f54562d;
        }

        /* JADX INFO: renamed from: d */
        public C18118b8 m78222d() {
            return C18146d8.this.f54554a;
        }

        /* JADX INFO: renamed from: e */
        public boolean m78223e() {
            return this.f54561c;
        }

        /* JADX INFO: renamed from: f */
        public C18146d8 m78224f() {
            return C18146d8.this;
        }

        /* JADX INFO: renamed from: g */
        public String m78225g() {
            return C18146d8.this.f54556c.m78310k().m79929h();
        }

        /* JADX INFO: renamed from: h */
        public C18160e8 m78226h() {
            return C18146d8.this.f54556c;
        }

        /* JADX INFO: renamed from: i */
        public void m78227i() {
            this.f54561c = true;
        }

        /* JADX INFO: renamed from: a */
        public void m78219a(ExecutorService executorService) {
            if (!f54559f && Thread.holdsLock(C18146d8.this.f54554a.m77949j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    C18146d8.this.f54555b.noMoreExchanges(interruptedIOException);
                    this.f54560b.onFailure(C18146d8.this, interruptedIOException);
                    C18146d8.this.f54554a.m77949j().mo79353b(this);
                }
            } catch (Throwable th) {
                C18146d8.this.f54554a.m77949j().mo79353b(this);
                throw th;
            }
        }
    }

    public C18146d8(C18118b8 c18118b8, C18160e8 c18160e8, boolean z) {
        this.f54554a = c18118b8;
        this.f54556c = c18160e8;
        this.f54557d = z;
    }

    /* JADX INFO: renamed from: a */
    public static C18146d8 m78212a(C18118b8 c18118b8, C18160e8 c18160e8, boolean z) {
        C18146d8 c18146d8 = new C18146d8(c18118b8, c18160e8, z);
        c18146d8.f54555b = new C18287n9(c18118b8, c18146d8);
        return c18146d8;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C18188g8 m78215b() throws Throwable {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f54554a.m77955p());
        arrayList.add(new C18418x9(this.f54554a));
        arrayList.add(new C18301o9(this.f54554a.m77948i()));
        arrayList.add(new C18352s8(this.f54554a.m77956q()));
        arrayList.add(new C18147d9(this.f54554a));
        if (!this.f54557d) {
            arrayList.addAll(this.f54554a.m77957r());
        }
        arrayList.add(new C18314p9(this.f54557d));
        try {
            C18188g8 c18188g8Mo79643a = new C18379u9(arrayList, this.f54555b, null, 0, this.f54556c, this, this.f54554a.m77944e(), this.f54554a.m77964y(), this.f54554a.m77934C()).mo79643a(this.f54556c);
            if (this.f54555b.isCanceled()) {
                C18313p8.m79378a(c18188g8Mo79643a);
                throw new IOException("Canceled");
            }
            this.f54555b.noMoreExchanges(null);
            return c18188g8Mo79643a;
        } catch (IOException e) {
            try {
                throw this.f54555b.noMoreExchanges(e);
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f54555b.noMoreExchanges(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m78216c() {
        return this.f54556c.m78310k().m79939r();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public void cancel() {
        this.f54555b.cancel();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C18146d8 m80714clone() {
        return m78212a(this.f54554a, this.f54556c, this.f54557d);
    }

    /* JADX INFO: renamed from: d */
    public String m78217d() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f54557d ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(m78216c());
        return sb.toString();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public void enqueue(InterfaceC18173f7 interfaceC18173f7) {
        synchronized (this) {
            if (this.f54558e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f54558e = true;
        }
        this.f54555b.callStart();
        this.f54554a.m77949j().mo79350a(new a(interfaceC18173f7));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public C18188g8 execute() throws IOException {
        synchronized (this) {
            if (this.f54558e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f54558e = true;
        }
        this.f54555b.timeoutEnter();
        this.f54555b.callStart();
        try {
            this.f54554a.m77949j().mo79351a(this);
            return m78215b();
        } finally {
            this.f54554a.m77949j().mo79354b(this);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public boolean isCanceled() {
        return this.f54555b.isCanceled();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public synchronized boolean isExecuted() {
        return this.f54558e;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public C18160e8 request() {
        return this.f54556c;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public C18248kc timeout() {
        return this.f54555b.timeout();
    }

    /* JADX INFO: renamed from: a */
    public C18188g8 m78214a() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C18418x9(this.f54554a));
        arrayList.add(new C18203h9(this.f54554a));
        return new C18379u9(arrayList, this.f54555b, null, 0, this.f54556c, this, this.f54554a.m77944e(), this.f54554a.m77964y(), this.f54554a.m77934C()).mo79643a(this.f54556c);
    }
}
