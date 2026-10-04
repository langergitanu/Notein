package oO0OO0oo;

/* JADX INFO: renamed from: oO0OO0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32929OooO00o<T> implements InterfaceC32931OooO0OO<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f118806OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile InterfaceC32931OooO0OO<T> f118807OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Object f118808OooO0O0;

    public static <T> InterfaceC32931OooO0OO<T> OooO00o(InterfaceC32931OooO0OO<T> interfaceC32931OooO0OO) {
        if (interfaceC32931OooO0OO instanceof C32929OooO00o) {
            return interfaceC32931OooO0OO;
        }
        C32929OooO00o c32929OooO00o = new C32929OooO00o();
        c32929OooO00o.f118808OooO0O0 = f118806OooO0OO;
        c32929OooO00o.f118807OooO00o = interfaceC32931OooO0OO;
        return c32929OooO00o;
    }

    @Override // oO00ooO0.InterfaceC32462OooO00o
    public final T get() {
        T t;
        T t2 = (T) this.f118808OooO0O0;
        Object obj = f118806OooO0OO;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            t = (T) this.f118808OooO0O0;
            if (t == obj) {
                t = this.f118807OooO00o.get();
                Object obj2 = this.f118808OooO0O0;
                if (obj2 != obj && obj2 != t) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                }
                this.f118808OooO0O0 = t;
                this.f118807OooO00o = null;
            }
        }
        return t;
    }
}
