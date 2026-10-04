package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import com.huawei.hms.network.embedded.C18243k7;
import com.huawei.hms.network.embedded.C18287n9;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0o00OOo.RunnableC29889OooO0Oo;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.j9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18231j9 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Executor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C18313p8.m79375a("OkHttp ConnectionPool", true));
    public boolean cleanupRunning;
    public final long keepAliveDurationNs;
    public final int maxIdleConnections;
    public final Runnable cleanupRunnable = new RunnableC29889OooO0Oo(this, 1);
    public final Deque<C18217i9> connections = new ArrayDeque();
    public final C18245k9 routeDatabase = new C18245k9();
    public final Deque<C18403w7> http2Hosts = new ArrayDeque();
    public final Deque<WeakReference<C18243k7.a>> listenerWrList = new ArrayDeque();

    public C18231j9(int i, long j, TimeUnit timeUnit) {
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "keepAliveDuration <= 0: "));
        }
    }

    /* JADX INFO: renamed from: b */
    private C18217i9 m78887b(C18103a7 c18103a7) {
        C18403w7 c18403w7M78888c = m78888c(c18103a7);
        if (c18403w7M78888c != null) {
            return c18403w7M78888c.m79833b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m78889d() {
        while (true) {
            long jM78895a = m78895a(System.nanoTime());
            if (jM78895a == -1) {
                return;
            }
            if (jM78895a > 0) {
                long j = jM78895a / 1000000;
                long j2 = jM78895a - (1000000 * j);
                synchronized (this) {
                    try {
                        wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m78892a() {
        return this.connections.size();
    }

    /* JADX INFO: renamed from: c */
    public synchronized int m78904c() {
        int i;
        Iterator<C18217i9> it = this.connections.iterator();
        i = 0;
        while (it.hasNext()) {
            if (it.next().f55254p.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    private C18403w7 m78888c(C18103a7 c18103a7) {
        for (C18403w7 c18403w7 : this.http2Hosts) {
            if (c18103a7.equals(c18403w7.m79831a())) {
                return c18403w7;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private void m78890d(C18103a7 c18103a7) {
        C18416x7 c18416x7M77862l = c18103a7.m77862l();
        Iterator<WeakReference<C18243k7.a>> it = this.listenerWrList.iterator();
        while (it.hasNext()) {
            C18243k7.a aVar = it.next().get();
            if (aVar != null) {
                aVar.mo78013a(c18416x7M77862l.m79929h(), c18416x7M77862l.m79935n(), c18416x7M77862l.m79940s());
            } else {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m78893a(C18103a7 c18103a7) {
        int i;
        i = 0;
        for (C18217i9 c18217i9 : this.connections) {
            if (c18103a7.equals(c18217i9.mo78789b().m78766a()) && !c18217i9.f55249k && c18217i9.m78794g() && (c18217i9.f55251m == 0 || c18217i9.m78788a(true))) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public void m78900b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C18217i9> it = this.connections.iterator();
                while (it.hasNext()) {
                    C18217i9 next = it.next();
                    if (next.f55254p.isEmpty()) {
                        next.f55249k = true;
                        arrayList.add(next);
                        it.remove();
                        m78891d(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C18313p8.m79381a(((C18217i9) it2.next()).mo78790c());
        }
    }

    /* JADX INFO: renamed from: a */
    private int m78886a(C18217i9 c18217i9, long j) {
        List<Reference<C18287n9>> list = c18217i9.f55254p;
        int i = 0;
        while (i < list.size()) {
            Reference<C18287n9> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C18406wa.m79845f().mo79426a("A connection to " + c18217i9.mo78789b().m78766a().m77862l() + " was leaked. Did you forget to close a response body?", ((C18287n9.b) reference).f55796a);
                list.remove(i);
                c18217i9.f55249k = true;
                if (list.isEmpty()) {
                    c18217i9.f55255q = j - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* JADX INFO: renamed from: d */
    private void m78891d(C18217i9 c18217i9) {
        C18403w7 c18403w7M78888c;
        if (c18217i9 == null || !c18217i9.m78794g() || (c18403w7M78888c = m78888c(c18217i9.mo78789b().m78766a())) == null) {
            return;
        }
        c18403w7M78888c.m79834b(c18217i9);
        if (c18403w7M78888c.m79835c()) {
            this.http2Hosts.remove(c18403w7M78888c);
            m78890d(c18217i9.mo78789b().m78766a());
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m78901b(C18243k7.a aVar) {
        Iterator<WeakReference<C18243k7.a>> it = this.listenerWrList.iterator();
        while (it.hasNext()) {
            C18243k7.a aVar2 = it.next().get();
            if (aVar2 == null || aVar == aVar2) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m78905c(C18217i9 c18217i9) {
        if (!this.cleanupRunning) {
            this.cleanupRunning = true;
            executor.execute(this.cleanupRunnable);
        }
        this.connections.add(c18217i9);
        if (c18217i9.m78794g()) {
            m78897a(c18217i9);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m78894a(String str, int i, String str2) {
        int i2;
        i2 = 0;
        for (C18217i9 c18217i9 : this.connections) {
            if (c18217i9.m78794g() && str.equals(c18217i9.mo78789b().m78766a().m77862l().m79929h()) && i == c18217i9.mo78789b().m78766a().m77862l().m79935n() && str2.equals(c18217i9.mo78789b().m78766a().m77862l().m79940s()) && !c18217i9.f55249k && (c18217i9.f55251m == 0 || c18217i9.m78788a(true))) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public boolean m78902b(C18217i9 c18217i9) {
        if (!c18217i9.f55249k && this.maxIdleConnections != 0) {
            notifyAll();
            return false;
        }
        this.connections.remove(c18217i9);
        m78891d(c18217i9);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public long m78895a(long j) {
        synchronized (this) {
            try {
                C18217i9 c18217i9 = null;
                long j2 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                for (C18217i9 c18217i92 : this.connections) {
                    if (m78886a(c18217i92, j) <= 0 && (!c18217i92.m78794g() || j - c18217i92.f55262x >= 1000000000)) {
                        i++;
                        long j3 = j - c18217i92.f55255q;
                        if (j3 > j2) {
                            c18217i9 = c18217i92;
                            j2 = j3;
                        }
                    }
                    i2++;
                }
                long j4 = this.keepAliveDurationNs;
                if (j2 < j4 && i <= this.maxIdleConnections) {
                    if (i > 0) {
                        j4 -= j2;
                    } else if (i2 <= 0) {
                        this.cleanupRunning = false;
                        return -1L;
                    }
                    return j4;
                }
                this.connections.remove(c18217i9);
                m78891d(c18217i9);
                C18313p8.m79381a(c18217i9.mo78790c());
                return 0L;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m78903b(String str, int i, String str2) {
        for (C18217i9 c18217i9 : this.connections) {
            if (c18217i9.m78794g() && str.equals(c18217i9.mo78789b().m78766a().m77862l().m79929h()) && i == c18217i9.mo78789b().m78766a().m77862l().m79935n() && str2.equals(c18217i9.mo78789b().m78766a().m77862l().m79940s()) && !c18217i9.f55249k && c18217i9.m78788a(true)) {
                c18217i9.f55262x = System.nanoTime();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m78896a(C18216i8 c18216i8, IOException iOException) {
        if (c18216i8.m78767b().type() != Proxy.Type.DIRECT) {
            C18103a7 c18103a7M78766a = c18216i8.m78766a();
            c18103a7M78766a.m77859i().connectFailed(c18103a7M78766a.m77862l().m79942u(), c18216i8.m78767b().address(), iOException);
        }
        this.routeDatabase.m78981b(c18216i8);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78897a(C18217i9 c18217i9) {
        try {
            C18403w7 c18403w7M78888c = m78888c(c18217i9.mo78789b().m78766a());
            if (c18403w7M78888c == null) {
                c18403w7M78888c = new C18403w7(c18217i9.mo78789b().m78766a());
                this.http2Hosts.push(c18403w7M78888c);
            }
            c18403w7M78888c.m79832a(c18217i9);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78898a(C18243k7.a aVar) {
        if (aVar == null) {
            return;
        }
        this.listenerWrList.add(new WeakReference<>(aVar));
    }

    /* JADX INFO: renamed from: a */
    public boolean m78899a(C18103a7 c18103a7, C18287n9 c18287n9, List<C18216i8> list, boolean z) {
        C18217i9 c18217i9M78887b = m78887b(c18103a7);
        if (c18217i9M78887b != null) {
            c18287n9.acquireConnectionNoEvents(c18217i9M78887b);
            return true;
        }
        for (C18217i9 c18217i9 : this.connections) {
            if (!z || c18217i9.m78794g()) {
                if (c18217i9.m78786a(c18103a7, list)) {
                    c18287n9.acquireConnectionNoEvents(c18217i9);
                    return true;
                }
            }
        }
        return false;
    }
}
