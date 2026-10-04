package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO0OOO0o.C32939OooO00o;
import oO0OOOo0.AbstractC33001OooO00o;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33022OooO;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32977OooOOo<T> extends oO0OOOOo.OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f119295OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f119296OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o.OooO0O0 f119297OooOoOO;

    /* JADX INFO: renamed from: oO0OOOOo.OooOOo$OooO00o */
    public static final class OooO00o<T> extends AbstractC33001OooO00o<T> implements InterfaceC33493OooO0oo<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC33022OooO<T> f119298OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119299OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public oOO00OOO.OooO0OO f119300OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final OooO00o.OooO0O0 f119301OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public volatile boolean f119302OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public Throwable f119303OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public volatile boolean f119304OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final AtomicLong f119305OooOooO = new AtomicLong();

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public boolean f119306OooOooo;

        public OooO00o(InterfaceC33493OooO0oo interfaceC33493OooO0oo, int i, boolean z, OooO00o.OooO0O0 oooO0O0) {
            this.f119299OooOo0o = interfaceC33493OooO0oo;
            this.f119301OooOoO0 = oooO0O0;
            this.f119298OooOo = z ? new oO0OOO0o.OooO0O0<>(i) : new C32939OooO00o<>(i);
        }

        @Override // oO0OOOoo.InterfaceC33027OooO0o
        public final int OooO0O0(int i) {
            this.f119306OooOooo = true;
            return 2;
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119300OooOoO, oooO0OO)) {
                this.f119300OooOoO = oooO0OO;
                this.f119299OooOo0o.OooO0Oo(this);
                oooO0OO.request(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        public final void OooO0o() throws Exception {
            if (getAndIncrement() == 0) {
                InterfaceC33022OooO<T> interfaceC33022OooO = this.f119298OooOo;
                InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119299OooOo0o;
                int iAddAndGet = 1;
                while (!OooO0o0(this.f119304OooOoo0, interfaceC33022OooO.isEmpty(), interfaceC33493OooO0oo)) {
                    long j = this.f119305OooOooO.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f119304OooOoo0;
                        T tPoll = interfaceC33022OooO.poll();
                        boolean z2 = tPoll == null;
                        if (OooO0o0(z, z2, interfaceC33493OooO0oo)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        interfaceC33493OooO0oo.onNext(tPoll);
                        j2++;
                    }
                    if (j2 == j && OooO0o0(this.f119304OooOoo0, interfaceC33022OooO.isEmpty(), interfaceC33493OooO0oo)) {
                        return;
                    }
                    if (j2 != 0 && j != LocationRequestCompat.PASSIVE_INTERVAL) {
                        this.f119305OooOooO.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public final boolean OooO0o0(boolean z, boolean z2, oOO00OOO.OooO0O0<? super T> oooO0O0) {
            if (this.f119302OooOoOO) {
                this.f119298OooOo.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f119303OooOoo;
            if (th != null) {
                this.f119298OooOo.clear();
                oooO0O0.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            oooO0O0.onComplete();
            return true;
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            if (this.f119302OooOoOO) {
                return;
            }
            this.f119302OooOoOO = true;
            this.f119300OooOoO.cancel();
            if (getAndIncrement() == 0) {
                this.f119298OooOo.clear();
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final void clear() {
            this.f119298OooOo.clear();
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final boolean isEmpty() {
            return this.f119298OooOo.isEmpty();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() throws Exception {
            this.f119304OooOoo0 = true;
            if (this.f119306OooOooo) {
                this.f119299OooOo0o.onComplete();
            } else {
                OooO0o();
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) throws Exception {
            this.f119303OooOoo = th;
            this.f119304OooOoo0 = true;
            if (this.f119306OooOooo) {
                this.f119299OooOo0o.onError(th);
            } else {
                OooO0o();
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) throws Exception {
            if (this.f119298OooOo.offer(t)) {
                if (this.f119306OooOooo) {
                    this.f119299OooOo0o.onNext(null);
                    return;
                } else {
                    OooO0o();
                    return;
                }
            }
            this.f119300OooOoO.cancel();
            oO00o00O.OooO0O0 oooO0O0 = new oO00o00O.OooO0O0("Buffer is full");
            try {
                this.f119301OooOoO0.getClass();
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                oooO0O0.initCause(th);
            }
            onError(oooO0O0);
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() throws Exception {
            return this.f119298OooOo.poll();
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) throws Exception {
            if (this.f119306OooOooo || !EnumC33007OooO0oO.OooO0OO(j)) {
                return;
            }
            o00000.OooOO0.OooO0O0(this.f119305OooOooO, j);
            OooO0o();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32977OooOOo(OooOOO oooOOO, int i) {
        super(oooOOO);
        OooO00o.OooO0O0 oooO0O0 = oO00o0.OooO00o.f116237OooO0OO;
        this.f119296OooOoO0 = i;
        this.f119295OooOoO = true;
        this.f119297OooOoOO = oooO0O0;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        this.f119186OooOo.OooO0OO(new OooO00o((InterfaceC33493OooO0oo) oooO0O0, this.f119296OooOoO0, this.f119295OooOoO, this.f119297OooOoOO));
    }
}
