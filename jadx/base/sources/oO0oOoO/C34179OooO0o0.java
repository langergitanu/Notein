package oO0oOoO;

/* JADX INFO: renamed from: oO0oOoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34179OooO0o0 extends Exception {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Exception f122813OooOo0o;

    public C34179OooO0o0(String str, Exception exc) {
        super(str);
        this.f122813OooOo0o = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f122813OooOo0o;
    }
}
