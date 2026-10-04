package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import o0o0OO0.C30416Oooo0OO;
import oO0OOO0o.C32939OooO00o;
import oO0OOOo0.AbstractC33001OooO00o;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33023OooO00o;
import oO0OOOoo.InterfaceC33029OooO0oO;
import oO0OOOoo.InterfaceC33031OooOO0;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.AbstractC33500OooOOOo;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32978OooOOo0<T> extends oO0OOOOo.OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f119307OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AbstractC33500OooOOOo f119308OooOoO0;

    /* JADX INFO: renamed from: oO0OOOOo.OooOOo0$OooO00o */
    public static abstract class OooO00o<T> extends AbstractC33001OooO00o<T> implements InterfaceC33493OooO0oo<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f119309OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AbstractC33500OooOOOo.OooO0O0 f119310OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final AtomicLong f119311OooOoO = new AtomicLong();

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f119312OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public oOO00OOO.OooO0OO f119313OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public volatile boolean f119314OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public InterfaceC33031OooOO0<T> f119315OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public volatile boolean f119316OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public Throwable f119317OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public int f119318Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public long f119319Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public boolean f119320Oooo00o;

        public OooO00o(AbstractC33500OooOOOo.OooO0O0 oooO0O0, int i) {
            this.f119310OooOo0o = oooO0O0;
            this.f119309OooOo = i;
            this.f119312OooOoO0 = i - (i >> 2);
        }

        public final void OooO() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f119310OooOo0o.OooO0O0(this);
        }

        @Override // oO0OOOoo.InterfaceC33027OooO0o
        public final int OooO0O0(int i) {
            this.f119320Oooo00o = true;
            return 2;
        }

        public abstract void OooO0o();

        public final boolean OooO0o0(boolean z, boolean z2, oOO00OOO.OooO0O0<?> oooO0O0) {
            if (this.f119314OooOoo) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f119317OooOooo;
            if (th != null) {
                clear();
                oooO0O0.onError(th);
                this.f119310OooOo0o.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            oooO0O0.onComplete();
            this.f119310OooOo0o.dispose();
            return true;
        }

        public abstract void OooO0oO();

        public abstract void OooO0oo();

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            if (this.f119314OooOoo) {
                return;
            }
            this.f119314OooOoo = true;
            this.f119313OooOoOO.cancel();
            this.f119310OooOo0o.dispose();
            if (getAndIncrement() == 0) {
                this.f119315OooOoo0.clear();
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final void clear() {
            this.f119315OooOoo0.clear();
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final boolean isEmpty() {
            return this.f119315OooOoo0.isEmpty();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            if (this.f119316OooOooO) {
                return;
            }
            this.f119316OooOooO = true;
            OooO();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            if (this.f119316OooOooO) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            this.f119317OooOooo = th;
            this.f119316OooOooO = true;
            OooO();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f119316OooOooO) {
                return;
            }
            if (this.f119318Oooo000 == 2) {
                OooO();
                return;
            }
            if (!this.f119315OooOoo0.offer(t)) {
                this.f119313OooOoOO.cancel();
                this.f119317OooOooo = new oO00o00O.OooO0O0("Queue is full?!");
                this.f119316OooOooO = true;
            }
            OooO();
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            if (EnumC33007OooO0oO.OooO0OO(j)) {
                o00000.OooOO0.OooO0O0(this.f119311OooOoO, j);
                OooO();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f119320Oooo00o) {
                OooO0oO();
            } else if (this.f119318Oooo000 == 1) {
                OooO0oo();
            } else {
                OooO0o();
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooOOo0$OooO0O0 */
    public static final class OooO0O0<T> extends OooO00o<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final InterfaceC33023OooO00o<? super T> f119321Oooo0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public long f119322Oooo0O0;

        public OooO0O0(InterfaceC33023OooO00o interfaceC33023OooO00o, AbstractC33500OooOOOo.OooO0O0 oooO0O0, int i) {
            super(oooO0O0, i);
            this.f119321Oooo0 = interfaceC33023OooO00o;
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119313OooOoOO, oooO0OO)) {
                this.f119313OooOoOO = oooO0OO;
                if (oooO0OO instanceof InterfaceC33029OooO0oO) {
                    InterfaceC33029OooO0oO interfaceC33029OooO0oO = (InterfaceC33029OooO0oO) oooO0OO;
                    int iOooO0O0 = interfaceC33029OooO0oO.OooO0O0(7);
                    if (iOooO0O0 == 1) {
                        this.f119318Oooo000 = 1;
                        this.f119315OooOoo0 = interfaceC33029OooO0oO;
                        this.f119316OooOooO = true;
                        this.f119321Oooo0.OooO0Oo(this);
                        return;
                    }
                    if (iOooO0O0 == 2) {
                        this.f119318Oooo000 = 2;
                        this.f119315OooOoo0 = interfaceC33029OooO0oO;
                        this.f119321Oooo0.OooO0Oo(this);
                        oooO0OO.request(this.f119309OooOo);
                        return;
                    }
                }
                this.f119315OooOoo0 = new C32939OooO00o(this.f119309OooOo);
                this.f119321Oooo0.OooO0Oo(this);
                oooO0OO.request(this.f119309OooOo);
            }
        }

        @Override // oO0OOOOo.C32978OooOOo0.OooO00o
        public final void OooO0o() {
            InterfaceC33023OooO00o<? super T> interfaceC33023OooO00o = this.f119321Oooo0;
            InterfaceC33031OooOO0<T> interfaceC33031OooOO0 = this.f119315OooOoo0;
            long j = this.f119319Oooo00O;
            long j2 = this.f119322Oooo0O0;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.f119311OooOoO.get();
                while (j != j3) {
                    boolean z = this.f119316OooOooO;
                    try {
                        T tPoll = interfaceC33031OooOO0.poll();
                        boolean z2 = tPoll == null;
                        if (OooO0o0(z, z2, interfaceC33023OooO00o)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (interfaceC33023OooO00o.OooO0OO(tPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.f119312OooOoO0) {
                            this.f119313OooOoOO.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        C30416Oooo0OO.OooO00o(th);
                        this.f119313OooOoOO.cancel();
                        interfaceC33031OooOO0.clear();
                        interfaceC33023OooO00o.onError(th);
                        this.f119310OooOo0o.dispose();
                        return;
                    }
                }
                if (j == j3 && OooO0o0(this.f119316OooOooO, interfaceC33031OooOO0.isEmpty(), interfaceC33023OooO00o)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.f119319Oooo00O = j;
                    this.f119322Oooo0O0 = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // oO0OOOOo.C32978OooOOo0.OooO00o
        public final void OooO0oO() {
            int iAddAndGet = 1;
            while (!this.f119314OooOoo) {
                boolean z = this.f119316OooOooO;
                this.f119321Oooo0.onNext(null);
                if (z) {
                    Throwable th = this.f119317OooOooo;
                    if (th != null) {
                        this.f119321Oooo0.onError(th);
                    } else {
                        this.f119321Oooo0.onComplete();
                    }
                    this.f119310OooOo0o.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // oO0OOOOo.C32978OooOOo0.OooO00o
        public final void OooO0oo() {
            InterfaceC33023OooO00o<? super T> interfaceC33023OooO00o = this.f119321Oooo0;
            InterfaceC33031OooOO0<T> interfaceC33031OooOO0 = this.f119315OooOoo0;
            long j = this.f119319Oooo00O;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f119311OooOoO.get();
                while (j != j2) {
                    try {
                        T tPoll = interfaceC33031OooOO0.poll();
                        if (this.f119314OooOoo) {
                            return;
                        }
                        if (tPoll == null) {
                            interfaceC33023OooO00o.onComplete();
                            this.f119310OooOo0o.dispose();
                            return;
                        } else if (interfaceC33023OooO00o.OooO0OO(tPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        C30416Oooo0OO.OooO00o(th);
                        this.f119313OooOoOO.cancel();
                        interfaceC33023OooO00o.onError(th);
                        this.f119310OooOo0o.dispose();
                        return;
                    }
                }
                if (this.f119314OooOoo) {
                    return;
                }
                if (interfaceC33031OooOO0.isEmpty()) {
                    interfaceC33023OooO00o.onComplete();
                    this.f119310OooOo0o.dispose();
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.f119319Oooo00O = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() throws Exception {
            T tPoll = this.f119315OooOoo0.poll();
            if (tPoll != null && this.f119318Oooo000 != 1) {
                long j = this.f119322Oooo0O0 + 1;
                if (j == this.f119312OooOoO0) {
                    this.f119322Oooo0O0 = 0L;
                    this.f119313OooOoOO.request(j);
                    return tPoll;
                }
                this.f119322Oooo0O0 = j;
            }
            return tPoll;
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooOOo0$OooO0OO */
    public static final class OooO0OO<T> extends OooO00o<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119323Oooo0;

        public OooO0OO(InterfaceC33493OooO0oo interfaceC33493OooO0oo, AbstractC33500OooOOOo.OooO0O0 oooO0O0, int i) {
            super(oooO0O0, i);
            this.f119323Oooo0 = interfaceC33493OooO0oo;
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119313OooOoOO, oooO0OO)) {
                this.f119313OooOoOO = oooO0OO;
                if (oooO0OO instanceof InterfaceC33029OooO0oO) {
                    InterfaceC33029OooO0oO interfaceC33029OooO0oO = (InterfaceC33029OooO0oO) oooO0OO;
                    int iOooO0O0 = interfaceC33029OooO0oO.OooO0O0(7);
                    if (iOooO0O0 == 1) {
                        this.f119318Oooo000 = 1;
                        this.f119315OooOoo0 = interfaceC33029OooO0oO;
                        this.f119316OooOooO = true;
                        this.f119323Oooo0.OooO0Oo(this);
                        return;
                    }
                    if (iOooO0O0 == 2) {
                        this.f119318Oooo000 = 2;
                        this.f119315OooOoo0 = interfaceC33029OooO0oO;
                        this.f119323Oooo0.OooO0Oo(this);
                        oooO0OO.request(this.f119309OooOo);
                        return;
                    }
                }
                this.f119315OooOoo0 = new C32939OooO00o(this.f119309OooOo);
                this.f119323Oooo0.OooO0Oo(this);
                oooO0OO.request(this.f119309OooOo);
            }
        }

        @Override // oO0OOOOo.C32978OooOOo0.OooO00o
        public final void OooO0o() {
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119323Oooo0;
            InterfaceC33031OooOO0<T> interfaceC33031OooOO0 = this.f119315OooOoo0;
            long j = this.f119319Oooo00O;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f119311OooOoO.get();
                while (j != jAddAndGet) {
                    boolean z = this.f119316OooOooO;
                    try {
                        T tPoll = interfaceC33031OooOO0.poll();
                        boolean z2 = tPoll == null;
                        if (OooO0o0(z, z2, interfaceC33493OooO0oo)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        interfaceC33493OooO0oo.onNext(tPoll);
                        j++;
                        if (j == this.f119312OooOoO0) {
                            if (jAddAndGet != LocationRequestCompat.PASSIVE_INTERVAL) {
                                jAddAndGet = this.f119311OooOoO.addAndGet(-j);
                            }
                            this.f119313OooOoOO.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        C30416Oooo0OO.OooO00o(th);
                        this.f119313OooOoOO.cancel();
                        interfaceC33031OooOO0.clear();
                        interfaceC33493OooO0oo.onError(th);
                        this.f119310OooOo0o.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && OooO0o0(this.f119316OooOooO, interfaceC33031OooOO0.isEmpty(), interfaceC33493OooO0oo)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.f119319Oooo00O = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // oO0OOOOo.C32978OooOOo0.OooO00o
        public final void OooO0oO() {
            int iAddAndGet = 1;
            while (!this.f119314OooOoo) {
                boolean z = this.f119316OooOooO;
                this.f119323Oooo0.onNext(null);
                if (z) {
                    Throwable th = this.f119317OooOooo;
                    if (th != null) {
                        this.f119323Oooo0.onError(th);
                    } else {
                        this.f119323Oooo0.onComplete();
                    }
                    this.f119310OooOo0o.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // oO0OOOOo.C32978OooOOo0.OooO00o
        public final void OooO0oo() {
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119323Oooo0;
            InterfaceC33031OooOO0<T> interfaceC33031OooOO0 = this.f119315OooOoo0;
            long j = this.f119319Oooo00O;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f119311OooOoO.get();
                while (j != j2) {
                    try {
                        T tPoll = interfaceC33031OooOO0.poll();
                        if (this.f119314OooOoo) {
                            return;
                        }
                        if (tPoll == null) {
                            interfaceC33493OooO0oo.onComplete();
                            this.f119310OooOo0o.dispose();
                            return;
                        } else {
                            interfaceC33493OooO0oo.onNext(tPoll);
                            j++;
                        }
                    } catch (Throwable th) {
                        C30416Oooo0OO.OooO00o(th);
                        this.f119313OooOoOO.cancel();
                        interfaceC33493OooO0oo.onError(th);
                        this.f119310OooOo0o.dispose();
                        return;
                    }
                }
                if (this.f119314OooOoo) {
                    return;
                }
                if (interfaceC33031OooOO0.isEmpty()) {
                    interfaceC33493OooO0oo.onComplete();
                    this.f119310OooOo0o.dispose();
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.f119319Oooo00O = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() throws Exception {
            T tPoll = this.f119315OooOoo0.poll();
            if (tPoll != null && this.f119318Oooo000 != 1) {
                long j = this.f119319Oooo00O + 1;
                if (j == this.f119312OooOoO0) {
                    this.f119319Oooo00O = 0L;
                    this.f119313OooOoOO.request(j);
                    return tPoll;
                }
                this.f119319Oooo00O = j;
            }
            return tPoll;
        }
    }

    public C32978OooOOo0(AbstractC33491OooO0o0 abstractC33491OooO0o0, AbstractC33500OooOOOo abstractC33500OooOOOo, int i) {
        super(abstractC33491OooO0o0);
        this.f119308OooOoO0 = abstractC33500OooOOOo;
        this.f119307OooOoO = i;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        AbstractC33500OooOOOo.OooO0O0 oooO0O0OooO00o = this.f119308OooOoO0.OooO00o();
        boolean z = oooO0O0 instanceof InterfaceC33023OooO00o;
        int i = this.f119307OooOoO;
        AbstractC33491OooO0o0<T> abstractC33491OooO0o0 = this.f119186OooOo;
        if (z) {
            abstractC33491OooO0o0.OooO0OO(new OooO0O0((InterfaceC33023OooO00o) oooO0O0, oooO0O0OooO00o, i));
        } else {
            abstractC33491OooO0o0.OooO0OO(new OooO0OO((InterfaceC33493OooO0oo) oooO0O0, oooO0O0OooO00o, i));
        }
    }
}
