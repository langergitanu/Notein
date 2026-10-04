package oO0o0OoO;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: oO0o0OoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33790OooO00o extends CancellationException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final transient Object f121821OooOo0o;

    public C33790OooO00o(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f121821OooOo0o = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
