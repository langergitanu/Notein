package com.huawei.hms.drive;

import com.huawei.hms.drive.C17822ce;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.drive.aq */
/* JADX INFO: loaded from: classes6.dex */
public final class C17780aq {

    /* JADX INFO: renamed from: c */
    static final /* synthetic */ boolean f52696c = true;

    /* JADX INFO: renamed from: d */
    private static final Executor f52697d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C17806bp.m76335a("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: a */
    final C17819cb f52698a;

    /* JADX INFO: renamed from: b */
    boolean f52699b;

    /* JADX INFO: renamed from: e */
    private final int f52700e;

    /* JADX INFO: renamed from: f */
    private final long f52701f;

    /* JADX INFO: renamed from: g */
    private final Runnable f52702g;

    /* JADX INFO: renamed from: h */
    private final Deque<C17818ca> f52703h;

    /* JADX INFO: renamed from: i */
    private final Deque<C17791ba> f52704i;

    /* JADX INFO: renamed from: j */
    private final Deque<WeakReference<a>> f52705j;

    /* JADX INFO: renamed from: com.huawei.hms.drive.aq$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo76009a(String str, int i, String str2);
    }

    public C17780aq() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX INFO: renamed from: c */
    private C17818ca m75997c(C17771ah c17771ah) {
        C17791ba c17791baM75996b = m75996b(c17771ah);
        if (c17791baM75996b != null) {
            return c17791baM75996b.m76130c();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private void m75999d(C17818ca c17818ca) {
        C17791ba c17791baM75996b;
        if (c17818ca == null || !c17818ca.m76426f() || (c17791baM75996b = m75996b(c17818ca.m76422b().m76315a())) == null) {
            return;
        }
        c17791baM75996b.m76128b(c17818ca);
        if (c17791baM75996b.m76129b()) {
            this.f52704i.remove(c17791baM75996b);
            m75998d(c17818ca.m76422b().m76315a());
        }
    }

    /* JADX INFO: renamed from: a */
    public C17818ca m76003a(C17771ah c17771ah, C17822ce c17822ce, C17802bl c17802bl) {
        if (!f52696c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        C17818ca c17818caM75997c = m75997c(c17771ah);
        if (c17818caM75997c != null) {
            c17822ce.m76462a(c17818caM75997c, true);
            return c17818caM75997c;
        }
        for (C17818ca c17818ca : this.f52703h) {
            if (c17818ca.m76419a(c17771ah, c17802bl)) {
                c17822ce.m76462a(c17818ca, true);
                return c17818ca;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m76007b(C17818ca c17818ca) {
        if (!f52696c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!c17818ca.f53052a && this.f52700e != 0) {
            notifyAll();
            return false;
        }
        this.f52703h.remove(c17818ca);
        m75999d(c17818ca);
        return true;
    }

    public C17780aq(int i, long j, TimeUnit timeUnit) {
        this.f52702g = new Runnable() { // from class: com.huawei.hms.drive.aq.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    long jM76002a = C17780aq.this.m76002a(System.nanoTime());
                    if (jM76002a == -1) {
                        return;
                    }
                    if (jM76002a > 0) {
                        long j2 = jM76002a / 1000000;
                        long j3 = jM76002a - (1000000 * j2);
                        synchronized (C17780aq.this) {
                            try {
                                C17780aq.this.wait(j2, (int) j3);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.f52703h = new ArrayDeque();
        this.f52698a = new C17819cb();
        this.f52704i = new ArrayDeque();
        this.f52705j = new ArrayDeque();
        this.f52700e = i;
        this.f52701f = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "keepAliveDuration <= 0: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m76008c(C17818ca c17818ca) {
        try {
            C17791ba c17791baM75996b = m75996b(c17818ca.m76422b().m76315a());
            if (c17791baM75996b == null) {
                c17791baM75996b = new C17791ba(c17818ca.m76422b().m76315a());
                this.f52704i.push(c17791baM75996b);
            }
            c17791baM75996b.m76127a(c17818ca);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private C17791ba m75996b(C17771ah c17771ah) {
        for (C17791ba c17791ba : this.f52704i) {
            if (c17771ah.equals(c17791ba.m76126a())) {
                return c17791ba;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private void m75998d(C17771ah c17771ah) {
        C17792bb c17792bbM75952b = c17771ah.m75952b();
        Iterator<WeakReference<a>> it = this.f52705j.iterator();
        while (it.hasNext()) {
            a aVar = it.next().get();
            if (aVar != null) {
                aVar.mo76009a(c17792bbM75952b.m76151f(), c17792bbM75952b.m76152g(), c17792bbM75952b.m76145b());
            } else {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public Socket m76004a(C17771ah c17771ah, C17822ce c17822ce, int i) {
        if (!f52696c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        int i2 = 0;
        for (C17818ca c17818ca : this.f52703h) {
            if (c17818ca.m76419a(c17771ah, (C17802bl) null) && c17818ca.m76426f() && c17818ca != c17822ce.m76466c() && (i2 = i2 + 1) == i) {
                return c17822ce.m76460a(c17818ca);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m76006a(C17818ca c17818ca) {
        if (!f52696c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f52699b) {
            this.f52699b = true;
            f52697d.execute(this.f52702g);
        }
        this.f52703h.add(c17818ca);
        if (c17818ca.m76426f()) {
            m76008c(c17818ca);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m76002a(long j) {
        synchronized (this) {
            try {
                C17818ca c17818ca = null;
                long j2 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                for (C17818ca c17818ca2 : this.f52703h) {
                    if (m75995a(c17818ca2, j) <= 0 && (!c17818ca2.m76426f() || j - c17818ca2.f53057f >= 1000000000)) {
                        i++;
                        long j3 = j - c17818ca2.f53056e;
                        if (j3 > j2) {
                            c17818ca = c17818ca2;
                            j2 = j3;
                        }
                    }
                    i2++;
                }
                long j4 = this.f52701f;
                if (j2 < j4 && i <= this.f52700e) {
                    if (i > 0) {
                        return j4 - j2;
                    }
                    if (i2 > 0) {
                        return j4;
                    }
                    this.f52699b = false;
                    return -1L;
                }
                this.f52703h.remove(c17818ca);
                m75999d(c17818ca);
                C17806bp.m76340a(c17818ca.m76424d());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private int m75995a(C17818ca c17818ca, long j) {
        List<Reference<C17822ce>> list = c17818ca.f53055d;
        int i = 0;
        while (i < list.size()) {
            Reference<C17822ce> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C17858dn.m76756e().mo76730a("A connection to " + c17818ca.m76422b().m76315a().m75952b() + " was leaked. Did you forget to close a response body?", ((C17822ce.a) reference).f53107a);
                list.remove(i);
                c17818ca.f53052a = true;
                if (list.isEmpty()) {
                    c17818ca.f53056e = j - this.f52701f;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m76000a(C17771ah c17771ah) {
        int i;
        i = 0;
        for (C17818ca c17818ca : this.f52703h) {
            if (c17771ah.equals(c17818ca.m76422b().f52942a) && !c17818ca.f53052a && c17818ca.m76426f() && (c17818ca.f53053b == 0 || c17818ca.m76421a(true))) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m76001a(String str, int i, String str2) {
        int i2;
        i2 = 0;
        for (C17818ca c17818ca : this.f52703h) {
            if (c17818ca.m76426f() && str.equals(c17818ca.m76422b().f52942a.m75952b().m76151f()) && i == c17818ca.m76422b().f52942a.m75952b().m76152g() && str2.equals(c17818ca.m76422b().f52942a.m75952b().m76145b()) && !c17818ca.f53052a && (c17818ca.f53053b == 0 || c17818ca.m76421a(true))) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76005a(a aVar) {
        if (aVar == null) {
            return;
        }
        this.f52705j.add(new WeakReference<>(aVar));
    }
}
