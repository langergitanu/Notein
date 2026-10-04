package oOO000oo;

/* JADX INFO: renamed from: oOO000oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34340OooO0OO extends IllegalStateException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Exception f123270OooOo0o;

    public C34340OooO0OO(String str, Exception exc) {
        super(str);
        this.f123270OooOo0o = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f123270OooOo0o;
    }
}
