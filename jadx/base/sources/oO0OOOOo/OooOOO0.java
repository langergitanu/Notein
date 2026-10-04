package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import java.util.Iterator;
import java.util.List;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO0OOOo0.AbstractC33002OooO0O0;
import oO0OOOo0.EnumC33004OooO0Oo;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33023OooO00o;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0<T> extends AbstractC33491OooO0o0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final List f119284OooOo;

    public static abstract class OooO00o<T> extends AbstractC33002OooO0O0<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public volatile boolean f119285OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Iterator<? extends T> f119286OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f119287OooOoO0;

        public OooO00o(Iterator<? extends T> it) {
            this.f119286OooOo0o = it;
        }

        public abstract void OooO00o();

        @Override // oO0OOOoo.InterfaceC33027OooO0o
        public final int OooO0O0(int i) {
            return 1;
        }

        public abstract void OooO0OO(long j);

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            this.f119285OooOo = true;
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final void clear() {
            this.f119286OooOo0o = null;
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f119286OooOo0o;
            return it == null || !it.hasNext();
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() {
            Iterator<? extends T> it = this.f119286OooOo0o;
            if (it == null) {
                return null;
            }
            if (!this.f119287OooOoO0) {
                this.f119287OooOoO0 = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.f119286OooOo0o.next();
            o00Oo0.OooO00o(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            if (EnumC33007OooO0oO.OooO0OO(j) && o00000.OooOO0.OooO0O0(this, j) == 0) {
                if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                    OooO00o();
                } else {
                    OooO0OO(j);
                }
            }
        }
    }

    public static final class OooO0O0<T> extends OooO00o<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final InterfaceC33023OooO00o<? super T> f119288OooOoO;

        public OooO0O0(InterfaceC33023OooO00o<? super T> interfaceC33023OooO00o, Iterator<? extends T> it) {
            super(it);
            this.f119288OooOoO = interfaceC33023OooO00o;
        }

        @Override // oO0OOOOo.OooOOO0.OooO00o
        public final void OooO00o() {
            Iterator<? extends T> it = this.f119286OooOo0o;
            InterfaceC33023OooO00o<? super T> interfaceC33023OooO00o = this.f119288OooOoO;
            while (!this.f119285OooOo) {
                try {
                    T next = it.next();
                    if (this.f119285OooOo) {
                        return;
                    }
                    if (next == null) {
                        interfaceC33023OooO00o.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    interfaceC33023OooO00o.OooO0OO(next);
                    if (this.f119285OooOo) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f119285OooOo) {
                                return;
                            }
                            interfaceC33023OooO00o.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        C30416Oooo0OO.OooO00o(th);
                        interfaceC33023OooO00o.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C30416Oooo0OO.OooO00o(th2);
                    interfaceC33023OooO00o.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // oO0OOOOo.OooOOO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0OO(long j) {
            Iterator<? extends T> it = this.f119286OooOo0o;
            InterfaceC33023OooO00o<? super T> interfaceC33023OooO00o = this.f119288OooOoO;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.f119285OooOo) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f119285OooOo) {
                                return;
                            }
                            if (next == null) {
                                interfaceC33023OooO00o.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zOooO0OO = interfaceC33023OooO00o.OooO0OO(next);
                            if (this.f119285OooOo) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f119285OooOo) {
                                        return;
                                    }
                                    interfaceC33023OooO00o.onComplete();
                                    return;
                                } else if (zOooO0OO) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                C30416Oooo0OO.OooO00o(th);
                                interfaceC33023OooO00o.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C30416Oooo0OO.OooO00o(th2);
                            interfaceC33023OooO00o.onError(th2);
                            return;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    public static final class OooO0OO<T> extends OooO00o<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119289OooOoO;

        public OooO0OO(InterfaceC33493OooO0oo interfaceC33493OooO0oo, Iterator it) {
            super(it);
            this.f119289OooOoO = interfaceC33493OooO0oo;
        }

        @Override // oO0OOOOo.OooOOO0.OooO00o
        public final void OooO00o() {
            Iterator<? extends T> it = this.f119286OooOo0o;
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119289OooOoO;
            while (!this.f119285OooOo) {
                try {
                    T next = it.next();
                    if (this.f119285OooOo) {
                        return;
                    }
                    if (next == null) {
                        interfaceC33493OooO0oo.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    interfaceC33493OooO0oo.onNext(next);
                    if (this.f119285OooOo) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f119285OooOo) {
                                return;
                            }
                            interfaceC33493OooO0oo.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        C30416Oooo0OO.OooO00o(th);
                        interfaceC33493OooO0oo.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C30416Oooo0OO.OooO00o(th2);
                    interfaceC33493OooO0oo.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // oO0OOOOo.OooOOO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0OO(long j) {
            Iterator<? extends T> it = this.f119286OooOo0o;
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119289OooOoO;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.f119285OooOo) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f119285OooOo) {
                                return;
                            }
                            if (next == null) {
                                interfaceC33493OooO0oo.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            interfaceC33493OooO0oo.onNext(next);
                            if (this.f119285OooOo) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f119285OooOo) {
                                        return;
                                    }
                                    interfaceC33493OooO0oo.onComplete();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                C30416Oooo0OO.OooO00o(th);
                                interfaceC33493OooO0oo.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C30416Oooo0OO.OooO00o(th2);
                            interfaceC33493OooO0oo.onError(th2);
                            return;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    public OooOOO0(List list) {
        this.f119284OooOo = list;
    }

    public static void OooO0o0(InterfaceC33493OooO0oo interfaceC33493OooO0oo, Iterator it) {
        try {
            if (!it.hasNext()) {
                EnumC33004OooO0Oo.OooO00o(interfaceC33493OooO0oo);
            } else if (interfaceC33493OooO0oo instanceof InterfaceC33023OooO00o) {
                interfaceC33493OooO0oo.OooO0Oo(new OooO0O0((InterfaceC33023OooO00o) interfaceC33493OooO0oo, it));
            } else {
                interfaceC33493OooO0oo.OooO0Oo(new OooO0OO(interfaceC33493OooO0oo, it));
            }
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            EnumC33004OooO0Oo.OooO0OO(th, interfaceC33493OooO0oo);
        }
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        try {
            OooO0o0((InterfaceC33493OooO0oo) oooO0O0, this.f119284OooOo.iterator());
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            EnumC33004OooO0Oo.OooO0OO(th, (InterfaceC33493OooO0oo) oooO0O0);
        }
    }
}
