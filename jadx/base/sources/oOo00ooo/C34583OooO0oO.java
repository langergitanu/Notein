package oOo00ooo;

import oO00o.AbstractC32316OooO0OO;
import oO00o.AbstractC32318OooO0o;
import oO00o.InterfaceC32319OooO0o0;
import oO00oO0.EnumC32397OooO0O0;
import oO00oO0O.AbstractC32406OooO0O0;
import oO00oOO.C32423OooOO0O;
import oO00oOO0.C32425OooO0O0;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0OO.C33669o000oOoO;
import oOo00ooO.InterfaceC34570OooO0O0;
import oOo00ooO.InterfaceC34575OooO0oO;

/* JADX INFO: renamed from: oOo00ooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34583OooO0oO<T> extends AbstractC34577OooO00o<T, T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC32318OooO0o f123865OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f123866OooO0OO;

    /* JADX INFO: renamed from: oOo00ooo.OooO0oO$OooO00o */
    public static final class OooO00o<T> extends AbstractC32406OooO0O0<T> implements InterfaceC32319OooO0o0<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC32318OooO0o.OooO0O0 f123867OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC32319OooO0o0<? super T> f123868OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public InterfaceC34575OooO0oO<T> f123869OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f123870OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public InterfaceC32925OooO0O0 f123871OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public volatile boolean f123872OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public Throwable f123873OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public volatile boolean f123874OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public int f123875OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public boolean f123876Oooo000;

        public OooO00o(InterfaceC32319OooO0o0 interfaceC32319OooO0o0, AbstractC32318OooO0o.OooO0O0 oooO0O0, int i) {
            this.f123868OooOo0o = interfaceC32319OooO0o0;
            this.f123867OooOo = oooO0O0;
            this.f123870OooOoO0 = i;
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
            if (EnumC32397OooO0O0.OooO0Oo(this.f123871OooOoOO, interfaceC32925OooO0O0)) {
                this.f123871OooOoOO = interfaceC32925OooO0O0;
                if (interfaceC32925OooO0O0 instanceof InterfaceC34570OooO0O0) {
                    InterfaceC34570OooO0O0 interfaceC34570OooO0O0 = (InterfaceC34570OooO0O0) interfaceC32925OooO0O0;
                    int iOooO0O0 = interfaceC34570OooO0O0.OooO0O0(7);
                    if (iOooO0O0 == 1) {
                        this.f123875OooOooo = iOooO0O0;
                        this.f123869OooOoO = interfaceC34570OooO0O0;
                        this.f123872OooOoo = true;
                        this.f123868OooOo0o.OooO00o(this);
                        if (getAndIncrement() == 0) {
                            this.f123867OooOo.OooO0O0(this);
                            return;
                        }
                        return;
                    }
                    if (iOooO0O0 == 2) {
                        this.f123875OooOooo = iOooO0O0;
                        this.f123869OooOoO = interfaceC34570OooO0O0;
                        this.f123868OooOo0o.OooO00o(this);
                        return;
                    }
                }
                this.f123869OooOoO = new C32425OooO0O0(this.f123870OooOoO0);
                this.f123868OooOo0o.OooO00o(this);
            }
        }

        @Override // oOo00ooO.InterfaceC34571OooO0OO
        public final int OooO0O0(int i) {
            this.f123876Oooo000 = true;
            return 2;
        }

        public final boolean OooO0OO(boolean z, boolean z2, InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0) {
            if (this.f123874OooOooO) {
                this.f123869OooOoO.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f123873OooOoo0;
            if (th != null) {
                this.f123874OooOooO = true;
                this.f123869OooOoO.clear();
                interfaceC32319OooO0o0.onError(th);
                this.f123867OooOo.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f123874OooOooO = true;
            interfaceC32319OooO0o0.onComplete();
            this.f123867OooOo.dispose();
            return true;
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final void clear() {
            this.f123869OooOoO.clear();
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            if (this.f123874OooOooO) {
                return;
            }
            this.f123874OooOooO = true;
            this.f123871OooOoOO.dispose();
            this.f123867OooOo.dispose();
            if (this.f123876Oooo000 || getAndIncrement() != 0) {
                return;
            }
            this.f123869OooOoO.clear();
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final boolean isEmpty() {
            return this.f123869OooOoO.isEmpty();
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onComplete() {
            if (this.f123872OooOoo) {
                return;
            }
            this.f123872OooOoo = true;
            if (getAndIncrement() == 0) {
                this.f123867OooOo.OooO0O0(this);
            }
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onError(Throwable th) {
            if (this.f123872OooOoo) {
                C32430OooO00o.OooO00o(th);
                return;
            }
            this.f123873OooOoo0 = th;
            this.f123872OooOoo = true;
            if (getAndIncrement() == 0) {
                this.f123867OooOo.OooO0O0(this);
            }
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onNext(T t) {
            if (this.f123872OooOoo) {
                return;
            }
            if (this.f123875OooOooo != 2) {
                this.f123869OooOoO.offer(t);
            }
            if (getAndIncrement() == 0) {
                this.f123867OooOo.OooO0O0(this);
            }
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final T poll() throws Throwable {
            return this.f123869OooOoO.poll();
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
        
            if (r3 != 0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            if (!this.f123876Oooo000) {
                InterfaceC34575OooO0oO<T> interfaceC34575OooO0oO = this.f123869OooOoO;
                InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0 = this.f123868OooOo0o;
                int iAddAndGet = 1;
                while (!OooO0OO(this.f123872OooOoo, interfaceC34575OooO0oO.isEmpty(), interfaceC32319OooO0o0)) {
                    while (true) {
                        boolean z = this.f123872OooOoo;
                        try {
                            T tPoll = interfaceC34575OooO0oO.poll();
                            boolean z2 = tPoll == null;
                            if (OooO0OO(z, z2, interfaceC32319OooO0o0)) {
                                return;
                            }
                            if (z2) {
                                break;
                            } else {
                                interfaceC32319OooO0o0.onNext(tPoll);
                            }
                        } catch (Throwable th) {
                            C33669o000oOoO.OooO0O0(th);
                            this.f123874OooOooO = true;
                            this.f123871OooOoOO.dispose();
                            interfaceC34575OooO0oO.clear();
                            interfaceC32319OooO0o0.onError(th);
                            this.f123867OooOo.dispose();
                            return;
                        }
                    }
                }
                return;
            }
            int iAddAndGet2 = 1;
            while (!this.f123874OooOooO) {
                boolean z3 = this.f123872OooOoo;
                Throwable th2 = this.f123873OooOoo0;
                if (z3 && th2 != null) {
                    this.f123874OooOooO = true;
                    this.f123868OooOo0o.onError(this.f123873OooOoo0);
                    this.f123867OooOo.dispose();
                    return;
                }
                this.f123868OooOo0o.onNext(null);
                if (z3) {
                    this.f123874OooOooO = true;
                    Throwable th3 = this.f123873OooOoo0;
                    if (th3 != null) {
                        this.f123868OooOo0o.onError(th3);
                    } else {
                        this.f123868OooOo0o.onComplete();
                    }
                    this.f123867OooOo.dispose();
                    return;
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
            }
        }
    }

    public C34583OooO0oO(AbstractC32316OooO0OO abstractC32316OooO0OO, AbstractC32318OooO0o abstractC32318OooO0o, int i) {
        super(abstractC32316OooO0OO);
        this.f123865OooO0O0 = abstractC32318OooO0o;
        this.f123866OooO0OO = i;
    }

    @Override // oO00o.AbstractC32316OooO0OO
    public final void OooO0OO(InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0) {
        AbstractC32318OooO0o abstractC32318OooO0o = this.f123865OooO0O0;
        boolean z = abstractC32318OooO0o instanceof C32423OooOO0O;
        AbstractC32316OooO0OO abstractC32316OooO0OO = this.f123831OooO00o;
        if (z) {
            abstractC32316OooO0OO.OooO00o(interfaceC32319OooO0o0);
        } else {
            abstractC32316OooO0OO.OooO00o(new OooO00o(interfaceC32319OooO0o0, abstractC32318OooO0o.OooO00o(), this.f123866OooO0OO));
        }
    }
}
