package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.a9 */
/* JADX INFO: loaded from: classes9.dex */
public class C18105a9 extends C18133c9 {

    /* JADX INFO: renamed from: j */
    public final ArrayList<InetSocketAddress> f54199j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList<InetSocketAddress> f54200k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList<b> f54201l;

    /* JADX INFO: renamed from: m */
    public final int f54202m;

    /* JADX INFO: renamed from: n */
    public ExecutorService f54203n;

    /* JADX INFO: renamed from: o */
    public Timer f54204o;

    /* JADX INFO: renamed from: p */
    public b f54205p;

    /* JADX INFO: renamed from: q */
    public volatile boolean f54206q;

    /* JADX INFO: renamed from: r */
    public long f54207r;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a9$a */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CountDownLatch f54208a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC18159e7 f54209b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f54210c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Proxy f54211d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC18338r7 f54212e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CompletionService f54213f;

        public a(CountDownLatch countDownLatch, InterfaceC18159e7 interfaceC18159e7, long j, Proxy proxy, AbstractC18338r7 abstractC18338r7, CompletionService completionService) {
            this.f54208a = countDownLatch;
            this.f54209b = interfaceC18159e7;
            this.f54210c = j;
            this.f54211d = proxy;
            this.f54212e = abstractC18338r7;
            this.f54213f = completionService;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!C18105a9.this.f54206q && !C18105a9.this.m77901f()) {
                b bVarM77885a = C18105a9.this.m77885a(this.f54209b, this.f54210c, this.f54211d, this.f54212e);
                if (bVarM77885a != null) {
                    try {
                        this.f54213f.submit(bVarM77885a);
                        C18105a9.this.f54201l.add(bVarM77885a);
                    } catch (RejectedExecutionException e) {
                        C18105a9.this.m77890a(e.getMessage(), e);
                    }
                }
                try {
                    if (!C18105a9.this.f54206q && !C18105a9.this.m77901f()) {
                        long millis = ((long) C18105a9.this.f54202m) - (TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) - C18105a9.this.f54207r);
                        C18105a9.this.f54207r = 0L;
                        Future futurePoll = this.f54213f.poll(millis, TimeUnit.MILLISECONDS);
                        if (futurePoll != null) {
                            C18105a9.this.m77886a((b) futurePoll.get());
                        }
                    }
                    C18105a9.this.m77892a(this.f54208a);
                    return;
                } catch (InterruptedException e2) {
                    e = e2;
                    C18105a9.this.m77890a(e.getMessage(), e);
                } catch (ExecutionException e3) {
                    e = e3;
                    C18105a9.this.m77890a(e.getMessage(), e);
                }
            }
            C18105a9.this.m77892a(this.f54208a);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a9$b */
    public final class b implements Callable<b> {

        /* JADX INFO: renamed from: a */
        public final InetSocketAddress f54215a;

        /* JADX INFO: renamed from: b */
        public final Proxy f54216b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC18159e7 f54217c;

        /* JADX INFO: renamed from: d */
        public final AbstractC18338r7 f54218d;

        /* JADX INFO: renamed from: e */
        public final long f54219e;

        /* JADX INFO: renamed from: f */
        public int f54220f;

        /* JADX INFO: renamed from: g */
        public Socket f54221g;

        public b(InetSocketAddress inetSocketAddress, long j, Proxy proxy, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) {
            this.f54215a = inetSocketAddress;
            this.f54216b = proxy;
            this.f54217c = interfaceC18159e7;
            this.f54218d = abstractC18338r7;
            this.f54220f = (int) j;
            this.f54219e = TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) + j;
        }

        /* JADX INFO: renamed from: b */
        public long m77909b() {
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            long j = this.f54219e;
            if (millis >= j) {
                return 0L;
            }
            return j - millis;
        }

        /* JADX INFO: renamed from: c */
        public boolean m77910c() {
            return TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) >= this.f54219e;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public b call() throws Exception {
            this.f54218d.connectStart(this.f54217c, this.f54215a, this.f54216b);
            Socket socket = new Socket();
            this.f54221g = socket;
            try {
                socket.connect(this.f54215a, this.f54220f);
                if (this.f54221g.isClosed()) {
                    return null;
                }
                return this;
            } catch (IOException e) {
                this.f54221g.close();
                m77906a(e);
                throw e;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m77908a() {
            Socket socket = this.f54221g;
            if (socket == null || socket.isClosed()) {
                return;
            }
            try {
                this.f54221g.close();
            } catch (IOException e) {
                C18105a9.this.m77890a(e.getMessage(), (Throwable) null);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m77906a(Exception exc) {
            C18105a9.this.m77890a("address " + this.f54215a + " connect failed", exc);
        }
    }

    public C18105a9(ArrayList<InetSocketAddress> arrayList, int i) {
        super(arrayList, i);
        this.f54200k = new CopyOnWriteArrayList<>();
        this.f54201l = new CopyOnWriteArrayList<>();
        this.f54199j = arrayList;
        this.f54202m = i;
    }

    /* JADX INFO: renamed from: d */
    private int m77897d() {
        int size;
        synchronized (this.f54200k) {
            size = this.f54200k.size();
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public synchronized boolean m77901f() {
        return this.f54205p != null;
    }

    @Override // com.huawei.hms.network.embedded.C18133c9
    /* JADX INFO: renamed from: b */
    public List<InetSocketAddress> mo77904b() {
        return this.f54200k;
    }

    /* JADX INFO: renamed from: c */
    private void m77896c() {
        b bVar;
        ExecutorService executorService = this.f54203n;
        if (executorService != null && !executorService.isShutdown()) {
            this.f54203n.shutdownNow();
        }
        Timer timer = this.f54204o;
        if (timer != null) {
            timer.cancel();
        }
        if (!this.f54206q && (bVar = this.f54205p) != null) {
            this.f54201l.remove(bVar);
        }
        Iterator<b> it = this.f54201l.iterator();
        while (it.hasNext()) {
            try {
                it.next().m77908a();
            } catch (ConcurrentModificationException e) {
                m77890a(e.getMessage(), e);
            }
        }
        this.f54201l.clear();
    }

    /* JADX INFO: renamed from: e */
    private Socket m77900e() {
        b bVar = this.f54205p;
        if (bVar != null) {
            return bVar.f54221g;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public b m77885a(InterfaceC18159e7 interfaceC18159e7, long j, Proxy proxy, AbstractC18338r7 abstractC18338r7) {
        if (this.f54199j.isEmpty()) {
            return null;
        }
        return new b(this.f54199j.remove(0), j, proxy, interfaceC18159e7, abstractC18338r7);
    }

    @Override // com.huawei.hms.network.embedded.C18133c9
    /* JADX INFO: renamed from: a */
    public Socket mo77902a(long j, Proxy proxy, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) {
        this.f54203n = Executors.newCachedThreadPool();
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(this.f54203n);
        int size = this.f54199j.isEmpty() ? 0 : this.f54199j.size();
        this.f54204o = new Timer();
        while (!this.f54199j.isEmpty() && !m77901f()) {
            if (this.f54206q) {
                return m77900e();
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f54204o.schedule(new a(countDownLatch, interfaceC18159e7, j, proxy, abstractC18338r7, executorCompletionService), 0L);
            this.f54207r = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            try {
                countDownLatch.await(this.f54202m, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                m77890a(e.getMessage(), e);
            }
        }
        if (!this.f54206q && !m77901f() && m77897d() != size) {
            CopyOnWriteArrayList<b> copyOnWriteArrayList = this.f54201l;
            try {
                Future futurePoll = executorCompletionService.poll(copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).m77909b(), TimeUnit.MILLISECONDS);
                if (futurePoll != null) {
                    m77886a((b) futurePoll.get());
                    for (b bVar : this.f54201l) {
                        if (bVar != this.f54205p && bVar.m77910c()) {
                            m77891a(bVar.f54215a);
                        }
                    }
                } else if (!this.f54206q) {
                    Iterator<b> it = this.f54201l.iterator();
                    while (it.hasNext()) {
                        m77891a(it.next().f54215a);
                    }
                }
            } catch (InterruptedException e2) {
                e = e2;
                Throwable th = e;
                m77890a(th.getMessage(), th);
            } catch (ExecutionException e3) {
                e = e3;
                Throwable th2 = e;
                m77890a(th2.getMessage(), th2);
            }
        }
        m77896c();
        b bVar2 = this.f54205p;
        if (bVar2 != null) {
            this.f54480i = bVar2.f54215a;
        }
        return m77900e();
    }

    @Override // com.huawei.hms.network.embedded.C18133c9
    /* JADX INFO: renamed from: a */
    public void mo77903a() {
        this.f54206q = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m77886a(b bVar) {
        if (this.f54205p != null) {
            return;
        }
        this.f54205p = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77890a(String str, Throwable th) {
        C18406wa.m79845f().mo79425a(4, str, th);
    }

    /* JADX INFO: renamed from: a */
    private void m77891a(InetSocketAddress inetSocketAddress) {
        synchronized (this.f54200k) {
            try {
                if (!this.f54200k.contains(inetSocketAddress)) {
                    this.f54200k.add(inetSocketAddress);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77892a(CountDownLatch countDownLatch) {
        if (countDownLatch.getCount() > 0) {
            countDownLatch.countDown();
        }
    }
}
