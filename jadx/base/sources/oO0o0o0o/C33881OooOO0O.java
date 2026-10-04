package oO0o0o0o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: oO0o0o0o.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33881OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122053OooO0O0 = AtomicReferenceFieldUpdater.newUpdater(C33881OooOO0O.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f122054OooO0OO = AtomicIntegerFieldUpdater.newUpdater(C33881OooOO0O.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f122055OooO0Oo = AtomicIntegerFieldUpdater.newUpdater(C33881OooOO0O.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f122056OooO0o0 = AtomicIntegerFieldUpdater.newUpdater(C33881OooOO0O.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReferenceArray<AbstractRunnableC33878OooO0oO> f122057OooO00o = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final AbstractRunnableC33878OooO0oO OooO00o(AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oO) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f122054OooO0OO;
        if (atomicIntegerFieldUpdater.get(this) - f122055OooO0Oo.get(this) == 127) {
            return abstractRunnableC33878OooO0oO;
        }
        if (abstractRunnableC33878OooO0oO.f122049OooOo) {
            f122056OooO0o0.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<AbstractRunnableC33878OooO0oO> atomicReferenceArray = this.f122057OooO00o;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC33878OooO0oO);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final AbstractRunnableC33878OooO0oO OooO0O0() {
        AbstractRunnableC33878OooO0oO andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f122055OooO0Oo;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f122054OooO0OO.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.f122057OooO00o.getAndSet(i2, null)) != null) {
                if (andSet.f122049OooOo) {
                    f122056OooO0o0.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final AbstractRunnableC33878OooO0oO OooO0OO(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray<AbstractRunnableC33878OooO0oO> atomicReferenceArray = this.f122057OooO00o;
        AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oO = atomicReferenceArray.get(i2);
        if (abstractRunnableC33878OooO0oO != null && abstractRunnableC33878OooO0oO.f122049OooOo == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC33878OooO0oO, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC33878OooO0oO) {
                }
            }
            if (z) {
                f122056OooO0o0.decrementAndGet(this);
            }
            return abstractRunnableC33878OooO0oO;
        }
        return null;
    }
}
