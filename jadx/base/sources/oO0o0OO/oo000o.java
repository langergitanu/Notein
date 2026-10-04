package oO0o0OO;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class oo000o extends CancellationException implements InterfaceC33627OooOoOO<oo000o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final transient o0ooOOo f121413OooOo0o;

    public oo000o(String str, Throwable th, o0ooOOo o0ooooo2) {
        super(str);
        this.f121413OooOo0o = o0ooooo2;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // oO0o0OO.InterfaceC33627OooOoOO
    public final /* bridge */ /* synthetic */ Throwable OooO00o() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oo000o)) {
            return false;
        }
        oo000o oo000oVar = (oo000o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(oo000oVar.getMessage(), getMessage()) && kotlin.jvm.internal.OooOOO0.OooO0O0(oo000oVar.f121413OooOo0o, this.f121413OooOo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(oo000oVar.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(message);
        int iHashCode = (this.f121413OooOo0o.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f121413OooOo0o;
    }
}
