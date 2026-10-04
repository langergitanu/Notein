package com.huawei.hms.drive;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import oOo00OoO.C34523OooO0OO;

/* JADX INFO: renamed from: com.huawei.hms.drive.bg */
/* JADX INFO: loaded from: classes6.dex */
final class C17797bg implements InterfaceC17775al {

    /* JADX INFO: renamed from: a */
    final C17795be f52879a;

    /* JADX INFO: renamed from: b */
    final C17832co f52880b;

    /* JADX INFO: renamed from: c */
    final C34523OooO0OO f52881c;

    /* JADX INFO: renamed from: d */
    final C17798bh f52882d;

    /* JADX INFO: renamed from: e */
    final boolean f52883e;

    /* JADX INFO: renamed from: f */
    private AbstractC17786aw f52884f;

    /* JADX INFO: renamed from: g */
    private boolean f52885g;

    /* JADX INFO: renamed from: com.huawei.hms.drive.bg$a */
    public final class a extends AbstractRunnableC17805bo {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ boolean f52887a = true;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C17797bg f52888b;

        /* JADX INFO: renamed from: d */
        private final InterfaceC17776am f52889d;

        /* JADX INFO: renamed from: e */
        private boolean f52890e;

        /* JADX INFO: renamed from: a */
        public String m76254a() {
            return this.f52888b.f52882d.m76261a().m76151f();
        }

        /* JADX INFO: renamed from: b */
        public C17798bh m76256b() {
            return this.f52888b.f52882d;
        }

        /* JADX INFO: renamed from: c */
        public C17797bg m76257c() {
            return this.f52888b;
        }

        /* JADX INFO: renamed from: d */
        public C17795be m76258d() {
            return this.f52888b.f52879a;
        }

        /* JADX INFO: renamed from: e */
        public boolean m76259e() {
            return this.f52890e;
        }

        @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
        /* JADX INFO: renamed from: f */
        public void mo76260f() {
            this.f52888b.f52881c.enter();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    this.f52888b.f52879a.m76215u().mo75944a(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Exception e2) {
                e = e2;
            }
            try {
                this.f52889d.onResponse(this.f52888b, this.f52890e ? this.f52888b.m76253i() : this.f52888b.m76252h());
                this.f52888b.f52879a.m76215u().mo75944a(this);
            } catch (IOException e3) {
                e = e3;
                z = true;
                IOException iOExceptionM76247a = this.f52888b.m76247a(e);
                if (z) {
                    C17858dn.m76756e().mo76729a(4, "Callback failure for " + this.f52888b.m76250f(), iOExceptionM76247a);
                } else {
                    this.f52888b.f52884f.m76051a(this.f52888b, iOExceptionM76247a);
                    this.f52889d.onFailure(this.f52888b, iOExceptionM76247a);
                }
                this.f52888b.f52879a.m76215u().mo75944a(this);
            } catch (Exception e4) {
                e = e4;
                z = true;
                this.f52888b.mo75981c();
                if (z) {
                    C17858dn.m76756e().mo76729a(4, "Callback failure for " + this.f52888b.m76250f(), e);
                } else {
                    this.f52888b.f52884f.m76051a(this.f52888b, new IOException(e));
                    this.f52889d.onFailure(this.f52888b, new IOException(e));
                }
                this.f52888b.f52879a.m76215u().mo75944a(this);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m76255a(ExecutorService executorService) {
            if (!f52887a && Thread.holdsLock(this.f52888b.f52879a.m76215u())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.f52888b.f52884f.m76051a(this.f52888b, interruptedIOException);
                    this.f52889d.onFailure(this.f52888b, interruptedIOException);
                    this.f52888b.f52879a.m76215u().mo75944a(this);
                }
            } catch (Throwable th) {
                this.f52888b.f52879a.m76215u().mo75944a(this);
                throw th;
            }
        }
    }

