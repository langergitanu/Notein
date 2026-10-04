package Oooo0oO;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000 f61055OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f61056OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O000<T> f61057OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f61058OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f61059OooO0o = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final T f61060OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public o00000O0(o00000 o00000Var, Object obj, boolean z, o000O000 o000o0002, boolean z2) {
        this.f61055OooO00o = o00000Var;
        this.f61056OooO0O0 = z;
        this.f61057OooO0OO = o000o0002;
        this.f61058OooO0Oo = z2;
        this.f61060OooO0o0 = obj;
    }

    public final T OooO00o() {
        if (this.f61056OooO0O0) {
            return null;
        }
        T t = this.f61060OooO0o0;
        if (t != null) {
            return t;
        }
        C21038OooOo.OooO0Oo("Unexpected form of a provided value");
        throw null;
    }
}
