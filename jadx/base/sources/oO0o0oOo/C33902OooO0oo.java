package oO0o0oOo;

import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.C21904OooOoo0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C24019OooOO0o;
import o00O0oo0.C24969OooOO0;
import o00OooO.C25139OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.InterfaceC33611OooOO0O;
import oO0o0OO.o000OO;
import oO0o0Ooo.AbstractC33837OooOOoo;
import oO0o0Ooo.C33820OooO00o;
import oO0o0Ooo.C33839OooOo0;
import oO0o0oO0.InterfaceC33883OooO;

/* JADX INFO: renamed from: oO0o0oOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33902OooO0oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33901OooO0oO f122111OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f122112OooOo0o;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122107OooOoO0 = AtomicReferenceFieldUpdater.newUpdater(C33902OooO0oo.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f122106OooOoO = AtomicLongFieldUpdater.newUpdater(C33902OooO0oo.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122108OooOoOO = AtomicReferenceFieldUpdater.newUpdater(C33902OooO0oo.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f122110OooOoo0 = AtomicLongFieldUpdater.newUpdater(C33902OooO0oo.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f122109OooOoo = AtomicIntegerFieldUpdater.newUpdater(C33902OooO0oo.class, "_availablePermits$volatile");

    /* JADX INFO: renamed from: oO0o0oOo.OooO0oo$OooO00o */
    public /* synthetic */ class OooO00o extends C24019OooOO0o implements InterfaceC32508OooOOOo<Long, C33905OooOO0o, C33905OooOO0o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f122113OooOo0o = new OooO00o(2, C33904OooOO0O.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C33905OooOO0o invoke(Long l, C33905OooOO0o c33905OooOO0o) {
            int i = C33904OooOO0O.f122114OooO00o;
            return new C33905OooOO0o(l.longValue(), c33905OooOO0o, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [oO0o0oOo.OooO0oO] */
    public C33902OooO0oo(int i, int i2) {
        this.f122112OooOo0o = i;
        if (i <= 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "The number of acquired permits should be in 0..").toString());
        }
        C33905OooOO0o c33905OooOO0o = new C33905OooOO0o(0L, null, 2);
        this.head$volatile = c33905OooOO0o;
        this.tail$volatile = c33905OooOO0o;
        this._availablePermits$volatile = i - i2;
        this.f122111OooOo = new InterfaceC32510OooOOo0() { // from class: oO0o0oOo.OooO0oO
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                this.f122105OooOo0o.release();
                return C32460OooOooO.f116667OooO00o;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r4.OooOOOo(oO00ooO.C32460OooOooO.f116667OooO00o, r3.f122111OooOo);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = f122109OooOoo;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.f122112OooOo0o;
        } while (andDecrement > i);
        if (andDecrement > 0) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33614OooOOO0 c33614OooOOO0OooO0Oo = C25139OooOOOo.OooO0Oo(C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
        try {
            if (!OooO0Oo(c33614OooOOO0OooO0Oo)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            break;
                        }
                        if (OooO0Oo(c33614OooOOO0OooO0Oo)) {
                            break;
                        }
                    }
                }
            }
            Object objOooOOo = c33614OooOOO0OooO0Oo.OooOOo();
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (objOooOOo != enumC32485OooO00o) {
                objOooOOo = C32460OooOooO.f116667OooO00o;
            }
            return objOooOOo == enumC32485OooO00o ? objOooOOo : C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c33614OooOOO0OooO0Oo.OooOoo0();
            throw th;
        }
    }

    public final boolean OooO0Oo(o000OO o000oo2) {
        Object objOooO00o;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122108OooOoOO;
        C33905OooOO0o c33905OooOO0o = (C33905OooOO0o) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f122110OooOoo0.getAndIncrement(this);
        OooO00o oooO00o = OooO00o.f122113OooOo0o;
        long j = andIncrement / ((long) C33904OooOO0O.f122118OooO0o);
        loop0: while (true) {
            objOooO00o = C33820OooO00o.OooO00o(c33905OooOO0o, j, oooO00o);
            if (!C24969OooOO0.OooO0o0(objOooO00o)) {
                AbstractC33837OooOOoo abstractC33837OooOOooOooO0Oo = C24969OooOO0.OooO0Oo(objOooO00o);
                while (true) {
                    AbstractC33837OooOOoo abstractC33837OooOOoo = (AbstractC33837OooOOoo) atomicReferenceFieldUpdater.get(this);
                    if (abstractC33837OooOOoo.f121950OooOoO0 >= abstractC33837OooOOooOooO0Oo.f121950OooOoO0) {
                        break loop0;
                    }
                    if (!abstractC33837OooOOooOooO0Oo.OooOO0()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC33837OooOOoo, abstractC33837OooOOooOooO0Oo)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC33837OooOOoo) {
                            if (abstractC33837OooOOooOooO0Oo.OooO0o()) {
                                abstractC33837OooOOooOooO0Oo.OooO0o0();
                            }
                        }
                    }
                    if (abstractC33837OooOOoo.OooO0o()) {
                        abstractC33837OooOOoo.OooO0o0();
                    }
                }
            } else {
                break;
            }
        }
        C33905OooOO0o c33905OooOO0o2 = (C33905OooOO0o) C24969OooOO0.OooO0Oo(objOooO00o);
        int i = (int) (andIncrement % ((long) C33904OooOO0O.f122118OooO0o));
        AtomicReferenceArray atomicReferenceArray = c33905OooOO0o2.f122120OooOoOO;
        while (!atomicReferenceArray.compareAndSet(i, null, o000oo2)) {
            if (atomicReferenceArray.get(i) != null) {
                C33839OooOo0 c33839OooOo0 = C33904OooOO0O.f122115OooO0O0;
                C33839OooOo0 c33839OooOo02 = C33904OooOO0O.f122116OooO0OO;
                while (!atomicReferenceArray.compareAndSet(i, c33839OooOo0, c33839OooOo02)) {
                    if (atomicReferenceArray.get(i) != c33839OooOo0) {
                        return false;
                    }
                }
                if (o000oo2 instanceof InterfaceC33611OooOO0O) {
                    ((InterfaceC33611OooOO0O) o000oo2).OooOOOo(C32460OooOooO.f116667OooO00o, this.f122111OooOo);
                    return true;
                }
                if (o000oo2 instanceof InterfaceC33883OooO) {
                    ((InterfaceC33883OooO) o000oo2).OooO0Oo(C32460OooOooO.f116667OooO00o);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + o000oo2).toString());
            }
        }
        o000oo2.OooO0OO(c33905OooOO0o2, i);
        return true;
    }

    public final void release() {
        int i;
        Object objOooO00o;
        boolean zOooO0o0;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f122109OooOoo;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f122112OooOo0o;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122107OooOoO0;
            C33905OooOO0o c33905OooOO0o = (C33905OooOO0o) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f122106OooOoO.getAndIncrement(this);
            long j = andIncrement2 / ((long) C33904OooOO0O.f122118OooO0o);
            C33894OooO c33894OooO = C33894OooO.f122095OooOo0o;
            while (true) {
                objOooO00o = C33820OooO00o.OooO00o(c33905OooOO0o, j, c33894OooO);
                if (C24969OooOO0.OooO0o0(objOooO00o)) {
                    break;
                }
                AbstractC33837OooOOoo abstractC33837OooOOooOooO0Oo = C24969OooOO0.OooO0Oo(objOooO00o);
                while (true) {
                    AbstractC33837OooOOoo abstractC33837OooOOoo = (AbstractC33837OooOOoo) atomicReferenceFieldUpdater.get(this);
                    if (abstractC33837OooOOoo.f121950OooOoO0 >= abstractC33837OooOOooOooO0Oo.f121950OooOoO0) {
                        break;
                    }
                    if (!abstractC33837OooOOooOooO0Oo.OooOO0()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC33837OooOOoo, abstractC33837OooOOooOooO0Oo)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC33837OooOOoo) {
                            if (abstractC33837OooOOooOooO0Oo.OooO0o()) {
                                abstractC33837OooOOooOooO0Oo.OooO0o0();
                            }
                        }
                    }
                    if (abstractC33837OooOOoo.OooO0o()) {
                        abstractC33837OooOOoo.OooO0o0();
                    }
                }
            }
            C33905OooOO0o c33905OooOO0o2 = (C33905OooOO0o) C24969OooOO0.OooO0Oo(objOooO00o);
            c33905OooOO0o2.OooO0O0();
            zOooO0o0 = false;
            if (c33905OooOO0o2.f121950OooOoO0 <= j) {
                int i3 = (int) (andIncrement2 % ((long) C33904OooOO0O.f122118OooO0o));
                C33839OooOo0 c33839OooOo0 = C33904OooOO0O.f122115OooO0O0;
                AtomicReferenceArray atomicReferenceArray = c33905OooOO0o2.f122120OooOoOO;
                Object andSet = atomicReferenceArray.getAndSet(i3, c33839OooOo0);
                if (andSet == null) {
                    int i4 = C33904OooOO0O.f122114OooO00o;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == C33904OooOO0O.f122116OooO0OO) {
                            zOooO0o0 = true;
                            break;
                        }
                    }
                    C33839OooOo0 c33839OooOo02 = C33904OooOO0O.f122115OooO0O0;
                    C33839OooOo0 c33839OooOo03 = C33904OooOO0O.f122117OooO0Oo;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, c33839OooOo02, c33839OooOo03)) {
                            if (atomicReferenceArray.get(i3) != c33839OooOo02) {
                                break;
                            }
                        } else {
                            zOooO0o0 = true;
                            break;
                        }
                    }
                    zOooO0o0 = !zOooO0o0;
                } else if (andSet != C33904OooOO0O.f122119OooO0o0) {
                    if (andSet instanceof InterfaceC33611OooOO0O) {
                        InterfaceC33611OooOO0O interfaceC33611OooOO0O = (InterfaceC33611OooOO0O) andSet;
                        C33839OooOo0 c33839OooOo0OooO0O0 = interfaceC33611OooOO0O.OooO0O0(C32460OooOooO.f116667OooO00o, this.f122111OooOo);
                        if (c33839OooOo0OooO0O0 != null) {
                            interfaceC33611OooOO0O.OooOOOO(c33839OooOo0OooO0O0);
                            zOooO0o0 = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof InterfaceC33883OooO)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zOooO0o0 = ((InterfaceC33883OooO) andSet).OooO0o0(this, C32460OooOooO.f116667OooO00o);
                    }
                }
            }
        } while (!zOooO0o0);
    }
}
