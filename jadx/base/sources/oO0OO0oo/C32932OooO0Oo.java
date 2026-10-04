package oO0OO0oo;

import o0O0oooO.C26269OooOOoo;

/* JADX INFO: renamed from: oO0OO0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32932OooO0Oo<T> implements InterfaceC32931OooO0OO<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f118810OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile C26269OooOOoo.OooO00o f118811OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Object f118812OooO0O0;

    public static InterfaceC32931OooO0OO OooO00o(C26269OooOOoo.OooO00o oooO00o) {
        C32932OooO0Oo c32932OooO0Oo = new C32932OooO0Oo();
        c32932OooO0Oo.f118812OooO0O0 = f118810OooO0OO;
        c32932OooO0Oo.f118811OooO00o = oooO00o;
        return c32932OooO0Oo;
    }

    @Override // oO00ooO0.InterfaceC32462OooO00o
    public final T get() {
        T t = (T) this.f118812OooO0O0;
        if (t != f118810OooO0OO) {
            return t;
        }
        C26269OooOOoo.OooO00o oooO00o = this.f118811OooO00o;
        if (oooO00o == null) {
            return (T) this.f118812OooO0O0;
        }
        T t2 = (T) oooO00o.get();
        this.f118812OooO0O0 = t2;
        this.f118811OooO00o = null;
        return t2;
    }
}
