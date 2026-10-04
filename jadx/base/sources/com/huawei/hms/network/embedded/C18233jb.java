package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.jb */
/* JADX INFO: loaded from: classes9.dex */
public class C18233jb extends C18248kc {

    /* JADX INFO: renamed from: h */
    public static final int f55367h = 65536;

    /* JADX INFO: renamed from: i */
    public static final long f55368i;

    /* JADX INFO: renamed from: j */
    public static final long f55369j;

    /* JADX INFO: renamed from: k */
    public static C18233jb f55370k;

    /* JADX INFO: renamed from: e */
    public boolean f55371e;

    /* JADX INFO: renamed from: f */
    public C18233jb f55372f;

    /* JADX INFO: renamed from: g */
    public long f55373g;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.jb$a */
    public class a implements InterfaceC18220ic {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC18220ic f55374a;

        public a(InterfaceC18220ic interfaceC18220ic) {
            this.f55374a = interfaceC18220ic;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        /* JADX INFO: renamed from: b */
        public void mo78029b(C18261lb c18261lb, long j) throws IOException {
            C18276mc.m79202a(c18261lb.f55631b, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                C18178fc c18178fc = c18261lb.f55630a;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (c18178fc.f54867c - c18178fc.f54866b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    c18178fc = c18178fc.f54870f;
                }
                C18233jb.this.m78929g();
                try {
                    try {
                        this.f55374a.mo78029b(c18261lb, j2);
                        j -= j2;
                        C18233jb.this.m78928a(true);
                    } catch (IOException e) {
                        throw C18233jb.this.m78927a(e);
                    }
                } catch (Throwable th) {
                    C18233jb.this.m78928a(false);
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C18233jb.this.m78929g();
            try {
                try {
                    this.f55374a.close();
                    C18233jb.this.m78928a(true);
                } catch (IOException e) {
                    throw C18233jb.this.m78927a(e);
                }
            } catch (Throwable th) {
                C18233jb.this.m78928a(false);
                throw th;
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
        public void flush() throws IOException {
            C18233jb.this.m78929g();
            try {
                try {
                    this.f55374a.flush();
                    C18233jb.this.m78928a(true);
                } catch (IOException e) {
                    throw C18233jb.this.m78927a(e);
                }
            } catch (Throwable th) {
                C18233jb.this.m78928a(false);
                throw th;
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        public C18248kc timeout() {
            return C18233jb.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f55374a + ")";
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.jb$b */
    public class b implements InterfaceC18234jc {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC18234jc f55376a;

        public b(InterfaceC18234jc interfaceC18234jc) {
            this.f55376a = interfaceC18234jc;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            C18233jb.this.m78929g();
            try {
                try {
                    long jMo77914c = this.f55376a.mo77914c(c18261lb, j);
                    C18233jb.this.m78928a(true);
                    return jMo77914c;
                } catch (IOException e) {
                    throw C18233jb.this.m78927a(e);
                }
            } catch (Throwable th) {
                C18233jb.this.m78928a(false);
                throw th;
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C18233jb.this.m78929g();
            try {
                try {
                    this.f55376a.close();
                    C18233jb.this.m78928a(true);
                } catch (IOException e) {
                    throw C18233jb.this.m78927a(e);
                }
            } catch (Throwable th) {
                C18233jb.this.m78928a(false);
                throw th;
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        public C18248kc timeout() {
            return C18233jb.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f55376a + ")";
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.jb$c */
    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r1.mo78828i();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            while (true) {
                synchronized (C18233jb.class) {
                    try {
                        C18233jb c18233jbM78924j = C18233jb.m78924j();
                        if (c18233jbM78924j != null) {
                            if (c18233jbM78924j == C18233jb.f55370k) {
                                C18233jb.f55370k = null;
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f55368i = millis;
        f55369j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: b */
    private long m78923b(long j) {
        return this.f55373g - j;
    }

    /* JADX INFO: renamed from: j */
    public static C18233jb m78924j() throws InterruptedException {
        C18233jb c18233jb = f55370k.f55372f;
        long jNanoTime = System.nanoTime();
        if (c18233jb == null) {
            C18233jb.class.wait(f55368i);
            if (f55370k.f55372f != null || System.nanoTime() - jNanoTime < f55369j) {
                return null;
            }
            return f55370k;
        }
        long jM78923b = c18233jb.m78923b(jNanoTime);
        if (jM78923b > 0) {
            long j = jM78923b / 1000000;
            C18233jb.class.wait(j, (int) (jM78923b - (1000000 * j)));
            return null;
        }
        f55370k.f55372f = c18233jb.f55372f;
        c18233jb.f55372f = null;
        return c18233jb;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC18220ic m78925a(InterfaceC18220ic interfaceC18220ic) {
        return new a(interfaceC18220ic);
    }

    /* JADX INFO: renamed from: g */
    public final void m78929g() {
        if (this.f55371e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jMo79003f = mo79003f();
        boolean zMo79001d = mo79001d();
        if (jMo79003f != 0 || zMo79001d) {
            this.f55371e = true;
            m78921a(this, jMo79003f, zMo79001d);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m78930h() {
        if (!this.f55371e) {
            return false;
        }
        this.f55371e = false;
        return m78922a(this);
    }

    /* JADX INFO: renamed from: i */
    public void mo78828i() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC18234jc m78926a(InterfaceC18234jc interfaceC18234jc) {
        return new b(interfaceC18234jc);
    }

    /* JADX INFO: renamed from: b */
    public IOException mo78827b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: a */
    public final IOException m78927a(IOException iOException) throws IOException {
        return !m78930h() ? iOException : mo78827b(iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x0019, B:12:0x0025, B:13:0x002e, B:18:0x003d, B:19:0x0043, B:21:0x0047, B:24:0x0050, B:25:0x0053, B:27:0x005d, B:17:0x0037, B:30:0x0064, B:31:0x0069), top: B:34:0x0003 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void m78921a(C18233jb c18233jb, long j, boolean z) {
        C18233jb c18233jb2;
        C18233jb c18233jb3;
        try {
            if (f55370k == null) {
                f55370k = new C18233jb();
                new c().start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z) {
                j = Math.min(j, c18233jb.mo79000c() - jNanoTime);
            } else if (j == 0) {
                if (!z) {
                    throw new AssertionError();
                }
                c18233jb.f55373g = c18233jb.mo79000c();
                long jM78923b = c18233jb.m78923b(jNanoTime);
                c18233jb2 = f55370k;
                while (true) {
                    c18233jb3 = c18233jb2.f55372f;
                    if (c18233jb3 != null || jM78923b < c18233jb3.m78923b(jNanoTime)) {
                        break;
                    } else {
                        c18233jb2 = c18233jb2.f55372f;
                    }
                }
                c18233jb.f55372f = c18233jb2.f55372f;
                c18233jb2.f55372f = c18233jb;
                if (c18233jb2 == f55370k) {
                    C18233jb.class.notify();
                }
            }
            c18233jb.f55373g = j + jNanoTime;
            long jM78923b2 = c18233jb.m78923b(jNanoTime);
            c18233jb2 = f55370k;
            while (true) {
                c18233jb3 = c18233jb2.f55372f;
                if (c18233jb3 != null) {
                    break;
                    break;
                }
                c18233jb2 = c18233jb2.f55372f;
            }
            c18233jb.f55372f = c18233jb2.f55372f;
            c18233jb2.f55372f = c18233jb;
            if (c18233jb2 == f55370k) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m78928a(boolean z) throws IOException {
        if (m78930h() && z) {
            throw mo78827b((IOException) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m78922a(C18233jb c18233jb) {
        C18233jb c18233jb2 = f55370k;
        while (c18233jb2 != null) {
            C18233jb c18233jb3 = c18233jb2.f55372f;
            if (c18233jb3 == c18233jb) {
                c18233jb2.f55372f = c18233jb.f55372f;
                c18233jb.f55372f = null;
                return false;
            }
            c18233jb2 = c18233jb3;
        }
        return true;
    }
}
