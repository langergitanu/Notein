package com.aspose.slides.internal.p205ji;

import com.aspose.slides.exceptions.ArgumentNullException;
import java.util.Hashtable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.aspose.slides.internal.ji.to */
/* JADX INFO: loaded from: classes.dex */
public class C5465to {

    /* JADX INFO: renamed from: k4 */
    private static final Hashtable<Object, k4> f15038k4 = new Hashtable<>(20);

    /* JADX INFO: renamed from: com.aspose.slides.internal.ji.to$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private ReentrantLock f15039k4;

        /* JADX INFO: renamed from: x1 */
        private C19062k4 f15040x1;

        /* JADX INFO: renamed from: com.aspose.slides.internal.ji.to$k4$k4, reason: collision with other inner class name */
        public class C19062k4 extends C5472x1 {
            public C19062k4(boolean z) {
                super(z, 1);
            }

            @Override // com.aspose.slides.internal.p205ji.C5472x1
            /* JADX INFO: renamed from: x1 */
            public boolean mo22555x1() {
                synchronized (this.f15050x1) {
                    this.f15048kk = true;
                    this.f15050x1.notify();
                    m22561kk().countDown();
                }
                return true;
            }
        }

        private k4(ReentrantLock reentrantLock) {
            this.f15039k4 = reentrantLock;
            this.f15040x1 = new C19062k4(false);
        }

        /* JADX INFO: renamed from: k4 */
        public ReentrantLock m22554k4() {
            return this.f15039k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m22551k4() {
        throw new C5452dy("Object synchronization method was called from an unsynchronized block of code.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x001b, B:11:0x0024, B:13:0x002a, B:17:0x0033, B:16:0x0030), top: B:25:0x0005, outer: #1 }] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m22553x1(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("obj");
        }
        try {
            Hashtable<Object, k4> hashtable = f15038k4;
            synchronized (hashtable) {
                try {
                    if (hashtable.containsKey(obj)) {
                        ReentrantLock reentrantLockM22554k4 = hashtable.get(obj).m22554k4();
                        if (reentrantLockM22554k4.isHeldByCurrentThread()) {
                            reentrantLockM22554k4.unlock();
                            if (!reentrantLockM22554k4.hasQueuedThreads() && !reentrantLockM22554k4.isLocked()) {
                                hashtable.remove(obj);
                            }
                        } else {
                            m22551k4();
                        }
                    }
                } finally {
                }
            }
        } catch (IllegalMonitorStateException unused) {
            m22551k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m22552k4(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("obj");
        }
        try {
            Hashtable<Object, k4> hashtable = f15038k4;
            synchronized (hashtable) {
                try {
                    if (hashtable.containsKey(obj)) {
                        hashtable.get(obj).m22554k4().lock();
                    } else {
                        ReentrantLock reentrantLock = new ReentrantLock();
                        reentrantLock.lock();
                        hashtable.put(obj, new k4(reentrantLock));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalMonitorStateException unused) {
            m22551k4();
        }
    }
}
