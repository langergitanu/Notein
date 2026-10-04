package oO0oO0Oo;

/* JADX INFO: renamed from: oO0oO0Oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34034OooOoO extends IllegalStateException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Exception f122363OooOo0o;

    public C34034OooOoO(String str, Exception exc) {
        super(str);
        this.f122363OooOo0o = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f122363OooOo0o;
    }
}
