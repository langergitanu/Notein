package oO00o00O;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OooO0OO(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
