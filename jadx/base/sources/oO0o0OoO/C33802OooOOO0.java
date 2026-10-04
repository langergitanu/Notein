package oO0o0OoO;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: oO0o0OoO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33802OooOOO0 extends CancellationException {
    public C33802OooOOO0() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
