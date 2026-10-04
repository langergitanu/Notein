package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import o0Oo0oOo.o00Oo0;
import oO0OOOo0.AbstractC33002OooO0O0;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33023OooO00o;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32975OooOO0o<T> extends AbstractC33491OooO0o0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final T[] f119275OooOo;

    /* JADX INFO: renamed from: oO0OOOOo.OooOO0o$OooO00o */
    public static final class OooO00o<T> extends OooO0OO<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final InterfaceC33023OooO00o<? super T> f119276OooOoO;

        public OooO00o(InterfaceC33023OooO00o<? super T> interfaceC33023OooO00o, T[] tArr) {
            super(tArr);
            this.f119276OooOoO = interfaceC33023OooO00o;
        }

        @Override // oO0OOOOo.C32975OooOO0o.OooO0OO
        public final void OooO00o() {
            T[] tArr = this.f119279OooOo0o;
            int length = tArr.length;
            InterfaceC33023OooO00o<? super T> interfaceC33023OooO00o = this.f119276OooOoO;
            for (int i = this.f119278OooOo; i != length; i++) {
                if (this.f119280OooOoO0) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    interfaceC33023OooO00o.onError(new NullPointerException("array element is null"));
                    return;
                }
                interfaceC33023OooO00o.OooO0OO(t);
            }
            if (this.f119280OooOoO0) {
                return;
            }
            interfaceC33023OooO00o.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        
            r10.f119278OooOo = r2;
            r11 = addAndGet(-r6);
         */
        @Override // oO0OOOOo.C32975OooOO0o.OooO0OO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0OO(long j) {
            T[] tArr = this.f119279OooOo0o;
            int length = tArr.length;
            int i = this.f119278OooOo;
            InterfaceC33023OooO00o<? super T> interfaceC33023OooO00o = this.f119276OooOoO;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.f119280OooOoO0) {
                                return;
                            }
                            interfaceC33023OooO00o.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.f119280OooOoO0) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            interfaceC33023OooO00o.onError(new NullPointerException("array element is null"));
                            return;
                        } else {
                            if (interfaceC33023OooO00o.OooO0OO(t)) {
                                j2++;
                            }
                            i++;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooOO0o$OooO0O0 */
    public static final class OooO0O0<T> extends OooO0OO<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119277OooOoO;

        public OooO0O0(InterfaceC33493OooO0oo interfaceC33493OooO0oo, Object[] objArr) {
            super(objArr);
            this.f119277OooOoO = interfaceC33493OooO0oo;
        }

        @Override // oO0OOOOo.C32975OooOO0o.OooO0OO
        public final void OooO00o() {
            T[] tArr = this.f119279OooOo0o;
            int length = tArr.length;
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119277OooOoO;
            for (int i = this.f119278OooOo; i != length; i++) {
                if (this.f119280OooOoO0) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    interfaceC33493OooO0oo.onError(new NullPointerException("array element is null"));
                    return;
                }
                interfaceC33493OooO0oo.onNext(t);
            }
            if (this.f119280OooOoO0) {
                return;
            }
            interfaceC33493OooO0oo.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        
            r10.f119278OooOo = r2;
            r11 = addAndGet(-r6);
         */
        @Override // oO0OOOOo.C32975OooOO0o.OooO0OO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0OO(long j) {
            T[] tArr = this.f119279OooOo0o;
            int length = tArr.length;
            int i = this.f119278OooOo;
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119277OooOoO;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.f119280OooOoO0) {
                                return;
                            }
                            interfaceC33493OooO0oo.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.f119280OooOoO0) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            interfaceC33493OooO0oo.onError(new NullPointerException("array element is null"));
                            return;
                        } else {
                            interfaceC33493OooO0oo.onNext(t);
                            j2++;
                            i++;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooOO0o$OooO0OO */
    public static abstract class OooO0OO<T> extends AbstractC33002OooO0O0<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f119278OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final T[] f119279OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public volatile boolean f119280OooOoO0;

        public OooO0OO(T[] tArr) {
            this.f119279OooOo0o = tArr;
        }

        public abstract void OooO00o();

        @Override // oO0OOOoo.InterfaceC33027OooO0o
        public final int OooO0O0(int i) {
            return 1;
        }

        public abstract void OooO0OO(long j);

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            this.f119280OooOoO0 = true;
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final void clear() {
            this.f119278OooOo = this.f119279OooOo0o.length;
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final boolean isEmpty() {
            return this.f119278OooOo == this.f119279OooOo0o.length;
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() {
            int i = this.f119278OooOo;
            T[] tArr = this.f119279OooOo0o;
            if (i == tArr.length) {
                return null;
            }
            this.f119278OooOo = i + 1;
            T t = tArr[i];
            o00Oo0.OooO00o(t, "array element is null");
            return t;
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

    public C32975OooOO0o(T[] tArr) {
        this.f119275OooOo = tArr;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        boolean z = oooO0O0 instanceof InterfaceC33023OooO00o;
        T[] tArr = this.f119275OooOo;
        if (z) {
            oooO0O0.OooO0Oo(new OooO00o((InterfaceC33023OooO00o) oooO0O0, tArr));
        } else {
            oooO0O0.OooO0Oo(new OooO0O0((InterfaceC33493OooO0oo) oooO0O0, tArr));
        }
    }
}
