package Oooo0oO;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Oooo0oO.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21077OoooooO extends CancellationException {
    public C21077OoooooO() {
        super("The coroutine scope left the composition");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
