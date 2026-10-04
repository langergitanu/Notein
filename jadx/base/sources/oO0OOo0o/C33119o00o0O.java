package oO0OOo0o;

/* JADX INFO: renamed from: oO0OOo0o.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33119o00o0O extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33094OoooO f119754OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00Oo0 f119755OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f119756OooOoO0;

    public C33119o00o0O(o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
        super(o00Oo0.OooO0OO(o00oo02), o00oo02.f119730OooO0OO);
        this.f119755OooOo0o = o00oo02;
        this.f119754OooOo = c33094OoooO;
        this.f119756OooOoO0 = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f119756OooOoO0 ? super.fillInStackTrace() : this;
    }
}
