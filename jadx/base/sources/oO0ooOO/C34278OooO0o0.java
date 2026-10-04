package oO0ooOO;

/* JADX INFO: renamed from: oO0ooOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34278OooO0o0 extends Exception {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Exception f123056OooOo0o;

    public C34278OooO0o0(String str, Exception exc) {
        super(str);
        this.f123056OooOo0o = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f123056OooOo0o;
    }
}
