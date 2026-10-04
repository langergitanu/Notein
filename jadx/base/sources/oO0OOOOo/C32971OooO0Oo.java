package oO0OOOOo;

import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO00o0o.AbstractC32371OooO00o;
import oO00o0o.AbstractC32372OooO0O0;
import oO00o0oO.C32390OooO0o;
import oO0OOOoo.InterfaceC33023OooO00o;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32971OooO0Oo<T> extends oO0OOOOo.OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO00o.OooO0OO f119223OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final com.aspose.slides.internal.p284mx.OooO0O0 f119224OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o.OooO0O0 f119225OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO00o.OooO0O0 f119226OooOoo0;

    /* JADX INFO: renamed from: oO0OOOOo.OooO0Oo$OooO00o */
    public static final class OooO00o<T> extends AbstractC32371OooO00o<T, T> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final OooO00o.OooO0OO f119227OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final com.aspose.slides.internal.p284mx.OooO0O0 f119228OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final OooO00o.OooO0O0 f119229OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final OooO00o.OooO0O0 f119230OooOooo;

        public OooO00o(InterfaceC33023OooO00o interfaceC33023OooO00o, com.aspose.slides.internal.p284mx.OooO0O0 oooO0O0, OooO00o.OooO0OO oooO0OO, OooO00o.OooO0O0 oooO0O02, OooO00o.OooO0O0 oooO0O03) {
            super(interfaceC33023OooO00o);
            this.f119228OooOoo0 = oooO0O0;
            this.f119227OooOoo = oooO0OO;
            this.f119229OooOooO = oooO0O02;
            this.f119230OooOooo = oooO0O03;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oO0OOOoo.InterfaceC33023OooO00o
        public final boolean OooO0OO(T t) {
            if (this.f116387OooOoO) {
                return false;
            }
            try {
                this.f119228OooOoo0.accept(t);
                return this.f116386OooOo0o.OooO0OO((Object) t);
            } catch (Throwable th) {
                OooO00o(th);
                return false;
            }
        }

        @Override // oO00o0o.AbstractC32371OooO00o, oOO00OOO.OooO0O0
        public final void onComplete() {
            if (this.f116387OooOoO) {
                return;
            }
            try {
                this.f119229OooOooO.getClass();
                this.f116387OooOoO = true;
                this.f116386OooOo0o.onComplete();
                try {
                    this.f119230OooOooo.getClass();
                } catch (Throwable th) {
                    C30416Oooo0OO.OooO00o(th);
                    oO0OOO0O.OooO00o.OooO0O0(th);
                }
            } catch (Throwable th2) {
                OooO00o(th2);
            }
        }

        @Override // oO00o0o.AbstractC32371OooO00o, oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            oOO00OOO.OooO0O0 oooO0O0 = this.f116386OooOo0o;
            if (this.f116387OooOoO) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            this.f116387OooOoO = true;
            try {
                this.f119227OooOoo.getClass();
                oooO0O0.onError(th);
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                oooO0O0.onError(new oO00o00O.OooO00o(th, th2));
            }
            try {
                this.f119230OooOooo.getClass();
            } catch (Throwable th3) {
                C30416Oooo0OO.OooO00o(th3);
                oO0OOO0O.OooO00o.OooO0O0(th3);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f116387OooOoO) {
                return;
            }
            int i = this.f116389OooOoOO;
            InterfaceC33023OooO00o<? super R> interfaceC33023OooO00o = this.f116386OooOo0o;
            if (i != 0) {
                interfaceC33023OooO00o.onNext(null);
                return;
            }
            try {
                this.f119228OooOoo0.accept(t);
                interfaceC33023OooO00o.onNext((Object) t);
            } catch (Throwable th) {
                OooO00o(th);
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() throws Exception {
            oO00o00O.OooO00o oooO00o;
            OooO00o.OooO0OO oooO0OO = this.f119227OooOoo;
            try {
                T tPoll = this.f116388OooOoO0.poll();
                OooO00o.OooO0O0 oooO0O0 = this.f119230OooOooo;
                if (tPoll == null) {
                    if (this.f116389OooOoOO == 1) {
                        this.f119229OooOooO.getClass();
                        oooO0O0.getClass();
                    }
                    return tPoll;
                }
                try {
                    this.f119228OooOoo0.accept(tPoll);
                    oooO0O0.getClass();
                    return tPoll;
                } catch (Throwable th) {
                    try {
                        C30416Oooo0OO.OooO00o(th);
                        try {
                            oooO0OO.getClass();
                            C32390OooO0o.OooO00o oooO00o2 = C32390OooO0o.f116481OooO00o;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        oooO0O0.getClass();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                C30416Oooo0OO.OooO00o(th3);
                try {
                    oooO0OO.getClass();
                    C32390OooO0o.OooO00o oooO00o3 = C32390OooO0o.f116481OooO00o;
                    if (th3 instanceof Exception) {
                        throw th3;
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooO0Oo$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC32372OooO0O0<T, T> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final OooO00o.OooO0OO f119231OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final com.aspose.slides.internal.p284mx.OooO0O0 f119232OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final OooO00o.OooO0O0 f119233OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final OooO00o.OooO0O0 f119234OooOooo;

        public OooO0O0(InterfaceC33493OooO0oo interfaceC33493OooO0oo, com.aspose.slides.internal.p284mx.OooO0O0 oooO0O0, OooO00o.OooO0OO oooO0OO, OooO00o.OooO0O0 oooO0O02, OooO00o.OooO0O0 oooO0O03) {
            super(interfaceC33493OooO0oo);
            this.f119232OooOoo0 = oooO0O0;
            this.f119231OooOoo = oooO0OO;
            this.f119233OooOooO = oooO0O02;
            this.f119234OooOooo = oooO0O03;
        }

        @Override // oO00o0o.AbstractC32372OooO0O0, oOO00OOO.OooO0O0
        public final void onComplete() {
            if (this.f116392OooOoO) {
                return;
            }
            try {
                this.f119233OooOooO.getClass();
                this.f116392OooOoO = true;
                this.f116391OooOo0o.onComplete();
                try {
                    this.f119234OooOooo.getClass();
                } catch (Throwable th) {
                    C30416Oooo0OO.OooO00o(th);
                    oO0OOO0O.OooO00o.OooO0O0(th);
                }
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                this.f116390OooOo.cancel();
                onError(th2);
            }
        }

        @Override // oO00o0o.AbstractC32372OooO0O0, oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f116391OooOo0o;
            if (this.f116392OooOoO) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            this.f116392OooOoO = true;
            try {
                this.f119231OooOoo.getClass();
                interfaceC33493OooO0oo.onError(th);
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                interfaceC33493OooO0oo.onError(new oO00o00O.OooO00o(th, th2));
            }
            try {
                this.f119234OooOooo.getClass();
            } catch (Throwable th3) {
                C30416Oooo0OO.OooO00o(th3);
                oO0OOO0O.OooO00o.OooO0O0(th3);
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f116392OooOoO) {
                return;
            }
            int i = this.f116394OooOoOO;
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f116391OooOo0o;
            if (i != 0) {
                interfaceC33493OooO0oo.onNext(null);
                return;
            }
            try {
                this.f119232OooOoo0.accept(t);
                interfaceC33493OooO0oo.onNext(t);
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                this.f116390OooOo.cancel();
                onError(th);
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() throws Exception {
            oO00o00O.OooO00o oooO00o;
            OooO00o.OooO0OO oooO0OO = this.f119231OooOoo;
            try {
                T tPoll = this.f116393OooOoO0.poll();
                OooO00o.OooO0O0 oooO0O0 = this.f119234OooOooo;
                if (tPoll == null) {
                    if (this.f116394OooOoOO == 1) {
                        this.f119233OooOooO.getClass();
                        oooO0O0.getClass();
                    }
                    return tPoll;
                }
                try {
                    this.f119232OooOoo0.accept(tPoll);
                    oooO0O0.getClass();
                    return tPoll;
                } catch (Throwable th) {
                    try {
                        C30416Oooo0OO.OooO00o(th);
                        try {
                            oooO0OO.getClass();
                            C32390OooO0o.OooO00o oooO00o2 = C32390OooO0o.f116481OooO00o;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        oooO0O0.getClass();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                C30416Oooo0OO.OooO00o(th3);
                try {
                    oooO0OO.getClass();
                    C32390OooO0o.OooO00o oooO00o3 = C32390OooO0o.f116481OooO00o;
                    if (th3 instanceof Exception) {
                        throw th3;
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32971OooO0Oo(AbstractC33491OooO0o0 abstractC33491OooO0o0, com.aspose.slides.internal.p284mx.OooO0O0 oooO0O0) {
        super(abstractC33491OooO0o0);
        OooO00o.OooO0OO oooO0OO = oO00o0.OooO00o.f116238OooO0Oo;
        OooO00o.OooO0O0 oooO0O02 = oO00o0.OooO00o.f116237OooO0OO;
        this.f119224OooOoO0 = oooO0O0;
        this.f119223OooOoO = oooO0OO;
        this.f119225OooOoOO = oooO0O02;
        this.f119226OooOoo0 = oooO0O02;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        boolean z = oooO0O0 instanceof InterfaceC33023OooO00o;
        AbstractC33491OooO0o0<T> abstractC33491OooO0o0 = this.f119186OooOo;
        if (z) {
            abstractC33491OooO0o0.OooO0OO(new OooO00o((InterfaceC33023OooO00o) oooO0O0, this.f119224OooOoO0, this.f119223OooOoO, this.f119225OooOoOO, this.f119226OooOoo0));
        } else {
            abstractC33491OooO0o0.OooO0OO(new OooO0O0((InterfaceC33493OooO0oo) oooO0O0, this.f119224OooOoO0, this.f119223OooOoO, this.f119225OooOoOO, this.f119226OooOoo0));
        }
    }
}
