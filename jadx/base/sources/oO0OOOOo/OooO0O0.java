package oO0OOOOo;

import com.google.firebase.inappmessaging.internal.C22738OooOoO;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o0oO.C32388OooO0OO;
import oO00o0oO.C32390OooO0o;
import oO00o0oO.EnumC32391OooO0o0;
import oO0OOO0o.C32939OooO00o;
import oO0OOOo0.C33005OooO0o;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33029OooO0oO;
import oO0OOOoo.InterfaceC33031OooOO0;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0<T, R> extends oO0OOOOo.OooO00o<T, R> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f119187OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C22738OooOoO f119188OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final EnumC32391OooO0o0 f119189OooOoOO;

    public static abstract class OooO00o<T, R> extends AtomicInteger implements InterfaceC33493OooO0oo<T>, OooO0o0<R>, oOO00OOO.OooO0OO {
        private static final long serialVersionUID = -3511336836796789179L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C22738OooOoO f119190OooOo;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final int f119192OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f119193OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public oOO00OOO.OooO0OO f119194OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public InterfaceC33031OooOO0<T> f119195OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f119196OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public volatile boolean f119197OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public volatile boolean f119198OooOooo;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public volatile boolean f119200Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int f119201Oooo00o;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C32968OooO0Oo<R> f119191OooOo0o = new C32968OooO0Oo<>(this);

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public final C32388OooO0OO f119199Oooo000 = new C32388OooO0OO();

        public OooO00o(C22738OooOoO c22738OooOoO, int i) {
            this.f119190OooOo = c22738OooOoO;
            this.f119193OooOoO0 = i;
            this.f119192OooOoO = i;
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119194OooOoOO, oooO0OO)) {
                this.f119194OooOoOO = oooO0OO;
                if (oooO0OO instanceof InterfaceC33029OooO0oO) {
                    InterfaceC33029OooO0oO interfaceC33029OooO0oO = (InterfaceC33029OooO0oO) oooO0OO;
                    int iOooO0O0 = interfaceC33029OooO0oO.OooO0O0(3);
                    if (iOooO0O0 == 1) {
                        this.f119201Oooo00o = iOooO0O0;
                        this.f119195OooOoo = interfaceC33029OooO0oO;
                        this.f119197OooOooO = true;
                        OooO0o();
                        OooO0o0();
                        return;
                    }
                    if (iOooO0O0 == 2) {
                        this.f119201Oooo00o = iOooO0O0;
                        this.f119195OooOoo = interfaceC33029OooO0oO;
                        OooO0o();
                        oooO0OO.request(this.f119193OooOoO0);
                        return;
                    }
                }
                this.f119195OooOoo = new C32939OooO00o(this.f119193OooOoO0);
                OooO0o();
                oooO0OO.request(this.f119193OooOoO0);
            }
        }

        public abstract void OooO0o();

        public abstract void OooO0o0();

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            this.f119197OooOooO = true;
            OooO0o0();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f119201Oooo00o == 2 || this.f119195OooOoo.offer(t)) {
                OooO0o0();
            } else {
                this.f119194OooOoOO.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20290OooO0O0<T, R> extends OooO00o<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119202Oooo0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public final boolean f119203Oooo0O0;

        public C20290OooO0O0(InterfaceC33493OooO0oo interfaceC33493OooO0oo, C22738OooOoO c22738OooOoO, int i, boolean z) {
            super(c22738OooOoO, i);
            this.f119202Oooo0 = interfaceC33493OooO0oo;
            this.f119203Oooo0O0 = z;
        }

        @Override // oO0OOOOo.OooO0O0.OooO0o0
        public final void OooO00o(Throwable th) {
            C32388OooO0OO c32388OooO0OO = this.f119199Oooo000;
            c32388OooO0OO.getClass();
            if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            if (!this.f119203Oooo0O0) {
                this.f119194OooOoOO.cancel();
                this.f119197OooOooO = true;
            }
            this.f119200Oooo00O = false;
            OooO0o0();
        }

        @Override // oO0OOOOo.OooO0O0.OooO0o0
        public final void OooO0O0(R r) {
            this.f119202Oooo0.onNext(r);
        }

        @Override // oO0OOOOo.OooO0O0.OooO00o
        public final void OooO0o() {
            this.f119202Oooo0.OooO0Oo(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0OOOOo.OooO0O0.OooO00o
        public final void OooO0o0() {
            if (getAndIncrement() == 0) {
                while (!this.f119198OooOooo) {
                    if (!this.f119200Oooo00O) {
                        boolean z = this.f119197OooOooO;
                        if (z && !this.f119203Oooo0O0 && this.f119199Oooo000.get() != null) {
                            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119202Oooo0;
                            C32388OooO0OO c32388OooO0OO = this.f119199Oooo000;
                            c32388OooO0OO.getClass();
                            interfaceC33493OooO0oo.onError(C32390OooO0o.OooO0O0(c32388OooO0OO));
                            return;
                        }
                        try {
                            T tPoll = this.f119195OooOoo.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                C32388OooO0OO c32388OooO0OO2 = this.f119199Oooo000;
                                c32388OooO0OO2.getClass();
                                Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO2);
                                if (thOooO0O0 != null) {
                                    this.f119202Oooo0.onError(thOooO0O0);
                                    return;
                                } else {
                                    this.f119202Oooo0.onComplete();
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    Object objApply = this.f119190OooOo.apply(tPoll);
                                    o00Oo0.OooO00o(objApply, "The mapper returned a null Publisher");
                                    oOO00OOO.OooO00o oooO00o = (oOO00OOO.OooO00o) objApply;
                                    if (this.f119201Oooo00o != 1) {
                                        int i = this.f119196OooOoo0 + 1;
                                        if (i == this.f119192OooOoO) {
                                            this.f119196OooOoo0 = 0;
                                            this.f119194OooOoOO.request(i);
                                        } else {
                                            this.f119196OooOoo0 = i;
                                        }
                                    }
                                    if (oooO00o instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) oooO00o).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (this.f119191OooOo0o.f119397OooOoo) {
                                                this.f119202Oooo0.onNext(objCall);
                                            } else {
                                                this.f119200Oooo00O = true;
                                                C32968OooO0Oo<R> c32968OooO0Oo = this.f119191OooOo0o;
                                                c32968OooO0Oo.OooO0o(new OooO0o(objCall, c32968OooO0Oo));
                                            }
                                        } catch (Throwable th) {
                                            C30416Oooo0OO.OooO00o(th);
                                            this.f119194OooOoOO.cancel();
                                            C32388OooO0OO c32388OooO0OO3 = this.f119199Oooo000;
                                            c32388OooO0OO3.getClass();
                                            C32390OooO0o.OooO00o(c32388OooO0OO3, th);
                                            InterfaceC33493OooO0oo interfaceC33493OooO0oo2 = this.f119202Oooo0;
                                            C32388OooO0OO c32388OooO0OO4 = this.f119199Oooo000;
                                            c32388OooO0OO4.getClass();
                                            interfaceC33493OooO0oo2.onError(C32390OooO0o.OooO0O0(c32388OooO0OO4));
                                            return;
                                        }
                                    } else {
                                        this.f119200Oooo00O = true;
                                        oooO00o.subscribe(this.f119191OooOo0o);
                                    }
                                } catch (Throwable th2) {
                                    C30416Oooo0OO.OooO00o(th2);
                                    this.f119194OooOoOO.cancel();
                                    C32388OooO0OO c32388OooO0OO5 = this.f119199Oooo000;
                                    c32388OooO0OO5.getClass();
                                    C32390OooO0o.OooO00o(c32388OooO0OO5, th2);
                                    InterfaceC33493OooO0oo interfaceC33493OooO0oo3 = this.f119202Oooo0;
                                    C32388OooO0OO c32388OooO0OO6 = this.f119199Oooo000;
                                    c32388OooO0OO6.getClass();
                                    interfaceC33493OooO0oo3.onError(C32390OooO0o.OooO0O0(c32388OooO0OO6));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C30416Oooo0OO.OooO00o(th3);
                            this.f119194OooOoOO.cancel();
                            C32388OooO0OO c32388OooO0OO7 = this.f119199Oooo000;
                            c32388OooO0OO7.getClass();
                            C32390OooO0o.OooO00o(c32388OooO0OO7, th3);
                            InterfaceC33493OooO0oo interfaceC33493OooO0oo4 = this.f119202Oooo0;
                            C32388OooO0OO c32388OooO0OO8 = this.f119199Oooo000;
                            c32388OooO0OO8.getClass();
                            interfaceC33493OooO0oo4.onError(C32390OooO0o.OooO0O0(c32388OooO0OO8));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            if (this.f119198OooOooo) {
                return;
            }
            this.f119198OooOooo = true;
            this.f119191OooOo0o.cancel();
            this.f119194OooOoOO.cancel();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            C32388OooO0OO c32388OooO0OO = this.f119199Oooo000;
            c32388OooO0OO.getClass();
            if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                this.f119197OooOooO = true;
                OooO0o0();
            }
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            this.f119191OooOo0o.request(j);
        }
    }

    public static final class OooO0OO<T, R> extends OooO00o<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119204Oooo0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public final AtomicInteger f119205Oooo0O0;

        public OooO0OO(InterfaceC33493OooO0oo interfaceC33493OooO0oo, C22738OooOoO c22738OooOoO, int i) {
            super(c22738OooOoO, i);
            this.f119204Oooo0 = interfaceC33493OooO0oo;
            this.f119205Oooo0O0 = new AtomicInteger();
        }

        @Override // oO0OOOOo.OooO0O0.OooO0o0
        public final void OooO00o(Throwable th) {
            C32388OooO0OO c32388OooO0OO = this.f119199Oooo000;
            c32388OooO0OO.getClass();
            if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            this.f119194OooOoOO.cancel();
            if (getAndIncrement() == 0) {
                this.f119204Oooo0.onError(C32390OooO0o.OooO0O0(c32388OooO0OO));
            }
        }

        @Override // oO0OOOOo.OooO0O0.OooO0o0
        public final void OooO0O0(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119204Oooo0;
                interfaceC33493OooO0oo.onNext(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                C32388OooO0OO c32388OooO0OO = this.f119199Oooo000;
                c32388OooO0OO.getClass();
                interfaceC33493OooO0oo.onError(C32390OooO0o.OooO0O0(c32388OooO0OO));
            }
        }

        @Override // oO0OOOOo.OooO0O0.OooO00o
        public final void OooO0o() {
            this.f119204Oooo0.OooO0Oo(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0OOOOo.OooO0O0.OooO00o
        public final void OooO0o0() {
            if (this.f119205Oooo0O0.getAndIncrement() == 0) {
                while (!this.f119198OooOooo) {
                    if (!this.f119200Oooo00O) {
                        boolean z = this.f119197OooOooO;
                        try {
                            T tPoll = this.f119195OooOoo.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                this.f119204Oooo0.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    Object objApply = this.f119190OooOo.apply(tPoll);
                                    o00Oo0.OooO00o(objApply, "The mapper returned a null Publisher");
                                    oOO00OOO.OooO00o oooO00o = (oOO00OOO.OooO00o) objApply;
                                    if (this.f119201Oooo00o != 1) {
                                        int i = this.f119196OooOoo0 + 1;
                                        if (i == this.f119192OooOoO) {
                                            this.f119196OooOoo0 = 0;
                                            this.f119194OooOoOO.request(i);
                                        } else {
                                            this.f119196OooOoo0 = i;
                                        }
                                    }
                                    if (oooO00o instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) oooO00o).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.f119191OooOo0o.f119397OooOoo) {
                                                this.f119200Oooo00O = true;
                                                C32968OooO0Oo<R> c32968OooO0Oo = this.f119191OooOo0o;
                                                c32968OooO0Oo.OooO0o(new OooO0o(objCall, c32968OooO0Oo));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.f119204Oooo0.onNext(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119204Oooo0;
                                                    C32388OooO0OO c32388OooO0OO = this.f119199Oooo000;
                                                    c32388OooO0OO.getClass();
                                                    interfaceC33493OooO0oo.onError(C32390OooO0o.OooO0O0(c32388OooO0OO));
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            C30416Oooo0OO.OooO00o(th);
                                            this.f119194OooOoOO.cancel();
                                            C32388OooO0OO c32388OooO0OO2 = this.f119199Oooo000;
                                            c32388OooO0OO2.getClass();
                                            C32390OooO0o.OooO00o(c32388OooO0OO2, th);
                                            InterfaceC33493OooO0oo interfaceC33493OooO0oo2 = this.f119204Oooo0;
                                            C32388OooO0OO c32388OooO0OO3 = this.f119199Oooo000;
                                            c32388OooO0OO3.getClass();
                                            interfaceC33493OooO0oo2.onError(C32390OooO0o.OooO0O0(c32388OooO0OO3));
                                            return;
                                        }
                                    } else {
                                        this.f119200Oooo00O = true;
                                        oooO00o.subscribe(this.f119191OooOo0o);
                                    }
                                } catch (Throwable th2) {
                                    C30416Oooo0OO.OooO00o(th2);
                                    this.f119194OooOoOO.cancel();
                                    C32388OooO0OO c32388OooO0OO4 = this.f119199Oooo000;
                                    c32388OooO0OO4.getClass();
                                    C32390OooO0o.OooO00o(c32388OooO0OO4, th2);
                                    InterfaceC33493OooO0oo interfaceC33493OooO0oo3 = this.f119204Oooo0;
                                    C32388OooO0OO c32388OooO0OO5 = this.f119199Oooo000;
                                    c32388OooO0OO5.getClass();
                                    interfaceC33493OooO0oo3.onError(C32390OooO0o.OooO0O0(c32388OooO0OO5));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C30416Oooo0OO.OooO00o(th3);
                            this.f119194OooOoOO.cancel();
                            C32388OooO0OO c32388OooO0OO6 = this.f119199Oooo000;
                            c32388OooO0OO6.getClass();
                            C32390OooO0o.OooO00o(c32388OooO0OO6, th3);
                            InterfaceC33493OooO0oo interfaceC33493OooO0oo4 = this.f119204Oooo0;
                            C32388OooO0OO c32388OooO0OO7 = this.f119199Oooo000;
                            c32388OooO0OO7.getClass();
                            interfaceC33493OooO0oo4.onError(C32390OooO0o.OooO0O0(c32388OooO0OO7));
                            return;
                        }
                    }
                    if (this.f119205Oooo0O0.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            if (this.f119198OooOooo) {
                return;
            }
            this.f119198OooOooo = true;
            this.f119191OooOo0o.cancel();
            this.f119194OooOoOO.cancel();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            C32388OooO0OO c32388OooO0OO = this.f119199Oooo000;
            c32388OooO0OO.getClass();
            if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            this.f119191OooOo0o.cancel();
            if (getAndIncrement() == 0) {
                this.f119204Oooo0.onError(C32390OooO0o.OooO0O0(c32388OooO0OO));
            }
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            this.f119191OooOo0o.request(j);
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32968OooO0Oo<R> extends C33005OooO0o implements InterfaceC33493OooO0oo<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final OooO00o f119206OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public long f119207OooOooo;

        public C32968OooO0Oo(OooO00o oooO00o) {
            this.f119206OooOooO = oooO00o;
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            long j = this.f119207OooOooo;
            if (j != 0) {
                this.f119207OooOooo = 0L;
                OooO0o0(j);
            }
            OooO00o oooO00o = this.f119206OooOooO;
            oooO00o.f119200Oooo00O = false;
            oooO00o.OooO0o0();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            long j = this.f119207OooOooo;
            if (j != 0) {
                this.f119207OooOooo = 0L;
                OooO0o0(j);
            }
            this.f119206OooOooO.OooO00o(th);
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(R r) {
            this.f119207OooOooo++;
            this.f119206OooOooO.OooO0O0(r);
        }
    }

    public static final class OooO0o<T> implements oOO00OOO.OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final T f119208OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final oOO00OOO.OooO0O0<? super T> f119209OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f119210OooOoO0;

        public OooO0o(T t, oOO00OOO.OooO0O0<? super T> oooO0O0) {
            this.f119208OooOo = t;
            this.f119209OooOo0o = oooO0O0;
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            if (j <= 0 || this.f119210OooOoO0) {
                return;
            }
            this.f119210OooOoO0 = true;
            T t = this.f119208OooOo;
            oOO00OOO.OooO0O0<? super T> oooO0O0 = this.f119209OooOo0o;
            oooO0O0.onNext(t);
            oooO0O0.onComplete();
        }
    }

    public interface OooO0o0<T> {
        void OooO00o(Throwable th);

        void OooO0O0(T t);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(C32978OooOOo0 c32978OooOOo0, C22738OooOoO c22738OooOoO) {
        super(c32978OooOOo0);
        EnumC32391OooO0o0 enumC32391OooO0o0 = EnumC32391OooO0o0.f116483OooOo0o;
        this.f119188OooOoO0 = c22738OooOoO;
        this.f119187OooOoO = 2;
        this.f119189OooOoOO = enumC32391OooO0o0;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super R> oooO0O0) {
        InterfaceC33493OooO0oo interfaceC33493OooO0oo = (InterfaceC33493OooO0oo) oooO0O0;
        AbstractC33491OooO0o0<T> abstractC33491OooO0o0 = this.f119186OooOo;
        C22738OooOoO c22738OooOoO = this.f119188OooOoO0;
        if (OooOo00.OooO00o(abstractC33491OooO0o0, interfaceC33493OooO0oo, c22738OooOoO)) {
            return;
        }
        int iOrdinal = this.f119189OooOoOO.ordinal();
        int i = this.f119187OooOoO;
        abstractC33491OooO0o0.subscribe(iOrdinal != 1 ? iOrdinal != 2 ? new OooO0OO<>(interfaceC33493OooO0oo, c22738OooOoO, i) : new C20290OooO0O0<>(interfaceC33493OooO0oo, c22738OooOoO, i, true) : new C20290OooO0O0<>(interfaceC33493OooO0oo, c22738OooOoO, i, false));
    }
}
