package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO00o0oO.C32390OooO0o;
import oO0OOO0o.C32939OooO00o;
import oO0OOOo0.AbstractC33001OooO00o;
import oO0OOOo0.EnumC33004OooO0Oo;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33029OooO0oO;
import oO0OOOoo.InterfaceC33031OooOO0;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O<T, R> extends oO0OOOOo.OooO00o<T, R> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f119260OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o.OooO0o f119261OooOoO0;

    public static final class OooO00o<T, R> extends AbstractC33001OooO00o<R> implements InterfaceC33493OooO0oo<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o.OooO0o f119262OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119263OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final int f119264OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f119265OooOoO0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public InterfaceC33031OooOO0<T> f119267OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public oOO00OOO.OooO0OO f119268OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public volatile boolean f119269OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public volatile boolean f119270OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public int f119271Oooo0;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public Iterator<? extends R> f119273Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int f119274Oooo00o;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public final AtomicReference<Throwable> f119272Oooo000 = new AtomicReference<>();

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final AtomicLong f119266OooOoOO = new AtomicLong();

        public OooO00o(InterfaceC33493OooO0oo interfaceC33493OooO0oo, OooO00o.OooO0o oooO0o, int i) {
            this.f119263OooOo0o = interfaceC33493OooO0oo;
            this.f119262OooOo = oooO0o;
            this.f119265OooOoO0 = i;
            this.f119264OooOoO = i - (i >> 2);
        }

        @Override // oO0OOOoo.InterfaceC33027OooO0o
        public final int OooO0O0(int i) {
            return this.f119271Oooo0 == 1 ? 1 : 0;
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119268OooOoo0, oooO0OO)) {
                this.f119268OooOoo0 = oooO0OO;
                if (oooO0OO instanceof InterfaceC33029OooO0oO) {
                    InterfaceC33029OooO0oO interfaceC33029OooO0oO = (InterfaceC33029OooO0oO) oooO0OO;
                    int iOooO0O0 = interfaceC33029OooO0oO.OooO0O0(3);
                    if (iOooO0O0 == 1) {
                        this.f119271Oooo0 = iOooO0O0;
                        this.f119267OooOoo = interfaceC33029OooO0oO;
                        this.f119269OooOooO = true;
                        this.f119263OooOo0o.OooO0Oo(this);
                        return;
                    }
                    if (iOooO0O0 == 2) {
                        this.f119271Oooo0 = iOooO0O0;
                        this.f119267OooOoo = interfaceC33029OooO0oO;
                        this.f119263OooOo0o.OooO0Oo(this);
                        oooO0OO.request(this.f119265OooOoO0);
                        return;
                    }
                }
                this.f119267OooOoo = new C32939OooO00o(this.f119265OooOoO0);
                this.f119263OooOo0o.OooO0Oo(this);
                oooO0OO.request(this.f119265OooOoO0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0o() {
            int i;
            long j;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119263OooOo0o;
            InterfaceC33031OooOO0<T> interfaceC33031OooOO0 = this.f119267OooOoo;
            int i2 = 1;
            boolean z = this.f119271Oooo0 != 1;
            Iterator<? extends R> it = this.f119273Oooo00O;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z2 = this.f119269OooOooO;
                    try {
                        T tPoll = interfaceC33031OooOO0.poll();
                        if (OooO0o0(z2, tPoll == null ? i2 : 0, interfaceC33493OooO0oo, interfaceC33031OooOO0)) {
                            return;
                        }
                        if (tPoll != null) {
                            try {
                                this.f119262OooOo.getClass();
                                it = ((Iterable) tPoll).iterator();
                                if (it.hasNext()) {
                                    this.f119273Oooo00O = it;
                                } else {
                                    if (z) {
                                        int i3 = this.f119274Oooo00o + i2;
                                        if (i3 == this.f119264OooOoO) {
                                            this.f119274Oooo00o = 0;
                                            this.f119268OooOoo0.request(i3);
                                        } else {
                                            this.f119274Oooo00o = i3;
                                        }
                                    }
                                    it = null;
                                }
                            } catch (Throwable th) {
                                C30416Oooo0OO.OooO00o(th);
                                this.f119268OooOoo0.cancel();
                                C32390OooO0o.OooO00o(this.f119272Oooo000, th);
                                interfaceC33493OooO0oo.onError(C32390OooO0o.OooO0O0(this.f119272Oooo000));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        C30416Oooo0OO.OooO00o(th2);
                        this.f119268OooOoo0.cancel();
                        C32390OooO0o.OooO00o(this.f119272Oooo000, th2);
                        Throwable thOooO0O0 = C32390OooO0o.OooO0O0(this.f119272Oooo000);
                        this.f119273Oooo00O = null;
                        interfaceC33031OooOO0.clear();
                        interfaceC33493OooO0oo.onError(thOooO0O0);
                        return;
                    }
                }
                if (it != null) {
                    long j2 = this.f119266OooOoOO.get();
                    long j3 = 0;
                    while (true) {
                        if (j3 == j2) {
                            i = i2;
                            j = 0;
                            break;
                        }
                        if (OooO0o0(this.f119269OooOooO, false, interfaceC33493OooO0oo, interfaceC33031OooOO0)) {
                            return;
                        }
                        try {
                            R next = it.next();
                            i = i2;
                            o00Oo0.OooO00o(next, "The iterator returned a null value");
                            interfaceC33493OooO0oo.onNext(next);
                            if (OooO0o0(this.f119269OooOooO, false, interfaceC33493OooO0oo, interfaceC33031OooOO0)) {
                                return;
                            }
                            j3++;
                            try {
                                if (it.hasNext()) {
                                    i2 = i;
                                } else {
                                    if (z) {
                                        int i4 = this.f119274Oooo00o + 1;
                                        if (i4 == this.f119264OooOoO) {
                                            this.f119274Oooo00o = 0;
                                            j = 0;
                                            this.f119268OooOoo0.request(i4);
                                        } else {
                                            j = 0;
                                            this.f119274Oooo00o = i4;
                                        }
                                    } else {
                                        j = 0;
                                    }
                                    this.f119273Oooo00O = null;
                                    it = null;
                                }
                            } catch (Throwable th3) {
                                C30416Oooo0OO.OooO00o(th3);
                                this.f119273Oooo00O = null;
                                this.f119268OooOoo0.cancel();
                                C32390OooO0o.OooO00o(this.f119272Oooo000, th3);
                                interfaceC33493OooO0oo.onError(C32390OooO0o.OooO0O0(this.f119272Oooo000));
                                return;
                            }
                        } catch (Throwable th4) {
                            C30416Oooo0OO.OooO00o(th4);
                            this.f119273Oooo00O = null;
                            this.f119268OooOoo0.cancel();
                            C32390OooO0o.OooO00o(this.f119272Oooo000, th4);
                            interfaceC33493OooO0oo.onError(C32390OooO0o.OooO0O0(this.f119272Oooo000));
                            return;
                        }
                    }
                    if (j3 == j2) {
                        if (OooO0o0(this.f119269OooOooO, (interfaceC33031OooOO0.isEmpty() && it == null) ? i : 0, interfaceC33493OooO0oo, interfaceC33031OooOO0)) {
                            return;
                        }
                    }
                    if (j3 != j && j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                        this.f119266OooOoOO.addAndGet(-j3);
                    }
                    if (it != null) {
                    }
                    i2 = i;
                } else {
                    i = i2;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                i2 = i;
            }
        }

        public final boolean OooO0o0(boolean z, boolean z2, InterfaceC33493OooO0oo interfaceC33493OooO0oo, InterfaceC33031OooOO0 interfaceC33031OooOO0) {
            if (this.f119270OooOooo) {
                this.f119273Oooo00O = null;
                interfaceC33031OooOO0.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f119272Oooo000.get() == null) {
                if (!z2) {
                    return false;
                }
                interfaceC33493OooO0oo.onComplete();
                return true;
            }
            Throwable thOooO0O0 = C32390OooO0o.OooO0O0(this.f119272Oooo000);
            this.f119273Oooo00O = null;
            interfaceC33031OooOO0.clear();
            interfaceC33493OooO0oo.onError(thOooO0O0);
            return true;
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            if (this.f119270OooOooo) {
                return;
            }
            this.f119270OooOooo = true;
            this.f119268OooOoo0.cancel();
            if (getAndIncrement() == 0) {
                this.f119267OooOoo.clear();
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final void clear() {
            this.f119273Oooo00O = null;
            this.f119267OooOoo.clear();
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final boolean isEmpty() {
            return this.f119273Oooo00O == null && this.f119267OooOoo.isEmpty();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            if (this.f119269OooOooO) {
                return;
            }
            this.f119269OooOooO = true;
            OooO0o();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            if (this.f119269OooOooO || !C32390OooO0o.OooO00o(this.f119272Oooo000, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                this.f119269OooOooO = true;
                OooO0o();
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f119269OooOooO) {
                return;
            }
            if (this.f119271Oooo0 != 0 || this.f119267OooOoo.offer(t)) {
                OooO0o();
            } else {
                onError(new oO00o00O.OooO0O0("Queue is full?!"));
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final R poll() throws Exception {
            Iterator<? extends R> it = this.f119273Oooo00O;
            while (true) {
                if (it == null) {
                    T tPoll = this.f119267OooOoo.poll();
                    if (tPoll != null) {
                        this.f119262OooOo.getClass();
                        it = ((Iterable) tPoll).iterator();
                        if (it.hasNext()) {
                            this.f119273Oooo00O = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R next = it.next();
            o00Oo0.OooO00o(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f119273Oooo00O = null;
            }
            return next;
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            if (EnumC33007OooO0oO.OooO0OO(j)) {
                o00000.OooOO0.OooO0O0(this.f119266OooOoOO, j);
                OooO0o();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(C32976OooOOOo c32976OooOOOo, int i) {
        super(c32976OooOOOo);
        OooO00o.OooO0o oooO0o = oO00o0.OooO00o.f116235OooO00o;
        this.f119261OooOoO0 = oooO0o;
        this.f119260OooOoO = i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super R> oooO0O0) {
        AbstractC33491OooO0o0<T> abstractC33491OooO0o0 = this.f119186OooOo;
        boolean z = abstractC33491OooO0o0 instanceof Callable;
        OooO00o.OooO0o oooO0o = this.f119261OooOoO0;
        if (!z) {
            abstractC33491OooO0o0.OooO0OO(new OooO00o((InterfaceC33493OooO0oo) oooO0O0, oooO0o, this.f119260OooOoO));
            return;
        }
        try {
            Object objCall = ((Callable) abstractC33491OooO0o0).call();
            if (objCall == null) {
                EnumC33004OooO0Oo.OooO00o((InterfaceC33493OooO0oo) oooO0O0);
                return;
            }
            try {
                oooO0o.getClass();
                OooOOO0.OooO0o0((InterfaceC33493OooO0oo) oooO0O0, ((Iterable) objCall).iterator());
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                EnumC33004OooO0Oo.OooO0OO(th, (InterfaceC33493OooO0oo) oooO0O0);
            }
        } catch (Throwable th2) {
            C30416Oooo0OO.OooO00o(th2);
            EnumC33004OooO0Oo.OooO0OO(th2, (InterfaceC33493OooO0oo) oooO0O0);
        }
    }
}
