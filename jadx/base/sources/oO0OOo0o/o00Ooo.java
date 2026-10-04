package oO0OOo0o;

/* JADX INFO: loaded from: classes10.dex */
public final class o00Ooo extends Exception {
    private static final long serialVersionUID = -660954903976144640L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f119752OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00Oo0 f119753OooOo0o;

    public o00Ooo(o00Oo0 o00oo02) {
        super(o00Oo0.OooO0OO(o00oo02), o00oo02.f119730OooO0OO);
        this.f119753OooOo0o = o00oo02;
        this.f119752OooOo = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f119752OooOo ? super.fillInStackTrace() : this;
    }
}
