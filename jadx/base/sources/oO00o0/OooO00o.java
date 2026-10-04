package oO00o0;

import com.google.firebase.inappmessaging.internal.C22747Oooo00o;
import com.google.firebase.inappmessaging.internal.InstallationIdResult;
import com.google.firebase.installations.InstallationTokenResult;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import oO00o00o.InterfaceC32329OooO00o;
import oO00o00o.InterfaceC32330OooO0O0;
import oO00o00o.InterfaceC32331OooO0OO;
import oO00o00o.InterfaceC32332OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f116235OooO00o = new OooO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final RunnableC32322OooO0Oo f116236OooO0O0 = new RunnableC32322OooO0Oo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f116237OooO0OO = new OooO0O0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0OO f116238OooO0Oo = new OooO0OO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO f116240OooO0o0 = new OooO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooOO0 f116239OooO0o = new OooOO0();

    public static final class OooO implements InterfaceC32330OooO0O0<Throwable> {
        @Override // oO00o00o.InterfaceC32330OooO0O0
        public final void accept(Throwable th) throws Exception {
            oO0OOO0O.OooO00o.OooO0O0(new oO00o00O.OooO0OO(th));
        }
    }

    /* JADX INFO: renamed from: oO00o0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20215OooO00o<T1, T2, R> implements InterfaceC32331OooO0OO<Object[], R> {
        @Override // oO00o00o.InterfaceC32331OooO0OO
        public final Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return InstallationIdResult.create((String) objArr2[0], (InstallationTokenResult) objArr2[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr2.length);
        }
    }

    public static final class OooO0O0 implements InterfaceC32329OooO00o {
        @Override // oO00o00o.InterfaceC32329OooO00o
        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    public static final class OooO0OO implements InterfaceC32330OooO0O0<Object> {
        @Override // oO00o00o.InterfaceC32330OooO0O0
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* JADX INFO: renamed from: oO00o0.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class RunnableC32322OooO0Oo implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class OooO0o implements InterfaceC32331OooO0OO<Object, Object> {
        @Override // oO00o00o.InterfaceC32331OooO0OO
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    /* JADX INFO: renamed from: oO00o0.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public static final class C32323OooO0o0<T> implements InterfaceC32332OooO0Oo<T> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f116241OooOo0o;

        public C32323OooO0o0(String str) {
            this.f116241OooOo0o = str;
        }

        @Override // oO00o00o.InterfaceC32332OooO0Oo
        public final boolean test(T t) throws Exception {
            String str = this.f116241OooOo0o;
            if (t != str) {
                return t != null && t.equals(str);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: oO00o0.OooO00o$OooO0oO, reason: case insensitive filesystem */
    public static final class CallableC32324OooO0oO<T, U> implements Callable<U>, InterfaceC32331OooO0OO<T, U> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final U f116242OooOo0o;

        public CallableC32324OooO0oO(U u) {
            this.f116242OooOo0o = u;
        }

        @Override // oO00o00o.InterfaceC32331OooO0OO
        public final U apply(T t) throws Exception {
            return this.f116242OooOo0o;
        }

        @Override // java.util.concurrent.Callable
        public final U call() throws Exception {
            return this.f116242OooOo0o;
        }
    }

    /* JADX INFO: renamed from: oO00o0.OooO00o$OooO0oo, reason: case insensitive filesystem */
    public static final class C32325OooO0oo<T> implements InterfaceC32331OooO0OO<List<T>, List<T>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C22747Oooo00o f116243OooOo0o;

        public C32325OooO0oo(C22747Oooo00o c22747Oooo00o) {
            this.f116243OooOo0o = c22747Oooo00o;
        }

        @Override // oO00o00o.InterfaceC32331OooO0OO
        public final Object apply(Object obj) throws Exception {
            List list = (List) obj;
            Collections.sort(list, this.f116243OooOo0o);
            return list;
        }
    }

    public static final class OooOO0 implements InterfaceC32332OooO0Oo<Object> {
        @Override // oO00o00o.InterfaceC32332OooO0Oo
        public final boolean test(Object obj) {
            return true;
        }
    }
}
