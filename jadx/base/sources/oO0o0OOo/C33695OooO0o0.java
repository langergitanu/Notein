package oO0o0OOo;

import Oooo0oO.o000O0O;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.location.LocationRequestCompat;
import androidx.fragment.app.C21904OooOoo0;
import com.google.common.primitives.Longs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24039Oooo0o0;
import o00O0oo0.C24969OooOO0;
import o00OooO.C25139OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0o.C33600OooOo0o;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.InterfaceC33611OooOO0O;
import oO0o0OO.o000OO;
import oO0o0OOo.C33702OooOOO;
import oO0o0OOo.C33711OooOo00;
import oO0o0OoO.C33801OooOOO;
import oO0o0Ooo.AbstractC33821OooO0O0;
import oO0o0Ooo.AbstractC33837OooOOoo;
import oO0o0Ooo.C33820OooO00o;
import oO0o0Ooo.C33839OooOo0;
import oO0o0Ooo.C33840OooOo00;
import oO0o0oO0.C33890OooO0oO;
import oO0o0oO0.EnumC33893OooOO0O;
import oO0o0oO0.InterfaceC33883OooO;
import oO0o0oO0.InterfaceC33889OooO0o0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: oO0o0OOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33695OooO0o0<E> implements InterfaceC33699OooOO0<E> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f121467OooOo0o;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f121458OooOo = AtomicLongFieldUpdater.newUpdater(C33695OooO0o0.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f121460OooOoO0 = AtomicLongFieldUpdater.newUpdater(C33695OooO0o0.class, "receivers$volatile");

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f121459OooOoO = AtomicLongFieldUpdater.newUpdater(C33695OooO0o0.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f121461OooOoOO = AtomicLongFieldUpdater.newUpdater(C33695OooO0o0.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121463OooOoo0 = AtomicReferenceFieldUpdater.newUpdater(C33695OooO0o0.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121462OooOoo = AtomicReferenceFieldUpdater.newUpdater(C33695OooO0o0.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121464OooOooO = AtomicReferenceFieldUpdater.newUpdater(C33695OooO0o0.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121465OooOooo = AtomicReferenceFieldUpdater.newUpdater(C33695OooO0o0.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121466Oooo000 = AtomicReferenceFieldUpdater.newUpdater(C33695OooO0o0.class, Object.class, "closeHandler$volatile");

    /* JADX INFO: renamed from: oO0o0OOo.OooO0o0$OooO00o */
    public final class OooO00o implements InterfaceC33701OooOO0o<E>, o000OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C33614OooOOO0<? super Boolean> f121468OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Object f121469OooOo0o = C33689OooO.f121447OooOOOo;

        public OooO00o() {
        }

        @Override // oO0o0OOo.InterfaceC33701OooOO0o
        public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
            C33704OooOOOO<E> c33704OooOOOOOooOo00;
            Boolean bool;
            Object obj = this.f121469OooOo0o;
            boolean z = true;
            if (obj == C33689OooO.f121447OooOOOo || obj == C33689OooO.f121443OooOO0o) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C33695OooO0o0.f121462OooOoo;
                C33695OooO0o0<E> c33695OooO0o0 = C33695OooO0o0.this;
                C33704OooOOOO<E> c33704OooOOOO = (C33704OooOOOO) atomicReferenceFieldUpdater.get(c33695OooO0o0);
                while (true) {
                    if (c33695OooO0o0.OooOoOO()) {
                        this.f121469OooOo0o = C33689OooO.f121443OooOO0o;
                        Throwable thOooOo0 = c33695OooO0o0.OooOo0();
                        if (thOooOo0 != null) {
                            int i = C33840OooOo00.f121952OooO00o;
                            throw thOooOo0;
                        }
                        z = false;
                    } else {
                        long andIncrement = C33695OooO0o0.f121460OooOoO0.getAndIncrement(c33695OooO0o0);
                        long j = C33689OooO.f121434OooO0O0;
                        long j2 = andIncrement / j;
                        int i2 = (int) (andIncrement % j);
                        if (c33704OooOOOO.f121950OooOoO0 != j2) {
                            c33704OooOOOOOooOo00 = c33695OooO0o0.OooOo00(j2, c33704OooOOOO);
                            if (c33704OooOOOOOooOo00 == null) {
                                continue;
                            }
                        } else {
                            c33704OooOOOOOooOo00 = c33704OooOOOO;
                        }
                        Object objOooo0OO = c33695OooO0o0.Oooo0OO(c33704OooOOOOOooOo00, i2, andIncrement, null);
                        C33839OooOo0 c33839OooOo0 = C33689OooO.f121445OooOOO0;
                        if (objOooo0OO == c33839OooOo0) {
                            throw new IllegalStateException("unreachable");
                        }
                        C33839OooOo0 c33839OooOo02 = C33689OooO.f121446OooOOOO;
                        if (objOooo0OO == c33839OooOo02) {
                            if (andIncrement < c33695OooO0o0.OooOo()) {
                                c33704OooOOOOOooOo00.OooO0O0();
                            }
                            c33704OooOOOO = c33704OooOOOOOooOo00;
                        } else {
                            if (objOooo0OO == C33689OooO.f121444OooOOO) {
                                C33695OooO0o0<E> c33695OooO0o02 = C33695OooO0o0.this;
                                C33614OooOOO0<? super Boolean> c33614OooOOO0OooO0Oo = C25139OooOOOo.OooO0Oo(C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
                                try {
                                    this.f121468OooOo = c33614OooOOO0OooO0Oo;
                                    Object objOooo0OO2 = c33695OooO0o02.Oooo0OO(c33704OooOOOOOooOo00, i2, andIncrement, this);
                                    if (objOooo0OO2 == c33839OooOo0) {
                                        OooO0OO(c33704OooOOOOOooOo00, i2);
                                    } else {
                                        if (objOooo0OO2 == c33839OooOo02) {
                                            if (andIncrement < c33695OooO0o02.OooOo()) {
                                                c33704OooOOOOOooOo00.OooO0O0();
                                            }
                                            C33704OooOOOO<E> c33704OooOOOO2 = (C33704OooOOOO) C33695OooO0o0.f121462OooOoo.get(c33695OooO0o02);
                                            while (true) {
                                                if (c33695OooO0o02.OooOoOO()) {
                                                    C33614OooOOO0<? super Boolean> c33614OooOOO0 = this.f121468OooOo;
                                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c33614OooOOO0);
                                                    this.f121468OooOo = null;
                                                    this.f121469OooOo0o = C33689OooO.f121443OooOO0o;
                                                    Throwable thOooOo02 = c33695OooO0o0.OooOo0();
                                                    if (thOooOo02 == null) {
                                                        c33614OooOOO0.resumeWith(Boolean.FALSE);
                                                    } else {
                                                        c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(thOooOo02));
                                                    }
                                                } else {
                                                    long andIncrement2 = C33695OooO0o0.f121460OooOoO0.getAndIncrement(c33695OooO0o02);
                                                    long j3 = C33689OooO.f121434OooO0O0;
                                                    long j4 = andIncrement2 / j3;
                                                    int i3 = (int) (andIncrement2 % j3);
                                                    if (c33704OooOOOO2.f121950OooOoO0 != j4) {
                                                        C33704OooOOOO<E> c33704OooOOOOOooOo002 = c33695OooO0o02.OooOo00(j4, c33704OooOOOO2);
                                                        if (c33704OooOOOOOooOo002 != null) {
                                                            c33704OooOOOO2 = c33704OooOOOOOooOo002;
                                                        }
                                                    }
                                                    Object objOooo0OO3 = c33695OooO0o02.Oooo0OO(c33704OooOOOO2, i3, andIncrement2, this);
                                                    if (objOooo0OO3 == C33689OooO.f121445OooOOO0) {
                                                        OooO0OO(c33704OooOOOO2, i3);
                                                        break;
                                                    }
                                                    if (objOooo0OO3 == C33689OooO.f121446OooOOOO) {
                                                        if (andIncrement2 < c33695OooO0o02.OooOo()) {
                                                            c33704OooOOOO2.OooO0O0();
                                                        }
                                                    } else {
                                                        if (objOooo0OO3 == C33689OooO.f121444OooOOO) {
                                                            throw new IllegalStateException("unexpected");
                                                        }
                                                        c33704OooOOOO2.OooO0O0();
                                                        this.f121469OooOo0o = objOooo0OO3;
                                                        this.f121468OooOo = null;
                                                        bool = Boolean.TRUE;
                                                    }
                                                }
                                            }
                                        } else {
                                            c33704OooOOOOOooOo00.OooO0O0();
                                            this.f121469OooOo0o = objOooo0OO2;
                                            this.f121468OooOo = null;
                                            bool = Boolean.TRUE;
                                        }
                                        c33614OooOOO0OooO0Oo.OooOOOo(bool, null);
                                    }
                                    Object objOooOOo = c33614OooOOO0OooO0Oo.OooOOo();
                                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                                    return objOooOOo;
                                } catch (Throwable th) {
                                    c33614OooOOO0OooO0Oo.OooOoo0();
                                    throw th;
                                }
                            }
                            c33704OooOOOOOooOo00.OooO0O0();
                            this.f121469OooOo0o = objOooo0OO;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // oO0o0OO.o000OO
        public final void OooO0OO(AbstractC33837OooOOoo<?> abstractC33837OooOOoo, int i) {
            C33614OooOOO0<? super Boolean> c33614OooOOO0 = this.f121468OooOo;
            if (c33614OooOOO0 != null) {
                c33614OooOOO0.OooO0OO(abstractC33837OooOOoo, i);
            }
        }

        @Override // oO0o0OOo.InterfaceC33701OooOO0o
        public final E next() throws Throwable {
            E e = (E) this.f121469OooOo0o;
            C33839OooOo0 c33839OooOo0 = C33689OooO.f121447OooOOOo;
            if (e == c33839OooOo0) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f121469OooOo0o = c33839OooOo0;
            if (e != C33689OooO.f121443OooOO0o) {
                return e;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = C33695OooO0o0.f121458OooOo;
            Throwable thOooOo0O = C33695OooO0o0.this.OooOo0O();
            int i = C33840OooOo00.f121952OooO00o;
            throw thOooOo0O;
        }
    }

    /* JADX INFO: renamed from: oO0o0OOo.OooO0o0$OooO0O0 */
    public static final class OooO0O0 implements o000OO {
        @Override // oO0o0OO.o000OO
        public final void OooO0OO(AbstractC33837OooOOoo<?> abstractC33837OooOOoo, int i) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: oO0o0OOo.OooO0o0$OooO0OO */
    public /* synthetic */ class OooO0OO extends C24019OooOO0o implements InterfaceC32510OooOOo0<C33695OooO0o0<?>, InterfaceC33883OooO<?>, Object, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f121471OooOo0o = new OooO0OO(3, C33695OooO0o0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final C32460OooOooO invoke(C33695OooO0o0<?> c33695OooO0o0, InterfaceC33883OooO<?> interfaceC33883OooO, Object obj) {
            C33695OooO0o0.OooO0OO(c33695OooO0o0, interfaceC33883OooO);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0o0OOo.OooO0o0$OooO0Oo, reason: case insensitive filesystem */
    public /* synthetic */ class C33696OooO0Oo extends C24019OooOO0o implements InterfaceC32510OooOOo0<C33695OooO0o0<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C33696OooO0Oo f121472OooOo0o = new C33696OooO0Oo(3, C33695OooO0o0.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(C33695OooO0o0<?> c33695OooO0o0, Object obj, Object obj2) throws Throwable {
            C33695OooO0o0<?> c33695OooO0o02 = c33695OooO0o0;
            AtomicLongFieldUpdater atomicLongFieldUpdater = C33695OooO0o0.f121458OooOo;
            c33695OooO0o02.getClass();
            if (obj2 != C33689OooO.f121443OooOO0o) {
                return obj2;
            }
            throw c33695OooO0o02.OooOo0O();
        }
    }

    /* JADX INFO: renamed from: oO0o0OOo.OooO0o0$OooO0o */
    public /* synthetic */ class OooO0o extends C24019OooOO0o implements InterfaceC32510OooOOo0<C33695OooO0o0<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0o f121473OooOo0o = new OooO0o(3, C33695OooO0o0.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(C33695OooO0o0<?> c33695OooO0o0, Object obj, Object obj2) {
            C33695OooO0o0<?> c33695OooO0o02 = c33695OooO0o0;
            AtomicLongFieldUpdater atomicLongFieldUpdater = C33695OooO0o0.f121458OooOo;
            c33695OooO0o02.getClass();
            if (obj2 == C33689OooO.f121443OooOO0o) {
                obj2 = new C33702OooOOO.OooO00o(c33695OooO0o02.OooOo0());
            }
            return new C33702OooOOO(obj2);
        }
    }

    /* JADX INFO: renamed from: oO0o0OOo.OooO0o0$OooO0o0, reason: collision with other inner class name */
    public /* synthetic */ class C20324OooO0o0 extends C24019OooOO0o implements InterfaceC32510OooOOo0<C33695OooO0o0<?>, InterfaceC33883OooO<?>, Object, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C20324OooO0o0 f121474OooOo0o = new C20324OooO0o0(3, C33695OooO0o0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final C32460OooOooO invoke(C33695OooO0o0<?> c33695OooO0o0, InterfaceC33883OooO<?> interfaceC33883OooO, Object obj) {
            C33695OooO0o0.OooO0OO(c33695OooO0o0, interfaceC33883OooO);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C33695OooO0o0(int i) {
        this.f121467OooOo0o = i;
        if (i < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C33704OooOOOO<Object> c33704OooOOOO = C33689OooO.f121433OooO00o;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : LocationRequestCompat.PASSIVE_INTERVAL : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f121459OooOoO.get(this);
        C33704OooOOOO<Object> c33704OooOOOO2 = new C33704OooOOOO<>(0L, null, this, 3);
        this.sendSegment$volatile = c33704OooOOOO2;
        this.receiveSegment$volatile = c33704OooOOOO2;
        if (OooOoo()) {
            c33704OooOOOO2 = C33689OooO.f121433OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(c33704OooOOOO2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c33704OooOOOO2;
        this._closeCause$volatile = C33689OooO.f121450OooOOoo;
    }

    public static final C33704OooOOOO OooO00o(C33695OooO0o0 c33695OooO0o0, long j, C33704OooOOOO c33704OooOOOO) {
        Object objOooO00o;
        C33695OooO0o0 c33695OooO0o02;
        c33695OooO0o0.getClass();
        C33704OooOOOO<Object> c33704OooOOOO2 = C33689OooO.f121433OooO00o;
        C33698OooO0oo c33698OooO0oo = C33698OooO0oo.f121478OooOo0o;
        loop0: while (true) {
            objOooO00o = C33820OooO00o.OooO00o(c33704OooOOOO, j, c33698OooO0oo);
            if (!C24969OooOO0.OooO0o0(objOooO00o)) {
                AbstractC33837OooOOoo abstractC33837OooOOooOooO0Oo = C24969OooOO0.OooO0Oo(objOooO00o);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121463OooOoo0;
                    AbstractC33837OooOOoo abstractC33837OooOOoo = (AbstractC33837OooOOoo) atomicReferenceFieldUpdater.get(c33695OooO0o0);
                    if (abstractC33837OooOOoo.f121950OooOoO0 >= abstractC33837OooOOooOooO0Oo.f121950OooOoO0) {
                        break loop0;
                    }
                    if (!abstractC33837OooOOooOooO0Oo.OooOO0()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c33695OooO0o0, abstractC33837OooOOoo, abstractC33837OooOOooOooO0Oo)) {
                        if (atomicReferenceFieldUpdater.get(c33695OooO0o0) != abstractC33837OooOOoo) {
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
        boolean zOooO0o0 = C24969OooOO0.OooO0o0(objOooO00o);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f121460OooOoO0;
        if (zOooO0o0) {
            c33695OooO0o0.OooOO0();
            if (c33704OooOOOO.f121950OooOoO0 * ((long) C33689OooO.f121434OooO0O0) < atomicLongFieldUpdater.get(c33695OooO0o0)) {
                c33704OooOOOO.OooO0O0();
                return null;
            }
        } else {
            C33704OooOOOO c33704OooOOOO3 = (C33704OooOOOO) C24969OooOO0.OooO0Oo(objOooO00o);
            long j2 = c33704OooOOOO3.f121950OooOoO0;
            if (j2 <= j) {
                return c33704OooOOOO3;
            }
            long j3 = ((long) C33689OooO.f121434OooO0O0) * j2;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f121458OooOo;
                long j4 = atomicLongFieldUpdater2.get(c33695OooO0o0);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    c33695OooO0o02 = c33695OooO0o0;
                    break;
                }
                c33695OooO0o02 = c33695OooO0o0;
                if (atomicLongFieldUpdater2.compareAndSet(c33695OooO0o02, j4, j5 + (((long) ((int) (j4 >> 60))) << 60))) {
                    break;
                }
                c33695OooO0o0 = c33695OooO0o02;
            }
            if (j2 * ((long) C33689OooO.f121434OooO0O0) < atomicLongFieldUpdater.get(c33695OooO0o02)) {
                c33704OooOOOO3.OooO0O0();
            }
        }
        return null;
    }

    public static final void OooO0O0(C33695OooO0o0 c33695OooO0o0, Object obj, C33614OooOOO0 c33614OooOOO0) {
        c33695OooO0o0.getClass();
        c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(c33695OooO0o0.OooOo0o()));
    }

    public static final void OooO0OO(C33695OooO0o0 c33695OooO0o0, InterfaceC33883OooO interfaceC33883OooO) {
        C33704OooOOOO<E> c33704OooOOOO;
        C33695OooO0o0 c33695OooO0o02;
        InterfaceC33883OooO interfaceC33883OooO2;
        int i;
        c33695OooO0o0.getClass();
        C33704OooOOOO<E> c33704OooOOOO2 = (C33704OooOOOO) f121462OooOoo.get(c33695OooO0o0);
        while (!c33695OooO0o0.OooOoOO()) {
            long andIncrement = f121460OooOoO0.getAndIncrement(c33695OooO0o0);
            long j = C33689OooO.f121434OooO0O0;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (c33704OooOOOO2.f121950OooOoO0 != j2) {
                C33704OooOOOO<E> c33704OooOOOOOooOo00 = c33695OooO0o0.OooOo00(j2, c33704OooOOOO2);
                if (c33704OooOOOOOooOo00 == null) {
                    continue;
                } else {
                    c33704OooOOOO = c33704OooOOOOOooOo00;
                    interfaceC33883OooO2 = interfaceC33883OooO;
                    i = i2;
                    c33695OooO0o02 = c33695OooO0o0;
                }
            } else {
                c33704OooOOOO = c33704OooOOOO2;
                c33695OooO0o02 = c33695OooO0o0;
                interfaceC33883OooO2 = interfaceC33883OooO;
                i = i2;
            }
            Object objOooo0OO = c33695OooO0o02.Oooo0OO(c33704OooOOOO, i, andIncrement, interfaceC33883OooO2);
            c33704OooOOOO2 = c33704OooOOOO;
            if (objOooo0OO == C33689OooO.f121445OooOOO0) {
                o000OO o000oo2 = interfaceC33883OooO2 instanceof o000OO ? (o000OO) interfaceC33883OooO2 : null;
                if (o000oo2 != null) {
                    o000oo2.OooO0OO(c33704OooOOOO2, i);
                    return;
                }
                return;
            }
            if (objOooo0OO != C33689OooO.f121446OooOOOO) {
                if (objOooo0OO == C33689OooO.f121444OooOOO) {
                    throw new IllegalStateException("unexpected");
                }
                c33704OooOOOO2.OooO0O0();
                interfaceC33883OooO2.OooO0Oo(objOooo0OO);
                return;
            }
            if (andIncrement < c33695OooO0o02.OooOo()) {
                c33704OooOOOO2.OooO0O0();
            }
            c33695OooO0o0 = c33695OooO0o02;
            interfaceC33883OooO = interfaceC33883OooO2;
        }
        interfaceC33883OooO.OooO0Oo(C33689OooO.f121443OooOO0o);
    }

    public static final int OooOOO0(C33695OooO0o0 c33695OooO0o0, C33704OooOOOO c33704OooOOOO, int i, Object obj, long j, Object obj2, boolean z) {
        c33695OooO0o0.getClass();
        c33704OooOOOO.OooOOO(i, obj);
        if (z) {
            return c33695OooO0o0.Oooo0o0(c33704OooOOOO, i, obj, j, obj2, z);
        }
        Object objOooOO0o = c33704OooOOOO.OooOO0o(i);
        if (objOooOO0o == null) {
            if (c33695OooO0o0.OooOOOO(j)) {
                if (c33704OooOOOO.OooOO0O(i, null, C33689OooO.f121436OooO0Oo)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c33704OooOOOO.OooOO0O(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objOooOO0o instanceof o000OO) {
            c33704OooOOOO.OooOOO(i, null);
            if (c33695OooO0o0.Oooo0(objOooOO0o, obj)) {
                c33704OooOOOO.OooOOOO(i, C33689OooO.f121432OooO);
                return 0;
            }
            C33839OooOo0 c33839OooOo0 = C33689OooO.f121442OooOO0O;
            if (c33704OooOOOO.f121487OooOoo0.getAndSet((i * 2) + 1, c33839OooOo0) == c33839OooOo0) {
                return 5;
            }
            c33704OooOOOO.OooOOO0(i, true);
            return 5;
        }
        return c33695OooO0o0.Oooo0o0(c33704OooOOOO, i, obj, j, obj2, z);
    }

    public static void OooOoO0(C33695OooO0o0 c33695OooO0o0) {
        c33695OooO0o0.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f121461OooOoOO;
        if ((atomicLongFieldUpdater.addAndGet(c33695OooO0o0, 1L) & Longs.MAX_POWER_OF_TWO) != 0) {
            while ((atomicLongFieldUpdater.get(c33695OooO0o0) & Longs.MAX_POWER_OF_TWO) != 0) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Oooo000(C33695OooO0o0 c33695OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33694OooO0o c33694OooO0o;
        C33704OooOOOO<E> c33704OooOOOO;
        if (abstractC32479OooO0OO instanceof C33694OooO0o) {
            c33694OooO0o = (C33694OooO0o) abstractC32479OooO0OO;
            int i = c33694OooO0o.f121457OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33694OooO0o.f121457OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c33694OooO0o = new C33694OooO0o(c33695OooO0o0, abstractC32479OooO0OO);
            }
        }
        C33694OooO0o c33694OooO0o2 = c33694OooO0o;
        Object obj = c33694OooO0o2.f121456OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33694OooO0o2.f121457OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C33702OooOOO) obj).f121484OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        C33704OooOOOO<E> c33704OooOOOO2 = (C33704OooOOOO) f121462OooOoo.get(c33695OooO0o0);
        while (!c33695OooO0o0.OooOoOO()) {
            long andIncrement = f121460OooOoO0.getAndIncrement(c33695OooO0o0);
            long j = C33689OooO.f121434OooO0O0;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (c33704OooOOOO2.f121950OooOoO0 != j2) {
                C33704OooOOOO<E> c33704OooOOOOOooOo00 = c33695OooO0o0.OooOo00(j2, c33704OooOOOO2);
                if (c33704OooOOOOOooOo00 == null) {
                    continue;
                } else {
                    c33704OooOOOO = c33704OooOOOOOooOo00;
                }
            } else {
                c33704OooOOOO = c33704OooOOOO2;
            }
            C33695OooO0o0 c33695OooO0o02 = c33695OooO0o0;
            Object objOooo0OO = c33695OooO0o02.Oooo0OO(c33704OooOOOO, i3, andIncrement, null);
            if (objOooo0OO == C33689OooO.f121445OooOOO0) {
                throw new IllegalStateException("unexpected");
            }
            if (objOooo0OO != C33689OooO.f121446OooOOOO) {
                if (objOooo0OO != C33689OooO.f121444OooOOO) {
                    c33704OooOOOO.OooO0O0();
                    return objOooo0OO;
                }
                c33694OooO0o2.f121457OooOoO0 = 1;
                Object objOooo00O = c33695OooO0o02.Oooo00O(c33704OooOOOO, i3, andIncrement, c33694OooO0o2);
                return objOooo00O == enumC32485OooO00o ? enumC32485OooO00o : objOooo00O;
            }
            if (andIncrement < c33695OooO0o02.OooOo()) {
                c33704OooOOOO.OooO0O0();
            }
            c33695OooO0o0 = c33695OooO0o02;
            c33704OooOOOO2 = c33704OooOOOO;
        }
        return new C33702OooOOO.OooO00o(c33695OooO0o0.OooOo0());
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final Object OooO(C33801OooOOO.OooO00o oooO00o) {
        return Oooo000(this, oooO00o);
    }

    @Override // oO0o0OOo.InterfaceC33715OooOoO0
    public final boolean OooO0Oo(Throwable th) {
        return OooOOOo(false, th);
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final InterfaceC33889OooO0o0<C33702OooOOO<E>> OooO0o() {
        C20324OooO0o0 c20324OooO0o0 = C20324OooO0o0.f121474OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(c20324OooO0o0, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        C24039Oooo0o0.OooO0o0(3, c20324OooO0o0);
        OooO0o oooO0o = OooO0o.f121473OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO0o, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        C24039Oooo0o0.OooO0o0(3, oooO0o);
        return new o000O0O(this, c20324OooO0o0, oooO0o, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf A[SYNTHETIC] */
    @Override // oO0o0OOo.InterfaceC33715OooOoO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OooO0o0(E e) {
        int iOooOOO0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f121458OooOo;
        boolean z = false;
        long j = 1152921504606846975L;
        boolean z2 = OooOoO(atomicLongFieldUpdater.get(this), false) ? false : !OooOOOO(r1 & 1152921504606846975L);
        C33702OooOOO.OooO0O0 oooO0O0 = C33702OooOOO.f121483OooO0O0;
        if (z2) {
            return oooO0O0;
        }
        Object obj = C33689OooO.f121441OooOO0;
        C33704OooOOOO c33704OooOOOO = (C33704OooOOOO) f121463OooOoo0.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean zOooOoO = OooOoO(andIncrement, z);
            int i = C33689OooO.f121434OooO0O0;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (c33704OooOOOO.f121950OooOoO0 == j4) {
                iOooOOO0 = OooOOO0(this, c33704OooOOOO, i2, e, j2, obj, zOooOoO);
                if (iOooOOO0 != 0) {
                    c33704OooOOOO.OooO0O0();
                    return C32460OooOooO.f116667OooO00o;
                }
                if (iOooOOO0 == 1) {
                    return C32460OooOooO.f116667OooO00o;
                }
                if (iOooOOO0 == 2) {
                    if (zOooOoO) {
                        c33704OooOOOO.OooO();
                        return new C33702OooOOO.OooO00o(OooOo0o());
                    }
                    o000OO o000oo2 = obj instanceof o000OO ? (o000OO) obj : null;
                    if (o000oo2 != null) {
                        o000oo2.OooO0OO(c33704OooOOOO, i2 + i);
                    }
                    c33704OooOOOO.OooO();
                    return oooO0O0;
                }
                if (iOooOOO0 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iOooOOO0 == 4) {
                    if (j2 < f121460OooOoO0.get(this)) {
                        c33704OooOOOO.OooO0O0();
                    }
                    return new C33702OooOOO.OooO00o(OooOo0o());
                }
                if (iOooOOO0 == 5) {
                    c33704OooOOOO.OooO0O0();
                }
                z = false;
            } else {
                C33704OooOOOO c33704OooOOOOOooO00o = OooO00o(this, j4, c33704OooOOOO);
                if (c33704OooOOOOOooO00o != null) {
                    c33704OooOOOO = c33704OooOOOOOooO00o;
                    iOooOOO0 = OooOOO0(this, c33704OooOOOO, i2, e, j2, obj, zOooOoO);
                    if (iOooOOO0 != 0) {
                    }
                } else {
                    if (zOooOoO) {
                        return new C33702OooOOO.OooO00o(OooOo0o());
                    }
                    z = false;
                }
            }
            j = 1152921504606846975L;
        }
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final Object OooO0oO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33704OooOOOO<E> c33704OooOOOO;
        Throwable th;
        C33704OooOOOO<E> c33704OooOOOO2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121462OooOoo;
        C33704OooOOOO<E> c33704OooOOOO3 = (C33704OooOOOO) atomicReferenceFieldUpdater.get(this);
        while (!OooOoOO()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f121460OooOoO0;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = C33689OooO.f121434OooO0O0;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c33704OooOOOO3.f121950OooOoO0 != j2) {
                C33704OooOOOO<E> c33704OooOOOOOooOo00 = OooOo00(j2, c33704OooOOOO3);
                if (c33704OooOOOOOooOo00 == null) {
                    continue;
                } else {
                    c33704OooOOOO = c33704OooOOOOOooOo00;
                }
            } else {
                c33704OooOOOO = c33704OooOOOO3;
            }
            Object objOooo0OO = Oooo0OO(c33704OooOOOO, i, andIncrement, null);
            C33839OooOo0 c33839OooOo0 = C33689OooO.f121445OooOOO0;
            if (objOooo0OO == c33839OooOo0) {
                throw new IllegalStateException("unexpected");
            }
            C33839OooOo0 c33839OooOo02 = C33689OooO.f121446OooOOOO;
            if (objOooo0OO == c33839OooOo02) {
                if (andIncrement < OooOo()) {
                    c33704OooOOOO.OooO0O0();
                }
                c33704OooOOOO3 = c33704OooOOOO;
            } else {
                if (objOooo0OO != C33689OooO.f121444OooOOO) {
                    c33704OooOOOO.OooO0O0();
                    return objOooo0OO;
                }
                C33614OooOOO0 c33614OooOOO0OooO0Oo = C25139OooOOOo.OooO0Oo(C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
                C33695OooO0o0<E> c33695OooO0o0 = this;
                try {
                    Object objOooo0OO2 = c33695OooO0o0.Oooo0OO(c33704OooOOOO, i, andIncrement, c33614OooOOO0OooO0Oo);
                    if (objOooo0OO2 == c33839OooOo0) {
                        c33614OooOOO0OooO0Oo.OooO0OO(c33704OooOOOO, i);
                    } else {
                        if (objOooo0OO2 == c33839OooOo02) {
                            if (andIncrement < OooOo()) {
                                c33704OooOOOO.OooO0O0();
                            }
                            C33704OooOOOO<E> c33704OooOOOO4 = (C33704OooOOOO) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (OooOoOO()) {
                                    c33614OooOOO0OooO0Oo.resumeWith(C32446OooOOOo.OooO00o(OooOo0O()));
                                    break;
                                }
                                C33614OooOOO0 c33614OooOOO0 = c33614OooOOO0OooO0Oo;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j3 = C33689OooO.f121434OooO0O0;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (c33704OooOOOO4.f121950OooOoO0 != j4) {
                                        try {
                                            C33704OooOOOO<E> c33704OooOOOOOooOo002 = OooOo00(j4, c33704OooOOOO4);
                                            if (c33704OooOOOOOooOo002 == null) {
                                                c33614OooOOO0OooO0Oo = c33614OooOOO0;
                                            } else {
                                                c33704OooOOOO2 = c33704OooOOOOOooOo002;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c33614OooOOO0OooO0Oo = c33614OooOOO0;
                                            c33614OooOOO0OooO0Oo.OooOoo0();
                                            throw th;
                                        }
                                    } else {
                                        c33704OooOOOO2 = c33704OooOOOO4;
                                    }
                                    objOooo0OO2 = c33695OooO0o0.Oooo0OO(c33704OooOOOO2, i2, andIncrement2, c33614OooOOO0);
                                    C33704OooOOOO<E> c33704OooOOOO5 = c33704OooOOOO2;
                                    c33614OooOOO0OooO0Oo = c33614OooOOO0;
                                    if (objOooo0OO2 == C33689OooO.f121445OooOOO0) {
                                        c33614OooOOO0OooO0Oo.OooO0OO(c33704OooOOOO5, i2);
                                        break;
                                    }
                                    if (objOooo0OO2 == C33689OooO.f121446OooOOOO) {
                                        if (andIncrement2 < OooOo()) {
                                            c33704OooOOOO5.OooO0O0();
                                        }
                                        c33695OooO0o0 = this;
                                        c33704OooOOOO4 = c33704OooOOOO5;
                                    } else {
                                        if (objOooo0OO2 == C33689OooO.f121444OooOOO) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c33704OooOOOO5.OooO0O0();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c33614OooOOO0OooO0Oo = c33614OooOOO0;
                                    th = th;
                                    c33614OooOOO0OooO0Oo.OooOoo0();
                                    throw th;
                                }
                            }
                        } else {
                            c33704OooOOOO.OooO0O0();
                        }
                        c33614OooOOO0OooO0Oo.OooOOOo(objOooo0OO2, null);
                    }
                    Object objOooOOo = c33614OooOOO0OooO0Oo.OooOOo();
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    return objOooOOo;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thOooOo0O = OooOo0O();
        int i3 = C33840OooOo00.f121952OooO00o;
        throw thOooOo0O;
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final Object OooO0oo() {
        C33704OooOOOO<E> c33704OooOOOO;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f121460OooOoO0;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f121458OooOo.get(this);
        if (OooOoO(j2, true)) {
            return new C33702OooOOO.OooO00o(OooOo0());
        }
        long j3 = j2 & 1152921504606846975L;
        C33702OooOOO.OooO0O0 oooO0O0 = C33702OooOOO.f121483OooO0O0;
        if (j >= j3) {
            return oooO0O0;
        }
        Object obj = C33689OooO.f121442OooOO0O;
        C33704OooOOOO<E> c33704OooOOOO2 = (C33704OooOOOO) f121462OooOoo.get(this);
        while (!OooOoOO()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = C33689OooO.f121434OooO0O0;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (c33704OooOOOO2.f121950OooOoO0 != j5) {
                C33704OooOOOO<E> c33704OooOOOOOooOo00 = OooOo00(j5, c33704OooOOOO2);
                if (c33704OooOOOOOooOo00 == null) {
                    continue;
                } else {
                    c33704OooOOOO = c33704OooOOOOOooOo00;
                }
            } else {
                c33704OooOOOO = c33704OooOOOO2;
            }
            Object objOooo0OO = Oooo0OO(c33704OooOOOO, i, andIncrement, obj);
            C33704OooOOOO<E> c33704OooOOOO3 = c33704OooOOOO;
            if (objOooo0OO == C33689OooO.f121445OooOOO0) {
                o000OO o000oo2 = obj instanceof o000OO ? (o000OO) obj : null;
                if (o000oo2 != null) {
                    o000oo2.OooO0OO(c33704OooOOOO3, i);
                }
                Oooo0o(andIncrement);
                c33704OooOOOO3.OooO();
                return oooO0O0;
            }
            if (objOooo0OO != C33689OooO.f121446OooOOOO) {
                if (objOooo0OO == C33689OooO.f121444OooOOO) {
                    throw new IllegalStateException("unexpected");
                }
                c33704OooOOOO3.OooO0O0();
                return objOooo0OO;
            }
            if (andIncrement < OooOo()) {
                c33704OooOOOO3.OooO0O0();
            }
            c33704OooOOOO2 = c33704OooOOOO3;
        }
        return new C33702OooOOO.OooO00o(OooOo0());
    }

    @Override // oO0o0OOo.InterfaceC33715OooOoO0
    public final boolean OooOO0() {
        return OooOoO(f121458OooOo.get(this), false);
    }

    @Override // oO0o0OOo.InterfaceC33715OooOoO0
    public final void OooOO0O(C33711OooOo00.OooO0O0 oooO0O0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f121466Oooo000;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, oooO0O0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C33839OooOo0 c33839OooOo0 = C33689OooO.f121449OooOOo0;
            if (obj != c33839OooOo0) {
                if (obj == C33689OooO.f121448OooOOo) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            C33839OooOo0 c33839OooOo02 = C33689OooO.f121448OooOOo;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c33839OooOo0, c33839OooOo02)) {
                if (atomicReferenceFieldUpdater.get(this) != c33839OooOo0) {
                    break;
                }
            }
            oooO0O0.invoke(OooOo0());
            return;
        }
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final InterfaceC33889OooO0o0<E> OooOO0o() {
        OooO0OO oooO0OO = OooO0OO.f121471OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO0OO, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        C24039Oooo0o0.OooO0o0(3, oooO0OO);
        C33696OooO0Oo c33696OooO0Oo = C33696OooO0Oo.f121472OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(c33696OooO0Oo, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        C24039Oooo0o0.OooO0o0(3, c33696OooO0Oo);
        return new o000O0O(this, oooO0OO, c33696OooO0Oo, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x018d, code lost:
    
        return oO00ooO.C32460OooOooO.f116667OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        OooO0O0(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171 A[RETURN] */
    @Override // oO0o0OOo.InterfaceC33715OooOoO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OooOOO(E e, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        int iOooOOO0;
        C32460OooOooO c32460OooOooO;
        Object objOooOOo;
        EnumC32485OooO00o enumC32485OooO00o;
        E e2;
        C33695OooO0o0<E> c33695OooO0o0;
        C33704OooOOOO c33704OooOOOO;
        int i;
        int i2;
        boolean z;
        C33695OooO0o0<E> c33695OooO0o02 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121463OooOoo0;
        C33704OooOOOO c33704OooOOOO2 = (C33704OooOOOO) atomicReferenceFieldUpdater.get(c33695OooO0o02);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f121458OooOo;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c33695OooO0o02);
            long j = andIncrement & 1152921504606846975L;
            boolean zOooOoO = c33695OooO0o02.OooOoO(andIncrement, false);
            int i3 = C33689OooO.f121434OooO0O0;
            long j2 = i3;
            long j3 = j / j2;
            int i4 = (int) (j % j2);
            if (c33704OooOOOO2.f121950OooOoO0 != j3) {
                C33704OooOOOO c33704OooOOOOOooO00o = OooO00o(c33695OooO0o02, j3, c33704OooOOOO2);
                if (c33704OooOOOOOooO00o != null) {
                    c33704OooOOOO2 = c33704OooOOOOOooO00o;
                } else if (zOooOoO) {
                    Object objOooOooo = OooOooo(e, continuation);
                    if (objOooOooo == EnumC32485OooO00o.f116726OooOo0o) {
                        return objOooOooo;
                    }
                }
            }
            int iOooOOO02 = OooOOO0(c33695OooO0o02, c33704OooOOOO2, i4, e, j, null, zOooOoO);
            if (iOooOOO02 == 0) {
                c33704OooOOOO2.OooO0O0();
                break;
            }
            if (iOooOOO02 == 1) {
                break;
            }
            if (iOooOOO02 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f121460OooOoO0;
                if (iOooOOO02 == 3) {
                    C33614OooOOO0 c33614OooOOO0OooO0Oo = C25139OooOOOo.OooO0Oo(C21904OooOoo0.OooO0o0(continuation));
                    E e3 = e;
                    try {
                        iOooOOO0 = OooOOO0(c33695OooO0o02, c33704OooOOOO2, i4, e3, j, c33614OooOOO0OooO0Oo, false);
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (iOooOOO0 == 0) {
                        c33704OooOOOO2.OooO0O0();
                        c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } else if (iOooOOO0 != 1) {
                        if (iOooOOO0 != 2) {
                            if (iOooOOO0 != 4) {
                                String str = "unexpected";
                                if (iOooOOO0 != 5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c33704OooOOOO2.OooO0O0();
                                C33704OooOOOO c33704OooOOOO3 = (C33704OooOOOO) atomicReferenceFieldUpdater.get(c33695OooO0o02);
                                while (true) {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c33695OooO0o02);
                                    long j4 = andIncrement2 & 1152921504606846975L;
                                    boolean zOooOoO2 = c33695OooO0o02.OooOoO(andIncrement2, false);
                                    int i5 = C33689OooO.f121434OooO0O0;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                    long j5 = i5;
                                    String str2 = str;
                                    long j6 = j4 / j5;
                                    int i6 = (int) (j4 % j5);
                                    if (c33704OooOOOO3.f121950OooOoO0 != j6) {
                                        C33704OooOOOO c33704OooOOOOOooO00o2 = OooO00o(c33695OooO0o02, j6, c33704OooOOOO3);
                                        if (c33704OooOOOOOooO00o2 != null) {
                                            i = i5;
                                            i2 = i6;
                                            z = zOooOoO2;
                                            c33704OooOOOO = c33704OooOOOOOooO00o2;
                                        } else {
                                            if (zOooOoO2) {
                                                break;
                                            }
                                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                            str = str2;
                                        }
                                    } else {
                                        c33704OooOOOO = c33704OooOOOO3;
                                        i = i5;
                                        i2 = i6;
                                        z = zOooOoO2;
                                    }
                                    int iOooOOO03 = OooOOO0(c33695OooO0o02, c33704OooOOOO, i2, e3, j4, c33614OooOOO0OooO0Oo, z);
                                    E e4 = e3;
                                    c33695OooO0o0 = c33695OooO0o02;
                                    C33704OooOOOO c33704OooOOOO4 = c33704OooOOOO;
                                    int i7 = i2;
                                    e2 = e4;
                                    if (iOooOOO03 == 0) {
                                        c33704OooOOOO4.OooO0O0();
                                        c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                        break;
                                    }
                                    if (iOooOOO03 == 1) {
                                        c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                        break;
                                    }
                                    if (iOooOOO03 != 2) {
                                        if (iOooOOO03 == 3) {
                                            throw new IllegalStateException(str2);
                                        }
                                        if (iOooOOO03 != 4) {
                                            if (iOooOOO03 == 5) {
                                                c33704OooOOOO4.OooO0O0();
                                            }
                                            c33704OooOOOO3 = c33704OooOOOO4;
                                            c33695OooO0o02 = c33695OooO0o0;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                            str = str2;
                                            e3 = e2;
                                        } else if (j4 < atomicLongFieldUpdater2.get(c33695OooO0o0)) {
                                            c33704OooOOOO4.OooO0O0();
                                        }
                                    } else if (z) {
                                        c33704OooOOOO4.OooO();
                                    } else {
                                        c33614OooOOO0OooO0Oo.OooO0OO(c33704OooOOOO4, i7 + i);
                                    }
                                }
                                c33614OooOOO0OooO0Oo.OooOoo0();
                                throw th;
                            }
                            e2 = e3;
                            c33695OooO0o0 = c33695OooO0o02;
                            if (j < atomicLongFieldUpdater2.get(c33695OooO0o0)) {
                                c33704OooOOOO2.OooO0O0();
                            }
                            OooO0O0(c33695OooO0o0, e2, c33614OooOOO0OooO0Oo);
                        } else {
                            c33614OooOOO0OooO0Oo.OooO0OO(c33704OooOOOO2, i4 + i3);
                        }
                        objOooOOo = c33614OooOOO0OooO0Oo.OooOOo();
                        enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        if (objOooOOo != enumC32485OooO00o) {
                            objOooOOo = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooOOo == enumC32485OooO00o) {
                            return objOooOOo;
                        }
                    } else {
                        c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                    c33614OooOOO0OooO0Oo.resumeWith(c32460OooOooO);
                    objOooOOo = c33614OooOOO0OooO0Oo.OooOOo();
                    enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    if (objOooOOo != enumC32485OooO00o) {
                    }
                    if (objOooOOo == enumC32485OooO00o) {
                    }
                } else if (iOooOOO02 == 4) {
                    if (j < atomicLongFieldUpdater2.get(c33695OooO0o02)) {
                        c33704OooOOOO2.OooO0O0();
                    }
                    Object objOooOooo2 = OooOooo(e, continuation);
                    if (objOooOooo2 == EnumC32485OooO00o.f116726OooOo0o) {
                        return objOooOooo2;
                    }
                } else if (iOooOOO02 == 5) {
                    c33704OooOOOO2.OooO0O0();
                }
            } else if (zOooOoO) {
                c33704OooOOOO2.OooO();
                Object objOooOooo3 = OooOooo(e, continuation);
                if (objOooOooo3 == EnumC32485OooO00o.f116726OooOo0o) {
                    return objOooOooo3;
                }
            }
        }
    }

    public final boolean OooOOOO(long j) {
        return j < f121459OooOoO.get(this) || j < f121460OooOoO0.get(this) + ((long) this.f121467OooOo0o);
    }

    public final boolean OooOOOo(boolean z, Throwable th) {
        C33695OooO0o0<E> c33695OooO0o0;
        boolean z2;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f121458OooOo;
        if (!z) {
            c33695OooO0o0 = this;
            break;
        }
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                c33695OooO0o0 = this;
                break;
            }
            C33704OooOOOO<Object> c33704OooOOOO = C33689OooO.f121433OooO00o;
            c33695OooO0o0 = this;
        } while (!atomicLongFieldUpdater.compareAndSet(c33695OooO0o0, j5, (j5 & 1152921504606846975L) + (((long) 1) << 60)));
        C33839OooOo0 c33839OooOo0 = C33689OooO.f121450OooOOoo;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121465OooOooo;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c33839OooOo0, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c33839OooOo0) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(c33695OooO0o0, j4, (((long) 3) << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c33695OooO0o0, j, (j3 << 60) + j2));
        }
        OooOO0();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f121466Oooo000;
                obj = atomicReferenceFieldUpdater2.get(this);
                C33839OooOo0 c33839OooOo02 = obj == null ? C33689OooO.f121449OooOOo0 : C33689OooO.f121448OooOOo;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c33839OooOo02)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                C24039Oooo0o0.OooO0o0(1, obj);
                ((InterfaceC32507OooOO0o) obj).invoke(OooOo0());
                return z2;
            }
        }
        return z2;
    }

    public final void OooOOo(long j) {
        C33704OooOOOO<E> c33704OooOOOO = (C33704OooOOOO) f121462OooOoo.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f121460OooOoO0;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f121467OooOo0o) + j2, f121459OooOoO.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = C33689OooO.f121434OooO0O0;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c33704OooOOOO.f121950OooOoO0 != j4) {
                    C33704OooOOOO<E> c33704OooOOOOOooOo00 = OooOo00(j4, c33704OooOOOO);
                    if (c33704OooOOOOOooOo00 != null) {
                        c33704OooOOOO = c33704OooOOOOOooOo00;
                    }
                }
                C33704OooOOOO<E> c33704OooOOOO2 = c33704OooOOOO;
                if (Oooo0OO(c33704OooOOOO2, i, j2, null) != C33689OooO.f121446OooOOOO || j2 < OooOo()) {
                    c33704OooOOOO2.OooO0O0();
                }
                c33704OooOOOO = c33704OooOOOO2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (oO0o0OOo.C33704OooOOOO) ((oO0o0Ooo.AbstractC33821OooO0O0) oO0o0Ooo.AbstractC33821OooO0O0.f121914OooOo.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C33704OooOOOO<E> OooOOo0(long j) {
        Object objOooO0oo;
        long j2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f121464OooOooO.get(this);
        C33704OooOOOO c33704OooOOOO = (C33704OooOOOO) f121463OooOoo0.get(this);
        if (c33704OooOOOO.f121950OooOoO0 > ((C33704OooOOOO) obj).f121950OooOoO0) {
            obj = c33704OooOOOO;
        }
        C33704OooOOOO c33704OooOOOO2 = (C33704OooOOOO) f121462OooOoo.get(this);
        if (c33704OooOOOO2.f121950OooOoO0 > ((C33704OooOOOO) obj).f121950OooOoO0) {
            obj = c33704OooOOOO2;
        }
        AbstractC33821OooO0O0 abstractC33821OooO0O0 = (AbstractC33821OooO0O0) obj;
        loop0: while (true) {
            abstractC33821OooO0O0.getClass();
            Object obj2 = AbstractC33821OooO0O0.f121915OooOo0o.get(abstractC33821OooO0O0);
            C33839OooOo0 c33839OooOo0 = C33820OooO00o.f121913OooO00o;
            objOooO0oo = null;
            if (obj2 == c33839OooOo0) {
                break;
            }
            AbstractC33821OooO0O0 abstractC33821OooO0O02 = (AbstractC33821OooO0O0) obj2;
            if (abstractC33821OooO0O02 == null) {
                do {
                    atomicReferenceFieldUpdater = AbstractC33821OooO0O0.f121915OooOo0o;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC33821OooO0O0, null, c33839OooOo0)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC33821OooO0O0) == null);
            } else {
                abstractC33821OooO0O0 = abstractC33821OooO0O02;
            }
        }
        C33704OooOOOO<E> c33704OooOOOO3 = (C33704OooOOOO) abstractC33821OooO0O0;
        if (OooOoo0()) {
            C33704OooOOOO<E> c33704OooOOOO4 = c33704OooOOOO3;
            loop2: do {
                int i = C33689OooO.f121434OooO0O0 - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (c33704OooOOOO4.f121950OooOoO0 * ((long) C33689OooO.f121434OooO0O0)) + ((long) i);
                    if (j2 < f121460OooOoO0.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object objOooOO0o = c33704OooOOOO4.OooOO0o(i);
                        if (objOooOO0o != null && objOooOO0o != C33689OooO.f121438OooO0o0) {
                            if (objOooOO0o == C33689OooO.f121436OooO0Oo) {
                                break loop2;
                            }
                        } else {
                            if (c33704OooOOOO4.OooOO0O(i, objOooOO0o, C33689OooO.f121443OooOO0o)) {
                                c33704OooOOOO4.OooO();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (c33704OooOOOO4 != null);
            j2 = -1;
            if (j2 != -1) {
                OooOOo(j2);
            }
        }
        loop5: for (C33704OooOOOO<E> c33704OooOOOO5 = c33704OooOOOO3; c33704OooOOOO5 != null; c33704OooOOOO5 = (C33704OooOOOO) ((AbstractC33821OooO0O0) AbstractC33821OooO0O0.f121914OooOo.get(c33704OooOOOO5))) {
            for (int i2 = C33689OooO.f121434OooO0O0 - 1; -1 < i2; i2--) {
                if ((c33704OooOOOO5.f121950OooOoO0 * ((long) C33689OooO.f121434OooO0O0)) + ((long) i2) < j) {
                    break loop5;
                }
                while (true) {
                    Object objOooOO0o2 = c33704OooOOOO5.OooOO0o(i2);
                    if (objOooOO0o2 != null && objOooOO0o2 != C33689OooO.f121438OooO0o0) {
                        if (!(objOooOO0o2 instanceof C33714OooOoO)) {
                            if (!(objOooOO0o2 instanceof o000OO)) {
                                break;
                            }
                            if (c33704OooOOOO5.OooOO0O(i2, objOooOO0o2, C33689OooO.f121443OooOO0o)) {
                                objOooO0oo = OooOoo0.OooOo00.OooO0oo(objOooO0oo, objOooOO0o2);
                                c33704OooOOOO5.OooOOO0(i2, true);
                                break;
                            }
                        } else {
                            if (c33704OooOOOO5.OooOO0O(i2, objOooOO0o2, C33689OooO.f121443OooOO0o)) {
                                objOooO0oo = OooOoo0.OooOo00.OooO0oo(objOooO0oo, ((C33714OooOoO) objOooOO0o2).f121499OooO00o);
                                c33704OooOOOO5.OooOOO0(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (c33704OooOOOO5.OooOO0O(i2, objOooOO0o2, C33689OooO.f121443OooOO0o)) {
                            c33704OooOOOO5.OooO();
                            break;
                        }
                    }
                }
            }
        }
        if (objOooO0oo != null) {
            if (!(objOooO0oo instanceof ArrayList)) {
                Oooo00o((o000OO) objOooO0oo, true);
                return c33704OooOOOO3;
            }
            ArrayList arrayList = (ArrayList) objOooO0oo;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                Oooo00o((o000OO) arrayList.get(size), true);
            }
        }
        return c33704OooOOOO3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        OooOoO0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOoo() {
        Object objOooO00o;
        if (OooOoo()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121464OooOooO;
        C33704OooOOOO<E> c33704OooOOOO = (C33704OooOOOO) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f121459OooOoO.getAndIncrement(this);
            long j = andIncrement / ((long) C33689OooO.f121434OooO0O0);
            if (OooOo() <= andIncrement) {
                if (c33704OooOOOO.f121950OooOoO0 < j && c33704OooOOOO.OooO0OO() != 0) {
                    OooOooO(j, c33704OooOOOO);
                }
                OooOoO0(this);
                return;
            }
            if (c33704OooOOOO.f121950OooOoO0 != j) {
                C33698OooO0oo c33698OooO0oo = C33698OooO0oo.f121478OooOo0o;
                while (true) {
                    objOooO00o = C33820OooO00o.OooO00o(c33704OooOOOO, j, c33698OooO0oo);
                    if (!C24969OooOO0.OooO0o0(objOooO00o)) {
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
                    } else {
                        break;
                    }
                }
                C33704OooOOOO<E> c33704OooOOOO2 = null;
                if (C24969OooOO0.OooO0o0(objOooO00o)) {
                    OooOO0();
                    OooOooO(j, c33704OooOOOO);
                    OooOoO0(this);
                } else {
                    C33704OooOOOO<E> c33704OooOOOO3 = (C33704OooOOOO) C24969OooOO0.OooO0Oo(objOooO00o);
                    long j2 = c33704OooOOOO3.f121950OooOoO0;
                    if (j2 > j) {
                        long j3 = j2 * ((long) C33689OooO.f121434OooO0O0);
                        if (f121459OooOoO.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f121461OooOoOO;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & Longs.MAX_POWER_OF_TWO) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & Longs.MAX_POWER_OF_TWO) != 0) {
                                }
                            }
                        } else {
                            OooOoO0(this);
                        }
                    } else {
                        c33704OooOOOO2 = c33704OooOOOO3;
                    }
                }
                if (c33704OooOOOO2 == null) {
                    continue;
                } else {
                    c33704OooOOOO = c33704OooOOOO2;
                }
            }
            int i = (int) (andIncrement % ((long) C33689OooO.f121434OooO0O0));
            Object objOooOO0o = c33704OooOOOO.OooOO0o(i);
            boolean z = objOooOO0o instanceof o000OO;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f121460OooOoO0;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !c33704OooOOOO.OooOO0O(i, objOooOO0o, C33689OooO.f121439OooO0oO)) {
                while (true) {
                    Object objOooOO0o2 = c33704OooOOOO.OooOO0o(i);
                    if (!(objOooOO0o2 instanceof o000OO)) {
                        if (objOooOO0o2 != C33689OooO.f121441OooOO0) {
                            if (objOooOO0o2 != null) {
                                if (objOooOO0o2 == C33689OooO.f121436OooO0Oo || objOooOO0o2 == C33689OooO.f121440OooO0oo || objOooOO0o2 == C33689OooO.f121432OooO || objOooOO0o2 == C33689OooO.f121442OooOO0O || objOooOO0o2 == C33689OooO.f121443OooOO0o) {
                                    break loop0;
                                }
                                if (objOooOO0o2 != C33689OooO.f121437OooO0o) {
                                    throw new IllegalStateException(("Unexpected cell state: " + objOooOO0o2).toString());
                                }
                            } else if (c33704OooOOOO.OooOO0O(i, objOooOO0o2, C33689OooO.f121438OooO0o0)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (c33704OooOOOO.OooOO0O(i, objOooOO0o2, new C33714OooOoO((o000OO) objOooOO0o2))) {
                            break loop0;
                        }
                    } else if (c33704OooOOOO.OooOO0O(i, objOooOO0o2, C33689OooO.f121439OooO0oO)) {
                        if (Oooo0O0(objOooOO0o2, c33704OooOOOO, i)) {
                            c33704OooOOOO.OooOOOO(i, C33689OooO.f121436OooO0Oo);
                            break;
                        } else {
                            c33704OooOOOO.OooOOOO(i, C33689OooO.f121441OooOO0);
                            c33704OooOOOO.OooO();
                        }
                    }
                }
            } else if (Oooo0O0(objOooOO0o, c33704OooOOOO, i)) {
                c33704OooOOOO.OooOOOO(i, C33689OooO.f121436OooO0Oo);
                break;
            } else {
                c33704OooOOOO.OooOOOO(i, C33689OooO.f121441OooOO0);
                c33704OooOOOO.OooO();
                OooOoO0(this);
            }
        }
    }

    public final long OooOo() {
        return f121458OooOo.get(this) & 1152921504606846975L;
    }

    public final Throwable OooOo0() {
        return (Throwable) f121465OooOooo.get(this);
    }

    public final C33704OooOOOO<E> OooOo00(long j, C33704OooOOOO<E> c33704OooOOOO) {
        Object objOooO00o;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        C33704OooOOOO<Object> c33704OooOOOO2 = C33689OooO.f121433OooO00o;
        C33698OooO0oo c33698OooO0oo = C33698OooO0oo.f121478OooOo0o;
        loop0: while (true) {
            objOooO00o = C33820OooO00o.OooO00o(c33704OooOOOO, j, c33698OooO0oo);
            if (!C24969OooOO0.OooO0o0(objOooO00o)) {
                AbstractC33837OooOOoo abstractC33837OooOOooOooO0Oo = C24969OooOO0.OooO0Oo(objOooO00o);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121462OooOoo;
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
        if (C24969OooOO0.OooO0o0(objOooO00o)) {
            OooOO0();
            if (c33704OooOOOO.f121950OooOoO0 * ((long) C33689OooO.f121434OooO0O0) < OooOo()) {
                c33704OooOOOO.OooO0O0();
                return null;
            }
        } else {
            C33704OooOOOO<E> c33704OooOOOO3 = (C33704OooOOOO) C24969OooOO0.OooO0Oo(objOooO00o);
            boolean zOooOoo = OooOoo();
            long j3 = c33704OooOOOO3.f121950OooOoO0;
            if (!zOooOoo && j <= f121459OooOoO.get(this) / ((long) C33689OooO.f121434OooO0O0)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f121464OooOooO;
                    AbstractC33837OooOOoo abstractC33837OooOOoo2 = (AbstractC33837OooOOoo) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC33837OooOOoo2.f121950OooOoO0 >= j3 || !c33704OooOOOO3.OooOO0()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC33837OooOOoo2, c33704OooOOOO3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != abstractC33837OooOOoo2) {
                            if (c33704OooOOOO3.OooO0o()) {
                                c33704OooOOOO3.OooO0o0();
                            }
                        }
                    }
                    if (abstractC33837OooOOoo2.OooO0o()) {
                        abstractC33837OooOOoo2.OooO0o0();
                    }
                }
            }
            if (j3 <= j) {
                return c33704OooOOOO3;
            }
            long j4 = j3 * ((long) C33689OooO.f121434OooO0O0);
            do {
                atomicLongFieldUpdater = f121460OooOoO0;
                j2 = atomicLongFieldUpdater.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j4));
            if (j3 * ((long) C33689OooO.f121434OooO0O0) < OooOo()) {
                c33704OooOOOO3.OooO0O0();
            }
        }
        return null;
    }

    public final Throwable OooOo0O() {
        Throwable thOooOo0 = OooOo0();
        return thOooOo0 == null ? new C33707OooOOo0("Channel was closed") : thOooOo0;
    }

    public final Throwable OooOo0o() {
        Throwable thOooOo0 = OooOo0();
        return thOooOo0 == null ? new C33706OooOOo("Channel was closed") : thOooOo0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (oO0o0OOo.C33704OooOOOO) ((oO0o0Ooo.AbstractC33821OooO0O0) oO0o0Ooo.AbstractC33821OooO0O0.f121914OooOo.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooOoO(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f121460OooOoO0;
            if (i == 2) {
                OooOOo0(1152921504606846975L & j);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121462OooOoo;
                        C33704OooOOOO<E> c33704OooOOOOOooOo00 = (C33704OooOOOO) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (OooOo() <= j2) {
                            break;
                        }
                        long j3 = C33689OooO.f121434OooO0O0;
                        long j4 = j2 / j3;
                        if (c33704OooOOOOOooOo00.f121950OooOoO0 != j4 && (c33704OooOOOOOooOo00 = OooOo00(j4, c33704OooOOOOOooOo00)) == null) {
                            if (((C33704OooOOOO) atomicReferenceFieldUpdater.get(this)).f121950OooOoO0 < j4) {
                                break;
                            }
                        } else {
                            c33704OooOOOOOooOo00.OooO0O0();
                            int i2 = (int) (j2 % j3);
                            while (true) {
                                Object objOooOO0o = c33704OooOOOOOooOo00.OooOO0o(i2);
                                if (objOooOO0o != null && objOooOO0o != C33689OooO.f121438OooO0o0) {
                                    if (objOooOO0o == C33689OooO.f121436OooO0Oo || (objOooOO0o != C33689OooO.f121441OooOO0 && objOooOO0o != C33689OooO.f121443OooOO0o && objOooOO0o != C33689OooO.f121432OooO && objOooOO0o != C33689OooO.f121440OooO0oo && (objOooOO0o == C33689OooO.f121439OooO0oO || (objOooOO0o != C33689OooO.f121437OooO0o && j2 == atomicLongFieldUpdater.get(this))))) {
                                        break;
                                    }
                                } else {
                                    if (c33704OooOOOOOooOo00.OooOO0O(i2, objOooOO0o, C33689OooO.f121440OooO0oo)) {
                                        OooOOoo();
                                        break;
                                    }
                                }
                            }
                            f121460OooOoO0.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "unexpected close status: ").toString());
                }
                C33704OooOOOO<E> c33704OooOOOOOooOOo0 = OooOOo0(1152921504606846975L & j);
                Object objOooO0oo = null;
                loop0: do {
                    int i3 = C33689OooO.f121434OooO0O0 - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (c33704OooOOOOOooOOo0.f121950OooOoO0 * ((long) C33689OooO.f121434OooO0O0)) + ((long) i3);
                        while (true) {
                            Object objOooOO0o2 = c33704OooOOOOOooOOo0.OooOO0o(i3);
                            if (objOooOO0o2 == C33689OooO.f121432OooO) {
                                break loop0;
                            }
                            if (objOooOO0o2 != C33689OooO.f121436OooO0Oo) {
                                if (objOooOO0o2 != C33689OooO.f121438OooO0o0 && objOooOO0o2 != null) {
                                    if (!(objOooOO0o2 instanceof o000OO) && !(objOooOO0o2 instanceof C33714OooOoO)) {
                                        C33839OooOo0 c33839OooOo0 = C33689OooO.f121439OooO0oO;
                                        if (objOooOO0o2 == c33839OooOo0 || objOooOO0o2 == C33689OooO.f121437OooO0o) {
                                            break loop0;
                                        }
                                        if (objOooOO0o2 != c33839OooOo0) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        o000OO o000oo2 = objOooOO0o2 instanceof C33714OooOoO ? ((C33714OooOoO) objOooOO0o2).f121499OooO00o : (o000OO) objOooOO0o2;
                                        if (c33704OooOOOOOooOOo0.OooOO0O(i3, objOooOO0o2, C33689OooO.f121443OooOO0o)) {
                                            objOooO0oo = OooOoo0.OooOo00.OooO0oo(objOooO0oo, o000oo2);
                                            c33704OooOOOOOooOOo0.OooOOO(i3, null);
                                            c33704OooOOOOOooOOo0.OooO();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c33704OooOOOOOooOOo0.OooOO0O(i3, objOooOO0o2, C33689OooO.f121443OooOO0o)) {
                                        c33704OooOOOOOooOOo0.OooO();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c33704OooOOOOOooOOo0.OooOO0O(i3, objOooOO0o2, C33689OooO.f121443OooOO0o)) {
                                    c33704OooOOOOOooOOo0.OooOOO(i3, null);
                                    c33704OooOOOOOooOOo0.OooO();
                                    break;
                                }
                            }
                        }
                        i3--;
                    }
                } while (c33704OooOOOOOooOOo0 != null);
                if (objOooO0oo != null) {
                    if (objOooO0oo instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objOooO0oo;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            Oooo00o((o000OO) arrayList.get(size), false);
                        }
                    } else {
                        Oooo00o((o000OO) objOooO0oo, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean OooOoOO() {
        return OooOoO(f121458OooOo.get(this), true);
    }

    public final boolean OooOoo() {
        long j = f121459OooOoO.get(this);
        return j == 0 || j == LocationRequestCompat.PASSIVE_INTERVAL;
    }

    public boolean OooOoo0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOooO(long j, C33704OooOOOO<E> c33704OooOOOO) {
        C33704OooOOOO<E> c33704OooOOOO2;
        C33704OooOOOO<E> c33704OooOOOO3;
        while (c33704OooOOOO.f121950OooOoO0 < j && (c33704OooOOOO3 = (C33704OooOOOO) c33704OooOOOO.OooO0OO()) != null) {
            c33704OooOOOO = c33704OooOOOO3;
        }
        while (true) {
            if (!c33704OooOOOO.OooO0Oo() || (c33704OooOOOO2 = (C33704OooOOOO) c33704OooOOOO.OooO0OO()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121464OooOooO;
                    AbstractC33837OooOOoo abstractC33837OooOOoo = (AbstractC33837OooOOoo) atomicReferenceFieldUpdater.get(this);
                    if (abstractC33837OooOOoo.f121950OooOoO0 >= c33704OooOOOO.f121950OooOoO0) {
                        return;
                    }
                    if (!c33704OooOOOO.OooOO0()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC33837OooOOoo, c33704OooOOOO)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC33837OooOOoo) {
                            if (c33704OooOOOO.OooO0o()) {
                                c33704OooOOOO.OooO0o0();
                            }
                        }
                    }
                    if (abstractC33837OooOOoo.OooO0o()) {
                        abstractC33837OooOOoo.OooO0o0();
                        return;
                    }
                    return;
                }
            }
            c33704OooOOOO = c33704OooOOOO2;
        }
    }

    public final Object OooOooo(E e, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
        c33614OooOOO0.OooOOoo();
        c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(OooOo0o()));
        Object objOooOOo = c33614OooOOO0.OooOOo();
        return objOooOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo : C32460OooOooO.f116667OooO00o;
    }

    public final boolean Oooo0(Object obj, E e) {
        if (obj instanceof InterfaceC33883OooO) {
            return ((InterfaceC33883OooO) obj).OooO0o0(this, e);
        }
        if (obj instanceof C33713OooOo0o) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return C33689OooO.OooO00o(((C33713OooOo0o) obj).f121498OooOo0o, new C33702OooOOO(e), null);
        }
        if (!(obj instanceof OooO00o)) {
            if (obj instanceof InterfaceC33611OooOO0O) {
                kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return C33689OooO.OooO00o((InterfaceC33611OooOO0O) obj, e, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        OooO00o oooO00o = (OooO00o) obj;
        C33614OooOOO0<? super Boolean> c33614OooOOO0 = oooO00o.f121468OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c33614OooOOO0);
        oooO00o.f121468OooOo = null;
        oooO00o.f121469OooOo0o = e;
        Boolean bool = Boolean.TRUE;
        C33695OooO0o0.this.getClass();
        return C33689OooO.OooO00o(c33614OooOOO0, bool, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo00O(C33704OooOOOO c33704OooOOOO, int i, long j, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33697OooO0oO c33697OooO0oO;
        C33704OooOOOO<E> c33704OooOOOO2;
        if (abstractC32479OooO0OO instanceof C33697OooO0oO) {
            c33697OooO0oO = (C33697OooO0oO) abstractC32479OooO0OO;
            int i2 = c33697OooO0oO.f121477OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c33697OooO0oO.f121477OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c33697OooO0oO = new C33697OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c33697OooO0oO.f121476OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c33697OooO0oO.f121477OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            c33697OooO0oO.f121477OooOoO0 = 1;
            C33614OooOOO0 c33614OooOOO0OooO0Oo = C25139OooOOOo.OooO0Oo(C21904OooOoo0.OooO0o0(c33697OooO0oO));
            try {
                C33713OooOo0o c33713OooOo0o = new C33713OooOo0o(c33614OooOOO0OooO0Oo);
                Object objOooo0OO = Oooo0OO(c33704OooOOOO, i, j, c33713OooOo0o);
                if (objOooo0OO == C33689OooO.f121445OooOOO0) {
                    c33713OooOo0o.OooO0OO(c33704OooOOOO, i);
                } else if (objOooo0OO == C33689OooO.f121446OooOOOO) {
                    if (j < OooOo()) {
                        c33704OooOOOO.OooO0O0();
                    }
                    C33704OooOOOO<E> c33704OooOOOO3 = (C33704OooOOOO) f121462OooOoo.get(this);
                    while (true) {
                        if (OooOoOO()) {
                            c33614OooOOO0OooO0Oo.resumeWith(new C33702OooOOO(new C33702OooOOO.OooO00o(OooOo0())));
                            break;
                        }
                        long andIncrement = f121460OooOoO0.getAndIncrement(this);
                        long j2 = C33689OooO.f121434OooO0O0;
                        long j3 = andIncrement / j2;
                        int i4 = (int) (andIncrement % j2);
                        if (c33704OooOOOO3.f121950OooOoO0 != j3) {
                            C33704OooOOOO<E> c33704OooOOOOOooOo00 = OooOo00(j3, c33704OooOOOO3);
                            if (c33704OooOOOOOooOo00 != null) {
                                c33704OooOOOO2 = c33704OooOOOOOooOo00;
                            }
                        } else {
                            c33704OooOOOO2 = c33704OooOOOO3;
                        }
                        Object objOooo0OO2 = Oooo0OO(c33704OooOOOO2, i4, andIncrement, c33713OooOo0o);
                        C33704OooOOOO<E> c33704OooOOOO4 = c33704OooOOOO2;
                        if (objOooo0OO2 == C33689OooO.f121445OooOOO0) {
                            c33713OooOo0o.OooO0OO(c33704OooOOOO4, i4);
                            break;
                        }
                        if (objOooo0OO2 == C33689OooO.f121446OooOOOO) {
                            if (andIncrement < OooOo()) {
                                c33704OooOOOO4.OooO0O0();
                            }
                            c33704OooOOOO3 = c33704OooOOOO4;
                        } else {
                            if (objOooo0OO2 == C33689OooO.f121444OooOOO) {
                                throw new IllegalStateException("unexpected");
                            }
                            c33704OooOOOO4.OooO0O0();
                            c33614OooOOO0OooO0Oo.OooOOOo(new C33702OooOOO(objOooo0OO2), null);
                        }
                    }
                } else {
                    c33704OooOOOO.OooO0O0();
                    c33614OooOOO0OooO0Oo.OooOOOo(new C33702OooOOO(objOooo0OO), null);
                }
                objOooOOo = c33614OooOOO0OooO0Oo.OooOOo();
                EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooOOo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } catch (Throwable th) {
                c33614OooOOO0OooO0Oo.OooOoo0();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        return ((C33702OooOOO) objOooOOo).f121484OooO00o;
    }

    public final void Oooo00o(o000OO o000oo2, boolean z) {
        if (o000oo2 instanceof OooO0O0) {
            ((OooO0O0) o000oo2).getClass();
            throw null;
        }
        if (o000oo2 instanceof InterfaceC33611OooOO0O) {
            ((Continuation) o000oo2).resumeWith(C32446OooOOOo.OooO00o(z ? OooOo0O() : OooOo0o()));
            return;
        }
        if (o000oo2 instanceof C33713OooOo0o) {
            ((C33713OooOo0o) o000oo2).f121498OooOo0o.resumeWith(new C33702OooOOO(new C33702OooOOO.OooO00o(OooOo0())));
            return;
        }
        if (!(o000oo2 instanceof OooO00o)) {
            if (o000oo2 instanceof InterfaceC33883OooO) {
                ((InterfaceC33883OooO) o000oo2).OooO0o0(this, C33689OooO.f121443OooOO0o);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + o000oo2).toString());
            }
        }
        OooO00o oooO00o = (OooO00o) o000oo2;
        C33614OooOOO0<? super Boolean> c33614OooOOO0 = oooO00o.f121468OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c33614OooOOO0);
        oooO00o.f121468OooOo = null;
        oooO00o.f121469OooOo0o = C33689OooO.f121443OooOO0o;
        Throwable thOooOo0 = C33695OooO0o0.this.OooOo0();
        if (thOooOo0 == null) {
            c33614OooOOO0.resumeWith(Boolean.FALSE);
        } else {
            c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(thOooOo0));
        }
    }

    public final boolean Oooo0O0(Object obj, C33704OooOOOO<E> c33704OooOOOO, int i) {
        EnumC33893OooOO0O enumC33893OooOO0O;
        if (obj instanceof InterfaceC33611OooOO0O) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return C33689OooO.OooO00o((InterfaceC33611OooOO0O) obj, C32460OooOooO.f116667OooO00o, null);
        }
        if (!(obj instanceof InterfaceC33883OooO)) {
            if (obj instanceof OooO0O0) {
                ((OooO0O0) obj).getClass();
                C33689OooO.OooO00o(null, Boolean.TRUE, null);
                throw null;
            }
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iOooOO0O = ((C33890OooO0oO) obj).OooOO0O(this, C32460OooOooO.f116667OooO00o);
        if (iOooOO0O == 0) {
            enumC33893OooOO0O = EnumC33893OooOO0O.f122091OooOo0o;
        } else if (iOooOO0O == 1) {
            enumC33893OooOO0O = EnumC33893OooOO0O.f122090OooOo;
        } else if (iOooOO0O == 2) {
            enumC33893OooOO0O = EnumC33893OooOO0O.f122093OooOoO0;
        } else {
            if (iOooOO0O != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iOooOO0O).toString());
            }
            enumC33893OooOO0O = EnumC33893OooOO0O.f122092OooOoO;
        }
        if (enumC33893OooOO0O == EnumC33893OooOO0O.f122090OooOo) {
            c33704OooOOOO.OooOOO(i, null);
        }
        return enumC33893OooOO0O == EnumC33893OooOO0O.f122091OooOo0o;
    }

    public final Object Oooo0OO(C33704OooOOOO<E> c33704OooOOOO, int i, long j, Object obj) {
        Object objOooOO0o = c33704OooOOOO.OooOO0o(i);
        AtomicReferenceArray atomicReferenceArray = c33704OooOOOO.f121487OooOoo0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f121458OooOo;
        if (objOooOO0o == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return C33689OooO.f121444OooOOO;
                }
                if (c33704OooOOOO.OooOO0O(i, objOooOO0o, obj)) {
                    OooOOoo();
                    return C33689OooO.f121445OooOOO0;
                }
            }
        } else if (objOooOO0o == C33689OooO.f121436OooO0Oo && c33704OooOOOO.OooOO0O(i, objOooOO0o, C33689OooO.f121432OooO)) {
            OooOOoo();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c33704OooOOOO.OooOOO(i, null);
            return obj2;
        }
        while (true) {
            Object objOooOO0o2 = c33704OooOOOO.OooOO0o(i);
            if (objOooOO0o2 == null || objOooOO0o2 == C33689OooO.f121438OooO0o0) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c33704OooOOOO.OooOO0O(i, objOooOO0o2, C33689OooO.f121440OooO0oo)) {
                        OooOOoo();
                        return C33689OooO.f121446OooOOOO;
                    }
                } else {
                    if (obj == null) {
                        return C33689OooO.f121444OooOOO;
                    }
                    if (c33704OooOOOO.OooOO0O(i, objOooOO0o2, obj)) {
                        OooOOoo();
                        return C33689OooO.f121445OooOOO0;
                    }
                }
            } else {
                if (objOooOO0o2 != C33689OooO.f121436OooO0Oo) {
                    C33839OooOo0 c33839OooOo0 = C33689OooO.f121441OooOO0;
                    if (objOooOO0o2 != c33839OooOo0 && objOooOO0o2 != C33689OooO.f121440OooO0oo) {
                        if (objOooOO0o2 == C33689OooO.f121443OooOO0o) {
                            OooOOoo();
                            return C33689OooO.f121446OooOOOO;
                        }
                        if (objOooOO0o2 != C33689OooO.f121439OooO0oO && c33704OooOOOO.OooOO0O(i, objOooOO0o2, C33689OooO.f121437OooO0o)) {
                            boolean z = objOooOO0o2 instanceof C33714OooOoO;
                            if (z) {
                                objOooOO0o2 = ((C33714OooOoO) objOooOO0o2).f121499OooO00o;
                            }
                            if (Oooo0O0(objOooOO0o2, c33704OooOOOO, i)) {
                                c33704OooOOOO.OooOOOO(i, C33689OooO.f121432OooO);
                                OooOOoo();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                c33704OooOOOO.OooOOO(i, null);
                                return obj3;
                            }
                            c33704OooOOOO.OooOOOO(i, c33839OooOo0);
                            c33704OooOOOO.OooO();
                            if (z) {
                                OooOOoo();
                            }
                            return C33689OooO.f121446OooOOOO;
                        }
                    }
                    return C33689OooO.f121446OooOOOO;
                }
                if (c33704OooOOOO.OooOO0O(i, objOooOO0o2, C33689OooO.f121432OooO)) {
                    OooOOoo();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    c33704OooOOOO.OooOOO(i, null);
                    return obj4;
                }
            }
        }
    }

    public final void Oooo0o(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C33695OooO0o0<E> c33695OooO0o0 = this;
        if (c33695OooO0o0.OooOoo()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f121459OooOoO;
            if (atomicLongFieldUpdater.get(c33695OooO0o0) > j) {
                break;
            } else {
                c33695OooO0o0 = this;
            }
        }
        int i = C33689OooO.f121435OooO0OO;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f121461OooOoOO;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(c33695OooO0o0);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c33695OooO0o0)) && j2 == atomicLongFieldUpdater.get(c33695OooO0o0)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(c33695OooO0o0);
                    if (atomicLongFieldUpdater2.compareAndSet(c33695OooO0o0, j3, (j3 & 4611686018427387903L) + Longs.MAX_POWER_OF_TWO)) {
                        break;
                    } else {
                        c33695OooO0o0 = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(c33695OooO0o0);
                    long j5 = atomicLongFieldUpdater2.get(c33695OooO0o0);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & Longs.MAX_POWER_OF_TWO) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c33695OooO0o0)) {
                        break;
                    }
                    if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, Longs.MAX_POWER_OF_TWO + j6);
                    }
                    c33695OooO0o0 = this;
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c33695OooO0o0);
                    if (atomicLongFieldUpdater2.compareAndSet(c33695OooO0o0, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        c33695OooO0o0 = this;
                    }
                }
            }
        }
    }

    public final int Oooo0o0(C33704OooOOOO<E> c33704OooOOOO, int i, E e, long j, Object obj, boolean z) {
        while (true) {
            Object objOooOO0o = c33704OooOOOO.OooOO0o(i);
            if (objOooOO0o == null) {
                if (!OooOOOO(j) || z) {
                    if (z) {
                        if (c33704OooOOOO.OooOO0O(i, null, C33689OooO.f121441OooOO0)) {
                            c33704OooOOOO.OooO();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (c33704OooOOOO.OooOO0O(i, null, obj)) {
                            return 2;
                        }
                    }
                } else if (c33704OooOOOO.OooOO0O(i, null, C33689OooO.f121436OooO0Oo)) {
                    break;
                }
            } else {
                if (objOooOO0o != C33689OooO.f121438OooO0o0) {
                    C33839OooOo0 c33839OooOo0 = C33689OooO.f121442OooOO0O;
                    if (objOooOO0o == c33839OooOo0) {
                        c33704OooOOOO.OooOOO(i, null);
                        return 5;
                    }
                    if (objOooOO0o == C33689OooO.f121440OooO0oo) {
                        c33704OooOOOO.OooOOO(i, null);
                        return 5;
                    }
                    if (objOooOO0o == C33689OooO.f121443OooOO0o) {
                        c33704OooOOOO.OooOOO(i, null);
                        OooOO0();
                        return 4;
                    }
                    c33704OooOOOO.OooOOO(i, null);
                    if (objOooOO0o instanceof C33714OooOoO) {
                        objOooOO0o = ((C33714OooOoO) objOooOO0o).f121499OooO00o;
                    }
                    if (Oooo0(objOooOO0o, e)) {
                        c33704OooOOOO.OooOOOO(i, C33689OooO.f121432OooO);
                        return 0;
                    }
                    if (c33704OooOOOO.f121487OooOoo0.getAndSet((i * 2) + 1, c33839OooOo0) != c33839OooOo0) {
                        c33704OooOOOO.OooOOO0(i, true);
                    }
                    return 5;
                }
                if (c33704OooOOOO.OooOO0O(i, objOooOO0o, C33689OooO.f121436OooO0Oo)) {
                    break;
                }
            }
        }
        return 1;
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        OooOOOo(true, cancellationException);
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final InterfaceC33701OooOO0o<E> iterator() {
        return new OooO00o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c1, code lost:
    
        r16 = r7;
        r3 = (oO0o0OOo.C33704OooOOOO) r3.OooO0OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ca, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z;
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (f121458OooOo.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f121467OooOo0o + ',');
        sb.append("data=[");
        int i2 = 0;
        boolean z2 = true;
        List listOooOO0o = C34429OooOOo0.OooOO0o(f121462OooOoo.get(this), f121463OooOoo0.get(this), f121464OooOooO.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOooOO0o) {
            if (((C33704OooOOOO) obj) != C33689OooO.f121433OooO00o) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((C33704OooOOOO) next).f121950OooOoO0;
            do {
                Object next2 = it.next();
                long j2 = ((C33704OooOOOO) next2).f121950OooOoO0;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        C33704OooOOOO c33704OooOOOO = (C33704OooOOOO) next;
        long j3 = f121460OooOoO0.get(this);
        long jOooOo = OooOo();
        loop2: while (true) {
            int i3 = C33689OooO.f121434OooO0O0;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j4 = (c33704OooOOOO.f121950OooOoO0 * ((long) C33689OooO.f121434OooO0O0)) + ((long) i4);
                if (j4 >= jOooOo && j4 >= j3) {
                    break loop2;
                }
                Object objOooOO0o = c33704OooOOOO.OooOO0o(i4);
                boolean z3 = z2;
                Object obj2 = c33704OooOOOO.f121487OooOoo0.get(i4 * 2);
                if (objOooOO0o instanceof InterfaceC33611OooOO0O) {
                    string = (j4 >= j3 || j4 < jOooOo) ? (j4 >= jOooOo || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objOooOO0o instanceof InterfaceC33883OooO) {
                    string = (j4 >= j3 || j4 < jOooOo) ? (j4 >= jOooOo || j4 < j3) ? "select" : "onSend" : "onReceive";
                } else if (objOooOO0o instanceof C33713OooOo0o) {
                    string = "receiveCatching";
                } else if (objOooOO0o instanceof OooO0O0) {
                    string = "sendBroadcast";
                } else if (objOooOO0o instanceof C33714OooOoO) {
                    string = "EB(" + objOooOO0o + ')';
                } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(objOooOO0o, C33689OooO.f121437OooO0o) || kotlin.jvm.internal.OooOOO0.OooO0O0(objOooOO0o, C33689OooO.f121439OooO0oO)) {
                    string = "resuming_sender";
                } else if (objOooOO0o == null || objOooOO0o.equals(C33689OooO.f121438OooO0o0) || objOooOO0o.equals(C33689OooO.f121432OooO) || objOooOO0o.equals(C33689OooO.f121440OooO0oo) || objOooOO0o.equals(C33689OooO.f121442OooOO0O) || objOooOO0o.equals(C33689OooO.f121441OooOO0) || objOooOO0o.equals(C33689OooO.f121443OooOO0o)) {
                    i4++;
                    z2 = z3;
                } else {
                    string = objOooOO0o.toString();
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i4++;
                z2 = z3;
            }
            z2 = z;
            i2 = 0;
        }
        if (C33600OooOo0o.Ooooooo(sb) == ',') {
            kotlin.jvm.internal.OooOOO0.OooO0o(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }
}
