package o0OO000;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOO0 extends Exception {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f90830OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f90831OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Throwable f90832OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(String code, String message, Throwable th) {
        super(message, th);
        kotlin.jvm.internal.OooOOO0.OooO0oO(code, "code");
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        this.f90831OooOo0o = code;
        this.f90830OooOo = message;
        this.f90832OooOoO0 = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f90832OooOoO0;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f90830OooOo;
    }
}
