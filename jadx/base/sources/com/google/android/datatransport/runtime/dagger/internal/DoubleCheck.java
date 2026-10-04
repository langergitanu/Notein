package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class DoubleCheck<T> implements InterfaceC32462OooO00o<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile InterfaceC32462OooO00o<T> provider;

    private DoubleCheck(InterfaceC32462OooO00o<T> interfaceC32462OooO00o) {
        this.provider = interfaceC32462OooO00o;
    }

    public static <P extends InterfaceC32462OooO00o<T>, T> Lazy<T> lazy(P p) {
        return p instanceof Lazy ? (Lazy) p : new DoubleCheck((InterfaceC32462OooO00o) Preconditions.checkNotNull(p));
    }

    public static <P extends InterfaceC32462OooO00o<T>, T> InterfaceC32462OooO00o<T> provider(P p) {
        Preconditions.checkNotNull(p);
        return p instanceof DoubleCheck ? p : new DoubleCheck(p);
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == UNINITIALIZED || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // oO00ooO0.InterfaceC32462OooO00o
    public T get() {
        T t;
        T t2 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.instance;
                if (t == obj) {
                    t = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t);
                    this.provider = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
