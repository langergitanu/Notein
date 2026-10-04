package ooOOOOoO;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o0Oo0oOo.o00Oo0;
import oO00o00o.InterfaceC32332OooO0Oo;
import oO00o0oO.C32386OooO00o;
import oO00o0oO.C32390OooO0o;
import oO00o0oO.EnumC32392OooO0oO;
import oO0OooOO.InterfaceC33499OooOOOO;

/* JADX INFO: renamed from: ooOOOOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35058OooO00o<T> extends AbstractC35059OooO0O0<T> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final Object[] f125931OooOoo = new Object[0];

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final C20374OooO00o[] f125932OooOooO = new C20374OooO00o[0];

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final C20374OooO00o[] f125933OooOooo = new C20374OooO00o[0];

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AtomicReference<C20374OooO00o<T>[]> f125934OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicReference<Object> f125935OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Lock f125936OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Lock f125937OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AtomicReference<Throwable> f125938OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f125939OooOoo0;

    /* JADX INFO: renamed from: ooOOOOoO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20374OooO00o<T> implements oO0OOO00.OooO0O0, InterfaceC32332OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C35058OooO00o<T> f125940OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33499OooOOOO<? super T> f125941OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f125942OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f125943OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public C32386OooO00o<Object> f125944OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public volatile boolean f125945OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public boolean f125946OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public long f125947OooOooO;

        public C20374OooO00o(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO, C35058OooO00o<T> c35058OooO00o) {
            this.f125941OooOo0o = interfaceC33499OooOOOO;
            this.f125940OooOo = c35058OooO00o;
        }

        public final void OooO00o(long j, Object obj) {
            if (this.f125945OooOoo) {
                return;
            }
            if (!this.f125946OooOoo0) {
                synchronized (this) {
                    try {
                        if (this.f125945OooOoo) {
                            return;
                        }
                        if (this.f125947OooOooO == j) {
                            return;
                        }
                        if (this.f125942OooOoO) {
                            C32386OooO00o<Object> c32386OooO00o = this.f125944OooOoOO;
                            if (c32386OooO00o == null) {
                                c32386OooO00o = new C32386OooO00o<>();
                                this.f125944OooOoOO = c32386OooO00o;
                            }
                            int i = c32386OooO00o.f116477OooO0OO;
                            if (i == 4) {
                                Object[] objArr = new Object[5];
                                c32386OooO00o.f116476OooO0O0[4] = objArr;
                                c32386OooO00o.f116476OooO0O0 = objArr;
                                i = 0;
                            }
                            c32386OooO00o.f116476OooO0O0[i] = obj;
                            c32386OooO00o.f116477OooO0OO = i + 1;
                            return;
                        }
                        this.f125943OooOoO0 = true;
                        this.f125946OooOoo0 = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            if (this.f125945OooOoo) {
                return;
            }
            this.f125945OooOoo = true;
            this.f125940OooOo.OooO0Oo(this);
        }

        @Override // oO00o00o.InterfaceC32332OooO0Oo
        public final boolean test(Object obj) {
            if (this.f125945OooOoo) {
                return true;
            }
            InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO = this.f125941OooOo0o;
            if (obj == EnumC32392OooO0oO.f116485OooOo0o) {
                interfaceC33499OooOOOO.onComplete();
                return true;
            }
            if (obj instanceof EnumC32392OooO0oO.OooO00o) {
                interfaceC33499OooOOOO.onError(((EnumC32392OooO0oO.OooO00o) obj).f116486OooOo0o);
                return true;
            }
            interfaceC33499OooOOOO.onNext(obj);
            return false;
        }
    }

    public C35058OooO00o() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f125937OooOoO0 = reentrantReadWriteLock.readLock();
        this.f125936OooOoO = reentrantReadWriteLock.writeLock();
        this.f125934OooOo = new AtomicReference<>(f125932OooOooO);
        this.f125935OooOo0o = new AtomicReference<>();
        this.f125938OooOoOO = new AtomicReference<>();
    }

    @Override // oO0OooOO.InterfaceC33499OooOOOO
    public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
        if (this.f125938OooOoOO.get() != null) {
            oooO0O0.dispose();
        }
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO) {
        C32386OooO00o<Object> c32386OooO00o;
        Object[] objArr;
        C20374OooO00o<T> c20374OooO00o = new C20374OooO00o<>(interfaceC33499OooOOOO, this);
        interfaceC33499OooOOOO.OooO00o(c20374OooO00o);
        while (true) {
            AtomicReference<C20374OooO00o<T>[]> atomicReference = this.f125934OooOo;
            C20374OooO00o<T>[] c20374OooO00oArr = atomicReference.get();
            if (c20374OooO00oArr == f125933OooOooo) {
                Throwable th = this.f125938OooOoOO.get();
                if (th == C32390OooO0o.f116481OooO00o) {
                    interfaceC33499OooOOOO.onComplete();
                    return;
                } else {
                    interfaceC33499OooOOOO.onError(th);
                    return;
                }
            }
            int length = c20374OooO00oArr.length;
            C20374OooO00o<T>[] c20374OooO00oArr2 = new C20374OooO00o[length + 1];
            System.arraycopy(c20374OooO00oArr, 0, c20374OooO00oArr2, 0, length);
            c20374OooO00oArr2[length] = c20374OooO00o;
            while (!atomicReference.compareAndSet(c20374OooO00oArr, c20374OooO00oArr2)) {
                if (atomicReference.get() != c20374OooO00oArr) {
                    break;
                }
            }
            if (c20374OooO00o.f125945OooOoo) {
                OooO0Oo(c20374OooO00o);
                return;
            }
            if (c20374OooO00o.f125945OooOoo) {
                return;
            }
            synchronized (c20374OooO00o) {
                try {
                    if (c20374OooO00o.f125945OooOoo) {
                        return;
                    }
                    if (c20374OooO00o.f125943OooOoO0) {
                        return;
                    }
                    C35058OooO00o<T> c35058OooO00o = c20374OooO00o.f125940OooOo;
                    Lock lock = c35058OooO00o.f125937OooOoO0;
                    lock.lock();
                    c20374OooO00o.f125947OooOooO = c35058OooO00o.f125939OooOoo0;
                    Object obj = c35058OooO00o.f125935OooOo0o.get();
                    lock.unlock();
                    c20374OooO00o.f125942OooOoO = obj != null;
                    c20374OooO00o.f125943OooOoO0 = true;
                    if (obj == null || c20374OooO00o.test(obj)) {
                        return;
                    }
                    while (!c20374OooO00o.f125945OooOoo) {
                        synchronized (c20374OooO00o) {
                            try {
                                c32386OooO00o = c20374OooO00o.f125944OooOoOO;
                                if (c32386OooO00o == null) {
                                    c20374OooO00o.f125942OooOoO = false;
                                    return;
                                }
                                c20374OooO00o.f125944OooOoOO = null;
                            } finally {
                            }
                        }
                        for (Object[] objArr2 = c32386OooO00o.f116475OooO00o; objArr2 != null; objArr2 = objArr2[4]) {
                            for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                if (c20374OooO00o.test(objArr)) {
                                    break;
                                }
                            }
                        }
                    }
                    return;
                } finally {
                }
            }
        }
    }

    public final void OooO0Oo(C20374OooO00o<T> c20374OooO00o) {
        C20374OooO00o<T>[] c20374OooO00oArr;
        while (true) {
            AtomicReference<C20374OooO00o<T>[]> atomicReference = this.f125934OooOo;
            C20374OooO00o<T>[] c20374OooO00oArr2 = atomicReference.get();
            int length = c20374OooO00oArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c20374OooO00oArr2[i] == c20374OooO00o) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c20374OooO00oArr = f125932OooOooO;
            } else {
                C20374OooO00o<T>[] c20374OooO00oArr3 = new C20374OooO00o[length - 1];
                System.arraycopy(c20374OooO00oArr2, 0, c20374OooO00oArr3, 0, i);
                System.arraycopy(c20374OooO00oArr2, i + 1, c20374OooO00oArr3, i, (length - i) - 1);
                c20374OooO00oArr = c20374OooO00oArr3;
            }
            while (!atomicReference.compareAndSet(c20374OooO00oArr2, c20374OooO00oArr)) {
                if (atomicReference.get() != c20374OooO00oArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // oO0OooOO.InterfaceC33499OooOOOO
    public final void onComplete() {
        AtomicReference<Throwable> atomicReference = this.f125938OooOoOO;
        C32390OooO0o.OooO00o oooO00o = C32390OooO0o.f116481OooO00o;
        while (!atomicReference.compareAndSet(null, oooO00o)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        EnumC32392OooO0oO enumC32392OooO0oO = EnumC32392OooO0oO.f116485OooOo0o;
        AtomicReference<C20374OooO00o<T>[]> atomicReference2 = this.f125934OooOo;
        C20374OooO00o<T>[] c20374OooO00oArr = f125933OooOooo;
        C20374OooO00o<T>[] andSet = atomicReference2.getAndSet(c20374OooO00oArr);
        if (andSet != c20374OooO00oArr) {
            Lock lock = this.f125936OooOoO;
            lock.lock();
            this.f125939OooOoo0++;
            this.f125935OooOo0o.lazySet(enumC32392OooO0oO);
            lock.unlock();
        }
        for (C20374OooO00o<T> c20374OooO00o : andSet) {
            c20374OooO00o.OooO00o(this.f125939OooOoo0, enumC32392OooO0oO);
        }
    }

    @Override // oO0OooOO.InterfaceC33499OooOOOO
    public final void onError(Throwable th) {
        o00Oo0.OooO00o(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<Throwable> atomicReference = this.f125938OooOoOO;
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
        }
        EnumC32392OooO0oO.OooO00o oooO00o = new EnumC32392OooO0oO.OooO00o(th);
        AtomicReference<C20374OooO00o<T>[]> atomicReference2 = this.f125934OooOo;
        C20374OooO00o<T>[] c20374OooO00oArr = f125933OooOooo;
        C20374OooO00o<T>[] andSet = atomicReference2.getAndSet(c20374OooO00oArr);
        if (andSet != c20374OooO00oArr) {
            Lock lock = this.f125936OooOoO;
            lock.lock();
            this.f125939OooOoo0++;
            this.f125935OooOo0o.lazySet(oooO00o);
            lock.unlock();
        }
        for (C20374OooO00o<T> c20374OooO00o : andSet) {
            c20374OooO00o.OooO00o(this.f125939OooOoo0, oooO00o);
        }
    }

    @Override // oO0OooOO.InterfaceC33499OooOOOO
    public final void onNext(T t) {
        o00Oo0.OooO00o(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f125938OooOoOO.get() != null) {
            return;
        }
        Lock lock = this.f125936OooOoO;
        lock.lock();
        this.f125939OooOoo0++;
        this.f125935OooOo0o.lazySet(t);
        lock.unlock();
        for (C20374OooO00o<T> c20374OooO00o : this.f125934OooOo.get()) {
            c20374OooO00o.OooO00o(this.f125939OooOoo0, t);
        }
    }
}
