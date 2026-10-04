package oO00Oo0o;

import androidx.appcompat.widget.C21532OooOOo;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.C24023OooOOoo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO00Oo0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32276OooO0OO<T> implements OooO0o<T> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final AtomicLongFieldUpdater<AbstractC32276OooO0OO<?>> f115994OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f115995OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f115996OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int[] f115997OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicReferenceArray<T> f115998OooOoO0;
    private volatile long top;

    /* JADX INFO: renamed from: oO00Oo0o.OooO0OO$OooO00o */
    public /* synthetic */ class OooO00o extends C24023OooOOoo {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f115999OooOo0o = new OooO00o(AbstractC32276OooO0OO.class, "top", "getTop()J", 0);

        @Override // kotlin.jvm.internal.C24023OooOOoo, oOoo0.InterfaceC34603OooOOO
        public final Object get(Object obj) {
            return Long.valueOf(((AbstractC32276OooO0OO) obj).top);
        }
    }

    static {
        AtomicLongFieldUpdater<AbstractC32276OooO0OO<?>> atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(AbstractC32276OooO0OO.class, OooO00o.f115999OooOo0o.getName());
        OooOOO0.OooO0o(atomicLongFieldUpdaterNewUpdater, "newUpdater(Owner::class.java, p.name)");
        f115994OooOoOO = atomicLongFieldUpdaterNewUpdater;
    }

    public AbstractC32276OooO0OO(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "capacity should be positive but it is ").toString());
        }
        if (i > 536870911) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.f115996OooOo0o = iHighestOneBit;
        this.f115995OooOo = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i2 = iHighestOneBit + 1;
        this.f115998OooOoO0 = new AtomicReferenceArray<>(i2);
        this.f115997OooOoO = new int[i2];
    }

    public T OooO0OO(T t) {
        return t;
    }

    public void OooOOO0(T instance) {
        OooOOO0.OooO0oO(instance, "instance");
    }

    public abstract T OooOOo0();

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final T OooOOoo() {
        long j;
        int i;
        AbstractC32276OooO0OO<T> abstractC32276OooO0OO;
        long j2;
        do {
            j = this.top;
            if (j != 0) {
                j2 = ((j >> 32) & 4294967295L) + 1;
                i = (int) (4294967295L & j);
                if (i != 0) {
                    abstractC32276OooO0OO = this;
                }
            }
            i = 0;
            abstractC32276OooO0OO = this;
            break;
        } while (!f115994OooOoOO.compareAndSet(abstractC32276OooO0OO, j, (j2 << 32) | ((long) this.f115997OooOoO[i])));
        if (i == 0) {
            return null;
        }
        return abstractC32276OooO0OO.f115998OooOoO0.getAndSet(i, null);
    }

    public void OooOooo(T instance) {
        OooOOO0.OooO0oO(instance, "instance");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dispose();
    }

    public final void dispose() {
        while (true) {
            T tOooOOoo = OooOOoo();
            if (tOooOOoo == null) {
                return;
            } else {
                OooOOO0(tOooOOoo);
            }
        }
    }

    @Override // oO00Oo0o.OooO0o
    public final T o0000OoO() {
        T tOooOOoo = OooOOoo();
        return tOooOOoo != null ? OooO0OO(tOooOOoo) : OooOOo0();
    }

    @Override // oO00Oo0o.OooO0o
    public final void o00o0O(T instance) {
        long j;
        long j2;
        OooOOO0.OooO0oO(instance, "instance");
        OooOooo(instance);
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.f115995OooOo) + 1;
        for (int i = 0; i < 8; i++) {
            AtomicReferenceArray<T> atomicReferenceArray = this.f115998OooOoO0;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, instance)) {
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = this.f115996OooOo0o;
                    }
                }
            }
            if (iIdentityHashCode <= 0) {
                throw new IllegalArgumentException("index should be positive");
            }
            do {
                j = this.top;
                j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                this.f115997OooOoO[iIdentityHashCode] = (int) (4294967295L & j);
            } while (!f115994OooOoOO.compareAndSet(this, j, j2));
            return;
        }
        OooOOO0(instance);
    }
}
