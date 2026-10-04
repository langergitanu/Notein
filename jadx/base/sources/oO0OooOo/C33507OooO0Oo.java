package oO0OooOo;

import Oooo0.C20871o0000Ooo;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import oO00o.AbstractC32314OooO00o;
import oO00o.AbstractC32318OooO0o;
import oO00o.InterfaceC32315OooO0O0;
import oO00oOO0.C32424OooO00o;
import oO00oOOo.AbstractC32426OooO00o;
import oO00oOOo.EnumC32427OooO0O0;
import oO00oOo0.C32430OooO00o;
import oO0o0OO.C33669o000oOoO;
import oOo00o0o.C34556OooO0O0;
import oOo00ooO.InterfaceC34569OooO00o;
import oOo00ooO.InterfaceC34572OooO0Oo;
import oOo00ooO.InterfaceC34575OooO0oO;

/* JADX INFO: renamed from: oO0OooOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33507OooO0Oo<T> extends AbstractC33504OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f121005OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AbstractC32318OooO0o f121006OooOoO0;

    /* JADX INFO: renamed from: oO0OooOo.OooO0Oo$OooO00o */
    public static abstract class OooO00o<T> extends AbstractC32426OooO00o<T> implements InterfaceC32315OooO0O0<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f121007OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AbstractC32318OooO0o.OooO0O0 f121008OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final AtomicLong f121009OooOoO = new AtomicLong();

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f121010OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public oOO00OOO.OooO0OO f121011OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public volatile boolean f121012OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public InterfaceC34575OooO0oO<T> f121013OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public volatile boolean f121014OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public Throwable f121015OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public int f121016Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public long f121017Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public boolean f121018Oooo00o;

        public OooO00o(AbstractC32318OooO0o.OooO0O0 oooO0O0, int i) {
            this.f121008OooOo0o = oooO0O0;
            this.f121007OooOo = i;
            this.f121010OooOoO0 = i - (i >> 2);
        }

        public final boolean OooO00o(boolean z, boolean z2, oOO00OOO.OooO0O0<?> oooO0O0) {
            if (this.f121012OooOoo) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f121015OooOooo;
            if (th != null) {
                this.f121012OooOoo = true;
                clear();
                oooO0O0.onError(th);
                this.f121008OooOo0o.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f121012OooOoo = true;
            oooO0O0.onComplete();
            this.f121008OooOo0o.dispose();
            return true;
        }

        @Override // oOo00ooO.InterfaceC34571OooO0OO
        public final int OooO0O0(int i) {
            this.f121018Oooo00o = true;
            return 2;
        }

        public abstract void OooO0o();

        public abstract void OooO0o0();

        public abstract void OooO0oO();

        public final void OooO0oo() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f121008OooOo0o.OooO0O0(this);
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            if (this.f121012OooOoo) {
                return;
            }
            this.f121012OooOoo = true;
            this.f121011OooOoOO.cancel();
            this.f121008OooOo0o.dispose();
            if (this.f121018Oooo00o || getAndIncrement() != 0) {
                return;
            }
            this.f121013OooOoo0.clear();
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final void clear() {
            this.f121013OooOoo0.clear();
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final boolean isEmpty() {
            return this.f121013OooOoo0.isEmpty();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            if (this.f121014OooOooO) {
                return;
            }
            this.f121014OooOooO = true;
            OooO0oo();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            if (this.f121014OooOooO) {
                C32430OooO00o.OooO00o(th);
                return;
            }
            this.f121015OooOooo = th;
            this.f121014OooOooO = true;
            OooO0oo();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f121014OooOooO) {
                return;
            }
            if (this.f121016Oooo000 == 2) {
                OooO0oo();
                return;
            }
            if (!this.f121013OooOoo0.offer(t)) {
                this.f121011OooOoOO.cancel();
                this.f121015OooOooo = new C34556OooO0O0("Queue is full?!");
                this.f121014OooOooO = true;
            }
            OooO0oo();
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            if (EnumC32427OooO0O0.OooO0OO(j)) {
                C20871o0000Ooo.OooO00o(this.f121009OooOoO, j);
                OooO0oo();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f121018Oooo00o) {
                OooO0o();
            } else if (this.f121016Oooo000 == 1) {
                OooO0oO();
            } else {
                OooO0o0();
            }
        }
    }

    /* JADX INFO: renamed from: oO0OooOo.OooO0Oo$OooO0O0 */
    public static final class OooO0O0<T> extends OooO00o<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final InterfaceC34569OooO00o<? super T> f121019Oooo0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public long f121020Oooo0O0;

        public OooO0O0(InterfaceC34569OooO00o interfaceC34569OooO00o, AbstractC32318OooO0o.OooO0O0 oooO0O0, int i) {
            super(oooO0O0, i);
            this.f121019Oooo0 = interfaceC34569OooO00o;
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC32427OooO0O0.OooO0Oo(this.f121011OooOoOO, oooO0OO)) {
                this.f121011OooOoOO = oooO0OO;
                if (oooO0OO instanceof InterfaceC34572OooO0Oo) {
                    InterfaceC34572OooO0Oo interfaceC34572OooO0Oo = (InterfaceC34572OooO0Oo) oooO0OO;
                    int iOooO0O0 = interfaceC34572OooO0Oo.OooO0O0(7);
                    if (iOooO0O0 == 1) {
                        this.f121016Oooo000 = 1;
                        this.f121013OooOoo0 = interfaceC34572OooO0Oo;
                        this.f121014OooOooO = true;
                        this.f121019Oooo0.OooO0Oo(this);
                        return;
                    }
                    if (iOooO0O0 == 2) {
                        this.f121016Oooo000 = 2;
                        this.f121013OooOoo0 = interfaceC34572OooO0Oo;
                        this.f121019Oooo0.OooO0Oo(this);
                        oooO0OO.request(this.f121007OooOo);
                        return;
                    }
                }
                this.f121013OooOoo0 = new C32424OooO00o(this.f121007OooOo);
                this.f121019Oooo0.OooO0Oo(this);
                oooO0OO.request(this.f121007OooOo);
            }
        }

        @Override // oO0OooOo.C33507OooO0Oo.OooO00o
        public final void OooO0o() {
            int iAddAndGet = 1;
            while (!this.f121012OooOoo) {
                boolean z = this.f121014OooOooO;
                this.f121019Oooo0.onNext(null);
                if (z) {
                    this.f121012OooOoo = true;
                    Throwable th = this.f121015OooOooo;
                    if (th != null) {
                        this.f121019Oooo0.onError(th);
                    } else {
                        this.f121019Oooo0.onComplete();
                    }
                    this.f121008OooOo0o.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // oO0OooOo.C33507OooO0Oo.OooO00o
        public final void OooO0o0() {
            InterfaceC34569OooO00o<? super T> interfaceC34569OooO00o = this.f121019Oooo0;
            InterfaceC34575OooO0oO<T> interfaceC34575OooO0oO = this.f121013OooOoo0;
            long j = this.f121017Oooo00O;
            long j2 = this.f121020Oooo0O0;
            int iAddAndGet = 1;
            do {
                long j3 = this.f121009OooOoO.get();
                while (j != j3) {
                    boolean z = this.f121014OooOooO;
                    try {
                        T tPoll = interfaceC34575OooO0oO.poll();
                        boolean z2 = tPoll == null;
                        if (OooO00o(z, z2, interfaceC34569OooO00o)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (interfaceC34569OooO00o.OooO0OO(tPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.f121010OooOoO0) {
                            this.f121011OooOoOO.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        C33669o000oOoO.OooO0O0(th);
                        this.f121012OooOoo = true;
                        this.f121011OooOoOO.cancel();
                        interfaceC34575OooO0oO.clear();
                        interfaceC34569OooO00o.onError(th);
                        this.f121008OooOo0o.dispose();
                        return;
                    }
                }
                if (j == j3 && OooO00o(this.f121014OooOooO, interfaceC34575OooO0oO.isEmpty(), interfaceC34569OooO00o)) {
                    return;
                }
                this.f121017Oooo00O = j;
                this.f121020Oooo0O0 = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // oO0OooOo.C33507OooO0Oo.OooO00o
        public final void OooO0oO() {
            InterfaceC34569OooO00o<? super T> interfaceC34569OooO00o = this.f121019Oooo0;
            InterfaceC34575OooO0oO<T> interfaceC34575OooO0oO = this.f121013OooOoo0;
            long j = this.f121017Oooo00O;
            int iAddAndGet = 1;
            do {
                long j2 = this.f121009OooOoO.get();
                while (j != j2) {
                    try {
                        T tPoll = interfaceC34575OooO0oO.poll();
                        if (this.f121012OooOoo) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f121012OooOoo = true;
                            interfaceC34569OooO00o.onComplete();
                            this.f121008OooOo0o.dispose();
                            return;
                        } else if (interfaceC34569OooO00o.OooO0OO(tPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        C33669o000oOoO.OooO0O0(th);
                        this.f121012OooOoo = true;
                        this.f121011OooOoOO.cancel();
                        interfaceC34569OooO00o.onError(th);
                        this.f121008OooOo0o.dispose();
                        return;
                    }
                }
                if (this.f121012OooOoo) {
                    return;
                }
                if (interfaceC34575OooO0oO.isEmpty()) {
                    this.f121012OooOoo = true;
                    interfaceC34569OooO00o.onComplete();
                    this.f121008OooOo0o.dispose();
                    return;
                }
                this.f121017Oooo00O = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final T poll() throws Throwable {
            T tPoll = this.f121013OooOoo0.poll();
            if (tPoll != null && this.f121016Oooo000 != 1) {
                long j = this.f121020Oooo0O0 + 1;
                if (j == this.f121010OooOoO0) {
                    this.f121020Oooo0O0 = 0L;
                    this.f121011OooOoOO.request(j);
                    return tPoll;
                }
                this.f121020Oooo0O0 = j;
            }
            return tPoll;
        }
    }

    /* JADX INFO: renamed from: oO0OooOo.OooO0Oo$OooO0OO */
    public static final class OooO0OO<T> extends OooO00o<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final InterfaceC32315OooO0O0 f121021Oooo0;

        public OooO0OO(InterfaceC32315OooO0O0 interfaceC32315OooO0O0, AbstractC32318OooO0o.OooO0O0 oooO0O0, int i) {
            super(oooO0O0, i);
            this.f121021Oooo0 = interfaceC32315OooO0O0;
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC32427OooO0O0.OooO0Oo(this.f121011OooOoOO, oooO0OO)) {
                this.f121011OooOoOO = oooO0OO;
                if (oooO0OO instanceof InterfaceC34572OooO0Oo) {
                    InterfaceC34572OooO0Oo interfaceC34572OooO0Oo = (InterfaceC34572OooO0Oo) oooO0OO;
                    int iOooO0O0 = interfaceC34572OooO0Oo.OooO0O0(7);
                    if (iOooO0O0 == 1) {
                        this.f121016Oooo000 = 1;
                        this.f121013OooOoo0 = interfaceC34572OooO0Oo;
                        this.f121014OooOooO = true;
                        this.f121021Oooo0.OooO0Oo(this);
                        return;
                    }
                    if (iOooO0O0 == 2) {
                        this.f121016Oooo000 = 2;
                        this.f121013OooOoo0 = interfaceC34572OooO0Oo;
                        this.f121021Oooo0.OooO0Oo(this);
                        oooO0OO.request(this.f121007OooOo);
                        return;
                    }
                }
                this.f121013OooOoo0 = new C32424OooO00o(this.f121007OooOo);
                this.f121021Oooo0.OooO0Oo(this);
                oooO0OO.request(this.f121007OooOo);
            }
        }

        @Override // oO0OooOo.C33507OooO0Oo.OooO00o
        public final void OooO0o() {
            int iAddAndGet = 1;
            while (!this.f121012OooOoo) {
                boolean z = this.f121014OooOooO;
                this.f121021Oooo0.onNext(null);
                if (z) {
                    this.f121012OooOoo = true;
                    Throwable th = this.f121015OooOooo;
                    if (th != null) {
                        this.f121021Oooo0.onError(th);
                    } else {
                        this.f121021Oooo0.onComplete();
                    }
                    this.f121008OooOo0o.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // oO0OooOo.C33507OooO0Oo.OooO00o
        public final void OooO0o0() {
            InterfaceC32315OooO0O0 interfaceC32315OooO0O0 = this.f121021Oooo0;
            InterfaceC34575OooO0oO<T> interfaceC34575OooO0oO = this.f121013OooOoo0;
            long j = this.f121017Oooo00O;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f121009OooOoO.get();
                while (j != jAddAndGet) {
                    boolean z = this.f121014OooOooO;
                    try {
                        T tPoll = interfaceC34575OooO0oO.poll();
                        boolean z2 = tPoll == null;
                        if (OooO00o(z, z2, interfaceC32315OooO0O0)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        interfaceC32315OooO0O0.onNext(tPoll);
                        j++;
                        if (j == this.f121010OooOoO0) {
                            if (jAddAndGet != LocationRequestCompat.PASSIVE_INTERVAL) {
                                jAddAndGet = this.f121009OooOoO.addAndGet(-j);
                            }
                            this.f121011OooOoOO.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        C33669o000oOoO.OooO0O0(th);
                        this.f121012OooOoo = true;
                        this.f121011OooOoOO.cancel();
                        interfaceC34575OooO0oO.clear();
                        interfaceC32315OooO0O0.onError(th);
                        this.f121008OooOo0o.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && OooO00o(this.f121014OooOooO, interfaceC34575OooO0oO.isEmpty(), interfaceC32315OooO0O0)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.f121017Oooo00O = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // oO0OooOo.C33507OooO0Oo.OooO00o
        public final void OooO0oO() {
            InterfaceC32315OooO0O0 interfaceC32315OooO0O0 = this.f121021Oooo0;
            InterfaceC34575OooO0oO<T> interfaceC34575OooO0oO = this.f121013OooOoo0;
            long j = this.f121017Oooo00O;
            int iAddAndGet = 1;
            do {
                long j2 = this.f121009OooOoO.get();
                while (j != j2) {
                    try {
                        T tPoll = interfaceC34575OooO0oO.poll();
                        if (this.f121012OooOoo) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f121012OooOoo = true;
                            interfaceC32315OooO0O0.onComplete();
                            this.f121008OooOo0o.dispose();
                            return;
                        }
                        interfaceC32315OooO0O0.onNext(tPoll);
                        j++;
                    } catch (Throwable th) {
                        C33669o000oOoO.OooO0O0(th);
                        this.f121012OooOoo = true;
                        this.f121011OooOoOO.cancel();
                        interfaceC32315OooO0O0.onError(th);
                        this.f121008OooOo0o.dispose();
                        return;
                    }
                }
                if (this.f121012OooOoo) {
                    return;
                }
                if (interfaceC34575OooO0oO.isEmpty()) {
                    this.f121012OooOoo = true;
                    interfaceC32315OooO0O0.onComplete();
                    this.f121008OooOo0o.dispose();
                    return;
                }
                this.f121017Oooo00O = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final T poll() throws Throwable {
            T tPoll = this.f121013OooOoo0.poll();
            if (tPoll != null && this.f121016Oooo000 != 1) {
                long j = this.f121017Oooo00O + 1;
                if (j == this.f121010OooOoO0) {
                    this.f121017Oooo00O = 0L;
                    this.f121011OooOoOO.request(j);
                    return tPoll;
                }
                this.f121017Oooo00O = j;
            }
            return tPoll;
        }
    }

    public C33507OooO0Oo(AbstractC32314OooO00o abstractC32314OooO00o, AbstractC32318OooO0o abstractC32318OooO0o, int i) {
        super(abstractC32314OooO00o);
        this.f121006OooOoO0 = abstractC32318OooO0o;
        this.f121005OooOoO = i;
    }

    @Override // oO00o.AbstractC32314OooO00o
    public final void OooO0O0(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        AbstractC32318OooO0o.OooO0O0 oooO0O0OooO00o = this.f121006OooOoO0.OooO00o();
        boolean z = oooO0O0 instanceof InterfaceC34569OooO00o;
        int i = this.f121005OooOoO;
        AbstractC32314OooO00o<T> abstractC32314OooO00o = this.f121000OooOo;
        if (z) {
            abstractC32314OooO00o.OooO00o(new OooO0O0((InterfaceC34569OooO00o) oooO0O0, oooO0O0OooO00o, i));
        } else {
            abstractC32314OooO00o.OooO00o(new OooO0OO((InterfaceC32315OooO0O0) oooO0O0, oooO0O0OooO00o, i));
        }
    }
}