    private C17797bg(C17795be c17795be, C17798bh c17798bh, boolean z) {
        this.f52879a = c17795be;
        this.f52882d = c17798bh;
        this.f52883e = z;
        this.f52880b = new C17832co(c17795be, z);
        C34523OooO0OO c34523OooO0OO = new C34523OooO0OO() { // from class: com.huawei.hms.drive.bg.1
            @Override // oOo00OoO.C34523OooO0OO
            public void timedOut() {
                C17797bg.this.mo75981c();
            }
        };
        this.f52881c = c34523OooO0OO;
        c34523OooO0OO.timeout(c17795be.m76192a(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: j */
    private void m76246j() {
        this.f52880b.m76512a(C17858dn.m76756e().mo76728a("response.body().close()"));
    }

    @Override // com.huawei.hms.drive.InterfaceC17775al
    /* JADX INFO: renamed from: b */
    public C17800bj mo75980b() throws IOException {
        synchronized (this) {
            if (this.f52885g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f52885g = true;
        }
        m76246j();
        this.f52881c.enter();
        this.f52884f.m76045a(this);
        try {
            try {
                this.f52879a.m76215u().mo75945a(this);
                C17800bj c17800bjM76252h = m76252h();
                if (c17800bjM76252h != null) {
                    return c17800bjM76252h;
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException iOExceptionM76247a = m76247a(e);
                this.f52884f.m76051a(this, iOExceptionM76247a);
                throw iOExceptionM76247a;
            } catch (Exception e2) {
                this.f52884f.m76051a(this, new IOException(e2));
                throw new IOException(e2);
            }
        } finally {
            this.f52879a.m76215u().mo75947b(this);
        }
    }

    @Override // com.huawei.hms.drive.InterfaceC17775al
    /* JADX INFO: renamed from: c */
    public void mo75981c() {
        this.f52880b.m76511a();
    }

    /* JADX INFO: renamed from: d */
    public boolean m76248d() {
        return this.f52880b.m76513b();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C17797bg clone() {
        return m76245a(this.f52879a, this.f52882d, this.f52883e);
    }

    /* JADX INFO: renamed from: f */
    public String m76250f() {
        StringBuilder sb = new StringBuilder();
        sb.append(m76248d() ? "canceled " : "");
        sb.append(this.f52883e ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(m76251g());
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public String m76251g() {
        return this.f52882d.m76261a().m76158m();
    }

    /* JADX INFO: renamed from: h */
    public C17800bj m76252h() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f52879a.m76219y());
        arrayList.add(this.f52880b);
        arrayList.add(new C17823cf(this.f52879a.m76202h()));
        arrayList.add(new C17808br(this.f52879a.m76203i()));
        arrayList.add(new C17814bx(this.f52879a));
        if (!this.f52883e) {
            arrayList.addAll(this.f52879a.m76220z());
        }
        arrayList.add(new C17824cg(this.f52883e));
        C17800bj c17800bjMo76182a = new C17829cl(arrayList, null, null, null, 0, this.f52882d, this, this.f52884f, this.f52879a.m76195b(), this.f52879a.m76197c(), this.f52879a.m76198d()).mo76182a(this.f52882d);
        if (!this.f52880b.m76513b()) {
            return c17800bjMo76182a;
        }
        C17806bp.m76338a(c17800bjMo76182a);
        throw new IOException("Canceled");
    }

    /* JADX INFO: renamed from: i */
    public C17800bj m76253i() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f52880b);
        arrayList.add(new C17816bz(this.f52879a));
        return new C17829cl(arrayList, null, null, null, 0, this.f52882d, this, this.f52884f, this.f52879a.m76195b(), this.f52879a.m76197c(), this.f52879a.m76198d()).mo76182a(this.f52882d);
    }

    /* JADX INFO: renamed from: a */
    public static C17797bg m76245a(C17795be c17795be, C17798bh c17798bh, boolean z) {
        C17797bg c17797bg = new C17797bg(c17795be, c17798bh, z);
        c17797bg.f52884f = c17795be.m76191A().mo76065a(c17797bg);
        return c17797bg;
    }

    @Override // com.huawei.hms.drive.InterfaceC17775al
    /* JADX INFO: renamed from: a */
    public C17798bh mo75979a() {
        return this.f52882d;
    }

    /* JADX INFO: renamed from: a */
    public IOException m76247a(IOException iOException) {
        if (!this.f52881c.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
