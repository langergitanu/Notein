package o00o0Oo;

import com.aspose.slides.C22226Oooo0oo;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o00o0o00.C25438OooO00o;

/* JADX INFO: renamed from: o00o0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C25415OooO0O0 extends AbstractExecutorService {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ int f86684OooOooO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Executor f86685OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final LinkedBlockingQueue f86687OooOoO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f86686OooOo0o = "SerialExecutor";

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile int f86688OooOoO0 = 1;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o f86689OooOoOO = new OooO00o();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final AtomicInteger f86691OooOoo0 = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final AtomicInteger f86690OooOoo = new AtomicInteger(0);

    /* JADX INFO: renamed from: o00o0Oo.OooO0O0$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C25415OooO0O0 c25415OooO0O0 = C25415OooO0O0.this;
            try {
                Runnable runnable = (Runnable) c25415OooO0O0.f86687OooOoO.poll();
                String str = c25415OooO0O0.f86686OooOo0o;
                if (runnable != null) {
                    runnable.run();
                } else {
                    int i = C25415OooO0O0.f86684OooOooO;
                    C25438OooO00o.OooO0Oo(C25415OooO0O0.class, str, "%s: Worker has nothing to run");
                }
                int iDecrementAndGet = c25415OooO0O0.f86691OooOoo0.decrementAndGet();
                if (!c25415OooO0O0.f86687OooOoO.isEmpty()) {
                    c25415OooO0O0.OooO00o();
                } else {
                    int i2 = C25415OooO0O0.f86684OooOooO;
                    C25438OooO00o.OooO0o0(C25415OooO0O0.class, "%s: worker finished; %d workers left", str, Integer.valueOf(iDecrementAndGet));
                }
            } catch (Throwable th) {
                int iDecrementAndGet2 = c25415OooO0O0.f86691OooOoo0.decrementAndGet();
                if (c25415OooO0O0.f86687OooOoO.isEmpty()) {
                    int i3 = C25415OooO0O0.f86684OooOooO;
                    C25438OooO00o.OooO0o0(C25415OooO0O0.class, "%s: worker finished; %d workers left", c25415OooO0O0.f86686OooOo0o, Integer.valueOf(iDecrementAndGet2));
                } else {
                    c25415OooO0O0.OooO00o();
                }
                throw th;
            }
        }
    }

    public C25415OooO0O0(Executor executor, LinkedBlockingQueue linkedBlockingQueue) {
        this.f86685OooOo = executor;
        this.f86687OooOoO = linkedBlockingQueue;
    }

    public final void OooO00o() {
        int i = this.f86691OooOoo0.get();
        while (i < this.f86688OooOoO0) {
            int i2 = i + 1;
            if (this.f86691OooOoo0.compareAndSet(i, i2)) {
                C25438OooO00o.OooO0o(C25415OooO0O0.class, "%s: starting worker %d of %d", this.f86686OooOo0o, Integer.valueOf(i2), Integer.valueOf(this.f86688OooOoO0));
                this.f86685OooOo.execute(this.f86689OooOoOO);
                return;
            } else {
                C25438OooO00o.OooO0Oo(C25415OooO0O0.class, this.f86686OooOo0o, "%s: race in startWorkerIfNeeded; retrying");
                i = this.f86691OooOoo0.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        LinkedBlockingQueue linkedBlockingQueue = this.f86687OooOoO;
        boolean zOffer = linkedBlockingQueue.offer(runnable);
        String str = this.f86686OooOo0o;
        if (!zOffer) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, " queue is full, size=");
            sbOooO0OO.append(linkedBlockingQueue.size());
            throw new RejectedExecutionException(sbOooO0OO.toString());
        }
        int size = linkedBlockingQueue.size();
        AtomicInteger atomicInteger = this.f86690OooOoo;
        int i = atomicInteger.get();
        if (size > i && atomicInteger.compareAndSet(i, size)) {
            C25438OooO00o.OooO0o0(C25415OooO0O0.class, "%s: max pending work in queue = %d", str, Integer.valueOf(size));
        }
        OooO00o();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
