package oO0OoooO;

import oO00oO00.InterfaceC32402OooO0O0;
import oO00oO00.InterfaceC32403OooO0OO;
import oO00oOo0.C32430OooO00o;
import oOo00o0o.C34557OooO0OO;

/* JADX INFO: renamed from: oO0OoooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33519OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33520OooO0Oo f121087OooO00o = new C33520OooO0Oo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO f121088OooO0O0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C20319OooO00o f121089OooO0OO = new C20319OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0O0 f121090OooO0Oo = new OooO0O0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C33521OooO0o0 f121091OooO0o0 = new C33521OooO0o0();

    /* JADX INFO: renamed from: oO0OoooO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20319OooO00o {
        public final String toString() {
            return "EmptyAction";
        }
    }

    /* JADX INFO: renamed from: oO0OoooO.OooO00o$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC32402OooO0O0<Object> {
        @Override // oO00oO00.InterfaceC32402OooO0O0
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* JADX INFO: renamed from: oO0OoooO.OooO00o$OooO0OO */
    public static final class OooO0OO implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    /* JADX INFO: renamed from: oO0OoooO.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C33520OooO0Oo implements InterfaceC32403OooO0OO<Object, Object> {
        @Override // oO00oO00.InterfaceC32403OooO0OO
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    /* JADX INFO: renamed from: oO0OoooO.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public static final class C33521OooO0o0 implements InterfaceC32402OooO0O0<Throwable> {
        @Override // oO00oO00.InterfaceC32402OooO0O0
        public final void accept(Throwable th) throws Throwable {
            Throwable nullPointerException = th;
            String str = "The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + nullPointerException;
            if (nullPointerException == null) {
                nullPointerException = new NullPointerException();
            }
            C32430OooO00o.OooO00o(new C34557OooO0OO(str, nullPointerException));
        }
    }
}
